package defpackage;
/* compiled from: PG */
/* renamed from: akla  reason: default package */
/* loaded from: classes.dex */
public final class akla implements Runnable {
    final /* synthetic */ akfl a;
    private final /* synthetic */ int b;

    public akla(akfl akflVar) {
        this.a = akflVar;
    }

    public /* synthetic */ akla(akfl akflVar, int i) {
        this.b = i;
        this.a = akflVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            akfl akflVar = this.a;
            if (akflVar == null || !akflVar.f()) {
                return;
            }
            akflVar.b();
            return;
        }
        akfl akflVar2 = this.a;
        if (!akflVar2.f()) {
            return;
        }
        akflVar2.b();
    }
}
