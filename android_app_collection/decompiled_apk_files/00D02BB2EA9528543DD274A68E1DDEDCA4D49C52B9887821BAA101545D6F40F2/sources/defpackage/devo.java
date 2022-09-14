package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: devo  reason: default package */
/* loaded from: classes6.dex */
public final class devo {
    private static volatile devo b;
    private final Set<devp> a = new HashSet();

    public static devo getInstance() {
        devo devoVar = b;
        if (devoVar == null) {
            synchronized (devo.class) {
                devoVar = b;
                if (devoVar == null) {
                    devoVar = new devo();
                    b = devoVar;
                }
            }
        }
        return devoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<devp> a() {
        Set<devp> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
