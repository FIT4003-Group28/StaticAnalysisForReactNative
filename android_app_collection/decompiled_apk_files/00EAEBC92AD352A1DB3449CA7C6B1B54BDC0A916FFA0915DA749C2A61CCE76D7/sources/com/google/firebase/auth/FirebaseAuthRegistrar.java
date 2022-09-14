package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseAuthRegistrar implements com.google.firebase.components.h {
    @Override // com.google.firebase.components.h
    @Keep
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(FirebaseAuth.class, com.google.firebase.auth.internal.b.class);
        a2.a(com.google.firebase.components.n.b(c.e.b.d.class));
        a2.a(m1.f8423a);
        a2.c();
        return Arrays.asList(a2.b(), c.e.b.p.g.a("fire-auth", "19.3.1"));
    }
}
