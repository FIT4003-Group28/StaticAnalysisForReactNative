package defpackage;

import android.view.View;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cduw  reason: default package */
/* loaded from: classes4.dex */
public final class cduw implements Iterator<View> {
    final /* synthetic */ abs a;
    private int b;

    public cduw(abs absVar) {
        this.a = absVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.aJ();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ View next() {
        abs absVar = this.a;
        int i = this.b;
        this.b = i + 1;
        View aK = absVar.aK(i);
        if (aK != null) {
            return aK;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        abs absVar = this.a;
        int i = this.b - 1;
        this.b = i;
        absVar.aD(i);
    }
}
