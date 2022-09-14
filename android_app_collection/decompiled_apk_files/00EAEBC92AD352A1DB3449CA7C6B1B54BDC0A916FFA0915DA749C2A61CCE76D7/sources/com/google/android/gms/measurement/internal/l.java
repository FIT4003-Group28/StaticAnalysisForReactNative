package com.google.android.gms.measurement.internal;
/* loaded from: classes.dex */
final class l {

    /* renamed from: a  reason: collision with root package name */
    final String f7437a;

    /* renamed from: b  reason: collision with root package name */
    final String f7438b;

    /* renamed from: c  reason: collision with root package name */
    final long f7439c;

    /* renamed from: d  reason: collision with root package name */
    final long f7440d;

    /* renamed from: e  reason: collision with root package name */
    final long f7441e;

    /* renamed from: f  reason: collision with root package name */
    final long f7442f;

    /* renamed from: g  reason: collision with root package name */
    final long f7443g;

    /* renamed from: h  reason: collision with root package name */
    final Long f7444h;
    final Long i;
    final Long j;
    final Boolean k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.b(str2);
        boolean z = true;
        com.google.android.gms.common.internal.s.a(j >= 0);
        com.google.android.gms.common.internal.s.a(j2 >= 0);
        com.google.android.gms.common.internal.s.a(j3 >= 0);
        com.google.android.gms.common.internal.s.a(j5 < 0 ? false : z);
        this.f7437a = str;
        this.f7438b = str2;
        this.f7439c = j;
        this.f7440d = j2;
        this.f7441e = j3;
        this.f7442f = j4;
        this.f7443g = j5;
        this.f7444h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j3, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l a(long j) {
        return new l(this.f7437a, this.f7438b, this.f7439c, this.f7440d, this.f7441e, j, this.f7443g, this.f7444h, this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l a(long j, long j2) {
        return new l(this.f7437a, this.f7438b, this.f7439c, this.f7440d, this.f7441e, this.f7442f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l a(Long l, Long l2, Boolean bool) {
        return new l(this.f7437a, this.f7438b, this.f7439c, this.f7440d, this.f7441e, this.f7442f, this.f7443g, this.f7444h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
