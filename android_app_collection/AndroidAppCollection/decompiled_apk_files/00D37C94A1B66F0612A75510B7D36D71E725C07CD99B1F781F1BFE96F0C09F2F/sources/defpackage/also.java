package defpackage;
/* compiled from: PG */
/* renamed from: also  reason: default package */
/* loaded from: classes.dex */
public abstract class also implements Runnable {
    public final alvg d;

    public also() {
        this.d = null;
    }

    public also(alvg alvgVar) {
        this.d = alvgVar;
    }

    protected abstract void a();

    public final void b(Exception exc) {
        alvg alvgVar = this.d;
        if (alvgVar != null) {
            alvgVar.a(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            b(e);
        }
    }
}
