package defpackage;

import android.animation.Animator;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import com.google.android.apps.gmm.streetview.model.UserOrientation;
import com.google.android.apps.maps.R;
import com.google.geo.imagery.viewer.api.IconHandle;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwtr  reason: default package */
/* loaded from: classes4.dex */
public class bwtr extends ges implements aueo, bwzo, bwzp {
    public static final /* synthetic */ int aT = 0;
    @dzsi
    protected View a;
    @dzsi
    protected View aA;
    @dzsi
    public bwty aB;
    @dzsi
    public bwsm aC;
    @dzsi
    public ams aO;
    @dzsi
    amub aP;
    public UserOrientation aQ;
    public float aR;
    public deaf aS;
    @dzsi
    private View aU;
    @dzsi
    private bwzi aV;
    @dzsi
    private dwfl aW;
    private boolean aX;
    private boolean aY;
    private long aZ;
    public cqkj ad;
    public bwqv ae;
    public ckcw af;
    public efg ag;
    public btrm ah;
    public bvrb ai;
    public bxdo aj;
    public cjyb ak;
    public dxio<auen> al;
    public cpv am;
    public dxio<befw> an;
    public cjqq ao;
    public bwsn ap;
    public bxaf aq;
    public bwtz ar;
    public acwo as;
    public cqat at;
    public bwzj au;
    public czkm<bxal> av;
    public begg aw;
    public Executor ax;
    @dzsi
    protected bxbs ay;
    @dzsi
    protected FrameLayout az;
    @dzsi
    protected bwsq b;
    private long ba;
    private final dfqt bb;
    private final View.OnClickListener bc;
    private final View.OnClickListener bd;
    private final izb be;
    private final bwtl bf;
    @dzsi
    protected View c;
    @dzsi
    public ListView d;
    @dzsi
    protected bxdn e;
    public btvo f;
    public eeu g;

    static {
        NativeHelper.a();
    }

    public bwtr() {
        UserOrientation userOrientation = new UserOrientation();
        this.aQ = userOrientation;
        this.aR = userOrientation.b;
        this.aS = deaf.UNKNOWN_ACTION;
        this.aZ = 0L;
        this.ba = 0L;
        this.bb = new bwtg(this);
        this.bc = new bwth(this);
        this.bd = new bwti(this);
        this.be = new bwtk(this);
        this.bf = new bwtl(this);
    }

    private static dhjx aV(dhjx dhjxVar, dhjz dhjzVar, boolean z) {
        float degrees;
        dhjz dhjzVar2 = dhjxVar.b;
        if (dhjzVar2 == null) {
            dhjzVar2 = dhjz.e;
        }
        double e = akqo.e(akqq.j(dhjzVar2), akqq.j(dhjzVar));
        dhjz dhjzVar3 = dhjxVar.b;
        if (dhjzVar3 == null) {
            dhjzVar3 = dhjz.e;
        }
        float e2 = dfug.e(akqo.h(akqq.j(dhjzVar3), akqq.j(dhjzVar)));
        if (z) {
            dhkb dhkbVar = dhjxVar.c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            degrees = dhkbVar.c;
        } else {
            double d = dhjzVar.d;
            dhjz dhjzVar4 = dhjxVar.b;
            if (dhjzVar4 == null) {
                dhjzVar4 = dhjz.e;
            }
            degrees = (((float) Math.toDegrees(Math.atan2(d - dhjzVar4.d, e))) - (dhjxVar.e / 6.0f)) + 90.0f;
        }
        dsqp dsqpVar = (dsqp) dhjxVar.cu(5);
        dsqpVar.bC(dhjxVar);
        dhjw dhjwVar = (dhjw) dsqpVar;
        dhkb dhkbVar2 = dhjxVar.c;
        if (dhkbVar2 == null) {
            dhkbVar2 = dhkb.e;
        }
        dsqp dsqpVar2 = (dsqp) dhkbVar2.cu(5);
        dsqpVar2.bC(dhkbVar2);
        dhka dhkaVar = (dhka) dsqpVar2;
        if (dhkaVar.c) {
            dhkaVar.bF();
            dhkaVar.c = false;
        }
        dhkb dhkbVar3 = (dhkb) dhkaVar.b;
        int i = dhkbVar3.a | 1;
        dhkbVar3.a = i;
        dhkbVar3.b = e2;
        dhkbVar3.a = i | 2;
        dhkbVar3.c = degrees;
        if (dhjwVar.c) {
            dhjwVar.bF();
            dhjwVar.c = false;
        }
        dhjx dhjxVar2 = (dhjx) dhjwVar.b;
        dhkb bK = dhkaVar.bK();
        bK.getClass();
        dhjxVar2.c = bK;
        dhjxVar2.a |= 2;
        return dhjwVar.bK();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        bwsm bwsmVar = this.aC;
        if (bwsmVar != null) {
            for (bwvi bwviVar : bwsmVar.a.values()) {
                bwviVar.e();
            }
            bwsmVar.a.clear();
            this.aC = null;
        }
        bxbs bxbsVar = this.ay;
        if (bxbsVar != null) {
            od.c(bxbsVar, new ne());
            this.ay.setCameraListener(null);
            this.ay.setFrameListener(null);
            this.ay.setOnGestureListener(null);
            bxbs bxbsVar2 = this.ay;
            bxbsVar2.g(bxbsVar2.m);
            this.ay = null;
        }
        bwty bwtyVar = this.aB;
        if (bwtyVar != null) {
            bwtyVar.A = null;
        }
        this.aO = null;
        super.Qe();
    }

    @Override // defpackage.bwzo
    public final void aJ(@dzsi dggg dgggVar, @dzsi UserOrientation userOrientation) {
        bxbs bxbsVar = this.ay;
        if (dgggVar == null || bxbsVar == null) {
            return;
        }
        bxbsVar.j(dgggVar, userOrientation, null);
    }

    @Override // defpackage.bwzp
    public final void aR(@dzsi dggg dgggVar, @dzsi akqq akqqVar, @dzsi ilo iloVar) {
        bxdn bxdnVar;
        boolean z;
        akqq akqqVar2;
        bxbs bxbsVar = this.ay;
        if (bxbsVar == null || dgggVar == null || akqqVar == null || (bxdnVar = this.e) == null) {
            return;
        }
        if (iloVar != null) {
            z = bxdnVar.p(bwrs.a(iloVar));
            akqqVar2 = akqqVar;
        } else {
            bxdnVar.p(null);
            z = false;
            akqqVar2 = null;
        }
        if (!z || iloVar.i) {
            bxdn bxdnVar2 = this.e;
            dbsk.s(bxdnVar2);
            bxdnVar2.U(akqqVar);
            bxbsVar.j(dgggVar, null, akqqVar2 == null ? null : akqqVar2.i());
            return;
        }
        bxdn bxdnVar3 = this.e;
        dbsk.s(bxdnVar3);
        bxdnVar3.T();
    }

