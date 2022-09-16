package defpackage;
/* compiled from: PG */
/* renamed from: amll  reason: default package */
/* loaded from: classes.dex */
public final class amll extends amlo {
    @dzsi
    final alxo a;
    private final dmpd d;
    private final amkv e;
    @dzsi
    private final amfq f;
    private final amky g;
    private final boolean h;

    private amll(float f, float f2, amkv amkvVar, dmpd dmpdVar, alxo alxoVar, amky amkyVar, @dzsi amfq amfqVar, boolean z) {
        super(f, f2);
        this.d = dmpdVar;
        this.a = alxoVar;
        this.e = amkvVar;
        this.g = amkyVar;
        this.f = amfqVar;
        this.h = z;
    }

    @dzsi
    public static amll b(amkv amkvVar, dmpd dmpdVar, alxo alxoVar, amky amkyVar, @dzsi amfq amfqVar, boolean z) {
        if (e(alxoVar, z)) {
            bnvf f = amkvVar.f(dmpdVar, alxoVar, amkyVar, amfqVar);
            if (f == null || f.a() <= 0) {
                return null;
            }
            amll amllVar = new amll(f.a, f.b, amkvVar, dmpdVar, alxoVar, amkyVar, amfqVar, z);
            f.c();
            return amllVar;
        }
        bnve e = amkvVar.e(dmpdVar, alxoVar, amkyVar, amfqVar);
        if (e == null) {
            return null;
        }
        int i = e.d;
        float f2 = e.f;
        amll amllVar2 = new amll(i * f2, e.e * f2, amkvVar, dmpdVar, alxoVar, amkyVar, amfqVar, z);
        e.c();
        return amllVar2;
    }

    private static boolean e(@dzsi alxo alxoVar, boolean z) {
        dmlu dmluVar;
        return (!z || alxoVar == null || (dmluVar = alxoVar.z) == null || (dmluVar.a & 1) == 0) ? false : true;
    }

    @Override // defpackage.amlo
    @dzsi
    public final bnvf a() {
        if (e(this.a, this.h)) {
            return this.e.f(this.d, this.a, this.g, this.f);
        }
        bnve e = this.e.e(this.d, this.a, this.g, this.f);
        if (e == null) {
            return null;
        }
        return new bnvf(dcdc.f(e));
    }
}
