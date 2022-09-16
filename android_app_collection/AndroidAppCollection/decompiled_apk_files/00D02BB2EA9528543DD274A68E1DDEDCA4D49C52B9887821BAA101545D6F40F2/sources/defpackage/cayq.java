package defpackage;
/* compiled from: PG */
/* renamed from: cayq  reason: default package */
/* loaded from: classes4.dex */
public class cayq implements cbqi {
    private final drlr a;
    private final jic b;
    private final cbqh c;
    private final boolean d;
    private Boolean e;

    public cayq(drlr drlrVar, boolean z, boolean z2, cbqh cbqhVar) {
        this.a = drlrVar;
        this.d = z2;
        this.e = Boolean.valueOf(z);
        this.b = k(drlrVar.c);
        this.c = cbqhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jic k(@dzsi String str) {
        return new jic((str == null || str.isEmpty()) ? null : str, ckqc.FULLY_QUALIFIED, cqrt.f(2131231327), 0, true, null, null);
    }

    private final boolean l() {
        return this.e.booleanValue() && this.d;
    }

    @Override // defpackage.cbqi
    public jic a() {
        return this.b;
    }

    @Override // defpackage.cbqi
    public String b() {
        return this.a.b;
    }

    @Override // defpackage.cbqi
    public Boolean c() {
        return this.e;
    }

    @Override // defpackage.cbqi
    public cqss d() {
        return l() ? ibm.y() : ibm.x();
    }

    @Override // defpackage.cbqi
    public cqss e() {
        return l() ? ibm.y() : ibm.p();
    }

    @Override // defpackage.cbqi
    public cqss f() {
        return l() ? ibm.u() : ibm.b();
    }

    @Override // defpackage.cbqi
    public cqss g() {
        return l() ? ibm.v() : ibm.j();
    }

    @Override // defpackage.cbqi
    public cqkl h() {
        if (!this.e.booleanValue()) {
            this.c.a(this);
        } else {
            this.c.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.cbqi
    public void i(boolean z) {
        if (this.e.booleanValue() != z) {
            this.e = Boolean.valueOf(z);
            cqkx.p(this);
        }
    }

    @Override // defpackage.cbqi
    public dprz j() {
        dprz b = dprz.b(this.a.a);
        return b == null ? dprz.EXPERIENCE_CATEGORY_UNKNOWN : b;
    }
}
