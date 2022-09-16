package defpackage;
/* compiled from: PG */
/* renamed from: aywh  reason: default package */
/* loaded from: classes2.dex */
public final class aywh extends aynr implements ayrf {
    final aynx a;
    final ayqe b;

    public aywh(aynx aynxVar, ayqe ayqeVar) {
        this.a = aynxVar;
        this.b = ayqeVar;
    }

    @Override // defpackage.aynr
    protected final void V(ayns aynsVar) {
        this.a.ac(new aywg(aynsVar, this.b));
    }

    @Override // defpackage.ayrf
    public final aynx a() {
        aywe ayweVar = new aywe(this.a, this.b);
        azqc.j();
        return ayweVar;
    }
}
