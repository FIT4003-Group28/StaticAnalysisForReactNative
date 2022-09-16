package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: PG */
/* renamed from: btsq  reason: default package */
/* loaded from: classes.dex */
public final class btsq {
    public static <T extends btsy> T a(Class<T> cls, rb rbVar) {
        return (T) btsr.a.g(cls, rbVar);
    }

    public static <T extends btsy> T b(Class<T> cls, ff ffVar) {
        return (T) ((btss) ffVar).t(cls);
    }

    @Deprecated
    public static <T extends btsy> T c(Class<T> cls, Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof rb) {
            return (T) b(cls, (rb) context);
        }
        if (context instanceof ContextWrapper) {
            return (T) c(cls, ((ContextWrapper) context).getBaseContext());
        }
        throw new ClassCastException();
    }
}
