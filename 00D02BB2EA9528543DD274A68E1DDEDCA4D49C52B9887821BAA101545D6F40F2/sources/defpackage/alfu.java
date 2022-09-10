package defpackage;
/* compiled from: PG */
/* renamed from: alfu  reason: default package */
/* loaded from: classes2.dex */
public final class alfu implements amri {
    private final amub a;
    private final amuo b;

    public alfu(amub amubVar, amuo amuoVar) {
        this.a = amubVar;
        this.b = amuoVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        akrn V;
        akra akraVar2 = amrkVar.f.f;
        if (akraVar2 == null || (V = this.a.V(akraVar2, akraVar2.r() * 50.0d)) == null) {
            return 0.5f;
        }
        return this.b.j <= V.d ? 1.0f : 0.0f;
    }
}
