package defpackage;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* compiled from: PG */
/* renamed from: btvv  reason: default package */
/* loaded from: classes.dex */
public final class btvv {
    private static final dcqe b = dcqe.c("btvv");
    public final List<Pattern> a;

    public btvv(durx durxVar) {
        dccx F = dcdc.F();
        for (String str : durxVar.a) {
            try {
                F.g(Pattern.compile(str));
            } catch (PatternSyntaxException e) {
                bvoo.h("Invalid denylist regex %s", e);
            }
        }
        this.a = F.f();
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.b("denylistedPatterns", this.a);
        return b2.toString();
    }
}
