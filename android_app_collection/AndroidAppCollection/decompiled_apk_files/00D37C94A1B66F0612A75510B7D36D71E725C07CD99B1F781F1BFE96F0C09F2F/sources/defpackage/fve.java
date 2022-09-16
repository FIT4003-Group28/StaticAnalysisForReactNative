package defpackage;
/* compiled from: PG */
/* renamed from: fve  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fve implements fti {
    private final /* synthetic */ int c;
    public static final /* synthetic */ fve b = new fve(1);
    public static final /* synthetic */ fve a = new fve();

    private /* synthetic */ fve() {
    }

    private /* synthetic */ fve(int i) {
        this.c = i;
    }

    @Override // defpackage.fti
    public final fue a(akex akexVar) {
        if (this.c == 0) {
            akfi akfiVar = (akfi) akexVar;
            if (akfiVar == null) {
                return null;
            }
            if (akfiVar instanceof fvl) {
                return (fvl) akfiVar;
            }
            fvg d = fvl.d();
            d.k(akfiVar.j());
            d.m(akfiVar.i(), akfiVar.g());
            d.i(akfiVar.f());
            d.b = akfiVar.h();
            return d.b();
        }
        akff akffVar = (akff) akexVar;
        if (akffVar != null) {
            return akffVar;
        }
        return null;
    }
}
