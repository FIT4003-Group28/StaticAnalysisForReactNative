package defpackage;
/* compiled from: PG */
/* renamed from: dzks  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzks implements dzna {
    @Override // defpackage.dzna
    public long b() {
        throw null;
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Long next() {
        return Long.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
