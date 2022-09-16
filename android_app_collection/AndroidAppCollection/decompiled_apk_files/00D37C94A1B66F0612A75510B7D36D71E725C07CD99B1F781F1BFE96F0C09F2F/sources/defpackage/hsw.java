package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: hsw  reason: default package */
/* loaded from: classes3.dex */
final class hsw extends eu {
    public int b;
    final SparseArray c;
    final /* synthetic */ hsy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsw(hsy hsyVar, eo eoVar) {
        super(eoVar);
        this.d = hsyVar;
        this.b = 0;
        this.c = new SparseArray();
    }

    @Override // defpackage.eu
    public final dp b(int i) {
        return new htl();
    }

    @Override // defpackage.eu, defpackage.bpg
    public final Object c(ViewGroup viewGroup, int i) {
        Object c = super.c(viewGroup, this.d.as.y(i));
        this.c.put(i, c);
        return c;
    }

    @Override // defpackage.eu, defpackage.bpg
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        this.c.remove(i);
        super.d(viewGroup, i, obj);
    }

    @Override // defpackage.bpg
    public final int j() {
        return this.b;
    }

    public final dp o(int i) {
        return (dp) this.c.get(this.d.as.y(i));
    }
}
