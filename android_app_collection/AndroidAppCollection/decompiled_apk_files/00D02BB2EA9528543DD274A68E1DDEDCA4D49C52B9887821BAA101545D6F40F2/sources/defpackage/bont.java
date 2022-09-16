package defpackage;

import com.google.android.apps.maps.R;
import defpackage.bxeq;
import defpackage.ges;
/* compiled from: PG */
/* renamed from: bont  reason: default package */
/* loaded from: classes3.dex */
public class bont<T extends ges & bxeq> implements boqc {
    private static final bxkn a = new bons();
    private final bowt b;
    private final T c;
    private final ddho d;
    private final boolean e;
    private final String f;
    private final bwqv g;
    private final String h;
    private final boolean i;

    public bont(T t, bowt bowtVar, ddho ddhoVar, boolean z, String str, boolean z2, bwqv bwqvVar) {
        this(t, bowtVar, ddhoVar, true, true, str, z2, bwqvVar);
    }

    @dzsi
    public dnfw RF() {
        return this.b.c();
    }

    @Override // defpackage.boqb
    public cqkl a() {
        bxla bxlaVar;
        if (!this.c.aD) {
            return cqkl.a;
        }
        bxko bxkoVar = new bxko();
        if (this.i) {
            bxlaVar = bxla.CATEGORY_WITH_PRIVATE_LABELS_SELECTOR;
        } else {
            bxlaVar = bxla.CATEGORY_SELECTOR;
        }
        bxkoVar.c(bxlaVar);
        bxkoVar.g(this.h);
        bxkoVar.e(this.e ? this.b.d() : "");
        bxkoVar.ac();
        bxkoVar.U();
        bxkoVar.s(false);
        bxkoVar.k = a;
        ((T) this.c).aZ(bxel.bt(this.g, bxkoVar, (T) this.c));
        return cqkl.a;
    }

    @Override // defpackage.boqc
    public cqkl b(dnfw dnfwVar) {
        if (dnfwVar != null) {
            this.b.c = bvrt.a(dnfwVar);
            bowt bowtVar = this.b;
            bowtVar.f = "";
            bowtVar.e(false);
            dnfw b = this.b.b();
            boolean z = true;
            if (b != null) {
                z = true ^ bowt.a(dnfwVar).equals(bowt.a(b));
            }
            this.b.d = Boolean.valueOf(z);
            cqkx.p(this);
        }
        return cqkl.a;
    }

    public void d(boolean z) {
        this.b.e(true);
    }

    public void e(String str) {
        this.b.f = str;
    }

    @Override // defpackage.boqm
    public cqtd f() {
        return cqrt.f(2131231599);
    }

    @Override // defpackage.boqm
    public String g() {
        return this.f;
    }

    @Override // defpackage.boqm
    public String h() {
        return this.h;
    }

    @Override // defpackage.boqm
    public String i() {
        if (this.b.d.booleanValue()) {
            return m();
        }
        return k();
    }

    @Override // defpackage.boqm
    public Boolean j() {
        throw null;
    }

    @Override // defpackage.boqm
    public String k() {
        dnfw dnfwVar = (dnfw) bvrt.f(this.b.b, (dssr) dnfw.d.cu(7), dnfw.d);
        return dnfwVar == null ? "" : dbsj.e(dnfwVar.c);
    }

    @Override // defpackage.boqm
    public Boolean l() {
        return Boolean.valueOf(!dbsj.d(m()));
    }

    @Override // defpackage.boqm
    public String m() {
        return this.b.d();
    }

    @Override // defpackage.boqm
    public Boolean n() {
        return this.b.d;
    }

    @Override // defpackage.boqm
    public cjtd o() {
        return cjtd.a(this.d);
    }

    @Override // defpackage.boqm
    public Boolean p() {
        return this.b.e;
    }

    @Override // defpackage.boqm
    public String q() {
        return this.b.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bont(T t, bowt bowtVar, ddho ddhoVar, boolean z, boolean z2, String str, boolean z3, bwqv bwqvVar) {
        this.c = t;
        this.b = bowtVar;
        this.d = ddhoVar;
        this.e = z;
        this.f = str;
        this.g = bwqvVar;
        this.h = t.Rp(R.string.AAP_SELECT_CATEGORY);
        this.i = z3;
    }
}
