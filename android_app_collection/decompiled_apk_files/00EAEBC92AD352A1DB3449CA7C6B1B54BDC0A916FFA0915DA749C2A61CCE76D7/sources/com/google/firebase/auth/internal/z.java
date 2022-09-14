package com.google.firebase.auth.internal;

import c.e.a.b.d.e.k3;
import com.google.firebase.auth.a1;
/* loaded from: classes.dex */
public final class z {
    public static k3 a(com.google.firebase.auth.h hVar, String str) {
        com.google.android.gms.common.internal.s.a(hVar);
        if (com.google.firebase.auth.e0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.e0.a((com.google.firebase.auth.e0) hVar, str);
        }
        if (com.google.firebase.auth.l.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.l.a((com.google.firebase.auth.l) hVar, str);
        }
        if (com.google.firebase.auth.r0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.r0.a((com.google.firebase.auth.r0) hVar, str);
        }
        if (com.google.firebase.auth.c0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.c0.a((com.google.firebase.auth.c0) hVar, str);
        }
        if (com.google.firebase.auth.p0.class.isAssignableFrom(hVar.getClass())) {
            return com.google.firebase.auth.p0.a((com.google.firebase.auth.p0) hVar, str);
        }
        if (!a1.class.isAssignableFrom(hVar.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        return a1.a((a1) hVar, str);
    }
}
