package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: crpl  reason: default package */
/* loaded from: classes5.dex */
public final class crpl {
    private static final long j = TimeUnit.HOURS.toMillis(1);
    public final cqat a;
    public final crpe b;
    @dzsi
    public final crps c;
    public final long d;
    public final crpf f;
    public int g;
    public int h;
    private final dehq k;
    private final crpm l;
    private final crpb m;
    private final long n;
    private boolean r;
    private final crpn t;
    private final List<dlea> v;
    private final AtomicInteger w;
    public long e = Long.MAX_VALUE;
    private int o = 0;
    private long p = Long.MIN_VALUE;
    private long q = Long.MIN_VALUE;
    private boolean s = false;
    public final Map<String, dbsi<Integer, Integer>> i = new HashMap();
    private final List<ddvs> u = new ArrayList();

    public crpl(cqat cqatVar, dehq dehqVar, crpm crpmVar, crpo crpoVar, crpo crpoVar2, crpb crpbVar, crpe crpeVar, @dzsi crps crpsVar, AtomicInteger atomicInteger) {
        this.a = cqatVar;
        this.k = dehqVar;
        this.l = crpmVar;
        this.m = crpbVar;
        this.b = crpeVar;
        this.c = crpsVar;
        this.w = atomicInteger;
        this.d = crpmVar.j;
        this.n = crpmVar.k;
        this.f = new crpf(crpmVar, crpoVar, crpoVar2, crpbVar);
        this.t = new crpn(crpmVar, crpbVar, crpoVar);
        new ArrayList();
        this.r = false;
        this.v = new ArrayList();
    }

    public static void h(StringBuilder sb, long j2, String str, int i, int i2) {
        sb.append(", ");
        sb.append(str);
        sb.append(" bytes: ");
        sb.append(i);
        sb.append(" (");
        long j3 = j;
        sb.append((i * j3) / j2);
        sb.append(" per hour)");
        sb.append(", ");
        sb.append(str);
        sb.append(" events: ");
        sb.append(i2);
        sb.append(" (");
        sb.append((i2 * j3) / j2);
        sb.append(" per hour)");
    }

    private final boolean i() {
        if (this.e == Long.MAX_VALUE) {
            int i = this.l.a.e;
            this.e = this.a.b() + TimeUnit.SECONDS.toMillis(this.l.a.g);
            this.o = this.l.a.f * i;
        }
        if (!this.r) {
            this.r = true;
            return true;
        }
        return false;
    }

    private final void j(long j2, boolean z) {
        ddvr bZ = ddvs.g.bZ();
        ddww ddwwVar = this.l.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddvs ddvsVar = (ddvs) bZ.b;
        ddwwVar.getClass();
        ddvsVar.c = ddwwVar;
        ddvsVar.b = 22;
        m(bZ, j2, z, null, null);
    }

    private final boolean k(GmmLocation gmmLocation) {
        return this.l.a.t > 0 && !this.m.c(gmmLocation);
    }

    private final void l(String str, int i) {
        dbsi<Integer, Integer> dbsiVar = this.i.get(str);
        if (dbsiVar == null) {
            dbsiVar = dbsi.a(0, 0);
        }
        this.i.put(str, dbsi.a(Integer.valueOf(dbsiVar.a.intValue() + i), Integer.valueOf(dbsiVar.b.intValue() + 1)));
    }

