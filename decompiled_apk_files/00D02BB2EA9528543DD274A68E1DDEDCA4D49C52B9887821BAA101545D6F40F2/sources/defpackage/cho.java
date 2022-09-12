package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cho  reason: default package */
/* loaded from: classes.dex */
public final class cho {
    private final List<chn<?>> a = new ArrayList();

    public final synchronized <Z> void a(Class<Z> cls, bud<Z> budVar) {
        this.a.add(new chn<>(cls, budVar));
    }

    public final synchronized <Z> bud<Z> b(Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            chn<?> chnVar = this.a.get(i);
            if (chnVar.a.isAssignableFrom(cls)) {
                return (bud<Z>) chnVar.b;
            }
        }
        return null;
    }
}
