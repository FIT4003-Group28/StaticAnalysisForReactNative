package com.google.android.gms.common.m;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static InterfaceC0150a f7074a;

    /* renamed from: com.google.android.gms.common.m.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0150a {
        ScheduledExecutorService a();
    }

    public static synchronized InterfaceC0150a a() {
        InterfaceC0150a interfaceC0150a;
        synchronized (a.class) {
            if (f7074a == null) {
                f7074a = new b();
            }
            interfaceC0150a = f7074a;
        }
        return interfaceC0150a;
    }
}
