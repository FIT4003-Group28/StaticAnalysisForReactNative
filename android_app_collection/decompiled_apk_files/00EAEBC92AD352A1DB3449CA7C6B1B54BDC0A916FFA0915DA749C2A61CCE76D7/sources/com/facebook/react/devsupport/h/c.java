package com.facebook.react.devsupport.h;

import android.view.View;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
/* loaded from: classes.dex */
public interface c extends NativeModuleCallExceptionHandler {
    View a(String str);

    void a(View view);

    void a(ReactContext reactContext);

    void a(d dVar);

    void a(String str, ReadableArray readableArray, int i);

    void a(String str, b bVar);

    void a(boolean z);

    boolean a();

    com.facebook.react.modules.debug.c.a b();

    void b(ReactContext reactContext);

    void b(String str, ReadableArray readableArray, int i);

    void b(boolean z);

    void c();

    void c(boolean z);

    void d();

    void d(boolean z);

    void e();

    void f();

    void g();
}
