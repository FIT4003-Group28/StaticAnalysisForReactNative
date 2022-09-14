package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a  reason: collision with root package name */
    boolean f5361a = false;

    /* renamed from: b  reason: collision with root package name */
    s f5362b;

    /* renamed from: c  reason: collision with root package name */
    Callback f5363c;

    /* renamed from: d  reason: collision with root package name */
    int f5364d;

    public abstract void a(long j);

    public void a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }
}
