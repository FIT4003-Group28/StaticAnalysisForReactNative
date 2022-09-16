package defpackage;
/* compiled from: PG */
/* renamed from: hmj  reason: default package */
/* loaded from: classes3.dex */
public final class hmj implements Runnable {
    final /* synthetic */ hml a;
    private final /* synthetic */ int b;

    public hmj(hml hmlVar) {
        this.a = hmlVar;
    }

    public /* synthetic */ hmj(hml hmlVar, int i) {
        this.b = i;
        this.a = hmlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.aW();
            return;
        }
        hml hmlVar = this.a;
        if (hmlVar.am == null) {
            return;
        }
        hmlVar.aS();
    }
}
