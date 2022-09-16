package com.google.android.apps.youtube.app.mdx.watch;

import android.content.SharedPreferences;
import j$.time.Instant;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdxSuccessfulCastRecorder implements adny, f {
    private final SharedPreferences a;
    private final axnm b;
    private final axnm c;

    public MdxSuccessfulCastRecorder(SharedPreferences sharedPreferences, axnm axnmVar, axnm axnmVar2) {
        this.a = sharedPreferences;
        this.b = axnmVar;
        this.c = axnmVar2;
    }

    @Override // defpackage.adny
    public final void j(adnt adntVar) {
        SharedPreferences.Editor edit = this.a.edit();
        anhm anhmVar = anhm.a;
        edit.putLong("on_device_mdx_successful_cast_time", Instant.now().toEpochMilli()).apply();
    }

    @Override // defpackage.adny
    public final void k(adnt adntVar) {
        Boolean bool;
        aqxe aqxeVar = ((axws) this.c.get()).a.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45356810L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45356810L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45356810L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        if (!bool.booleanValue()) {
            this.a.edit().remove("on_device_mdx_successful_cast_time").apply();
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.adny
    public final void l(adnt adntVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        ((adoa) this.b.get()).g(this);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
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
