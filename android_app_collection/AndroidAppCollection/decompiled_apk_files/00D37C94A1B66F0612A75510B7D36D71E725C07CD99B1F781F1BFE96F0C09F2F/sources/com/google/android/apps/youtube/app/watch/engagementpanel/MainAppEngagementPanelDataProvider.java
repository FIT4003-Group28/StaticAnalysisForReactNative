package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainAppEngagementPanelDataProvider implements f, nqj {
    public nml a;
    private final Context b;
    private final tdb c;
    private final nmu d;
    private final ezh e;
    private String f;
    private ViewTreeObserver.OnPreDrawListener g;

    public MainAppEngagementPanelDataProvider(Context context, tdb tdbVar, nmu nmuVar, ezh ezhVar) {
        this.b = context;
        this.c = tdbVar;
        this.d = nmuVar;
        this.e = ezhVar;
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        String str = null;
        if (nmcVar != null && nmcVar.l() != null) {
            str = ntr.d(nmcVar.l());
        }
        View a = this.a.a();
        if (a != null) {
            this.g = new npa(this, a, str);
            a.getViewTreeObserver().addOnPreDrawListener(this.g);
        }
        h(str);
        this.f = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.String r6) {
        /*
            r5 = this;
            tdb r0 = r5.c
            asxn r1 = defpackage.asxn.a
            aopa r1 = r1.createBuilder()
            ezh r2 = r5.e
            ezx r2 = r2.g()
            boolean r2 = r2.i()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L19
            if (r6 != 0) goto L25
            r6 = 0
        L19:
            java.lang.String r2 = r5.f
            if (r2 == 0) goto L20
            r1.au(r2, r4)
        L20:
            if (r6 == 0) goto L25
            r1.au(r6, r3)
        L25:
            nml r6 = r5.a
            android.view.View r6 = r6.a()
            android.content.Context r2 = r5.b
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r6 != 0) goto L38
            goto L3c
        L38:
            int r4 = r6.getHeight()
        L3c:
            int r6 = defpackage.zew.n(r2, r4)
            r1.copyOnWrite()
            aopi r2 = r1.instance
            asxn r2 = (defpackage.asxn) r2
            int r4 = r2.b
            r3 = r3 | r4
            r2.b = r3
            float r6 = (float) r6
            r2.c = r6
            aopi r6 = r1.mo39build()
            asxn r6 = (defpackage.asxn) r6
            byte[] r6 = r6.toByteArray()
            java.lang.String r1 = "/youtube/app/engagement_panel"
            r0.b(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watch.engagementpanel.MainAppEngagementPanelDataProvider.h(java.lang.String):void");
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        this.d.b().as(new ayqb() { // from class: noz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                MainAppEngagementPanelDataProvider mainAppEngagementPanelDataProvider = MainAppEngagementPanelDataProvider.this;
                nml nmlVar = (nml) obj;
                nml nmlVar2 = mainAppEngagementPanelDataProvider.a;
                if (nmlVar2 != null) {
                    nmlVar2.g().b(mainAppEngagementPanelDataProvider);
                }
                mainAppEngagementPanelDataProvider.a = nmlVar;
                mainAppEngagementPanelDataProvider.a.g().a(mainAppEngagementPanelDataProvider);
            }
        });
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.a.g().b(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
