package defpackage;

import defpackage.azwm;
/* compiled from: PG */
/* renamed from: azzn  reason: default package */
/* loaded from: classes3.dex */
public abstract class azzn<P extends azwm<P>> implements baal, azzp {
    public String a;
    public int b;
    @dzsi
    public baad c;
    public volatile boolean d;
    @dzsi
    private bvrt<dwfl> e;
    private boolean f;
    private long g;
    private boolean h = false;
    private volatile boolean i = false;
    private volatile boolean j = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public azzn(String str, @dzsi dwfl dwflVar, boolean z, int i) {
        this.b = -1;
        this.d = false;
        this.a = str;
        this.e = dwflVar == null ? null : bvrt.b(dwflVar);
        this.f = false;
        this.b = i;
        this.d = false;
    }

    @Override // defpackage.baal
    public final azxb a() {
        baaj baajVar = baaj.PLACE;
        int ordinal = x().ordinal();
        if (ordinal == 0) {
            baak z = z();
            dbsk.s(z);
            return azxb.f(z.a(), z.b());
        } else if (ordinal == 1) {
            baai A = A();
            dbsk.s(A);
            return azxb.g(A.a(), A.b());
        } else if (ordinal == 2) {
            baag C = C();
            dbsk.s(C);
            String a = C.a();
            dbsk.b(!a.isEmpty(), "DEALID cannot be empty for deal identifier");
            return new azvk(akqi.a, null, "", dpuk.UNKNOWN_KNOWLEDGE_ENTITY, a);
        } else {
            String valueOf = String.valueOf(x());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("Cannot create PlaceIdentifier from unsupported type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.azzp
    public final Class<baal> ak() {
        return baal.class;
    }

    @Override // defpackage.baal
    @dzsi
    public final baad b() {
        return this.c;
    }

    @Override // defpackage.baal
    public final String c() {
        return this.a;
    }

    @Override // defpackage.baal
    public final void d(String str) {
        String s = dbra.b.s(str);
        if (!this.a.equals(s)) {
            this.a = s;
            this.d = true;
            this.i = true;
        }
    }

    @Override // defpackage.baal
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.baal
    public final void f(boolean z) {
        if (this.f != z) {
            this.f = z;
        }
    }

    @Override // defpackage.baal
    public final long g() {
        return this.g;
    }

    @Override // defpackage.baal
    public final void h(long j) {
        if (this.g != j) {
            this.g = j;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r0.equals(r1.h) != false) goto L30;
     */
    @Override // defpackage.baal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(@defpackage.dzsi defpackage.dwfl r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L41
            dizh r0 = r4.p
            if (r0 != 0) goto L8
            dizh r0 = defpackage.dizh.j
        L8:
            dggg r0 = r0.b
            if (r0 != 0) goto Le
            dggg r0 = defpackage.dggg.d
        Le:
            int r0 = r0.b
            dgge r0 = defpackage.dgge.b(r0)
            if (r0 != 0) goto L18
            dgge r0 = defpackage.dgge.IMAGE_UNKNOWN
        L18:
            dgge r1 = defpackage.dgge.MEDIA_GUESSABLE_FIFE
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r4 = r4.h
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Invalid image key from photo: "
            int r2 = r4.length()
            if (r2 == 0) goto L35
            java.lang.String r4 = r1.concat(r4)
            goto L3a
        L35:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L3a:
            r0.<init>(r4)
            defpackage.bvoo.f(r0)
            return
        L41:
            if (r4 == 0) goto L58
            bvrt<dwfl> r0 = r3.e
            if (r0 == 0) goto L58
            java.lang.String r0 = r4.h
            dwfl r1 = r3.j()
            defpackage.dbsk.s(r1)
            java.lang.String r1 = r1.h
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
        L58:
            if (r4 != 0) goto L5e
            bvrt<dwfl> r0 = r3.e
            if (r0 != 0) goto L64
        L5e:
            if (r4 == 0) goto L71
            bvrt<dwfl> r0 = r3.e
            if (r0 != 0) goto L71
        L64:
            if (r4 != 0) goto L68
            r4 = 0
            goto L6c
        L68:
            bvrt r4 = defpackage.bvrt.b(r4)
        L6c:
            r3.e = r4
            r4 = 1
            r3.d = r4
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azzn.i(dwfl):void");
    }

    @Override // defpackage.baal
    @dzsi
    public final dwfl j() {
        bvrt<dwfl> bvrtVar = this.e;
        if (bvrtVar == null) {
            return null;
        }
        return bvrtVar.e((dssr) dwfl.w.cu(7), dwfl.w);
    }

    @Override // defpackage.baal
    public final boolean k() {
        return this.d;
    }

    @Override // defpackage.baal
    public final boolean l() {
        return this.i;
    }

    @Override // defpackage.baal
    public final boolean m() {
        return this.j;
    }

    @Override // defpackage.baal
    public final void n(int i) {
        if (this.b != i) {
            this.b = i;
            this.d = true;
        }
    }

    @Override // defpackage.baal
    public final int o() {
        return this.b;
    }

    @Override // defpackage.baal
    public final boolean p(baal baalVar) {
        azwl azwlVar = ao().j;
        dbsk.s(azwlVar);
        String str = azwlVar.a;
        azwl azwlVar2 = ((azzn) baalVar).ao().j;
        dbsk.s(azwlVar2);
        return str.equals(azwlVar2.a);
    }

    @Override // defpackage.baal
    public final void q() {
        this.h = true;
    }

    @Override // defpackage.baal
    public final void r() {
        this.h = false;
    }

    @Override // defpackage.baal
    public final boolean s() {
        return this.h;
    }

    public final void t() {
        this.j = true;
    }
}
