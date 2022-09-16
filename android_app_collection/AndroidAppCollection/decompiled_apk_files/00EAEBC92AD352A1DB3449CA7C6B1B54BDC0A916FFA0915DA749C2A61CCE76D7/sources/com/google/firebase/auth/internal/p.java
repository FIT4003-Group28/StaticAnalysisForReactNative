package com.google.firebase.auth.internal;

import android.text.TextUtils;
import c.e.a.b.d.e.a3;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class p {
    public static com.google.firebase.auth.h0 a(a3 a3Var) {
        if (a3Var != null && !TextUtils.isEmpty(a3Var.f())) {
            return new com.google.firebase.auth.o0(a3Var.j(), a3Var.q(), a3Var.k(), a3Var.f());
        }
        return null;
    }

    public static List<com.google.firebase.auth.h0> a(List<a3> list) {
        if (list == null || list.isEmpty()) {
            return c.e.a.b.d.e.w.f();
        }
        ArrayList arrayList = new ArrayList();
        for (a3 a3Var : list) {
            com.google.firebase.auth.h0 a2 = a(a3Var);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
