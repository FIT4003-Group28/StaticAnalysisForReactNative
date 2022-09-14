package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bwep  reason: default package */
/* loaded from: classes4.dex */
public final class bwep {
    public static Intent a(bweo bweoVar, Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        b(intent, bweoVar, context);
        return intent;
    }

    public static void b(Intent intent, bweo bweoVar, Context context) {
        bwfq a = intent.getComponent() != null ? bwfr.a(intent.getComponent()) : null;
        String a2 = bweoVar.a(context, a);
        String b = bweoVar.b(context, a);
        if (!dbsj.d(a2)) {
            intent.putExtra("android.intent.extra.TEXT", a2);
        } else {
            intent.removeExtra("android.intent.extra.TEXT");
        }
        if (!dbsj.d(b)) {
            intent.putExtra("android.intent.extra.SUBJECT", b);
        } else {
            intent.removeExtra("android.intent.extra.SUBJECT");
        }
        intent.setType("text/plain");
        intent.removeExtra("android.intent.extra.STREAM");
    }
}
