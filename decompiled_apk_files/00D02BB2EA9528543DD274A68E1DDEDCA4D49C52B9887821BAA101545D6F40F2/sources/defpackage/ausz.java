package defpackage;
/* compiled from: PG */
/* renamed from: ausz  reason: default package */
/* loaded from: classes2.dex */
public final class ausz {
    public final autg a;
    public final dxio<autb> b;
    public final dced<Integer, Integer> c;

    public ausz(autg autgVar, dxio<autb> dxioVar) {
        auiy[] values;
        this.a = autgVar;
        this.b = dxioVar;
        dcdz j = dced.j();
        for (auiy auiyVar : auiy.values()) {
            Integer b = auiyVar.b();
            if (b != null) {
                j.h(b, auiyVar.a());
            }
        }
        this.c = j.f();
    }

    @dzsi
    public final aujb a(int i) {
        return this.a.a(i);
    }
}
