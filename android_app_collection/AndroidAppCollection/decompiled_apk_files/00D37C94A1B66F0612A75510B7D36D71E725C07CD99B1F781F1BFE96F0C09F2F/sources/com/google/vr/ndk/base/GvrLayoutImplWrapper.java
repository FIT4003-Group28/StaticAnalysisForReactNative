package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.View;
import com.google.vr.vrcore.library.api.ObjectWrapper;
/* compiled from: PG */
/* loaded from: classes3.dex */
class GvrLayoutImplWrapper extends axgc {
    private final GvrLayoutImpl impl;

    public GvrLayoutImplWrapper(GvrLayoutImpl gvrLayoutImpl) {
        this.impl = gvrLayoutImpl;
    }

    @Override // defpackage.axgd
    public boolean enableAsyncReprojection(int i) {
        return this.impl.enableAsyncReprojection(i);
    }

    @Override // defpackage.axgd
    public boolean enableCardboardTriggerEmulation(axgj axgjVar) {
        return this.impl.enableCardboardTriggerEmulation((Runnable) ObjectWrapper.b(axgjVar, Runnable.class));
    }

    @Override // defpackage.axgd
    public long getNativeGvrContext() {
        return this.impl.getGvrApi().getNativeGvrContext();
    }

    @Override // defpackage.axgd
    public axgj getRootView() {
        return ObjectWrapper.a(this.impl);
    }

    @Override // defpackage.axgd
    public axgg getUiLayout() {
        return this.impl.getUiLayoutImpl();
    }

    @Override // defpackage.axgd
    public void onBackPressed() {
        this.impl.onBackPressed();
    }

    @Override // defpackage.axgd
    public void onPause() {
        this.impl.onPause();
    }

    @Override // defpackage.axgd
    public void onResume() {
        this.impl.onResume();
    }

    @Override // defpackage.axgd
    public boolean setOnDonNotNeededListener(axgj axgjVar) {
        return this.impl.setOnDonNotNeededListener((Runnable) ObjectWrapper.b(axgjVar, Runnable.class));
    }

    @Override // defpackage.axgd
    public void setPresentationView(axgj axgjVar) {
        this.impl.setPresentationView((View) ObjectWrapper.b(axgjVar, View.class));
    }

    @Override // defpackage.axgd
    public void setReentryIntent(axgj axgjVar) {
        this.impl.setReentryIntent((PendingIntent) ObjectWrapper.b(axgjVar, PendingIntent.class));
    }

    @Override // defpackage.axgd
    public void setStereoModeEnabled(boolean z) {
        this.impl.setStereoModeEnabled(z);
    }

    @Override // defpackage.axgd
    public void shutdown() {
        this.impl.shutdown();
    }
}
