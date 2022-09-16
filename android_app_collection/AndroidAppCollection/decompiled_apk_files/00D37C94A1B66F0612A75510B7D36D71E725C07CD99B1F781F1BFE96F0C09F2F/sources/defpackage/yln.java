package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: yln  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yln {
    public static void a(ylo yloVar, Throwable th) {
        if (th != null) {
            yloVar.c(th);
        }
    }

    public static Bundle b(bpx bpxVar) {
        int length;
        if (bpxVar == null) {
            return Bundle.EMPTY;
        }
        byte[] d = bpxVar.d("task_extras_key");
        if (d == null || (length = d.length) == 0) {
            return Bundle.EMPTY;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(d, 0, length);
        obtain.setDataPosition(0);
        Bundle bundle = new Bundle();
        bundle.readFromParcel(obtain);
        obtain.recycle();
        return bundle;
    }

    public static void c(bqp bqpVar, int i, boolean z, Bundle bundle, yjn yjnVar, yjr yjrVar) {
        byte[] marshall;
        bpt bptVar = new bpt();
        int i2 = 2;
        bptVar.c = i != 1 ? i != 2 ? 1 : 3 : 2;
        bptVar.a = z;
        bqpVar.d(bptVar.a());
        Bundle a = yjrVar.a();
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (a != null) {
            bundle2.putAll(a);
        }
        bpx bpxVar = null;
        if (bundle2.isEmpty()) {
            marshall = null;
        } else {
            Parcel obtain = Parcel.obtain();
            bundle2.writeToParcel(obtain, 0);
            marshall = obtain.marshall();
            obtain.recycle();
        }
        if (marshall != null) {
            HashMap hashMap = new HashMap();
            bpd.c("task_extras_key", marshall, hashMap);
            bpxVar = bpd.a(hashMap);
        }
        if (bpxVar != null) {
            bqpVar.f(bpxVar);
        }
        if (yjnVar != null) {
            if (yjnVar.a == 0) {
                i2 = 1;
            }
            long j = yjnVar.b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            bqpVar.a = true;
            bum bumVar = bqpVar.c;
            bumVar.s = i2;
            long millis = timeUnit.toMillis(j);
            if (millis > 18000000) {
                bqf.a();
                bqf.g(bum.a, "Backoff delay duration exceeds maximum value", new Throwable[0]);
                millis = 18000000;
            }
            if (millis < 10000) {
                bqf.a();
                bqf.g(bum.a, "Backoff delay duration less than minimum value", new Throwable[0]);
                millis = 10000;
            }
            bumVar.m = millis;
        }
    }

    public static final dh d(ashn ashnVar) {
        ygp ygpVar = new ygp();
        Bundle bundle = new Bundle();
        bundle.putByteArray("transaction_response", ashnVar.toByteArray());
        ygpVar.ae(bundle);
        return ygpVar;
    }

    public static adz e(int i) {
        if (i != 1) {
            return i != 2 ? adz.i() : adz.h();
        }
        return adz.g();
    }
}
