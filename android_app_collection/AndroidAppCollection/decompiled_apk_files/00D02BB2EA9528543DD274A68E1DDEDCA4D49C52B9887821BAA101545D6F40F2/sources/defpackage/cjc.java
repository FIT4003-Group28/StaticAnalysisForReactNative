package defpackage;
/* compiled from: PG */
/* renamed from: cjc  reason: default package */
/* loaded from: classes.dex */
public final class cjc<K, V> extends aif<K, V> {
    private int k;

    @Override // defpackage.aim, java.util.Map
    public final void clear() {
        this.k = 0;
        super.clear();
    }

    @Override // defpackage.aim, java.util.Map
    public final int hashCode() {
        int i = this.k;
        if (i == 0) {
            int hashCode = super.hashCode();
            this.k = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.aim
    public final V k(int i, V v) {
        this.k = 0;
        return (V) super.k(i, v);
    }

    @Override // defpackage.aim
    public final void l(aim<? extends K, ? extends V> aimVar) {
        this.k = 0;
        super.l(aimVar);
    }

    @Override // defpackage.aim
    public final V m(int i) {
        this.k = 0;
        return (V) super.m(i);
    }

    @Override // defpackage.aim, java.util.Map
    public final V put(K k, V v) {
        this.k = 0;
        return (V) super.put(k, v);
    }
}
