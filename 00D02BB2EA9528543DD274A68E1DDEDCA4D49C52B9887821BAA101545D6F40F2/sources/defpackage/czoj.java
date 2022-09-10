package defpackage;

import android.content.Context;
import com.google.android.libraries.surveys.internal.model.Answer;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: czoj  reason: default package */
/* loaded from: classes.dex */
public final class czoj {
    private final Context a;
    private final String b;
    private final duch c;
    private final cqat d = new cqaz();

    public czoj(Context context, String str, duch duchVar) {
        this.a = context;
        this.b = str;
        this.c = duchVar;
    }

    public final void a(Answer answer, boolean z) {
        final czos czosVar = new czos(this.a, this.b, answer.b, dbsj.e(answer.f));
        duaa bZ = duax.d.bZ();
        long currentTimeMillis = System.currentTimeMillis() - answer.d;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
        long nanos = TimeUnit.MILLISECONDS.toNanos(currentTimeMillis - (TimeUnit.SECONDS.toMillis(1L) * seconds));
        dsps bZ2 = dspt.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dspt dsptVar = (dspt) bZ2.b;
        dsptVar.a = seconds;
        dsptVar.b = (int) nanos;
        dspt bK = bZ2.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        duax duaxVar = (duax) bZ.b;
        bK.getClass();
        duaxVar.c = bK;
        int i = answer.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            duaw duawVar = duaw.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duax duaxVar2 = (duax) bZ.b;
            duawVar.getClass();
            duaxVar2.b = duawVar;
            duaxVar2.a = 2;
        } else if (i2 == 2) {
            duar bZ3 = duas.c.bZ();
            dubn dubnVar = answer.c;
            if (dubnVar != null) {
                if (!z) {
                    dsqp dsqpVar = (dsqp) dubnVar.cu(5);
                    dsqpVar.bC(dubnVar);
                    dubi dubiVar = (dubi) dsqpVar;
                    if (dubiVar.c) {
                        dubiVar.bF();
                        dubiVar.c = false;
                    }
                    ((dubn) dubiVar.b).a = null;
                    dubnVar = dubiVar.bK();
                }
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dubnVar.getClass();
                ((duas) bZ3.b).a = dubnVar;
            }
            duas bK2 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duax duaxVar3 = (duax) bZ.b;
            bK2.getClass();
            duaxVar3.b = bK2;
            duaxVar3.a = 3;
        } else if (i2 == 3) {
            duab bZ4 = duac.b.bZ();
            boolean z2 = answer.e;
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            ((duac) bZ4.b).a = z2;
            duac bK3 = bZ4.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duax duaxVar4 = (duax) bZ.b;
            bK3.getClass();
            duaxVar4.b = bK3;
            duaxVar4.a = 4;
        } else if (i2 == 4) {
            duaq duaqVar = answer.a;
            duaqVar.getClass();
            duaxVar.b = duaqVar;
            duaxVar.a = 5;
        } else if (i2 == 5) {
            duau duauVar = duau.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            duax duaxVar5 = (duax) bZ.b;
            duauVar.getClass();
            duaxVar5.b = duauVar;
            duaxVar5.a = 6;
        }
        if (czph.p(this.c)) {
            dtyq bZ5 = dtyr.c.bZ();
            duch duchVar = this.c;
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            duchVar.getClass();
            ((dtyr) bZ5.b).b = duchVar;
            duax bK4 = bZ.bK();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            bK4.getClass();
            ((dtyr) bZ5.b).a = bK4;
            final dtyr bK5 = bZ5.bK();
            if (czpc.a.a()) {
                final czpb a = czpb.a();
                if (bK5 != null) {
                    czou.a().execute(new Runnable(czosVar, bK5, a) { // from class: czol
                        private final czos a;
                        private final dtyr b;
                        private final czpb c;

                        {
                            this.a = czosVar;
                            this.b = bK5;
                            this.c = a;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dehn d;
                            czos czosVar2 = this.a;
                            dtyr dtyrVar = this.b;
                            czpb czpbVar = this.c;
                            dbma c = czosVar2.c();
                            dyeu a2 = czosVar2.a(c);
                            if (a2 == null) {
                                return;
                            }
                            if (c != null) {
                                ducs ducsVar = (ducs) duct.a(a2).h(dyjp.a(c));
                                dyeu dyeuVar = ducsVar.a;
                                dyib<dtyr, dtyt> dyibVar = duct.c;
                                if (dyibVar == null) {
                                    synchronized (duct.class) {
                                        dyibVar = duct.c;
                                        if (dyibVar == null) {
                                            dyhx c2 = dyib.c();
                                            c2.c = dyhz.UNARY;
                                            c2.d = dyib.b("scone.v1.SurveyService", "RecordEvent");
                                            c2.e = true;
                                            c2.a = dyyq.b(dtyr.c);
                                            c2.b = dyyq.b(dtyt.a);
                                            dyib<dtyr, dtyt> a3 = c2.a();
                                            duct.c = a3;
                                            dyibVar = a3;
                                        }
                                    }
                                }
                                d = dyzf.d(dyeuVar.a(dyibVar, ducsVar.b), dtyrVar);
                            } else {
                                ducs a4 = duct.a(a2);
                                dyeu dyeuVar2 = a4.a;
                                dyib<dtyr, dtyt> dyibVar2 = duct.d;
                                if (dyibVar2 == null) {
                                    synchronized (duct.class) {
                                        dyibVar2 = duct.d;
                                        if (dyibVar2 == null) {
                                            dyhx c3 = dyib.c();
                                            c3.c = dyhz.UNARY;
                                            c3.d = dyib.b("scone.v1.SurveyService", "RecordEventAnonymous");
                                            c3.e = true;
                                            c3.a = dyyq.b(dtyr.c);
                                            c3.b = dyyq.b(dtyt.a);
                                            dyib<dtyr, dtyt> a5 = c3.a();
                                            duct.d = a5;
                                            dyibVar2 = a5;
                                        }
                                    }
                                }
                                d = dyzf.d(dyeuVar2.a(dyibVar2, a4.b), dtyrVar);
                            }
                            deha.q(d, new czop(czosVar2, dtyrVar, czpbVar), czou.a());
                        }
                    });
                }
            }
        }
        answer.a = duaq.d;
        answer.g = 1;
    }
}
