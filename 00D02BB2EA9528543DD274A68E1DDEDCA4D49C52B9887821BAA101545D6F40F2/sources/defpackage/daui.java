package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: daui  reason: default package */
/* loaded from: classes5.dex */
final class daui implements Iterator<Map.Entry<String, Object>> {
    private boolean a;
    private final Iterator<Map.Entry<String, Object>> b;
    private final Iterator<Map.Entry<String, Object>> c;

    public daui(daul daulVar, daue daueVar) {
        this.b = daueVar.iterator();
        this.c = daulVar.c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry<String, Object> next() {
        if (!this.a) {
            if (this.b.hasNext()) {
                return ((daud) this.b).next();
            }
            this.a = true;
        }
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.a) {
            this.c.remove();
        }
        this.b.remove();
    }
}
