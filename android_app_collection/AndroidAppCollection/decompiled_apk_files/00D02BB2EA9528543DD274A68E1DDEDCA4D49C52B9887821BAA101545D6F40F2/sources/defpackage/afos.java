package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: afos  reason: default package */
/* loaded from: classes2.dex */
public final class afos {
    private final Context a;

    public afos(Application application) {
        this.a = application.getApplicationContext();
    }

    private final void b(afor aforVar) {
        if (Build.VERSION.SDK_INT < 25) {
            return;
        }
        ((ShortcutManager) this.a.getSystemService("shortcut")).reportShortcutUsed(aforVar.d);
    }

    public final void a(amvh[] amvhVarArr) {
        if (amvhVarArr.length != 2 || !amvhVarArr[0].k()) {
            return;
        }
        dpjs dpjsVar = dpjs.ENTITY_TYPE_MY_LOCATION;
        int ordinal = amvhVarArr[1].b.ordinal();
        if (ordinal == 1) {
            b(afor.MANIFEST_HOME);
        } else if (ordinal != 2) {
        } else {
            b(afor.MANIFEST_WORK);
        }
    }
}
