package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    /* renamed from: b  reason: collision with root package name */
    private final int f7087b;

    /* renamed from: c  reason: collision with root package name */
    private final long f7088c;

    /* renamed from: d  reason: collision with root package name */
    private int f7089d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7090e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7091f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7092g;

    /* renamed from: h  reason: collision with root package name */
    private final int f7093h;
    private final List<String> i;
    private final String j;
    private final long k;
    private int l;
    private final String m;
    private final float n;
    private final long o;
    private final boolean p;
    private long q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f2, long j3, String str5, boolean z) {
        this.f7087b = i;
        this.f7088c = j;
        this.f7089d = i2;
        this.f7090e = str;
        this.f7091f = str3;
        this.f7092g = str5;
        this.f7093h = i3;
        this.q = -1L;
        this.i = list;
        this.j = str2;
        this.k = j2;
        this.l = i4;
        this.m = str4;
        this.n = f2;
        this.o = j3;
        this.p = z;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f2, long j3, String str5, boolean z) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f2, j3, str5, z);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int q() {
        return this.f7089d;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long r() {
        return this.f7088c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String s() {
        String str = this.f7090e;
        int i = this.f7093h;
        List<String> list = this.i;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i2 = this.l;
        String str3 = this.f7091f;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.m;
        if (str4 == null) {
            str4 = str2;
        }
        float f2 = this.n;
        String str5 = this.f7092g;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.p;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long w() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f7087b);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, r());
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f7090e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f7093h);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.k);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, this.f7091f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, q());
        com.google.android.gms.common.internal.x.c.a(parcel, 12, this.j, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 13, this.m, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 14, this.l);
        com.google.android.gms.common.internal.x.c.a(parcel, 15, this.n);
        com.google.android.gms.common.internal.x.c.a(parcel, 16, this.o);
        com.google.android.gms.common.internal.x.c.a(parcel, 17, this.f7092g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 18, this.p);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
