package com.google.firebase.auth.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f8404a;

    static {
        HashMap hashMap = new HashMap();
        f8404a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f8404a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f8404a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f8404a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f8404a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static void a(Intent intent, Status status) {
        com.google.android.gms.common.internal.x.e.a(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean a(Intent intent) {
        com.google.android.gms.common.internal.s.a(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status b(Intent intent) {
        com.google.android.gms.common.internal.s.a(intent);
        com.google.android.gms.common.internal.s.a(a(intent));
        return (Status) com.google.android.gms.common.internal.x.e.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }
}
