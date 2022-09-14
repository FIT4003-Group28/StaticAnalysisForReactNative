package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bphl  reason: default package */
/* loaded from: classes3.dex */
final class bphl implements cqkn<bpwp> {
    final /* synthetic */ bphn a;

    public bphl(bphn bphnVar) {
        this.a = bphnVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(bpwp bpwpVar, View view) {
        bpwp bpwpVar2 = bpwpVar;
        if (!bpwpVar2.c().booleanValue()) {
            bphn bphnVar = this.a;
            bphnVar.g(bphnVar.d, bphnVar.c.indexOf(bpwpVar2));
            this.a.a.aR();
            cqkx.p(this.a);
        }
    }
}
