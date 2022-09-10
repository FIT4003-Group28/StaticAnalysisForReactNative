package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: crpi  reason: default package */
/* loaded from: classes5.dex */
public final class crpi {
    public static final long a = TimeUnit.MINUTES.toMillis(5);
    private static long w = Long.MIN_VALUE;
    private static final dcdn<Integer, ddtx> z;
    private final crpg A;
    public final btrm b;
    public final cqat c;
    public final crpm d;
    public final crpl e;
    public final crpb f;
    public final crpo g;
    public final crpo h;
    public final crpa i;
    @dzsi
    public dduy j;
    public final ahjq n;
    public final dbsg<atbs> o;
    public final AtomicInteger r;
    @dzsi
    private ddva t;
    public long k = Long.MIN_VALUE;
    private long u = Long.MIN_VALUE;
    public final ArrayDeque<crhd> l = new ArrayDeque<>();
    public final ArrayDeque<Long> m = new ArrayDeque<>();
    public boolean p = false;
    public final List<String> q = new ArrayList();
    public final ArrayList<crph> s = new ArrayList<>();
    private boolean v = false;
    private boolean x = false;
    private long y = 0;

    static {
        dcdg p = dcdn.p();
        p.f(0, ddtx.IN_VEHICLE);
        p.f(1, ddtx.ON_BICYCLE);
        p.f(2, ddtx.ON_FOOT);
        p.f(3, ddtx.STILL);
        p.f(4, ddtx.UNKNOWN);
        p.f(5, ddtx.TILTING);
        p.f(6, ddtx.EXITING_VEHICLE);
        p.f(7, ddtx.WALKING);
        p.f(8, ddtx.RUNNING);
        p.f(9, ddtx.OFF_BODY);
        p.f(10, ddtx.TRUSTED_GAIT);
        p.f(11, ddtx.FLOOR_CHANGE);
        p.f(12, ddtx.ON_STAIRS);
        p.f(13, ddtx.ON_ESCALATOR);
        p.f(14, ddtx.IN_ELEVATOR);
        p.f(15, ddtx.SLEEPING);
        p.f(16, ddtx.IN_ROAD_VEHICLE);
        p.f(17, ddtx.IN_RAIL_VEHICLE);
        p.f(18, ddtx.IN_TWO_WHEELER_VEHICLE);
        p.f(19, ddtx.IN_FOUR_WHEELER_VEHICLE);
        p.f(20, ddtx.IN_CAR);
        p.f(21, ddtx.IN_BUS);
        z = p.b();
    }

    public crpi(Context context, btpc btpcVar, crem cremVar, bvjj bvjjVar, buwv buwvVar, btrm btrmVar, cqat cqatVar, dehq dehqVar, ckcw ckcwVar, btlu btluVar, GoogleApiClient googleApiClient, corc corcVar, boolean z2, ahjq ahjqVar, jzv jzvVar, dzsj dzsjVar, btwd btwdVar, crpm crpmVar, dbsg dbsgVar) {
        this.b = btrmVar;
        this.c = cqatVar;
        this.n = ahjqVar;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.r = atomicInteger;
        this.d = crpmVar;
        this.o = dbsgVar;
        crpe crpeVar = new crpe(btluVar != null && btluVar.u(), ckcwVar, dehqVar, crpmVar, buwvVar);
        crps crpsVar = null;
        if (googleApiClient != null && btluVar != null && btluVar.u() && z2) {
            crpsVar = new crps(btluVar.s(), googleApiClient, corcVar, ckcwVar, dehqVar);
        }
        crpo crpoVar = new crpo();
        this.h = crpoVar;
        crpo crpoVar2 = new crpo();
        this.g = crpoVar2;
        crpb crpbVar = new crpb(cqatVar, crpmVar);
        this.f = crpbVar;
        this.i = new crpa(bvjjVar, btpcVar, context, cremVar, jzvVar, dzsjVar, btwdVar);
        this.e = new crpl(cqatVar, dehqVar, crpmVar, crpoVar, crpoVar2, crpbVar, crpeVar, crpsVar, atomicInteger);
        this.A = new crpg(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (java.lang.Integer.parseInt(r0) == 1) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r5 = this;
            cqat r0 = r5.c
            long r0 = r0.e()
            long r2 = r5.y
            long r0 = r0 - r2
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L33
            cqat r0 = r5.c
            long r0 = r0.e()
            r5.y = r0
            crpg r0 = r5.A
            android.content.Context r0 = r0.a
            r1 = 1
            r2 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "network_location_opt_in"
            java.lang.String r0 = defpackage.cpkc.b(r0, r3)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L30
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 != r1) goto L30
            goto L31
        L30:
            r1 = 0
        L31:
            r5.x = r1
        L33:
            boolean r0 = r5.x
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crpi.a():boolean");
    }

