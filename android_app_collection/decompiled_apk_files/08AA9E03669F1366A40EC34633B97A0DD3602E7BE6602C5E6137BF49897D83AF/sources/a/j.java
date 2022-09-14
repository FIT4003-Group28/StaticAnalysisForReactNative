package a;

import a.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnobservedErrorNotifier.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private h<?> f43a;

    public j(h<?> hVar) {
        this.f43a = hVar;
    }

    protected void finalize() {
        h.a a2;
        try {
            h<?> hVar = this.f43a;
            if (hVar != null && (a2 = h.a()) != null) {
                a2.a(hVar, new k(hVar.f()));
            }
        } finally {
            super.finalize();
        }
    }

    public void a() {
        this.f43a = null;
    }
}
