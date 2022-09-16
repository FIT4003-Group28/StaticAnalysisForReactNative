package defpackage;

import com.google.android.apps.youtube.app.watch.engagementpanel.size.EngagementPanelSizeBehavior;
/* compiled from: PG */
/* renamed from: nsj  reason: default package */
/* loaded from: classes3.dex */
public final class nsj {
    public final nsd a;
    public final EngagementPanelSizeBehavior b;
    public final nsk c;
    public final nsy d;
    public final nsv e;
    public final nsq f;
    public final nsn g;
    public final nrt h;
    public final nrk i;
    public final aynx j;
    public final aynx k;
    public final aynx l;
    public final aynx m;
    public int n;
    public nsr o;
    public boolean p;

    public nsj(final nsd nsdVar, EngagementPanelSizeBehavior engagementPanelSizeBehavior, nrl nrlVar, nsk nskVar, nsy nsyVar, nsv nsvVar, nsq nsqVar, nsn nsnVar, nrt nrtVar, ntt nttVar, nrk nrkVar, byte[] bArr) {
        this.a = nsdVar;
        this.b = engagementPanelSizeBehavior;
        this.c = nskVar;
        this.d = nsyVar;
        this.e = nsvVar;
        this.f = nsqVar;
        this.g = nsnVar;
        this.h = nrtVar;
        this.i = nrkVar;
        azpb ax = azpa.as(nsr.HIDDEN).ax();
        aynx h = ax.A().q(new nsi(this)).h(nps.f);
        this.j = h;
        aynx aynxVar = nttVar.b;
        final aynx C = aynxVar.C(nox.d);
        final aynx O = aynxVar.O(nox.e);
        final aynx n = aynx.sn(nskVar.c(), nskVar.d(), h, img.g).n();
        aynx h2 = h.O(new ayqe() { // from class: nsh
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                aynx aynxVar2 = aynx.this;
                aynx aynxVar3 = O;
                aynx aynxVar4 = n;
                nsr nsrVar = (nsr) obj;
                final aynx K = aynxVar3.U(aynxVar4, lum.m).K(0, lum.k);
                final aynx K2 = aynxVar3.U(aynxVar4, lum.m).K(0, lum.j);
                return aynx.e(aynxVar4, aynxVar2.O(new ayqe() { // from class: nsg
                    @Override // defpackage.ayqe
                    public final Object a(Object obj2) {
                        aynx aynxVar5 = aynx.this;
                        aynx aynxVar6 = K;
                        ntc ntcVar = ntc.NONE;
                        return ((ntc) obj2).ordinal() != 1 ? aynxVar6 : aynxVar5;
                    }
                }), lum.l);
            }
        }).n().h(nps.f);
        aynx h3 = nsvVar.d.V(h2, nskVar.d(), new ayqc() { // from class: nsf
            @Override // defpackage.ayqc
            public final Object a(Object obj, Object obj2, Object obj3) {
                aynx c;
                nsd nsdVar2 = nsd.this;
                nst nstVar = (nst) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                if (nstVar.b.h()) {
                    c = (aynx) nstVar.b.c();
                } else {
                    c = nsdVar2.c(intValue, nsj.a(nsdVar2.b.b().bottom, intValue2, nstVar.a), nsdVar2.e, nsdVar2.a(), nsd.a);
                }
                return c.C(nox.h).j(aynx.B(amon.a));
            }
        }).O(nox.g).h(nps.f);
        this.m = aynx.e(h3, h2, lum.i).n().q(new nsi(this, 1)).h(nps.f);
        h3.u(noc.d).U(nsvVar.d, lum.g).ad(ax);
        aynx h4 = aynx.e(h3, nrlVar.d(), lum.h).h(nps.f);
        this.k = h4;
        this.l = aynx.sn(nttVar.a, h4, h3.C(nox.f), img.h).n().h(nps.f);
    }

    public static int a(int i, int i2, nsr nsrVar) {
        if (nsrVar.equals(nsr.FULL_BLEED)) {
            return 0;
        }
        return nsrVar.equals(nsr.HIDDEN) ? i : i2;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = i + i2;
        return i5 + i3 < i4 ? i4 - i3 : i5;
    }
}
