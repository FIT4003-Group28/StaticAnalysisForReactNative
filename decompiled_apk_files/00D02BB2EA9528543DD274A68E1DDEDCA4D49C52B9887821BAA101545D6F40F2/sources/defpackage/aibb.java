package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: aibb  reason: default package */
/* loaded from: classes2.dex */
public final class aibb implements ahvm {
    private static final dcqe a = dcqe.c("aibb");
    private final long b;
    private final aibu c;
    private final boolean d;
    private final aibj e;

    public aibb(long j, aibu aibuVar, aibj aibjVar, boolean z) {
        this.b = j;
        this.c = aibuVar;
        this.e = aibjVar;
        this.d = z;
    }

    @Override // defpackage.ahvm
    public final void a() {
        if (!this.d) {
            return;
        }
        bvrj.UI_THREAD.c();
        if (this.c.a()) {
            bvoo.h("This session is already starting!", new Object[0]);
            return;
        }
        this.e.a(this);
        this.c.c();
    }

    @Override // defpackage.ahvm
    public final boolean b() {
        return !this.d || this.c.a();
    }

    @Override // defpackage.ahvm
    public final void c(Collection<dqzx> collection) {
        d(collection, false);
    }

    public final dehn<List<dqzv>> d(Collection<dqzx> collection, boolean z) {
        dqyb dqybVar;
        dqya dqyaVar;
        String str;
        if (!this.d) {
            return deha.a(dcdc.e());
        }
        bvrj.UI_THREAD.c();
        if (this.c.a()) {
            bvoo.h("This session is already starting!", new Object[0]);
            return deha.a(dcdc.e());
        }
        this.e.a(this);
        final aibu aibuVar = this.c;
        if (aibuVar.f.a()) {
            return deha.a(dcdc.e());
        }
        GmmLocation f = aibuVar.g.f();
        doek i = aibuVar.g.i();
        dhrz bZ = dhsa.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsa dhsaVar = (dhsa) bZ.b;
        dsrj<dqzx> dsrjVar = dhsaVar.b;
        if (!dsrjVar.a()) {
            dhsaVar.b = dsqw.cl(dsrjVar);
        }
        dsod.bv(collection, dhsaVar.b);
        dbsk.s(i);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsa dhsaVar2 = (dhsa) bZ.b;
        i.getClass();
        dhsaVar2.c = i;
        dhsaVar2.a |= 1;
        dqyd d = aibuVar.d();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsa dhsaVar3 = (dhsa) bZ.b;
        d.getClass();
        dhsaVar3.d = d;
        dhsaVar3.a |= 2;
        boolean z2 = aibuVar.k.getLocationSharingParameters().b && z;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsa dhsaVar4 = (dhsa) bZ.b;
        dhsaVar4.a |= 16;
        dhsaVar4.f = z2;
        long b = aibuVar.b.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhsa dhsaVar5 = (dhsa) bZ.b;
        dhsaVar5.a |= 8;
        dhsaVar5.e = b;
        final deig d2 = deig.d();
        aibg aibgVar = aibuVar.d;
        final dehn a2 = aibg.a(aibgVar.a.h(), aibgVar.b, aibuVar.f.b, f).a(bZ.bK());
        aibi aibiVar = aibuVar.f;
        dccx F = dcdc.F();
        for (dqzx dqzxVar : collection) {
            int i2 = dqzxVar.a;
            if (i2 == 1) {
                str = ((dqyj) dqzxVar.b).d;
            } else {
                if (i2 == 2) {
                    dqybVar = (dqyb) dqzxVar.b;
                } else {
                    dqybVar = dqyb.j;
                }
                if (dqybVar.b == 6) {
                    dqyaVar = (dqya) dqybVar.c;
                } else {
                    dqyaVar = dqya.e;
                }
                str = dqyaVar.b;
            }
            F.g(str);
        }
        dcdc f2 = F.f();
        dbsk.l(!aibiVar.a());
        if (aibiVar.d != null) {
            bvoo.h("unexpected request", new Object[0]);
            aibiVar.c(ahvn.FAILED);
        } else {
            aibiVar.d = dcdc.r(f2);
            aibiVar.c.a();
            if (aibiVar.e != null) {
                aibiVar.c.b();
            }
        }
        a2.Pk(new Runnable(aibuVar, a2, d2) { // from class: aibp
            private final aibu a;
            private final dehn b;
            private final deig c;

            {
                this.a = aibuVar;
                this.b = a2;
                this.c = d2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dcdc<dqzv> e;
                String str2;
                ahvn ahvnVar;
                aibu aibuVar2 = this.a;
                dehn dehnVar = this.b;
                deig deigVar = this.c;
                dhsc dhscVar = (dhsc) deha.s(dehnVar);
                if (dhscVar == null || (dhscVar.a & 1) == 0) {
                    e = dcdc.e();
                    str2 = null;
                } else {
                    str2 = dhscVar.b;
                    e = dcdc.r(dhscVar.c);
                    eapd eapdVar = new eapd(aibuVar2.b.b());
                    int size = e.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        dqzv dqzvVar = e.get(i3);
                        dbsg<Profile> h = aiij.h(dqzvVar);
                        if (h.a()) {
                            aibuVar2.i.a(aiij.g(h.b(), eapdVar), dbsg.i(aibuVar2.f.b));
                        }
                        aibuVar2.h.a(new aihq(eapdVar, dqzvVar, false), dbsg.i(aibuVar2.f.b));
                        aibuVar2.j.s(dqzvVar, aibuVar2.f.b);
                    }
                }
                if (aibuVar2.f.a()) {
                    bvoo.h("Tried to assign journeyId to a finished share", new Object[0]);
                } else {
                    aibi aibiVar2 = aibuVar2.f;
                    dbsk.l(!aibiVar2.a());
                    if (aibiVar2.e != null) {
                        bvoo.h("unexpected journey", new Object[0]);
                        aibiVar2.c(ahvn.FAILED);
                    } else {
                        if (str2 == null) {
                            ahvnVar = aibiVar2.g;
                            if (ahvnVar == null) {
                                ahvnVar = ahvn.FAILED;
                            }
                        } else {
                            aibiVar2.e = str2;
                            aibiVar2.f = e;
                            ahvnVar = aibiVar2.g;
                            if (ahvnVar == null) {
                                if (aibiVar2.d != null) {
                                    aibiVar2.c.b();
                                }
                            }
                        }
                        aibiVar2.d(ahvnVar);
                    }
                }
                deigVar.j(e);
            }
        }, aibuVar.c.h());
        return d2;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("journeyShareRequestId", this.b);
        b.b("session", this.c);
        b.b("callback", this.e);
        b.h("journeySharingEnabled", this.d);
        return b.toString();
    }
}
