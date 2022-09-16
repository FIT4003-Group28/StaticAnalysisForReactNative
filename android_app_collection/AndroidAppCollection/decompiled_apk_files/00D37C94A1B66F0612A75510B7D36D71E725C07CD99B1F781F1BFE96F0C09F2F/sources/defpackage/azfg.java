package defpackage;
/* compiled from: PG */
/* renamed from: azfg  reason: default package */
/* loaded from: classes2.dex */
public final class azfg extends ayos implements ayrh {
    final ayok a;
    final Object b;

    public azfg(ayok ayokVar, Object obj) {
        this.a = ayokVar;
        this.b = obj;
    }

    @Override // defpackage.ayos
    public final void X(ayot ayotVar) {
        this.a.az(new azff(ayotVar, this.b));
    }

    @Override // defpackage.ayrh
    public final ayoi a() {
        azfc azfcVar = new azfc(this.a, this.b, true);
        azqc.i();
        return azfcVar;
    }
}
