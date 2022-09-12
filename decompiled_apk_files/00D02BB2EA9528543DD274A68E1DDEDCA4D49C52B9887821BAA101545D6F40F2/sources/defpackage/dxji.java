package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: PG */
/* renamed from: dxji  reason: default package */
/* loaded from: classes6.dex */
public final class dxji<T> {
    public final List<dzsj<T>> a = dxjb.a(2);
    public final List<dzsj<Collection<T>>> b = dxjb.a(9);

    public final void a(dzsj<? extends Collection<? extends T>> dzsjVar) {
        this.b.add(dzsjVar);
    }

    public final void b(dzsj<? extends T> dzsjVar) {
        this.a.add(dzsjVar);
    }
}
