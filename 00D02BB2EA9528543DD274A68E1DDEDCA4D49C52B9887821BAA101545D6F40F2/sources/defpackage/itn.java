package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: itn  reason: default package */
/* loaded from: classes6.dex */
final class itn extends dzvy implements dzut<itu> {
    final /* synthetic */ itp a;

    public itn(itp itpVar) {
        this.a = itpVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ itu a() {
        int i = itu.c;
        View rootView = this.a.a.getRootView();
        dzvx.b(rootView, "view.rootView");
        dzvx.c(rootView, "view");
        itu ituVar = (itu) rootView.getTag(R.id.visible_frame);
        return ituVar != null ? ituVar : new itu(rootView);
    }
}
