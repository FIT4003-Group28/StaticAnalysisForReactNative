package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.google.android.apps.maps.R;
import com.google.android.libraries.social.peoplekit.chips.viewcontrollers.ChipInfo;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitControllerLoggingRelativeLayout;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxtv  reason: default package */
/* loaded from: classes5.dex */
public final class cxtv {
    public final View a;
    public final Activity b;
    public final cxpn c;
    public final cxti d;
    public final cxwi e;
    public final RelativeLayout f;
    public cxxb g;
    private final PeopleKitVisualElementPath h;
    private boolean i = false;
    private final int j;

    public cxtv(Activity activity, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, cxqo cxqoVar, PeopleKitConfig peopleKitConfig, cxov cxovVar, ViewGroup viewGroup, PeopleKitVisualElementPath peopleKitVisualElementPath, List list, bwdn bwdnVar) {
        View view;
        cxwu cxwoVar;
        this.b = activity;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.a(new czhc(dhjm.B));
        peopleKitVisualElementPath2.c(peopleKitVisualElementPath);
        this.h = peopleKitVisualElementPath2;
        cxqoVar.d(-1, peopleKitVisualElementPath2);
        int i = ((PeopleKitConfigImpl) peopleKitConfig).c;
        this.j = i;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.peoplekit_full_flow, (ViewGroup) null);
        this.a = inflate;
        PeopleKitControllerLoggingRelativeLayout peopleKitControllerLoggingRelativeLayout = (PeopleKitControllerLoggingRelativeLayout) inflate.findViewById(R.id.peoplekit_fullflow_autocomplete);
        peopleKitControllerLoggingRelativeLayout.setUp(cxqoVar, peopleKitVisualElementPath);
        cxpn cxpnVar = new cxpn(activity, peopleKitDataLayer, peopleKitSelectionModel, cxqoVar, peopleKitConfig, cxovVar, peopleKitVisualElementPath2);
        this.c = cxpnVar;
        cxpnVar.q = true;
        peopleKitControllerLoggingRelativeLayout.addView(cxpnVar.a);
        PeopleKitControllerLoggingRelativeLayout peopleKitControllerLoggingRelativeLayout2 = (PeopleKitControllerLoggingRelativeLayout) inflate.findViewById(R.id.peoplekit_fullflow_facerows);
        peopleKitControllerLoggingRelativeLayout2.setUp(cxqoVar, peopleKitVisualElementPath);
        cxti cxtiVar = new cxti(activity, peopleKitDataLayer, peopleKitSelectionModel, cxqoVar, peopleKitConfig, viewGroup, null, cxovVar, peopleKitVisualElementPath2, false);
        this.d = cxtiVar;
        if (list != null) {
            if (cxsg.b.f().intValue() != 0 || i == 44) {
                cxwn cxwnVar = new cxwn();
                view = inflate;
                cxwnVar.a = activity;
                cxwnVar.b = list;
                cxwoVar = new cxwo(cxwnVar);
            } else {
                cxwoVar = new cxwp(list);
                view = inflate;
            }
            this.g = new cxxb(activity, cxwoVar, cxqoVar, peopleKitVisualElementPath2, bwdnVar);
            ((RelativeLayout) view.findViewById(R.id.peoplekit_fullflow_3p)).addView(this.g.b);
            cxxb cxxbVar = this.g;
            cxxbVar.e = cxwoVar;
            cxxbVar.f.removeAllViews();
            cxxbVar.g = new cxwz(cxxbVar, cxwoVar.a());
            cxxbVar.f.setAdapter(cxxbVar.g);
        } else {
            view = inflate;
        }
        peopleKitControllerLoggingRelativeLayout2.addView(cxtiVar.b);
        cxwi cxwiVar = new cxwi(activity, peopleKitConfig, peopleKitSelectionModel, cxovVar, peopleKitDataLayer, cxqoVar, peopleKitVisualElementPath2);
        this.e = cxwiVar;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.peoplekit_fullflow_messagebar);
        this.f = relativeLayout;
        relativeLayout.addView(cxwiVar.b);
        if (!peopleKitSelectionModel.h()) {
            b(true);
        }
        peopleKitSelectionModel.i(new cxts(this, peopleKitSelectionModel));
    }

    public final ArrayList<ChipInfo> a() {
        return this.c.k();
    }

    public final void b(boolean z) {
        if (z) {
            if (this.i) {
                return;
            }
            if (this.g != null) {
                this.a.findViewById(R.id.peoplekit_fullflow_3p_divider).setVisibility(4);
                this.g.b.setVisibility(4);
            }
            this.f.animate().translationY(0.0f).setDuration(100L).setInterpolator(new DecelerateInterpolator()).setListener(new cxtt(this)).start();
            this.f.setVisibility(0);
            this.i = true;
        } else if (!this.i) {
        } else {
            if (this.g != null) {
                this.a.findViewById(R.id.peoplekit_fullflow_3p_divider).setVisibility(0);
                this.g.b.setVisibility(0);
            }
            if (this.e.b.hasFocus()) {
                ((InputMethodManager) this.b.getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
            }
            this.f.animate().translationY(this.b.getResources().getDimensionPixelSize(R.dimen.peoplekit_fullflow_message_bar_translation)).setDuration(100L).setInterpolator(new DecelerateInterpolator()).setListener(new cxtu(this)).start();
            this.i = false;
        }
    }
}
