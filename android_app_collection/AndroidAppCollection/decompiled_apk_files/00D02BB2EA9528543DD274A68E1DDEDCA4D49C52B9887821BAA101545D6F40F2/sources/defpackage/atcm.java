package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atcm  reason: default package */
/* loaded from: classes2.dex */
public final class atcm {
    public final cqkf<atna> a;

    public atcm(cqkj cqkjVar) {
        this.a = cqkjVar.e(new athe());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View a() {
        return this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(View view) {
        ViewGroup viewGroup = (ViewGroup) a().findViewById(R.id.nav_sheet);
        View d = cqkx.d(viewGroup, athe.c);
        dbsk.s(d);
        dbsk.l(d instanceof jdx);
        jdx jdxVar = (jdx) d;
        View findViewById = viewGroup.findViewById(athe.nav_sheet_content);
        dbsk.s(findViewById);
        viewGroup.removeView(findViewById);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, athe.header);
        viewGroup.addView(view, viewGroup.indexOfChild(jdxVar), layoutParams);
        jdxVar.d();
    }
}
