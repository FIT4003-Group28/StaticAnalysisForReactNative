package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: lvk  reason: default package */
/* loaded from: classes7.dex */
public final class lvk {
    public static int a(@dzsi CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length();
        }
        return 0;
    }

    public static boolean b(lvw lvwVar) {
        return lvwVar.n().booleanValue() || lvwVar.o().booleanValue();
    }

    public static boolean c(lvw lvwVar, Context context) {
        return lvwVar.o().booleanValue() && npv.b(401, 2, context);
    }
}
