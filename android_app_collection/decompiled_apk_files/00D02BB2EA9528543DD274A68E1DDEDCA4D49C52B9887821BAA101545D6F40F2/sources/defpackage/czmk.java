package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: czmk  reason: default package */
/* loaded from: classes5.dex */
public final class czmk {
    public final /* synthetic */ czml a;

    public czmk(czml czmlVar) {
        this.a = czmlVar;
    }

    public final dehn<Void> a(final defg defgVar, final Executor executor) {
        this.a.e.a();
        return deew.g(deha.o(this.a.c.a()), dazv.h(new defg(this, defgVar, executor) { // from class: czmi
            private final czmk a;
            private final defg b;
            private final Executor c;

            {
                this.a = this;
                this.b = defgVar;
                this.c = executor;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                czmk czmkVar = this.a;
                Void r4 = (Void) obj;
                return czmkVar.a.b.b(this.b, this.c);
            }
        }), dege.a);
    }
}
