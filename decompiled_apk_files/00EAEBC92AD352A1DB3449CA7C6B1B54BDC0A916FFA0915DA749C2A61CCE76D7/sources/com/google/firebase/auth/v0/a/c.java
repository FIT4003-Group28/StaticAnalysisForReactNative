package com.google.firebase.auth.v0.a;

import android.util.Log;
import java.util.Map;
/* loaded from: classes.dex */
final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final int f8456a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8457b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f8458c;

    public c(int i, int i2, Map<String, Integer> map) {
        this.f8456a = a() ? 0 : i;
        this.f8457b = i2;
        com.google.android.gms.common.internal.s.a(map);
        this.f8458c = map;
        a();
    }

    private static boolean a() {
        boolean equals = "local".equals(y2.a("firebear.preference"));
        if (equals) {
            Log.e("BiChannelGoogleApi", "Found local preference, will always use local service instance");
        }
        return equals;
    }

    @Override // com.google.firebase.auth.v0.a.g
    public final boolean a(String str) {
        int i = this.f8456a;
        if (i == 0) {
            return true;
        }
        if (this.f8457b <= i) {
            return false;
        }
        Integer num = this.f8458c.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue() > this.f8456a && this.f8457b >= num.intValue();
    }
}
