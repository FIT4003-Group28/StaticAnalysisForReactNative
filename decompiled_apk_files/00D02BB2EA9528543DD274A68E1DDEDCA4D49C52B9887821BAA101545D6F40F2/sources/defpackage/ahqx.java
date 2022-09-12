package defpackage;
/* compiled from: PG */
/* renamed from: ahqx  reason: default package */
/* loaded from: classes.dex */
final class ahqx implements Runnable {
    final /* synthetic */ ahqz a;

    public ahqx(ahqz ahqzVar) {
        this.a = ahqzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahqz ahqzVar = this.a;
        ahqzVar.j = false;
        if (ahqzVar.a.e() - ahqzVar.i < 2000) {
            this.a.h();
        } else {
            this.a.i(false);
        }
    }
}
