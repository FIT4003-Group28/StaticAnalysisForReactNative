package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: mpe  reason: default package */
/* loaded from: classes3.dex */
public final class mpe {
    public static List a(ajrs ajrsVar, Object obj, List list, ajsa ajsaVar, zda zdaVar, SwipeLayout swipeLayout) {
        if (zdaVar != null) {
            zdaVar.a.add(swipeLayout);
        }
        swipeLayout.h();
        if (list.size() == 0) {
            return null;
        }
        ajrs ajrsVar2 = new ajrs(ajrsVar);
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        ajrsVar2.g(hashMap);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            apoj apojVar = (apoj) it.next();
            if (apojVar != null) {
                mrd mrdVar = new mrd(apojVar);
                ampq i = akel.i(ajsaVar, mrdVar, null);
                if (i.h()) {
                    ajru ajruVar = (ajru) i.c();
                    ajruVar.oK(ajrsVar2, mrdVar);
                    arrayList.add(ajruVar.a());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(ajruVar);
                }
            }
        }
        zdb.a(swipeLayout, arrayList);
        return arrayList2;
    }

    public static void b(zda zdaVar, SwipeLayout swipeLayout, List list, ajsa ajsaVar) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View a = ((ajru) it.next()).a();
                if (a.getParent() != null) {
                    ((ViewGroup) a.getParent()).removeView(a);
                }
                ajsaVar.b(a);
            }
            list.clear();
        }
        if (zdaVar != null) {
            zdaVar.a.remove(swipeLayout);
        }
        zdb.a(swipeLayout, Collections.emptyList());
    }

    public static final int c(Resources resources, asxo asxoVar) {
        if (asxoVar == null) {
            return resources.getInteger(R.integer.compact_renderer_title_max_lines);
        }
        int aa = almu.aa(asxoVar.b);
        if (aa == 0 || aa != 7) {
            return resources.getInteger(R.integer.compact_renderer_title_max_lines);
        }
        return resources.getInteger(R.integer.compact_renderer_title_smaller_thumbnail_max_lines);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(android.content.res.Resources r7, defpackage.asxo r8, com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView r9, android.widget.RelativeLayout r10, android.widget.TextView r11) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            if (r8 != 0) goto L7
            return
        L7:
            r1 = 2131492894(0x7f0c001e, float:1.8609253E38)
            int r1 = r7.getInteger(r1)
            int r8 = r8.b
            int r8 = defpackage.almu.aa(r8)
            if (r8 != 0) goto L17
            r8 = 2
        L17:
            android.view.ViewParent r2 = r9.getParent()
            boolean r2 = r2 instanceof android.widget.LinearLayout
            r3 = 8
            if (r2 == 0) goto L41
            r2 = r0
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r4 = 0
            r2.weight = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 9
            if (r8 == r3) goto L31
            if (r8 != r6) goto L33
            r8 = 9
        L31:
            r2.weight = r5
        L33:
            if (r10 == 0) goto L41
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.weight = r4
            if (r8 != r6) goto L41
            r2.weight = r5
        L41:
            r2 = -1
            int r8 = r8 + r2
            r4 = 5
            r5 = 2131166842(0x7f07067a, float:1.794794E38)
            if (r8 == r4) goto L99
            r4 = 6
            if (r8 == r4) goto L81
            r4 = 7
            if (r8 == r4) goto L6d
            if (r8 == r3) goto L5f
            r8 = 2131167082(0x7f07076a, float:1.7948428E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            r0.width = r7
            r9.c(r5)
            goto La6
        L5f:
            if (r10 == 0) goto L69
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            r7.width = r2
            r0.width = r2
        L69:
            r9.c(r5)
            goto La6
        L6d:
            if (r10 == 0) goto L7d
            android.view.ViewGroup$LayoutParams r8 = r10.getLayoutParams()
            r10 = 2131167078(0x7f070766, float:1.794842E38)
            float r7 = r7.getDimension(r10)
            int r7 = (int) r7
            r8.width = r7
        L7d:
            r9.c(r5)
            goto La6
        L81:
            r8 = 2131492896(0x7f0c0020, float:1.8609257E38)
            int r1 = r7.getInteger(r8)
            r8 = 2131167077(0x7f070765, float:1.7948417E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            r0.width = r7
            r7 = 2131167443(0x7f0708d3, float:1.794916E38)
            r9.c(r7)
            goto La6
        L99:
            r8 = 2131167076(0x7f070764, float:1.7948415E38)
            float r7 = r7.getDimension(r8)
            int r7 = (int) r7
            r0.width = r7
            r9.c(r5)
        La6:
            r11.setMaxLines(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpe.d(android.content.res.Resources, asxo, com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView, android.widget.RelativeLayout, android.widget.TextView):void");
    }

    public static final void e(Resources resources, asxo asxoVar, LinearLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2) {
        if (asxoVar == null) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
            layoutParams2.weight = 1.0f;
            return;
        }
        int aa = almu.aa(asxoVar.b);
        if (aa == 0) {
            aa = 2;
        }
        int i = aa - 1;
        if (i == 5) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_bigger_thumbnail_width);
            layoutParams2.weight = 1.0f;
        } else if (i == 6) {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_compact_thumbnail_width);
            layoutParams2.weight = 1.0f;
        } else if (i == 7) {
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 0.0f;
            layoutParams2.width = (int) resources.getDimension(R.dimen.list_item_fixed_metadata_width);
        } else if (i == 8) {
            layoutParams.width = -1;
            layoutParams.weight = 1.0f;
            layoutParams2.weight = 1.0f;
        } else {
            layoutParams.weight = 0.0f;
            layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
            layoutParams2.weight = 1.0f;
        }
    }

    public static final boolean f(asxo asxoVar) {
        int aa;
        return (asxoVar == null || (aa = almu.aa(asxoVar.b)) == 0 || aa != 10) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, int i) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.5f, 1.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setStartOffset((i * 75) + 1000);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        view.setAnimation(alphaAnimation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view) {
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.cancel();
            view.setAnimation(null);
        }
    }
}