    private final void m(ddvr ddvrVar, long j2, boolean z, @dzsi amub amubVar, @dzsi amuo amuoVar) {
        char c;
        String str;
        int i = ((ddvs) ddvrVar.b).b;
        if (i != 0) {
            switch (i) {
                case 5:
                    c = 1;
                    break;
                case 6:
                    c = 2;
                    break;
                case 7:
                    c = 3;
                    break;
                case 8:
                    c = 4;
                    break;
                case 9:
                    c = 5;
                    break;
                case 10:
                    c = 6;
                    break;
                case 11:
                    c = 7;
                    break;
                case 12:
                    c = '\b';
                    break;
                case 13:
                    c = '\t';
                    break;
                case 14:
                    c = '\n';
                    break;
                case 15:
                    c = 11;
                    break;
                case 16:
                    c = '\f';
                    break;
                case 17:
                    c = '\r';
                    break;
                case 18:
                    c = 14;
                    break;
                case 19:
                    c = 15;
                    break;
                case 20:
                    c = 16;
                    break;
                case 21:
                    c = 17;
                    break;
                case 22:
                    c = 18;
                    break;
                case 23:
                    c = 19;
                    break;
                case 24:
                    c = 20;
                    break;
                case 25:
                    c = 21;
                    break;
                case 26:
                    c = 22;
                    break;
                case 27:
                    c = 23;
                    break;
                case 28:
                    c = 24;
                    break;
                case 29:
                    c = 25;
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    c = 26;
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    c = 27;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    c = 28;
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    c = 29;
                    break;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    c = 30;
                    break;
                case 35:
                    c = 31;
                    break;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    c = ' ';
                    break;
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    c = '!';
                    break;
                default:
                    c = 0;
                    break;
            }
        } else {
            c = '\"';
        }
        switch (c) {
            case 1:
                str = "LOCATION_PIPELINE";
                break;
            case 2:
                str = "GUIDANCE_STARTED";
                break;
            case 3:
                str = "GUIDANCE_STOPPED";
                break;
            case 4:
                str = "STEP_CHANGED";
                break;
            case 5:
                str = "ACTIVE_TRIP_CHANGED";
                break;
            case 6:
                str = "TRAFFIC_UPDATED";
                break;
            case 7:
                str = "ALTERNATE_TRIP_OFFERED";
                break;
            case '\b':
                str = "ALTERNATE_TRIP_ACCEPTED";
                break;
            case '\t':
                str = "ALTERNATE_TRIP_SELECTED";
                break;
            case '\n':
                str = "REROUTE_REQUESTED";
                break;
            case 11:
                str = "DROVE_ONTO_ALTERNATIVE";
                break;
            case '\f':
                str = "PROMPT_SHOWN";
                break;
            case '\r':
                str = "ARRIVED";
                break;
            case 14:
                str = "DEVICE";
                break;
            case 15:
                str = "GPS_AVAILABILITY";
                break;
            case 16:
                str = "FOREGROUND";
                break;
            case 17:
                str = "SESSION_ENDED";
                break;
            case 18:
                str = "START_RECORDING";
                break;
            case 19:
                str = "STOP_RECORDING";
                break;
            case 20:
                str = "FEEDBACK";
                break;
            case 21:
                str = "PICKUP";
                break;
            case 22:
                str = "DROPOFF";
                break;
            case 23:
                str = "ANDROID_ACTIVITY_RECOGNITION";
                break;
            case 24:
                str = "TRANSIT_TRIP_STARTED";
                break;
            case 25:
                str = "ASSISTANT_VOICE_ACTION";
                break;
            case 26:
                str = "ASSISTANT_STATE";
                break;
            case 27:
                str = "TRAFFIC_RADAR_STATE";
                break;
            case 28:
                str = "INCIDENT_REPORT";
                break;
            case 29:
                str = "MAP_VERSUS_SENSOR_INCONSISTENCY";
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                str = "ACCELERATION_EVENT";
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                str = "UI_MODE_STATE";
                break;
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                str = "TRANSACTION_IDS_CHANGE";
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                str = "PROJECTED_SENSOR_STATE";
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                str = "DETAILS_NOT_SET";
                break;
            default:
                str = "null";
                break;
        }
        if (c == 0) {
            throw null;
        }
        if (z) {
            if (ddvrVar.c) {
                ddvrVar.bF();
                ddvrVar.c = false;
            }
            ddvs ddvsVar = (ddvs) ddvrVar.b;
            ddvsVar.a |= 1;
            ddvsVar.d = true;
        }
        ddxc a = this.t.a(amubVar, amuoVar);
        if (a != null) {
            if (ddvrVar.c) {
                ddvrVar.bF();
                ddvrVar.c = false;
            }
            ddvs ddvsVar2 = (ddvs) ddvrVar.b;
            a.getClass();
            ddvsVar2.f = a;
            ddvsVar2.a |= 4;
        }
        dstv a2 = dsvb.a(b(j2));
        if (ddvrVar.c) {
            ddvrVar.bF();
            ddvrVar.c = false;
        }
        ddvs ddvsVar3 = (ddvs) ddvrVar.b;
        a2.getClass();
        ddvsVar3.e = a2;
        ddvsVar3.a |= 2;
        ddvs bK = ddvrVar.bK();
        this.u.add(bK);
        int i2 = bK.bE;
        if (i2 == -1) {
            i2 = dsst.a.b(bK).e(bK);
            bK.bE = i2;
        }
        this.q = Math.max(this.q, j2);
        this.h++;
        this.g += i2;
        l(str, i2);
    }

