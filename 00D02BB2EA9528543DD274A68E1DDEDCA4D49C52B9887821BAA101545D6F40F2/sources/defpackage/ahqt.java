package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ahqt  reason: default package */
/* loaded from: classes2.dex */
public final class ahqt implements ahqs {
    public final bqxu a;

    public ahqt(bqxu bqxuVar) {
        this.a = bqxuVar;
    }

    public static Set<alyh> a(List<akrp> list) {
        dzru dzruVar = new dzru();
        for (akrp akrpVar : list) {
            aksj c = aksj.c(akrpVar.p(alyh.m(bqxu.Jc)));
            int i = bqxu.Jc;
            ArrayList a = dchl.a();
            alyh.k(c, i, a, null);
            dzruVar.addAll(a);
        }
        return dzruVar;
    }
}
