package b;

import b.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private f<?> f2198a;

    public h(f<?> fVar) {
        this.f2198a = fVar;
    }

    public void a() {
        this.f2198a = null;
    }

    protected void finalize() {
        f.d g2;
        try {
            f<?> fVar = this.f2198a;
            if (fVar != null && (g2 = f.g()) != null) {
                g2.a(fVar, new i(fVar.a()));
            }
        } finally {
            super.finalize();
        }
    }
}
