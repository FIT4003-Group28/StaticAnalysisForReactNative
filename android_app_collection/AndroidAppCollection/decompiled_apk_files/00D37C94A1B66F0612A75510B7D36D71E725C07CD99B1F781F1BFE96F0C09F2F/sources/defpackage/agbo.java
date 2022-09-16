package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Calendar;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agbo  reason: default package */
/* loaded from: classes.dex */
public final class agbo implements yjo {
    private final Context a;
    private final aadd b;
    private final azqb c;
    private final azqb d;
    private final azqb e;
    private final agbd f;
    private final snc g;
    private final Map h;
    private final Set i;
    private final acrr j;
    private final agbn k;
    private final yjs l;

    public agbo(Context context, aadd aaddVar, azqb azqbVar, azqb azqbVar2, yjs yjsVar, azqb azqbVar3, agbd agbdVar, snc sncVar, Map map, Set set, acrr acrrVar, agbn agbnVar) {
        this.a = context;
        this.b = aaddVar;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.l = yjsVar;
        this.e = azqbVar3;
        this.f = agbdVar;
        this.g = sncVar;
        this.h = map;
        this.i = set;
        this.j = acrrVar;
        this.k = agbnVar;
    }

    public static atpo b(aadd aaddVar) {
        arhd a = aaddVar.a();
        if (a != null) {
            atps atpsVar = a.p;
            if (atpsVar == null) {
                atpsVar = atps.a;
            }
            if ((atpsVar.b & 64) == 0) {
                return null;
            }
            atps atpsVar2 = a.p;
            if (atpsVar2 == null) {
                atpsVar2 = atps.a;
            }
            atpo atpoVar = atpsVar2.f;
            return atpoVar == null ? atpo.a : atpoVar;
        }
        return null;
    }

    public static boolean d(aacz aaczVar) {
        apyy b = aaczVar.b();
        if (b != null) {
            atpm atpmVar = b.w;
            if (atpmVar == null) {
                atpmVar = atpm.a;
            }
            return atpmVar.c;
        }
        return false;
    }

    public static void e(aadd aaddVar, yjs yjsVar, snc sncVar, int i, boolean z) {
        long j;
        atpo b = b(aaddVar);
        apev h = h(aaddVar);
        if ((!j(aaddVar) || b == null) && (h == null || !i(aaddVar))) {
            return;
        }
        boolean z2 = b.l | z;
        if (z2) {
            yjsVar.c("device_context_task");
        }
        if (l(aaddVar) || k(aaddVar)) {
            yjsVar.e("device_context_task", i, z2, f(aaddVar), g(sncVar, i), null, false);
            return;
        }
        long j2 = 0;
        if (j(aaddVar)) {
            long j3 = b(aaddVar).c;
            j = b(aaddVar).c;
        } else if (i(aaddVar)) {
            long j4 = h(aaddVar).b;
            j = h(aaddVar).b;
        } else {
            j = 0;
        }
        if (j(aaddVar)) {
            j2 = b(aaddVar).d;
        } else if (i(aaddVar)) {
            j2 = h(aaddVar).c;
        }
        yjsVar.d("device_context_task", j, j2, z2, f(aaddVar), false, g(sncVar, i), null);
    }

    private static int f(aadd aaddVar) {
        atpo b = b(aaddVar);
        return (b == null || (b.b & 8) == 0 || b.f) ? 2 : 0;
    }

    private static Bundle g(snc sncVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putLong("device_context_task_scheduled", sncVar.c() + TimeUnit.SECONDS.toMillis(i));
        return bundle;
    }

    private static apev h(aadd aaddVar) {
        arhd a = aaddVar.a();
        if (a == null) {
            return null;
        }
        atps atpsVar = a.p;
        if (atpsVar == null) {
            atpsVar = atps.a;
        }
        apev apevVar = atpsVar.g;
        return apevVar == null ? apev.a : apevVar;
    }

    private static boolean i(aadd aaddVar) {
        apev h = h(aaddVar);
        return h != null && h.b > 0 && h.c > 0;
    }

    private static boolean j(aadd aaddVar) {
        arhd a = aaddVar.a();
        if (a != null) {
            atps atpsVar = a.p;
            if (atpsVar == null) {
                atpsVar = atps.a;
            }
            return atpsVar.d && b(aaddVar) != null;
        }
        return false;
    }

    private static boolean k(aadd aaddVar) {
        atpo b = b(aaddVar);
        return b.s || b.v;
    }

    private static boolean l(aadd aaddVar) {
        atpo b = b(aaddVar);
        return b != null && b.g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:134|(1:264)(1:138)|139|(4:141|(1:143)|144|(25:150|(1:154)|155|156|157|158|159|160|(1:258)(8:164|(1:166)|167|(1:169)|170|(7:173|(1:175)(1:185)|(1:177)|178|(2:180|181)(2:183|184)|182|171)|186|187)|(1:189)|190|191|(1:193)|194|195|196|(1:255)(7:200|(1:202)(1:254)|203|(1:253)(2:206|(2:207|(2:209|(1:211)(1:212))(2:251|252)))|213|(1:(1:219)(1:(1:221)(1:222)))|223)|224|(2:229|(1:231))|232|233|234|235|236|(5:241|(1:243)|244|(1:246)|247)))|263|196|(1:198)|255|224|(3:226|229|(0))|232|233|234|235|236|(6:239|241|(0)|244|(0)|247)) */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05a1, code lost:
        defpackage.zep.d("Error in sending SendDeviceContextRequest.", r0);
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05c3  */
    @Override // defpackage.yjo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbo.a(android.os.Bundle):int");
    }

    final void c(atpo atpoVar, long j) {
        long seconds;
        long c = this.g.c() / 1000;
        long j2 = (j == 0 || j <= c) ? atpoVar.c : j - c;
        if (atpoVar.s) {
            if (TimeUnit.MILLISECONDS.toHours(this.g.c() - this.k.b) > atpoVar.t) {
                j2 = TimeUnit.HOURS.toSeconds(atpoVar.u);
            }
        }
        if (atpoVar.v) {
            int hours = Calendar.getInstance().get(11) + ((int) TimeUnit.SECONDS.toHours(j2));
            if (hours < atpoVar.w) {
                seconds = TimeUnit.HOURS.toSeconds(atpoVar.w - hours);
            } else if (hours > atpoVar.x) {
                seconds = TimeUnit.HOURS.toSeconds(atpoVar.w + (24 - hours));
            }
            j2 += seconds;
        }
        long j3 = j2;
        if (atpoVar.m) {
            this.l.c("device_context_task");
        }
        this.l.e("device_context_task", j3, true, 2, g(this.g, (int) j3), null, false);
    }
}
