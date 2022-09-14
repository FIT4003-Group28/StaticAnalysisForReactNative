package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: dehd  reason: default package */
/* loaded from: classes6.dex */
final class dehd extends Enum<dehd> implements dehc {
    public static final dehd a;
    private static final Set<WeakReference<Class<? extends Exception>>> b;
    private static final /* synthetic */ dehd[] c;

    static {
        dehd dehdVar = new dehd();
        a = dehdVar;
        c = new dehd[]{dehdVar};
        b = new CopyOnWriteArraySet();
    }

    private dehd() {
    }

    public static dehd[] values() {
        return (dehd[]) c.clone();
    }

    @Override // defpackage.dehc
    public final void a(Class<? extends Exception> cls) {
        for (WeakReference<Class<? extends Exception>> weakReference : b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        dehf.c(cls);
        Set<WeakReference<Class<? extends Exception>>> set = b;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference<>(cls));
    }
}
