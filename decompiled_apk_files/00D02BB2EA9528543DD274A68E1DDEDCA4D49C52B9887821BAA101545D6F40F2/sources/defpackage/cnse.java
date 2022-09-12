package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cnse  reason: default package */
/* loaded from: classes.dex */
public final class cnse {
    public final Set<cnsd<?>> a = Collections.newSetFromMap(new WeakHashMap());

    public static <L> cnsd<L> a(L l, Looper looper, String str) {
        cnwc.n(l, "Listener must not be null");
        cnwc.n(looper, "Looper must not be null");
        cnwc.n(str, "Listener type must not be null");
        return new cnsd<>(looper, l, str);
    }

    public static <L> cnsb<L> b(L l, String str) {
        cnwc.n(l, "Listener must not be null");
        cnwc.n(str, "Listener type must not be null");
        cnwc.m(str, "Listener type must not be empty");
        return new cnsb<>(l, str);
    }
}
