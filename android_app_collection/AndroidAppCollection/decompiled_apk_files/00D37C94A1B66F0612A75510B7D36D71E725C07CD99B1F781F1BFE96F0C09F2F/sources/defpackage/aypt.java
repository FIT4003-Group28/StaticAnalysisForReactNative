package defpackage;
/* compiled from: PG */
/* renamed from: aypt  reason: default package */
/* loaded from: classes2.dex */
public abstract class aypt extends aynx {
    public abstract void ar(ayqb ayqbVar);

    public final aynx b(int i) {
        ayqb ayqbVar = ayrb.d;
        if (i <= 0) {
            ar(ayqbVar);
            azqc.m();
            return this;
        }
        ayub ayubVar = new ayub(this, ayqbVar);
        azqc.j();
        return ayubVar;
    }

    public final aynx c() {
        aypt ayptVar;
        if (this instanceof ayyg) {
            ayyg ayygVar = (ayyg) this;
            ayptVar = new ayyj(ayygVar.b, ayygVar.d);
            azqc.m();
        } else {
            ayptVar = this;
        }
        ayym ayymVar = new ayym(ayptVar);
        azqc.j();
        return ayymVar;
    }

    public final aynx sq() {
        return b(1);
    }
}
