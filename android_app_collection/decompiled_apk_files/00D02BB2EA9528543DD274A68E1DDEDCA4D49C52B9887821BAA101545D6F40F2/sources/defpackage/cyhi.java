package defpackage;

import android.os.Looper;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
@Deprecated
/* renamed from: cyhi  reason: default package */
/* loaded from: classes5.dex */
abstract class cyhi implements cyhg {
    public final Map<String, cych> a = new ConcurrentHashMap();

    @Override // defpackage.cyhg
    public final dehn<cych> a(final String str, final String str2, dehp dehpVar) {
        return dehpVar.c(new Callable(this, str, str2) { // from class: cyhh
            private final cyhi a;
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
                cyhi cyhiVar = this.a;
                String str4 = this.b;
                String str5 = this.c;
                dbsk.m(Looper.getMainLooper().getThread() != Thread.currentThread(), "This method should not be called on a UI thread.");
                cych cychVar = cyhiVar.a.get(str4);
                if (cychVar == null) {
                    try {
                        str3 = cyhiVar.c().a();
                    } catch (cqvr | IOException unused) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        return new cych(str4, str5, cycg.FAILED_NOT_LOGGED_IN, null);
                    }
                    cych cychVar2 = new cych(str4, str5, cycg.SUCCESS_LOGGED_IN, str3);
                    cyhiVar.b(cychVar2);
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
        this.a.put(cychVar.a, cychVar);
    }

    public abstract cqvs c();
}
