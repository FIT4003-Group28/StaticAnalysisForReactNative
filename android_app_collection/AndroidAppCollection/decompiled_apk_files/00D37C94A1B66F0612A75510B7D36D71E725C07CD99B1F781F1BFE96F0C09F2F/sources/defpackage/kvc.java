package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: kvc  reason: default package */
/* loaded from: classes3.dex */
public final class kvc extends dh {
    public static final String ae;
    LinearLayout af;
    LinearLayout ag;
    List ah;
    List ai;
    private auwg aj;

    static {
        String canonicalName = kvc.class.getCanonicalName();
        canonicalName.getClass();
        ae = canonicalName;
    }

    public static ampq aE(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("innertube_search_filters")) {
            return amon.a;
        }
        try {
            return ampq.j((auwg) aphq.i(bundle, "innertube_search_filters", auwg.a, aoos.b()));
        } catch (aopx unused) {
            return amon.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void aG(eo eoVar, auwg auwgVar) {
        if (auwgVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        aH(bundle, auwgVar);
        kvc kvcVar = new kvc();
        kvcVar.ae(bundle);
        kvcVar.qv(eoVar, "FilterDialogFragment");
    }

    private static void aH(Bundle bundle, auwg auwgVar) {
        auwgVar.getClass();
        bundle.putParcelable("innertube_search_filters", aphq.k(auwgVar));
    }

    public final void aF(Bundle bundle) {
        ArrayList arrayList = new ArrayList(this.aj.b);
        Iterator it = this.ah.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Spinner spinner = (Spinner) it.next();
            int intValue = ((Integer) spinner.getTag()).intValue();
            int selectedItemPosition = spinner.getSelectedItemPosition();
            aopa mo52toBuilder = ((auwe) arrayList.get(intValue)).mo52toBuilder();
            for (int i = 0; i < ((auwe) mo52toBuilder.instance).c.size(); i++) {
                if (i == selectedItemPosition) {
                    aopa mo52toBuilder2 = mo52toBuilder.aN(i).mo52toBuilder();
                    mo52toBuilder2.copyOnWrite();
                    auwf auwfVar = (auwf) mo52toBuilder2.instance;
                    auwfVar.d = 2;
                    auwfVar.b |= 2;
                    mo52toBuilder.aO(i, mo52toBuilder2);
                } else {
                    int aY = awwc.aY(mo52toBuilder.aN(i).d);
                    if (aY != 0 && aY == 3) {
                        aopa mo52toBuilder3 = mo52toBuilder.aN(i).mo52toBuilder();
                        mo52toBuilder3.copyOnWrite();
                        auwf auwfVar2 = (auwf) mo52toBuilder3.instance;
                        auwfVar2.d = 1;
                        auwfVar2.b |= 2;
                        mo52toBuilder.aO(i, mo52toBuilder3);
                    }
                }
            }
            arrayList.set(intValue, (auwe) mo52toBuilder.mo39build());
        }
        for (ChipCloudView chipCloudView : this.ai) {
            int intValue2 = ((Integer) chipCloudView.getTag()).intValue();
            aopa mo52toBuilder4 = ((auwe) arrayList.get(intValue2)).mo52toBuilder();
            for (int i2 = 0; i2 < ((auwe) mo52toBuilder4.instance).c.size(); i2++) {
                if (chipCloudView.getChildAt(i2).getVisibility() != 8) {
                    if (((fwn) chipCloudView.getChildAt(i2)).f == 1) {
                        aopa mo52toBuilder5 = mo52toBuilder4.aN(i2).mo52toBuilder();
                        mo52toBuilder5.copyOnWrite();
                        auwf auwfVar3 = (auwf) mo52toBuilder5.instance;
                        auwfVar3.d = 2;
                        auwfVar3.b |= 2;
                        mo52toBuilder4.aO(i2, mo52toBuilder5);
                    } else {
                        int aY2 = awwc.aY(mo52toBuilder4.aN(i2).d);
                        if (aY2 != 0 && aY2 == 3) {
                            aopa mo52toBuilder6 = mo52toBuilder4.aN(i2).mo52toBuilder();
                            mo52toBuilder6.copyOnWrite();
                            auwf auwfVar4 = (auwf) mo52toBuilder6.instance;
                            auwfVar4.d = 1;
                            auwfVar4.b |= 2;
                            mo52toBuilder4.aO(i2, mo52toBuilder6);
                        }
                    }
                }
            }
            arrayList.set(intValue2, (auwe) mo52toBuilder4.mo39build());
        }
        aopa createBuilder = auwg.a.createBuilder();
        createBuilder.copyOnWrite();
        auwg auwgVar = (auwg) createBuilder.instance;
        auwgVar.a();
        aonk.addAll((Iterable) arrayList, (List) auwgVar.b);
        aH(bundle, (auwg) createBuilder.mo39build());
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(1, 0);
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ampq aE = aE(bundle);
        if (!aE.h()) {
            aE = aE(this.m);
        }
        this.aj = (auwg) aE.f();
        ViewGroup viewGroup2 = null;
        View inflate = layoutInflater.inflate(R.layout.search_results_innertube_filter_dialog, (ViewGroup) null);
        this.af = (LinearLayout) inflate.findViewById(R.id.dialog_spinners);
        this.ag = (LinearLayout) inflate.findViewById(R.id.dialog_clouds);
        Context rb = rb();
        this.ah = new ArrayList();
        this.ai = new ArrayList();
        auwg auwgVar = this.aj;
        if (auwgVar == null || auwgVar.b.size() == 0) {
            dismiss();
            return inflate;
        }
        char c = 0;
        int i2 = 0;
        for (auwe auweVar : this.aj.b) {
            int i3 = 3;
            if (auweVar.d) {
                LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.search_results_innertube_filter_dialog_cloud, viewGroup2);
                YouTubeTextView youTubeTextView = (YouTubeTextView) linearLayout.findViewById(R.id.label);
                arag aragVar = auweVar.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                youTubeTextView.setText(ajgl.b(aragVar));
                ChipCloudView chipCloudView = (ChipCloudView) linearLayout.findViewById(R.id.cloud);
                for (auwf auwfVar : auweVar.c) {
                    arag aragVar2 = auwfVar.c;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    String obj = ajgl.b(aragVar2).toString();
                    int aY = awwc.aY(auwfVar.d);
                    boolean z = aY != 0 && aY == i3;
                    final fwn fwnVar = new fwn(rb);
                    fwnVar.f(zew.i(rb.getResources().getDisplayMetrics(), 48));
                    aopa createBuilder = apvg.a.createBuilder();
                    String[] strArr = new String[1];
                    strArr[c] = obj;
                    arag g = ajgl.g(strArr);
                    createBuilder.copyOnWrite();
                    apvg apvgVar = (apvg) createBuilder.instance;
                    g.getClass();
                    apvgVar.f = g;
                    apvgVar.b |= 2;
                    createBuilder.copyOnWrite();
                    apvg apvgVar2 = (apvg) createBuilder.instance;
                    apvgVar2.b |= 256;
                    apvgVar2.i = z;
                    aopa createBuilder2 = apvi.a.createBuilder();
                    apvh apvhVar = apvh.STYLE_UNKNOWN;
                    createBuilder2.copyOnWrite();
                    apvi apviVar = (apvi) createBuilder2.instance;
                    apviVar.c = apvhVar.p;
                    apviVar.b |= 1;
                    createBuilder.copyOnWrite();
                    apvg apvgVar3 = (apvg) createBuilder.instance;
                    apvi apviVar2 = (apvi) createBuilder2.mo39build();
                    apviVar2.getClass();
                    apvgVar3.e = apviVar2;
                    apvgVar3.b |= 1;
                    fwnVar.c((apvg) createBuilder.mo39build());
                    fwnVar.setAccessibilityDelegate(new kve(fwnVar));
                    fwnVar.setOnClickListener(new View.OnClickListener() { // from class: kvd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            fwn fwnVar2 = fwn.this;
                            int i4 = 1;
                            if (true == fwnVar2.isSelected()) {
                                i4 = 2;
                            }
                            fwnVar2.d(i4);
                        }
                    });
                    chipCloudView.addView(fwnVar);
                    i3 = 3;
                }
                chipCloudView.b(Integer.MAX_VALUE);
                this.ag.addView(linearLayout);
                chipCloudView.setTag(Integer.valueOf(i2));
                this.ai.add(chipCloudView);
                i2++;
                viewGroup2 = null;
            } else {
                LinearLayout linearLayout2 = (LinearLayout) layoutInflater.inflate(R.layout.search_results_innertube_filter_dialog_spinner, (ViewGroup) null);
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) linearLayout2.findViewById(R.id.label);
                arag aragVar3 = auweVar.e;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                youTubeTextView2.setText(ajgl.b(aragVar3));
                Spinner spinner = (Spinner) linearLayout2.findViewById(R.id.spinner);
                Context context = spinner.getContext();
                kvf kvfVar = new kvf(context, context);
                kvfVar.setDropDownViewResource(R.layout.spinner_dropdown_item);
                int i4 = 0;
                for (int i5 = 0; i5 < auweVar.c.size(); i5++) {
                    auwf auwfVar2 = (auwf) auweVar.c.get(i5);
                    arag aragVar4 = auwfVar2.c;
                    if (aragVar4 == null) {
                        aragVar4 = arag.a;
                    }
                    kvfVar.add(ajgl.b(aragVar4).toString());
                    int aY2 = awwc.aY(auwfVar2.d);
                    if (aY2 != 0 && aY2 == 3) {
                        i4 = i5;
                    }
                }
                spinner.setAdapter((SpinnerAdapter) kvfVar);
                spinner.setSelection(i4);
                this.af.addView(linearLayout2);
                if (i2 == 0) {
                    i = R.id.spinner_0;
                } else if (i2 == 1) {
                    i = R.id.spinner_1;
                } else if (i2 != 2) {
                    i = i2 != 3 ? View.generateViewId() : R.id.spinner_3;
                } else {
                    i = R.id.spinner_2;
                }
                spinner.setId(i);
                spinner.setTag(Integer.valueOf(i2));
                this.ah.add(spinner);
                i2++;
                viewGroup2 = null;
                c = 0;
            }
        }
        inflate.findViewById(R.id.apply).setOnClickListener(new kvb(this, 1));
        inflate.findViewById(R.id.cancel).setOnClickListener(new kvb(this));
        return inflate;
    }

    @Override // defpackage.dp, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        dismiss();
    }

    @Override // defpackage.dh, defpackage.dp
    public final void oz(Bundle bundle) {
        super.oz(bundle);
        aF(bundle);
    }
}