    public void aS(dwgl dwglVar) {
        bwsq bwsqVar;
        bwtr bwtrVar;
        bxdn bxdnVar;
        View view;
        bxdn bxdnVar2;
        bxbs bxbsVar;
        Iterator<dlwo> it;
        dlvo dlvoVar;
        dlvo next;
        double d;
        boolean z;
        bwrs<ilo> bwrsVar;
        bwrs<ilo> bwrsVar2;
        bwsq bwsqVar2;
        bxdn bxdnVar3 = this.e;
        if (bxdnVar3 == null) {
            return;
        }
        if (bxdnVar3.g().a().booleanValue()) {
            View view2 = this.c;
            if (view2 != null && (bwsqVar2 = this.b) != null) {
                if (!bwsqVar2.e) {
                    view2.setVisibility(4);
                }
                bwsqVar2.a.add(view2);
                bwsqVar2.c();
            }
        } else {
            View view3 = this.c;
            if (view3 != null && (bwsqVar = this.b) != null) {
                bwsqVar.b.add(view3);
                bwsqVar.c();
            }
        }
        bwsm bwsmVar = this.aC;
        bxbs bxbsVar2 = this.ay;
        if (dwglVar.b.isEmpty() || bwsmVar == null) {
            bwtrVar = this;
            bxdnVar = bxdnVar3;
        } else {
            dwfl dwflVar = dwglVar.b.get(0);
            dizh dizhVar = dwflVar.p;
            if (dizhVar == null) {
                dizhVar = dizh.j;
            }
            if ((dizhVar.a & 1) != 0) {
                dggg dgggVar = dizhVar.b;
                if (dgggVar == null) {
                    dgggVar = dggg.d;
                }
                bwsmVar.n = dgggVar;
            }
            dlwo dlwoVar = null;
            dlwo dlwoVar2 = null;
            for (dlwo dlwoVar3 : dizhVar.f) {
                dlws dlwsVar = dlwoVar3.b;
                if (dlwsVar == null) {
                    dlwsVar = dlws.c;
                }
                int a = dlwr.a(dlwsVar.b);
                if (a != 0 && a == 2) {
                    dlwoVar = dlwoVar3;
                }
                dlws dlwsVar2 = dlwoVar3.b;
                if (dlwsVar2 == null) {
                    dlwsVar2 = dlws.c;
                }
                int a2 = dlwr.a(dlwsVar2.b);
                if (a2 != 0 && a2 == 3) {
                    dlwoVar2 = dlwoVar3;
                }
            }
            dbsk.t(dlwoVar, "No global channel found in photo metadata.");
            dhjy bZ = dhjz.e.bZ();
            dlwi dlwiVar = dlwoVar.c;
            if (dlwiVar == null) {
                dlwiVar = dlwi.f;
            }
            dpum dpumVar = dlwiVar.b;
            if (dpumVar == null) {
                dpumVar = dpum.d;
            }
            double d2 = dpumVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar = (dhjz) bZ.b;
            dhjzVar.a |= 2;
            dhjzVar.c = d2;
            dlwi dlwiVar2 = dlwoVar.c;
            if (dlwiVar2 == null) {
                dlwiVar2 = dlwi.f;
            }
            dpum dpumVar2 = dlwiVar2.b;
            if (dpumVar2 == null) {
                dpumVar2 = dpum.d;
            }
            double d3 = dpumVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar2 = (dhjz) bZ.b;
            dhjzVar2.a |= 1;
            dhjzVar2.b = d3;
            dlwi dlwiVar3 = dlwoVar.c;
            if (dlwiVar3 == null) {
                dlwiVar3 = dlwi.f;
            }
            dlwe dlweVar = dlwiVar3.c;
            if (dlweVar == null) {
                dlweVar = dlwe.c;
            }
            double d4 = dlweVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhjz dhjzVar3 = (dhjz) bZ.b;
            dhjzVar3.a |= 4;
            dhjzVar3.d = d4;
            if (dlwoVar2 != null) {
                dlwi dlwiVar4 = dlwoVar2.c;
                if (dlwiVar4 == null) {
                    dlwiVar4 = dlwi.f;
                }
                dpum dpumVar3 = dlwiVar4.b;
                if (dpumVar3 == null) {
                    dpumVar3 = dpum.d;
                }
                if ((dpumVar3.a & 1) != 0) {
                    dlwi dlwiVar5 = dlwoVar2.c;
                    if (dlwiVar5 == null) {
                        dlwiVar5 = dlwi.f;
                    }
                    dpum dpumVar4 = dlwiVar5.b;
                    if (dpumVar4 == null) {
                        dpumVar4 = dpum.d;
                    }
                    if ((dpumVar4.a & 2) != 0) {
                        dlwi dlwiVar6 = dlwoVar2.c;
                        if (dlwiVar6 == null) {
                            dlwiVar6 = dlwi.f;
                        }
                        dpum dpumVar5 = dlwiVar6.b;
                        if (dpumVar5 == null) {
                            dpumVar5 = dpum.d;
                        }
                        double d5 = dpumVar5.b;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dhjz dhjzVar4 = (dhjz) bZ.b;
                        dhjzVar4.a |= 2;
                        dhjzVar4.c = d5;
                        dlwi dlwiVar7 = dlwoVar2.c;
                        if (dlwiVar7 == null) {
                            dlwiVar7 = dlwi.f;
                        }
                        dpum dpumVar6 = dlwiVar7.b;
                        if (dpumVar6 == null) {
                            dpumVar6 = dpum.d;
                        }
                        double d6 = dpumVar6.c;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dhjz dhjzVar5 = (dhjz) bZ.b;
                        dhjzVar5.a |= 1;
                        dhjzVar5.b = d6;
                    }
                }
                dlwi dlwiVar8 = dlwoVar2.c;
                if (dlwiVar8 == null) {
                    dlwiVar8 = dlwi.f;
                }
                dlwe dlweVar2 = dlwiVar8.c;
                if (dlweVar2 == null) {
                    dlweVar2 = dlwe.c;
                }
                if ((dlweVar2.a & 1) != 0) {
                    dlwi dlwiVar9 = dlwoVar2.c;
                    if (dlwiVar9 == null) {
                        dlwiVar9 = dlwi.f;
                    }
                    dlwe dlweVar3 = dlwiVar9.c;
                    if (dlweVar3 == null) {
                        dlweVar3 = dlwe.c;
                    }
                    double d7 = dlweVar3.b;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dhjz dhjzVar6 = (dhjz) bZ.b;
                    dhjzVar6.a |= 4;
                    dhjzVar6.d = d7;
                }
            }
            dhjw bZ2 = dhjx.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjx dhjxVar = (dhjx) bZ2.b;
            dhjz bK = bZ.bK();
            bK.getClass();
            dhjxVar.b = bK;
            dhjxVar.a |= 1;
            dhka bZ3 = dhkb.e.bZ();
            dlwi dlwiVar10 = dlwoVar.c;
            if (dlwiVar10 == null) {
                dlwiVar10 = dlwi.f;
            }
            dhkb dhkbVar = dlwiVar10.d;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            float f = dhkbVar.b;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhkb dhkbVar2 = (dhkb) bZ3.b;
            dhkbVar2.a |= 1;
            dhkbVar2.b = f;
            dlwi dlwiVar11 = dlwoVar.c;
            if (dlwiVar11 == null) {
                dlwiVar11 = dlwi.f;
            }
            dhkb dhkbVar3 = dlwiVar11.d;
            if (dhkbVar3 == null) {
                dhkbVar3 = dhkb.e;
            }
            float f2 = dhkbVar3.c;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhkb dhkbVar4 = (dhkb) bZ3.b;
            dhkbVar4.a |= 2;
            dhkbVar4.c = f2;
            dlwi dlwiVar12 = dlwoVar.c;
            if (dlwiVar12 == null) {
                dlwiVar12 = dlwi.f;
            }
            dhkb dhkbVar5 = dlwiVar12.d;
            if (dhkbVar5 == null) {
                dhkbVar5 = dhkb.e;
            }
            float f3 = dhkbVar5.d;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dhkb dhkbVar6 = (dhkb) bZ3.b;
            dhkbVar6.a |= 4;
            dhkbVar6.d = f3;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dhjx dhjxVar2 = (dhjx) bZ2.b;
            dhkb bK2 = bZ3.bK();
            bK2.getClass();
            dhjxVar2.c = bK2;
            dhjxVar2.a |= 2;
            dhjx bK3 = bZ2.bK();
            dhjz dhjzVar7 = bK3.b;
            if (dhjzVar7 == null) {
                dhjzVar7 = dhjz.e;
            }
            bwsmVar.l = dhjzVar7;
            bwrs<ilo> bwrsVar3 = bwsmVar.m;
            if (bwrsVar3 != null && bwrsVar3.c() != null) {
                dizh dizhVar2 = dwflVar.p;
                if (dizhVar2 == null) {
                    dizhVar2 = dizh.j;
                }
                dggg dgggVar2 = dizhVar2.b;
                if (dgggVar2 == null) {
                    dgggVar2 = dggg.d;
                }
                dgge b = dgge.b(dgggVar2.b);
                if (b == null) {
                    b = dgge.IMAGE_UNKNOWN;
                }
                dgge dggeVar = dgge.IMAGE_ALLEYCAT;
                int a3 = dplj.a(dwflVar.e);
                if (a3 == 0) {
                    a3 = 1;
                }
                if (b == dggeVar && a3 != 2) {
                    ilo c = bwrsVar3.c();
                    dbsk.s(c);
                    dpsn i = c.ai().i();
                    ilo c2 = bwrsVar3.c();
                    if (c2 == null) {
                        bwrsVar = null;
                        bwsmVar.m = bwrsVar;
                    } else {
                        akqq aj = c2.aj();
                        if (aj != null) {
                            dwyy bZ4 = dwyz.b.bZ();
                            bZ4.a(akra.f(aj).U());
                            dhjz dhjzVar8 = bwsmVar.l;
                            double d8 = dhjzVar8 != null ? dhjzVar8.d : 0.0d;
                            if (dhjzVar8 != null) {
                                bwrsVar2 = bwrsVar3;
                                bZ4.a(akra.e(dhjzVar8.c, dhjzVar8.b).U());
                            } else {
                                bwrsVar2 = bwrsVar3;
                            }
                            bwsmVar.o.b(bZ4.bK(), new bwsj(bwsmVar, d8, i, bwrsVar2), bwsmVar.d);
                            bwrsVar = null;
                            bwsmVar.m = bwrsVar;
                        }
                    }
                }
                bwrsVar = null;
                bwsmVar.m = bwrsVar;
            }
            HashSet hashSet = new HashSet();
            Iterator<dlwo> it2 = dizhVar.f.iterator();
            while (it2.hasNext()) {
                Iterator<dlvu> it3 = it2.next().i.iterator();
                while (it3.hasNext()) {
                    dlvu next2 = it3.next();
                    dlvt dlvtVar = next2.a;
                    if (dlvtVar == null) {
                        dlvtVar = dlvt.c;
                    }
                    if ((dlvtVar.a & 1) != 0) {
                        dlvr dlvrVar = next2.b;
                        if (dlvrVar == null) {
                            dlvrVar = dlvr.c;
                        }
                        if (dlvrVar.a.size() <= 0) {
                            if (dlvrVar.b.size() > 0) {
                                Iterator<dlvo> it4 = dlvrVar.b.get(0).a.iterator();
                                bxdn bxdnVar4 = bxdnVar3;
                                double d9 = 0.0d;
                                double d10 = 0.0d;
                                double d11 = 0.0d;
                                double d12 = 0.0d;
                                double d13 = Double.MAX_VALUE;
                                double d14 = 1.0d;
                                double d15 = 1.0d;
                                double d16 = 1.0d;
                                while (it4.hasNext()) {
                                    double d17 = it4.next().b;
                                    Double.isNaN(d17);
                                    Iterator<dlvo> it5 = it4;
                                    double d18 = (d17 + 0.5d) % 1.0d;
                                    d14 = Math.min(d14, d17);
                                    d9 = Math.max(d9, d17);
                                    d15 = Math.min(d15, d18);
                                    d10 = Math.max(d10, d18);
                                    d16 = Math.min(d16, next.c);
                                    d11 = Math.max(d11, next.c);
                                    d13 = Math.min(d13, next.d);
                                    d12 = Math.max(d12, next.d);
                                    it4 = it5;
                                    bxdnVar4 = bxdnVar4;
                                    bxbsVar2 = bxbsVar2;
                                    it2 = it2;
                                }
                                bxbsVar = bxbsVar2;
                                it = it2;
                                bxdnVar2 = bxdnVar4;
                                double d19 = d14;
                                double d20 = d15;
                                double d21 = d16;
                                dlvn bZ5 = dlvo.e.bZ();
                                if (d9 - d19 > d10 - d20) {
                                    float f4 = ((float) (((d20 + d10) / 2.0d) + 0.5d)) % 1.0f;
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dlvo dlvoVar2 = (dlvo) bZ5.b;
                                    dlvoVar2.a |= 1;
                                    dlvoVar2.b = f4;
                                } else {
                                    float f5 = ((float) (d19 + d9)) / 2.0f;
                                    if (bZ5.c) {
                                        bZ5.bF();
                                        bZ5.c = false;
                                    }
                                    dlvo dlvoVar3 = (dlvo) bZ5.b;
                                    dlvoVar3.a |= 1;
                                    dlvoVar3.b = f5;
                                }
                                dlvo dlvoVar4 = (dlvo) bZ5.b;
                                int i2 = dlvoVar4.a | 2;
                                dlvoVar4.a = i2;
                                dlvoVar4.c = (float) (((d21 + d21) + d11) / 3.0d);
                                if (d12 > dcyn.a) {
                                    dlvoVar4.a = i2 | 4;
                                    dlvoVar4.d = ((float) (d13 + d12)) / 2.0f;
                                }
                                dlvoVar = bZ5.bK();
                            } else {
                                bxdnVar2 = bxdnVar3;
                                bxbsVar = bxbsVar2;
                                it = it2;
                                dlvoVar = null;
                            }
                        } else {
                            dlvoVar = dlvrVar.a.get(0);
                            bxdnVar2 = bxdnVar3;
                            bxbsVar = bxbsVar2;
                            it = it2;
                        }
                        if (dlvoVar != null) {
                            dlvt dlvtVar2 = next2.a;
                            if (dlvtVar2 == null) {
                                dlvtVar2 = dlvt.c;
                            }
                            dpsn dpsnVar = dlvtVar2.b;
                            if (dpsnVar == null) {
                                dpsnVar = dpsn.d;
                            }
                            hashSet.add(dpsnVar);
                            double d22 = (dlvoVar.a & 4) != 0 ? dlvoVar.d : 10.0d;
                            float f6 = dlvoVar.b;
                            double d23 = dlvoVar.c;
                            Double.isNaN(d23);
                            double d24 = 1.5707963267948966d - (1.5707963267948966d - (d23 * 3.141592653589793d));
                            double sin = Math.sin(d24);
                            double cos = Math.cos(d24);
                            Double.isNaN(f6 + f6);
                            double d25 = 1.5707963267948966d - ((d * 3.141592653589793d) - 3.141592653589793d);
                            dzsm dzsmVar = new dzsm(d22 * sin * Math.cos(d25), d22 * cos, (-d22) * sin * Math.sin(d25));
                            dhjz dhjzVar9 = bK3.b;
                            if (dhjzVar9 == null) {
                                dhjzVar9 = dhjz.e;
                            }
                            dhkb dhkbVar7 = bK3.c;
                            if (dhkbVar7 == null) {
                                dhkbVar7 = dhkb.e;
                            }
                            dzsk b2 = bwsp.b(dhjzVar9, dhkbVar7);
                            dzsk dzskVar = new dzsk();
                            double d26 = b2.a;
                            dzskVar.a = d26;
                            double d27 = b2.b;
                            dzskVar.b = d27;
                            double d28 = b2.c;
                            dzskVar.c = d28;
                            HashSet hashSet2 = hashSet;
                            Iterator<dlvu> it6 = it3;
                            double d29 = b2.d;
                            dzskVar.d = d29;
                            dpsn dpsnVar2 = dpsnVar;
                            double d30 = b2.e;
                            dzskVar.e = d30;
                            bwsm bwsmVar2 = bwsmVar;
                            dhjx dhjxVar3 = bK3;
                            double d31 = b2.f;
                            dzskVar.f = d31;
                            double d32 = b2.g;
                            dzskVar.g = d32;
                            double d33 = b2.h;
                            dzskVar.h = d33;
                            double d34 = b2.i;
                            dzskVar.i = d34;
                            double d35 = b2.j;
                            dzskVar.j = d35;
                            double d36 = b2.k;
                            dzskVar.k = d36;
                            double d37 = b2.l;
                            dzskVar.l = d37;
                            double d38 = b2.m;
                            dzskVar.m = d38;
                            double d39 = b2.n;
                            dzskVar.n = d39;
                            double d40 = b2.o;
                            dzskVar.o = d40;
                            double d41 = b2.p;
                            dzskVar.p = d41;
                            double d42 = d26 * d31;
                            double d43 = d27 * d30;
                            double d44 = d42 - d43;
                            double d45 = d36 * d41;
                            double d46 = d37 * d40;
                            double d47 = d45 - d46;
                            double d48 = d26 * d32;
                            double d49 = d28 * d30;
                            double d50 = d48 - d49;
                            double d51 = d35 * d41;
                            double d52 = d37 * d39;
                            double d53 = d51 - d52;
                            double d54 = d26 * d33;
                            double d55 = d29 * d30;
                            double d56 = d54 - d55;
                            double d57 = d35 * d40;
                            double d58 = d36 * d39;
                            double d59 = d57 - d58;
                            double d60 = d27 * d32;
                            double d61 = d28 * d31;
                            double d62 = d60 - d61;
                            double d63 = d34 * d41;
                            double d64 = d37 * d38;
                            double d65 = d63 - d64;
                            double d66 = d27 * d33;
                            double d67 = d29 * d31;
                            double d68 = d66 - d67;
                            double d69 = d34 * d40;
                            double d70 = d36 * d38;
                            double d71 = d69 - d70;
                            double d72 = d28 * d33;
                            double d73 = d29 * d32;
                            double d74 = d72 - d73;
                            double d75 = d34 * d39;
                            double d76 = d35 * d38;
                            double d77 = d75 - d76;
                            double d78 = (((((d44 * d47) - (d50 * d53)) + (d56 * d59)) + (d62 * d65)) - (d68 * d71)) + (d74 * d77);
                            if (d78 != dcyn.a) {
                                double d79 = 1.0d / d78;
                                double d80 = d28 * d41;
                                double d81 = d29 * d40;
                                double d82 = d29 * d39;
                                double d83 = d27 * d41;
                                double d84 = d27 * d40;
                                double d85 = d28 * d39;
                                double d86 = d33 * d36;
                                double d87 = d32 * d37;
                                double d88 = d31 * d37;
                                double d89 = d33 * d35;
                                double d90 = d32 * d35;
                                double d91 = d31 * d36;
                                double d92 = d26 * d41;
                                double d93 = d29 * d38;
                                double d94 = d28 * d38;
                                double d95 = d26 * d40;
                                double d96 = d33 * d34;
                                double d97 = d30 * d37;
                                double d98 = d30 * d36;
                                double d99 = d32 * d34;
                                double d100 = d26 * d39;
                                double d101 = d27 * d38;
                                double d102 = d31 * d34;
                                double d103 = d30 * d35;
                                dzskVar.b((d47 * d31) + (d32 * (d52 - d51)) + (d33 * d59), ((d80 - d81) * d35) + ((d82 - d83) * d36) + ((d84 - d85) * d37), (d39 * d74) + (d40 * (d67 - d66)) + (d62 * d41), ((d86 - d87) * d27) + ((d88 - d89) * d28) + ((d90 - d91) * d29), (d32 * d65) + (d33 * (d70 - d69)) + ((d46 - d45) * d30), ((d92 - d93) * d36) + ((d94 - d95) * d37) + (d34 * (d81 - d80)), (d56 * d40) + ((d49 - d48) * d41) + (d38 * (d73 - d72)), ((d96 - d97) * d28) + ((d98 - d99) * d29) + ((d87 - d86) * d26), (d33 * d77) + (d53 * d30) + ((d64 - d63) * d31), ((d100 - d101) * d37) + (d34 * (d83 - d82)) + (d35 * (d93 - d92)), (d41 * d44) + (d38 * d68) + (d39 * (d55 - d54)), ((d102 - d103) * d29) + ((d89 - d88) * d26) + ((d97 - d96) * d27), (d30 * (d58 - d57)) + (d31 * d71) + (d32 * (d76 - d75)), (d34 * (d85 - d84)) + (d35 * (d95 - d94)) + (d36 * (d101 - d100)), (d38 * (d61 - d60)) + (d39 * d50) + (d40 * (d43 - d42)), (d26 * (d91 - d90)) + (d27 * (d99 - d98)) + (d28 * (d103 - d102)));
                                dzskVar.a *= d79;
                                dzskVar.b *= d79;
                                dzskVar.c *= d79;
                                dzskVar.d *= d79;
                                dzskVar.e *= d79;
                                dzskVar.f *= d79;
                                dzskVar.g *= d79;
                                dzskVar.h *= d79;
                                dzskVar.i *= d79;
                                dzskVar.j *= d79;
                                dzskVar.k *= d79;
                                dzskVar.l *= d79;
                                dzskVar.m *= d79;
                                dzskVar.n *= d79;
                                dzskVar.o *= d79;
                                dzskVar.p *= d79;
                            }
                            dzsm dzsmVar2 = new dzsm();
                            double d104 = dzskVar.a;
                            double d105 = dzsmVar.a;
                            double d106 = dzskVar.b;
                            double d107 = dzsmVar.b;
                            double d108 = dzskVar.c;
                            double d109 = dzsmVar.c;
                            double d110 = dzskVar.d;
                            double d111 = dzskVar.e;
                            double d112 = dzskVar.f;
                            double d113 = dzskVar.g;
                            double d114 = dzskVar.h;
                            double d115 = dzskVar.i;
                            double d116 = dzskVar.j;
                            double d117 = dzskVar.k;
                            double d118 = dzskVar.l;
                            dzsmVar2.a = (d104 * d105) + (d106 * d107) + (d108 * d109) + d110;
                            dzsmVar2.b = (d111 * d105) + (d112 * d107) + (d113 * d109) + d114;
                            dzsmVar2.c = (d115 * d105) + (d116 * d107) + (d117 * d109) + d118;
                            double atan2 = Math.atan2(dzsmVar2.b, dzsmVar2.a);
                            double atan22 = Math.atan2(dzsmVar2.c, Math.hypot(dzsmVar2.a, dzsmVar2.b));
                            dhjy bZ6 = dhjz.e.bZ();
                            double degrees = Math.toDegrees(atan22);
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            dhjz dhjzVar10 = (dhjz) bZ6.b;
                            dhjzVar10.a |= 2;
                            dhjzVar10.c = degrees;
                            double degrees2 = Math.toDegrees(atan2);
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            dhjz dhjzVar11 = (dhjz) bZ6.b;
                            dhjzVar11.a |= 1;
                            dhjzVar11.b = degrees2;
                            double d119 = dzsmVar2.a;
                            double d120 = dzsmVar2.b;
                            double d121 = dzsmVar2.c;
                            double sqrt = Math.sqrt(((d119 * d119) + (d120 * d120)) + (d121 * d121)) - 6371010.0d;
                            if (bZ6.c) {
                                bZ6.bF();
                                bZ6.c = false;
                            }
                            dhjz dhjzVar12 = (dhjz) bZ6.b;
                            dhjzVar12.a |= 4;
                            dhjzVar12.d = sqrt;
                            dhjz bK4 = bZ6.bK();
                            bwvi bwviVar = bwsmVar2.a.get(dpsnVar2);
                            if (bwviVar == null) {
                                Application application = bwsmVar2.b;
                                String str = next2.c;
                                String str2 = next2.d;
                                dftz dftzVar = bwsmVar2.g;
                                alap b3 = alap.b(str, akra.f(new akqq(bK4.c, bK4.b)), akqi.j(dpsnVar2), dbpy.a);
                                ily ilyVar = new ily();
                                ilyVar.i(b3);
                                ilyVar.f = false;
                                ilyVar.u = "";
                                ilyVar.D();
                                ilyVar.C(b3.j);
                                ilyVar.j = true;
                                bwvi bwviVar2 = new bwvi(application, bwrs.a(ilyVar.d()), bK4, str2, dftzVar, true);
                                bwsmVar2.a.put(dpsnVar2, bwviVar2);
                                bwviVar = bwviVar2;
                                z = true;
                            } else {
                                dftz dftzVar2 = bwviVar.c;
                                if (dftzVar2 != null && !dftzVar2.c()) {
                                    IconHandle iconHandle = bwviVar.d;
                                    dbsk.t(iconHandle, "This icon has been deleted");
                                    dfsp bZ7 = dfss.k.bZ();
                                    double d122 = bK4.c;
                                    if (bZ7.c) {
                                        bZ7.bF();
                                        bZ7.c = false;
                                    }
                                    dfss dfssVar = (dfss) bZ7.b;
                                    int i3 = dfssVar.a | 1;
                                    dfssVar.a = i3;
                                    dfssVar.b = d122;
                                    double d123 = bK4.b;
                                    int i4 = i3 | 2;
                                    dfssVar.a = i4;
                                    dfssVar.c = d123;
                                    double d124 = bK4.d;
                                    dfssVar.a = i4 | 4;
                                    dfssVar.d = d124;
                                    dftzVar2.b(iconHandle, bZ7.bK());
                                    bwviVar.g = bK4;
                                }
                                String str3 = next2.d;
                                dftz dftzVar3 = bwviVar.c;
                                if (dftzVar3 != null && !dftzVar3.c()) {
                                    IconHandle iconHandle2 = bwviVar.d;
                                    dbsk.t(iconHandle2, "This icon has been deleted");
                                    dfsp bZ8 = dfss.k.bZ();
                                    if (bZ8.c) {
                                        bZ8.bF();
                                        bZ8.c = false;
                                    }
                                    dfss dfssVar2 = (dfss) bZ8.b;
                                    str3.getClass();
                                    dfssVar2.a |= 16;
                                    dfssVar2.e = str3;
                                    dftzVar3.b(iconHandle2, bZ8.bK());
                                }
                                z = true;
                            }
                            bwviVar.h = z;
                            bK3 = dhjxVar3;
                            dhjz dhjzVar13 = bK3.b;
                            if (dhjzVar13 == null) {
                                dhjzVar13 = dhjz.e;
                            }
                            bwviVar.a(bwsm.a(dhjzVar13, bK4));
                            ilo c3 = bwviVar.b.c();
                            if (c3 != null) {
                                bwviVar.e = bwzj.d(bwsmVar2.h, dtyb.dV, bwsmVar2.n, c3.ai());
                                bwviVar.f = dtyb.dV;
                            }
                            bwsmVar = bwsmVar2;
                            hashSet = hashSet2;
                            it3 = it6;
                        }
                        bxdnVar3 = bxdnVar2;
                        bxbsVar2 = bxbsVar;
                        it2 = it;
                    }
                }
            }
            bxdnVar = bxdnVar3;
            bwsm bwsmVar3 = bwsmVar;
            bxbs bxbsVar3 = bxbsVar2;
            HashSet hashSet3 = hashSet;
            HashSet<dpsn> hashSet4 = new HashSet();
            dpsn dpsnVar3 = null;
            for (Map.Entry<dpsn, bwvi> entry : bwsmVar3.a.entrySet()) {
                HashSet hashSet5 = hashSet3;
                if (!hashSet5.contains(entry.getKey())) {
                    if (entry.getValue() == bwsmVar3.k) {
                        dbsk.m(dpsnVar3 == null, "There should be at most one selected icon!");
                        dpsnVar3 = entry.getKey();
                    } else {
                        hashSet4.add(entry.getKey());
                    }
                }
                hashSet3 = hashSet5;
            }
            if (dpsnVar3 != null) {
                dhjz dhjzVar14 = bK3.b;
                if (dhjzVar14 == null) {
                    dhjzVar14 = dhjz.e;
                }
                bwvi bwviVar3 = bwsmVar3.k;
                dbsk.s(bwviVar3);
                if (bwviVar3.h || akqo.e(akqq.j(dhjzVar14), akqq.j(bwviVar3.g)) >= 50.0d) {
                    bwsmVar3.b();
                    bwvi remove = bwsmVar3.a.remove(dpsnVar3);
                    dbsk.s(remove);
                    remove.e();
                } else {
                    bwviVar3.a(bwsm.a(dhjzVar14, bwviVar3.g));
                }
            }
            for (dpsn dpsnVar4 : hashSet4) {
                bwvi remove2 = bwsmVar3.a.remove(dpsnVar4);
                dbsk.s(remove2);
                remove2.e();
            }
            bwvi bwviVar4 = bwsmVar3.k;
            bwtrVar = this;
            if (bwtrVar.aY && bwviVar4 != null && bwviVar4.h && bxbsVar3 != null) {
                bxbsVar3.k(aV(bxbsVar3.l(), bwviVar4.g, false), 0L);
            }
        }
        bxdnVar.ac();
        if (bwtrVar.aD && (view = bwtrVar.a) != null) {
            cjyb cjybVar = bwtrVar.ak;
            bwte bwteVar = new bwte(bwtrVar, bxdnVar);
            bvrj.UI_THREAD.c();
            cjxv cjxvVar = new cjxv(view, cjybVar, bwteVar);
            cjxx cjxxVar = (cjxx) view.getTag(R.id.view_update_action);
            if (cjxxVar == null) {
                cjybVar.a(cjxvVar);
            } else {
                cjybVar.d(cjxxVar, cjxvVar);
            }
            view.setTag(R.id.view_update_action, cjxvVar);
        }
        bwtrVar.aY = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aT(dhjz dhjzVar, boolean z) {
        bxbs bxbsVar = this.ay;
        if (bxbsVar == null || q()) {
            return;
        }
        dhjx l = bxbsVar.l();
        if ((l.a & 1) == 0) {
            return;
        }
        Animator k = bxbsVar.k(aV(l, dhjzVar, z), 350L);
        if (k != null) {
            k.addListener(new bwtf(this));
        }
        bxbsVar.b();
    }

    @Override // defpackage.bwzp
    public final void aU() {
        bxdn bxdnVar = this.e;
        if (bxdnVar != null) {
            bxdnVar.s();
        }
    }

    @Override // defpackage.fd
    public View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        double d;
        double d2;
        TextView textView;
        bwty bwtyVar;
        bxdn bxdnVar = this.e;
        dbsk.s(bxdnVar);
        Context context = layoutInflater.getContext();
        this.aV = new bwzi(this.af);
        bwtm bwtmVar = new bwtm(this);
        final bxbs bxbsVar = new bxbs(context);
        bxbsVar.setOnGestureListener(bwtmVar);
        dggg dgggVar = bxdnVar.X() != null ? bxdnVar.X().a : null;
        akra M = bxdnVar.M();
        UserOrientation userOrientation = this.aQ;
        dhjy bZ = dhjz.e.bZ();
        if (M == null) {
            d = dcyn.a;
        } else {
            double i = M.i();
            Double.isNaN(i);
            d = i / 1000000.0d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar = (dhjz) bZ.b;
        dhjzVar.a |= 2;
        dhjzVar.c = d;
        if (M == null) {
            d2 = dcyn.a;
        } else {
            double m = M.m();
            Double.isNaN(m);
            d2 = m / 1000000.0d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhjz dhjzVar2 = (dhjz) bZ.b;
        dhjzVar2.a |= 1;
        dhjzVar2.b = d2;
        bxbsVar.j(dgggVar, userOrientation, bZ.bK());
        bxbsVar.setCameraListener(new dfro(this, bxbsVar) { // from class: bwsy
            private final bwtr a;
            private final bxbs b;

            {
                this.a = this;
                this.b = bxbsVar;
            }

            @Override // defpackage.dfro
            public final void a(dhjx dhjxVar) {
                ams amsVar;
                bwtr bwtrVar = this.a;
                if (this.b.y && (amsVar = bwtrVar.aO) != null) {
                    amsVar.n();
                }
                bwtrVar.aQ = new UserOrientation(dhjxVar);
            }
        });
        bxbsVar.setFrameListener(new Runnable(this) { // from class: bwsz
            private final bwtr a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwty bwtyVar2;
                bwtr bwtrVar = this.a;
                bxbs bxbsVar2 = bwtrVar.ay;
                if (bxbsVar2 == null || (bwtyVar2 = bwtrVar.aB) == null) {
                    return;
                }
                dhkb dhkbVar = bxbsVar2.l().c;
                if (dhkbVar == null) {
                    dhkbVar = dhkb.e;
                }
                if (bwtyVar2.h.x().booleanValue()) {
                    bwud bwudVar = bwtyVar2.c;
                    float f = dhkbVar.b;
                    synchronized (bwudVar) {
                        double d3 = f;
                        if (bwudVar.d != d3) {
                            bwudVar.d = d3;
                            akti aktiVar = bwudVar.a;
                            if (aktiVar != null) {
                                aktiVar.c(bwudVar.i);
                            }
                        }
                    }
                }
                bwtyVar2.r = dhkbVar;
            }
        });
        bwsn bwsnVar = this.ap;
        bwta bwtaVar = new bwta(bxbsVar);
        dftz dftzVar = bxbsVar.j.c;
        bwtb bwtbVar = new bwtb(this);
        cjqp f = this.ao.f(bxbsVar);
        Application a = bwsnVar.a.a();
        bwsn.a(a, 1);
        bunk a2 = bwsnVar.b.a();
        bwsn.a(a2, 2);
        btvo a3 = bwsnVar.c.a();
        bwsn.a(a3, 3);
        Executor a4 = bwsnVar.d.a();
        bwsn.a(a4, 4);
        bwzj a5 = bwsnVar.e.a();
        dggg dgggVar2 = dgggVar;
        bwsn.a(a5, 5);
        dxio a6 = ((dxjh) bwsnVar.f).a();
        bwsn.a(a6, 6);
        bwsn.a(bxdnVar, 7);
        bwsn.a(bwtaVar, 8);
        bwsn.a(dftzVar, 9);
        bwsn.a(bwtbVar, 10);
        bwsn.a(f, 11);
        bwsm bwsmVar = new bwsm(a, a2, a3, a4, a5, a6, bxdnVar, bwtaVar, dftzVar, bwtbVar, f);
        bwsmVar.i.D(new bwsi(bwsmVar));
        this.aC = bwsmVar;
        if (((AccessibilityManager) H().getSystemService("accessibility")).isEnabled()) {
            bwsk bwskVar = new bwsk(bwsmVar, bxbsVar, bxbsVar.o);
            this.aO = bwskVar;
            if (bwskVar != null) {
                od.c(bxbsVar, bwskVar);
            }
        }
        this.ay = bxbsVar;
        bxbsVar.setContentDescription(context.getString(R.string.STREET_VIEW));
        bwzj bwzjVar = this.au;
        cjqg.h(bxbsVar, bwzj.c(dtyb.dU, dgggVar2, this.e.Y() == null ? null : this.e.Y().ai()).a());
        bwzjVar.b.c(bxbsVar);
        cqkf c = this.ad.c(new bwyz(), null);
        View c2 = c.c();
        this.aU = c2;
        c2.setOnTouchListener(new bwtn());
        dbsk.s(c2);
        this.az = (FrameLayout) cqhu.a(c2, bwyz.f);
        View a7 = cqhu.a(c2, bwyz.k);
        this.aA = a7;
        dbsk.s(a7);
        this.a = cqhu.a(c2, bwyz.c);
        this.c = cqhu.a(c2, bwyz.d);
        this.d = (ListView) cqkx.e(c2, bwyz.e, ListView.class);
        bxdnVar.R(this);
        c.e(bxdnVar);
        bxdnVar.p(bxdnVar.Z());
        if (this.aX && (bwtyVar = this.aB) != null) {
            View view = this.aA;
            bwtyVar.n = this.ao.f(bxbsVar);
            bwtyVar.o = view;
            akqq akqqVar = bwtyVar.s;
            if (akqqVar != null) {
                bwtyVar.a(akqqVar, true);
            }
            bwty bwtyVar2 = this.aB;
            bwtyVar2.A = this.bf;
            amub amubVar = this.aP;
            if (amubVar != null && bwtyVar2.m != null) {
                amuh d3 = amuh.d(amubVar);
                qbo qboVar = bwtyVar2.m;
                vut I = vuv.I();
                I.A(d3);
                I.o(d3.k().ag());
                I.H(albo.a);
                I.E(true);
                I.F(false);
                I.x(false);
                I.v(false);
                I.Q(alfa.SHOW_NONE);
                I.D(false);
                qboVar.e(I.O());
            }
        }
        View view2 = this.a;
        if (view2 != null && (textView = (TextView) cqkx.e(view2, isf.c, TextView.class)) != null) {
            textView.setTextColor(cqfp.o(ibl.b(), textView));
        }
        return c2;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        super.am();
        bxdn bxdnVar = this.e;
        if (bxdnVar != null) {
            bxdnVar.S();
        }
        this.aq.a();
        bwzx.c(K()).d();
        if (this.ba >= this.f.getImageryViewerParameters().h) {
            this.as.i(dvum.STREETVIEW_SESSION, null);
        }
    }

    @Override // defpackage.aueo
    public final Uri bI() {
        bxdn bxdnVar = this.e;
        return bxdnVar == null ? new Uri.Builder().build() : bxdnVar.ah();
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.STREETVIEW;
    }

    public final void g(deaf deafVar) {
        cjtd k;
        ddho ddhoVar;
        akqi akqiVar;
        if (deafVar == this.aS) {
            return;
        }
        this.aS = deafVar;
        bxbs bxbsVar = this.ay;
        if (bxbsVar == null) {
            return;
        }
        bwzj bwzjVar = this.au;
        cjql e = cjqg.e(bxbsVar);
        if (e == null || (k = cjqg.k(bxbsVar)) == null || (ddhoVar = k.g) == null) {
            return;
        }
        ddet k2 = k.k();
        dggg dgggVar = null;
        if (k2 != null) {
            ddcy ddcyVar = k2.k;
            if (ddcyVar == null) {
                ddcyVar = ddcy.d;
            }
            dggf bZ = dggg.d.bZ();
            String str = ddcyVar.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dggg dgggVar2 = (dggg) bZ.b;
            str.getClass();
            dgggVar2.a |= 2;
            dgggVar2.c = str;
            dgggVar = bZ.bK();
            ddep ddepVar = k2.c;
            if (ddepVar == null) {
                ddepVar = ddep.f;
            }
            dtbk dtbkVar = ddepVar.b;
            if (dtbkVar == null) {
                dtbkVar = dtbk.d;
            }
            long j = dtbkVar.b;
            ddep ddepVar2 = k2.c;
            if (ddepVar2 == null) {
                ddepVar2 = ddep.f;
            }
            dtbk dtbkVar2 = ddepVar2.b;
            if (dtbkVar2 == null) {
                dtbkVar2 = dtbk.d;
            }
            akqiVar = new akqi(j, dtbkVar2.c);
        } else {
            akqiVar = null;
        }
        bwzjVar.a.n(e, new cjte(deafVar), bwzj.b(ddhoVar, dgggVar, akqiVar));
    }

    @Override // defpackage.bwzo
    public final boolean i() {
        bxbs bxbsVar = this.ay;
        return bxbsVar != null && bxbsVar.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [bwrs] */
    /* JADX WARN: Type inference failed for: r23v1, types: [bwrs] */
    /* JADX WARN: Type inference failed for: r37v0, types: [bwrs] */
    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        akra akraVar;
        dggg dgggVar;
        boolean z;
        boolean z2;
        dggg dgggVar2;
        akra akraVar2;
        super.l(bundle);
        Bundle bundle2 = bundle == null ? this.o : bundle;
        this.aY = true;
        akra akraVar3 = null;
        if (bundle2 != null) {
            String string = bundle2.getString("panoId");
            int i = bundle2.getInt("panoFrontend");
            if (string == null || i == 0) {
                dgggVar2 = null;
            } else {
                dggf bZ = dggg.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dggg dgggVar3 = (dggg) bZ.b;
                string.getClass();
                dgggVar3.a |= 2;
                dgggVar3.c = string;
                dgge b = dgge.b(i);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dggg dgggVar4 = (dggg) bZ.b;
                dgggVar4.b = b.l;
                dgggVar4.a |= 1;
                dgggVar2 = bZ.bK();
            }
            if (bundle2.containsKey("routeDescription")) {
                Serializable serializable = bundle2.getSerializable("routeDescription");
                if (serializable instanceof amte) {
                    this.aP = ((amte) serializable).a(H()).get(0);
                }
            }
            boolean z3 = bundle2.containsKey("addressChip") ? bundle2.getBoolean("addressChip") : true;
            if (bundle2.containsKey("latLng")) {
                dwzq dwzqVar = (dwzq) bvrs.f(bundle2, "latLng", (dssr) dwzq.d.cu(7));
                dbsk.s(dwzqVar);
                akraVar2 = akra.c(dwzqVar.b, dwzqVar.c);
            } else {
                akraVar2 = null;
            }
            UserOrientation userOrientation = (UserOrientation) bundle2.getParcelable("userOrientation");
            float f = bundle2.getFloat("initialYaw", 0.0f);
            if (userOrientation == null && f != 0.0f) {
                userOrientation = new UserOrientation();
                userOrientation.a(f);
            }
            if (userOrientation != null) {
                this.aQ = userOrientation;
            }
            this.aW = (dwfl) bvrs.b(bundle2.getByteArray("photoDescription"), (dssr) dwfl.w.cu(7));
            try {
                akraVar3 = this.ae.e(ilo.class, bundle2, "placemark");
            } catch (IOException e) {
                bvoo.f(new IllegalStateException(e));
            }
            this.aY = bundle2.getBoolean("moveCameraToSelectedPlace", true);
            akraVar = akraVar3;
            dgggVar = dgggVar2;
            z = z3;
            akraVar3 = akraVar2;
        } else {
            akraVar = null;
            dgggVar = null;
            z = true;
        }
        boolean z4 = this.f.getImageryViewerParameters().g;
        this.aX = z4;
        this.aR = this.aQ.b;
        bxdo bxdoVar = this.aj;
        View.OnClickListener onClickListener = this.bc;
        View.OnClickListener onClickListener2 = this.bd;
        izb izbVar = this.be;
        dwfl dwflVar = this.aW;
        gga a = bxdoVar.a.a();
        bxdo.a(a, 1);
        ahkg a2 = bxdoVar.b.a();
        bxdo.a(a2, 2);
        btvo a3 = bxdoVar.c.a();
        bxdo.a(a3, 3);
        dzsj<bwft> dzsjVar = bxdoVar.d;
        dxio a4 = ((dxjh) bxdoVar.e).a();
        bxdo.a(a4, 5);
        dxio a5 = ((dxjh) bxdoVar.f).a();
        bxdo.a(a5, 6);
        cafi a6 = bxdoVar.g.a();
        bxdo.a(a6, 7);
        cqhn a7 = bxdoVar.h.a();
        bxdo.a(a7, 8);
        bwqv a8 = bxdoVar.i.a();
        bxdo.a(a8, 9);
        dxio a9 = ((dxjh) bxdoVar.j).a();
        bxdo.a(a9, 10);
        bvjj a10 = bxdoVar.k.a();
        bxdo.a(a10, 11);
        btrm a11 = bxdoVar.l.a();
        bxdo.a(a11, 12);
        brvv a12 = bxdoVar.m.a();
        bxdo.a(a12, 13);
        brwl a13 = bxdoVar.n.a();
        bxdo.a(a13, 14);
        bnjv a14 = bxdoVar.o.a();
        bxdo.a(a14, 15);
        bxaf a15 = bxdoVar.p.a();
        bxdo.a(a15, 16);
        bxdo.a(bxdoVar.q.a(), 17);
        Executor a16 = bxdoVar.r.a();
        bxdo.a(a16, 18);
        hwe a17 = bxdoVar.s.a();
        bxdo.a(a17, 19);
        bxdo.a(onClickListener2, 25);
        bxdn bxdnVar = new bxdn(a, a2, a3, dzsjVar, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, dgggVar, akraVar3, z, null, onClickListener, onClickListener2, izbVar, dwflVar, akraVar, z4);
        this.e = bxdnVar;
        if (this.aX) {
            bwtz bwtzVar = this.ar;
            akto a18 = bwtzVar.a.a();
            bwtz.a(a18, 1);
            Executor a19 = bwtzVar.b.a();
            bwtz.a(a19, 2);
            btrm a20 = bwtzVar.c.a();
            bwtz.a(a20, 3);
            bwsh a21 = bwtzVar.d.a();
            bwtz.a(a21, 4);
            alhv a22 = bwtzVar.e.a();
            bwtz.a(a22, 5);
            akox a23 = bwtzVar.f.a();
            bwtz.a(a23, 6);
            befw a24 = bwtzVar.g.a();
            bwtz.a(a24, 7);
            cjqy a25 = bwtzVar.h.a();
            bwtz.a(a25, 8);
            akzh a26 = bwtzVar.i.a();
            bwtz.a(a26, 9);
            abal a27 = bwtzVar.j.a();
            bwtz.a(a27, 10);
            bwuy a28 = bwtzVar.k.a();
            ?? r23 = akraVar;
            bwtz.a(a28, 11);
            dzsj<qbt> dzsjVar2 = bwtzVar.l;
            bwtz.a(bxdnVar, 13);
            bwty bwtyVar = new bwty(a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, dzsjVar2, bxdnVar);
            this.aB = bwtyVar;
            this.e.P(bwtyVar);
            if (akraVar3 != null) {
                z2 = true;
                this.aB.a(akraVar3.S(), true);
            } else {
                z2 = true;
            }
            if (r23 != 0 && r23.c() != null) {
                return;
            }
            bwty bwtyVar2 = this.aB;
            dbsk.s(bwtyVar2);
            bwtyVar2.d(z2);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        bwty bwtyVar = this.aB;
        if (bwtyVar != null) {
            if (bwtyVar.p) {
                bwtyVar.d(true);
            }
            akqq akqqVar = bwtyVar.q;
            if (akqqVar == null || bwtyVar.o == null) {
                return;
            }
            bwtyVar.e(akqqVar, configuration.orientation, 1200, bwtyVar.o);
        }
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onLowMemory() {
        bxbs bxbsVar = this.ay;
        if (bxbsVar != null) {
            bxbsVar.g(new bxbp(bxbsVar));
        }
    }

    @Override // defpackage.ges
    public ddho p() {
        return dtyb.eg;
    }

    @Override // defpackage.bwzo
    public final boolean q() {
        bxbs bxbsVar = this.ay;
        return bxbsVar != null && bxbsVar.y;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.aZ = this.at.e();
        bxbs bxbsVar = this.ay;
        if (bxbsVar != null) {
            bxbsVar.c();
            this.ay.setPageLoggingContext(bd().f());
            this.ay.setActionListener(this.bb);
        }
        bxdn bxdnVar = this.e;
        if (bxdnVar != null) {
            bxdnVar.R(this);
            this.e.N();
        }
        if (this.aV == null) {
            this.aV = new bwzi(this.af);
        }
        if (((ViewGroup) this.aU) == null) {
            return;
        }
        if (this.aX) {
            efg efgVar = this.ag;
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.F(null);
            egjVar.w(this.P);
            egjVar.k(false);
            egjVar.y(true);
            egjVar.z(new aljk());
            egjVar.f(false);
            egjVar.x(egr.d);
            egjVar.e(this);
            egf a = egf.a();
            a.o();
            a.g = false;
            a.m = false;
            a.x = false;
            a.C = false;
            a.l = new afwn[]{afwn.e(afwm.COVID19, false), afwn.e(afwm.TRAFFIC, false), afwn.e(afwm.TRANSIT, false), afwn.e(afwm.STREETVIEW, true)};
            a.n = false;
            a.l(false);
            egjVar.A(a);
            egjVar.J(new bwtd(this));
            efgVar.a(egjVar.a());
        } else {
            efg efgVar2 = this.ag;
            egj egjVar2 = new egj(this);
            egjVar2.ag(null);
            egjVar2.w(this.P);
            egjVar2.f(false);
            egjVar2.x(egr.a);
            egjVar2.e(this);
            egjVar2.J(new bwtp(this));
            efgVar2.a(egjVar2.a());
        }
        View view = this.a;
        if (view != null) {
            this.b = new bwsq(this, dchl.b(view));
        }
        btrm btrmVar = this.ah;
        dceq a2 = dcet.a();
        a2.b(dwgl.class, new bwts(dwgl.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a2.a());
        this.al.a().e(this);
        this.an.a().a();
        bwty bwtyVar = this.aB;
        if (bwtyVar != null) {
            btrm btrmVar2 = bwtyVar.e;
            dceq a3 = dcet.a();
            a3.b(alhw.class, new bwub(0, alhw.class, bwtyVar, bvrj.UI_THREAD));
            a3.b(alhl.class, new bwub(1, alhl.class, bwtyVar, bvrj.UI_THREAD));
            a3.b(alhx.class, new bwub(2, alhx.class, bwtyVar, bvrj.UI_THREAD));
            a3.b(alhk.class, new bwub(3, alhk.class, bwtyVar, bvrj.UI_THREAD));
            a3.b(alho.class, new bwub(4, alho.class, bwtyVar, bvrj.UI_THREAD));
            btrmVar2.g(bwtyVar, a3.a());
            bwtyVar.g.b(bwtyVar.z);
            bwtyVar.x = bwtyVar.B.i();
            bwtyVar.B.f(false);
            bxbs bxbsVar2 = this.ay;
            if (bxbsVar2 != null) {
                bwty bwtyVar2 = this.aB;
                dhjz dhjzVar = bxbsVar2.l().b;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                akqq j = akqq.j(dhjzVar);
                akqq S = (j == null ? akra.c(0, 0) : akra.f(j)).S();
                bxbs bxbsVar3 = this.ay;
                dbsk.s(bxbsVar3);
                dhkb dhkbVar = bxbsVar3.l().c;
                if (dhkbVar == null) {
                    dhkbVar = dhkb.e;
                }
                if (S.a != dcyn.a || S.b != dcyn.a) {
                    if (bwtyVar2.h.x().booleanValue()) {
                        bwtyVar2.c.a(S, dhkbVar, bwtyVar2.i, true);
                    }
                    View view2 = bwtyVar2.o;
                    if (view2 != null) {
                        int i = view2.getResources().getConfiguration().orientation;
                        View view3 = bwtyVar2.o;
                        dbsk.s(view3);
                        bwtyVar2.e(S, i, 0, view3);
                    }
                    bwtyVar2.s = S;
                    bwtyVar2.r = dhkbVar;
                }
            }
        }
        deha.q(this.av.b(), new bwto(this), this.ax);
    }

    @Override // defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        akra c;
        super.t(bundle);
        bxbs bxbsVar = this.ay;
        dggg h = bxbsVar != null ? bxbsVar.h() : null;
        if (h == null) {
            bundle.putAll(this.o);
            return;
        }
        bundle.putString("panoId", h.c);
        dgge b = dgge.b(h.b);
        if (b == null) {
            b = dgge.IMAGE_UNKNOWN;
        }
        bundle.putInt("panoFrontend", b.l);
        bxdn bxdnVar = this.e;
        if (bxdnVar != null) {
            bundle.putString("address", bxdnVar.q());
            bundle.putBoolean("addressChip", bxdnVar.r().booleanValue());
        }
        if (bxdnVar != null && bxdnVar.Z() != null) {
            this.ae.c(bundle, "placemark", bxdnVar.Z());
        }
        bxbs bxbsVar2 = this.ay;
        if (bxbsVar2 == null) {
            c = akra.c(0, 0);
        } else {
            dhjz dhjzVar = bxbsVar2.l().b;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqq j = akqq.j(dhjzVar);
            c = j == null ? akra.c(0, 0) : akra.f(j);
        }
        if (c != null) {
            bvrs.k(bundle, "latLng", c.U());
        }
        bundle.putParcelable("userOrientation", this.aQ);
        bundle.putBoolean("moveCameraToSelectedPlace", this.aY);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        View view = this.a;
        if (view != null) {
            this.ak.b(view);
        }
        bxbs bxbsVar = this.ay;
        if (bxbsVar != null) {
            bxbsVar.d();
            this.ay.setPageLoggingContext(null);
            this.ay.setActionListener(null);
        }
        bxdn bxdnVar = this.e;
        if (bxdnVar != null) {
            bxdnVar.O();
        }
        bwty bwtyVar = this.aB;
        if (bwtyVar != null) {
            bwtyVar.e.a(bwtyVar);
            bwud bwudVar = bwtyVar.c;
            akti aktiVar = bwudVar.a;
            if (aktiVar != null) {
                aktiVar.d();
                bwudVar.a.j();
                bwudVar.a = null;
            }
            bwtyVar.g.c(bwtyVar.z);
            bwtyVar.t = false;
            bwtyVar.u = false;
            bwtyVar.v = false;
            bwtyVar.B.f(bwtyVar.x);
        }
        this.ah.a(this);
        this.al.a().f(this);
        this.an.a().b();
        if (this.aZ > 0) {
            long e = this.at.e() - this.aZ;
            if (e > 0) {
                this.ba += e;
            }
        }
        super.u();
    }

    @Override // defpackage.bwzo
    public final UserOrientation w() {
        return this.aQ;
    }

    @Override // defpackage.ges
    public void Oo(View view) {
        String Rq;
        bxdn bxdnVar = this.e;
        String q = bxdnVar == null ? "" : bxdnVar.q();
        if (dbsj.d(q)) {
            Rq = Rp(R.string.STREET_VIEW);
        } else {
            Rq = Rq(R.string.ACCESSIBILITY_FRAGMENT_TRANSITION_STREETVIEW, q);
        }
        this.am.f(view, Rq);
    }
}
