package defpackage;

import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lt  reason: default package */
/* loaded from: classes3.dex */
public final class lt extends lu {
    final WindowInsets.Builder a;

    public lt() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.lu
    public final mb a() {
        mb q = mb.q(this.a.build());
        q.u(null);
        return q;
    }

    @Override // defpackage.lu
    public final void b(gz gzVar) {
        this.a.setStableInsets(gzVar.a());
    }

    @Override // defpackage.lu
    public final void c(gz gzVar) {
        this.a.setSystemWindowInsets(gzVar.a());
    }

    public lt(mb mbVar) {
        super(mbVar);
        WindowInsets.Builder builder;
        WindowInsets s = mbVar.s();
        if (s != null) {
            builder = new WindowInsets.Builder(s);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
