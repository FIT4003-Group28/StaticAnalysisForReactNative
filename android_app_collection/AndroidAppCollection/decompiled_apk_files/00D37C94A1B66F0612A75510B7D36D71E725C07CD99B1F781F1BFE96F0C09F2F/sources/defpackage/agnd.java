package defpackage;

import j$.time.Instant;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agnd  reason: default package */
/* loaded from: classes.dex */
public final class agnd {
    public final snc a;
    private final afvn b;
    private final aahf c;
    private final Executor d;

    public agnd(snc sncVar, afvn afvnVar, aahf aahfVar, Executor executor) {
        this.a = sncVar;
        this.b = afvnVar;
        this.c = aahfVar;
        this.d = executor;
    }

    private final ankt c(String str) {
        return zna.r(this.c.a(this.b.c()).f(aakj.f(aqqy.b.a(), str)).g(aqqv.class).w(yps.n).R(amon.a));
    }

    public final ankt a(String str) {
        if (amps.e(str)) {
            return anlz.q(null);
        }
        return anii.h(c(str), agix.f, this.d);
    }

    public final ankt b(final String str) {
        if (amps.e(str)) {
            return anlz.q(false);
        }
        return anii.h(c(str), new ampg() { // from class: agnc
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aqqz aqqzVar;
                agnd agndVar = agnd.this;
                String str2 = str;
                ampq ampqVar = (ampq) obj;
                if (!ampqVar.h()) {
                    return false;
                }
                aqqv aqqvVar = (aqqv) ampqVar.c();
                Iterator it = aqqvVar.getLicenses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aqqzVar = null;
                        break;
                    }
                    aqqzVar = (aqqz) it.next();
                    if ((aqqzVar.b & 128) != 0 && aqqzVar.i.equals(str2)) {
                        break;
                    }
                }
                if (aqqzVar == null || aqqzVar.f) {
                    return false;
                }
                Instant ofEpochMilli = Instant.ofEpochMilli(agndVar.a.c());
                if (aqqvVar.getPlaybackStartSeconds().longValue() > 0) {
                    return Boolean.valueOf(ofEpochMilli.isAfter(Instant.ofEpochSecond(aqqvVar.getPlaybackStartSeconds().longValue() + aqqzVar.e)));
                }
                return Boolean.valueOf(ofEpochMilli.isAfter(Instant.ofEpochSecond(aqqvVar.getLicenseExpirySeconds().longValue())));
            }
        }, this.d);
    }
}
