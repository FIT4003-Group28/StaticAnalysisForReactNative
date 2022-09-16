package defpackage;
/* compiled from: PG */
/* renamed from: nsl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nsl implements ayqb {
    public final /* synthetic */ nsn a;
    private final /* synthetic */ int b;

    public /* synthetic */ nsl(nsn nsnVar, int i) {
        this.b = i;
        this.a = nsnVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        acti actiVar;
        acti actiVar2;
        if (this.b == 0) {
            nsn nsnVar = this.a;
            babp babpVar = (babp) obj;
            boolean booleanValue = ((Boolean) babpVar.a()).booleanValue();
            ntd ntdVar = (ntd) babpVar.b();
            nsr nsrVar = (nsr) babpVar.c();
            if (!booleanValue || (actiVar = (acti) nsnVar.d.a()) == null) {
                return;
            }
            nsr nsrVar2 = nsr.FULL_BLEED;
            ntd ntdVar2 = ntd.NO_FLING;
            int ordinal = ntdVar.ordinal();
            int i = 1;
            if (ordinal == 0) {
                i = 2049;
            } else if (ordinal == 1 || ordinal == 2) {
                i = 65;
            }
            actiVar.H(i, nsn.a, nsn.a(nsrVar));
            return;
        }
        nsn nsnVar2 = this.a;
        ampr amprVar = (ampr) obj;
        nsr nsrVar3 = (nsr) amprVar.a;
        if (!((Boolean) amprVar.b).booleanValue() || (actiVar2 = (acti) nsnVar2.d.a()) == null) {
            return;
        }
        actiVar2.w(nsn.a, nsn.a(nsrVar3));
        if (nsrVar3.equals(nsr.HIDDEN)) {
            actiVar2.q(nsn.a, nsn.a(nsrVar3));
        } else {
            actiVar2.u(nsn.a, nsn.a(nsrVar3));
        }
    }
}
