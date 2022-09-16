package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: rm  reason: default package */
/* loaded from: classes4.dex */
final class rm extends lp {
    final /* synthetic */ rn a;
    private boolean b = false;
    private int c = 0;

    public rm(rn rnVar) {
        this.a = rnVar;
    }

    @Override // defpackage.lp, defpackage.lo
    public final void a(View view) {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            lo loVar = this.a.b;
            if (loVar != null) {
                loVar.a(null);
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.lp, defpackage.lo
    public final void c() {
        if (this.b) {
            return;
        }
        this.b = true;
        lo loVar = this.a.b;
        if (loVar == null) {
            return;
        }
        loVar.c();
    }
}
