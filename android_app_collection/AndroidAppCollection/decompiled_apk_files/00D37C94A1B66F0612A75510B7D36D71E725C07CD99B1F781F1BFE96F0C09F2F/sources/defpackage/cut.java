package defpackage;
/* compiled from: PG */
/* renamed from: cut  reason: default package */
/* loaded from: classes3.dex */
public final class cut extends afw {
    private int k;

    @Override // defpackage.agd, java.util.Map, j$.util.Map
    public final void clear() {
        this.k = 0;
        super.clear();
    }

    @Override // defpackage.agd
    public final Object g(int i) {
        this.k = 0;
        return super.g(i);
    }

    @Override // defpackage.agd
    public final Object h(int i, Object obj) {
        this.k = 0;
        return super.h(i, obj);
    }

    @Override // defpackage.agd, java.util.Map, j$.util.Map
    public final int hashCode() {
        int i = this.k;
        if (i == 0) {
            int hashCode = super.hashCode();
            this.k = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.agd
    public final void k(agd agdVar) {
        this.k = 0;
        super.k(agdVar);
    }

    @Override // defpackage.agd, java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        this.k = 0;
        return super.put(obj, obj2);
    }
}
