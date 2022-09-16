package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acsp  reason: default package */
/* loaded from: classes.dex */
public final class acsp implements Runnable {
    final /* synthetic */ acss a;
    private final /* synthetic */ int b;

    public acsp(acss acssVar) {
        this.a = acssVar;
    }

    public acsp(acss acssVar, int i) {
        this.b = i;
        this.a = acssVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            synchronized (this.a.h) {
                acss acssVar = this.a;
                if (acssVar.l != 3) {
                    acssVar.l = 3;
                    acssVar.j(4, null, null);
                    this.a.i();
                }
            }
        } else if (i == 1) {
            this.a.j(2, null, null);
        } else {
            synchronized (this.a.h) {
                acss acssVar2 = this.a;
                if (acssVar2.l != 2) {
                    acssVar2.l = 2;
                    acssVar2.j(3, null, null);
                    this.a.h();
                }
            }
        }
    }
}
