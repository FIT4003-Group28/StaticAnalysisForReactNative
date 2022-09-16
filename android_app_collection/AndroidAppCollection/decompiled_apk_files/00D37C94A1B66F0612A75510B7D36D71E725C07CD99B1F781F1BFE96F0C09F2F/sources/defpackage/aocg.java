package defpackage;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aocg  reason: default package */
/* loaded from: classes.dex */
public final class aocg {
    public final Map a = new afw();
    private final Executor b;

    public aocg(Executor executor) {
        this.b = executor;
    }

    public final synchronized rve a(final String str, aobv aobvVar) {
        rve rveVar = (rve) this.a.get(str);
        if (rveVar != null) {
            return rveVar;
        }
        final FirebaseMessaging firebaseMessaging = aobvVar.a;
        final String str2 = aobvVar.b;
        final aocl aoclVar = aobvVar.c;
        aobz aobzVar = firebaseMessaging.e;
        rve c = aobz.b(aobzVar.a(aocd.e(aobzVar.a), "*", new Bundle())).e(qrj.k, new rvd() { // from class: aobs
            @Override // defpackage.rvd
            public final rve a(Object obj) {
                FirebaseMessaging firebaseMessaging2 = FirebaseMessaging.this;
                String str3 = str2;
                aocl aoclVar2 = aoclVar;
                String str4 = (String) obj;
                FirebaseMessaging.c(firebaseMessaging2.d).c(firebaseMessaging2.e(), str3, str4, firebaseMessaging2.g.c());
                if (aoclVar2 == null || !str4.equals(aoclVar2.b)) {
                    firebaseMessaging2.f(str4);
                }
                return rwd.c(str4);
            }
        }).c(this.b, new rui() { // from class: aocf
            @Override // defpackage.rui
            public final Object a(rve rveVar2) {
                aocg aocgVar = aocg.this;
                String str3 = str;
                synchronized (aocgVar) {
                    aocgVar.a.remove(str3);
                }
                return rveVar2;
            }
        });
        this.a.put(str, c);
        return c;
    }
}
