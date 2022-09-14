package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awoo  reason: default package */
/* loaded from: classes3.dex */
public final class awoo implements Runnable {
    final /* synthetic */ awop a;

    public awoo(awop awopVar) {
        this.a = awopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a.h) {
            if (this.a.a.g.b() || this.a.a.g.a()) {
                dbsk.s(this.a.a.l.get());
                this.a.a.l.get().v();
            }
            this.a.a.j = false;
        }
    }
}
