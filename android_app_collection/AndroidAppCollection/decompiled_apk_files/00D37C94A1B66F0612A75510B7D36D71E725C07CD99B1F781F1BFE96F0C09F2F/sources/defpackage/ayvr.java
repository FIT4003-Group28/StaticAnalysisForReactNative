package defpackage;
/* compiled from: PG */
/* renamed from: ayvr  reason: default package */
/* loaded from: classes2.dex */
public final class ayvr extends ayoc implements ayrf {
    final aynx a;

    public ayvr(aynx aynxVar) {
        this.a = aynxVar;
    }

    @Override // defpackage.ayoc
    protected final void Y(ayod ayodVar) {
        this.a.ac(new ayvq(ayodVar));
    }

    @Override // defpackage.ayrf
    public final aynx a() {
        ayvp ayvpVar = new ayvp(this.a, null, false);
        azqc.j();
        return ayvpVar;
    }
}
