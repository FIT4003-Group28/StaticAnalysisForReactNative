package defpackage;

import android.content.Context;
import android.widget.Toast;
/* compiled from: PG */
/* renamed from: cdmy  reason: default package */
/* loaded from: classes4.dex */
public final class cdmy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Toast a(int i, Context context) {
        dzvx.c(context, "context");
        Toast makeText = Toast.makeText(context, i, 0);
        dzvx.b(makeText, "android.widget.Toast.mak…context, resId, duration)");
        return makeText;
    }
}
