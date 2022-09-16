package c.e.a.a.i;

import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n implements c.e.a.a.g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<c.e.a.a.b> f3716a;

    /* renamed from: b  reason: collision with root package name */
    private final m f3717b;

    /* renamed from: c  reason: collision with root package name */
    private final q f3718c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Set<c.e.a.a.b> set, m mVar, q qVar) {
        this.f3716a = set;
        this.f3717b = mVar;
        this.f3718c = qVar;
    }

    @Override // c.e.a.a.g
    public <T> c.e.a.a.f<T> a(String str, Class<T> cls, c.e.a.a.b bVar, c.e.a.a.e<T, byte[]> eVar) {
        if (this.f3716a.contains(bVar)) {
            return new p(this.f3717b, str, bVar, eVar, this.f3718c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f3716a));
    }
}
