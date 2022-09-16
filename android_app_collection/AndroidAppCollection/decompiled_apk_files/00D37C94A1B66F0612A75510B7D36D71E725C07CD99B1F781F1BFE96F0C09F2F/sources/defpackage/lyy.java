package defpackage;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: lyy  reason: default package */
/* loaded from: classes3.dex */
public final class lyy {
    public final lzd a;
    public final LinearLayoutManager b;
    public aopa c;
    private final ajsm d;
    private final ajsf e;
    private final RecyclerView f;
    private final LinearLayout g;
    private final boolean h;
    private final Integer i;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, ajsa] */
    public lyy(Activity activity, LinearLayout linearLayout, lzd lzdVar, ajsg ajsgVar, ajyi ajyiVar, aadd aaddVar, boolean z, acti actiVar, Integer num) {
        float dimension;
        ajsm ajsmVar = new ajsm();
        this.d = ajsmVar;
        RecyclerView recyclerView = new RecyclerView(activity);
        this.f = recyclerView;
        this.a = lzdVar;
        this.h = z;
        this.i = num;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.chip_bar_chips_container);
        this.g = linearLayout2;
        fqx fqxVar = new fqx(activity.getResources().getDimensionPixelSize(R.dimen.chip_padding));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.b = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.ag(linearLayoutManager);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, activity.getResources().getDimensionPixelSize(R.dimen.bar_container_height)));
        int dimension2 = (int) activity.getResources().getDimension(R.dimen.bar_padding);
        int dimension3 = (int) activity.getResources().getDimension(R.dimen.chips_padding_end);
        if (eog.C(aaddVar)) {
            dimension = activity.getResources().getDimension(R.dimen.chips_padding_start);
        } else {
            dimension = activity.getResources().getDimension(R.dimen.recycler_view_start_padding);
        }
        recyclerView.setPadding((int) dimension, dimension2, dimension3, dimension2);
        recyclerView.setClipToPadding(false);
        recyclerView.setContentDescription(activity.getResources().getString(R.string.accessibility_search_results_chip_bar_content_description));
        recyclerView.setImportantForAccessibility(1);
        linearLayout2.addView(recyclerView);
        ajsf b = ajsgVar.b(ajyiVar.get(), new ViewGroup.LayoutParams(-2, -2));
        this.e = b;
        b.h(ajsmVar);
        recyclerView.aC(fqxVar);
        recyclerView.aE(new lyw(lzdVar));
        b.rZ(new lyv(actiVar));
        if (z || linearLayout2.getChildCount() <= 2) {
            return;
        }
        linearLayout2.removeViewAt(1);
    }

    public final boolean a(aopa aopaVar) {
        Integer num;
        int i = 0;
        if (aopaVar == null) {
            return false;
        }
        this.c = aopaVar;
        this.f.ad(this.e);
        this.d.clear();
        for (apvk apvkVar : Collections.unmodifiableList(((apvj) aopaVar.instance).b)) {
            int i2 = apvkVar.b;
            if (i2 == 91394224) {
                ajsm ajsmVar = this.d;
                apvg apvgVar = (apvg) apvkVar.c;
                int size = ((apvj) aopaVar.instance).b.size() - 1;
                apzg apzgVar = apvgVar.g;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                if (apzgVar.qn(SearchEndpointOuterClass.searchEndpoint)) {
                    aopa mo52toBuilder = apvgVar.mo52toBuilder();
                    aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
                    aopg aopgVar = SearchEndpointOuterClass.searchEndpoint;
                    aopc aopcVar2 = (aopc) ((auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint)).mo52toBuilder();
                    aopcVar2.e(auox.b, true);
                    aopcVar2.e(auox.c, Boolean.valueOf(!apvgVar.i));
                    aopcVar2.e(auox.d, Integer.valueOf(size));
                    aopcVar2.e(auox.e, Integer.valueOf(i));
                    aopcVar.e(aopgVar, (auoy) aopcVar2.mo39build());
                    apzg apzgVar2 = (apzg) aopcVar.mo39build();
                    mo52toBuilder.copyOnWrite();
                    apvg apvgVar2 = (apvg) mo52toBuilder.instance;
                    apzgVar2.getClass();
                    apvgVar2.g = apzgVar2;
                    apvgVar2.b |= 16;
                    apvgVar = (apvg) mo52toBuilder.mo39build();
                }
                ajsmVar.add(apvgVar);
            } else if (i2 == 65153809) {
                this.d.add((apoj) apvkVar.c);
            }
            i++;
        }
        if (this.g.getChildCount() > 2) {
            this.g.removeViewAt(1);
        }
        if (this.h && (num = this.i) != null) {
            this.f.ab(num.intValue());
        }
        return true;
    }
}
