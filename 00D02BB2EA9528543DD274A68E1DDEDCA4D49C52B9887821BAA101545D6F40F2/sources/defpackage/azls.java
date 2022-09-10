package defpackage;
/* compiled from: PG */
/* renamed from: azls  reason: default package */
/* loaded from: classes3.dex */
public final class azls {
    public final /* synthetic */ azwm a;
    public final /* synthetic */ bvrj b;
    public final /* synthetic */ azlv c;
    public final /* synthetic */ azkn d;

    public azls(azlv azlvVar, azwm azwmVar, azkn azknVar, bvrj bvrjVar) {
        this.c = azlvVar;
        this.a = azwmVar;
        this.d = azknVar;
        this.b = bvrjVar;
    }

    public final void a() {
        azlv azlvVar = this.c;
        final azkn azknVar = this.d;
        bvrj bvrjVar = this.b;
        bvrb bvrbVar = azlvVar.a;
        azknVar.getClass();
        bvrbVar.b(new Runnable(azknVar) { // from class: azlc
            private final azkn a;

            {
                this.a = azknVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azko azkoVar = this.a.a;
                if (!azkoVar.aD) {
                    return;
                }
                azkoVar.g();
            }
        }, bvrjVar);
    }
}
