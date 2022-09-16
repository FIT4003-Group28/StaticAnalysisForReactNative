package defpackage;

import com.google.android.apps.youtube.app.application.Shell_MediaSearchActivity;
/* compiled from: PG */
/* renamed from: eev  reason: default package */
/* loaded from: classes3.dex */
public final class eev implements amau {
    public final ohp a;
    private final Shell_MediaSearchActivity b;
    private final whe c;

    public eev(ohp ohpVar, Shell_MediaSearchActivity shell_MediaSearchActivity, alzn alznVar, whe wheVar) {
        this.a = ohpVar;
        this.b = shell_MediaSearchActivity;
        this.c = wheVar;
        ambi b = ambj.b(shell_MediaSearchActivity);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.c.b(7, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.c.c(7, th);
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
