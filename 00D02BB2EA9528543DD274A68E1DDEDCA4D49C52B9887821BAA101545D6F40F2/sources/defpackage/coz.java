package defpackage;

import com.google.android.apps.auto.sdk.vanagon.PhoneSysUiClient$ScreenshotProvider;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: coz  reason: default package */
/* loaded from: classes5.dex */
public final class coz implements InvocationHandler {
    final /* synthetic */ PhoneSysUiClient$ScreenshotProvider a;
    final /* synthetic */ cpb b;

    public coz(cpb cpbVar, PhoneSysUiClient$ScreenshotProvider phoneSysUiClient$ScreenshotProvider) {
        this.b = cpbVar;
        this.a = phoneSysUiClient$ScreenshotProvider;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (!method.getName().equals("getScreenshot") || parameterTypes.length != 1 || parameterTypes[0] != this.b.b) {
            if (String.valueOf(method.getName()).length() == 0) {
                new String("Could not invoke this method in screenshotProvider: ");
            }
            return null;
        }
        ((ashx) this.a).a.c.a().B(new ashw(new coy(objArr)));
        return null;
    }
}
