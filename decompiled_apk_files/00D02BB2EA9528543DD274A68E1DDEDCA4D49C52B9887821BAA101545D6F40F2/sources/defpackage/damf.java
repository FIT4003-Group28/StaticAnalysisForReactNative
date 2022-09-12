package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: damf  reason: default package */
/* loaded from: classes5.dex */
final class damf {
    private final Context a;

    public damf(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Set<String> a() {
        Set<String> stringSet;
        try {
            stringSet = this.a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("deferred_uninstall_module_list", new HashSet());
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
        } catch (Exception unused) {
            return new HashSet();
        }
        return stringSet;
    }
}
