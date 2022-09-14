package c.e.a.b.d.g;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class h7 extends o7 {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ c7 f4191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private h7(c7 c7Var) {
        super(c7Var, null);
        this.f4191c = c7Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h7(c7 c7Var, f7 f7Var) {
        this(c7Var);
    }

    @Override // c.e.a.b.d.g.o7, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new e7(this.f4191c, null);
    }
}
