package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aznr  reason: default package */
/* loaded from: classes3.dex */
public final class aznr implements aznm<Boolean> {
    final /* synthetic */ List a;
    final /* synthetic */ azof b;

    public aznr(azof azofVar, List list) {
        this.b = azofVar;
        this.a = list;
    }

    @Override // defpackage.aznm
    public final /* bridge */ /* synthetic */ Boolean a() {
        boolean z = true;
        boolean z2 = true;
        for (azwm azwmVar : this.a) {
            azxm h = azwmVar.h();
            dbsk.s(h);
            ((ckco) this.b.b.a(ckkf.b)).a(h.b().n);
            azxm h2 = azwmVar.h();
            dbsk.s(h2);
            azxl b = h2.b();
            azwl azwlVar = azwmVar.j;
            dbsk.s(azwlVar);
            z2 &= aznn.r(b, azwlVar.a);
            if (!z2) {
                return false;
            }
        }
        if (true != z2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
