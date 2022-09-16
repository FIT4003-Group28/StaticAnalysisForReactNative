package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ccz  reason: default package */
/* loaded from: classes2.dex */
public final class ccz implements bxq {
    private static final Set a = new HashSet();

    @Override // defpackage.bxq
    public final void a(String str, Throwable th) {
        Set set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
