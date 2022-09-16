package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: rch  reason: default package */
/* loaded from: classes4.dex */
public final class rch implements qwi, qwj {
    public final LinkedBlockingQueue a;
    protected final qad b;
    private final String c;
    private final String d;
    private final HandlerThread e;

    public rch(Context context, String str, String str2) {
        this.c = str;
        this.d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        qad qadVar = new qad(context, handlerThread.getLooper(), this, this, 9200000);
        this.b = qadVar;
        this.a = new LinkedBlockingQueue();
        qadVar.G();
    }

    public static dnw d() {
        aopa createBuilder = dnw.a.createBuilder();
        createBuilder.copyOnWrite();
        dnw dnwVar = (dnw) createBuilder.instance;
        dnwVar.b |= 524288;
        dnwVar.p = 32768L;
        return (dnw) createBuilder.mo39build();
    }

    @Override // defpackage.qwi
    public final void a(int i) {
        try {
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.qwi
    public final void b() {
        rcq f = f();
        if (f != null) {
            try {
                try {
                    GassRequestParcel gassRequestParcel = new GassRequestParcel(1, this.c, this.d);
                    Parcel pv = f.pv();
                    dve.g(pv, gassRequestParcel);
                    Parcel pw = f.pw(1, pv);
                    GassResponseParcel gassResponseParcel = (GassResponseParcel) dve.a(pw, GassResponseParcel.CREATOR);
                    pw.recycle();
                    if (gassResponseParcel.b == null) {
                        try {
                            gassResponseParcel.b = (dnw) aopi.parseFrom(dnw.a, gassResponseParcel.c, aoos.a());
                            gassResponseParcel.c = null;
                        } catch (aopx | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    gassResponseParcel.a();
                    this.a.put(gassResponseParcel.b);
                } catch (Throwable unused) {
                    this.a.put(d());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                e();
                this.e.quit();
                throw th;
            }
            e();
            this.e.quit();
        }
    }

    @Override // defpackage.qwj
    public final void c(ConnectionResult connectionResult) {
        try {
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    public final void e() {
        qad qadVar = this.b;
        if (qadVar != null) {
            if (!qadVar.w() && !this.b.x()) {
                return;
            }
            this.b.l();
        }
    }

    protected final rcq f() {
        try {
            return this.b.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
