package defpackage;
/* compiled from: PG */
/* renamed from: ayvt  reason: default package */
/* loaded from: classes2.dex */
public final class ayvt extends ayos implements ayrf {
    final aynx a;
    final Object b;

    public ayvt(aynx aynxVar, Object obj) {
        this.a = aynxVar;
        this.b = obj;
    }

    @Override // defpackage.ayos
    protected final void X(ayot ayotVar) {
        this.a.ac(new ayvs(ayotVar, this.b));
    }

    @Override // defpackage.ayrf
    public final aynx a() {
        ayvp ayvpVar = new ayvp(this.a, this.b, true);
        azqc.j();
        return ayvpVar;
    }
}
