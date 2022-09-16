package defpackage;
/* compiled from: PG */
/* renamed from: azkn  reason: default package */
/* loaded from: classes2.dex */
public final class azkn extends ayos {
    final ayou a;

    public azkn(ayou ayouVar) {
        this.a = ayouVar;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        azkm azkmVar = new azkm(ayotVar);
        ayotVar.sj(azkmVar);
        try {
            this.a.a(azkmVar);
        } catch (Throwable th) {
            bapv.j(th);
            azkmVar.a(th);
        }
    }
}
