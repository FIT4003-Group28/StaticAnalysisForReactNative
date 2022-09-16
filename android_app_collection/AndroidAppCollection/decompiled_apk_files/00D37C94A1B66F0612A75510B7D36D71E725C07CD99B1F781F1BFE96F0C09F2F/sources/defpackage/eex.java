package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.application.Shell_SettingsActivity;
/* compiled from: PG */
/* renamed from: eex  reason: default package */
/* loaded from: classes3.dex */
public final class eex implements amau {
    public final lgt a;
    private final Shell_SettingsActivity b;
    private final whe c;

    public eex(lgt lgtVar, Shell_SettingsActivity shell_SettingsActivity, alzn alznVar, whe wheVar) {
        this.a = lgtVar;
        this.b = shell_SettingsActivity;
        this.c = wheVar;
        ambi b = ambj.b(shell_SettingsActivity);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.c.b(10, 2, 2);
        Intent i = this.b.i();
        amad.a(i, amasVar.a());
        this.b.k(i);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.c.c(10, th);
        this.b.finish();
    }

    @Override // defpackage.amau
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.amau
    public final /* synthetic */ void d() {
        answ.m(this);
    }
}
