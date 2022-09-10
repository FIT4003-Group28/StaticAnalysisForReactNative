package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.media.AudioManager;
import android.net.TrafficStats;
import android.os.Process;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
/* compiled from: PG */
/* renamed from: pqa  reason: default package */
/* loaded from: classes.dex */
public final class pqa implements btpa {
    private static final dcqe f = dcqe.c("pqa");
    private static final long n = TrafficStats.getUidRxBytes(Process.myUid());
    private static final long o = TrafficStats.getUidTxBytes(Process.myUid());
    private static final SimpleDateFormat p = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
    private final dcba<dbsi<String, ddoo>> A;
    public final Context a;
    private final cqat g;
    private final btpc h;
    private final cjqy i;
    private final dxio<btup> j;
    private final ckcw k;
    private final dxio<bvkx> l;
    @dzsi
    private final btyb m;
    private final int s;
    private final IntentFilter w;
    @dzsi
    private ahlc y;
    private long q = 0;
    private long r = 0;
    @dzsi
    private Boolean t = null;
    @dzsi
    private Boolean u = null;
    public int d = 0;
    public boolean e = false;
    private int z = 0;
    public final btoz b = new btoz(this);
    public final IntentFilter c = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private final pqb x = new pqb();
    private final btpe v = new btpe(this);

