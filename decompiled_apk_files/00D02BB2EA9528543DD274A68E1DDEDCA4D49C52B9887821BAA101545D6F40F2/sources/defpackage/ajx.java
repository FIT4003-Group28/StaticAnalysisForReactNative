package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajx  reason: default package */
/* loaded from: classes.dex */
public final class ajx implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;

    public ajx(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (ajz.d != null) {
                ajz.d.invoke(this.a, this.b, false, "AppCompat recreation");
            } else {
                ajz.e.invoke(this.a, this.b, false);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}
