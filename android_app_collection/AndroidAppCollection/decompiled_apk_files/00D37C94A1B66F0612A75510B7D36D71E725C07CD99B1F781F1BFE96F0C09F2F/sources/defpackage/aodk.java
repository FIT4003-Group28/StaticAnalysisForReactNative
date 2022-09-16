package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aodk  reason: default package */
/* loaded from: classes.dex */
public final class aodk {
    public static volatile aodk a;
    private final Set b = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set a() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = Collections.unmodifiableSet(this.b);
        }
        return unmodifiableSet;
    }
}
