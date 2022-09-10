package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zgf  reason: default package */
/* loaded from: classes7.dex */
public class zgf extends bruj {
    private final Activity e;
    private final dxio<qbt> f;
    private final bmom g;
    private final brsc h;
    private final jba i;
    private final brrx j;

    public zgf(Activity activity, dxio<qbt> dxioVar, bmom bmomVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = dxioVar;
        this.g = bmomVar;
        this.h = brscVar;
        this.i = jbaVar;
        this.j = brrxVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        ilo r = r();
        this.g.a(ckgo.i, r);
        if (this.i.V().booleanValue()) {
            this.i.G();
        } else if (r != null) {
            this.f.a().Q(r);
        }
        this.h.c(this.j.b(), 11);
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        String g = this.i.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.ADD_STOP);
        }
        return this.e.getString(R.string.ACCESSIBILITY_ADD_STOP_LONG, new Object[]{g});
    }

    @Override // defpackage.bruj
    public String c() {
        return this.e.getString(R.string.ADD_STOP);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && r.j) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bruj, defpackage.brvb
    public Boolean e() {
        boolean z = false;
        if (super.e().booleanValue() && this.j.g() != brrw.CATEGORICAL_SEARCH_LIST) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(this.j.g() == brrw.CATEGORICAL_SEARCH_LIST ? 2131231581 : 2131232494, ibm.x());
    }
}
