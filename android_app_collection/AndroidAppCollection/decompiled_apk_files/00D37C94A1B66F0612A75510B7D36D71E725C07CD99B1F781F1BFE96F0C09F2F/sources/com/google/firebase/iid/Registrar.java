package com.google.firebase.iid;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Registrar implements anxq {
    @Override // defpackage.anxq
    public List getComponents() {
        anxm a = anxn.a(FirebaseInstanceId.class);
        a.b(anxy.c(anwg.class));
        a.b(anxy.b(aodn.class));
        a.b(anxy.b(anzl.class));
        a.b(anxy.c(aoal.class));
        a.c(anyl.d);
        a.e();
        anxn a2 = a.a();
        anxm a3 = anxn.a(aoae.class);
        a3.b(anxy.c(FirebaseInstanceId.class));
        a3.c(anyl.e);
        return Arrays.asList(a2, a3.a(), aodm.a("fire-iid", "21.1.1"));
    }
}
