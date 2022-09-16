package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: gss  reason: default package */
/* loaded from: classes3.dex */
public final class gss {
    private final aacz a;
    private final yjs b;

    public gss(yjs yjsVar, aacz aaczVar) {
        this.b = yjsVar;
        this.a = aaczVar;
    }

    public static final void b(yjs yjsVar) {
        yjsVar.c("NetworkStatusReporter");
    }

    public final void a() {
        athd athdVar = this.a.b().o;
        if (athdVar == null) {
            athdVar = athd.a;
        }
        if (athdVar.k) {
            athd athdVar2 = this.a.b().o;
            if (athdVar2 == null) {
                athdVar2 = athd.a;
            }
            if (!athdVar2.j) {
                return;
            }
            TimeUnit timeUnit = TimeUnit.MINUTES;
            athd athdVar3 = this.a.b().o;
            if (athdVar3 == null) {
                athdVar3 = athd.a;
            }
            long seconds = timeUnit.toSeconds(athdVar3.m);
            if (seconds < 1) {
                return;
            }
            this.b.d("NetworkStatusReporter", seconds + 5, seconds, true, 0, false, null, null);
        }
    }
}
