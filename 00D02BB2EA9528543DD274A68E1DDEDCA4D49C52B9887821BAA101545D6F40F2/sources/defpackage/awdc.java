package defpackage;
/* compiled from: PG */
/* renamed from: awdc  reason: default package */
/* loaded from: classes3.dex */
public final class awdc<T> extends btrh<T> {
    public awdc(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final awda awdaVar = (awda) this.a;
        final azre azreVar = (azre) obj;
        if (dbsd.a(awdaVar.a, avze.a) || awdaVar.d.a().a()) {
            return;
        }
        awdaVar.c.a().i().Pk(new Runnable(awdaVar, azreVar) { // from class: awcz
            private final awda a;
            private final azre b;

            {
                this.a = awdaVar;
                this.b = azreVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awda awdaVar2 = this.a;
                azre azreVar2 = this.b;
                awdaVar2.c(azreVar2.a, azreVar2.b());
            }
        }, awdaVar.b);
    }
}
