package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public final class Registrar implements com.google.firebase.components.h {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements com.google.firebase.iid.z0.a {

        /* renamed from: a  reason: collision with root package name */
        final FirebaseInstanceId f9205a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f9205a = firebaseInstanceId;
        }

        @Override // com.google.firebase.iid.z0.a
        public String a() {
            return this.f9205a.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(com.google.firebase.components.e eVar) {
        return new FirebaseInstanceId((c.e.b.d) eVar.a(c.e.b.d.class), (c.e.b.l.d) eVar.a(c.e.b.l.d.class), (c.e.b.p.h) eVar.a(c.e.b.p.h.class), (c.e.b.m.c) eVar.a(c.e.b.m.c.class), (com.google.firebase.installations.h) eVar.a(com.google.firebase.installations.h.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ com.google.firebase.iid.z0.a lambda$getComponents$1$Registrar(com.google.firebase.components.e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.h
    @Keep
    public final List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(FirebaseInstanceId.class);
        a2.a(com.google.firebase.components.n.b(c.e.b.d.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.l.d.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.p.h.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.m.c.class));
        a2.a(com.google.firebase.components.n.b(com.google.firebase.installations.h.class));
        a2.a(g0.f9229a);
        a2.a();
        com.google.firebase.components.d b2 = a2.b();
        d.b a3 = com.google.firebase.components.d.a(com.google.firebase.iid.z0.a.class);
        a3.a(com.google.firebase.components.n.b(FirebaseInstanceId.class));
        a3.a(h0.f9231a);
        return Arrays.asList(b2, a3.b(), c.e.b.p.g.a("fire-iid", "20.2.3"));
    }
}
