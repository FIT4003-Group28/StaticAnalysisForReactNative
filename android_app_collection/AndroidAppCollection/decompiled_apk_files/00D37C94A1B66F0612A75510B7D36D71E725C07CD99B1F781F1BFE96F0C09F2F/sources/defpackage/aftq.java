package defpackage;
/* compiled from: PG */
/* renamed from: aftq  reason: default package */
/* loaded from: classes.dex */
public final class aftq implements afts {
    private final afts a;
    private final afzq b;

    public aftq(snc sncVar, afts aftsVar) {
        this.a = aftsVar;
        this.b = new afzq(sncVar);
    }

    @Override // defpackage.afts
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        cew cewVar = (cew) obj;
        return new afsk((byte[]) this.a.b(cewVar), this.b.a((String) acx.g(cewVar).g.get("cache-control")));
    }
}
