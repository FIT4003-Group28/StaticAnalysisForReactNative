package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: rci  reason: default package */
/* loaded from: classes4.dex */
public final class rci implements qwi, qwj {
    public final LinkedBlockingQueue a;
    public final long b;
    protected final qad c;
    private final String d;
    private final String e;
    private final HandlerThread f;
    private final rcd g;
    private final int h;

    public rci(Context context, int i, String str, String str2, rcd rcdVar) {
        this.d = str;
        this.h = i;
        this.e = str2;
        this.g = rcdVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f = handlerThread;
        handlerThread.start();
        this.b = System.currentTimeMillis();
        qad qadVar = new qad(context, handlerThread.getLooper(), this, this, 19621000);
        this.c = qadVar;
        this.a = new LinkedBlockingQueue();
        qadVar.G();
    }

    public static ProgramResponse d() {
        return new ProgramResponse(1, null, 1);
    }

    @Override // defpackage.qwi
    public final void a(int i) {
        try {
            f(4011, this.b);
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.qwi
    public final void b() {
        rcq h = h();
        if (h != null) {
            try {
                ProgramRequest programRequest = new ProgramRequest(1, 1, this.h - 1, this.d, this.e);
                Parcel pv = h.pv();
                dve.g(pv, programRequest);
                Parcel pw = h.pw(3, pv);
                pw.recycle();
                f(5011, this.b);
                this.a.put((ProgramResponse) dve.a(pw, ProgramResponse.CREATOR));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // defpackage.qwj
    public final void c(ConnectionResult connectionResult) {
        try {
            f(4012, this.b);
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    public final void e() {
        qad qadVar = this.c;
        if (qadVar != null) {
            if (!qadVar.w() && !this.c.x()) {
                return;
            }
            this.c.l();
        }
    }

    public final void f(int i, long j) {
        g(i, j, null);
    }

    public final void g(int i, long j, Exception exc) {
        this.g.c(i, System.currentTimeMillis() - j, exc);
    }

    protected final rcq h() {
        try {
            return this.c.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
