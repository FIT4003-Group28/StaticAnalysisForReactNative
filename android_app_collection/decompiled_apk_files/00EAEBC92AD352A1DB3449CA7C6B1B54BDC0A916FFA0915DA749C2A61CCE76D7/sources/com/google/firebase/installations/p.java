package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    public static final long f9367a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f9368b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return f9368b.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str) {
        return str.contains(":");
    }

    public long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    public boolean a(com.google.firebase.installations.q.d dVar) {
        return TextUtils.isEmpty(dVar.a()) || dVar.g() + dVar.b() < a() + f9367a;
    }
}
