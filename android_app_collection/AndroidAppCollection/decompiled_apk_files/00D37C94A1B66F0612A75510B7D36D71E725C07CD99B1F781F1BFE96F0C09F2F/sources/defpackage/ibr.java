package defpackage;
/* compiled from: PG */
/* renamed from: ibr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibr implements Runnable {
    public final /* synthetic */ ico a;
    private final /* synthetic */ int b;

    public /* synthetic */ ibr(ico icoVar) {
        this.a = icoVar;
    }

    public /* synthetic */ ibr(ico icoVar, int i) {
        this.b = i;
        this.a = icoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.aM(actj.LIGHTWEIGHT_PLAYER_AUTO_DISMISS);
        } else if (i == 1) {
            this.a.aM(actj.LIGHTWEIGHT_PLAYER_AUTO_DISMISS);
        } else {
            ico icoVar = this.a;
            icoVar.av.b();
            if (!icoVar.ao.d()) {
                return;
            }
            icoVar.av.a();
        }
    }
}
