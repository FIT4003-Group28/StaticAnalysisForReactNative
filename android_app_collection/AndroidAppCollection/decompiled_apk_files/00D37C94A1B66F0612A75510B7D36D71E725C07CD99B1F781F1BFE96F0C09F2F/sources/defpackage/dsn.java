package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dsn  reason: default package */
/* loaded from: classes3.dex */
public final class dsn implements Runnable {
    final /* synthetic */ dso a;

    public dsn(dso dsoVar) {
        this.a = dsoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (this.a.e == null) {
            synchronized (dso.a) {
                if (this.a.e != null) {
                    return;
                }
                boolean z2 = false;
                try {
                    z = ((Boolean) qdb.j.c()).booleanValue();
                } catch (IllegalStateException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        dso.b = new rcy(this.a.d.a, "ADSHIELD");
                    } catch (Throwable unused2) {
                    }
                }
                z2 = z;
                this.a.e = Boolean.valueOf(z2);
                dso.a.open();
            }
        }
    }
}
