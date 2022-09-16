package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.v;
import com.facebook.react.uimanager.ak;
import java.util.List;
/* compiled from: ReactNativeHost.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private final Application f3479a;

    /* renamed from: b  reason: collision with root package name */
    private j f3480b;

    protected com.facebook.react.devsupport.e d() {
        return null;
    }

    protected v e() {
        return null;
    }

    protected String g() {
        return "index.android";
    }

    protected String h() {
        return null;
    }

    protected String i() {
        return "index.android.bundle";
    }

    public abstract boolean j();

    protected abstract List<n> k();

    /* JADX INFO: Access modifiers changed from: protected */
    public m(Application application) {
        this.f3479a = application;
    }

    public j a() {
        if (this.f3480b == null) {
            this.f3480b = c();
        }
        return this.f3480b;
    }

    public boolean b() {
        return this.f3480b != null;
    }

    protected j c() {
        k a2 = j.a().a(this.f3479a).c(g()).a(j()).a(d()).a(e()).a(f()).a(com.facebook.react.b.d.BEFORE_CREATE);
        for (n nVar : k()) {
            a2.a(nVar);
        }
        String h = h();
        if (h != null) {
            a2.b(h);
        } else {
            a2.a((String) com.facebook.j.a.a.b(i()));
        }
        return a2.a();
    }

    protected ak f() {
        return new ak();
    }
}
