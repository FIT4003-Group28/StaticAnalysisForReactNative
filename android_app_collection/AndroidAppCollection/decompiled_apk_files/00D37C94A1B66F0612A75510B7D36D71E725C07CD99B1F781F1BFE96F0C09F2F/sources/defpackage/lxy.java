package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.mdx.WatchOnTvMenuItem;
import com.google.android.libraries.backup.Backup;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelListSubMenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: lxy  reason: default package */
/* loaded from: classes3.dex */
public final class lxy {
    @Backup
    public static final String FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP = "feed_filter_bar_tutorial_last_shown_timestamp";
    @Backup
    public static final String FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT = "feed_filter_bar_tutorial_shown_count";

    private lxy() {
    }

    public static fsx a(Activity activity, oir oirVar, iwa iwaVar, fsd fsdVar, aacz aaczVar, azqb azqbVar, WatchOnTvMenuItem watchOnTvMenuItem, axxi axxiVar) {
        amvl i = amvn.i();
        i.c(iwaVar);
        i.c(fsdVar);
        i.c(watchOnTvMenuItem);
        i.c(oirVar.a());
        atfw atfwVar = aaczVar.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        arbn arbnVar = atfwVar.o;
        if (arbnVar == null) {
            arbnVar = arbn.a;
        }
        if (arbnVar.b) {
            i.c((fry) azqbVar.get());
        }
        frz a = fsa.a();
        a.a = activity.getString(R.string.application_name);
        a.d(i.g());
        a.b(hve.i(R.attr.ytIconActiveOther));
        fsa a2 = a.a();
        fsw fswVar = new fsw();
        fswVar.l(fsa.a().a());
        fswVar.c(false);
        fswVar.d(false);
        fswVar.f(false);
        fswVar.b(hve.j());
        fswVar.k(hve.j());
        fswVar.h(0);
        fswVar.g(hve.j());
        fswVar.j(0);
        fswVar.i(hve.j());
        fswVar.e(hve.j());
        fswVar.l(a2);
        fswVar.b(hve.i(R.attr.ytBrandBackgroundSolid));
        fswVar.k(hve.i(R.attr.ytStatusBarBackground));
        fswVar.h(true != ((Boolean) axxiVar.a.a.V(axxd.f).B().aw()).booleanValue() ? 2132084057 : 2132084058);
        fswVar.g(hve.i(R.attr.ytTextPrimary));
        fswVar.j(2132084056);
        fswVar.i(hve.i(R.attr.ytTextSecondary));
        return fswVar.a();
    }

    public static int b(Context context) {
        if (zew.y(context)) {
            return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns_linear_grid_feed_tablet_prominent);
        }
        return context.getResources().getInteger(R.integer.horizontal_shelf_num_columns);
    }

    public static boolean c(aakw aakwVar) {
        atnk atnkVar;
        atnk atnkVar2;
        if (aakwVar != null) {
            auqh auqhVar = aakwVar.a;
            if ((auqhVar.c & 2) == 0) {
                return false;
            }
            auqg auqgVar = auqhVar.g;
            if (auqgVar == null) {
                auqgVar = auqg.a;
            }
            if (auqgVar.b != 256220752) {
                return false;
            }
            auqg auqgVar2 = aakwVar.a.g;
            if (auqgVar2 == null) {
                auqgVar2 = auqg.a;
            }
            if (auqgVar2.b == 256220752) {
                atnkVar = (atnk) auqgVar2.c;
            } else {
                atnkVar = atnk.a;
            }
            if ((atnkVar.b & 1) == 0) {
                return false;
            }
            auqg auqgVar3 = aakwVar.a.g;
            if (auqgVar3 == null) {
                auqgVar3 = auqg.a;
            }
            if (auqgVar3.b == 256220752) {
                atnkVar2 = (atnk) auqgVar3.c;
            } else {
                atnkVar2 = atnk.a;
            }
            aunb aunbVar = atnkVar2.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            return aunbVar.qn(ChannelListSubMenuRendererOuterClass.channelListSubMenuRenderer);
        }
        return false;
    }
}
