package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: sfr  reason: default package */
/* loaded from: classes7.dex */
public final class sfr implements degu<dopk> {
    final /* synthetic */ alho a;
    final /* synthetic */ sfy b;

    public sfr(sfy sfyVar, alho alhoVar) {
        this.b = sfyVar;
        this.a = alhoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof qdr)) {
            rzr F = this.b.F();
            final alho alhoVar = this.a;
            F.a(new Runnable(this, alhoVar) { // from class: sfq
                private final sfr a;
                private final alho b;

                {
                    this.a = this;
                    this.b = alhoVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    sfr sfrVar = this.a;
                    sfrVar.b.x(this.b);
                }
            });
        }
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
    }
}
