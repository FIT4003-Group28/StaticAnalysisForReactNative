package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: rzp  reason: default package */
/* loaded from: classes4.dex */
final class rzp extends axyj {
    final /* synthetic */ rzq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rzp(rzq rzqVar, axyg axygVar) {
        super(axygVar);
        this.a = rzqVar;
    }

    @Override // defpackage.axyj
    protected final void a(axzl axzlVar, ayat ayatVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ayatVar.f(ayaq.c("Accept-Language", ayat.a), this.a.a.getResources().getConfiguration().getLocales().toLanguageTags());
        } else {
            ayatVar.f(ayaq.c("Accept-Language", ayat.a), this.a.a.getResources().getConfiguration().locale.toLanguageTag());
        }
        this.b.k(axzlVar, ayatVar);
    }
}
