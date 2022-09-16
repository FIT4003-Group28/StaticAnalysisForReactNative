package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajex  reason: default package */
/* loaded from: classes.dex */
public final class ajex implements ajet {
    public final ajet a;
    final /* synthetic */ ajfa b;

    public ajex(ajfa ajfaVar, ajet ajetVar) {
        this.b = ajfaVar;
        this.a = ajetVar;
    }

    @Override // defpackage.ajet
    public final void a() {
        ajfa ajfaVar = this.b;
        ajet ajetVar = this.a;
        ajetVar.getClass();
        ajfaVar.a(new ajeu(ajetVar, 1));
    }

    @Override // defpackage.ajet
    public final void b(final PlayerResponseModel playerResponseModel, final String str) {
        this.b.a(new Runnable() { // from class: ajew
            @Override // java.lang.Runnable
            public final void run() {
                ajex ajexVar = ajex.this;
                ajexVar.a.b(playerResponseModel, str);
            }
        });
    }

    @Override // defpackage.ajet
    public final void c() {
        ajfa ajfaVar = this.b;
        ajet ajetVar = this.a;
        ajetVar.getClass();
        ajfaVar.a(new ajeu(ajetVar));
    }

    @Override // defpackage.ajet
    public final void d() {
        this.b.a(new Runnable() { // from class: ajev
            @Override // java.lang.Runnable
            public final void run() {
                ajex.this.a.d();
            }
        });
    }
}
