package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: deps  reason: default package */
/* loaded from: classes6.dex */
public abstract class deps {
    public static synchronized deps getInstance() {
        deps depsVar;
        synchronized (deps.class) {
            depsVar = getInstance(dela.getInstance());
        }
        return depsVar;
    }

    public abstract cpcq<dept> a(Intent intent);

    public static synchronized deps getInstance(dela delaVar) {
        deps depsVar;
        synchronized (deps.class) {
            depsVar = (deps) delaVar.d(deps.class);
        }
        return depsVar;
    }
}
