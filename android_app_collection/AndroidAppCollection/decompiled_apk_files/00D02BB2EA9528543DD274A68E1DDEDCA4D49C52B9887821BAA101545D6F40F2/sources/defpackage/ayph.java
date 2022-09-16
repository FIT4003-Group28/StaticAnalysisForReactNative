package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayph  reason: default package */
/* loaded from: classes3.dex */
public final class ayph implements degu<Boolean> {
    final /* synthetic */ aypi a;

    public ayph(aypi aypiVar) {
        this.a = aypiVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.d.a(ayoo.INITIAL);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        if (!this.a.c.a.aZ) {
            return;
        }
        if (bool2.booleanValue()) {
            aypi aypiVar = this.a;
            aypiVar.c.w(aypiVar.d);
            return;
        }
        this.a.d.a(ayoo.INITIAL);
        this.a.c.f.f();
    }
}
