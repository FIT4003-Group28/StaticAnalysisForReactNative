package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azm  reason: default package */
/* loaded from: classes3.dex */
final class azm extends ayo {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ azp d;

    public azm(azp azpVar, ViewGroup viewGroup, View view, View view2) {
        this.d = azpVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void a(ayn aynVar) {
        this.c.setTag(R.id.save_overlay_view, null);
        azc.b(this.a).b(this.b);
        aynVar.E(this);
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void c() {
        azc.b(this.a).b(this.b);
    }

    @Override // defpackage.ayo, defpackage.aym
    public final void d() {
        if (this.b.getParent() == null) {
            azc.b(this.a).a(this.b);
        } else {
            this.d.t();
        }
    }
}
