package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aczo  reason: default package */
/* loaded from: classes.dex */
public final class aczo {
    public static void a(Context context, Class cls, int i) {
        b(context, cls, i, null);
    }

    public static void b(Context context, Class cls, int i, Bundle bundle) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, cls);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        intent.putExtra("com.google.android.libraries.youtube.mdx.common.newIndex", i);
        intent.putExtra("com.google.android.libraries.youtube.mdx.common.data", bundle);
        context.startActivity(intent);
    }

    public static /* synthetic */ String c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "AUTHENTICATE_USER_ERROR" : "INVALID_LOUNGE_TOKEN" : "EXPIRED_LOUNGE_TOKEN" : "MISSING_LOUNGE_TOKEN";
    }

    public static void d(arag aragVar, acti actiVar) {
        if (aragVar == null || aragVar.c.size() <= 0) {
            return;
        }
        int size = aragVar.c.size();
        for (int i = 0; i < size; i++) {
            arai araiVar = (arai) aragVar.c.get(i);
            if ((araiVar.b & 1024) != 0) {
                asvv asvvVar = araiVar.n;
                if (asvvVar == null) {
                    asvvVar = asvv.b;
                }
                actiVar.u(new acte(asvvVar.d), null);
            }
        }
    }
}
