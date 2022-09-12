package defpackage;
/* compiled from: PG */
/* renamed from: cbyw  reason: default package */
/* loaded from: classes4.dex */
public class cbyw implements cbyv {
    private final cbrx a;
    private final cjtd b;
    private final int c;
    private final cbts d;
    private final cbts e;

    public cbyw(cbrx cbrxVar, cjtd cjtdVar, int i, cbts cbtsVar, cbts cbtsVar2) {
        this.a = cbrxVar;
        this.b = cjtdVar;
        this.c = i;
        this.d = cbtsVar;
        this.e = cbtsVar2;
    }

    private static jic k(String str) {
        return new jic(str, ckqc.FIFE_MERGE, cqrt.f(2131232998), 0);
    }

    private final void l(cbts cbtsVar) {
        ((cbrz) this.a).a.a(dcdc.f(cbtsVar));
    }

    @Override // defpackage.cbyv
    public Boolean a() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.cbyv
    public String b() {
        return String.valueOf(this.c + 1);
    }

    @Override // defpackage.cbyv
    public String c() {
        return String.valueOf(this.c + 2);
    }

    @Override // defpackage.cbyv
    public String d() {
        return this.d.a;
    }

    @Override // defpackage.cbyv
    public String e() {
        cbts cbtsVar = this.e;
        return cbtsVar == null ? "" : cbtsVar.a;
    }

    @Override // defpackage.cbyv
    public jic f() {
        return k(this.d.b);
    }

    @Override // defpackage.cbyv
    public jic g() {
        cbts cbtsVar = this.e;
        return k(cbtsVar != null ? cbtsVar.b : "");
    }

    @Override // defpackage.cbyv
    public cqkl h() {
        l(this.d);
        return cqkl.a;
    }

    @Override // defpackage.cbyv
    public cqkl i() {
        dbsk.t(this.e, "Method onSelectSecondItem() should only be called when there is a second item, otherwise something is very wrong");
        l(this.e);
        return cqkl.a;
    }

    @Override // defpackage.cbyv
    public cjtd j() {
        cjta c = cjtd.c(this.b);
        c.d = dtya.dB;
        return c.a();
    }
}
