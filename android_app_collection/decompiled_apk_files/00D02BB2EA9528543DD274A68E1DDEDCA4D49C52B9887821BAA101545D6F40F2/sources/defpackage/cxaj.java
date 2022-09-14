package defpackage;

import android.os.SystemClock;
/* compiled from: PG */
/* renamed from: cxaj  reason: default package */
/* loaded from: classes5.dex */
public final class cxaj {
    public final long a;
    public long b;
    public long c;
    public int d;
    public int e;
    final String f;
    final String g;
    final boolean h;
    String i;
    int j;
    public String k;
    String[] l;
    eaat m;
    int n;
    dzze o;
    int p;
    int q;
    public int r;
    public int s;
    int t;
    public int u;
    int v;
    int w;

    static {
        int i = cqaz.a;
    }

    public cxaj(String str) {
        this(null, str, false);
    }

    public static cxaj a(@dzsi String str, cwsv cwsvVar) {
        return new cxaj(str, cwsv.d(cwsvVar), true);
    }

    private cxaj(@dzsi String str, @dzsi String str2, boolean z) {
        this.w = 1;
        this.g = (str == null || str.isEmpty()) ? null : str;
        this.f = (str2 == null || str2.isEmpty()) ? null : str2;
        this.h = z;
        this.a = SystemClock.elapsedRealtime();
    }
}
