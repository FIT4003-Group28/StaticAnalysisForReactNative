package com.google.android.apps.youtube.app.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class OfflinePrefsFragment extends lfl implements SharedPreferences.OnSharedPreferenceChangeListener, bka {
    public static final acum c = new acte(acuo.b(128287));
    public static final acum d = new acte(acuo.b(128286));
    public aypg aA;
    public Optional aB;
    public agrf aC;
    public eyj aD;
    private AlertDialog aG;
    private AlertDialog aH;
    private aypg aI;
    public ywa ae;
    public lgm af;
    public Handler ag;
    public abff ah;
    public fcu ai;
    public agcp aj;
    public ahbp ak;
    public fcj al;
    public aghg am;
    public ahdf an;
    public fby ao;
    public axnm ap;
    public SettingsDataAccess aq;
    public axxh ar;
    public axxa as;
    public acti at;
    public fvf au;
    public jsf av;
    public agsd aw;
    public ayor ax;
    public PreferenceScreen ay;
    public boolean az;
    public agvq e;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        this.aI = this.aq.g(new Runnable() { // from class: lga
            /* JADX WARN: Code restructure failed: missing block: B:109:0x02c9, code lost:
                if (r2.c == false) goto L97;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
                if (r2.bz != false) goto L123;
             */
            /* JADX WARN: Removed duplicated region for block: B:101:0x02ad  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x02dc  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x02f3 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:133:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 797
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lga.run():void");
            }
        });
    }

    @Override // defpackage.dp
    public final void U() {
        this.a.c().unregisterOnSharedPreferenceChangeListener(this);
        azof.f((AtomicReference) this.aI);
        aypg aypgVar = this.aA;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.aA = null;
        }
        super.U();
    }

    @Override // defpackage.bjr, defpackage.bka
    public final boolean aF(Preference preference) {
        dt mJ = mJ();
        String str = preference.s;
        if ("offline_help".equals(str)) {
            this.aD.a(mJ, "yt_android_offline");
        } else if ("clear_offline".equals(str)) {
            this.aG.show();
        } else if ("cross_device_offline".equals(str)) {
            this.aH.show();
        }
        return super.aF(preference);
    }

    @Override // defpackage.bjr
    public final void aG() {
        this.a.g("youtube");
        this.aG = new AlertDialog.Builder(mJ()).setMessage(R.string.clear_offline_confirmation).setPositiveButton(R.string.remove_all_downloads_confirm_button, new DialogInterface.OnClickListener() { // from class: lfy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Boolean bool;
                final OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                aqxe aqxeVar = offlinePrefsFragment.as.a.b().C;
                if (aqxeVar == null) {
                    aqxeVar = aqxe.a;
                }
                if (aqxeVar.a(45356736L)) {
                    aoqp aoqpVar = aqxeVar.b;
                    if (!aoqpVar.containsKey(45356736L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45356736L);
                    bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
                } else {
                    bool = false;
                }
                if (bool.booleanValue()) {
                    fvf fvfVar = offlinePrefsFragment.au;
                    fvg d2 = fvl.d();
                    d2.i(0);
                    d2.k(offlinePrefsFragment.rh().getString(R.string.offline_actions_remove_all_snackbar_text));
                    fvfVar.i(d2.b());
                } else {
                    View view = offlinePrefsFragment.O;
                    if (view != null) {
                        aloh.n(view, R.string.offline_actions_remove_all_snackbar_text).g();
                    }
                }
                offlinePrefsFragment.aC.a().r();
                offlinePrefsFragment.aA = offlinePrefsFragment.av.a().K(offlinePrefsFragment.ax).S(new ayqb() { // from class: lfz
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        OfflinePrefsFragment offlinePrefsFragment2 = OfflinePrefsFragment.this;
                        if (((Boolean) obj).booleanValue()) {
                            agsd agsdVar = offlinePrefsFragment2.aw;
                            aopa createBuilder = atrf.a.createBuilder();
                            createBuilder.copyOnWrite();
                            atrf atrfVar = (atrf) createBuilder.instance;
                            atrfVar.c = 2;
                            atrfVar.b |= 1;
                            String w = emn.w();
                            createBuilder.copyOnWrite();
                            atrf atrfVar2 = (atrf) createBuilder.instance;
                            w.getClass();
                            atrfVar2.b = 2 | atrfVar2.b;
                            atrfVar2.d = w;
                            agsdVar.d((atrf) createBuilder.mo39build());
                        }
                    }
                });
            }
        }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
        AlertDialog.Builder builder = new AlertDialog.Builder(mJ());
        final View inflate = mJ().getLayoutInflater().inflate(R.layout.cross_device_offline_dialog, (ViewGroup) null);
        final AlertDialog create = builder.setView(inflate).setTitle(R.string.menu_cross_device_offline).setPositiveButton(R.string.save_cross_device_offline_menu, new DialogInterface.OnClickListener() { // from class: lgd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                String obj = ((EditText) inflate.findViewById(R.id.cross_device_offline_device_name)).getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    offlinePrefsFragment.aL(R.string.pref_cross_device_offline_no_device_name);
                    return;
                }
                String s = offlinePrefsFragment.aj.s();
                if (s.isEmpty()) {
                    offlinePrefsFragment.aL(R.string.pref_cross_device_offline_no_gcm_registration_id);
                    return;
                }
                boolean z = offlinePrefsFragment.az;
                abff abffVar = offlinePrefsFragment.ah;
                abfe abfeVar = new abfe(abffVar.e, abffVar.c.c());
                abfeVar.a = abfe.g(zew.A(offlinePrefsFragment.mJ()));
                abfeVar.d = z ? 2 : 3;
                abfeVar.b = abfe.g(obj);
                abfeVar.c = abfe.g(s);
                abfeVar.i();
                Boolean valueOf = Boolean.valueOf(z);
                offlinePrefsFragment.ov("cross_device_offline").G(false);
                offlinePrefsFragment.ah.l.e(abfeVar, new lgk(offlinePrefsFragment, obj, valueOf));
            }
        }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
        this.aH = create;
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: lge
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                View view = inflate;
                AlertDialog alertDialog = create;
                ((Switch) view.findViewById(R.id.cross_device_offline_enabled)).setChecked(((fda) offlinePrefsFragment.ai.a.c()).d);
                EditText editText = (EditText) view.findViewById(R.id.cross_device_offline_device_name);
                editText.setText(((fda) offlinePrefsFragment.ai.a.c()).c, TextView.BufferType.EDITABLE);
                if (editText.getText().toString().isEmpty()) {
                    alertDialog.getButton(-1).setEnabled(false);
                }
            }
        });
        ((EditText) inflate.findViewById(R.id.cross_device_offline_device_name)).addTextChangedListener(new lgl(create));
        ((Switch) inflate.findViewById(R.id.cross_device_offline_enabled)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: lgf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OfflinePrefsFragment.this.az = z;
            }
        });
    }

    public final void aK(boolean z) {
        this.aB = Optional.of(Boolean.valueOf(z));
        this.at.n(z ? c : d);
    }

    public final void aL(final int i) {
        this.ag.post(new Runnable() { // from class: lgb
            @Override // java.lang.Runnable
            public final void run() {
                OfflinePrefsFragment offlinePrefsFragment = OfflinePrefsFragment.this;
                zag.q(offlinePrefsFragment.mJ(), i, 0);
            }
        });
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        awuy awuyVar;
        if (agks.QUALITY.equals(str)) {
            ListPreference listPreference = (ListPreference) ov(str);
            if (listPreference == null) {
                return;
            }
            listPreference.n(listPreference.l());
        } else if (!agks.WIFI_POLICY.equals(str)) {
        } else {
            boolean l = this.e.l();
            sharedPreferences.edit().putString(agks.WIFI_POLICY_STRING, N(l ? R.string.wifi : R.string.any)).apply();
            if (!this.e.L()) {
                return;
            }
            agvq agvqVar = this.e;
            if (l) {
                awuyVar = awuy.UNMETERED_WIFI_OR_UNMETERED_MOBILE;
            } else {
                awuyVar = awuy.ANY;
            }
            ylx.n(this, agvqVar.t(awuyVar), lcz.m, ylx.b);
        }
    }
}
