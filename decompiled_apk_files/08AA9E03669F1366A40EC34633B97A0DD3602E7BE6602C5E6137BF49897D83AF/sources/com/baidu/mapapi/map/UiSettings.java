package com.baidu.mapapi.map;

import com.baidu.platform.comapi.map.C0132e;
/* loaded from: classes.dex */
public final class UiSettings {

    /* renamed from: a  reason: collision with root package name */
    private C0132e f1705a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UiSettings(C0132e c0132e) {
        this.f1705a = c0132e;
    }

    public boolean isCompassEnabled() {
        return this.f1705a.q();
    }

    public boolean isOverlookingGesturesEnabled() {
        return this.f1705a.y();
    }

    public boolean isRotateGesturesEnabled() {
        return this.f1705a.x();
    }

    public boolean isScrollGesturesEnabled() {
        return this.f1705a.v();
    }

    public boolean isZoomGesturesEnabled() {
        return this.f1705a.w();
    }

    public void setAllGesturesEnabled(boolean z) {
        setRotateGesturesEnabled(z);
        setScrollGesturesEnabled(z);
        setOverlookingGesturesEnabled(z);
        setZoomGesturesEnabled(z);
    }

    public void setCompassEnabled(boolean z) {
        this.f1705a.h(z);
    }

    public void setOverlookingGesturesEnabled(boolean z) {
        this.f1705a.p(z);
    }

    public void setRotateGesturesEnabled(boolean z) {
        this.f1705a.o(z);
    }

    public void setScrollGesturesEnabled(boolean z) {
        this.f1705a.m(z);
    }

    public void setZoomGesturesEnabled(boolean z) {
        this.f1705a.n(z);
    }
}
