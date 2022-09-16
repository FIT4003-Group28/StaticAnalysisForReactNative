package defpackage;
/* compiled from: PG */
/* renamed from: inn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class inn implements Runnable {
    public final /* synthetic */ iou a;
    private final /* synthetic */ int b;

    public /* synthetic */ inn(iou iouVar, int i) {
        this.b = i;
        this.a = iouVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.aG(true);
        } else if (i == 1) {
            axnm axnmVar = this.a.al;
            if (axnmVar == null) {
                return;
            }
            ((frv) axnmVar.get()).n();
        } else if (i == 2) {
            iou iouVar = this.a;
            iouVar.bd.a(iouVar.cf);
        } else {
            iou iouVar2 = this.a;
            iouVar2.aO.post(new inn(iouVar2, 2));
        }
    }
}
