package c.e.a.b.d.e;
/* loaded from: classes.dex */
abstract class r extends c<String> {

    /* renamed from: d  reason: collision with root package name */
    final CharSequence f3977d;

    /* renamed from: e  reason: collision with root package name */
    private final d f3978e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f3979f;

    /* renamed from: g  reason: collision with root package name */
    private int f3980g = 0;

    /* renamed from: h  reason: collision with root package name */
    private int f3981h;

    /* JADX INFO: Access modifiers changed from: protected */
    public r(l lVar, CharSequence charSequence) {
        d dVar;
        int i;
        dVar = lVar.f3942a;
        this.f3978e = dVar;
        this.f3979f = false;
        i = lVar.f3944c;
        this.f3981h = i;
        this.f3977d = charSequence;
    }

    abstract int a(int i);

    abstract int b(int i);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0 >= r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r6.f3978e.a(r6.f3977d.charAt(r0)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r1 <= r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r6.f3978e.a(r6.f3977d.charAt(r1 - 1)) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r6.f3979f == false) goto L45;
     */
    @Override // c.e.a.b.d.e.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* synthetic */ java.lang.String f() {
        /*
            r6 = this;
        L0:
            int r0 = r6.f3980g
        L2:
            int r1 = r6.f3980g
            r2 = -1
            if (r1 == r2) goto L90
            int r1 = r6.a(r1)
            if (r1 != r2) goto L16
            java.lang.CharSequence r1 = r6.f3977d
            int r1 = r1.length()
            r6.f3980g = r2
            goto L1c
        L16:
            int r3 = r6.b(r1)
            r6.f3980g = r3
        L1c:
            int r3 = r6.f3980g
            if (r3 != r0) goto L31
            int r3 = r3 + 1
            r6.f3980g = r3
            int r1 = r6.f3980g
            java.lang.CharSequence r3 = r6.f3977d
            int r3 = r3.length()
            if (r1 <= r3) goto L2
            r6.f3980g = r2
            goto L2
        L31:
            if (r0 >= r1) goto L44
            c.e.a.b.d.e.d r3 = r6.f3978e
            java.lang.CharSequence r4 = r6.f3977d
            char r4 = r4.charAt(r0)
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L44
            int r0 = r0 + 1
            goto L31
        L44:
            if (r1 <= r0) goto L59
            c.e.a.b.d.e.d r3 = r6.f3978e
            java.lang.CharSequence r4 = r6.f3977d
            int r5 = r1 + (-1)
            char r4 = r4.charAt(r5)
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L59
            int r1 = r1 + (-1)
            goto L44
        L59:
            boolean r3 = r6.f3979f
            if (r3 == 0) goto L60
            if (r0 != r1) goto L60
            goto L0
        L60:
            int r3 = r6.f3981h
            r4 = 1
            if (r3 != r4) goto L82
            java.lang.CharSequence r1 = r6.f3977d
            int r1 = r1.length()
            r6.f3980g = r2
        L6d:
            if (r1 <= r0) goto L85
            c.e.a.b.d.e.d r2 = r6.f3978e
            java.lang.CharSequence r3 = r6.f3977d
            int r4 = r1 + (-1)
            char r3 = r3.charAt(r4)
            boolean r2 = r2.a(r3)
            if (r2 == 0) goto L85
            int r1 = r1 + (-1)
            goto L6d
        L82:
            int r3 = r3 - r4
            r6.f3981h = r3
        L85:
            java.lang.CharSequence r2 = r6.f3977d
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            return r0
        L90:
            r6.a()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.e.r.f():java.lang.Object");
    }
}
