package defpackage;
/* compiled from: PG */
/* renamed from: nmu  reason: default package */
/* loaded from: classes3.dex */
public final class nmu {
    private static final amvn c = amvn.s(aqvk.ENGAGEMENT_PANEL_SURFACE_BROWSE, aqvk.ENGAGEMENT_PANEL_SURFACE_SEARCH);
    public final axnm a;
    public final axnm b;
    private final ezh d;

    public nmu(axnm axnmVar, axnm axnmVar2, ezh ezhVar) {
        this.a = axnmVar;
        this.b = axnmVar2;
        this.d = ezhVar;
    }

    public final nml a(aqvk aqvkVar) {
        if (c.contains(aqvkVar)) {
            return (nml) this.b.get();
        }
        return (nml) this.a.get();
    }

    public final ayoi b() {
        return this.d.h().V(lyd.r).B().V(new ayqe() { // from class: nmt
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                nmu nmuVar = nmu.this;
                if (((Boolean) obj).booleanValue()) {
                    return (nml) nmuVar.a.get();
                }
                return (nml) nmuVar.b.get();
            }
        });
    }
}
