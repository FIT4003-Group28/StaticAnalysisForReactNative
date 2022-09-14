package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ h lambda$getComponents$0(com.google.firebase.components.e eVar) {
        return new g((c.e.b.d) eVar.a(c.e.b.d.class), (c.e.b.p.h) eVar.a(c.e.b.p.h.class), (c.e.b.m.c) eVar.a(c.e.b.m.c.class));
    }

    @Override // com.google.firebase.components.h
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(h.class);
        a2.a(com.google.firebase.components.n.b(c.e.b.d.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.m.c.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.p.h.class));
        a2.a(j.a());
        return Arrays.asList(a2.b(), c.e.b.p.g.a("fire-installations", "16.3.3"));
    }
}
