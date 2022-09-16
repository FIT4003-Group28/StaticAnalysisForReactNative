package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xxp  reason: default package */
/* loaded from: classes4.dex */
public final class xxp {
    public aafo a;
    public final xxx b;
    public final yrj c;
    public final yzv d;
    public final Map e;
    public final Map f;
    public final Map g;

    public xxp(xxx xxxVar, yrj yrjVar, yzv yzvVar) {
        xxxVar.getClass();
        this.b = xxxVar;
        yrjVar.getClass();
        this.c = yrjVar;
        yzvVar.getClass();
        this.d = yzvVar;
        HashMap hashMap = new HashMap();
        hashMap.put(xxo.EnabledLikeButton, 2131233282);
        hashMap.put(xxo.DisabledLikeButton, 2131233480);
        hashMap.put(xxo.EnabledDislikeButton, 2131233279);
        hashMap.put(xxo.DisabledDislikeButton, 2131233478);
        this.e = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put(xxo.EnabledLikeButton, 2131232788);
        hashMap2.put(xxo.DisabledLikeButton, 2131232791);
        hashMap2.put(xxo.EnabledDislikeButton, 2131232778);
        hashMap2.put(xxo.DisabledDislikeButton, 2131232781);
        this.g = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put(xxo.EnabledLikeButton, 2131233283);
        hashMap3.put(xxo.DisabledLikeButton, 2131233481);
        hashMap3.put(xxo.EnabledDislikeButton, 2131233280);
        hashMap3.put(xxo.DisabledDislikeButton, 2131233479);
        hashMap3.put(xxo.ElementsLikeButton, 2131232795);
        hashMap3.put(xxo.ElementsDislikeButton, 2131232785);
        this.f = hashMap3;
    }

    public static void a(apos aposVar, ImageView imageView, Map map) {
        int intValue = ((Integer) map.get(xxo.EnabledDislikeButton)).intValue();
        int intValue2 = ((Integer) map.get(xxo.DisabledDislikeButton)).intValue();
        if (aposVar.e) {
            imageView.setImageDrawable(g(imageView.getContext(), intValue, R.attr.ytTextPrimary));
            if ((aposVar.b & 8192) == 0) {
                return;
            }
            imageView.setContentDescription(aposVar.o);
            return;
        }
        imageView.setImageDrawable(g(imageView.getContext(), intValue2, R.attr.ytTextPrimary));
        if ((aposVar.b & 128) == 0) {
            return;
        }
        imageView.setContentDescription(aposVar.i);
    }

    public static void b(apos aposVar, View view, Map map) {
        int intValue = ((Integer) map.get(xxo.EnabledDislikeButton)).intValue();
        int intValue2 = ((Integer) map.get(xxo.DisabledDislikeButton)).intValue();
        ImageView imageView = (ImageView) view.findViewById(R.id.comment_dislike_button_image);
        TextView textView = (TextView) view.findViewById(R.id.comment_action_toolbar_dislike_text);
        if (aposVar.e) {
            imageView.setImageDrawable(g(view.getContext(), intValue, R.attr.ytStaticBlue));
            if ((aposVar.b & 8192) != 0) {
                view.setContentDescription(aposVar.o);
            }
        } else {
            imageView.setImageDrawable(g(view.getContext(), intValue2, R.attr.ytIcon1));
            if ((aposVar.b & 128) != 0) {
                view.setContentDescription(aposVar.i);
            }
        }
        arag aragVar = aposVar.h;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        if (!TextUtils.isEmpty(ajgl.b(aragVar).toString())) {
            arag aragVar2 = aposVar.h;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            textView.setText(ajgl.b(aragVar2));
        }
    }

