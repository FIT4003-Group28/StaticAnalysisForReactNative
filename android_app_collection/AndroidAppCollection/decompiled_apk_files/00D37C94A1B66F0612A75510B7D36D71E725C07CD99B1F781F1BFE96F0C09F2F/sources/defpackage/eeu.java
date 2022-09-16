package defpackage;

import com.google.android.apps.youtube.app.application.Shell_LiveCreationActivity;
/* compiled from: PG */
/* renamed from: eeu  reason: default package */
/* loaded from: classes3.dex */
public final class eeu implements amau {
    public final Shell_LiveCreationActivity a;
    public final gtd b;
    private final whe c;

    public eeu(Shell_LiveCreationActivity shell_LiveCreationActivity, gtd gtdVar, alzn alznVar, whe wheVar, byte[] bArr, byte[] bArr2) {
        this.a = shell_LiveCreationActivity;
        this.b = gtdVar;
        this.c = wheVar;
        ambi b = ambj.b(shell_LiveCreationActivity);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.c.b(9, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.c.c(9, th);
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
