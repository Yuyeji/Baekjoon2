# Baekjoon2
## if문(알람시계 문제)

### BufferedReader사용시 띄워쓰기로 입력 받아올 경우 -> StringTokenizer 사용
- BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
- StringTokenizer st = new StringTokenizer(br.readLine());
- int a,b;
- a = Integer.parseInt(st.nextToken());
- b = Integer.parseInt(st.nextToken());

### cf) 엔터로 받는 경우
- int a = Inteager.parseInt(br.readLine());
