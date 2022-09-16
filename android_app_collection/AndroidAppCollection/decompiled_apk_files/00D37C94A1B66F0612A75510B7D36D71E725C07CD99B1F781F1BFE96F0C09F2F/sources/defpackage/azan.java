package defpackage;
/* compiled from: PG */
/* renamed from: azan  reason: default package */
/* loaded from: classes2.dex */
public final class azan extends ayoc {
    final ayoe a;

    public azan(ayoe ayoeVar) {
        this.a = ayoeVar;
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        azam azamVar = new azam(ayodVar);
        ayodVar.sj(azamVar);
        try {
            this.a.a(azamVar);
        } catch (Throwable th) {
            bapv.j(th);
            azamVar.a(th);
        }
    }
}
