package defpackage;
/* compiled from: PG */
/* renamed from: fdc  reason: default package */
/* loaded from: classes3.dex */
public final class fdc implements zbu {
    final /* synthetic */ azqb a;
    final /* synthetic */ azqb b;

    public fdc(azqb azqbVar, azqb azqbVar2) {
        this.a = azqbVar;
        this.b = azqbVar2;
    }

    @Override // defpackage.zbu
    public final ankt a() {
        return ((fcu) this.a.get()).b(((afvn) this.b.get()).c().b());
    }

    @Override // defpackage.zbu
    public final /* bridge */ /* synthetic */ ankt b(Object obj) {
        return ((fcu) this.a.get()).e(((afvn) this.b.get()).c().b(), ((Boolean) obj).booleanValue());
    }
}
