package defpackage;
/* compiled from: PG */
/* renamed from: bhq  reason: default package */
/* loaded from: classes3.dex */
public final class bhq implements Runnable {
    private final bhr a;
    private final String b;

    public bhq(bhr bhrVar, String str) {
        this.a = bhrVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            if (this.a.b.remove(this.b) == null) {
                bbz.e().a(new Throwable[0]);
            } else {
                bhp remove = this.a.c.remove(this.b);
                if (remove != null) {
                    remove.c();
                }
            }
        }
    }
}
