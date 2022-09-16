package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.ar.core.ImageMetadata;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cnjv  reason: default package */
/* loaded from: classes.dex */
public final class cnjv {
    public final cnjz a;
    public final cnjx b;
    public final dujh c;
    boolean d;
    public ArrayList<String> e;
    public ArrayList<Integer> f;
    public boolean g;
    public String h;
    public String i;
    public int j;
    public int k;

    public cnjv(cnjz cnjzVar, cnjx cnjxVar) {
        this(cnjzVar, null, cnjxVar);
    }

    public final cnoh<Status> a() {
        if (!this.d) {
            this.d = true;
            return this.a.q.a(this);
        }
        throw new IllegalStateException("do not reuse LogEventBuilder");
    }

    public final void b(int[] iArr) {
        if (iArr == null || (r0 = iArr.length) == 0) {
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        for (int i : iArr) {
            this.f.add(Integer.valueOf(i));
        }
    }

    public final void c(String str) {
        if (this.e == null) {
            this.e = new ArrayList<>();
        }
        this.e.add(str);
    }

    public final void d(int i) {
        dujh dujhVar = this.c;
        if (dujhVar.c) {
            dujhVar.bF();
            dujhVar.c = false;
        }
        duji dujiVar = (duji) dujhVar.b;
        duji dujiVar2 = duji.m;
        dujiVar.a |= 16;
        dujiVar.e = i;
    }

    public final void e(long j) {
        dujh dujhVar = this.c;
        if (dujhVar.c) {
            dujhVar.bF();
            dujhVar.c = false;
        }
        duji dujiVar = (duji) dujhVar.b;
        duji dujiVar2 = duji.m;
        dujiVar.a |= 64;
        dujiVar.g = j;
    }

    public final void f(String str) {
        if (!this.a.i) {
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
        sb.append(", logSource#: ");
        sb.append(this.j);
        sb.append(", qosTier: ");
        int i = this.k;
        sb.append((Object) (i != 0 ? dujj.a(i) : "null"));
        sb.append(", loggingId: ");
        sb.append((String) null);
        sb.append(", MessageProducer: ");
        sb.append(this.b);
        sb.append(", veMessageProducer: ");
        sb.append((Object) null);
        sb.append(", testCodes: ");
        sb.append((String) null);
        sb.append(", mendelPackages: ");
        ArrayList<String> arrayList = this.e;
        sb.append(arrayList != null ? cnjz.c(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList<Integer> arrayList2 = this.f;
        sb.append(arrayList2 != null ? cnjz.c(arrayList2) : null);
        sb.append(", experimentTokens: ");
        sb.append((String) null);
        sb.append(", experimentTokensBytes: ");
        cnoa<cnky> cnoaVar = cnjz.a;
        sb.append((String) null);
        sb.append(", addPhenotype: ");
        sb.append(this.g);
        sb.append(", logVerifier: ");
        sb.append((Object) null);
        sb.append("]");
        return sb.toString();
    }

    public cnjv(cnjz cnjzVar, dspd dspdVar, cnjx cnjxVar) {
        dujh dujhVar = (dujh) duji.m.bZ();
        this.c = dujhVar;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = true;
        this.a = cnjzVar;
        this.j = cnjzVar.m;
        this.i = cnjzVar.l;
        this.h = cnjzVar.n;
        this.k = cnjzVar.p;
        long currentTimeMillis = System.currentTimeMillis();
        if (dujhVar.c) {
            dujhVar.bF();
            dujhVar.c = false;
        }
        duji dujiVar = (duji) dujhVar.b;
        dujiVar.a = 1 | dujiVar.a;
        dujiVar.b = currentTimeMillis;
        long a = cnjy.a(((duji) dujhVar.b).b);
        if (dujhVar.c) {
            dujhVar.bF();
            dujhVar.c = false;
        }
        duji dujiVar2 = (duji) dujhVar.b;
        dujiVar2.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dujiVar2.i = a;
        if (cqvm.b(cnjzVar.g)) {
            boolean b = cqvm.b(cnjzVar.g);
            if (dujhVar.c) {
                dujhVar.bF();
                dujhVar.c = false;
            }
            duji dujiVar3 = (duji) dujhVar.b;
            dujiVar3.a |= 8388608;
            dujiVar3.k = b;
        }
        if (SystemClock.elapsedRealtime() != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (dujhVar.c) {
                dujhVar.bF();
                dujhVar.c = false;
            }
            duji dujiVar4 = (duji) dujhVar.b;
            dujiVar4.a |= 2;
            dujiVar4.c = elapsedRealtime;
        }
        if (dspdVar != null) {
            if (dujhVar.c) {
                dujhVar.bF();
                dujhVar.c = false;
            }
            duji dujiVar5 = (duji) dujhVar.b;
            dspdVar.getClass();
            dujiVar5.a |= 1024;
            dujiVar5.h = dspdVar;
        }
        this.b = cnjxVar;
    }
}
