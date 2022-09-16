package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ioi  reason: default package */
/* loaded from: classes3.dex */
public final class ioi extends ajwe {
    final /* synthetic */ ajzq a;
    final /* synthetic */ iou b;

    public ioi(iou iouVar, ajzq ajzqVar) {
        this.b = iouVar;
        this.a = ajzqVar;
    }

    @Override // defpackage.ajwe, defpackage.akae
    public final void c(aakw aakwVar, boolean z) {
        if (!z) {
            return;
        }
        iou iouVar = this.b;
        if (!iouVar.bR.k(aakwVar, this.a, iouVar.r())) {
            return;
        }
        this.b.bj();
    }
}
