package defpackage;

import android.text.Layout;
import android.view.View;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: bgyt  reason: default package */
/* loaded from: classes3.dex */
final class bgyt implements cqfc {
    final /* synthetic */ bgyw a;

    public bgyt(bgyw bgywVar) {
        this.a = bgywVar;
    }

    @Override // defpackage.cqfc
    public final void a(View view, boolean z) {
        dcdc c = cqhu.c(view, bgwr.a, TextView.class);
        int size = c.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Layout layout = ((TextView) c.get(i)).getLayout();
            if (layout != null && layout.getEllipsisCount(0) > 0) {
                z2 = true;
            }
        }
        if (z2) {
            bgyw bgywVar = this.a;
            bgywVar.f = 2;
            cqkx.p(bgywVar);
        }
    }
}
