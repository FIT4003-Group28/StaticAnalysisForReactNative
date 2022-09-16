package defpackage;

import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: anwo  reason: default package */
/* loaded from: classes.dex */
public final class anwo implements anwm {
    public static volatile anwm a;
    final rhd b;

    public anwo(rhd rhdVar) {
        qnm.b(rhdVar);
        this.b = rhdVar;
        new ConcurrentHashMap();
    }

    @Override // defpackage.anwm
    public final void a(String str, Bundle bundle) {
        if (!anwp.b() || anwp.a.contains(str)) {
            return;
        }
        for (String str2 : anwp.b) {
            if (bundle.containsKey(str2)) {
                return;
            }
        }
        if (!anwp.a(str, bundle)) {
            return;
        }
        this.b.a.b("fcm", str, bundle);
    }

    @Override // defpackage.anwm
    public final void b(Object obj) {
        if (!anwp.b()) {
            return;
        }
        rir rirVar = this.b.a;
        rirVar.c(new rih(rirVar, obj));
    }
}
