package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.f0;
/* loaded from: classes.dex */
public class FirebaseMessaging {
    @SuppressLint({"FirebaseUnknownNullness"})

    /* renamed from: d  reason: collision with root package name */
    static c.e.a.a.g f9422d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f9423a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseInstanceId f9424b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.b.g.h<a0> f9425c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(c.e.b.d dVar, FirebaseInstanceId firebaseInstanceId, c.e.b.p.h hVar, c.e.b.m.c cVar, com.google.firebase.installations.h hVar2, c.e.a.a.g gVar) {
        f9422d = gVar;
        this.f9424b = firebaseInstanceId;
        this.f9423a = dVar.b();
        this.f9425c = a0.a(dVar, firebaseInstanceId, new f0(this.f9423a), hVar, cVar, hVar2, this.f9423a, h.c());
        this.f9425c.a(h.d(), new c.e.a.b.g.e(this) { // from class: com.google.firebase.messaging.i

            /* renamed from: a  reason: collision with root package name */
            private final FirebaseMessaging f9464a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9464a = this;
            }

            @Override // c.e.a.b.g.e
            public final void a(Object obj) {
                this.f9464a.a((a0) obj);
            }
        });
    }

    public static synchronized FirebaseMessaging b() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(c.e.b.d.k());
        }
        return firebaseMessaging;
    }

    public static c.e.a.a.g c() {
        return f9422d;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(c.e.b.d dVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) dVar.a(FirebaseMessaging.class);
        }
        return firebaseMessaging;
    }

    public c.e.a.b.g.h<Void> a(final String str) {
        return this.f9425c.a(new c.e.a.b.g.g(str) { // from class: com.google.firebase.messaging.j

            /* renamed from: a  reason: collision with root package name */
            private final String f9465a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9465a = str;
            }

            @Override // c.e.a.b.g.g
            public final c.e.a.b.g.h a(Object obj) {
                c.e.a.b.g.h a2;
                a2 = ((a0) obj).a(this.f9465a);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(a0 a0Var) {
        if (a()) {
            a0Var.c();
        }
    }

    public void a(s sVar) {
        if (!TextUtils.isEmpty(sVar.y())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f9423a, 0, intent2, 0));
            intent.setPackage("com.google.android.gms");
            sVar.a(intent);
            this.f9423a.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void a(boolean z) {
        this.f9424b.a(z);
    }

    public boolean a() {
        return this.f9424b.i();
    }

    public c.e.a.b.g.h<Void> b(final String str) {
        return this.f9425c.a(new c.e.a.b.g.g(str) { // from class: com.google.firebase.messaging.k

            /* renamed from: a  reason: collision with root package name */
            private final String f9466a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f9466a = str;
            }

            @Override // c.e.a.b.g.g
            public final c.e.a.b.g.h a(Object obj) {
                c.e.a.b.g.h b2;
                b2 = ((a0) obj).b(this.f9466a);
                return b2;
            }
        });
    }
}
