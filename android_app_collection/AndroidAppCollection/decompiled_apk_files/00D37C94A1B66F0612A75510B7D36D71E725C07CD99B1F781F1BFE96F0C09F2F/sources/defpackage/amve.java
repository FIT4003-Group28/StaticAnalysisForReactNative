package defpackage;
/* compiled from: PG */
/* renamed from: amve  reason: default package */
/* loaded from: classes.dex */
final class amve extends amvt {
    private static final long serialVersionUID = 0;
    final /* synthetic */ amvg a;

    public amve(amvg amvgVar) {
        this.a = amvgVar;
    }

    @Override // defpackage.amvt
    public final /* bridge */ /* synthetic */ Object c(int i) {
        return this.a.p(i);
    }

    @Override // defpackage.amub, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof amxk) {
            amxk amxkVar = (amxk) obj;
            if (amxkVar.a() > 0 && this.a.a(amxkVar.a) == amxkVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.amvn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.amub
    public final boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.n().size();
    }

    @Override // defpackage.amvn, defpackage.amub
    Object writeReplace() {
        return new amvf(this.a);
    }
}
