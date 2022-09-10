package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bpee  reason: default package */
/* loaded from: classes3.dex */
final class bpee implements cqkn<bpwa> {
    final /* synthetic */ bpef a;

    public bpee(bpef bpefVar) {
        this.a = bpefVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(bpwa bpwaVar, View view) {
        bpwa bpwaVar2 = bpwaVar;
        if (!bpwaVar2.b().booleanValue()) {
            this.a.c = bpwaVar2.a().e();
            dcdc<bpwa> dcdcVar = this.a.b;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                bpwa bpwaVar3 = dcdcVar.get(i);
                bpwaVar3.c(bpwaVar3 == bpwaVar2);
            }
            bpef bpefVar = this.a;
            bpefVar.a.b = bpefVar.c;
            cqkx.p(bpefVar);
        }
    }
}
