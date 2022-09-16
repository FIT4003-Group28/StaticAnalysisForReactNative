package defpackage;
/* compiled from: PG */
/* renamed from: nsn  reason: default package */
/* loaded from: classes3.dex */
public final class nsn {
    static final acum a = new acte(actj.ENGAGEMENT_PANEL_RESIZABLE_HEADER);
    public static final /* synthetic */ int e = 0;
    public final aynx b;
    public final nrl c;
    public zgz d = ahfk.b;

    public nsn(nqk nqkVar, nrl nrlVar) {
        this.c = nrlVar;
        this.b = nqkVar.c.u(noc.e).C(nox.i);
    }

    public static asjj a(nsr nsrVar) {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asje.a.createBuilder();
        nsr nsrVar2 = nsr.FULL_BLEED;
        ntd ntdVar = ntd.NO_FLING;
        int ordinal = nsrVar.ordinal();
        int i = 2;
        if (ordinal == 0) {
            i = 5;
        } else if (ordinal != 1) {
            i = ordinal != 2 ? 1 : 4;
        }
        createBuilder2.copyOnWrite();
        asje asjeVar = (asje) createBuilder2.instance;
        asjeVar.c = i - 1;
        asjeVar.b |= 1;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asje asjeVar2 = (asje) createBuilder2.mo39build();
        asjeVar2.getClass();
        asjjVar.z = asjeVar2;
        asjjVar.c |= 65536;
        return (asjj) createBuilder.mo39build();
    }
}
