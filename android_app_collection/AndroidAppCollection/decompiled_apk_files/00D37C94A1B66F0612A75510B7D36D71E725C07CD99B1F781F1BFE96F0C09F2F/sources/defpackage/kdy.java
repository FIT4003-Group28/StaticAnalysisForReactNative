package defpackage;
/* compiled from: PG */
/* renamed from: kdy  reason: default package */
/* loaded from: classes3.dex */
public final class kdy implements xfk {
    public final xif a;
    public final acti b;
    public final wzx c;
    public xia d;
    public kem e;
    public ken f;
    public xih h;
    public xib i;
    public xid j;
    public xig k;
    public boolean l;
    public final xhy g = new xhy();
    public boolean m = false;

    public kdy(xif xifVar, acti actiVar, wzx wzxVar) {
        this.a = xifVar;
        this.b = actiVar;
        this.c = wzxVar;
    }

    @Override // defpackage.xfk
    public final void nR(xig xigVar) {
        this.k = xigVar;
        this.a.f = xigVar;
        xid xidVar = this.j;
        if (xidVar != null) {
            xidVar.a = xigVar;
        }
    }

    @Override // defpackage.xfk
    public final void qV(xgu xguVar) {
        boolean q = xrz.q(xguVar, 2);
        this.d.e(xguVar.e, q);
        kem kemVar = this.e;
        xha xhaVar = xguVar.g;
        xgs xgsVar = xhaVar.a;
        if (!xgsVar.equals(kemVar.b.a)) {
            ken kenVar = kemVar.a;
            CharSequence charSequence = xgsVar.b;
            CharSequence charSequence2 = xgsVar.c;
            avhn avhnVar = xgsVar.d;
            if (avhnVar == null) {
                avhnVar = null;
            }
            kenVar.b(charSequence, charSequence2, avhnVar);
        }
        kemVar.b = xhaVar;
        this.g.e(Boolean.valueOf(q), xguVar.b);
        this.h.e(xguVar.c, q);
        this.i.e(xguVar.h, q);
        this.j.e(xguVar.i, q);
    }
}
