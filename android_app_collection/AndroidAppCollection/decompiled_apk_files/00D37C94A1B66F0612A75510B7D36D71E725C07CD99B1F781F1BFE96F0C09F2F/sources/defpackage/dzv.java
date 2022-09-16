package defpackage;
/* compiled from: PG */
/* renamed from: dzv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dzv implements Runnable {
    public final /* synthetic */ eai a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzv(eai eaiVar) {
        this.a = eaiVar;
    }

    public /* synthetic */ dzv(eai eaiVar, int i) {
        this.b = i;
        this.a = eaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                eai eaiVar = this.a;
                if (!eog.aI(eaiVar.bu)) {
                    return;
                }
                ((aacg) eaiVar.bn.get()).b();
                return;
            case 1:
                eai eaiVar2 = this.a;
                eaiVar2.d.c(1);
                eaiVar2.d.f(((edw) eaiVar2.as.get()).a());
                return;
            case 2:
                eai eaiVar3 = this.a;
                apfn b = eaiVar3.b();
                if (!b.d || b.e.size() == 0) {
                    return;
                }
                yqg yqgVar = (yqg) eaiVar3.aK.get();
                for (String str : b.e) {
                    yqgVar.a(str);
                }
                return;
            case 3:
                zgd.a = eog.bf(this.a.bu);
                return;
            case 4:
                this.a.j(false);
                return;
            case 5:
                this.a.j(true);
                return;
            case 6:
                this.a.d.c(4);
                return;
            case 7:
                this.a.d.c(4);
                return;
            case 8:
                this.a.d.c(3);
                return;
            case 9:
                this.a.d.c(3);
                return;
            case 10:
                this.a.f(false);
                return;
            case 11:
                this.a.f(true);
                return;
            case 12:
                this.a.e(true);
                return;
            case 13:
                this.a.f(false);
                return;
            case 14:
                this.a.e(false);
                return;
            case 15:
                this.a.aI.get();
                return;
            case 16:
                ((fnl) this.a.be.get()).a();
                return;
            case 17:
                ((yqw) this.a.bq.get()).c();
                return;
            case 18:
                ((ite) this.a.k.get()).n();
                return;
            case 19:
                ((dys) this.a.Y.get()).c();
                return;
            default:
                ((fbj) this.a.Q.get()).b();
                return;
        }
    }
}
