package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: azlq  reason: default package */
/* loaded from: classes3.dex */
public final class azlq {
    public final /* synthetic */ azwm a;
    public final /* synthetic */ bvrj b;
    public final /* synthetic */ azlv c;
    public final /* synthetic */ azkm d;

    public azlq(azlv azlvVar, azwm azwmVar, azkm azkmVar, bvrj bvrjVar) {
        this.c = azlvVar;
        this.a = azwmVar;
        this.d = azkmVar;
        this.b = bvrjVar;
    }

    public final void a(int i) {
        azlv azlvVar = this.c;
        azwm<?> azwmVar = this.a;
        final azkm azkmVar = this.d;
        bvrj bvrjVar = this.b;
        if (i == dvou.e) {
            azlvVar.K(Collections.emptyList(), Collections.emptyList(), azwmVar, azkmVar, bvrjVar);
            return;
        }
        bvrb bvrbVar = azlvVar.a;
        azkmVar.getClass();
        bvrbVar.b(new Runnable(azkmVar) { // from class: azky
            private final azkm a;

            {
                this.a = azkmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        }, bvrjVar);
    }
}
