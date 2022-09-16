package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ioo  reason: default package */
/* loaded from: classes3.dex */
public final class ioo implements fsu {
    final /* synthetic */ iou a;
    private final /* synthetic */ int b;

    public ioo(iou iouVar) {
        this.a = iouVar;
    }

    public ioo(iou iouVar, int i) {
        this.b = i;
        this.a = iouVar;
    }

    @Override // defpackage.fsu
    public final void b(int i, boolean z) {
        if (this.b != 0) {
            return;
        }
        avfo g = this.a.e.g();
        if (!z) {
            this.a.cl.b();
        }
        iou iouVar = this.a;
        if (iouVar.aj == 0) {
            iouVar.bq();
        }
        this.a.ba.c(g);
        this.a.bj.a();
    }

    @Override // defpackage.fsu
    public final void e(float f) {
        if (this.b != 0 || f == 0.0f || f == 1.0f) {
            return;
        }
        this.a.aF(true);
    }

    @Override // defpackage.fsu
    public final void oB(int i) {
        if (this.b != 0) {
            return;
        }
        if (i == 1) {
            this.a.ba.b(false);
        } else if (i == 2) {
            this.a.ba.b(false);
        } else if (i == 0) {
            this.a.bq();
            this.a.ba.b(true);
        }
        this.a.aj = i;
    }

    @Override // defpackage.fsu
    public final boolean d(int i) {
        if (this.b == 0) {
            this.a.aF(false);
            return true;
        }
        this.a.bs();
        return false;
    }
}
