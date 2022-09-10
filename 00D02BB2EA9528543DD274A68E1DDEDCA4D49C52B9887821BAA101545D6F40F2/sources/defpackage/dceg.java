package defpackage;
/* compiled from: PG */
/* renamed from: dceg  reason: default package */
/* loaded from: classes5.dex */
final class dceg extends dcfi<dcla> {
    private static final long serialVersionUID = 0;
    final /* synthetic */ dcei a;

    public dceg(dcei dceiVar) {
        this.a = dceiVar;
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return this.a.SI();
    }

    @Override // defpackage.dcfi
    public final /* bridge */ /* synthetic */ dcla b(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof dcla) {
            dcla dclaVar = (dcla) obj;
            if (dclaVar.b() > 0 && this.a.a(dclaVar.a()) == dclaVar.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.c().size();
    }

    @Override // defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dceh(this.a);
    }
}
