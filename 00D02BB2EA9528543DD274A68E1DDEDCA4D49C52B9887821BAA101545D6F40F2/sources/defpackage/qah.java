package defpackage;
/* compiled from: PG */
/* renamed from: qah  reason: default package */
/* loaded from: classes7.dex */
public final class qah extends qcj {
    public qup a;
    public quy b;
    private dcdc<qcn> c;
    private qcl d;
    private qcl e;
    private Boolean f;
    private dbsg<dnqh> g = dbpy.a;

    @Override // defpackage.qcj
    public final void b(qcl qclVar) {
        if (qclVar != null) {
            this.e = qclVar;
            return;
        }
        throw new NullPointerException("Null destination");
    }

    @Override // defpackage.qcj
    public final void c(dnqh dnqhVar) {
        this.g = dbsg.i(dnqhVar);
    }

    @Override // defpackage.qcj
    public final void d(dcdc<qcn> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null routesToDisplay");
    }

    @Override // defpackage.qcj
    public final void e(qcl qclVar) {
        if (qclVar != null) {
            this.d = qclVar;
            return;
        }
        throw new NullPointerException("Null source");
    }

    @Override // defpackage.qcj
    public final void f(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.qcj
    public final qco a() {
        String str = this.c == null ? " routesToDisplay" : "";
        if (this.d == null) {
            str = str.concat(" source");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" destination");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" swapWithCurrentFragment");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qai(this.c, this.d, this.e, this.f.booleanValue(), this.a, this.b, this.g);
    }
}
