package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Account f6989a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f6990b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f6991c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b> f6992d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6993e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6994f;

    /* renamed from: g  reason: collision with root package name */
    private final c.e.a.b.e.a f6995g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f6996h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f6997a;

        /* renamed from: b  reason: collision with root package name */
        private a.e.b<Scope> f6998b;

        /* renamed from: c  reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f6999c;

        /* renamed from: e  reason: collision with root package name */
        private View f7001e;

        /* renamed from: f  reason: collision with root package name */
        private String f7002f;

        /* renamed from: g  reason: collision with root package name */
        private String f7003g;
        private boolean i;

        /* renamed from: d  reason: collision with root package name */
        private int f7000d = 0;

        /* renamed from: h  reason: collision with root package name */
        private c.e.a.b.e.a f7004h = c.e.a.b.e.a.k;

        public final a a(Account account) {
            this.f6997a = account;
            return this;
        }

        public final a a(String str) {
            this.f7003g = str;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.f6998b == null) {
                this.f6998b = new a.e.b<>();
            }
            this.f6998b.addAll(collection);
            return this;
        }

        public final d a() {
            return new d(this.f6997a, this.f6998b, this.f6999c, this.f7000d, this.f7001e, this.f7002f, this.f7003g, this.f7004h, this.i);
        }

        public final a b(String str) {
            this.f7002f = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f7005a;
    }

    public d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i, View view, String str, String str2, c.e.a.b.e.a aVar, boolean z) {
        this.f6989a = account;
        this.f6990b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f6992d = map == null ? Collections.emptyMap() : map;
        this.f6993e = str;
        this.f6994f = str2;
        this.f6995g = aVar;
        HashSet hashSet = new HashSet(this.f6990b);
        for (b bVar : this.f6992d.values()) {
            hashSet.addAll(bVar.f7005a);
        }
        this.f6991c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.f6989a;
    }

    public final void a(Integer num) {
        this.f6996h = num;
    }

    public final Account b() {
        Account account = this.f6989a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.f6991c;
    }

    public final Integer d() {
        return this.f6996h;
    }

    public final String e() {
        return this.f6994f;
    }

    public final String f() {
        return this.f6993e;
    }

    public final Set<Scope> g() {
        return this.f6990b;
    }

    public final c.e.a.b.e.a h() {
        return this.f6995g;
    }
}
