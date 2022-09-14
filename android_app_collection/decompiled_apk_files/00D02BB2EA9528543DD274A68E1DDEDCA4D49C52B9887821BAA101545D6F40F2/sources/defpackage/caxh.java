package defpackage;

import android.text.SpannableStringBuilder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: caxh  reason: default package */
/* loaded from: classes4.dex */
public final class caxh extends dzvy implements dzut<SpannableStringBuilder> {
    final /* synthetic */ caxm a;

    public caxh(caxm caxmVar) {
        this.a = caxmVar;
    }

    @Override // defpackage.dzut
    /* renamed from: b */
    public final SpannableStringBuilder a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.a.d);
        spannableStringBuilder.append((CharSequence) " ");
        caxm caxmVar = this.a;
        spannableStringBuilder.append(caxmVar.a, caxmVar.h.f("public_posting", cjtd.a(dtxy.on)), 17);
        if (this.a.i == caxa.REVIEW_BETA) {
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append(this.a.g.getResources().getText(cayl.ugc_disclosure_beta_details));
        }
        return spannableStringBuilder;
    }
}
