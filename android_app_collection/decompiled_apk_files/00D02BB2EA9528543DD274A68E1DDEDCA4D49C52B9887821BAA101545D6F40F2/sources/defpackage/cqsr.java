package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cqsr  reason: default package */
/* loaded from: classes.dex */
public final class cqsr {
    public static final cqss a(List list) {
        int[][] iArr = new int[list.size()];
        cqss[] cqssVarArr = new cqss[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dbsi dbsiVar = (dbsi) list.get(i);
            iArr[i] = (int[]) dbsiVar.a;
            cqssVarArr[i] = (cqss) dbsiVar.b;
        }
        return new cqsp(new Object[]{new cqsq(iArr, cqssVarArr)}, cqssVarArr, iArr, cqvl.c(cqssVarArr));
    }

    public static final void b(cqss cqssVar, int[] iArr, List list) {
        list.add(dbsi.a(iArr, cqssVar));
    }
}
