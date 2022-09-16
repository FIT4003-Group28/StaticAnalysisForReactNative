package defpackage;
/* compiled from: PG */
/* renamed from: azei  reason: default package */
/* loaded from: classes2.dex */
public final class azei extends ayoi {
    final ayoj a;

    public azei(ayoj ayojVar) {
        this.a = ayojVar;
    }

    @Override // defpackage.ayoi
    protected final void f(ayom ayomVar) {
        azeh azehVar = new azeh(ayomVar);
        ayomVar.sj(azehVar);
        try {
            this.a.a(azehVar);
        } catch (Throwable th) {
            bapv.j(th);
            azehVar.d(th);
        }
    }
}
