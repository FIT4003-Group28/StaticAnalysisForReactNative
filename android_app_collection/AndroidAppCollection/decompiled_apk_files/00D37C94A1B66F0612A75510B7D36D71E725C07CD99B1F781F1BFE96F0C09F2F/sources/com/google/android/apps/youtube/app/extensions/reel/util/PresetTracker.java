package com.google.android.apps.youtube.app.extensions.reel.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.extensions.reel.util.PresetTracker;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PresetTracker implements f {
    public final apy a;
    public final zse b;
    protected final Handler c;
    protected String d;
    public boolean e;
    public String f;
    public final vne g;

    public PresetTracker(apy apyVar, zse zseVar, vne vneVar) {
        this.a = apyVar;
        this.b = zseVar;
        vneVar.getClass();
        this.g = vneVar;
        this.c = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean k(String str, List list) {
        return FilterMapTable$FilterDescriptor.a(list, str) != null;
    }

    protected abstract void g();

    public abstract void h(hwp hwpVar, zno znoVar);

    public final void j(FilterMapTable$FilterDescriptor filterMapTable$FilterDescriptor) {
        if (filterMapTable$FilterDescriptor != null) {
            String str = this.f;
            if (str != null && !str.equals(filterMapTable$FilterDescriptor.a)) {
                this.e = true;
            }
            this.d = filterMapTable$FilterDescriptor.a;
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    public final void l(final zno znoVar) {
        if (this.f != null || znoVar == null) {
            return;
        }
        this.c.post(new Runnable() { // from class: hqm
            @Override // java.lang.Runnable
            public final void run() {
                final PresetTracker presetTracker = PresetTracker.this;
                final zno znoVar2 = znoVar;
                ylx.n(presetTracker.a, presetTracker.g.a(), hmv.d, new zdt() { // from class: hql
                    @Override // defpackage.zdt
                    public final void a(Object obj) {
                        PresetTracker presetTracker2 = PresetTracker.this;
                        zno znoVar3 = znoVar2;
                        hwp hwpVar = (hwp) obj;
                        if (hwpVar != null) {
                            presetTracker2.h(hwpVar, znoVar3);
                            String str = presetTracker2.f;
                            if (str == null) {
                                return;
                            }
                            presetTracker2.b.c(str);
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        apyVar.getLifecycle().e(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nv(apy apyVar) {
        if (this.e) {
            g();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
