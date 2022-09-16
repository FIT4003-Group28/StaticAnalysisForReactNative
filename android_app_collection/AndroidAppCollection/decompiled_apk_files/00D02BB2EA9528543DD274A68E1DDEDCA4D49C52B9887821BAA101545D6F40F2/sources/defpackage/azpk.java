package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azpk  reason: default package */
/* loaded from: classes.dex */
final class azpk {
    final /* synthetic */ azpl a;

    public azpk(azpl azplVar) {
        this.a = azplVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dcdc<azyh> a() {
        return this.a.a.a(azxm.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(azyh azyhVar) {
        synchronized (this) {
            try {
                this.a.a.g(azxm.f, azyhVar);
                this.a.b.a().a();
            } catch (axxc unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(List<azyh> list) {
        synchronized (this) {
            try {
                this.a.f.a = true;
                for (azyh azyhVar : list) {
                    this.a.a.g(azxm.f, azyhVar);
                }
                try {
                    this.a.a.i(azxl.TUTORIAL_HISTORY, null, null);
                } catch (azom unused) {
                }
                this.a.f.a = false;
                this.a.b.a().a();
            } catch (axxc unused2) {
            }
        }
    }
}