    public pqa(Context context, cqat cqatVar, btpc btpcVar, dxio<btup> dxioVar, cjqy cjqyVar, ckcw ckcwVar, dxio<bvkx> dxioVar2, btya btyaVar) {
        this.a = context;
        this.g = cqatVar;
        this.h = btpcVar;
        this.j = dxioVar;
        this.i = cjqyVar;
        this.k = ckcwVar;
        this.l = dxioVar2;
        this.m = new btyb(new btyc(btyaVar.a), csdq.a(btyaVar.b));
        this.s = context.getApplicationInfo().uid;
        IntentFilter intentFilter = new IntentFilter();
        this.w = intentFilter;
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        this.y = null;
        this.A = dcba.a(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(int i) {
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 1 : 6;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ddon o(boolean r17) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pqa.o(boolean):ddon");
    }

    private final ddmw p(ddmw ddmwVar) {
        int a;
        dsqp dsqpVar = (dsqp) ddmwVar.cu(5);
        dsqpVar.bC(ddmwVar);
        ddmv ddmvVar = (ddmv) dsqpVar;
        if (this.x.f()) {
            ddmg b = this.x.b();
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar2 = (ddmw) ddmvVar.b;
            ddmw ddmwVar3 = ddmw.l;
            b.getClass();
            ddmwVar2.e = b;
            ddmwVar2.a |= 8;
            ddmg c = this.x.c();
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar4 = (ddmw) ddmvVar.b;
            c.getClass();
            ddmwVar4.f = c;
            ddmwVar4.a |= 16;
            ddmi d = this.x.d();
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar5 = (ddmw) ddmvVar.b;
            d.getClass();
            ddmwVar5.g = d;
            ddmwVar5.a |= 32;
            float e = this.x.e();
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar6 = (ddmw) ddmvVar.b;
            ddmwVar6.a |= 64;
            ddmwVar6.h = e;
            this.x.g();
        }
        ahlc ahlcVar = this.y;
        int i = -1;
        if (ahlcVar != null) {
            int i2 = ahlcVar.a;
            if (i2 == -1 || (a = ddmu.a(i2)) == 0) {
                a = 128;
            }
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar7 = (ddmw) ddmvVar.b;
            ddmw ddmwVar8 = ddmw.l;
            ddmwVar7.i = a - 1;
            ddmwVar7.a |= 128;
        } else {
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar9 = (ddmw) ddmvVar.b;
            ddmw ddmwVar10 = ddmw.l;
            ddmwVar9.i = 127;
            ddmwVar9.a = 128 | ddmwVar9.a;
        }
        try {
            i = cpke.c(this.h.a.getContentResolver(), "location:proks_config", -1);
        } catch (SecurityException e2) {
            bvoo.f(e2);
        }
        if (i >= 0) {
            if (ddmvVar.c) {
                ddmvVar.bF();
                ddmvVar.c = false;
            }
            ddmw ddmwVar11 = (ddmw) ddmvVar.b;
            ddmwVar11.a |= 2048;
            ddmwVar11.j = i;
        }
        Map<String, String> e3 = cpke.e(this.h.a.getContentResolver(), "user_location_reporting:experiment:");
        ArrayList arrayList = new ArrayList();
        for (String str : e3.keySet()) {
            arrayList.add(str.replace("user_location_reporting:experiment:", ""));
        }
        if (ddmvVar.c) {
            ddmvVar.bF();
            ddmvVar.c = false;
        }
        ddmw ddmwVar12 = (ddmw) ddmvVar.b;
        dsrj<String> dsrjVar = ddmwVar12.k;
        if (!dsrjVar.a()) {
            ddmwVar12.k = dsqw.cl(dsrjVar);
        }
        dsod.bv(arrayList, ddmwVar12.k);
        return ddmvVar.bK();
    }

    private final void q() {
        if (this.q != 0) {
            this.r = Math.max(this.r, this.g.e() - this.q);
        }
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.btpa
    public final synchronized void a(boolean z) {
        Boolean bool = this.t;
        if (bool == null || bool.booleanValue() != z) {
            Context context = this.a;
            ddlk bZ = ddll.e.bZ();
            Intent d = btox.d(context);
            if (d != null) {
                int c = btox.c(d);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddll ddllVar = (ddll) bZ.b;
                ddllVar.a |= 4;
                ddllVar.d = c;
            }
            int i = 3;
            if (z) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddll ddllVar2 = (ddll) bZ.b;
                ddllVar2.b = 1;
                ddllVar2.a |= 1;
                if (d != null) {
                    int b = cjsc.b(d);
                    if (b != 1) {
                        i = b;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddll ddllVar3 = (ddll) bZ.b;
                    ddllVar3.c = i - 1;
                    ddllVar3.a |= 2;
                }
            } else {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddll ddllVar4 = (ddll) bZ.b;
                ddllVar4.b = 3;
                ddllVar4.a |= 1;
                ddll ddllVar5 = (ddll) bZ.b;
                ddllVar5.c = 0;
                ddllVar5.a |= 2;
            }
            this.i.u(new cjtl(this.g, dukj.CHARGING_STATE_CHANGED, bZ.bK(), null, null, null, null, false, this.i.G()));
            this.t = Boolean.valueOf(z);
        }
    }

    @Override // defpackage.btpa
    public final synchronized void b() {
        boolean i = this.h.i();
        ddon o2 = o(i);
        if (o2 != null) {
            this.k.b(ckgx.NETWORK_TYPE, new ppy(o2));
        }
        ddoo bK = o2 != null ? o2.bK() : null;
        Boolean bool = this.u;
        if (bool == null || bool.booleanValue() != i) {
            if (!i) {
                btyb btybVar = this.m;
                if (new Random().nextDouble() < btybVar.a.b(9)) {
                    csdo i2 = csdp.i();
                    i2.d(true);
                    i2.c(9);
                    btybVar.b.a(i2.e());
                }
            }
            this.i.u(new cjtl(this.g, dukj.NETWORK_TYPE_CHANGED, null, null, bK, null, null, false, this.i.G()));
            this.A.add(dbsi.a(p.format(new Date(this.g.b())), bK));
            this.u = Boolean.valueOf(i);
        }
    }

    @Override // defpackage.btpa
    public final synchronized void d(int i) {
        if (i != this.z) {
            this.k.b(ckgx.EFFECTIVE_NETWORK_QUALITY, new ppx(i));
            this.z = i;
        }
    }

    @Override // defpackage.btpa
    public final synchronized void e(dukj dukjVar, ddmw ddmwVar) {
        ddll a = cjsc.a(this.a);
        ddon o2 = o(this.h.i());
        ddoo bK = o2 != null ? o2.bK() : null;
        cjqy cjqyVar = this.i;
        boolean z = true;
        cjtk[] cjtkVarArr = new cjtk[1];
        cqat cqatVar = this.g;
        ddmw p2 = p(ddmwVar);
        AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
        int streamVolume = (audioManager.getStreamVolume(3) * 100) / audioManager.getStreamMaxVolume(3);
        ddrv bZ = ddrw.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddrw ddrwVar = (ddrw) bZ.b;
        ddrwVar.a |= 1;
        ddrwVar.b = streamVolume;
        boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddrw ddrwVar2 = (ddrw) bZ.b;
        ddrwVar2.a |= 2;
        ddrwVar2.c = isWiredHeadsetOn;
        if (!audioManager.isBluetoothScoOn() && !audioManager.isBluetoothA2dpOn()) {
            z = false;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddrw ddrwVar3 = (ddrw) bZ.b;
        ddrwVar3.a |= 4;
        ddrwVar3.d = z;
        cjtkVarArr[0] = new cjtl(cqatVar, dukjVar, a, null, bK, p2, bZ.bK(), false, this.i.G());
        cjqyVar.u(cjtkVarArr);
    }

    @Override // defpackage.btpa
    public final synchronized void f(@dzsi dukj dukjVar, ddmw ddmwVar) {
        this.i.u(new cjtl(this.g, dukjVar, null, null, null, p(ddmwVar), null, false, this.i.G()));
    }

    @Override // defpackage.btpa
    public final synchronized void g() {
        int i = this.d + 1;
        this.d = i;
        if (i <= 0) {
            bvoo.h("unregisterReceivers is called more than registerReceivers", new Object[0]);
        } else if (i > 1) {
        } else {
            this.a.registerReceiver(this.v, this.w);
            this.l.a().j(new ppz(this), bvrj.UI_THREAD, bvkw.ON_STARTUP_FULLY_COMPLETE);
        }
    }

    @Override // defpackage.btpa
    public final synchronized void h() {
        int i = this.d - 1;
        this.d = i;
        if (i < 0) {
            bvoo.h("unregisterReceivers is called when there's no receiver", new Object[0]);
        } else if (i > 0) {
        } else {
            this.a.unregisterReceiver(this.v);
            if (!this.e) {
                return;
            }
            this.a.unregisterReceiver(this.b);
            this.e = false;
        }
    }

    @Override // defpackage.btpa
    public final btpc i() {
        return this.h;
    }

    @Override // defpackage.btpa
    public final void j(Location location, long j) {
        this.x.a(location, j);
    }

    @Override // defpackage.btpa
    public final void k(ahlc ahlcVar) {
        this.y = ahlcVar;
    }

    @Override // defpackage.btpa
    public final long m() {
        q();
        return this.r;
    }

    @Override // defpackage.btpa
    public final void l(boolean z) {
        if (!z) {
            q();
            this.q = 0L;
        } else if (this.q != 0) {
        } else {
            this.q = this.g.e();
        }
    }
}
