package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.TokenData;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dexl  reason: default package */
/* loaded from: classes6.dex */
public final class dexl implements dexd {
    static final long a = TimeUnit.MINUTES.toMillis(5);
    static final long b = TimeUnit.HOURS.toMillis(1);
    private static final dbrz e = dbrz.e(" ");
    private final cqat f;
    private final dexn h;
    private final dehp g = dehx.a();
    public final Map<dexk, dexf> c = new HashMap();
    public final Map<dexk, dehn<dexf>> d = new HashMap();

    public dexl(dexn dexnVar, cqat cqatVar) {
        this.h = dexnVar;
        this.f = cqatVar;
    }

    private static final String f(Set<String> set) {
        String valueOf = String.valueOf(e.g(set));
        return valueOf.length() != 0 ? "oauth2:".concat(valueOf) : new String("oauth2:");
    }

    @Override // defpackage.dexd
    public final dexf a(dexa dexaVar, Set<String> set) {
        dexf c;
        try {
            dexk c2 = dexk.c(new Account(dexaVar.a(), "com.google"), f(set));
            synchronized (this.c) {
                c = c(c2);
            }
            return c;
        } catch (dexe e2) {
            throw e2;
        } catch (Throwable th) {
            throw new dexe("Failed to get auth token", th);
        }
    }

    @Override // defpackage.dexd
    public final dexf b(dexa dexaVar, Set<String> set) {
        deho dehoVar;
        deho dehoVar2;
        final dexk c = dexk.c(new Account(dexaVar.a(), "com.google"), f(set));
        synchronized (this.d) {
            dehn<dexf> dehnVar = this.d.get(c);
            if (dehnVar == null) {
                dehoVar = deho.b(new Callable(this, c) { // from class: dexi
                    private final dexl a;
                    private final dexk b;

                    {
                        this.a = this;
                        this.b = c;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dexf d;
                        dexl dexlVar = this.a;
                        dexk dexkVar = this.b;
                        synchronized (dexlVar.c) {
                            dexlVar.e(dexlVar.c(dexkVar));
                            d = dexlVar.d(dexkVar);
                        }
                        return d;
                    }
                });
                dehoVar.Pk(new Runnable(this, c) { // from class: dexj
                    private final dexl a;
                    private final dexk b;

                    {
                        this.a = this;
                        this.b = c;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dexl dexlVar = this.a;
                        dexk dexkVar = this.b;
                        synchronized (dexlVar.d) {
                            dexlVar.d.remove(dexkVar);
                        }
                    }
                }, this.g);
                this.d.put(c, dehoVar);
                dehoVar2 = dehoVar;
            } else {
                dehoVar = null;
                dehoVar2 = dehnVar;
            }
        }
        if (dehoVar != null) {
            dehoVar.run();
        }
        try {
            return dehoVar2.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof dexe) {
                throw ((dexe) cause);
            }
            throw new dexe("Failed to refresh token", cause);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dexf c(defpackage.dexk r8) {
        /*
            r7 = this;
            java.util.Map<dexk, dexf> r0 = r7.c
            java.lang.Object r0 = r0.get(r8)
            dexf r0 = (defpackage.dexf) r0
            if (r0 == 0) goto L3e
            java.lang.Long r1 = r0.c
            if (r1 == 0) goto L28
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Long r2 = r0.c
            long r2 = r2.longValue()
            long r1 = r1.toMillis(r2)
            cqat r3 = r7.f
            long r3 = r3.b()
            long r1 = r1 - r3
            long r3 = defpackage.dexl.a
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L3a
            goto L3b
        L28:
            cqat r1 = r7.f
            long r1 = r1.b()
            long r3 = r0.b
            long r1 = r1 - r3
            long r3 = defpackage.dexl.b
            long r5 = defpackage.dexl.a
            long r3 = r3 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L3b
        L3a:
            return r0
        L3b:
            r7.e(r0)
        L3e:
            dexf r8 = r7.d(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dexl.c(dexk):dexf");
    }

    public final dexf d(dexk dexkVar) {
        dexn dexnVar = this.h;
        dexm dexmVar = (dexm) dexkVar;
        try {
            TokenData e2 = cmrb.e(dexnVar.a, dexmVar.a, dexmVar.b);
            dexf dexfVar = new dexf(e2.b, dexnVar.b.b(), e2.c);
            this.c.put(dexkVar, dexfVar);
            return dexfVar;
        } catch (cmra e3) {
            throw new dexe(e3);
        }
    }

    public final void e(dexf dexfVar) {
        dexn dexnVar = this.h;
        try {
            cmrb.c(dexnVar.a, dexfVar.a);
        } catch (cmra e2) {
            throw new dexe(e2);
        }
    }
}
