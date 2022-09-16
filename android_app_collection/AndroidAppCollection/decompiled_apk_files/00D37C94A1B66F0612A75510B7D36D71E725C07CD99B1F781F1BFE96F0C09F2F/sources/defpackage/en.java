package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: en  reason: default package */
/* loaded from: classes3.dex */
public final class en implements em {
    final int a;
    final int b;
    final /* synthetic */ eo c;

    public en(eo eoVar, int i, int i2) {
        this.c = eoVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.em
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        dp dpVar = this.c.p;
        if (dpVar == null || this.a >= 0 || !dpVar.mL().aa()) {
            return this.c.ag(arrayList, arrayList2, this.a, this.b);
        }
        return false;
    }
}
