package defpackage;
/* compiled from: PG */
/* renamed from: azjn  reason: default package */
/* loaded from: classes2.dex */
public final class azjn extends ayos implements ayrh {
    final ayok a;

    public azjn(ayok ayokVar) {
        this.a = ayokVar;
    }

    @Override // defpackage.ayos
    public final void X(ayot ayotVar) {
        try {
            this.a.az(new azjm(ayotVar, ayyq.a()));
        } catch (Throwable th) {
            bapv.j(th);
            ayqj.i(th, ayotVar);
        }
    }

    @Override // defpackage.ayrh
    public final ayoi a() {
        azjl azjlVar = new azjl(this.a);
        azqc.i();
        return azjlVar;
    }
}
