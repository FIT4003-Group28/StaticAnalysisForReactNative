package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afil  reason: default package */
/* loaded from: classes.dex */
public final class afil implements afkg {
    public long a;
    public int b;
    final /* synthetic */ afiz c;

    public afil(afiz afizVar) {
        this.c = afizVar;
    }

    @Override // defpackage.afkg
    public final void a(afkv afkvVar) {
        if (!afkvVar.d) {
            return;
        }
        this.a += afkvVar.c;
        this.b += afkvVar.b;
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void rX(long j) {
    }
}
