package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: acjd  reason: default package */
/* loaded from: classes2.dex */
public final class acjd implements degu<Void> {
    final /* synthetic */ List a;
    final /* synthetic */ acje b;

    public acjd(acje acjeVar, List list) {
        this.b = acjeVar;
        this.a = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        dcdn<acjq, Integer> dcdnVar = acje.a;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Void r4) {
        final acjm acjmVar = this.b.d;
        final List<String> list = this.a;
        dehn g = deew.g(acjmVar.b(list), new defg(acjmVar, list) { // from class: acjg
            private final acjm a;
            private final List b;

            {
                this.a = acjmVar;
                this.b = list;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final acjm acjmVar2 = this.a;
                final List list2 = this.b;
                Void r42 = (Void) obj;
                return deew.g(acjmVar2.a(), new defg(acjmVar2, list2) { // from class: acji
                    private final acjm a;
                    private final List b;

                    {
                        this.a = acjmVar2;
                        this.b = list2;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        acjm acjmVar3 = this.a;
                        List<String> list3 = this.b;
                        ackc ackcVar = (ackc) obj2;
                        dsqp dsqpVar = (dsqp) ackcVar.cu(5);
                        dsqpVar.bC(ackcVar);
                        acka ackaVar = (acka) dsqpVar;
                        for (String str : list3) {
                            ackaVar.a(str);
                        }
                        return acjmVar3.c(ackaVar.bK());
                    }
                }, dege.a);
            }
        }, dege.a);
        final List list2 = this.a;
        g.Pk(new Runnable(list2) { // from class: acjc
            private final List a;

            {
                this.a = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                List list3 = this.a;
                dcdn<acjq, Integer> dcdnVar = acje.a;
                list3.toString();
            }
        }, dege.a);
    }
}
