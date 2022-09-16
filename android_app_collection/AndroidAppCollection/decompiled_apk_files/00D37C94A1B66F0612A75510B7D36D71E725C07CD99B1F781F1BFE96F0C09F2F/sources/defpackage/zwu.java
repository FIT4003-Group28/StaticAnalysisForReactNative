package defpackage;
/* compiled from: PG */
/* renamed from: zwu  reason: default package */
/* loaded from: classes4.dex */
public final class zwu implements Runnable {
    final /* synthetic */ zwx a;
    private final /* synthetic */ int b;

    public zwu(zwx zwxVar) {
        this.a = zwxVar;
    }

    public /* synthetic */ zwu(zwx zwxVar, int i) {
        this.b = i;
        this.a = zwxVar;
    }

    public zwu(zwx zwxVar, int i, byte[] bArr) {
        this.b = i;
        this.a = zwxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.bx();
        } else if (i == 1) {
            this.a.aF.getLooper().quit();
        } else {
            this.a.by(null);
        }
    }
}
