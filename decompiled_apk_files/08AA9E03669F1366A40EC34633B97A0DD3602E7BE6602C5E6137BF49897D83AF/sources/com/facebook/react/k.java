package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.ab;
import com.facebook.react.bridge.ad;
import com.facebook.react.bridge.v;
import com.facebook.react.uimanager.ak;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReactInstanceManagerBuilder.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: b  reason: collision with root package name */
    private String f3476b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.react.bridge.o f3477c;

    /* renamed from: d  reason: collision with root package name */
    private String f3478d;
    private ad e;
    private Application f;
    private boolean g;
    private com.facebook.react.b.d h;
    private ak i;
    private ab j;
    private Activity k;
    private com.facebook.react.modules.core.b l;
    private com.facebook.react.devsupport.e m;
    private boolean n;
    private boolean o;
    private boolean p;
    private com.facebook.react.devsupport.a.a q;
    private v r;

    /* renamed from: a  reason: collision with root package name */
    private final List<n> f3475a = new ArrayList();
    private int s = 1;
    private int t = -1;

    public k a(ak akVar) {
        this.i = akVar;
        return this;
    }

    public k a(v vVar) {
        this.r = vVar;
        return this;
    }

    public k a(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.f3476b = str2;
        this.f3477c = null;
        return this;
    }

    public k b(String str) {
        if (str.startsWith("assets://")) {
            this.f3476b = str;
            this.f3477c = null;
            return this;
        }
        return a(com.facebook.react.bridge.o.a(str));
    }

    public k a(com.facebook.react.bridge.o oVar) {
        this.f3477c = oVar;
        this.f3476b = null;
        return this;
    }

    public k c(String str) {
        this.f3478d = str;
        return this;
    }

    public k a(n nVar) {
        this.f3475a.add(nVar);
        return this;
    }

    public k a(Application application) {
        this.f = application;
        return this;
    }

    public k a(boolean z) {
        this.g = z;
        return this;
    }

    public k a(com.facebook.react.b.d dVar) {
        this.h = dVar;
        return this;
    }

    public k a(com.facebook.react.devsupport.e eVar) {
        this.m = eVar;
        return this;
    }

    public j a() {
        com.facebook.j.a.a.a(this.f, "Application property has not been set with this builder");
        boolean z = true;
        com.facebook.j.a.a.a((!this.g && this.f3476b == null && this.f3477c == null) ? false : true, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.f3478d == null && this.f3476b == null && this.f3477c == null) {
            z = false;
        }
        com.facebook.j.a.a.a(z, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.i == null) {
            this.i = new ak();
        }
        return new j(this.f, this.k, this.l, this.r == null ? new com.facebook.react.bridge.p(this.f.getPackageName(), com.facebook.react.modules.systeminfo.a.b()) : this.r, (this.f3477c != null || this.f3476b == null) ? this.f3477c : com.facebook.react.bridge.o.a((Context) this.f, this.f3476b, false), this.f3478d, this.f3475a, this.g, this.e, (com.facebook.react.b.d) com.facebook.j.a.a.a(this.h, "Initial lifecycle state was not set"), this.i, this.j, this.m, this.n, this.o, this.p, this.q, this.s, this.t);
    }
}
