public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner canner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("  --- BANCOS DIO-DESAFIO ---");
        System.out.println("\nDigite os dados solicitados:");

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Saldo: R$ ");
        double saldo = scanner.nextDouble();

        scanner.close();

        criarLinha();
        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %.2f já está disponível para saque.%n", nomeCliente, agencia, numero, saldo);
        criarLinha();
    }


    public static void criarLinha(){
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------");
    }
}
