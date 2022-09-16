package defpackage;
/* compiled from: PG */
/* renamed from: dzib  reason: default package */
/* loaded from: classes6.dex */
public abstract class dzib implements dzkd {
    @Override // defpackage.dzkd
    public int a() {
        throw null;
    }

    @Override // java.util.Iterator
    @Deprecated
    public final /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
