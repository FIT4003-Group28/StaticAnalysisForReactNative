package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: brgi  reason: default package */
/* loaded from: classes4.dex */
public final class brgi implements degu<List<brcz>> {
    final /* synthetic */ brgl a;

    public brgi(brgl brglVar) {
        this.a = brglVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        brgl brglVar = this.a;
        brglVar.e = true;
        cqkx.p(brglVar);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<brcz> list) {
        brgl brglVar = this.a;
        brglVar.a.clear();
        for (brcz brczVar : list) {
            if (brczVar.d()) {
                brglVar.a.add(new brgh(brczVar.b(), brczVar.c()));
            }
        }
        if (brglVar.h().booleanValue()) {
            brglVar.b = false;
        } else {
            brglVar.b = true;
        }
        brgl brglVar2 = this.a;
        brglVar2.d = true;
        cqkx.p(brglVar2);
    }
}
