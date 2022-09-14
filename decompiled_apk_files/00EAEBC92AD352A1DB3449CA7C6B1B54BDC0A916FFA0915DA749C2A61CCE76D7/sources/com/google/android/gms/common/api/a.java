package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.s;
import java.util.Set;
/* loaded from: classes.dex */
public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0144a<?, O> f6805a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6806b;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0144a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, f.a aVar, f.b bVar) {
            return a(context, looper, dVar, (com.google.android.gms.common.internal.d) o, (com.google.android.gms.common.api.internal.d) aVar, (com.google.android.gms.common.api.internal.j) bVar);
        }

        public T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, com.google.android.gms.common.api.internal.d dVar2, com.google.android.gms.common.api.internal.j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c<C extends b> {
    }

    /* loaded from: classes.dex */
    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0145a extends c, InterfaceC0146d {
            Account b();
        }

        /* loaded from: classes.dex */
        public interface b extends c {
            GoogleSignInAccount a();
        }

        /* loaded from: classes.dex */
        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0146d extends d {
        }

        /* loaded from: classes.dex */
        public interface e extends c, InterfaceC0146d {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<T extends b, O> {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        void a(c.InterfaceC0148c interfaceC0148c);

        void a(c.e eVar);

        void a(com.google.android.gms.common.internal.m mVar, Set<Scope> set);

        boolean a();

        Set<Scope> b();

        boolean c();

        int d();

        boolean e();

        com.google.android.gms.common.d[] g();

        String h();

        void i();

        boolean j();
    }

    /* loaded from: classes.dex */
    public static final class g<C extends f> extends c<C> {
    }

    /* loaded from: classes.dex */
    public interface h<T extends IInterface> extends b {
        T a(IBinder iBinder);

        void a(int i, T t);

        String l();

        String m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends f> a(String str, AbstractC0144a<C, O> abstractC0144a, g<C> gVar) {
        s.a(abstractC0144a, "Cannot construct an Api with a null ClientBuilder");
        s.a(gVar, "Cannot construct an Api with a null ClientKey");
        this.f6806b = str;
        this.f6805a = abstractC0144a;
    }

    public final String a() {
        return this.f6806b;
    }

    public final AbstractC0144a<?, O> b() {
        s.b(this.f6805a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f6805a;
    }
}
