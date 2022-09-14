package com.facebook.react.bridge.queue;

import android.os.Build;
/* compiled from: ReactQueueConfigurationSpec.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f3278a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3279b;

    private f(b bVar, b bVar2) {
        this.f3278a = bVar;
        this.f3279b = bVar2;
    }

    public b a() {
        return this.f3278a;
    }

    public b b() {
        return this.f3279b;
    }

    public static a c() {
        return new a();
    }

    public static f d() {
        b a2;
        if (Build.VERSION.SDK_INT < 21) {
            a2 = b.a("native_modules", 2000000L);
        } else {
            a2 = b.a("native_modules");
        }
        return c().b(b.a("js")).a(a2).a();
    }

    /* compiled from: ReactQueueConfigurationSpec.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private b f3280a;

        /* renamed from: b  reason: collision with root package name */
        private b f3281b;

        public a a(b bVar) {
            com.facebook.j.a.a.a(this.f3280a == null, "Setting native modules queue spec multiple times!");
            this.f3280a = bVar;
            return this;
        }

        public a b(b bVar) {
            com.facebook.j.a.a.a(this.f3281b == null, "Setting JS queue multiple times!");
            this.f3281b = bVar;
            return this;
        }

        public f a() {
            return new f((b) com.facebook.j.a.a.b(this.f3280a), (b) com.facebook.j.a.a.b(this.f3281b));
        }
    }
}
