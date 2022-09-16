package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahvt  reason: default package */
/* loaded from: classes.dex */
public final class ahvt implements Runnable {
    final /* synthetic */ ahvu a;
    private final /* synthetic */ int b;

    public ahvt(ahvu ahvuVar) {
        this.a = ahvuVar;
    }

    public ahvt(ahvu ahvuVar, int i) {
        this.b = i;
        this.a = ahvuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.e.i();
            return;
        }
        ahvu ahvuVar = this.a;
        if (ahvuVar.n && ahvuVar.o) {
            ahvuVar.o = false;
        }
        ahvuVar.g();
    }
}
