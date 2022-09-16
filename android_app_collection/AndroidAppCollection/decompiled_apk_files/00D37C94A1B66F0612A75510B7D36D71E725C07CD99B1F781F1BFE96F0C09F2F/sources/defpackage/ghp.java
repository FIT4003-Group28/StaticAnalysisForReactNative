package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: ghp  reason: default package */
/* loaded from: classes3.dex */
final class ghp implements Iterator {
    int a;
    final /* synthetic */ ViewGroup b;

    public ghp(ViewGroup viewGroup) {
        this.b = viewGroup;
        this.a = viewGroup.getChildCount() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a >= 0;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.a--;
        return this.b.getChildAt(this.a);
    }
}