    public final long a() {
        long j2 = this.q;
        if (j2 == Long.MIN_VALUE) {
            return 0L;
        }
        return j2 - this.n;
    }

    public final long b(long j2) {
        dbsk.l(this.d != Long.MAX_VALUE);
        return this.d + (j2 - this.n);
    }

    public final void c(ddvr ddvrVar) {
        d(ddvrVar, null, false, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(ddvr ddvrVar, @dzsi Long l, boolean z, @dzsi amub amubVar, @dzsi amuo amuoVar) {
        long longValue;
        long j2;
        long j3;
        if (!this.l.a.d) {
            int i = ((ddvs) ddvrVar.b).b;
            return;
        }
        boolean z2 = this.m.g() || z;
        if (l == null) {
            longValue = this.a.e();
        } else {
            longValue = l.longValue();
        }
        if (i()) {
            j(longValue, z2);
        }
        m(ddvrVar, longValue, z2, amubVar, amuoVar);
        ddww ddwwVar = this.l.a;
        int i2 = ddwwVar.e;
        int i3 = ddwwVar.o * i2;
        if (i3 <= 0) {
            return;
        }
        long j4 = this.p;
        if (j4 == Long.MIN_VALUE) {
            return;
        }
        long j5 = i3;
        if (longValue - j4 <= j5) {
            return;
        }
        int i4 = this.o;
        if ((j4 + i4) - longValue <= j5) {
            return;
        }
        int i5 = ((int) (((j2 + j3) - 1) / i2)) * i2;
        if (i5 >= i4) {
            return;
        }
        this.o = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.apps.gmm.map.model.location.GmmLocation r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crpl.e(com.google.android.apps.gmm.map.model.location.GmmLocation, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(boolean z) {
        if (this.e == Long.MAX_VALUE) {
            return;
        }
        long b = b(this.a.e());
        if (b >= this.e || z) {
            g(null, b);
            this.e = b + TimeUnit.SECONDS.toMillis(this.l.a.g);
            return;
        }
        this.b.g(b, false);
    }

    public final void g(@dzsi final Runnable runnable, long j2) {
        ddwd bK;
        ddvq ddvqVar;
        boolean z;
        djos djosVar;
        djos bK2;
        int a;
        crps crpsVar;
        if (runnable != null && !this.s && this.r && this.q != Long.MIN_VALUE) {
            ddxd bZ = ddxe.f.bZ();
            dspt c = dsuz.c(a());
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddxe ddxeVar = (ddxe) bZ.b;
            c.getClass();
            ddxeVar.b = c;
            int i = ddxeVar.a | 1;
            ddxeVar.a = i;
            int i2 = this.g;
            crpf crpfVar = this.f;
            int i3 = crpfVar.f;
            int i4 = i | 2;
            ddxeVar.a = i4;
            ddxeVar.c = i2 + i3;
            int i5 = this.h;
            int i6 = i4 | 4;
            ddxeVar.a = i6;
            ddxeVar.d = i5;
            int i7 = crpfVar.e;
            ddxeVar.a = i6 | 8;
            ddxeVar.e = i7;
            ddxe bK3 = bZ.bK();
            ddvr bZ2 = ddvs.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ2.b;
            bK3.getClass();
            ddvsVar.c = bK3;
            ddvsVar.b = 23;
            m(bZ2, this.a.e(), this.m.g(), null, null);
            this.s = true;
        }
        if (this.c == null) {
            bK = null;
        } else {
            ddwc bZ3 = ddwd.c.bZ();
            crpm crpmVar = this.l;
            ddwq bZ4 = ddwr.f.bZ();
            if (crpmVar.l) {
                long j3 = crpmVar.b;
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                ddwr ddwrVar = (ddwr) bZ4.b;
                ddwrVar.a |= 1;
                ddwrVar.b = j3;
            }
            ddwr bK4 = bZ4.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddwd ddwdVar = (ddwd) bZ3.b;
            bK4.getClass();
            ddwdVar.b = bK4;
            ddwdVar.a |= 1;
            bK = bZ3.bK();
        }
        ddvq bZ5 = ddwb.e.bZ();
        crpm crpmVar2 = this.l;
        boolean z2 = crpmVar2.l;
        ddwq bZ6 = ddwr.f.bZ();
        String str = crpmVar2.g;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        ddwr ddwrVar2 = (ddwr) bZ6.b;
        str.getClass();
        int i8 = ddwrVar2.a | 128;
        ddwrVar2.a = i8;
        ddwrVar2.d = str;
        if (z2) {
            ddvqVar = bZ5;
            long j4 = crpmVar2.b;
            i8 |= 1;
            ddwrVar2.a = i8;
            ddwrVar2.b = j4;
        } else {
            ddvqVar = bZ5;
        }
        String str2 = crpmVar2.d;
        if (str2 != null && z2) {
            str2.getClass();
            ddwrVar2.a = i8 | 2;
            ddwrVar2.c = str2;
        }
        synchronized (crpmVar2) {
            dcdc<String> dcdcVar = crpmVar2.m;
            if (dcdcVar != null && !dcdcVar.isEmpty()) {
                dcdc<String> dcdcVar2 = crpmVar2.m;
                if (bZ6.c) {
                    bZ6.bF();
                    bZ6.c = false;
                }
                ddwr ddwrVar3 = (ddwr) bZ6.b;
                dsrj<String> dsrjVar = ddwrVar3.e;
                if (!dsrjVar.a()) {
                    ddwrVar3.e = dsqw.cl(dsrjVar);
                }
                dsod.bv(dcdcVar2, ddwrVar3.e);
            }
        }
        ddwr bK5 = bZ6.bK();
        ddvq ddvqVar2 = ddvqVar;
        if (ddvqVar2.c) {
            ddvqVar2.bF();
            ddvqVar2.c = false;
        }
        ddwb ddwbVar = (ddwb) ddvqVar2.b;
        bK5.getClass();
        ddwbVar.b = bK5;
        ddwbVar.a |= 1;
        if (this.f.d.size() == 0) {
            z = false;
        } else {
            ddvt bZ7 = ddvu.c.bZ();
            ddvv bZ8 = ddvw.b.bZ();
            crpf crpfVar2 = this.f;
            List<dduq> list = crpfVar2.d;
            crpfVar2.d = new ArrayList();
            crpfVar2.b.clear();
            crpfVar2.c.clear();
            if (bZ8.c) {
                bZ8.bF();
                bZ8.c = false;
            }
            ddvw ddvwVar = (ddvw) bZ8.b;
            dsrj<dduq> dsrjVar2 = ddvwVar.a;
            if (!dsrjVar2.a()) {
                ddvwVar.a = dsqw.cl(dsrjVar2);
            }
            dsod.bv(list, ddvwVar.a);
            if (bZ7.c) {
                bZ7.bF();
                bZ7.c = false;
            }
            ddvu ddvuVar = (ddvu) bZ7.b;
            ddvw bK6 = bZ8.bK();
            bK6.getClass();
            ddvuVar.b = bK6;
            ddvuVar.a = 1;
            ddvu bK7 = bZ7.bK();
            if (ddvqVar2.c) {
                ddvqVar2.bF();
                ddvqVar2.c = false;
            }
            ddwb ddwbVar2 = (ddwb) ddvqVar2.b;
            bK7.getClass();
            ddwbVar2.b();
            ddwbVar2.c.add(bK7);
            int i9 = bK7.bE;
            if (i9 == -1) {
                i9 = dsst.a.b(bK7).e(bK7);
                bK7.bE = i9;
            }
            l("LOCATION_SAMPLES", i9);
            z = true;
        }
        if (this.u.size() == 0) {
            djosVar = null;
        } else {
            for (ddvs ddvsVar2 : this.u) {
                ddvt bZ9 = ddvu.c.bZ();
                if (bZ9.c) {
                    bZ9.bF();
                    bZ9.c = false;
                }
                ddvu ddvuVar2 = (ddvu) bZ9.b;
                ddvsVar2.getClass();
                ddvuVar2.b = ddvsVar2;
                ddvuVar2.a = 2;
                ddvqVar2.a(bZ9);
            }
            this.u.clear();
            djosVar = null;
            this.t.a = null;
        }
        for (ddvr ddvrVar : croz.a.a()) {
            dstv dstvVar = ((ddvs) ddvrVar.b).e;
            if (dstvVar == null) {
                dstvVar = dstv.c;
            }
            dstv a2 = dsvb.a(b(dsvb.b(dstvVar)));
            if (ddvrVar.c) {
                ddvrVar.bF();
                ddvrVar.c = false;
            }
            ddvs ddvsVar3 = (ddvs) ddvrVar.b;
            a2.getClass();
            ddvsVar3.e = a2;
            ddvsVar3.a |= 2;
            ddvt bZ10 = ddvu.c.bZ();
            if (bZ10.c) {
                bZ10.bF();
                bZ10.c = false;
            }
            ddvu ddvuVar3 = (ddvu) bZ10.b;
            ddvs bK8 = ddvrVar.bK();
            bK8.getClass();
            ddvuVar3.b = bK8;
            ddvuVar3.a = 2;
            ddvqVar2.a(bZ10);
        }
        if (((ddwb) ddvqVar2.b).c.size() == 0) {
            bK2 = djosVar;
        } else {
            dldy bZ11 = dleb.b.bZ();
            if (this.v.size() != 0) {
                for (dlea dleaVar : this.v) {
                    if (bZ11.c) {
                        bZ11.bF();
                        bZ11.c = false;
                    }
                    dleb dlebVar = (dleb) bZ11.b;
                    dleaVar.getClass();
                    dsrj<dlea> dsrjVar3 = dlebVar.a;
                    if (!dsrjVar3.a()) {
                        dlebVar.a = dsqw.cl(dsrjVar3);
                    }
                    dlebVar.a.add(dleaVar);
                }
                this.v.clear();
            }
            ddww ddwwVar = this.l.a;
            boolean z3 = ddwwVar.d;
            boolean z4 = ddwwVar.c && (a = ddwv.a(ddwwVar.E)) != 0 && a == 2 && z;
            int andIncrement = this.w.getAndIncrement();
            if (ddvqVar2.c) {
                ddvqVar2.bF();
                ddvqVar2.c = false;
            }
            ddwb ddwbVar3 = (ddwb) ddvqVar2.b;
            ddwbVar3.a |= 2;
            ddwbVar3.d = andIncrement;
            dixs bZ12 = dixt.n.bZ();
            if (bZ12.c) {
                bZ12.bF();
                bZ12.c = false;
            }
            dixt dixtVar = (dixt) bZ12.b;
            int i10 = dixtVar.a | 1;
            dixtVar.a = i10;
            dixtVar.d = z3;
            crpm crpmVar3 = this.l;
            boolean z5 = crpmVar3.h;
            int i11 = i10 | 2;
            dixtVar.a = i11;
            dixtVar.e = z5;
            boolean z6 = crpmVar3.i;
            int i12 = i11 | 4;
            dixtVar.a = i12;
            dixtVar.f = z6;
            long j5 = this.d;
            int i13 = i12 | 8;
            dixtVar.a = i13;
            dixtVar.g = j5;
            ddww ddwwVar2 = crpmVar3.a;
            int i14 = ddwwVar2.n;
            int i15 = i13 | 16;
            dixtVar.a = i15;
            dixtVar.h = i14;
            boolean z7 = ddwwVar2.p;
            int i16 = i15 | 32;
            dixtVar.a = i16;
            dixtVar.i = z7;
            boolean z8 = ddwwVar2.q;
            dixtVar.a = i16 | 64;
            dixtVar.j = z8;
            dqvj c2 = dqvj.c(ddwwVar2.F);
            if (c2 == null) {
                c2 = dqvj.DRIVE;
            }
            if (c2 == dqvj.TRANSIT) {
                if (bZ12.c) {
                    bZ12.bF();
                    bZ12.c = false;
                }
                dixt dixtVar2 = (dixt) bZ12.b;
                dixtVar2.b = 12;
                dixtVar2.c = true;
            }
            djor bZ13 = djos.d.bZ();
            dixn bZ14 = dixu.d.bZ();
            dixo bZ15 = dixr.g.bZ();
            if (bZ15.c) {
                bZ15.bF();
                bZ15.c = false;
            }
            dixr dixrVar = (dixr) bZ15.b;
            int i17 = dixrVar.a | 1;
            dixrVar.a = i17;
            dixrVar.b = z4;
            boolean z9 = this.l.a.r;
            dixrVar.a = i17 | 2;
            dixrVar.c = z9;
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dixu dixuVar = (dixu) bZ14.b;
            dixr bK9 = bZ15.bK();
            bK9.getClass();
            dixuVar.c = bK9;
            dixuVar.a |= 2;
            if (bZ14.c) {
                bZ14.bF();
                bZ14.c = false;
            }
            dixu dixuVar2 = (dixu) bZ14.b;
            dixt bK10 = bZ12.bK();
            bK10.getClass();
            dixuVar2.b = bK10;
            dixuVar2.a |= 1;
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            djos djosVar2 = (djos) bZ13.b;
            dixu bK11 = bZ14.bK();
            bK11.getClass();
            djosVar2.b = bK11;
            djosVar2.a |= 1;
            if (bZ13.c) {
                bZ13.bF();
                bZ13.c = false;
            }
            djos djosVar3 = (djos) bZ13.b;
            ddwb bK12 = ddvqVar2.bK();
            bK12.getClass();
            djosVar3.c = bK12;
            djosVar3.a |= 2;
            bK2 = bZ13.bK();
        }
        if (bK != null && (crpsVar = this.c) != null) {
            crpsVar.g(bK);
        }
        if (bK2 != null) {
            this.b.b(bK2);
            this.b.g(j2, true);
        } else {
            this.b.g(j2, false);
        }
        if (runnable != null) {
            bvqd.a(this.k.d(new Runnable(this, runnable) { // from class: crpk
                private final crpl a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    crpl crplVar = this.a;
                    Runnable runnable2 = this.b;
                    crplVar.b.h();
                    crps crpsVar2 = crplVar.c;
                    if (crpsVar2 != null) {
                        crpsVar2.h();
                    }
                    StringBuilder sb = new StringBuilder();
                    long a3 = crplVar.a();
                    sb.append("session length: ");
                    sb.append(TimeUnit.MILLISECONDS.toSeconds(a3));
                    sb.append("s");
                    crplVar.b.i(sb, a3);
                    crps crpsVar3 = crplVar.c;
                    if (crpsVar3 != null) {
                        crpsVar3.i(sb, a3);
                    }
                    if (a3 > 0) {
                        crpf crpfVar3 = crplVar.f;
                        crpl.h(sb, a3, "Location sample", crpfVar3.f, crpfVar3.e);
                        crpl.h(sb, a3, "Client event", crplVar.g, crplVar.h);
                        crpl.h(sb, a3, "Event precursor", 0, 0);
                        crpl.h(sb, a3, "Sensor observation event", 0, 0);
                        for (Map.Entry<String, dbsi<Integer, Integer>> entry : crplVar.i.entrySet()) {
                            crpl.h(sb, a3, entry.getKey(), entry.getValue().a.intValue(), entry.getValue().b.intValue());
                        }
                    }
                    sb.toString();
                    runnable2.run();
                }
            }, this.l.a.I, TimeUnit.MILLISECONDS), this.k);
        }
    }
}
