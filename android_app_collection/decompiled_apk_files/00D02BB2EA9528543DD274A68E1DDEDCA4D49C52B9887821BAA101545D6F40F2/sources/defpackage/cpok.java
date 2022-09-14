package defpackage;
/* compiled from: PG */
/* renamed from: cpok  reason: default package */
/* loaded from: classes5.dex */
final class cpok implements Runnable {
    final /* synthetic */ cpor a;

    public cpok(cpor cporVar) {
        this.a = cporVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.i != cpoq.EXPLORE || !this.a.j.contains(cpoq.DESCRIBE)) {
            return;
        }
        this.a.d(cpoq.DESCRIBE);
    }
}
