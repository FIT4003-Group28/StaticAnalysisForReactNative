package com.google.firebase.auth.internal;

import java.util.Map;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final com.google.android.gms.common.l.a f8380a = new com.google.android.gms.common.l.a("GetTokenResultFactory", new String[0]);

    public static com.google.firebase.auth.b0 a(String str) {
        Map d2;
        try {
            d2 = m.a(str);
        } catch (com.google.firebase.auth.v0.b e2) {
            f8380a.a("Error parsing token claims", e2, new Object[0]);
            d2 = c.e.a.b.d.e.b0.d();
        }
        return new com.google.firebase.auth.b0(str, d2);
    }
}