    public final void b(crhc crhcVar) {
        if (!m() || (r0 = this.d.a.K) <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(this.d.a.J);
        if (millis <= 0) {
            return;
        }
        long j = crhcVar.a.c;
        if (j < w + ((millis * 9) / 10)) {
            return;
        }
        w = j;
        ddtv bZ = ddty.e.bZ();
        int i = crhcVar.a.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddty ddtyVar = (ddty) bZ.b;
        ddtyVar.a |= 1;
        ddtyVar.d = i;
        for (DetectedActivity detectedActivity : crhcVar.a.a) {
            ddtx orDefault = z.getOrDefault(Integer.valueOf(detectedActivity.a()), ddtx.UNKNOWN);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddty ddtyVar2 = (ddty) bZ.b;
            orDefault.getClass();
            dsrf dsrfVar = ddtyVar2.b;
            if (!dsrfVar.a()) {
                ddtyVar2.b = dsqw.cg(dsrfVar);
            }
            ddtyVar2.b.h(orDefault.w);
            int i2 = detectedActivity.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddty ddtyVar3 = (ddty) bZ.b;
            dsrf dsrfVar2 = ddtyVar3.c;
            if (!dsrfVar2.a()) {
                ddtyVar3.c = dsqw.cg(dsrfVar2);
            }
            ddtyVar3.c.h(i2);
            int i3 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
        }
        if (((ddty) bZ.b).b.size() == 0) {
            return;
        }
        ddvr bZ2 = ddvs.g.bZ();
        ddty bK = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddvs ddvsVar = (ddvs) bZ2.b;
        bK.getClass();
        ddvsVar.c = bK;
        ddvsVar.b = 27;
        ((ddty) bZ.b).b.size();
        this.e.c(bZ2);
    }

    public final void c(String str, GmmLocation gmmLocation, boolean z2) {
        if (m()) {
            if (gmmLocation.p() || gmmLocation.n() || gmmLocation.o()) {
                ddvi bZ = ddvj.f.bZ();
                boolean p = gmmLocation.p();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddvj ddvjVar = (ddvj) bZ.b;
                ddvjVar.a |= 2;
                ddvjVar.c = p;
                boolean n = gmmLocation.n();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddvj ddvjVar2 = (ddvj) bZ.b;
                ddvjVar2.a |= 4;
                ddvjVar2.d = n;
                boolean o = gmmLocation.o();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddvj ddvjVar3 = (ddvj) bZ.b;
                ddvjVar3.a |= 8;
                ddvjVar3.e = o;
                Long q = gmmLocation.q();
                if (q != null) {
                    long longValue = q.longValue();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddvj ddvjVar4 = (ddvj) bZ.b;
                    ddvjVar4.a |= 1;
                    ddvjVar4.b = longValue;
                }
                ddvr bZ2 = ddvs.g.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddvs ddvsVar = (ddvs) bZ2.b;
                ddvj bK = bZ.bK();
                bK.getClass();
                ddvsVar.c = bK;
                ddvsVar.b = 5;
                this.e.d(bZ2, Long.valueOf(gmmLocation.j), false, null, null);
            }
            long j = gmmLocation.j;
            dduy dduyVar = this.j;
            if (dduyVar != null) {
                if (j - this.k <= this.d.a.e) {
                    ddvr bZ3 = ddvs.g.bZ();
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    ddvs ddvsVar2 = (ddvs) bZ3.b;
                    dduyVar.getClass();
                    ddvsVar2.c = dduyVar;
                    ddvsVar2.b = 20;
                    this.e.c(bZ3);
                }
                this.j = null;
                this.k = Long.MIN_VALUE;
            }
            long j2 = gmmLocation.j;
            ddva ddvaVar = this.t;
            if (ddvaVar != null) {
                if (j2 - this.u <= this.d.a.e) {
                    ddvr bZ4 = ddvs.g.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    ddvs ddvsVar3 = (ddvs) bZ4.b;
                    ddvaVar.getClass();
                    ddvsVar3.c = ddvaVar;
                    ddvsVar3.b = 19;
                    this.e.c(bZ4);
                }
                this.t = null;
                this.u = Long.MIN_VALUE;
            }
            long j3 = gmmLocation.j;
            this.l.size();
            if (!this.l.isEmpty()) {
                while (!this.l.isEmpty()) {
                    crhd peekLast = this.l.peekLast();
                    Long peekLast2 = this.m.peekLast();
                    if (peekLast == null || peekLast2 == null) {
                        this.l.removeLast();
                        this.m.removeLast();
                    } else if (j3 - peekLast2.longValue() > this.d.a.e) {
                        break;
                    } else {
                        this.l.removeLast();
                        this.m.removeLast();
                        d(peekLast);
                    }
                }
            }
            this.e.e(gmmLocation, false);
        } else {
            gmmLocation.getLatitude();
            gmmLocation.getLongitude();
        }
        this.e.f(z2);
    }

    public final void d(crhd crhdVar) {
        ddvr bZ = ddvs.g.bZ();
        int i = crhdVar.b;
        boolean z2 = true;
        if (i == 1) {
            ddud bZ2 = ddue.a.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ.b;
            ddue bK = bZ2.bK();
            bK.getClass();
            ddvsVar.c = bK;
            ddvsVar.b = 29;
        } else if (i == 2 || i == 3) {
            ddub bZ3 = dduc.e.bZ();
            boolean z3 = crhdVar.b == 2;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dduc dducVar = (dduc) bZ3.b;
            dducVar.a = 1 | dducVar.a;
            dducVar.b = z3;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvs ddvsVar2 = (ddvs) bZ.b;
            dduc bK2 = bZ3.bK();
            bK2.getClass();
            ddvsVar2.c = bK2;
            ddvsVar2.b = 30;
        } else if (i == 5 || i == 6) {
            ddub bZ4 = dduc.e.bZ();
            if (crhdVar.b != 5) {
                z2 = false;
            }
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dduc dducVar2 = (dduc) bZ4.b;
            dducVar2.a = 2 | dducVar2.a;
            dducVar2.c = z2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvs ddvsVar3 = (ddvs) bZ.b;
            dduc bK3 = bZ4.bK();
            bK3.getClass();
            ddvsVar3.c = bK3;
            ddvsVar3.b = 30;
        } else if (!crhdVar.a()) {
            return;
        } else {
            ddub bZ5 = dduc.e.bZ();
            boolean a2 = crhdVar.a();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dduc dducVar3 = (dduc) bZ5.b;
            dducVar3.a |= 4;
            dducVar3.d = a2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvs ddvsVar4 = (ddvs) bZ.b;
            dduc bK4 = bZ5.bK();
            bK4.getClass();
            ddvsVar4.c = bK4;
            ddvsVar4.b = 30;
        }
        this.e.c(bZ);
    }

    public final boolean e(int i) {
        return this.f.g() || i < this.d.f;
    }

    @dzsi
    public final crph f(int i) {
        for (int i2 = 0; i2 < this.s.size(); i2++) {
            crph crphVar = this.s.get(i2);
            if (crphVar.a == i) {
                this.s.remove(i2);
                return crphVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(crlv crlvVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        this.p = !crlvVar.a.x;
        if (m()) {
            ddut bZ = dduu.a.bZ();
            ddvr bZ2 = ddvs.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ2.b;
            dduu bK = bZ.bK();
            bK.getClass();
            ddvsVar.c = bK;
            ddvsVar.b = 15;
            this.e.d(bZ2, null, false, crlvVar.a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(crlu crluVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        boolean e = this.f.e(crluVar.b);
        if (m()) {
            ddtr bZ = ddts.d.bZ();
            cray b = crluVar.b.b();
            amub amubVar = crluVar.a;
            ddxp bZ2 = ddxq.g.bZ();
            int i = b.h;
            int G = amubVar.G();
            if (i != -1) {
                int i2 = G - i;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddxq ddxqVar = (ddxq) bZ2.b;
                ddxqVar.a |= 4;
                ddxqVar.d = i2;
            }
            double d = b.j.a;
            int i3 = amubVar.H;
            if (d != -1.0d && i3 > 0) {
                dspt b2 = dsuz.b(i3 - Math.round(d));
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                ddxq ddxqVar2 = (ddxq) bZ2.b;
                b2.getClass();
                ddxqVar2.b = b2;
                ddxqVar2.a |= 1;
            }
            if (b.j.b()) {
                double c = b.j.c();
                int E = amubVar.E();
                if (E > 0) {
                    dspt b3 = dsuz.b(E - Math.round(c));
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddxq ddxqVar3 = (ddxq) bZ2.b;
                    b3.getClass();
                    ddxqVar3.c = b3;
                    ddxqVar3.a |= 2;
                }
            }
            dpej g = b.g();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddxq ddxqVar4 = (ddxq) bZ2.b;
            ddxqVar4.e = g.e;
            ddxqVar4.a |= 8;
            dpej N = amubVar.N();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddxq ddxqVar5 = (ddxq) bZ2.b;
            ddxqVar5.f = N.e;
            ddxqVar5.a |= 16;
            ddxq bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddts ddtsVar = (ddts) bZ.b;
            bK.getClass();
            ddtsVar.b = bK;
            ddtsVar.a |= 1;
            if (crluVar.a.av().a()) {
                dqum b4 = crluVar.a.av().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddts ddtsVar2 = (ddts) bZ.b;
                ddtsVar2.c = b4.e;
                ddtsVar2.a |= 2;
            }
            ddvr bZ3 = ddvs.g.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ3.b;
            ddts bK2 = bZ.bK();
            bK2.getClass();
            ddvsVar.c = bK2;
            ddvsVar.b = 11;
            this.e.d(bZ3, null, false, crluVar.a, null);
        }
        this.e.f(e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(crlt crltVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        if (m()) {
            ddtp bZ = ddtq.d.bZ();
            amub amubVar = crltVar.b;
            if (amubVar != null && amubVar.av().a()) {
                dqum b = amubVar.av().b();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtq ddtqVar = (ddtq) bZ.b;
                ddtqVar.c = b.e;
                ddtqVar.a |= 2;
            }
            cred credVar = cred.NEVER_PLAYED;
            crqv crqvVar = crqv.BETTER_ROUTE;
            int i = crltVar.c - 1;
            if (i == 0) {
                this.p = amubVar == null || !amubVar.x;
                if (crltVar.a) {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddtq ddtqVar2 = (ddtq) bZ.b;
                    ddtqVar2.b = 2;
                    ddtqVar2.a |= 1;
                } else {
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddtq ddtqVar3 = (ddtq) bZ.b;
                    ddtqVar3.b = 4;
                    ddtqVar3.a |= 1;
                }
            } else if (i == 2) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtq ddtqVar4 = (ddtq) bZ.b;
                ddtqVar4.b = 1;
                ddtqVar4.a |= 1;
            } else if (crltVar.a) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtq ddtqVar5 = (ddtq) bZ.b;
                ddtqVar5.b = 3;
                ddtqVar5.a |= 1;
            } else {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddtq ddtqVar6 = (ddtq) bZ.b;
                ddtqVar6.b = 5;
                ddtqVar6.a |= 1;
            }
            ddvr bZ2 = ddvs.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ2.b;
            ddtq bK = bZ.bK();
            bK.getClass();
            ddvsVar.c = bK;
            ddvsVar.b = 12;
            this.e.d(bZ2, null, false, crltVar.b, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(cror crorVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        if (crorVar.d == null) {
            this.p = !crorVar.a.x;
            if (!m()) {
                return;
            }
            ddtt bZ = ddtu.a.bZ();
            ddvr bZ2 = ddvs.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ2.b;
            ddtu bK = bZ.bK();
            bK.getClass();
            ddvsVar.c = bK;
            ddvsVar.b = 13;
            this.e.d(bZ2, null, false, crorVar.a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(crev crevVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        if (m()) {
            ddvd bZ = ddvf.d.bZ();
            int a2 = auee.a(crevVar.d);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvf ddvfVar = (ddvf) bZ.b;
            int i = 1;
            ddvfVar.a |= 1;
            ddvfVar.b = a2;
            cred credVar = crevVar.a;
            cred credVar2 = cred.NEVER_PLAYED;
            crqv crqvVar = crqv.BETTER_ROUTE;
            int ordinal = credVar.ordinal();
            if (ordinal == 0) {
                i = 2;
            } else if (ordinal == 1) {
                i = 3;
            } else if (ordinal == 2) {
                i = 4;
            } else if (ordinal == 3) {
                i = 5;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddvf ddvfVar2 = (ddvf) bZ.b;
            ddvfVar2.c = i - 1;
            ddvfVar2.a |= 2;
            ddvr bZ2 = ddvs.g.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddvs ddvsVar = (ddvs) bZ2.b;
            ddvf bK = bZ.bK();
            bK.getClass();
            ddvsVar.c = bK;
            ddvsVar.b = 7;
            this.e.d(bZ2, null, e(crevVar.c), null, crevVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(ahju ahjuVar) {
        bvrj.NAVIGATION_INTERNAL.c();
        dduz bZ = ddva.d.bZ();
        boolean z2 = ahjuVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddva ddvaVar = (ddva) bZ.b;
        int i = ddvaVar.a | 1;
        ddvaVar.a = i;
        ddvaVar.b = z2;
        boolean z3 = ahjuVar.b;
        ddvaVar.a = i | 2;
        ddvaVar.c = z3;
        ddva bK = bZ.bK();
        ddva ddvaVar2 = this.t;
        if (ddvaVar2 == null || !ddvaVar2.equals(bK)) {
            this.t = bK;
            this.u = this.c.e();
        }
    }

    public final boolean m() {
        dqvj dqvjVar = this.f.e;
        boolean z2 = false;
        if (dqvjVar == dqvj.DRIVE || dqvjVar == dqvj.TAXICAB || dqvjVar == dqvj.TWO_WHEELER || dqvjVar == dqvj.TRANSIT) {
            int a2 = ddwv.a(this.d.a.E);
            if (a2 != 0 && a2 == 2 && !this.f.a()) {
                return false;
            }
            if (!this.d.a.d && this.f.g()) {
                return false;
            }
            if (!this.v) {
                this.v = true;
                btrm btrmVar = this.b;
                crpm crpmVar = this.d;
                if (crpmVar.a.A && crpmVar.h && !crpmVar.i) {
                    z2 = true;
                }
                btrmVar.b(new crhm(z2, crpmVar.a()));
            }
            return true;
        }
        return false;
    }
}
