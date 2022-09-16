package com.google.android.apps.youtube.app.mdx;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxSmartRemoteMealbarController implements f, ynl {
    public final Activity a;
    public final akfd b;
    public final adgc c;
    public final SharedPreferences d;
    public final adoa e;
    public final afvn f;
    public final afvt g;
    public final zhf h;
    private final yni i;

    public MdxSmartRemoteMealbarController(Activity activity, akfd akfdVar, adgc adgcVar, yni yniVar, SharedPreferences sharedPreferences, adoa adoaVar, afvn afvnVar, afvt afvtVar, zhf zhfVar) {
        this.a = activity;
        this.b = akfdVar;
        this.c = adgcVar;
        this.i = yniVar;
        this.d = sharedPreferences;
        this.e = adoaVar;
        this.f = afvnVar;
        this.g = afvtVar;
        this.h = zhfVar;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                adsk adskVar = (adsk) obj;
                adig b = adskVar.b();
                if (b == null || this.e.e() != null || adskVar.a() == this.d.getLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", 0L)) {
                    return null;
                }
                iyd iydVar = new iyd(1);
                Resources resources = this.a.getResources();
                if (this.f.c().g()) {
                    akfd akfdVar = this.b;
                    akfe l = akfdVar.l();
                    l.c = resources.getText(R.string.mdx_smart_remote_mealbar_incognito_title);
                    l.m = iydVar;
                    akfe d = l.a(resources.getText(R.string.mdx_smart_remote_mealbar_incognito_connect_button_text), new ivu(this, b, 1)).c(resources.getText(R.string.mdx_smart_remote_mealbar_cancel_button_text), ija.b).d(2131232541);
                    d.h(false);
                    akfdVar.n(d.e());
                } else {
                    akfd akfdVar2 = this.b;
                    akfe l2 = akfdVar2.l();
                    l2.c = resources.getText(R.string.mdx_smart_remote_mealbar_title);
                    l2.d = resources.getText(R.string.mdx_smart_remote_mealbar_detail_text);
                    l2.m = iydVar;
                    akfe d2 = l2.a(resources.getText(R.string.mdx_smart_remote_mealbar_connect_button_text), new ivu(this, b)).c(resources.getText(R.string.mdx_smart_remote_mealbar_cancel_button_text), ija.c).d(2131232131);
                    d2.h(false);
                    akfdVar2.n(d2.e());
                }
                this.d.edit().putLong("com.google.android.libraries.youtube.mdx.smartremote.LAST_SMART_REMOTE_REQUESTED_TIME", adskVar.a()).apply();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{adsk.class};
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.i.m(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.i.g(this);
    }
}
