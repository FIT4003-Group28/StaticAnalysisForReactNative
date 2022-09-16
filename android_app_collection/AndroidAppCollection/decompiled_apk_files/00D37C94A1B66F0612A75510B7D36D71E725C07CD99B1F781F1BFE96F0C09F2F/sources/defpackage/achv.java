package defpackage;
/* compiled from: PG */
/* renamed from: achv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class achv implements Runnable {
    public final /* synthetic */ acid a;
    private final /* synthetic */ int b;

    public /* synthetic */ achv(acid acidVar, int i) {
        this.b = i;
        this.a = acidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            acid acidVar = this.a;
            if (acidVar.ap.getWidth() != 0) {
                return;
            }
            achk.a(acidVar.mJ());
            acic acicVar = acidVar.af;
            if (acicVar == null) {
                return;
            }
            acicVar.az(acidVar.ap);
        } else if (i == 1) {
            acid acidVar2 = this.a;
            acidVar2.av = false;
            acidVar2.aN();
            if (acidVar2.aw != 2) {
                return;
            }
            acidVar2.aP(4);
        } else {
            this.a.aO();
        }
    }
}
