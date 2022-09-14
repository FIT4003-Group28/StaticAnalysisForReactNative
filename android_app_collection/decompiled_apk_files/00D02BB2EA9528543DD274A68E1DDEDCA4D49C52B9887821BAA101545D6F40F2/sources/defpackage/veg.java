package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: veg  reason: default package */
/* loaded from: classes7.dex */
public final class veg extends ViewOutlineProvider {
    final /* synthetic */ veh a;

    public veg(veh vehVar) {
        this.a = vehVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float a = vei.b.a(this.a.getContext());
        outline.setRoundRect(0, 0, view.getWidth(), (int) (view.getHeight() + a), a);
    }
}
