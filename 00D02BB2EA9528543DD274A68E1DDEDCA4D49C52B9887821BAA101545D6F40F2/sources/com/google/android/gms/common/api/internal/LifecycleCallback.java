package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* loaded from: classes.dex */
public class LifecycleCallback {
    public final cnrx e;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(cnrx cnrxVar) {
        this.e = cnrxVar;
    }

    private static cnrx getChimeraLifecycleFragmentImpl(cnrw cnrwVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static cnrx m(cnrw cnrwVar) {
        cnrz cnrzVar;
        cnsz cnszVar;
        Object obj = cnrwVar.a;
        if (obj instanceof ff) {
            ff ffVar = (ff) obj;
            WeakReference<cnsz> weakReference = cnsz.a.get(ffVar);
            if (weakReference == null || (cnszVar = weakReference.get()) == null) {
                try {
                    cnszVar = (cnsz) ffVar.g().H("SupportLifecycleFragmentImpl");
                    if (cnszVar == null || cnszVar.u) {
                        cnszVar = new cnsz();
                        gz b = ffVar.g().b();
                        b.y(cnszVar, "SupportLifecycleFragmentImpl");
                        b.r();
                    }
                    cnsz.a.put(ffVar, new WeakReference<>(cnszVar));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            return cnszVar;
        } else if (!(obj instanceof Activity)) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        } else {
            Activity activity = (Activity) obj;
            WeakReference<cnrz> weakReference2 = cnrz.a.get(activity);
            if (weakReference2 == null || (cnrzVar = weakReference2.get()) == null) {
                try {
                    cnrzVar = (cnrz) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (cnrzVar == null || cnrzVar.isRemoving()) {
                        cnrzVar = new cnrz();
                        activity.getFragmentManager().beginTransaction().add(cnrzVar, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    cnrz.a.put(activity, new WeakReference<>(cnrzVar));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            return cnrzVar;
        }
    }

    public void Sh() {
    }

    public void c() {
    }

    public void d() {
    }

    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void j(int i, int i2, Intent intent) {
    }

    public final Activity n() {
        return this.e.c();
    }
}
