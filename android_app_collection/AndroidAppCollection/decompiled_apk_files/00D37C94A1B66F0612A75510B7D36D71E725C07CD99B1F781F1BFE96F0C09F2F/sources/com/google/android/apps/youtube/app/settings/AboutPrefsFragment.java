package com.google.android.apps.youtube.app.settings;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AboutPrefsFragment extends lfg implements lik {
    public eyj ae;
    private aypg af;
    public akjl c;
    public lil d;
    public SettingsDataAccess e;

    @Override // defpackage.bjr
    public final void aG() {
        this.a.g("youtube");
    }

    @Override // defpackage.lik
    public final void aI() {
        this.d.a = null;
        this.ae.a(mJ(), "yt_android_settings");
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void mS() {
        super.mS();
        this.d.a = this;
        this.af = this.e.g(new Runnable() { // from class: lew
            @Override // java.lang.Runnable
            public final void run() {
                aurh o;
                AboutPrefsFragment aboutPrefsFragment = AboutPrefsFragment.this;
                if (aboutPrefsFragment.ap() && (o = aboutPrefsFragment.e.o(10009)) != null) {
                    akjl akjlVar = aboutPrefsFragment.c;
                    aboutPrefsFragment.mJ().getApplicationContext();
                    aopu<auri> aopuVar = o.d;
                    amuf f = amuk.f();
                    for (auri auriVar : aopuVar) {
                        aurs aursVar = auriVar.g;
                        if (aursVar == null) {
                            aursVar = aurs.a;
                        }
                        arag aragVar = aursVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                        aopu aopuVar2 = aragVar.c;
                        aopc aopcVar = (aopc) arai.a.createBuilder();
                        aopcVar.copyOnWrite();
                        arai araiVar = (arai) aopcVar.instance;
                        araiVar.b |= 1;
                        araiVar.c = "Open source licenses";
                        aopuVar2.contains(aopcVar.mo39build());
                        f.h(auriVar);
                    }
                    akjlVar.d(aboutPrefsFragment, f.g());
                }
            }
        });
    }

    @Override // defpackage.bjr, defpackage.dp
    public final void my() {
        super.my();
        this.d.a = null;
        azof.f((AtomicReference) this.af);
    }

    @Override // defpackage.bjr
    public final RecyclerView n(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView n = super.n(layoutInflater, viewGroup, bundle);
        n.af(null);
        return n;
    }
}
