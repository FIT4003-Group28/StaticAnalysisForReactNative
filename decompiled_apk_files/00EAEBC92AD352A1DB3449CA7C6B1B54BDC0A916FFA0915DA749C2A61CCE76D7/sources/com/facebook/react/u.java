package com.facebook.react;

import android.app.Application;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.p0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    private final Application f5850a;

    /* renamed from: b  reason: collision with root package name */
    private r f5851b;

    /* JADX INFO: Access modifiers changed from: protected */
    public u(Application application) {
        this.f5850a = application;
    }

    protected r a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        s k = r.k();
        k.a(this.f5850a);
        k.c(e());
        k.a(k());
        k.a(i());
        k.a(f());
        k.a(j());
        k.a(d());
        k.a(LifecycleState.BEFORE_CREATE);
        for (v vVar : g()) {
            k.a(vVar);
        }
        String c2 = c();
        if (c2 != null) {
            k.b(c2);
        } else {
            String b2 = b();
            c.d.k.a.a.a(b2);
            k.a(b2);
        }
        r a2 = k.a();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return a2;
    }

    protected String b() {
        return "index.android.bundle";
    }

    protected String c() {
        return null;
    }

    protected JSIModulePackage d() {
        return null;
    }

    protected abstract String e();

    protected JavaScriptExecutorFactory f() {
        return null;
    }

    protected abstract List<v> g();

    public r h() {
        if (this.f5851b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f5851b = a();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f5851b;
    }

    protected com.facebook.react.devsupport.f i() {
        return null;
    }

    protected p0 j() {
        return new p0();
    }

    public abstract boolean k();

    public boolean l() {
        return this.f5851b != null;
    }
}
