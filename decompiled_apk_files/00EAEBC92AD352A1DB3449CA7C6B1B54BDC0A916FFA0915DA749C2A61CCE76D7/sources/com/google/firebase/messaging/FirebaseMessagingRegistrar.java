package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements com.google.firebase.components.h {

    /* loaded from: classes.dex */
    private static class b<T> implements c.e.a.a.f<T> {
        private b() {
        }

        @Override // c.e.a.a.f
        public void a(c.e.a.a.c<T> cVar) {
        }

        @Override // c.e.a.a.f
        public void a(c.e.a.a.c<T> cVar, c.e.a.a.h hVar) {
            hVar.a(null);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements c.e.a.a.g {
        @Override // c.e.a.a.g
        public <T> c.e.a.a.f<T> a(String str, Class<T> cls, c.e.a.a.b bVar, c.e.a.a.e<T, byte[]> eVar) {
            return new b();
        }
    }

    static c.e.a.a.g determineFactory(c.e.a.a.g gVar) {
        return (gVar == null || !com.google.android.datatransport.cct.a.f6586g.a().contains(c.e.a.a.b.a("json"))) ? new c() : gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(com.google.firebase.components.e eVar) {
        return new FirebaseMessaging((c.e.b.d) eVar.a(c.e.b.d.class), (FirebaseInstanceId) eVar.a(FirebaseInstanceId.class), (c.e.b.p.h) eVar.a(c.e.b.p.h.class), (c.e.b.m.c) eVar.a(c.e.b.m.c.class), (com.google.firebase.installations.h) eVar.a(com.google.firebase.installations.h.class), determineFactory((c.e.a.a.g) eVar.a(c.e.a.a.g.class)));
    }

    @Override // com.google.firebase.components.h
    @Keep
    public List<com.google.firebase.components.d<?>> getComponents() {
        d.b a2 = com.google.firebase.components.d.a(FirebaseMessaging.class);
        a2.a(com.google.firebase.components.n.b(c.e.b.d.class));
        a2.a(com.google.firebase.components.n.b(FirebaseInstanceId.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.p.h.class));
        a2.a(com.google.firebase.components.n.b(c.e.b.m.c.class));
        a2.a(com.google.firebase.components.n.a(c.e.a.a.g.class));
        a2.a(com.google.firebase.components.n.b(com.google.firebase.installations.h.class));
        a2.a(l.f9467a);
        a2.a();
        return Arrays.asList(a2.b(), c.e.b.p.g.a("fire-fcm", "20.2.4"));
    }
}
