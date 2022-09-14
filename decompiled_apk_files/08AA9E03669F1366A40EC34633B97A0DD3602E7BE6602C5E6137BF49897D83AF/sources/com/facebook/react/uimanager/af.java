package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
/* compiled from: ThemedReactContext.java */
/* loaded from: classes.dex */
public class af extends com.facebook.react.bridge.aj {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.bridge.ah f3747a;

    public af(com.facebook.react.bridge.ah ahVar, Context context) {
        super(context);
        a(ahVar.a());
        this.f3747a = ahVar;
    }

    @Override // com.facebook.react.bridge.aj
    public void a(com.facebook.react.bridge.x xVar) {
        this.f3747a.a(xVar);
    }

    @Override // com.facebook.react.bridge.aj
    public void b(com.facebook.react.bridge.x xVar) {
        this.f3747a.b(xVar);
    }

    @Override // com.facebook.react.bridge.aj
    public Activity i() {
        return this.f3747a.i();
    }
}
