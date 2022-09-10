package defpackage;
/* compiled from: PG */
/* renamed from: azmc  reason: default package */
/* loaded from: classes3.dex */
public final class azmc<T> extends btrh<T> {
    public azmc(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final azmb azmbVar = (azmb) this.a;
        final azrh azrhVar = (azrh) obj;
        azmbVar.a.b(new Runnable(azmbVar, azrhVar) { // from class: azlz
            private final azmb a;
            private final azrh b;

            {
                this.a = azmbVar;
                this.b = azrhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azmb azmbVar2 = this.a;
                if (this.b.a() == 1) {
                    azmbVar2.b.d(dndr.UNKNOWN_ALIAS_TYPE, azmbVar2.b());
                }
            }
        });
    }
}
