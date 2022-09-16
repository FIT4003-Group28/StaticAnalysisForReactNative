package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: axk  reason: default package */
/* loaded from: classes3.dex */
final class axk extends ayo {
    boolean a = false;
    final /* synthetic */ ViewGroup b;

    public axk(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void a(ayn aynVar) {
        if (!this.a) {
            azc.a(this.b, false);
        }
        aynVar.E(this);
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void b() {
        azc.a(this.b, false);
        this.a = true;
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void c() {
        azc.a(this.b, false);
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void d() {
        azc.a(this.b, true);
    }
}
