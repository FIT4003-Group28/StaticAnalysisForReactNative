package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btcn  reason: default package */
/* loaded from: classes4.dex */
final class btcn implements degu<List<Locale>> {
    final /* synthetic */ btco a;

    public btcn(btco btcoVar) {
        this.a = btcoVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.b.f(dcdc.e());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<Locale> list) {
        List<Locale> list2 = list;
        if (list2 == null) {
            this.a.b.f(dcdc.e());
        } else if (list2.isEmpty()) {
            this.a.b.f(dcdc.e());
        } else {
            if (btco.a(list2.get(0))) {
                dkmu dkmuVar = this.a.a.getLanguageSettingParameters().h;
                if (dkmuVar == null) {
                    dkmuVar = dkmu.e;
                }
                if (!dkmuVar.d) {
                    this.a.b.f(dcdc.e());
                    return;
                }
            }
            this.a.b.f(list2);
        }
    }
}
