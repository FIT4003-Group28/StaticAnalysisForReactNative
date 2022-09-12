package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cyhk  reason: default package */
/* loaded from: classes5.dex */
public final class cyhk implements cyhg {
    public final Context a;
    final Map<String, cych> b = new ConcurrentHashMap();

    public cyhk(Context context) {
        this.a = context;
    }

    @Override // defpackage.cyhg
    public final dehn<cych> a(final String str, final String str2, dehp dehpVar) {
        return dehpVar.c(new Callable(this, str, str2) { // from class: cyhj
            private final cyhk a;
            private final String b;
            private final String c;

            {
                this.a = this;
                this.b = str;
                this.c = str2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3;
                cyhk cyhkVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                dbsk.m(Looper.getMainLooper().getThread() != Thread.currentThread(), "This method should not be called on a UI thread.");
                cych cychVar = cyhkVar.b.get(str4);
                if (cychVar == null) {
                    try {
                        str3 = cmrh.l(cyhkVar.a, str4);
                    } catch (cmra | IOException unused) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        return new cych(str4, str5, cycg.FAILED_NOT_LOGGED_IN, null);
                    }
                    cych cychVar2 = new cych(str4, str5, cycg.SUCCESS_LOGGED_IN, str3);
                    cyhkVar.b(cychVar2);
                    return cychVar2;
                }
                return cychVar;
            }
        });
    }

    @Override // defpackage.cyhg
    public final void b(cych cychVar) {
        if (cychVar.c != cycg.SUCCESS_LOGGED_IN || dbsj.d(cychVar.d)) {
            return;
        }
        this.b.put(cychVar.a, cychVar);
    }
}
