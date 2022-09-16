package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;
import com.google.android.libraries.youtube.player.features.onesie.BandaidConnectionOpenerController;
/* compiled from: PG */
/* renamed from: eez  reason: default package */
/* loaded from: classes3.dex */
public final class eez extends efd implements amau {
    public final Shell_UrlActivity a;
    public final eza b;
    public final BandaidConnectionOpenerController c;
    public final yni d;
    public final etn e;
    public final aiix f;
    public final ohp g;
    public final osz h;
    private final whe j;

    public eez(Shell_UrlActivity shell_UrlActivity, eza ezaVar, BandaidConnectionOpenerController bandaidConnectionOpenerController, yni yniVar, ohp ohpVar, etn etnVar, osz oszVar, aiix aiixVar, alzn alznVar, whe wheVar, byte[] bArr, byte[] bArr2) {
        this.a = shell_UrlActivity;
        this.b = ezaVar;
        this.c = bandaidConnectionOpenerController;
        this.d = yniVar;
        this.g = ohpVar;
        this.e = etnVar;
        this.h = oszVar;
        this.f = aiixVar;
        this.j = wheVar;
        ambi b = ambj.b(shell_UrlActivity);
        b.b(whh.class);
        alznVar.a(b.a()).c(this);
    }

    @Override // defpackage.amau
    public final void a(amas amasVar) {
        this.j.b(5, 2, 2);
    }

    @Override // defpackage.amau
    public final void b(Throwable th) {
        this.j.c(5, th);
        this.a.finish();
    }

    @Override // defpackage.amau
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.amau
    public final /* synthetic */ void d() {
        answ.m(this);
    }

    public final boolean e() {
        Intent intent = this.a.getIntent();
        return intent.getData() != null && (intent.getBooleanExtra("force_fullscreen", false) || intent.getBooleanExtra("finish_on_ended", false));
    }
}
