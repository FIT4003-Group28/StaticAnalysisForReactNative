package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: akok  reason: default package */
/* loaded from: classes2.dex */
public class akok implements akof {
    private final String a;
    private final String b;
    private final boolean c;
    private final List<akoe> d;
    private final aefv e;
    private final dxio<akpm> f;
    private final gll g;
    private final cjtd h;
    private final akqs i;

    public akok(Activity activity, dxio<akpm> dxioVar, gll gllVar, cqat cqatVar, MajorEvent majorEvent, aefv aefvVar) {
        int i;
        String string;
        dpoo bZ = dpop.d.bZ();
        diuv diuvVar = majorEvent.g().c;
        dsrj<diuu> dsrjVar = (diuvVar == null ? diuv.g : diuvVar).b;
        if (!dsrjVar.isEmpty()) {
            dpop dpopVar = dsrjVar.get(0).b;
            dpopVar = dpopVar == null ? dpop.d : dpopVar;
            long j = dpopVar.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dpop dpopVar2 = (dpop) bZ.b;
            int i2 = dpopVar2.a | 1;
            dpopVar2.a = i2;
            dpopVar2.b = j;
            long j2 = dpopVar.c;
            dpopVar2.a = i2 | 2;
            dpopVar2.c = j2;
            i = 0;
            for (diuu diuuVar : dsrjVar) {
                dpop dpopVar3 = diuuVar.b;
                dpopVar3 = dpopVar3 == null ? dpop.d : dpopVar3;
                if ((dpopVar3.a & 1) != 0) {
                    long j3 = dpopVar3.b;
                    if (j3 < ((dpop) bZ.b).b) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dpop dpopVar4 = (dpop) bZ.b;
                        dpopVar4.a |= 1;
                        dpopVar4.b = j3;
                    }
                }
                if ((dpopVar3.a & 2) != 0) {
                    long j4 = dpopVar3.c;
                    if (j4 > ((dpop) bZ.b).c) {
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dpop dpopVar5 = (dpop) bZ.b;
                        dpopVar5.a |= 2;
                        dpopVar5.c = j4;
                    }
                }
                i += diuuVar.d.size();
            }
        } else {
            i = 0;
        }
        boolean e = akoa.e(bZ.bK(), majorEvent);
        diuv diuvVar2 = majorEvent.g().c;
        dsrj<diuu> dsrjVar2 = (diuvVar2 == null ? diuv.g : diuvVar2).b;
        dccx F = dcdc.F();
        if (!dsrjVar2.isEmpty()) {
            for (diuu diuuVar2 : dsrjVar2) {
                F.g(new akoj(activity, majorEvent, diuuVar2, e));
            }
        }
        dcdc f = F.f();
        this.d = f;
        this.a = activity.getResources().getQuantityString(R.plurals.ROAD_CLOSURES_CARD_TITLE, i).trim();
        diuv diuvVar3 = majorEvent.g().c;
        if (((diuvVar3 == null ? diuv.g : diuvVar3).a & 8) == 0) {
            String d = akoa.d(majorEvent.e(), bZ.bK(), activity, false);
            dpop bK = bZ.bK();
            if (f.size() == 1) {
                string = activity.getResources().getString(R.string.ROAD_CLOSURES_CARD_DESCRIPTION_WITHOUT_TIME, akoa.a(bK, majorEvent, cqatVar, activity));
            } else if (akoa.e(bK, majorEvent)) {
                string = activity.getResources().getString(R.string.ROAD_CLOSURES_CARD_DESCRIPTION_WITH_DATE_IN_TIME, d);
            } else {
                string = activity.getResources().getString(R.string.ROAD_CLOSURES_CARD_DESCRIPTION_WITH_TIME, akoa.a(bK, majorEvent, cqatVar, activity), d);
            }
        } else {
            diuv diuvVar4 = majorEvent.g().c;
            string = (diuvVar4 == null ? diuv.g : diuvVar4).f;
        }
        this.b = string;
        if (majorEvent.j()) {
            this.i = majorEvent.k();
        } else {
            this.i = majorEvent.h() ? majorEvent.i() : null;
        }
        cjta b = cjtd.b();
        b.d = dtxo.ay;
        if (majorEvent.c()) {
            b.g(majorEvent.d());
        }
        this.h = b.a();
        diuv diuvVar5 = majorEvent.g().c;
        this.c = (diuvVar5 == null ? diuv.g : diuvVar5).e;
        this.e = aefvVar;
        this.f = dxioVar;
        this.g = gllVar;
    }

    @Override // defpackage.akof
    public String a() {
        return this.a;
    }

    @Override // defpackage.akof
    public String b() {
        return this.b;
    }

    @Override // defpackage.akof
    public List<akoe> c() {
        return this.d;
    }

    @Override // defpackage.akof
    public Boolean d() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.akof
    public cqkl e() {
        this.e.j();
        if (this.i != null) {
            this.f.a().p(akyt.o(this.i, this.g.b()));
        }
        return cqkl.a;
    }

    @Override // defpackage.akof
    public cjtd f() {
        return this.h;
    }
}
