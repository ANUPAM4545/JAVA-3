class  ExceptionLecture{
    public static void main(String[] args) throws ArithmeticException {
        try {
            int a=16;
            if(a<18){
                throw  new ArithmeticException("you are not eligible");
            }
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println("cleared chache");
        }
        
        System.out.println("test");
    }
}