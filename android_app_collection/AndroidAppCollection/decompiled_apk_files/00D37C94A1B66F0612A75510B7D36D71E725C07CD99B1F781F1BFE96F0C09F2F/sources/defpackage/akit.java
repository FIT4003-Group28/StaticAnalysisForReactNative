package defpackage;
/* compiled from: PG */
/* renamed from: akit  reason: default package */
/* loaded from: classes.dex */
final class akit extends axze {
    final /* synthetic */ akiu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akit(akiu akiuVar, axyg axygVar) {
        super(axygVar);
        this.a = akiuVar;
    }

    @Override // defpackage.axzf, defpackage.axyg
    public final void k(axzl axzlVar, ayat ayatVar) {
        ayat ayatVar2 = this.a.b;
        if (ayatVar2 != null) {
            ayatVar.e(ayatVar2);
        }
        if (!amps.e(this.a.c)) {
            ayaq ayaqVar = akiu.a;
            String valueOf = String.valueOf(this.a.c);
            ayatVar.f(ayaqVar, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
        }
        super.k(axzlVar, ayatVar);
    }
}
