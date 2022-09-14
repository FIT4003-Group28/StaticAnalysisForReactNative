package io.invertase.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public class t extends io.invertase.firebase.common.m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(Context context, String str) {
        super(context, str);
    }

    public /* synthetic */ Void a(long j) {
        FirebaseAnalytics.getInstance(a()).a(j);
        return null;
    }

    public /* synthetic */ Void a(Activity activity, String str, String str2) {
        if (activity == null) {
            return null;
        }
        FirebaseAnalytics.getInstance(a()).setCurrentScreen(activity, str, str2);
        return null;
    }

    public /* synthetic */ Void a(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(a());
        for (String str : keySet) {
            firebaseAnalytics.a(str, (String) bundle.get(str));
        }
        return null;
    }

    public /* synthetic */ Void a(Boolean bool) {
        FirebaseAnalytics.getInstance(a()).a(bool.booleanValue());
        return null;
    }

    public /* synthetic */ Void a(String str) {
        FirebaseAnalytics.getInstance(a()).a(str);
        return null;
    }

    public /* synthetic */ Void a(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(a()).a(str, bundle);
        return null;
    }

    public /* synthetic */ Void a(String str, String str2) {
        FirebaseAnalytics.getInstance(a()).a(str, str2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(final Activity activity, final String str, final String str2) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(activity, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(final Bundle bundle) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(final Boolean bool) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(bool);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(final String str) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(final String str, final Bundle bundle) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(str, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> b(final String str, final String str2) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(str, str2);
            }
        });
    }

    public /* synthetic */ Void b() {
        FirebaseAnalytics.getInstance(a()).a();
        return null;
    }

    public /* synthetic */ Void b(long j) {
        FirebaseAnalytics.getInstance(a()).b(j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> c() {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> c(final long j) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.a(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c.e.a.b.g.h<Void> d(final long j) {
        return c.e.a.b.g.k.a(new Callable() { // from class: io.invertase.firebase.analytics.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.this.b(j);
            }
        });
    }
}
