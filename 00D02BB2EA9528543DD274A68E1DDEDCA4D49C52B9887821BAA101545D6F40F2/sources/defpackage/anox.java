package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: anox  reason: default package */
/* loaded from: classes2.dex */
public class anox implements anow {
    private final gga a;
    private final anry b;
    private final Runnable c;
    private dbsg<dcdc<anop>> d = dbpy.a;

    public anox(gga ggaVar, anry anryVar, Runnable runnable) {
        this.a = ggaVar;
        this.b = anryVar;
        this.c = runnable;
    }

    @Override // defpackage.anow
    public dcdc<anop> a() {
        if (!this.d.a()) {
            anry anryVar = this.b;
            dccx F = dcdc.F();
            dcdc<dvay> G = anryVar.G();
            int size = G.size();
            for (int i = 0; i < size; i++) {
                F.g(new anoq(this, anryVar.ab(G.get(i))));
            }
            this.d = dbsg.i(F.f());
        }
        return this.d.b();
    }

    @Override // defpackage.anow
    public CharSequence b() {
        return this.a.getString(R.string.MAPS_ACTIVITY_ADD_PLACE_VISIT_IN, new Object[]{this.b.f()});
    }

    @Override // defpackage.anow
    public cqkl c() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.anow
    public cjtd d() {
        return this.b.R(dtyi.dd);
    }

    public void e(dvay dvayVar) {
        anry anryVar = this.b;
        anryVar.o.k(anryVar.g, dvayVar);
    }
}
