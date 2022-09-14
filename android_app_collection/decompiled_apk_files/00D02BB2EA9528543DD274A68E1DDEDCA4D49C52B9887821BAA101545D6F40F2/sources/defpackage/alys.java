package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alys  reason: default package */
/* loaded from: classes.dex */
public final class alys implements alyr {
    private final List<alvz> a;
    private int b = 0;

    public alys(List<alvz> list) {
        this.a = list;
    }

    @Override // defpackage.alyr
    public final alvz a() {
        return this.a.get(this.b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ alvz next() {
        List<alvz> list = this.a;
        int i = this.b;
        this.b = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove() not supported");
    }
}
