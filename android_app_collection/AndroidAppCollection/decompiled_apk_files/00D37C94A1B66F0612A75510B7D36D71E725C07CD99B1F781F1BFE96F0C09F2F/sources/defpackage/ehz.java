package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.youtube.app.settings.presenter.TimeRangeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: ehz  reason: default package */
/* loaded from: classes3.dex */
public final class ehz implements ajru {
    public final Switch a;
    public final ehh b;
    public boolean c;
    public ljz d;
    public lkd e;
    public AlertDialog f;
    public AlertDialog g;
    private final Activity h;
    private final ajrx i;
    private final TextView j;
    private final TextView k;
    private final aypf l;
    private final int m;
    private final eil n;
    private final aken o;
    private aurg p;
    private boolean q;
    private boolean r = false;
    private final aacz s;

    public ehz(Activity activity, ehh ehhVar, aadd aaddVar, eil eilVar, aacz aaczVar, gem gemVar, aken akenVar, ayor ayorVar, ViewGroup viewGroup) {
        long seconds;
        this.b = ehhVar;
        this.i = gemVar;
        this.h = activity;
        this.s = aaczVar;
        this.n = eilVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        arhd a = aaddVar.a();
        asxp asxpVar = a.e;
        if (((asxpVar == null ? asxp.a : asxpVar).e & 256) != 0) {
            asxp asxpVar2 = a.e;
            seconds = (asxpVar2 == null ? asxp.a : asxpVar2).ae;
        } else {
            seconds = TimeUnit.MINUTES.toSeconds(15L);
        }
        this.m = Math.max(1, (int) timeUnit.toMinutes(seconds));
        f(ehhVar.b());
        this.o = akenVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        this.j = (TextView) inflate.findViewById(R.id.title);
        this.k = (TextView) inflate.findViewById(R.id.summary);
        this.a = (Switch) inflate.findViewById(R.id.switch_button);
        gemVar.c(inflate);
        gemVar.d(new View.OnClickListener() { // from class: ehs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehz.this.g();
            }
        });
        ayoi aa = ayoi.w(new ayoj() { // from class: ehw
            @Override // defpackage.ayoj
            public final void a(final azeh azehVar) {
                final ehz ehzVar = ehz.this;
                ehzVar.a.setOnClickListener(new View.OnClickListener() { // from class: eht
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        azehVar.a(Boolean.valueOf(ehz.this.a.isChecked()));
                    }
                });
                ayqi.f(azehVar, banl.n(new aypv() { // from class: ehx
                    @Override // defpackage.aypv
                    public final void a() {
                        ehz.this.a.setOnClickListener(null);
                    }
                }));
            }
        }).aa();
        this.l = new aypf(ehhVar.g().X(ayorVar).as(new ehy(this, 1)), eilVar.a().X(ayorVar).as(new ehy(this)), aa.X(ayorVar).I(efx.e).as(new ehy(this, 2)), aa.X(ayorVar).as(new ehy(this, 3)));
    }

    private final void h(boolean z, boolean z2) {
        arag aragVar;
        if (z2) {
            aragVar = ajgl.g(this.h.getString(R.string.bedtime_reminder_setting_summary_system_schedule));
        } else {
            aragVar = this.p.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        }
        if (!z && (aragVar = this.p.j) == null) {
            aragVar = arag.a;
        }
        zag.m(this.k, ajgl.b(aragVar));
    }

    private final void i(boolean z) {
        Switch r0 = this.a;
        if (r0 != null) {
            r0.setChecked(z);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.i).b;
    }

    public final aynr d() {
        egw egwVar = egw.a;
        return this.b.e(egwVar.h, egwVar.g);
    }

    public final void e(boolean z, int i, int i2, boolean z2) {
        this.q = z;
        if (z) {
            if (this.n.a().aw() == eik.NO_ACCESS) {
                vwj.a(this.h);
            }
            this.b.n(z2);
        } else {
            if (((eik) this.n.a().aw()).f) {
                vwj.b(this.h);
            }
            ehh ehhVar = this.b;
            int i3 = this.m;
            ylx.m(ehhVar.c(new agam(i * i3, i2 * i3, z2, 1)), new dzl(6));
        }
        d().Q();
    }

    public final void f(egw egwVar) {
        Activity activity = this.h;
        int i = egwVar.d;
        int i2 = egwVar.e;
        int i3 = this.m;
        boolean z = egwVar.f;
        aopa createBuilder = aurg.a.createBuilder();
        aopc aopcVar = (aopc) aunb.a.createBuilder();
        aopg aopgVar = SettingRenderer.settingDialogRenderer;
        aopa createBuilder2 = aurm.a.createBuilder();
        arag h = ajgl.h(activity.getString(R.string.bedtime_reminder_setting_dialog_title));
        createBuilder2.copyOnWrite();
        aurm aurmVar = (aurm) createBuilder2.instance;
        h.getClass();
        aurmVar.c = h;
        aurmVar.b |= 1;
        aopc aopcVar2 = (aopc) aunb.a.createBuilder();
        aopcVar2.e(SettingRenderer.settingSingleOptionMenuRenderer, ehi.a(i, i3, activity.getString(R.string.bedtime_reminder_start_time)));
        createBuilder2.aL(aopcVar2);
        aopc aopcVar3 = (aopc) aunb.a.createBuilder();
        aopcVar3.e(SettingRenderer.settingSingleOptionMenuRenderer, ehi.a(i2, i3, activity.getString(R.string.bedtime_reminder_end_time)));
        createBuilder2.aL(aopcVar3);
        aopc aopcVar4 = (aopc) aunb.a.createBuilder();
        aopg aopgVar2 = SettingRenderer.a;
        aopa createBuilder3 = aurg.a.createBuilder();
        createBuilder3.copyOnWrite();
        aurg aurgVar = (aurg) createBuilder3.instance;
        aurgVar.b |= 64;
        aurgVar.f = z;
        arag g = ajgl.g(activity.getString(R.string.bedtime_reminder_wait_until));
        createBuilder3.copyOnWrite();
        aurg aurgVar2 = (aurg) createBuilder3.instance;
        g.getClass();
        aurgVar2.d = g;
        aurgVar2.b |= 16;
        aopcVar4.e(aopgVar2, (aurg) createBuilder3.mo39build());
        createBuilder2.aL(aopcVar4);
        aopcVar.e(aopgVar, (aurm) createBuilder2.mo39build());
        aunb aunbVar = (aunb) aopcVar.mo39build();
        createBuilder.copyOnWrite();
        aurg aurgVar3 = (aurg) createBuilder.instance;
        aunbVar.getClass();
        aurgVar3.n = aunbVar;
        aurgVar3.b |= 32768;
        arag g2 = ajgl.g(activity.getString(R.string.bedtime_reminder_setting_title));
        createBuilder.copyOnWrite();
        aurg aurgVar4 = (aurg) createBuilder.instance;
        g2.getClass();
        aurgVar4.d = g2;
        aurgVar4.b |= 16;
        arag g3 = ajgl.g(activity.getString(R.string.bedtime_reminder_setting_summary));
        createBuilder.copyOnWrite();
        aurg aurgVar5 = (aurg) createBuilder.instance;
        g3.getClass();
        aurgVar5.j = g3;
        aurgVar5.b |= 2048;
        arag g4 = ajgl.g(activity.getString(R.string.bedtime_reminder_setting_summary_enabled, ehi.b(activity, i), ehi.b(activity, i2)));
        createBuilder.copyOnWrite();
        aurg aurgVar6 = (aurg) createBuilder.instance;
        g4.getClass();
        aurgVar6.e = g4;
        aurgVar6.b |= 32;
        createBuilder.copyOnWrite();
        aurg aurgVar7 = (aurg) createBuilder.instance;
        aurgVar7.c = 345;
        aurgVar7.b |= 1;
        this.p = (aurg) createBuilder.mo39build();
        this.q = egwVar.j;
        aunb aunbVar2 = this.p.n;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (!aunbVar2.qn(SettingRenderer.settingDialogRenderer) || !this.r) {
            return;
        }
        aunb aunbVar3 = this.p.n;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        aurm aurmVar2 = (aurm) aunbVar3.qm(SettingRenderer.settingDialogRenderer);
        if (!this.c && this.d != null && this.f.isShowing()) {
            ljz ljzVar = this.d;
            ljzVar.a(aurmVar2);
            ljzVar.b.d(aurmVar2);
        } else if (this.c && this.e != null && this.g.isShowing()) {
            lkd lkdVar = this.e;
            lkdVar.a(aurmVar2);
            lkdVar.a.d(aurmVar2);
        }
        h(egwVar.c, egwVar.j);
        i(egwVar.c);
    }

    public final void g() {
        if (this.d == null || !this.f.isShowing()) {
            if (this.e != null && this.g.isShowing()) {
                return;
            }
            aunb aunbVar = this.p.n;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aurm aurmVar = (aurm) aunbVar.qm(SettingRenderer.settingDialogRenderer);
            boolean z = this.c;
            boolean z2 = this.q;
            AlertDialog alertDialog = null;
            if (!eog.aw(this.s) || !z) {
                final ljz ljzVar = new ljz(this.h);
                this.d = ljzVar;
                final ehu ehuVar = new ehu(this);
                View inflate = LayoutInflater.from(ljzVar.a).inflate(R.layout.setting_boolean_bedtime_reminder_dialog, (ViewGroup) null, false);
                ljzVar.c = (TextView) inflate.findViewById(R.id.dialog_title);
                ljzVar.b = (TimeRangeView) inflate.findViewById(R.id.time_range);
                ljzVar.d = (CheckBox) inflate.findViewById(R.id.checkbox);
                TextView textView = ljzVar.c;
                arag aragVar = aurmVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                textView.setText(ajgl.b(aragVar));
                ljzVar.a(aurmVar);
                if (ljzVar.b.c(aurmVar, 24)) {
                    AlertDialog.Builder view = new AlertDialog.Builder(ljzVar.a).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate);
                    view.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: ljy
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ljz ljzVar2 = ljz.this;
                            ehu ehuVar2 = ehuVar;
                            ehuVar2.a.e(false, ljzVar2.b.a(), ljzVar2.b.b(), ljzVar2.d.isChecked());
                        }
                    });
                    alertDialog = view.create();
                }
                this.f = alertDialog;
            } else {
                final lkd lkdVar = new lkd(this.h, this.o);
                this.e = lkdVar;
                final ehv ehvVar = new ehv(this);
                View inflate2 = LayoutInflater.from(lkdVar.b).inflate(R.layout.setting_boolean_bedtime_reminder_system_dialog, (ViewGroup) null, false);
                lkdVar.d = (TextView) inflate2.findViewById(R.id.dialog_title);
                lkdVar.e = (RadioButton) inflate2.findViewById(R.id.use_system_schedule);
                lkdVar.f = (RadioButton) inflate2.findViewById(R.id.use_custom_schedule);
                lkdVar.g = inflate2.findViewById(R.id.manage_phone_settings);
                lkdVar.g.setOnClickListener(new lkc(lkdVar));
                lkdVar.a = (TimeRangeView) inflate2.findViewById(R.id.time_range);
                lkdVar.h = (CheckBox) inflate2.findViewById(R.id.checkbox);
                zag.o(lkdVar.g, false);
                zag.o(lkdVar.a, false);
                lkdVar.e.setOnCheckedChangeListener(new lkb(lkdVar, 1));
                lkdVar.f.setOnCheckedChangeListener(new lkb(lkdVar));
                (z2 ? lkdVar.e : lkdVar.f).setChecked(true);
                aken akenVar = lkdVar.c;
                if (akenVar.a) {
                    akenVar.b(lkdVar.e);
                    lkdVar.c.b(lkdVar.f);
                    int dimension = (int) lkdVar.b.getResources().getDimension(R.dimen.setting_bedtime_radio_button_start_spacing);
                    lkdVar.e.setPaddingRelative(dimension, 0, 0, 0);
                    lkdVar.f.setPaddingRelative(dimension, 0, 0, 0);
                }
                TextView textView2 = lkdVar.d;
                arag aragVar2 = aurmVar.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                textView2.setText(ajgl.b(aragVar2));
                lkdVar.a(aurmVar);
                if (lkdVar.a.c(aurmVar, 24)) {
                    AlertDialog.Builder view2 = new AlertDialog.Builder(lkdVar.b).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setView(inflate2);
                    view2.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: lka
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            lkd lkdVar2 = lkd.this;
                            ehv ehvVar2 = ehvVar;
                            ehvVar2.a.e(lkdVar2.e.isChecked(), lkdVar2.a.a(), lkdVar2.a.b(), lkdVar2.h.isChecked());
                        }
                    });
                    alertDialog = view2.create();
                }
                this.g = alertDialog;
            }
            if (alertDialog == null) {
                return;
            }
            alertDialog.show();
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        lku lkuVar = (lku) obj;
        aunb aunbVar = this.p.n;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(SettingRenderer.settingDialogRenderer)) {
            return;
        }
        this.r = true;
        TextView textView = this.j;
        arag aragVar = this.p.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        zag.m(textView, ajgl.b(aragVar));
        h(this.b.j(), this.b.b().j);
        i(this.b.j());
        this.i.e(ajrsVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.l.c();
    }
}
