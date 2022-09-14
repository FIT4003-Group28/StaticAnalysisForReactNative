package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cavl  reason: default package */
/* loaded from: classes4.dex */
public final class cavl implements dbrn<dqvu, cavu> {
    final /* synthetic */ cavr a;
    final /* synthetic */ cavm b;

    public cavl(cavm cavmVar, cavr cavrVar) {
        this.b = cavmVar;
        this.a = cavrVar;
    }

    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ cavu a(dqvu dqvuVar) {
        dqvu dqvuVar2 = dqvuVar;
        cavr cavrVar = this.a;
        String str = dqvuVar2.c;
        cqss an = this.b.a ? ibl.an() : irg.s();
        String str2 = dqvuVar2.d;
        String str3 = dqvuVar2.g;
        String format = String.format(Locale.getDefault(), "%,d", Integer.valueOf(dqvuVar2.f));
        cavr.a(str, 1);
        cavr.a(an, 2);
        cavr.a(str2, 3);
        cavr.a(str3, 4);
        cavr.a(format, 5);
        cqhn a = cavrVar.a.a();
        cavr.a(a, 6);
        amfi a2 = cavrVar.b.a();
        cavr.a(a2, 7);
        bvrb a3 = cavrVar.c.a();
        cavr.a(a3, 8);
        return new cavq(str, an, str2, str3, format, a, a2, a3);
    }
}
