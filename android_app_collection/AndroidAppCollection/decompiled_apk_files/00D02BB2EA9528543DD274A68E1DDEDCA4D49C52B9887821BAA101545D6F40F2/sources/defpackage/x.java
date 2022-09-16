package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: x  reason: default package */
/* loaded from: classes7.dex */
public class x<T> extends z<T> {
    private final aho<v<?>, w<?>> g = new aho<>();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v
    public final void i() {
        Iterator<Map.Entry<v<?>, w<?>>> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v
    public final void j() {
        Iterator<Map.Entry<v<?>, w<?>>> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    public final <S> void m(v<S> vVar, aa<? super S> aaVar) {
        w<?> wVar = new w<>(vVar, aaVar);
        w<?> d = this.g.d(vVar, wVar);
        if (d == null || d.b == aaVar) {
            if (d != null || !k()) {
                return;
            }
            wVar.a();
            return;
        }
        throw new IllegalArgumentException("This source was already added with the different observer");
    }

    public final <S> void n(v<S> vVar) {
        w<?> b = this.g.b(vVar);
        if (b != null) {
            b.b();
        }
    }
}
