package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.gmm.backup.GmmPersistentBackupAgentHelper;
/* compiled from: PG */
/* renamed from: dyy  reason: default package */
/* loaded from: classes6.dex */
public final class dyy extends itb {
    @dzsi
    SharedPreferences.OnSharedPreferenceChangeListener a = null;
    private final Application b;
    private final bvjj c;
    private final ckcw d;
    private final akfa e;

    public dyy(Application application, bvjj bvjjVar, ckcw ckcwVar, akfa akfaVar) {
        this.b = application;
        this.c = bvjjVar;
        this.d = ckcwVar;
        this.e = akfaVar;
    }

    private final void e(bvjk bvjkVar, ckgu ckguVar) {
        int s = this.c.s(bvjkVar, 0);
        if (s > 0) {
            ((ckcn) this.d.a(ckguVar)).b(s);
            this.c.P(bvjkVar);
        }
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        e(bvjk.hg, ckdo.d);
        e(bvjk.hh, ckdo.e);
        e(bvjk.hi, ckdo.f);
        e(bvjk.hj, ckdo.g);
        e(bvjk.hk, ckdo.h);
        e(bvjk.hl, ckdo.i);
        e(bvjk.hm, ckdo.j);
        Application application = this.b;
        ckcw ckcwVar = this.d;
        akfa akfaVar = this.e;
        GmmPersistentBackupAgentHelper.a = ckcwVar;
        GmmPersistentBackupAgentHelper.b = akfaVar;
        dyu dyuVar = new dyu(application, ckcwVar);
        this.a = dyuVar;
        this.c.f(dyuVar);
    }

    @Override // defpackage.itb
    public final void Nu() {
        super.Nu();
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.a;
        if (onSharedPreferenceChangeListener != null) {
            this.c.g(onSharedPreferenceChangeListener);
        }
    }
}
