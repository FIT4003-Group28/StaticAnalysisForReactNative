package com.teslamotors.TeslaApp;

import com.facebook.react.modules.appstate.AppStateModule;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: AppStateHandler.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static b f4947a;

    /* renamed from: c  reason: collision with root package name */
    private final CopyOnWriteArraySet<WeakReference<com.teslamotors.TeslaApp.a>> f4949c = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    private a f4948b = a.UNINITIALIZED;

    /* compiled from: AppStateHandler.java */
    /* loaded from: classes.dex */
    public enum a {
        UNINITIALIZED("uninitialized"),
        BACKGROUND(AppStateModule.APP_STATE_BACKGROUND),
        INACTIVE("inactive"),
        ACTIVE(AppStateModule.APP_STATE_ACTIVE);
        
        private final String e;

        a(String str) {
            this.e = str;
        }

        public String a() {
            return this.e;
        }
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f4947a == null) {
                f4947a = new b();
            }
            bVar = f4947a;
        }
        return bVar;
    }

    private b() {
    }

    public String b() {
        return this.f4948b.a();
    }

    public void a(a aVar) {
        if (this.f4948b == a.BACKGROUND && aVar == a.INACTIVE) {
            return;
        }
        this.f4948b = aVar;
        Iterator<WeakReference<com.teslamotors.TeslaApp.a>> it = this.f4949c.iterator();
        while (it.hasNext()) {
            com.teslamotors.TeslaApp.a aVar2 = it.next().get();
            if (aVar2 != null) {
                aVar2.appStateDidChange(b());
            }
        }
    }

    public void a(com.teslamotors.TeslaApp.a aVar) {
        this.f4949c.add(new WeakReference<>(aVar));
    }
}
