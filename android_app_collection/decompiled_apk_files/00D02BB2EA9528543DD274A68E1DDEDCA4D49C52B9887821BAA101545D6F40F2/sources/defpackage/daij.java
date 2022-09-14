package defpackage;
/* compiled from: PG */
/* renamed from: daij  reason: default package */
/* loaded from: classes5.dex */
public abstract class daij implements Runnable {
    public final dane<?> a;

    public daij() {
        this.a = null;
    }

    public daij(dane<?> daneVar) {
        this.a = daneVar;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            dane<?> daneVar = this.a;
            if (daneVar == null) {
                return;
            }
            daneVar.a(e);
        }
    }
}
