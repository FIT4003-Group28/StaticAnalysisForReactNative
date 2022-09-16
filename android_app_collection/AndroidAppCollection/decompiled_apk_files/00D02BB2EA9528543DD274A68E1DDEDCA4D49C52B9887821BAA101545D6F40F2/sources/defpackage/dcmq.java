package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcmq  reason: default package */
/* loaded from: classes5.dex */
public final class dcmq<E> extends dcei<E> {
    static final dcmq<Object> a = new dcmq<>(new dcls());
    final transient dcls<E> b;
    private final transient int c;
    private transient dcep<E> d;

    public dcmq(dcls<E> dclsVar) {
        this.b = dclsVar;
        long j = 0;
        for (int i = 0; i < dclsVar.c; i++) {
            j += dclsVar.d(i);
        }
        this.c = decl.b(j);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dclb
    public final int a(Object obj) {
        return this.b.j(obj);
    }

    @Override // defpackage.dcei, defpackage.dclb
    /* renamed from: c */
    public final dcep<E> j() {
        dcep<E> dcepVar = this.d;
        if (dcepVar == null) {
            dcmo dcmoVar = new dcmo(this);
            this.d = dcmoVar;
            return dcmoVar;
        }
        return dcepVar;
    }

    @Override // defpackage.dcei
    public final dcla<E> g(int i) {
        return this.b.f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dclb
    public final int size() {
        return this.c;
    }

    @Override // defpackage.dcei, defpackage.dccr
    Object writeReplace() {
        return new dcmp(this);
    }
}
