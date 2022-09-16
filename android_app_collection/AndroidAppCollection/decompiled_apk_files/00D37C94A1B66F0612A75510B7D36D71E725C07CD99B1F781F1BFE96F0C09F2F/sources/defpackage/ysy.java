package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: PG */
/* renamed from: ysy  reason: default package */
/* loaded from: classes4.dex */
public final class ysy implements yqy {
    private final yti a;
    private final zex b;

    public ysy(snc sncVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, apfr apfrVar, yme ymeVar, ScheduledExecutorService scheduledExecutorService, yqm yqmVar, Executor executor, azqb azqbVar4, yrh yrhVar, zex zexVar) {
        c(apfrVar);
        yso ysoVar = new yso();
        if (sncVar != null) {
            ysoVar.e = sncVar;
            if (azqbVar != null) {
                ysoVar.a = azqbVar;
                if (azqbVar2 != null) {
                    ysoVar.b = azqbVar2;
                    if (azqbVar3 != null) {
                        ysoVar.c = azqbVar3;
                        ysoVar.f = apfrVar;
                        if (ymeVar != null) {
                            ysoVar.d = ymeVar;
                            if (scheduledExecutorService != null) {
                                ysoVar.g = scheduledExecutorService;
                                ysoVar.h = yqmVar;
                                ysoVar.i = executor;
                                ysoVar.n = 5000L;
                                ysoVar.p = new ysx(apfrVar);
                                ysoVar.q = new ysx(apfrVar);
                                if (azqbVar4 != null) {
                                    ysoVar.r = azqbVar4;
                                    ysoVar.s = yrhVar;
                                    this.a = ysoVar;
                                    this.b = zexVar;
                                    return;
                                }
                                throw new NullPointerException("Null requestCompletionListenerProvider");
                            }
                            throw new NullPointerException("Null timeoutExecutor");
                        }
                        throw new NullPointerException("Null commonConfigs");
                    }
                    throw new NullPointerException("Null uriRewriter");
                }
                throw new NullPointerException("Null headerDecoratorProvider");
            }
            throw new NullPointerException("Null cronetEngineProvider");
        }
        throw new NullPointerException("Null clock");
    }

    public static void c(apfr apfrVar) {
        apfrVar.getClass();
        boolean z = true;
        aqxo.q(apfrVar.h >= 0, "normalCoreSize < 0");
        aqxo.q(apfrVar.i > 0, "normalMaxSize <= 0");
        aqxo.q(apfrVar.i >= apfrVar.h, "normalMaxSize < normalCoreSize");
        aqxo.q(apfrVar.f >= 0, "priorityCoreSize < 0");
        aqxo.q(apfrVar.g > 0, "priorityMaxSize <= 0");
        aqxo.q(apfrVar.g >= apfrVar.f, "priorityMaxSize < priorityCoreSize");
        if (apfrVar.e < 0) {
            z = false;
        }
        aqxo.q(z, "keepAliveTime < 0");
    }

    @Override // defpackage.yqy
    public final /* synthetic */ yqw a(ces cesVar, yqx yqxVar, String str) {
        return yhq.b(this, cesVar, yqxVar, str);
    }

    @Override // defpackage.yqy
    public final yqw b(ces cesVar, yqx yqxVar, Executor executor, aabf aabfVar, String str) {
        azqb azqbVar;
        azqb azqbVar2;
        yme ymeVar;
        snc sncVar;
        apfr apfrVar;
        ScheduledExecutorService scheduledExecutorService;
        yqx yqxVar2;
        ces cesVar2;
        Integer num;
        yti ytiVar = this.a;
        if (cesVar != null) {
            yso ysoVar = (yso) ytiVar;
            ysoVar.k = cesVar;
            if (yqxVar != null) {
                ysoVar.j = yqxVar;
                ysoVar.u = aabfVar;
                ysoVar.l = 4;
                ysoVar.m = str;
                if (executor != null) {
                    ysoVar.o = executor;
                    zex zexVar = this.b;
                    if (zexVar != null) {
                        ysoVar.t = zexVar;
                        azqb azqbVar3 = ysoVar.a;
                        if (azqbVar3 == null || (azqbVar = ysoVar.b) == null || (azqbVar2 = ysoVar.c) == null || (ymeVar = ysoVar.d) == null || (sncVar = ysoVar.e) == null || (apfrVar = ysoVar.f) == null || (scheduledExecutorService = ysoVar.g) == null || (yqxVar2 = ysoVar.j) == null || (cesVar2 = ysoVar.k) == null || (num = ysoVar.l) == null || ysoVar.m == null || ysoVar.n == null || ysoVar.o == null || ysoVar.p == null || ysoVar.q == null || ysoVar.r == null || ysoVar.s == null || ysoVar.t == null) {
                            StringBuilder sb = new StringBuilder();
                            if (ysoVar.a == null) {
                                sb.append(" cronetEngineProvider");
                            }
                            if (ysoVar.b == null) {
                                sb.append(" headerDecoratorProvider");
                            }
                            if (ysoVar.c == null) {
                                sb.append(" uriRewriter");
                            }
                            if (ysoVar.d == null) {
                                sb.append(" commonConfigs");
                            }
                            if (ysoVar.e == null) {
                                sb.append(" clock");
                            }
                            if (ysoVar.f == null) {
                                sb.append(" androidCrolleyConfig");
                            }
                            if (ysoVar.g == null) {
                                sb.append(" timeoutExecutor");
                            }
                            if (ysoVar.j == null) {
                                sb.append(" volleyNetworkConfig");
                            }
                            if (ysoVar.k == null) {
                                sb.append(" cache");
                            }
                            if (ysoVar.l == null) {
                                sb.append(" threadPoolSize");
                            }
                            if (ysoVar.m == null) {
                                sb.append(" threadPoolTag");
                            }
                            if (ysoVar.n == null) {
                                sb.append(" connectionTimeout");
                            }
                            if (ysoVar.o == null) {
                                sb.append(" deliveryExecutor");
                            }
                            if (ysoVar.p == null) {
                                sb.append(" normalExecutorGenerator");
                            }
                            if (ysoVar.q == null) {
                                sb.append(" priorityExecutorGenerator");
                            }
                            if (ysoVar.r == null) {
                                sb.append(" requestCompletionListenerProvider");
                            }
                            if (ysoVar.s == null) {
                                sb.append(" networkRequestTracker");
                            }
                            if (ysoVar.t == null) {
                                sb.append(" clientErrorLogger");
                            }
                            String valueOf = String.valueOf(sb);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                            sb2.append("Missing required properties:");
                            sb2.append(valueOf);
                            throw new IllegalStateException(sb2.toString());
                        }
                        return new yss(new ysp(azqbVar3, azqbVar, azqbVar2, ymeVar, sncVar, apfrVar, scheduledExecutorService, ysoVar.h, ysoVar.i, yqxVar2, cesVar2, ysoVar.u, num.intValue(), ysoVar.m, ysoVar.n.longValue(), ysoVar.o, ysoVar.p, ysoVar.q, ysoVar.r, ysoVar.s, ysoVar.t));
                    }
                    throw new NullPointerException("Null clientErrorLogger");
                }
                throw new NullPointerException("Null deliveryExecutor");
            }
            throw new NullPointerException("Null volleyNetworkConfig");
        }
        throw new NullPointerException("Null cache");
    }
}
