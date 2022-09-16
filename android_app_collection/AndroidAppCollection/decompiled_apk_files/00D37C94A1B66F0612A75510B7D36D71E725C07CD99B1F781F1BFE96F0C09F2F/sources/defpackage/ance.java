package defpackage;

import java.util.Collections;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ance  reason: default package */
/* loaded from: classes.dex */
public final class ance {
    private static final Set a;

    static {
        Set singleton = Collections.singleton(anac.a);
        a = singleton;
        anbt.a(singleton);
    }

    public static String a(anbe anbeVar) {
        return anbh.b(anbeVar.l());
    }

    public static boolean b(anbe anbeVar, anca ancaVar, Set set) {
        return anbeVar.k() != null || ancaVar.a() > set.size() || !set.containsAll(ancaVar.b());
    }

    public static void c(anca ancaVar, anbq anbqVar, StringBuilder sb) {
        anbd anbdVar = new anbd(sb);
        ancaVar.c(anbqVar, anbdVar);
        if (anbdVar.c) {
            anbdVar.b.append(anbdVar.a);
        }
    }
}
