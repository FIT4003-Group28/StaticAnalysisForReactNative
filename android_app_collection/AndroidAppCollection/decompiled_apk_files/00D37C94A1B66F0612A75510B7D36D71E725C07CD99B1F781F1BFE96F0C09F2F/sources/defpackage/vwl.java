package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: vwl  reason: default package */
/* loaded from: classes4.dex */
public final class vwl {
    public static void a(yjs yjsVar, aacz aaczVar) {
        aovy aovyVar = aaczVar.b().i;
        if (aovyVar == null) {
            aovyVar = aovy.a;
        }
        yjsVar.d("AccountsRemovedTask", (aovyVar.b & 512) != 0 ? aovyVar.f : 0L, 0L, false, 0, false, null, null);
        yjsVar.e("IdentityStoreBackfillTask", 0L, false, 0, null, null, false);
    }

    public static amuk b(Object obj, Object[] objArr) {
        obj.getClass();
        amuf h = amuk.h(1);
        h.h(obj);
        h.i(objArr);
        return h.g();
    }

    public static void c(Activity activity, int i, Collection collection, String str) {
        activity.getClass();
        collection.getClass();
        aqxo.q(!collection.isEmpty(), "empty request types");
        activity.startActivityForResult(new Intent(str).putExtra("access_types", almu.y(amvn.o(arey.q(collection, wdp.b)))).setPackage("com.google.android.apps.wellbeing"), i);
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
