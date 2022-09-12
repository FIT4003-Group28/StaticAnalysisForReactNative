package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: affi  reason: default package */
/* loaded from: classes.dex */
final class affi {
    public static final Map<Object, Map<String, SharedPreferences>> a = new HashMap();
    public final affh b;

    public affi(affh affhVar) {
        this.b = affhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SharedPreferences a(String str, int i) {
        return this.b.b(str, i);
    }
}
