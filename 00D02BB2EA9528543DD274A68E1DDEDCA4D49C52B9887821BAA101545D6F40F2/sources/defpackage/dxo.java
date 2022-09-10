package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxo  reason: default package */
/* loaded from: classes6.dex */
public final class dxo {
    final akqi a;
    final dcwh b;
    final List<dxm> c;

    public dxo(akqi akqiVar, dcwh dcwhVar, List<dxm> list) {
        this.a = akqiVar;
        this.b = dcwhVar;
        this.c = list;
    }

    @dzsi
    public final dxm a(dcwa dcwaVar) {
        for (dxm dxmVar : this.c) {
            if (dxmVar.b.h(dcwaVar)) {
                return dxmVar;
            }
        }
        return null;
    }
}
