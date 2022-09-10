package defpackage;

import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atuv  reason: default package */
/* loaded from: classes2.dex */
public class atuv implements atya {
    public final atss<crqz> a;
    public final dkxe b;
    public final crfl c;
    public final asbr d;
    public boolean e = true;
    private final iwr f;
    private final cqtd g;
    private final dehq h;
    private final Executor i;
    private final int j;
    private final int k;

    public atuv(atss<crqz> atssVar, dkxe dkxeVar, cqtd cqtdVar, dkxc dkxcVar, dehq dehqVar, Executor executor, crfl crflVar, asbr asbrVar) {
        int i;
        Integer valueOf;
        int i2;
        this.a = atssVar;
        this.b = dkxeVar;
        this.g = cqtdVar;
        this.h = dehqVar;
        this.i = executor;
        this.c = crflVar;
        this.d = asbrVar;
        dqkr dqkrVar = dqkr.UNKNOWN_INCIDENT_TYPE;
        Integer num = null;
        switch (dkxcVar.ordinal()) {
            case 1:
                i = R.string.REPORT_INCIDENT_PROMPT_ACCIDENT_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 2:
                i = R.string.REPORT_INCIDENT_PROMPT_CAMERA_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 3:
                i = R.string.REPORT_INCIDENT_PROMPT_SPEED_TRAP_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 4:
                i = R.string.REPORT_INCIDENT_PROMPT_JAM_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 5:
                i = R.string.REPORT_INCIDENT_PROMPT_CONSTRUCTION_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 6:
                i = R.string.REPORT_INCIDENT_PROMPT_LANE_CLOSURE_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 7:
                i = R.string.REPORT_INCIDENT_PROMPT_DISABLED_VEHICLE_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 8:
                i = R.string.REPORT_INCIDENT_PROMPT_OBJECT_ON_ROAD_REPORTING;
                valueOf = Integer.valueOf(i);
                break;
            case 9:
            case 10:
            default:
                valueOf = null;
                break;
        }
        dbsk.s(valueOf);
        this.j = valueOf.intValue();
        switch (dkxcVar.ordinal()) {
            case 1:
                i2 = R.string.REPORT_INCIDENT_PROMPT_ACCIDENT_REPORTED;
                break;
            case 2:
                i2 = R.string.REPORT_INCIDENT_PROMPT_CAMERA_REPORTED;
                break;
            case 3:
                i2 = R.string.REPORT_INCIDENT_PROMPT_SPEED_TRAP_REPORTED;
                break;
            case 4:
                i2 = R.string.REPORT_INCIDENT_PROMPT_JAM_REPORTED;
                break;
            case 5:
                i2 = R.string.REPORT_INCIDENT_PROMPT_CONSTRUCTION_REPORTED;
                break;
            case 6:
                i2 = R.string.REPORT_INCIDENT_PROMPT_LANE_CLOSURE_REPORTED;
                break;
            case 7:
                i2 = R.string.REPORT_INCIDENT_PROMPT_DISABLED_VEHICLE_REPORTED;
                break;
            case 8:
                i2 = R.string.REPORT_INCIDENT_PROMPT_OBJECT_ON_ROAD_REPORTED;
                break;
            case 9:
            case 10:
            default:
                dbsk.s(num);
                this.k = num.intValue();
                this.f = new iwr(new izn(this) { // from class: atut
                    private final atuv a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.izn
                    public final cqkl a() {
                        atuv atuvVar = this.a;
                        atuvVar.e = false;
                        if (!atuvVar.d.a()) {
                            atuvVar.a.p();
                            return cqkl.a;
                        }
                        crqz n = atuvVar.a.n();
                        crfl crflVar2 = atuvVar.c;
                        akra d = n.d();
                        dqkr b = auej.b(atuvVar.b);
                        dbsk.s(b);
                        aryv aryvVar = n.c;
                        crflVar2.h(d, b, Float.valueOf(n.i()), n.j());
                        cqkx.p(atuvVar);
                        return cqkl.a;
                    }
                }, dehqVar, executor);
        }
        num = Integer.valueOf(i2);
        dbsk.s(num);
        this.k = num.intValue();
        this.f = new iwr(new izn(this) { // from class: atut
            private final atuv a;

            {
                this.a = this;
            }

            @Override // defpackage.izn
            public final cqkl a() {
                atuv atuvVar = this.a;
                atuvVar.e = false;
                if (!atuvVar.d.a()) {
                    atuvVar.a.p();
                    return cqkl.a;
                }
                crqz n = atuvVar.a.n();
                crfl crflVar2 = atuvVar.c;
                akra d = n.d();
                dqkr b = auej.b(atuvVar.b);
                dbsk.s(b);
                aryv aryvVar = n.c;
                crflVar2.h(d, b, Float.valueOf(n.i()), n.j());
                cqkx.p(atuvVar);
                return cqkl.a;
            }
        }, dehqVar, executor);
    }

    @Override // defpackage.atya
    public Boolean a() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.atya
    public cqkl b() {
        this.f.e();
        this.a.p();
        return cqkl.a;
    }

    @Override // defpackage.atya
    public Integer c() {
        return Integer.valueOf(this.j);
    }

    @Override // defpackage.atya
    public Integer d() {
        return Integer.valueOf(this.k);
    }

    @Override // defpackage.atya
    public cqtd e() {
        return this.g;
    }

    @Override // defpackage.atya
    public izo f() {
        return this.f;
    }

    @Override // defpackage.atya
    public cqkl g() {
        if (this.e) {
            if (!this.f.h()) {
                this.f.d(4000L);
            }
        } else {
            bvqd.a(this.h.d(new Runnable(this) { // from class: atuu
                private final atuv a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a.p();
                }
            }, 2000L, TimeUnit.MILLISECONDS), this.i);
        }
        return cqkl.a;
    }
}
