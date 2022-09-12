package defpackage;
/* compiled from: PG */
/* renamed from: dzcn  reason: default package */
/* loaded from: classes6.dex */
final class dzcn implements dyzq {
    final /* synthetic */ dzco a;
    private final dzab b;

    public dzcn(dzco dzcoVar, dzab dzabVar) {
        this.a = dzcoVar;
        this.b = dzabVar;
    }

    @Override // defpackage.dyzq
    public final void a(dzak dzakVar) {
        this.b.a(dzakVar);
    }

    @Override // defpackage.dyzq
    public final void c(Throwable th) {
        this.b.b(th);
    }

    @Override // defpackage.dyzq
    public final void b() {
        try {
            this.b.c(ajps.a);
        } catch (Throwable th) {
            dzas.a(th);
            this.b.b(th);
        }
    }
}
