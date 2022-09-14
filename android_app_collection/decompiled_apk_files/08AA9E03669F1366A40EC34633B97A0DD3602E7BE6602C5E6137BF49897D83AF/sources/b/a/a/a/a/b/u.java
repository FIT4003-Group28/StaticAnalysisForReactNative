package b.a.a.a.a.b;

import android.os.SystemClock;
import android.util.Log;
/* compiled from: TimingMetric.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f1109a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1110b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1111c;

    /* renamed from: d  reason: collision with root package name */
    private long f1112d;
    private long e;

    public u(String str, String str2) {
        this.f1109a = str;
        this.f1110b = str2;
        this.f1111c = !Log.isLoggable(str2, 2);
    }

    public synchronized void a() {
        if (this.f1111c) {
            return;
        }
        this.f1112d = SystemClock.elapsedRealtime();
        this.e = 0L;
    }

    public synchronized void b() {
        if (this.f1111c) {
            return;
        }
        if (this.e != 0) {
            return;
        }
        this.e = SystemClock.elapsedRealtime() - this.f1112d;
        c();
    }

    private void c() {
        String str = this.f1110b;
        Log.v(str, this.f1109a + ": " + this.e + "ms");
    }
}
