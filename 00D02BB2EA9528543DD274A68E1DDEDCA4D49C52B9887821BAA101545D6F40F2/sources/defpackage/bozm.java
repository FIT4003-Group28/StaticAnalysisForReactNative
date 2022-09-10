package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bozm  reason: default package */
/* loaded from: classes3.dex */
public final class bozm implements cqkn<bpwp> {
    final /* synthetic */ bozo a;

    public bozm(bozo bozoVar) {
        this.a = bozoVar;
    }

    @Override // defpackage.cqkn
    public final /* bridge */ /* synthetic */ void a(bpwp bpwpVar, View view) {
        bpwp bpwpVar2 = bpwpVar;
        if (!bpwpVar2.c().booleanValue()) {
            int indexOf = this.a.b.indexOf(bpwpVar2);
            bozo bozoVar = this.a;
            bozoVar.f(bozoVar.e, indexOf);
            this.a.d.h = this.a.a.get(indexOf).a();
            this.a.g(true);
            cqkx.p(this.a);
        }
    }
}
