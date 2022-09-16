package defpackage;

import android.app.Application;
import android.location.Location;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awkq  reason: default package */
/* loaded from: classes3.dex */
public final class awkq {
    public static final long a = TimeUnit.HOURS.toMillis(2);
    public final avki b;
    public final btrm c;
    public final bvrv d;
    public final crzm<avzg> e;
    public final dehq f;
    public final dehq g;
    public final avpe h;
    @dzsi
    public volatile Location i;
    @dzsi
    public volatile crqf j;
    @dzsi
    public volatile String k;
    @dzsi
    public avoy l;
    @dzsi
    public avlm m;
    @dzsi
    public dehn<?> n;
    public final PowerManager.WakeLock o;
    private final awki p;

    public awkq(Application application, avki avkiVar, btrm btrmVar, bvrv bvrvVar, crzm<avzg> crzmVar, dehq dehqVar, dehq dehqVar2, awki awkiVar, avpe avpeVar) {
        this.b = avkiVar;
        this.c = btrmVar;
        this.d = bvrvVar;
        this.e = crzmVar;
        this.f = dehqVar;
        this.g = dehqVar2;
        this.p = awkiVar;
        this.h = avpeVar;
        String canonicalName = awkq.class.getCanonicalName();
        dbsk.s(canonicalName);
        this.o = ((PowerManager) application.getSystemService("power")).newWakeLock(1, canonicalName);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(dlsw dlswVar, int i) {
        if (this.j != null) {
            b(dlswVar, i, c(this.j.g()));
        } else {
            b(dlswVar, i, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(dlsw dlswVar, int i, @dzsi dvzn dvznVar) {
        dloc bK;
        this.o.acquire(a);
        dlof bZ = dlog.e.bZ();
        if (dvznVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlog dlogVar = (dlog) bZ.b;
            dvznVar.getClass();
            dlogVar.c = dvznVar;
            dlogVar.b = 1;
            bZ.bK();
        }
        TelephonyManager telephonyManager = this.p.a;
        if (telephonyManager == null) {
            bK = dloc.c;
        } else {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (dbsj.d(networkOperator)) {
                bK = dloc.c;
            } else if (networkOperator.length() < 5) {
                bK = dloc.c;
            } else {
                dlnz bZ2 = dloc.c.bZ();
                dloa bZ3 = dlob.d.bZ();
                String substring = networkOperator.substring(0, 3);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dlob dlobVar = (dlob) bZ3.b;
                substring.getClass();
                dlobVar.a |= 1;
                dlobVar.b = substring;
                String substring2 = networkOperator.substring(3);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dlob dlobVar2 = (dlob) bZ3.b;
                substring2.getClass();
                dlobVar2.a |= 2;
                dlobVar2.c = substring2;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dloc dlocVar = (dloc) bZ2.b;
                dlob bK2 = bZ3.bK();
                bK2.getClass();
                dlocVar.b = bK2;
                dlocVar.a = 1 | dlocVar.a;
                bK = bZ2.bK();
            }
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlog dlogVar2 = (dlog) bZ.b;
        bK.getClass();
        dlogVar2.d = bK;
        dlogVar2.a |= 2;
        avkh avkhVar = avkh.a;
        Location location = this.i;
        if (location != null) {
            avkg e = avkh.e();
            amvs amvsVar = new amvs();
            amvsVar.j(location);
            ((avjj) e).a = amvsVar.d();
            avkhVar = e.a();
        }
        this.b.P(dlswVar, bZ.bK(), i, avkhVar, new awkn(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final dvzn c(cray crayVar) {
        amuo amuoVar;
        if (crayVar == null || (amuoVar = crayVar.b) == null) {
            return null;
        }
        int i = amuoVar.j;
        akrk akrkVar = crayVar.a.l;
        if (i > 0) {
            akrkVar = akrk.f(akrkVar, i, akrkVar.l());
        }
        return akrkVar.j();
    }

    public final void d() {
        try {
            this.o.release();
        } catch (RuntimeException unused) {
        }
    }
}
