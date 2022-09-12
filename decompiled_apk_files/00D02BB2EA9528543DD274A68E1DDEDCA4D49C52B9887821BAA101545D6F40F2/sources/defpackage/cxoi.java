package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: cxoi  reason: default package */
/* loaded from: classes5.dex */
public final class cxoi {
    public static final Set<cxog<?>> a = Collections.newSetFromMap(new WeakHashMap());
    public static final int b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(cxog<?> cxogVar) {
        if (czhz.a()) {
            a.add(cxogVar);
            if (b == -1) {
                return;
            }
            cxogVar.b();
            return;
        }
        czhz.e(new cxoh(cxogVar));
    }
}
