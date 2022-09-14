package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: PG */
/* renamed from: btmf  reason: default package */
/* loaded from: classes4.dex */
public final class btmf {
    @dzsi
    public static ff a(@dzsi Context context) {
        if (context instanceof ff) {
            return (ff) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return a(((ContextWrapper) context).getBaseContext());
    }
}
