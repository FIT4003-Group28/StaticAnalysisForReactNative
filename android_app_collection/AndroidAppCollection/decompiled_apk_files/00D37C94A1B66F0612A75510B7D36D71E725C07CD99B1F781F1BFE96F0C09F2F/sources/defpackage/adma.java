package defpackage;
/* compiled from: PG */
/* renamed from: adma  reason: default package */
/* loaded from: classes.dex */
public final class adma {
    private final acth a;

    public adma(acth acthVar) {
        acthVar.getClass();
        this.a = acthVar;
    }

    private final acti c() {
        return this.a.oi();
    }

    public final void a(actj actjVar) {
        if (actjVar != null) {
            c().H(3, new acte(actjVar), null);
        }
    }

    public final void b(actj actjVar) {
        if (c() == null || actjVar == null) {
            return;
        }
        c().n(new acte(actjVar));
    }
}
