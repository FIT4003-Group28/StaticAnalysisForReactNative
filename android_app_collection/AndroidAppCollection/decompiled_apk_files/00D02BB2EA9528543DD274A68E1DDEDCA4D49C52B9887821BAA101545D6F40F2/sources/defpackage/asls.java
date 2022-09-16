package defpackage;
/* compiled from: PG */
/* renamed from: asls  reason: default package */
/* loaded from: classes2.dex */
public final class asls implements astv {
    public Runnable a;
    public final /* synthetic */ aslt b;

    public asls(aslt asltVar) {
        this.b = asltVar;
    }

    public final void a() {
        aslt asltVar = this.b;
        if (asltVar.aD) {
            asltVar.aT();
            this.b.a.g().aq();
        }
    }

    @Override // defpackage.astv
    public final void b() {
        cqkx.p(this.b.ag);
        if (((efh) this.b.b).b) {
            this.a = new aslr(this);
            this.b.ad.a(this.a, bvrj.UI_THREAD, 250L);
        }
    }
}
