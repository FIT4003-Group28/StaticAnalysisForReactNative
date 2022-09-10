package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zix  reason: default package */
/* loaded from: classes7.dex */
public class zix extends bruj {
    private final gga e;
    private final bmom f;
    private final brsc g;
    private final jba h;
    private final brrx i;
    private final dbsg<bnhz> j;
    private final btvo k;

    public zix(gga ggaVar, bmom bmomVar, brsc brscVar, btvo btvoVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = ggaVar;
        this.f = bmomVar;
        this.g = brscVar;
        this.k = btvoVar;
        this.h = jbaVar;
        this.i = brrxVar;
        this.j = brrxVar.f().a();
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.f.a(ckgo.i, r());
        if (!this.j.a() || this.h.V().booleanValue()) {
            this.h.G();
        } else {
            this.j.b().d(cjqmVar);
        }
        this.g.c(this.i.b(), 11);
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return this.h.F();
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.NAVIGATION);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return this.h.D();
    }

    @Override // defpackage.bruj, defpackage.brvb
    public Boolean e() {
        boolean booleanValue;
        if (this.i.g() == brrw.TRAVERSAL) {
            booleanValue = this.k.getCategoricalSearchParameters().m();
        } else {
            booleanValue = super.e().booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131231604, ibm.x());
    }

    @Override // defpackage.bruj, defpackage.brvb
    public Boolean g() {
        return true;
    }

    @Override // defpackage.bruj, defpackage.brvb
    public cqkl h(cjqm cjqmVar) {
        if (this.j.a()) {
            this.j.b().f(cjqmVar);
        }
        return cqkl.a;
    }
}
