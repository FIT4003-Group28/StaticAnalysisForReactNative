package defpackage;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jfw  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jfw {
    public static jfz a(asze aszeVar) {
        return new jfy(aszeVar);
    }

    public static jfz b(awjr awjrVar) {
        return new jfx(awjrVar);
    }

    public static final Animator c(View view, int i, int i2, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new jfo(view));
        return ofObject;
    }

    public static void d(aajs aajsVar, amvn amvnVar) {
        amzs it = amvnVar.iterator();
        while (it.hasNext()) {
            aajsVar.j((abga) it.next());
        }
    }

    public static void e(aajs aajsVar, Map map, agqh agqhVar, ampg ampgVar, jbg jbgVar) {
        String str = agqhVar.a.a;
        Set set = (Set) map.get(str);
        HashSet hashSet = new HashSet(agqhVar.b);
        if (set != null) {
            amys c = amyv.c(set, hashSet);
            if (jbgVar != null) {
                jbgVar.a(c);
            }
            d(aajsVar, (amvn) ampgVar.apply(amyv.c(hashSet, set)));
        } else {
            d(aajsVar, (amvn) ampgVar.apply(hashSet));
        }
        map.put(str, hashSet);
    }

    public static amvn f(Map map, String str) {
        amvl i = amvn.i();
        List<arzl> list = (List) map.get(str);
        if (list != null) {
            for (arzl arzlVar : list) {
                for (arzk arzkVar : arzlVar.b) {
                    if (!arzkVar.d.isEmpty()) {
                        i.c(arzkVar.d);
                    }
                }
            }
        }
        return i.g();
    }

    public static String g(PaneDescriptor paneDescriptor) {
        if (paneDescriptor == null) {
            return null;
        }
        return h(paneDescriptor.e());
    }

    public static String h(apzg apzgVar) {
        if (apzgVar == null || !apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
            return null;
        }
        return ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).c;
    }

    public static boolean i(apzg apzgVar) {
        String h = h(apzgVar);
        if (h == null) {
            return false;
        }
        if (m(h)) {
            return true;
        }
        String str = null;
        if (apzgVar != null && apzgVar.qn(BrowseEndpointOuterClass.browseEndpoint)) {
            str = ((apnv) apzgVar.qm(BrowseEndpointOuterClass.browseEndpoint)).j;
        }
        return m(str);
    }

    public static final void j() {
    }

    public static final void k() {
    }

    public static final void l() {
    }

    private static boolean m(String str) {
        return "FEshared".equals(str) || "FElibrary".equals(str) || "FEoffline_what_to_watch".equals(str) || "FEsubscriptions".equals(str) || "FEwhat_to_watch".equals(str) || "FEactivity".equals(str);
    }
}
