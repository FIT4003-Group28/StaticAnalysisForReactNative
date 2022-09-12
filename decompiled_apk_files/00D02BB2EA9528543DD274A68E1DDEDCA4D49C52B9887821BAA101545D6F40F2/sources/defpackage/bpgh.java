package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bpgh  reason: default package */
/* loaded from: classes3.dex */
public final class bpgh implements cqkn<bpwp> {
    final /* synthetic */ bpgj a;

    public bpgh(bpgj bpgjVar) {
        this.a = bpgjVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(bpwp bpwpVar, View view) {
        bpwp bpwpVar2 = bpwpVar;
        if (!bpwpVar2.c().booleanValue()) {
            bpgj bpgjVar = this.a;
            bpgjVar.b = bpgjVar.d.indexOf(bpwpVar2);
            bpgj bpgjVar2 = this.a;
            bpgjVar2.c = bpgjVar2.d.get(bpgjVar2.b).f();
            dcdc<bpgi> dcdcVar = this.a.d;
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                bpgi bpgiVar = dcdcVar.get(i);
                bpgiVar.d(bpgiVar == bpwpVar2);
            }
            cqkx.p(this.a);
        }
    }
}
