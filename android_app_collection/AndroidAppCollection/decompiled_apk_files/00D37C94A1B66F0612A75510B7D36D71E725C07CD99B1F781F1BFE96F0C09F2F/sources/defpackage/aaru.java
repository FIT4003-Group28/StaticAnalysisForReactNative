package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: aaru  reason: default package */
/* loaded from: classes.dex */
public final class aaru {
    private final PackageManager a;
    private final aacz b;

    public aaru(aacz aaczVar, PackageManager packageManager) {
        this.b = aaczVar;
        this.a = packageManager;
    }

    public final amuk a() {
        apyy b = this.b.b();
        if (b != null) {
            apfd apfdVar = b.h;
            if (apfdVar == null) {
                apfdVar = apfd.a;
            }
            if (apfdVar.b.size() > 0) {
                apfd apfdVar2 = b.h;
                if (apfdVar2 == null) {
                    apfdVar2 = apfd.a;
                }
                aopu<apfe> aopuVar = apfdVar2.b;
                amuf amufVar = new amuf();
                for (apfe apfeVar : aopuVar) {
                    if (!this.a.queryIntentActivities(new Intent().setPackage(apfeVar.c), 65536).isEmpty()) {
                        amufVar.h(Integer.valueOf(apfeVar.b));
                    }
                }
                return amufVar.g();
            }
        }
        return amuk.q();
    }
}
