package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: chh  reason: default package */
/* loaded from: classes.dex */
public final class chh {
    private final List<chg<?>> a = new ArrayList();

    public final synchronized <T> btl<T> a(Class<T> cls) {
        for (chg<?> chgVar : this.a) {
            if (chgVar.a.isAssignableFrom(cls)) {
                return (btl<T>) chgVar.b;
            }
        }
        return null;
    }

    public final synchronized <T> void b(Class<T> cls, btl<T> btlVar) {
        this.a.add(new chg<>(cls, btlVar));
    }
}
