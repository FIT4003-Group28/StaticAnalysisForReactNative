package defpackage;

import android.text.SpannableString;
import android.text.style.LocaleSpan;
/* renamed from: cecv  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cecv implements dbrn {
    static final dbrn a = new cecv();

    private cecv() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cdjl cdjlVar = (cdjl) obj;
        if (!cdjlVar.c().a()) {
            return cdjlVar.a();
        }
        SpannableString spannableString = new SpannableString(cdjlVar.a());
        spannableString.setSpan(new LocaleSpan(cdjlVar.c().b()), 0, cdjlVar.a().length(), 17);
        return spannableString;
    }
}
