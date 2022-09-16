package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: algg  reason: default package */
/* loaded from: classes.dex */
public final class algg extends aleo {
    public final ScheduledExecutorService a;
    public final alaz b;
    public final akze c;
    public final akzp e;
    public final albf f;
    public final alak g;
    final Map h;
    final alax i;
    private final afvn k;

    public algg(aadd aaddVar, ScheduledExecutorService scheduledExecutorService, akze akzeVar, afvn afvnVar, akzp akzpVar, alaz alazVar, albf albfVar, alak alakVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_FEEDBACK, albfVar, akzeVar, alhtVar);
        this.h = new HashMap();
        alge algeVar = new alge(this);
        this.i = algeVar;
        this.a = scheduledExecutorService;
        this.c = akzeVar;
        this.k = afvnVar;
        this.e = akzpVar;
        this.b = alazVar;
        this.f = albfVar;
        this.g = alakVar;
        alazVar.a(algeVar);
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return null;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.Y;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(final String str, akzp akzpVar, final alcw alcwVar) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        ScheduledExecutorService scheduledExecutorService = this.a;
        final afvm d = (alcwVar.b & 1) != 0 ? this.k.d(alcwVar.e) : null;
        if (d == null) {
            d = afvl.a;
        }
        return amel.a(new amek() { // from class: algc
            @Override // defpackage.amek
            public final Object a(amej amejVar) {
                final algg alggVar = algg.this;
                afvm afvmVar = d;
                String str2 = str;
                alcw alcwVar2 = alcwVar;
                final String str3 = alcwVar2.W;
                String str4 = alcwVar2.V;
                synchronized (alggVar.h) {
                    amejVar.a(new Runnable() { // from class: algd
                        @Override // java.lang.Runnable
                        public final void run() {
                            algg alggVar2 = algg.this;
                            String str5 = str3;
                            synchronized (alggVar2.h) {
                                alggVar2.h.remove(str5);
                            }
                        }
                    }, alggVar.a);
                    if (alggVar.h.containsKey(str3)) {
                        amej amejVar2 = (amej) ((Pair) alggVar.h.get(str3)).second;
                        String valueOf = String.valueOf(str3);
                        amejVar2.c(new IllegalStateException(valueOf.length() != 0 ? "Another polling request has been added for video id ".concat(valueOf) : new String("Another polling request has been added for video id ")));
                    }
                    alggVar.h.put(str3, new Pair(str2, amejVar));
                    alggVar.b.b(afvmVar, null, str3, str4);
                }
                return "Polling for feedback on background thread";
            }
        }, timeUnit, scheduledExecutorService);
    }

    @Override // defpackage.algt
    public final aypx e() {
        return alhh.b;
    }

    @Override // defpackage.algt
    public final String f() {
        return "UploadFeedbackTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return false;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        alcu alcuVar = alcu.UNKNOWN_UPLOAD;
        alcu a = alcu.a(alcwVar.l);
        if (a == null) {
            a = alcu.UNKNOWN_UPLOAD;
        }
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        alct alctVar = alcwVar.L;
                        if (alctVar == null) {
                            alctVar = alct.a;
                        }
                        int z = araa.z(alctVar.c);
                        if (z == 0 || z != 2) {
                            return false;
                        }
                    } else if (ordinal != 4) {
                        if (ordinal != 5) {
                            return false;
                        }
                    }
                }
            }
            alct alctVar2 = alcwVar.K;
            if (alctVar2 == null) {
                alctVar2 = alct.a;
            }
            int z2 = araa.z(alctVar2.c);
            if (z2 == 0 || z2 != 2) {
                return false;
            }
        }
        return (alcwVar.c & 32768) != 0;
    }

    public final void s(String str, alct alctVar) {
        synchronized (this.h) {
            Pair pair = (Pair) this.h.remove(str);
            if (pair == null) {
                return;
            }
            ((amej) pair.second).b(t(alctVar, true));
        }
    }
}
