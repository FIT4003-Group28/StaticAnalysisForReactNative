package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: asjo  reason: default package */
/* loaded from: classes2.dex */
public final class asjo {
    public static final dcqe a = dcqe.c("asjo");
    public static final String b = String.valueOf(asjo.class.getName()).concat(".LoadingScreen");
    public static final String c = String.valueOf(asjo.class.getName()).concat(".SawRouteOptions");
    public static final String d = String.valueOf(asjo.class.getName()).concat(".Directions");
    public static final String e = String.valueOf(asjo.class.getName()).concat(".IsLikelyFamiliarTrip");
    public static final String f = String.valueOf(asjo.class.getName()).concat(".isMultimodalLeg");
    public static final String g = String.valueOf(asjo.class.getName()).concat(".launchShareAfterStartup");
    public static final String h = String.valueOf(asjo.class.getName()).concat(".popDirectionsOnNavExit");
    asjk i = asjk.WAIT_FOR_ON_CREATE;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    @dzsi
    qcx p;
    @dzsi
    crfo q;

    public static asjo b(vxa vxaVar, amte amteVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        asjo asjoVar = new asjo();
        asjoVar.a(vxaVar, amteVar, i, z);
        asjoVar.k = z2;
        asjoVar.l = false;
        asjoVar.m = z3;
        asjoVar.n = false;
        asjoVar.o = z4;
        if (amteVar != null && amteVar.j().b) {
            asjoVar.j = true;
        }
        return asjoVar;
    }

    public final void a(@dzsi vxa vxaVar, amte amteVar, int i, boolean z) {
        dqvj c2 = amteVar.c(i);
        if (vxaVar != null && c2 != null) {
            amtd amtdVar = new amtd(amteVar);
            amtdVar.d(vxaVar.d(amteVar.i(), c2, 3, vul.NAVIGATION_ONLY));
            amteVar = amtdVar.a();
        }
        qcx qcxVar = this.p;
        duqc z2 = qcxVar == null ? null : qcxVar.z();
        if (z2 == null) {
            z2 = duqc.f;
        }
        if (z2.b && c2 == dqvj.WALK) {
            amtd amtdVar2 = new amtd(amteVar);
            duqb ca = duqc.f.ca(amteVar.j());
            if (ca.c) {
                ca.bF();
                ca.c = false;
            }
            duqc.c((duqc) ca.b);
            amtdVar2.b(ca.bK());
            amteVar = amtdVar2.a();
        }
        this.p = null;
        crfn a2 = crfn.a(amteVar);
        a2.d = i;
        a2.h = z;
        this.q = a2.c();
    }
}
