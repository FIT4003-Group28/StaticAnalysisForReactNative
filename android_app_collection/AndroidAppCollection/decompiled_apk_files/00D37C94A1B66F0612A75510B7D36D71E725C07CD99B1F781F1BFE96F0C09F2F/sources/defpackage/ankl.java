package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: ankl  reason: default package */
/* loaded from: classes.dex */
final class ankl extends Enum implements ankk {
    public static final ankl a;
    private static final Set b;
    private static final /* synthetic */ ankl[] c;

    static {
        ankl anklVar = new ankl();
        a = anklVar;
        c = new ankl[]{anklVar};
        b = new CopyOnWriteArraySet();
    }

    private ankl() {
    }

    public static ankl[] values() {
        return (ankl[]) c.clone();
    }

    @Override // defpackage.ankk
    public final void a(Class cls) {
        for (WeakReference weakReference : b) {
            if (cls.equals(weakReference.get())) {
                return;
            }
        }
        ankn.c(cls);
        Set set = b;
        if (set.size() > 1000) {
            set.clear();
        }
        set.add(new WeakReference(cls));
    }
}
