package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.TimeZone;
/* compiled from: PG */
/* renamed from: qqe  reason: default package */
/* loaded from: classes4.dex */
public final class qqe {
    public final qqh a;
    public final axiq b;
    boolean c;
    public ArrayList d;
    public ArrayList e;
    public ArrayList f;
    public final boolean g;
    public String h;
    public String i;
    public final vpn j;
    public int k;
    public sqx l;

    public qqe(qqh qqhVar, aoob aoobVar, vpn vpnVar) {
        axiq g = axir.g();
        this.b = g;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = true;
        this.a = qqhVar;
        this.i = qqhVar.j;
        this.h = qqhVar.k;
        this.k = qqhVar.l;
        long currentTimeMillis = System.currentTimeMillis();
        g.copyOnWrite();
        ((axir) g.instance).v(currentTimeMillis);
        int offset = TimeZone.getDefault().getOffset(((axir) g.instance).e());
        g.copyOnWrite();
        ((axir) g.instance).z(offset / 1000);
        if (sre.d(qqhVar.e)) {
            boolean d = sre.d(qqhVar.e);
            g.copyOnWrite();
            ((axir) g.instance).x(d);
        }
        if (SystemClock.elapsedRealtime() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g.copyOnWrite();
            ((axir) g.instance).w(elapsedRealtime);
        }
        if (aoobVar != null) {
            g.copyOnWrite();
            ((axir) g.instance).y(aoobVar);
        }
        this.j = vpnVar;
    }

    public final int a() {
        return ((axir) this.b.instance).a();
    }

    public final qta b() {
        if (!this.c) {
            this.c = true;
            return this.a.m.a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    public final void c(int i) {
        axiq axiqVar = this.b;
        axiqVar.copyOnWrite();
        ((axir) axiqVar.instance).t(i);
    }

    public final void d(long j) {
        axiq axiqVar = this.b;
        axiqVar.copyOnWrite();
        ((axir) axiqVar.instance).u(j);
    }

    public final void e(String str) {
        if (this.a.g.contains(qqg.ACCOUNT_NAME)) {
            this.h = str;
            return;
        }
        throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearcutLogger.LogEventBuilder[");
        sb.append("uploadAccount: ");
        sb.append(this.h);
        sb.append(", logSourceName: ");
        sb.append(this.i);
        sb.append(", qosTier: ");
        int i = this.k;
        int i2 = i - 1;
        String str = null;
        if (i != 0) {
            sb.append(i2);
            sb.append(", loggingId: null, MessageProducer: ");
            sb.append(this.j);
            sb.append(", veMessageProducer: ");
            sb.append((Object) null);
            sb.append(", testCodes: ");
            ArrayList arrayList = this.d;
            sb.append(arrayList != null ? qqh.c(arrayList) : null);
            sb.append(", mendelPackages: ");
            ArrayList arrayList2 = this.e;
            sb.append(arrayList2 != null ? qqh.c(arrayList2) : null);
            sb.append(", experimentIds: ");
            ArrayList arrayList3 = this.f;
            if (arrayList3 != null) {
                str = qqh.c(arrayList3);
            }
            sb.append(str);
            sb.append(", experimentTokens: null, experimentTokensBytes: ");
            qso qsoVar = qqh.a;
            sb.append("null, addPhenotype: ");
            sb.append(true);
            sb.append(", logVerifier: ");
            sb.append(this.l);
            sb.append("]");
            return sb.toString();
        }
        throw null;
    }
}
