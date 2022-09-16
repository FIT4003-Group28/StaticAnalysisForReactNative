package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akqb  reason: default package */
/* loaded from: classes.dex */
public final class akqb implements akpu {
    public final yrj a;
    public atnw c = atnw.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
    public final azpa b = azpa.ar();
    private final amqo d = aqxo.i(new amqo() { // from class: akpz
        @Override // defpackage.amqo
        public final Object get() {
            return akqb.this.b.n().I().l(500L, TimeUnit.MILLISECONDS).A();
        }
    });

    public akqb(aynx aynxVar, yrj yrjVar, Executor executor, yme ymeVar) {
        this.a = yrjVar;
        if (ymeVar.c().j) {
            aynxVar.G(azpj.b(executor)).Z(new ayqb() { // from class: akqa
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    akqb akqbVar = akqb.this;
                    atnw atnwVar = (atnw) obj;
                    akqbVar.c = atnwVar;
                    azpa azpaVar = akqbVar.b;
                    akpv akpvVar = new akpv();
                    akpvVar.a(atnw.EFFECTIVE_CONNECTION_TYPE_UNKNOWN);
                    int i = 1;
                    akpvVar.b = 1;
                    akpvVar.a(atnwVar);
                    if (akqbVar.a.m()) {
                        i = 2;
                    } else if (akqbVar.a.r()) {
                        i = 3;
                    }
                    akpvVar.b = i;
                    atnw atnwVar2 = akpvVar.a;
                    if (atnwVar2 == null) {
                        StringBuilder sb = new StringBuilder();
                        if (akpvVar.a == null) {
                            sb.append(" effectiveConnectionType");
                        }
                        if (akpvVar.b == 0) {
                            sb.append(" networkTransportType");
                        }
                        String valueOf = String.valueOf(sb);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                        sb2.append("Missing required properties:");
                        sb2.append(valueOf);
                        throw new IllegalStateException(sb2.toString());
                    }
                    azpaVar.c(new akpw(atnwVar2, i));
                }
            });
        }
    }

    @Override // defpackage.akpu
    public final ampq a(apbh apbhVar, akpw akpwVar) {
        atnw atnwVar = atnw.EFFECTIVE_CONNECTION_TYPE_UNKNOWN;
        int ordinal = akpwVar.a.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                if ((apbhVar.b & 8) != 0) {
                    return ampq.j(Integer.valueOf(apbhVar.f));
                }
            } else if (ordinal != 4) {
                if (ordinal == 5 && (apbhVar.b & 2) != 0) {
                    return ampq.j(Integer.valueOf(apbhVar.d));
                }
            } else if ((apbhVar.b & 4) != 0) {
                return ampq.j(Integer.valueOf(apbhVar.e));
            }
        } else if ((apbhVar.b & 16) != 0) {
            return ampq.j(Integer.valueOf(apbhVar.g));
        }
        return (apbhVar.b & 1) != 0 ? ampq.j(Integer.valueOf(apbhVar.c)) : amon.a;
    }

    @Override // defpackage.akpu
    public final atnw b() {
        return this.c;
    }

    @Override // defpackage.akpu
    public final aynx c() {
        return (aynx) this.d.get();
    }
}
