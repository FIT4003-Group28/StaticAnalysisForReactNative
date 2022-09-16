package defpackage;

import com.google.android.apps.youtube.app.application.Shell_ResultsActivity;
/* compiled from: PG */
/* renamed from: eew  reason: default package */
/* loaded from: classes3.dex */
public final class eew implements amau {
    public final ohp a;
    private final Shell_ResultsActivity b;
    private final whe c;

    public eew(ohp ohpVar, Shell_ResultsActivity shell_ResultsActivity, alzn alznVar, whe wheVar) {
        this.a = ohpVar;
        this.b = shell_ResultsActivity;
        this.c = wheVar;
        ambi b = ambj.b(shell_ResultsActivity);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.c.b(6, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.c.c(6, th);
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
