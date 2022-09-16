package defpackage;

import android.app.Activity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aclv  reason: default package */
/* loaded from: classes.dex */
public final class aclv implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private final SwitchCompat A;
    private final View B;
    private final TextView C;
    private final SwitchCompat D;
    private final View E;
    private final TextView F;
    private final SwitchCompat G;
    public final acti a;
    public final Spinner b;
    public final Spinner c;
    public aclz d;
    public aclz e;
    public aclz f;
    public aclz g;
    public aclz h;
    public aclz i;
    private final Activity j;
    private final ajxz k;
    private final aafo l;
    private final aclu m;
    private final ImageButton n;
    private final TextView o;
    private final View p;
    private final TextView q;
    private final SwitchCompat r;
    private final View s;
    private final TextView t;
    private final SwitchCompat u;
    private final View v;
    private final TextView w;
    private final SwitchCompat x;
    private final View y;
    private final TextView z;

    public aclv(Activity activity, View view, atge atgeVar, ajxz ajxzVar, aafo aafoVar, acti actiVar, aclu acluVar) {
        Spinner spinner;
        SwitchCompat switchCompat;
        TextView textView;
        Spinner spinner2;
        TextView textView2;
        SwitchCompat switchCompat2;
        int i;
        View view2;
        TextView textView3;
        View view3;
        SwitchCompat switchCompat3;
        View view4;
        SwitchCompat switchCompat4;
        TextView textView4;
        View view5;
        int i2;
        View view6;
        int i3;
        arag aragVar;
        activity.getClass();
        this.j = activity;
        view.getClass();
        ajxzVar.getClass();
        this.k = ajxzVar;
        aafoVar.getClass();
        this.l = aafoVar;
        actiVar.getClass();
        this.a = actiVar;
        this.m = acluVar;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.back_to_basic_settings_button);
        this.n = imageButton;
        TextView textView5 = (TextView) view.findViewById(R.id.back_to_basic_settings_text);
        this.o = textView5;
        View findViewById = view.findViewById(R.id.enable_chat_setting);
        this.p = findViewById;
        TextView textView6 = (TextView) view.findViewById(R.id.enable_chat_setting_text);
        this.q = textView6;
        SwitchCompat switchCompat5 = (SwitchCompat) view.findViewById(R.id.enable_chat_setting_toggle);
        this.r = switchCompat5;
        View findViewById2 = view.findViewById(R.id.paid_placement_setting);
        this.y = findViewById2;
        TextView textView7 = (TextView) view.findViewById(R.id.paid_placement_setting_text);
        this.z = textView7;
        SwitchCompat switchCompat6 = (SwitchCompat) view.findViewById(R.id.paid_placement_setting_toggle);
        this.A = switchCompat6;
        View findViewById3 = view.findViewById(R.id.show_paid_placement_overlay);
        this.B = findViewById3;
        TextView textView8 = (TextView) view.findViewById(R.id.show_paid_placement_overlay_text);
        this.C = textView8;
        SwitchCompat switchCompat7 = (SwitchCompat) view.findViewById(R.id.show_paid_placement_overlay_toggle);
        this.D = switchCompat7;
        View findViewById4 = view.findViewById(R.id.enable_sponsor_only_setting);
        this.E = findViewById4;
        TextView textView9 = (TextView) view.findViewById(R.id.enable_sponsor_only_setting_text);
        this.F = textView9;
        SwitchCompat switchCompat8 = (SwitchCompat) view.findViewById(R.id.enable_sponsor_only_setting_toggle);
        this.G = switchCompat8;
        View findViewById5 = view.findViewById(R.id.enable_default_usage_policy);
        this.v = findViewById5;
        TextView textView10 = (TextView) view.findViewById(R.id.enable_default_usage_policy_text);
        this.w = textView10;
        SwitchCompat switchCompat9 = (SwitchCompat) view.findViewById(R.id.enable_default_usage_policy_toggle);
        this.x = switchCompat9;
        Spinner spinner3 = (Spinner) view.findViewById(R.id.usage_policy_spinner);
        this.b = spinner3;
        View findViewById6 = view.findViewById(R.id.enable_content_id);
        this.s = findViewById6;
        TextView textView11 = (TextView) view.findViewById(R.id.enable_content_id_text);
        this.t = textView11;
        SwitchCompat switchCompat10 = (SwitchCompat) view.findViewById(R.id.enable_content_id_toggle);
        this.u = switchCompat10;
        Spinner spinner4 = (Spinner) view.findViewById(R.id.match_policy_spinner);
        this.c = spinner4;
        view.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        int i4 = atgeVar.b & 128;
        if (i4 != 0) {
            if (i4 != 0) {
                aragVar = atgeVar.g;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView5.setText(ajgl.b(aragVar));
        }
        if ((atgeVar.b & 2) != 0) {
            atgb atgbVar = atgeVar.c;
            ashv ashvVar = (atgbVar == null ? atgb.a : atgbVar).c;
            i = 0;
            spinner = spinner4;
            spinner2 = spinner3;
            textView2 = textView11;
            switchCompat2 = switchCompat10;
            textView3 = textView8;
            view3 = findViewById4;
            switchCompat3 = switchCompat7;
            view4 = findViewById5;
            switchCompat4 = switchCompat8;
            textView4 = textView9;
            view2 = findViewById3;
            switchCompat = switchCompat6;
            textView = textView7;
            this.d = new aclz(activity, ajxzVar, aafoVar, findViewById, textView6, switchCompat5, ashvVar == null ? ashv.a : ashvVar);
            findViewById.setVisibility(0);
        } else {
            spinner = spinner4;
            switchCompat = switchCompat6;
            textView = textView7;
            spinner2 = spinner3;
            textView2 = textView11;
            switchCompat2 = switchCompat10;
            i = 0;
            view2 = findViewById3;
            textView3 = textView8;
            view3 = findViewById4;
            switchCompat3 = switchCompat7;
            view4 = findViewById5;
            switchCompat4 = switchCompat8;
            textView4 = textView9;
        }
        if ((atgeVar.b & 256) != 0) {
            atgb atgbVar2 = atgeVar.h;
            ashv ashvVar2 = (atgbVar2 == null ? atgb.a : atgbVar2).c;
            this.i = new aclz(activity, ajxzVar, aafoVar, view3, textView4, switchCompat4, ashvVar2 == null ? ashv.a : ashvVar2);
            if (true != this.d.c()) {
                i3 = 4;
                view6 = view3;
            } else {
                view6 = view3;
                i3 = 0;
            }
            view6.setVisibility(i3);
            this.d.a(this);
        }
        atgb atgbVar3 = atgeVar.d;
        if (((atgbVar3 == null ? atgb.a : atgbVar3).b & 1) != 0) {
            atgb atgbVar4 = atgeVar.d;
            ashv ashvVar3 = (atgbVar4 == null ? atgb.a : atgbVar4).c;
            this.e = new aclz(activity, ajxzVar, aafoVar, findViewById2, textView, switchCompat, ashvVar3 == null ? ashv.a : ashvVar3);
            findViewById2.setVisibility(i);
            atgb atgbVar5 = atgeVar.f;
            if (((atgbVar5 == null ? atgb.a : atgbVar5).b & 1) != 0) {
                atgb atgbVar6 = atgeVar.f;
                ashv ashvVar4 = (atgbVar6 == null ? atgb.a : atgbVar6).c;
                this.f = new aclz(activity, ajxzVar, aafoVar, view2, textView3, switchCompat3, ashvVar4 == null ? ashv.a : ashvVar4);
                if (true != this.e.c()) {
                    view5 = view2;
                    i2 = 8;
                } else {
                    view5 = view2;
                    i2 = 0;
                }
                view5.setVisibility(i2);
                this.e.a(this);
            }
        }
        atgg atggVar = atgeVar.e;
        if (((atggVar == null ? atgg.a : atggVar).b & 1) != 0) {
            atgg atggVar2 = atgeVar.e;
            atgf atgfVar = (atggVar2 == null ? atgg.a : atggVar2).c;
            atgf atgfVar2 = atgfVar == null ? atgf.a : atgfVar;
            atgb atgbVar7 = atgfVar2.b;
            atgbVar7 = atgbVar7 == null ? atgb.a : atgbVar7;
            if ((atgbVar7.b & 1) != 0) {
                ashv ashvVar5 = atgbVar7.c;
                this.g = new aclz(activity, ajxzVar, aafoVar, view4, textView10, switchCompat9, ashvVar5 == null ? ashv.a : ashvVar5);
                view4.setVisibility(i);
            }
            atgc atgcVar = atgfVar2.c;
            atgcVar = atgcVar == null ? atgc.a : atgcVar;
            if ((atgcVar.b & 1) != 0) {
                ashz ashzVar = atgcVar.c;
                Spinner spinner5 = spinner2;
                c(spinner5, ashzVar == null ? ashz.a : ashzVar);
                spinner5.setVisibility(i);
            }
            atgb atgbVar8 = atgfVar2.d;
            atgbVar8 = atgbVar8 == null ? atgb.a : atgbVar8;
            if ((atgbVar8.b & 1) == 0) {
                return;
            }
            ashv ashvVar6 = atgbVar8.c;
            this.h = new aclz(activity, ajxzVar, aafoVar, findViewById6, textView2, switchCompat2, ashvVar6 == null ? ashv.a : ashvVar6);
            findViewById6.setVisibility(i);
            atgc atgcVar2 = atgfVar2.e;
            atgcVar2 = atgcVar2 == null ? atgc.a : atgcVar2;
            if ((atgcVar2.b & 1) == 0) {
                return;
            }
            ashz ashzVar2 = atgcVar2.c;
            Spinner spinner6 = spinner;
            c(spinner6, ashzVar2 == null ? ashz.a : ashzVar2);
            spinner6.setVisibility(true != this.h.c() ? 8 : 0);
            this.h.a(this);
        }
    }

    private final void c(Spinner spinner, ashz ashzVar) {
        if (spinner == null || ashzVar == null) {
            return;
        }
        acmb acmbVar = new acmb(this.j, this.k, ashzVar);
        spinner.setAdapter((SpinnerAdapter) acmbVar);
        aovs aovsVar = ashzVar.d;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        if ((aovsVar.b & 1) != 0) {
            aovs aovsVar2 = ashzVar.d;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar = aovsVar2.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            spinner.setContentDescription(aovrVar.c);
        }
        for (int i = 0; i < acmbVar.getCount(); i++) {
            if (acmbVar.getItem(i).h) {
                spinner.setSelection(i, false);
                return;
            }
        }
    }

    public final void a() {
        View view = this.p;
        if (view != null) {
            view.setEnabled(false);
            this.p.setAlpha(0.45f);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setEnabled(false);
            this.E.setAlpha(0.45f);
        }
    }

    public final void b() {
        View view = this.p;
        if (view != null) {
            view.setEnabled(true);
            this.p.setAlpha(1.0f);
        }
        View view2 = this.E;
        if (view2 != null) {
            view2.setEnabled(true);
            this.E.setAlpha(1.0f);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 8;
        if (compoundButton == this.A) {
            View view = this.B;
            if (true == z) {
                i = 0;
            }
            view.setVisibility(i);
        } else if (compoundButton == this.u) {
            Spinner spinner = this.c;
            if (true == z) {
                i = 0;
            }
            spinner.setVisibility(i);
        } else if (compoundButton != this.r) {
        } else {
            View view2 = this.E;
            if (true == z) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.n) {
            this.m.s();
        }
    }
}
