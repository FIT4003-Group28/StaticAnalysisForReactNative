package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bmz  reason: default package */
/* loaded from: classes2.dex */
final class bmz extends bnl {
    boolean a = false;
    final /* synthetic */ ViewGroup b;

    public bmz(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void a(bnk bnkVar) {
        if (!this.a) {
            bnv.a(this.b, false);
        }
        bnkVar.B(this);
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void b() {
        bnv.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void c() {
        bnv.a(this.b, false);
    }

    @Override // defpackage.bnl, defpackage.bnj
    public final void d() {
        bnv.a(this.b, true);
    }
}
