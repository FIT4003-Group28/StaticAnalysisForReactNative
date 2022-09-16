package defpackage;

import com.google.android.apps.youtube.app.application.Shell_UploadActivity;
/* compiled from: PG */
/* renamed from: eey  reason: default package */
/* loaded from: classes3.dex */
public final class eey implements amau {
    private final Shell_UploadActivity a;
    private final whe b;

    public eey(Shell_UploadActivity shell_UploadActivity, alzn alznVar, whe wheVar) {
        this.a = shell_UploadActivity;
        this.b = wheVar;
        ambi b = ambj.b(shell_UploadActivity);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.b.b(8, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.b.c(8, th);
        this.a.finish();
    }

    @Override // defpackage.amau
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.amau
    public final /* synthetic */ void d() {
        answ.m(this);
    }
}
