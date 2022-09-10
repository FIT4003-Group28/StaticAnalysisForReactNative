package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxm  reason: default package */
/* loaded from: classes6.dex */
public final class dxm {
    final akqi a;
    final dcwh b;
    final List<dfmh> c;

    public dxm(akqi akqiVar, dcwh dcwhVar, List<dfmh> list) {
        this.a = akqiVar;
        this.b = dcwhVar;
        this.c = list;
    }

    @dzsi
    public final dfmh a(dsza dszaVar) {
        for (dfmh dfmhVar : this.c) {
            if (dxp.b(dfmhVar, dszaVar)) {
                return dfmhVar;
            }
        }
        return null;
    }
}
