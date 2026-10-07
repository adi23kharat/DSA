class cnt{
 public  int cnt = 0;
  public void count() {

        if (cnt == 3) {
            return;
        }

        System.out.println(cnt);
        cnt++;
        count();
    }

  public static void main(String[] args) {
    cnt c = new cnt();
    c.count();
  }
}