package defpackage;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* renamed from: bnow  reason: default package */
/* loaded from: classes3.dex */
public final class bnow {
    public static File a(Context context) {
        bnov bnovVar;
        if (context instanceof bnov) {
            bnovVar = (bnov) context;
        } else if (context.getApplicationContext() instanceof bnov) {
            bnovVar = (bnov) context.getApplicationContext();
        } else {
            String valueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Bad context: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return bnovVar.c();
    }
}
