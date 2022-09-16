package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: aaje  reason: default package */
/* loaded from: classes.dex */
public final class aaje implements aapu {
    public static final /* synthetic */ int a = 0;
    private static final aoos b;
    private static final int c;
    private final aajg d;
    private final aaki e;

    static {
        aoos c2 = aoos.c();
        c2.e(aqvw.b);
        b = c2;
        c = (aqvw.b.a() << 3) | 2;
    }

    public aaje(aajg aajgVar, aaki aakiVar) {
        this.d = aajgVar;
        this.e = aakiVar;
    }

    public static aqvw a(arbf arbfVar) {
        aoog l = arbfVar.toByteString().l();
        while (!l.E()) {
            try {
                int n = l.n();
                if (n != c) {
                    l.G(n);
                } else {
                    return (aqvw) l.y(aqvw.a.getParserForType(), b);
                }
            } catch (IOException e) {
                zep.d("[ENTITY] Error parsing batch update.", e);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.aapu
    public final void b(afvm afvmVar, arbf arbfVar, arpa arpaVar) {
        aqvw a2 = a(arbfVar);
        if (a2 != null) {
            String format = String.format("Processing %s mutations: %s ", Integer.valueOf(a2.d.size()), araa.q(a2.d, ydy.t));
            String valueOf = String.valueOf(format);
            if (valueOf.length() != 0) {
                "[ENTITY] ".concat(valueOf);
            }
            this.e.a("UTP", format);
            aajg aajgVar = this.d;
            int i = arpaVar.e;
            aajgVar.a(afvmVar, a2);
            return;
        }
        this.e.a("UTP", "No batch update data found on transport packet.");
    }
}
