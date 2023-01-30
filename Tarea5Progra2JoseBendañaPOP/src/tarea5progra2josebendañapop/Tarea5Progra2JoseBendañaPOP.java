package tarea5progra2josebendañapop;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Tarea5Progra2JoseBendañaPOP {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        ArrayList productos = new ArrayList();
        int opcionmenu;
        do {
            System.out.print("""
                             ---------------------------------
                               1- Agregar producto
                               2- Modificar producto
                               3- Eliminar producto
                               4- Simulacion de Facturacion;
                               5- Reporte
                               6- Salir
                             ---------------------------------
                               Ingrese alguna opcion: """);
            opcionmenu = menu.nextInt();

            switch (opcionmenu) {
                case 1:
                    productos = agregarproductos(productos);
                    break;
                case 2:
                    if (productos.isEmpty()) {
                        System.out.println("La lista de productos esta vacia");
                    } else {
                        productos = modificarproductor(productos);
                    }
                    break;
                case 3:
                    if (productos.isEmpty()) {
                        System.out.println("La lista de productos esta vacia");
                    } else {
                        System.out.println("-------------------------------------------------------------------------------------");
                        Scanner caso3 = new Scanner(System.in);
                        for (Object a : productos) {
                            System.out.println(productos.indexOf(a) + "- " + a);
                        }
                        System.out.println("-------------------------------------------------------------------------------------");
                        System.out.println();
                        int eliminar;
                        do {
                            System.out.print("Ingrese el numero del producto que quiere eliminar: ");
                            eliminar = caso3.nextInt();
                            if ((eliminar >= productos.size()) || (eliminar < 0)) {
                                System.out.println("Usted ha elegido una opcion no valida, ingrese una correcta");
                            }
                        } while ((eliminar >= productos.size()) || (eliminar < 0));
                        productos.remove(eliminar);
                        System.out.println("Se ha eliminado el producto correctamente");
                        System.out.println();
                    }
                    break;
                case 4:
                    productos = simulacion(productos);
                    break;
                case 5:
                    if (productos.isEmpty()) {
                        System.out.println("La lista de productos esta vacia");
                        break;
                    } else {
                        System.out.println("-------------------------------GRANOS BASICOS----------------------------------------");
                        int cuantos=0;
                        
                        for (Object producto : productos) {
                            if (producto instanceof Grano){
                                cuantos++;
                            }
                        }
                        if (cuantos>0) {
                            for (Object t : productos) {
                                if (t instanceof Grano){
                                    System.out.println(t);
                                }
                            }
                            System.out.println();
                        }else{
                            System.out.println("No hay granos basicos");
                            System.out.println();
                        }
                        cuantos=0;
                        System.out.println("-----------------------------LIMPIEZA----------------------------------------------");
                        for (Object y : productos) {
                            if (y instanceof Limpieza){
                                cuantos++;
                            }
                        }
                        if (cuantos>0) {
                            for (Object t : productos) {
                                if (t instanceof Limpieza){
                                    System.out.println(t);
                                }
                            }
                            System.out.println();
                        }else{
                            System.out.println("No hay productos de limpieza");
                            System.out.println();
                        }
                        cuantos =0;
                        System.out.println("--------------------------LIQUIDOS------------------------------------------------");
                        for (Object y : productos) {
                            if (y instanceof Liquido){
                                cuantos++;
                            }
                        }
                        if (cuantos>0) {
                            for (Object t : productos) {
                                if (t instanceof Liquido){
                                    System.out.println(t);
                                }
                            }
                            System.out.println();
                        }else{
                            System.out.println("No hay productos liquidos");
                            System.out.println();
                        }
                        cuantos=0;
                        System.out.println("-----------------CARNES Y EMBUTIDOS------------------------------------------------");
                        for (Object y : productos) {
                            if (y instanceof Carnesembutidos){
                                cuantos++;
                            }
                        }
                        if (cuantos>0) {
                            for (Object t : productos) {
                                if (t instanceof Carnesembutidos){
                                    System.out.println(t);
                                }
                            }
                            System.out.println();
                        }else{
                            System.out.println("No hay carnes ni embutidos");
                            System.out.println();
                        }
                        cuantos=0;
                        System.out.println("---------------------FRUTAS Y VERDURAS----------------------------------------------");
                        for (Object y : productos) {
                            if (y instanceof Frutasverduras){
                                cuantos++;
                            }
                        }
                        if (cuantos>0) {
                            for (Object t : productos) {
                                if (t instanceof Frutasverduras){
                                    System.out.println(t);
                                }
                            }
                        }else{
                            System.out.println("No hay frutas ni verduras");
                        }
                        cuantos=0;
                    }
                    break;
                case 6:
                    System.out.println("Saliendooooooo.......");
                    break;
                default:
                    System.out.println("Has elegido una opcion inexistente, eliga de nuevo");
                    break;
            }
        } while (opcionmenu != 6);
        System.out.println("Has salido perfectamente");
    }

    public static ArrayList agregarproductos(ArrayList productos) {
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                               ---------------------------------
                                1- Granos basicos
                                2- Productos de Limpieza
                                3- Liquidos
                                4- Carnes y embutidos
                                5- Frutas o verduras
                               ---------------------------------
                               Ingrese alguna opcion: """);
            opcion = enteros.nextInt();
        } while ((opcion > 5) || (opcion < 1));
        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nombre: ");
                String nombregrano = orac.nextLine();
                System.out.print("Ingrese la cantidad de quintales: ");
                int cantidadquin = enteros.nextInt();
                System.out.print("Ingrese el precio: ");
                int preciograno = enteros.nextInt();
                System.out.print("Ingrese la unidad de medida (libra, medida, kilo etc): ");
                String unidadme = orac.nextLine();
                System.out.print("Ingrese el lugar de procedencia: ");
                String lugarproce = orac.nextLine();
                productos.add(new Grano(nombregrano, cantidadquin, preciograno, unidadme, lugarproce));
                break;
            case 2:
                System.out.print("Ingrese el tipo (Liquido o polvo): ");
                String tipoliq = orac.nextLine();
                System.out.print("Ingrese la marca: ");
                String marcalimp = orac.nextLine();
                boolean bandera = false;
                String codigoalfa="";
                do {
                    System.out.print("Ingrese el codigo alfanumerico: ");
                    codigoalfa = orac.nextLine();
                    for (int i = 0; i < productos.size(); i++) {
                        if(productos.get(i) instanceof Limpieza){
                            if (codigoalfa.equals(((Limpieza) (productos.get(i))).getCodigo())) {
                                bandera = true;
                                i = productos.size() + 5;
                            } else {
                                bandera = false;
                            }
                        }
                    }
                    if (bandera == true) {
                        System.out.println("No se puede, un producto ya tiene este codigo");
                    }
                } while (bandera);
                System.out.print("Ingrese el precio: ");
                int preciolimp = enteros.nextInt();
                System.out.print("Ingrese la cantidad en inventario: ");
                int cantidadlimp = enteros.nextInt();
                System.out.print("Ingrese el nombre del proveedor: ");
                String nombreprov = orac.nextLine();
                System.out.print("Ingrese el nombre del producto: ");
                String nombrelimp = orac.nextLine();
                productos.add(new Limpieza(tipoliq, marcalimp, codigoalfa, preciolimp, cantidadlimp, nombreprov, nombrelimp));
                break;
            case 3:
                System.out.print("Ingrese la categoria [lacteos, gaseosas, jugos, agua etc]: ");
                String categorialiq = orac.nextLine();
                System.out.print("Ingrese la forma de empaque (botella, bote, caja, lata etc): ");
                String empaque = orac.nextLine();
                System.out.print("Ingrese el tamanio (Grande, chiquito, mediano, etc): ");
                String tamanioliq = orac.nextLine();
                System.out.print("Ingrese el nombre del producto: ");
                String nombreliq = orac.nextLine();
                System.out.print("Ingrese el precio del producto: ");
                int precioliq = enteros.nextInt();
                System.out.print("Ingrese el dia de vencimiento: ");
                int diavenc = enteros.nextInt();
                System.out.print("Ingrese el numero del mes de vencimiento: ");
                int mesvenc = enteros.nextInt();
                System.out.print("Ingrese el anio de vencimiento: ");
                int yearvenc = enteros.nextInt();
                System.out.print("Ingrese la cantidad a inventariar: ");
                int cant = enteros.nextInt();
                productos.add(new Liquido(categorialiq, empaque, tamanioliq, nombreliq, precioliq, new Date(yearvenc, mesvenc, diavenc), cant));
                break;
            case 4:
                System.out.print("Ingrese el lugar de procedencia: ");
                String lugarproc = orac.nextLine();
                System.out.print("Ingrese la cantidad en inventario: ");
                int cantidadcarne = enteros.nextInt();
                System.out.print("Ingrese el tipo (res, carne blanca, cerdo, etc): ");
                String tipocarne = orac.nextLine();
                System.out.print("Ingrese el precio del producto: ");
                int preciocarne = enteros.nextInt();
                productos.add(new Carnesembutidos(lugarproc, cantidadcarne, tipocarne, preciocarne));
                break;
            case 5:
                System.out.print("Ingrese el precio: ");
                int preciofruta = enteros.nextInt();
                System.out.print("Ingrese la cantidad a inventariar: ");
                int cantfruta = enteros.nextInt();
                System.out.print("Ingrese la categoria, si es fruta [citricos, tropical, De grano o rica en fabrica], si es verdura [tuberculos, legumbres o de hojas]: ");
                String tipofruta = orac.nextLine();
                productos.add(new Frutasverduras(preciofruta, cantfruta, tipofruta));
                break;
        }
        return productos;
    }

    public static ArrayList modificarproductor(ArrayList productos) {
        Scanner enteros = new Scanner(System.in);
        Scanner orac = new Scanner(System.in);
        Scanner modificar = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------");
        for (Object a : productos) {
            System.out.println(productos.indexOf(a) + "- " + a);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();
        int cualmod;
        do {
            System.out.print("Ingrese que producto quiere modificar: ");
            cualmod = modificar.nextInt();
            if ((cualmod >= productos.size()) || (cualmod < 0)) {
                System.out.println("Usted ha ingresado, una opcion no valida, ingresela de nuevo");
            }
        } while ((cualmod >= productos.size()) || (cualmod < 0));
        if (productos.get(cualmod) instanceof Grano) {
            System.out.print("Ingrese el nombre: ");
            String nombregrano = orac.nextLine();
            ((Grano) (productos.get(cualmod))).setNombre(nombregrano);
            System.out.print("Ingrese la cantidad de quintales");
            int cantidadquin = enteros.nextInt();
            ((Grano) (productos.get(cualmod))).setCantidadquin(cantidadquin);
            System.out.print("Ingrese el precio: ");
            int preciograno = enteros.nextInt();
            ((Grano) (productos.get(cualmod))).setPrecio(preciograno);
            System.out.print("Ingrese la unidad de medida (libra, medida, kilo etc): ");
            String unidadme = orac.nextLine();
            ((Grano) (productos.get(cualmod))).setUnidadmedida(unidadme);
            System.out.print("Ingrese el lugar de procedencia: ");
            String lugarproce = orac.nextLine();
            ((Grano) (productos.get(cualmod))).setLugar(lugarproce);
        } else if (productos.get(cualmod) instanceof Limpieza) {
            ((Limpieza) (productos.get(cualmod))).setCodigo("");
            System.out.print("Ingrese el tipo (Liquido o polvo): ");
            String tipoliq = orac.nextLine();
            ((Limpieza) (productos.get(cualmod))).setTipo(tipoliq);
            System.out.print("Ingrese la marca: ");
            String marcalimp = orac.nextLine();
            ((Limpieza) (productos.get(cualmod))).setMarca(marcalimp);
            boolean bandera = false;
            String codigoalfa;
            do {
                System.out.print("Ingrese el codigo alfanumerico: ");
                codigoalfa = orac.nextLine();
                for (int i = 0; i < productos.size(); i++) {
                    if(productos.get(i) instanceof Limpieza){
                        if (codigoalfa.equals(((Limpieza) (productos.get(i))).getCodigo())) {
                            bandera = true;
                            i = productos.size() + 5;
                        } else {
                            bandera = false;
                        }
                    }
                }
                if (bandera == true) {
                    System.out.println("No se puede, un producto ya tiene este codigo");
                }
            } while (bandera);
            ((Limpieza) (productos.get(cualmod))).setCodigo(codigoalfa);
            System.out.print("Ingrese el precio: ");
            int preciolimp = enteros.nextInt();
            ((Limpieza) (productos.get(cualmod))).setPrecio(preciolimp);
            System.out.print("Ingrese la cantidad en inventario: ");
            int cantidadlimp = enteros.nextInt();
            ((Limpieza) (productos.get(cualmod))).setCantidad(cantidadlimp);
            System.out.print("Ingrese el nombre del proveedor: ");
            String nombreprov = orac.nextLine();
            ((Limpieza) (productos.get(cualmod))).setProveedor(nombreprov);
            System.out.print("Ingrese el nombre del producto: ");
            String nombrelimp = orac.nextLine();
            ((Limpieza) (productos.get(cualmod))).setNombre(nombrelimp);
        } else if (productos.get(cualmod) instanceof Liquido) {
            System.out.print("Ingrese la categoria [lacteos, gaseosas, jugos, agua etc]: ");
            String categorialiq = orac.nextLine();
            ((Liquido) (productos.get(cualmod))).setCategoria(categorialiq);
            System.out.print("Ingrese la forma de empaque (botella, bote, caja, lata etc): ");
            String empaque = orac.nextLine();
            ((Liquido) (productos.get(cualmod))).setEmpaque(empaque);
            System.out.print("Ingrese el tamanio (Grande, chiquito, mediano, etc): ");
            String tamanioliq = orac.nextLine();
            ((Liquido) (productos.get(cualmod))).setTamanio(tamanioliq);
            System.out.print("Ingrese el nombre del producto: ");
            String nombreliq = orac.nextLine();
            ((Liquido) (productos.get(cualmod))).setNombre(nombreliq);
            System.out.print("Ingrese el precio del producto: ");
            int precioliq = enteros.nextInt();
            ((Liquido) (productos.get(cualmod))).setPrecio(precioliq);
            System.out.print("Ingrese el dia de vencimiento: ");
            int diavenc = enteros.nextInt();
            System.out.print("Ingrese el numero del mes de vencimiento: ");
            int mesvenc = enteros.nextInt();
            System.out.print("Ingrese el anio de vencimiento: ");
            int yearvenc = enteros.nextInt();
            ((Liquido) (productos.get(cualmod))).setVencimiento(new Date(yearvenc, mesvenc, diavenc));
            System.out.print("Ingrese la cantidad a inventariar: ");
            int cant = enteros.nextInt();
            ((Liquido) (productos.get(cualmod))).setCantidad(cant);
        } else if (productos.get(cualmod) instanceof Carnesembutidos) {
            System.out.print("Ingrese el lugar de procedencia: ");
            String lugarproc = orac.nextLine();
            ((Carnesembutidos) (productos.get(cualmod))).setLugarproce(lugarproc);
            System.out.print("Ingrese la cantidad en inventario: ");
            int cantidadcarne = enteros.nextInt();
            ((Carnesembutidos) (productos.get(cualmod))).setCantidad(cantidadcarne);
            System.out.print("Ingrese el tipo (res, carne blanca, cerdo, etc): ");
            String tipocarne = orac.nextLine();
            ((Carnesembutidos) (productos.get(cualmod))).setTipo(tipocarne);
            System.out.print("Ingrese el precio del producto: ");
            int preciocarne = enteros.nextInt();
            ((Carnesembutidos) (productos.get(cualmod))).setPrecio(preciocarne);
        } else if (productos.get(cualmod) instanceof Frutasverduras) {
            System.out.print("Ingrese el precio: ");
            int preciofruta = enteros.nextInt();
            ((Frutasverduras) (productos.get(cualmod))).setPrecio(preciofruta);
            System.out.print("Ingrese la cantidad a inventariar: ");
            int cantfruta = enteros.nextInt();
            ((Frutasverduras) (productos.get(cualmod))).setCantidad(cantfruta);
            System.out.print("Ingrese la categoria, si es fruta [citricos, tropical, De grano o rica en fabrica], si es verdura [tuberculos, legumbres o de hojas]: ");
            String tipofruta = orac.nextLine();
            ((Frutasverduras) (productos.get(cualmod))).setCategoria(tipofruta);
        }
        return productos;
    }

    public static ArrayList simulacion(ArrayList productos) {
        ArrayList cesta = new ArrayList();
        Scanner sim = new Scanner(System.in);
        if (productos.isEmpty()) {
            System.out.println("La lista de productos esta vacia");
        } else {
            int producto;
            int hacer;
            int total = 0;
            do {
                do {
                    System.out.println("""
                                       --------------------------------
                                        1- Agregar producto a la cesta
                                        2- Facturar y Salir
                                       --------------------------------
                                        """);
                    System.out.print("Ingrese que quiere hacer: ");
                    hacer = sim.nextInt();
                    if ((hacer > 2) || (hacer < 1)) {
                        System.out.println("Opcion no valida, ingrese una correcta");
                    }
                } while ((hacer > 2) || (hacer < 1));
                switch (hacer) {
                    case 1:
                        if (productos.isEmpty()) {
                            System.out.println("La lista de productos esta vacia");
                        } else {
                            do {
                                System.out.println("-------------------------------------------------------------------------------------");
                                for (Object a : productos) {
                                    System.out.println(productos.indexOf(a) + "- " + a);
                                }
                                System.out.println("-------------------------------------------------------------------------------------");
                                System.out.println();
                                System.out.print("Ingrese el numero del producto que quiere aniadir a la cesta: ");
                                producto = sim.nextInt();
                                if ((producto >= productos.size()) || (producto < 0)) {
                                    System.out.println("Opcion no valida, ingrese una correcta");
                                }
                            } while ((producto >= productos.size()) || (producto < 0));
                            int cant = 0;
                            if (productos.get(producto) instanceof Grano) {
                                do {
                                    System.out.print("Ingrese la cantidad que desea comprar: ");
                                    cant = sim.nextInt();
                                    if ((cant > ((Grano) (productos.get(producto))).getCantidadquin()) || (cant <= 0)) {
                                        System.out.println("No puede comprar mas de lo que hay ni menos de 1");
                                    }
                                } while ((cant > ((Grano) (productos.get(producto))).getCantidadquin()) || (cant <= 0));
                                cesta.add(new Grano(((Grano) (productos.get(producto))).getNombre(), cant, ((Grano) (productos.get(producto))).getPrecio(), ((Grano) (productos.get(producto))).getUnidadmedida(), ((Grano) (productos.get(producto))).getLugar()));
                                if (((Grano) (productos.get(producto))).getCantidadquin() - cant == 0) {
                                    total += cant * ((Grano) (productos.get(producto))).getPrecio();
                                    System.out.println("Se ha agregado correctamente");
                                    productos.remove(producto);
                                    break;
                                } else {
                                    ((Grano) (productos.get(producto))).setCantidadquin(((Grano) (productos.get(producto))).getCantidadquin() - cant);
                                }
                                total += cant * ((Grano) (productos.get(producto))).getPrecio();
                                System.out.println("Se ha agregado correctamente");
                                break;
                            } else if (productos.get(producto) instanceof Limpieza) {
                                do {
                                    System.out.print("Ingrese la cantidad que desea comprar: ");
                                    cant = sim.nextInt();
                                    if ((cant > ((Limpieza) (productos.get(producto))).getCantidad()) || (cant <= 0)) {
                                        System.out.println("No puede comprar mas de lo que hay ni menos de 1");
                                    }
                                } while ((cant > ((Limpieza) (productos.get(producto))).getCantidad()) || (cant <= 0));
                                cesta.add(new Limpieza(((Limpieza) (productos.get(producto))).getTipo(), ((Limpieza) (productos.get(producto))).getMarca(), ((Limpieza) (productos.get(producto))).getCodigo(), ((Limpieza) (productos.get(producto))).getPrecio(), cant, ((Limpieza) (productos.get(producto))).getProveedor(), ((Limpieza) (productos.get(producto))).getNombre()));
                                if (((Limpieza) (productos.get(producto))).getCantidad() - cant == 0) {
                                    total += cant * ((Limpieza) (productos.get(producto))).getPrecio();
                                    System.out.println("Se ha agregado correctamente");
                                    productos.remove(producto);
                                    break;
                                } else {
                                    ((Limpieza) (productos.get(producto))).setCantidad(((Limpieza) (productos.get(producto))).getCantidad() - cant);
                                }
                                total += cant * ((Limpieza) (productos.get(producto))).getPrecio();
                                System.out.println("Se ha agregado correctamente");
                                break;
                            } else if (productos.get(producto) instanceof Liquido) {
                                do {
                                    System.out.print("Ingrese la cantidad que desea comprar: ");
                                    cant = sim.nextInt();
                                    if ((cant > ((Liquido) (productos.get(producto))).getCantidad()) || (cant <= 0)) {
                                        System.out.println("No puede comprar mas de lo que hay ni menos de 1");
                                    }
                                } while ((cant > ((Liquido) (productos.get(producto))).getCantidad()) || (cant <= 0));
                                cesta.add(new Liquido(((Liquido) (productos.get(producto))).getCategoria(), ((Liquido) (productos.get(producto))).getEmpaque(), ((Liquido) (productos.get(producto))).getTamanio(), ((Liquido) (productos.get(producto))).getNombre(), ((Liquido) (productos.get(producto))).getPrecio(), ((Liquido) (productos.get(producto))).getVencimiento(), cant));
                                if (((Liquido) (productos.get(producto))).getCantidad() - cant == 0) {
                                    productos.remove(producto);
                                    total += cant * ((Liquido) (productos.get(producto))).getPrecio();
                                    System.out.println("Se ha agregado correctamente");
                                    break;
                                } else {
                                    ((Liquido) (productos.get(producto))).setCantidad(((Liquido) (productos.get(producto))).getCantidad() - cant);
                                }
                                total += cant * ((Liquido) (productos.get(producto))).getPrecio();
                                System.out.println("Se ha agregado correctamente");
                                break;
                            } else if (productos.get(producto) instanceof Carnesembutidos) {
                                do {
                                    System.out.print("Ingrese la cantidad que desea comprar: ");
                                    cant = sim.nextInt();
                                    if ((cant > ((Carnesembutidos) (productos.get(producto))).getCantidad()) || (cant <= 0)) {
                                        System.out.println("No puede comprar mas de lo que hay ni menos de 1");
                                    }
                                } while ((cant > ((Carnesembutidos) (productos.get(producto))).getCantidad()) || (cant <= 0));
                                cesta.add(new Carnesembutidos(((Carnesembutidos) (productos.get(producto))).getLugarproce(), cant, ((Carnesembutidos) (productos.get(producto))).getTipo(), ((Carnesembutidos) (productos.get(producto))).getPrecio()));
                                if (((Carnesembutidos) (productos.get(producto))).getCantidad() - cant == 0) {
                                    total += cant * ((Carnesembutidos) (productos.get(producto))).getPrecio();
                                    System.out.println("Se ha agregado correctamente");
                                    productos.remove(producto);
                                    break;
                                } else {
                                    ((Carnesembutidos) (productos.get(producto))).setCantidad(((Carnesembutidos) (productos.get(producto))).getCantidad() - cant);
                                }
                                total += cant * ((Carnesembutidos) (productos.get(producto))).getPrecio();
                                System.out.println("Se ha agregado correctamente");
                                break;
                            } else if (productos.get(producto) instanceof Frutasverduras) {
                                do {
                                    System.out.print("Ingrese la cantidad que desea comprar: ");
                                    cant = sim.nextInt();
                                    if ((cant > ((Frutasverduras) (productos.get(producto))).getCantidad()) || (cant <= 0)) {
                                        System.out.println("No puede comprar mas de lo que hay ni menos de 1");
                                    }
                                } while ((cant > ((Frutasverduras) (productos.get(producto))).getCantidad()) || (cant <= 0));
                                cesta.add(new Frutasverduras(((Frutasverduras) (productos.get(producto))).getPrecio(), cant, ((Frutasverduras) (productos.get(producto))).getCategoria()));
                                if (((Frutasverduras) (productos.get(producto))).getCantidad() - cant == 0) {
                                    total += cant * ((Frutasverduras) (productos.get(producto))).getPrecio();
                                    System.out.println("Se ha agregado correctamente");
                                    productos.remove(producto);
                                    break;
                                } else {
                                    ((Frutasverduras) (productos.get(producto))).setCantidad(((Frutasverduras) (productos.get(producto))).getCantidad() - cant);
                                }
                                total += cant * ((Frutasverduras) (productos.get(producto))).getPrecio();
                                System.out.println("Se ha agregado correctamente");
                                break;
                            }
                        }
                        break;
                    case 2:
                        if (cesta.isEmpty()) {
                            System.out.println("La cesta esta vacia");
                        } else {
                            int imp = (total * 12) / 100;
                            total += imp;
                            System.out.println("""
                                               ------------------------------------------------------
                                                                FACTURA MAXIDESPENSA
                                               ------------------------------------------------------
                                               """);
                            System.out.println("OOOOOOJJJJOOOOOOOOOO AL MENSAJE DE ABAJO");
                            System.out.println();
                            System.out.println("El impuesto sobre venta esta basado en el 12%");
                            System.out.println();
                            for (Object g : cesta) {
                                System.out.println(cesta.indexOf(g) + "- " + g);
                            }
                            System.out.println();
                            System.out.println("Impuesto sobre venta: " + imp);
                            System.out.println();
                            System.out.println("Total a pagar: " + total);
                        }
                        break;
                }
            } while (hacer != 2);
        }
        return productos;
    }
}
