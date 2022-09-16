package defpackage;
/* compiled from: PG */
/* renamed from: dzds  reason: default package */
/* loaded from: classes6.dex */
final class dzds implements dzab {
    final /* synthetic */ dzdt a;
    private final dzab b;

    public dzds(dzdt dzdtVar, dzab dzabVar) {
        this.a = dzdtVar;
        this.b = dzabVar;
    }

    @Override // defpackage.dzab
    public final void a(dzak dzakVar) {
        this.b.a(dzakVar);
    }

    @Override // defpackage.dzab
    public final void b(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.dzab
    public final void c(Object obj) {
        try {
            this.a.b.SR(obj);
            this.b.c(obj);
        } catch (Throwable th) {
            dzas.a(th);
            this.b.b(th);
        }
    }
}
