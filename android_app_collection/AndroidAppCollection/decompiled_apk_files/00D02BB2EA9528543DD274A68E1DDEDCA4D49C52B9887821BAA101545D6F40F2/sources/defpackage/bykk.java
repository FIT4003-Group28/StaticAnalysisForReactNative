package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bykk  reason: default package */
/* loaded from: classes4.dex */
public final class bykk implements vud {
    final /* synthetic */ byko a;

    public bykk(byko bykoVar) {
        this.a = bykoVar;
    }

    @Override // defpackage.vud
    public final void a(dozz dozzVar, dbsg<cjqm> dbsgVar) {
        byko bykoVar = this.a;
        if (bykoVar.g.isEmpty() || !bykoVar.g.contains(dozzVar)) {
            return;
        }
        byjj byjjVar = bykoVar.d;
        List<dozz> list = bykoVar.g;
        byjjVar.a(new byny(list, list.indexOf(dozzVar)), bykoVar.e).a();
    }
}
