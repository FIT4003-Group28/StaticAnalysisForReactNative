package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: dcfl  reason: default package */
/* loaded from: classes5.dex */
public final class dcfl extends dcbg<List> {
    final /* synthetic */ Iterable a;

    public dcfl(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator<List> iterator() {
        Iterator it = this.a.iterator();
        dbsk.s(it);
        dbsk.a(true);
        return new dcfw(it);
    }
}
