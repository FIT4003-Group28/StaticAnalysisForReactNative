package c.d.j.n;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class i implements j0<c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final j0<c.d.d.h.a<c.d.j.k.b>> f3459a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3460b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3461c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3462d;

    /* loaded from: classes.dex */
    private static class a extends n<c.d.d.h.a<c.d.j.k.b>, c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: c  reason: collision with root package name */
        private final int f3463c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3464d;

        a(k<c.d.d.h.a<c.d.j.k.b>> kVar, int i, int i2) {
            super(kVar);
            this.f3463c = i;
            this.f3464d = i2;
        }

        private void a(c.d.d.h.a<c.d.j.k.b> aVar) {
            c.d.j.k.b b2;
            Bitmap f2;
            int rowBytes;
            if (aVar == null || !aVar.d() || (b2 = aVar.b()) == null || b2.isClosed() || !(b2 instanceof c.d.j.k.c) || (f2 = ((c.d.j.k.c) b2).f()) == null || (rowBytes = f2.getRowBytes() * f2.getHeight()) < this.f3463c || rowBytes > this.f3464d) {
                return;
            }
            f2.prepareToDraw();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // c.d.j.n.b
        /* renamed from: a */
        public void b(c.d.d.h.a<c.d.j.k.b> aVar, int i) {
            a(aVar);
            c().a(aVar, i);
        }
    }

    public i(j0<c.d.d.h.a<c.d.j.k.b>> j0Var, int i, int i2, boolean z) {
        c.d.d.d.i.a(i <= i2);
        c.d.d.d.i.a(j0Var);
        this.f3459a = j0Var;
        this.f3460b = i;
        this.f3461c = i2;
        this.f3462d = z;
    }

    @Override // c.d.j.n.j0
    public void a(k<c.d.d.h.a<c.d.j.k.b>> kVar, k0 k0Var) {
        if (!k0Var.d() || this.f3462d) {
            this.f3459a.a(new a(kVar, this.f3460b, this.f3461c), k0Var);
        } else {
            this.f3459a.a(kVar, k0Var);
        }
    }
}
