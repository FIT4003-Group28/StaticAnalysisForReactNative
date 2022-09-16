package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LifecycleCallback {
    public final qux e;

    /* JADX INFO: Access modifiers changed from: protected */
    public LifecycleCallback(qux quxVar) {
        this.e = quxVar;
    }

    private static qux getChimeraLifecycleFragmentImpl(quw quwVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static qux m(Activity activity) {
        quz quzVar;
        qvv qvvVar;
        Object obj = new quw(activity).a;
        if (!(obj instanceof dt)) {
            WeakReference weakReference = (WeakReference) quz.a.get(obj);
            if (weakReference != null && (quzVar = (quz) weakReference.get()) != null) {
                return quzVar;
            }
            try {
                quz quzVar2 = (quz) ((Activity) obj).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (quzVar2 == null || quzVar2.isRemoving()) {
                    quzVar2 = new quz();
                    ((Activity) obj).getFragmentManager().beginTransaction().add(quzVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                quz quzVar3 = quzVar2;
                quz.a.put(obj, new WeakReference(quzVar3));
                return quzVar3;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        dt dtVar = (dt) obj;
        WeakReference weakReference2 = (WeakReference) qvv.a.get(dtVar);
        if (weakReference2 != null && (qvvVar = (qvv) weakReference2.get()) != null) {
            return qvvVar;
        }
        try {
            qvv qvvVar2 = (qvv) dtVar.getSupportFragmentManager().f("SupportLifecycleFragmentImpl");
            if (qvvVar2 == null || qvvVar2.s) {
                qvvVar2 = new qvv();
                ex l = dtVar.getSupportFragmentManager().l();
                l.r(qvvVar2, "SupportLifecycleFragmentImpl");
                l.k();
            }
            qvv.a.put(dtVar, new WeakReference(qvvVar2));
            return qvvVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public void d(int i, int i2, Intent intent) {
    }

    public void e(Bundle bundle) {
    }

    public void h(Bundle bundle) {
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    public final Activity l() {
        Activity a = this.e.a();
        qnm.b(a);
        return a;
    }

    public void n() {
    }
}
