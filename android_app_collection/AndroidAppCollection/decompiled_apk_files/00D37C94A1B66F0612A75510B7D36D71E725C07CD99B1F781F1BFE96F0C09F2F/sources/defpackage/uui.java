package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: PG */
/* renamed from: uui  reason: default package */
/* loaded from: classes4.dex */
public final class uui {
    public final uuk a;

    public uui(Context context, uuk uukVar) {
        this.a = uukVar;
        Application application = (Application) context;
        application.registerActivityLifecycleCallbacks(uukVar.b);
        application.registerComponentCallbacks(uukVar.b);
    }

    public final void a(uuh uuhVar) {
        uuk uukVar = this.a;
        uuhVar.getClass();
        uuj uujVar = uukVar.b;
        int i = uuj.c;
        uujVar.a.add(uuhVar);
    }

    public final void b(uuh uuhVar) {
        uuk uukVar = this.a;
        uuhVar.getClass();
        uuj uujVar = uukVar.b;
        int i = uuj.c;
        uujVar.a.remove(uuhVar);
    }
}