    public static void c(apos aposVar, ImageView imageView, TextView textView, Map map) {
        apzg apzgVar;
        int intValue = ((Integer) map.get(xxo.EnabledLikeButton)).intValue();
        int intValue2 = ((Integer) map.get(xxo.DisabledLikeButton)).intValue();
        if (aposVar.e) {
            apzgVar = aposVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            imageView.setImageDrawable(g(imageView.getContext(), intValue, R.attr.ytTextPrimary));
            if ((aposVar.b & 8192) != 0) {
                imageView.setContentDescription(aposVar.o);
            }
        } else {
            apzg apzgVar2 = aposVar.p;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            imageView.setImageDrawable(g(imageView.getContext(), intValue2, R.attr.ytTextPrimary));
            if ((aposVar.b & 128) != 0) {
                imageView.setContentDescription(aposVar.i);
            }
            apzgVar = apzgVar2;
        }
        if (apzgVar == null || !apzgVar.qn(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint)) {
            return;
        }
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) apzgVar.qm(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() <= 0 || !((apzg) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).qn(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction)) {
            return;
        }
        arag aragVar = ((UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction) ((apzg) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).qm(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction)).c;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        textView.setText(ajgl.b(aragVar));
    }

    public static void d(apos aposVar, View view, Map map) {
        apzg apzgVar;
        int intValue = ((Integer) map.get(xxo.EnabledLikeButton)).intValue();
        int intValue2 = ((Integer) map.get(xxo.DisabledLikeButton)).intValue();
        ImageView imageView = (ImageView) view.findViewById(R.id.comment_like_button_image);
        TextView textView = (TextView) view.findViewById(R.id.comment_action_toolbar_like_text);
        if (aposVar.e) {
            apzgVar = aposVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            imageView.setImageDrawable(g(view.getContext(), intValue, R.attr.ytStaticBlue));
            if ((aposVar.b & 8192) != 0) {
                view.setContentDescription(aposVar.o);
            }
        } else {
            apzg apzgVar2 = aposVar.p;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            imageView.setImageDrawable(g(view.getContext(), intValue2, R.attr.ytIcon1));
            if ((aposVar.b & 128) != 0) {
                view.setContentDescription(aposVar.i);
            }
            apzgVar = apzgVar2;
        }
        if (apzgVar == null || !apzgVar.qn(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint)) {
            return;
        }
        PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint performCommentActionEndpointOuterClass$PerformCommentActionEndpoint = (PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint) apzgVar.qm(PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint);
        if (performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.size() <= 0 || !((apzg) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).qn(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction)) {
            return;
        }
        UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction updateCommentVoteActionOuterClass$UpdateCommentVoteAction = (UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction) ((apzg) performCommentActionEndpointOuterClass$PerformCommentActionEndpoint.d.get(0)).qm(UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction);
        if ((updateCommentVoteActionOuterClass$UpdateCommentVoteAction.b & 1) == 0) {
            arag aragVar = aposVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            return;
        }
        arag aragVar2 = updateCommentVoteActionOuterClass$UpdateCommentVoteAction.c;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        textView.setText(ajgl.b(aragVar2));
    }

    public static apzg e(aopa aopaVar, acti actiVar) {
        apzg apzgVar;
        apos aposVar = (apos) aopaVar.instance;
        boolean z = aposVar.e;
        apzg apzgVar2 = null;
        if ((z && (aposVar.b & 16384) != 0) || (!z && (aposVar.b & 512) != 0)) {
            if (z) {
                apzgVar = aposVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = aposVar.k;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            aopa createBuilder = auqr.a.createBuilder();
            String k = actiVar.k();
            createBuilder.copyOnWrite();
            auqr auqrVar = (auqr) createBuilder.instance;
            k.getClass();
            auqrVar.b |= 1;
            auqrVar.c = k;
            aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
            aopcVar.e(auqs.b, (auqr) createBuilder.mo39build());
            apzgVar2 = (apzg) aopcVar.mo39build();
            if (!z) {
                aopaVar.copyOnWrite();
                apos aposVar2 = (apos) aopaVar.instance;
                apzgVar2.getClass();
                aposVar2.k = apzgVar2;
                aposVar2.b |= 512;
            } else {
                aopaVar.copyOnWrite();
                apos aposVar3 = (apos) aopaVar.instance;
                apzgVar2.getClass();
                aposVar3.p = apzgVar2;
                aposVar3.b |= 16384;
            }
        }
        return apzgVar2;
    }

    public static void f(aopa aopaVar, aopa aopaVar2) {
        boolean z = ((apos) aopaVar.instance).e;
        aopaVar.copyOnWrite();
        apos aposVar = (apos) aopaVar.instance;
        aposVar.b |= 8;
        aposVar.e = !z;
        aopaVar2.copyOnWrite();
        apos aposVar2 = (apos) aopaVar2.instance;
        aposVar2.b |= 8;
        aposVar2.e = false;
    }

    private static Drawable g(Context context, int i, int i2) {
        Drawable a = akf.a(context, i);
        int orElse = zhn.j(context, i2).orElse(0);
        if (a != null) {
            Drawable l = iy.l(a);
            l.setTint(orElse);
            return l;
        }
        return null;
    }
}
