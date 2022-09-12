package defpackage;

import android.content.ComponentName;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyp  reason: default package */
/* loaded from: classes2.dex */
public final class ahyp {
    public static void a(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null || !bwfr.b(component)) {
            return;
        }
        Intent intent2 = new Intent(intent);
        intent2.setComponent(null);
        intent.putExtra("android.intent.extra.INTENT", intent2);
        intent.setAction("android.intent.action.CHOOSER");
        intent.setType(null);
    }
}
