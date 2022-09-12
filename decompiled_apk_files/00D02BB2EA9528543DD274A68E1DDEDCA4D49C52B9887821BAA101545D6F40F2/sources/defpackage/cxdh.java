package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cxdh  reason: default package */
/* loaded from: classes5.dex */
public final class cxdh {
    public static final cxdh b;
    public final long a;
    boolean c;
    public int d;
    private long e;

    static {
        int i = cqaz.a;
        b = new cxdh();
    }

    private cxdh() {
        this(SystemClock.elapsedRealtime());
    }

    private cxdh(long j) {
        this.e = -1L;
        this.d = 1;
        this.c = false;
        this.a = j;
    }

    public static cxdh a() {
        return new cxdh();
    }

    public static boolean b(@dzsi cxdh cxdhVar) {
        return cxdhVar == null || cxdhVar == b;
    }

    public final cxdh c() {
        return new cxdh(this.a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long d() {
        return this.e - this.a;
    }

    public final void e() {
        this.e = SystemClock.elapsedRealtime();
    }
}
