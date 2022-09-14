package com.google.firebase.messaging;

import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f9469a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f9470b;

    /* loaded from: classes.dex */
    static class a implements c.e.b.k.d<n> {
        @Override // c.e.b.k.d
        public void a(n nVar, c.e.b.k.e eVar) {
            Intent b2 = nVar.b();
            eVar.mo167a("ttl", q.l(b2));
            eVar.mo169a("event", nVar.a());
            eVar.mo169a("instanceId", q.b());
            eVar.mo167a("priority", q.j(b2));
            eVar.mo169a("packageName", q.c());
            eVar.mo169a("sdkPlatform", "ANDROID");
            eVar.mo169a("messageType", q.h(b2));
            String e2 = q.e(b2);
            if (e2 != null) {
                eVar.mo169a("messageId", e2);
            }
            String k = q.k(b2);
            if (k != null) {
                eVar.mo169a("topic", k);
            }
            String a2 = q.a(b2);
            if (a2 != null) {
                eVar.mo169a("collapseKey", a2);
            }
            if (q.f(b2) != null) {
                eVar.mo169a("analyticsLabel", q.f(b2));
            }
            if (q.c(b2) != null) {
                eVar.mo169a("composerLabel", q.c(b2));
            }
            String d2 = q.d();
            if (d2 != null) {
                eVar.mo169a("projectNumber", d2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final n f9471a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(n nVar) {
            com.google.android.gms.common.internal.s.a(nVar);
            this.f9471a = nVar;
        }

        final n a() {
            return this.f9471a;
        }
    }

    /* loaded from: classes.dex */
    static final class c implements c.e.b.k.d<b> {
        @Override // c.e.b.k.d
        public final void a(b bVar, c.e.b.k.e eVar) {
            eVar.mo169a("messaging_client_event", bVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(String str, Intent intent) {
        com.google.android.gms.common.internal.s.a(str, (Object) "evenType must be non-null");
        this.f9469a = str;
        com.google.android.gms.common.internal.s.a(intent, "intent must be non-null");
        this.f9470b = intent;
    }

    final String a() {
        return this.f9469a;
    }

    final Intent b() {
        return this.f9470b;
    }
}
