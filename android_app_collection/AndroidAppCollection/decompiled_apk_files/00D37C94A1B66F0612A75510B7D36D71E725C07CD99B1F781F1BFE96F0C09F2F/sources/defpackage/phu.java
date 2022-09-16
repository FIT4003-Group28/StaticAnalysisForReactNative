package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: phu  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class phu {
    public final /* synthetic */ pig a;

    public final void a(final pin pinVar) {
        final pig pigVar = this.a;
        pigVar.d.e(new Runnable() { // from class: pia
            @Override // java.lang.Runnable
            public final void run() {
                long j;
                boolean z;
                long j2;
                pig pigVar2 = pig.this;
                pin pinVar2 = pinVar;
                int i = pigVar2.m - pinVar2.c;
                pigVar2.m = i;
                boolean z2 = true;
                if (pinVar2.d) {
                    pigVar2.n = pinVar2.e;
                    pigVar2.o = true;
                }
                if (pinVar2.f) {
                    pigVar2.p = pinVar2.g;
                }
                if (i == 0) {
                    pkt pktVar = pinVar2.b.a;
                    if (!pigVar2.u.a.z() && pktVar.z()) {
                        pigVar2.v = -1;
                        pigVar2.w = 0L;
                    }
                    if (!pktVar.z()) {
                        List asList = Arrays.asList(((phc) pktVar).b);
                        ptx.e(asList.size() == pigVar2.h.size());
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            ((pif) pigVar2.h.get(i2)).a = (pkt) asList.get(i2);
                        }
                    }
                    if (pigVar2.o) {
                        if (pinVar2.b.s.equals(pigVar2.u.s) && pinVar2.b.c == pigVar2.u.q) {
                            z2 = false;
                        }
                        if (z2) {
                            if (pktVar.z() || pinVar2.b.s.a()) {
                                j2 = pinVar2.b.c;
                            } else {
                                pjs pjsVar = pinVar2.b;
                                j2 = pigVar2.G(pktVar, pjsVar.s, pjsVar.c);
                            }
                            j = j2;
                        } else {
                            j = -9223372036854775807L;
                        }
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    pigVar2.o = false;
                    pigVar2.C(pinVar2.b, 1, pigVar2.p, false, z, pigVar2.n, j, -1);
                }
            }
        });
    }
}
