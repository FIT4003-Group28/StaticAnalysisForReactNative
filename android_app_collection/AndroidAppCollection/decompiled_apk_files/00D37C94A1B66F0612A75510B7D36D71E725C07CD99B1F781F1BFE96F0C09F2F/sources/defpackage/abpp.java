package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abpp  reason: default package */
/* loaded from: classes.dex */
public final class abpp extends nd {
    public abpo a;
    public int b;
    private final ajyi c;
    private final abhg d;
    private final ViewGroup e;
    private final View f;
    private int g;
    private final abpm h = new abpm(this);

    public abpp(ajyi ajyiVar, abhg abhgVar, View view) {
        view.getClass();
        this.f = view;
        ajyiVar.getClass();
        this.c = ajyiVar;
        abhgVar.getClass();
        this.d = abhgVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.docked_view_container);
        this.e = viewGroup;
        viewGroup.setClipToOutline(true);
        this.g = view.getHeight();
        this.b = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, ajsa] */
    @Override // defpackage.nd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.graphics.Canvas r9, android.support.v7.widget.RecyclerView r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpp.d(android.graphics.Canvas, android.support.v7.widget.RecyclerView):void");
    }

    public final void g() {
        this.a = null;
        this.e.removeAllViews();
        this.e.setVisibility(8);
        this.e.setTranslationY(0.0f);
    }
}
