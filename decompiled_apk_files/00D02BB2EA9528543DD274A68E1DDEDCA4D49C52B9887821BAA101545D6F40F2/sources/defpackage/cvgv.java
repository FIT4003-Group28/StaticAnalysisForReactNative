package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cvgv  reason: default package */
/* loaded from: classes.dex */
final class cvgv implements Runnable {
    final /* synthetic */ cvgx a;

    public cvgv(cvgx cvgxVar) {
        this.a = cvgxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.a) {
            if (!this.a.a.isEmpty()) {
                try {
                    obj = this.a.c();
                } catch (Exception unused) {
                    obj = null;
                }
                if (obj != null) {
                    Iterator it = this.a.a.iterator();
                    while (it.hasNext()) {
                        ((cvgw) it.next()).a(obj);
                    }
                }
            }
        }
    }
}
