package defpackage;
/* compiled from: PG */
/* renamed from: atlq  reason: default package */
/* loaded from: classes2.dex */
public class atlq extends astc {
    public static final dcqe l = dcqe.c("atlq");
    @dzsi
    public final crqf m;
    public final boolean n;
    @dzsi
    public final amuo o;
    public final boolean p;
    @dzsi
    public final ilo q;
    @dzsi
    public final amte r;
    public final boolean s;
    public final int t;
    public final boolean u;
    public final boolean v;
    @dzsi
    public final crmw w;

    public atlq(atlo atloVar) {
        super(atloVar);
        this.m = atloVar.l;
        this.n = atloVar.m;
        this.o = atloVar.n;
        this.p = atloVar.o;
        this.q = atloVar.p;
        this.r = atloVar.q;
        this.s = atloVar.s;
        this.t = atloVar.t;
        this.u = atloVar.u;
        boolean z = atloVar.v;
        this.v = atloVar.w;
        this.w = atloVar.x;
    }

    @Override // defpackage.astc
    public final boolean b() {
        return this.m != null;
    }

    @Override // defpackage.astc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.astc
    @dzsi
    public final dqvj e() {
        crqf crqfVar = this.m;
        if (crqfVar == null) {
            return null;
        }
        return crqfVar.g().a.h;
    }

    public final String toString() {
        dbsb f = f();
        f.b("navState", this.m);
        f.h("useNightMode", this.n);
        f.b("headerStep", this.o);
        f.b("arrivedAtPlacemark", this.q);
        f.b("directionsStorageItem", this.r);
        f.h("showEnrouteFabTutorial", this.u);
        f.h("isOverviewMode", false);
        f.b("navigationDashboardStorageItem", this.w);
        return f.toString();
    }
}
