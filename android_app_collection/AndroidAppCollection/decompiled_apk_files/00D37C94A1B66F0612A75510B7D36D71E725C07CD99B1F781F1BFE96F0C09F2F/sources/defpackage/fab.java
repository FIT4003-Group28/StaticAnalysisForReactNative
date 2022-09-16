package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: fab  reason: default package */
/* loaded from: classes3.dex */
public final class fab {
    private final aacz a;
    private final yjs b;

    public fab(aacz aaczVar, yjs yjsVar) {
        this.a = aaczVar;
        this.b = yjsVar;
    }

    public static final void b(yjs yjsVar) {
        yjsVar.c("NetworkQualityLogger");
    }

    public final void a() {
        aacz aaczVar = this.a;
        athd athdVar = aaczVar.b().o;
        if (athdVar == null) {
            athdVar = athd.a;
        }
        if (athdVar.j) {
            athd athdVar2 = aaczVar.b().o;
            if (athdVar2 == null) {
                athdVar2 = athd.a;
            }
            if (!athdVar2.k) {
                return;
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            athd athdVar3 = this.a.b().o;
            if (athdVar3 == null) {
                athdVar3 = athd.a;
            }
            long seconds = timeUnit.toSeconds(athdVar3.l);
            if (seconds < 1) {
                return;
            }
            this.b.d("NetworkQualityLogger", seconds + 5, 5L, true, 0, false, null, null);
        }
    }
}
