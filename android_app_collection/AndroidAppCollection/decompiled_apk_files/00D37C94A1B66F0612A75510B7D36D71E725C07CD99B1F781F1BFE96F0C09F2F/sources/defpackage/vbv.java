package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vbv  reason: default package */
/* loaded from: classes4.dex */
public final class vbv implements vbc {
    private static final Map a = new afw();
    private final SharedPreferences b;
    private final SharedPreferences.OnSharedPreferenceChangeListener c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (vbv.class) {
            Map map = a;
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                vbv vbvVar = (vbv) it.next();
                SharedPreferences sharedPreferences = vbvVar.b;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = vbvVar.c;
                throw null;
            }
            map.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static vbv c() {
        vbv vbvVar;
        if (!sre.f()) {
            synchronized (vbv.class) {
                vbvVar = (vbv) a.get(null);
                if (vbvVar == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return vbvVar;
        }
        throw null;
    }

    @Override // defpackage.vbc
    public final Object b(String str) {
        throw null;
    }
}
