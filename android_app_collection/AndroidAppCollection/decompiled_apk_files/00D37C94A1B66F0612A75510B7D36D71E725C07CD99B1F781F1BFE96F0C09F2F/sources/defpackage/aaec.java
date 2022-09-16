package defpackage;

import j$.util.Collection;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: aaec  reason: default package */
/* loaded from: classes.dex */
abstract class aaec implements aaev {
    private final tpp a;
    private final amqo b;

    public aaec(final tpp tppVar, final azqb azqbVar) {
        tppVar.getClass();
        this.a = tppVar;
        this.b = aqxo.i(new amqo() { // from class: aaea
            @Override // defpackage.amqo
            public final Object get() {
                return (amup) Collection.EL.stream(tpp.this.h).collect(amsf.a(omr.j, omr.k));
            }
        });
        aqxo.i(new amqo() { // from class: aaeb
            @Override // defpackage.amqo
            public final Object get() {
                tpp tppVar2 = tpp.this;
                try {
                    if ((tppVar2.b & 256) != 0) {
                        aono aonoVar = tppVar2.m;
                        if (aonoVar == null) {
                            aonoVar = aono.a;
                        }
                        awlm awlmVar = ((awll) aopi.parseFrom(awll.a, aonoVar.c, aoos.b())).b;
                        if (awlmVar == null) {
                            awlmVar = awlm.a;
                        }
                        return amuk.o(awlmVar.b);
                    }
                    return amuk.q();
                } catch (aopx unused) {
                    ((aaeo) azqbVar.get()).a(aqkb.DATA_PUSH_CLIENT_EVENT_TYPE_MANIFEST_INIT_FAILED, tppVar2.c);
                    zep.b("Failed to initialize FileGroup manifest.");
                    return amuk.q();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final amup a() {
        return (amup) this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.a.c;
    }

    @Override // defpackage.aaev
    public final String c() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaec)) {
            return false;
        }
        tpp tppVar = this.a;
        int i = tppVar.f;
        tpp tppVar2 = ((aaec) obj).a;
        return i == tppVar2.f && Objects.equals(tppVar.c, tppVar2.c);
    }

    public final int hashCode() {
        tpp tppVar = this.a;
        return Objects.hash(tppVar.c, Integer.valueOf(tppVar.f));
    }
}
