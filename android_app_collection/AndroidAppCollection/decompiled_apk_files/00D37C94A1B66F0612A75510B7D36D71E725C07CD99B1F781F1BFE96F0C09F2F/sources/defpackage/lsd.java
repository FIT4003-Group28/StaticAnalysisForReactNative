package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: lsd  reason: default package */
/* loaded from: classes3.dex */
final class lsd implements xy {
    final /* synthetic */ lse a;

    public lsd(lse lseVar) {
        this.a = lseVar;
    }

    @Override // defpackage.xy
    public final void a(View view) {
        lsl lslVar = this.a.e;
        if (lslVar == null || !view.equals(lslVar.b)) {
            return;
        }
        this.a.e.i();
    }

    @Override // defpackage.xy
    public final void e() {
    }
}
