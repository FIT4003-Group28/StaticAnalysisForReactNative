package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjld  reason: default package */
/* loaded from: classes3.dex */
class bjld implements bjlc {
    private final Runnable a;
    @dzsi
    private final String b;
    private final CharSequence c;
    private final CharSequence d;
    @dzsi
    private final CharSequence e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final String g;

    public bjld(gga ggaVar, Runnable runnable, djai djaiVar, boolean z) {
        this.a = runnable;
        String str = null;
        this.b = z ? ggaVar.getString(R.string.PLACE_QA_SEE_ALL_QUESTIONS, new Object[]{Integer.valueOf(djaiVar.c)}) : null;
        djao djaoVar = djaiVar.b.get(0);
        djam djamVar = djaoVar.b;
        String str2 = (djamVar == null ? djam.m : djamVar).d;
        this.c = h(ggaVar.getString(R.string.PLACE_QA_QUESTION_LABEL), str2);
        String valueOf = String.valueOf(ggaVar.getString(R.string.PLACE_QA_QUESTION_LABEL_CONTENT_DESCRIPTION));
        String valueOf2 = String.valueOf(str2);
        this.d = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        djam c = bjgr.c(djaoVar);
        if (c != null) {
            String str3 = c.d;
            this.e = h(ggaVar.getString(R.string.PLACE_QA_ANSWER_LABEL), str3);
            String valueOf3 = String.valueOf(ggaVar.getString(R.string.PLACE_QA_ANSWER_LABEL_CONTENT_DESCRIPTION));
            String valueOf4 = String.valueOf(str3);
            this.f = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        } else {
            this.e = null;
            this.f = null;
        }
        int i = djaoVar.d;
        if (i <= 0) {
            str = String.format("(%s)", ggaVar.getString(R.string.PLACE_QA_NO_ANSWERS_YET));
        } else {
            int i2 = i - 1;
            if (i2 > 0) {
                str = String.format("(%s)", ggaVar.getResources().getQuantityString(R.plurals.PLACE_QA_MORE_ANSWERS, i2, Integer.valueOf(i2)));
            }
        }
        this.g = str;
    }

    private static CharSequence h(String str, String str2) {
        SpannableStringBuilder append = new SpannableStringBuilder(str).append((CharSequence) str2);
        append.setSpan(new StyleSpan(1), 0, str.length(), 33);
        return append;
    }

    @Override // defpackage.bjlc
    public cqkl a() {
        this.a.run();
        return cqkl.a;
    }

    @Override // defpackage.bjlc
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.bjlc
    public CharSequence c() {
        return this.d;
    }

    @Override // defpackage.bjlc
    @dzsi
    public CharSequence d() {
        return this.e;
    }

    @Override // defpackage.bjlc
    @dzsi
    public CharSequence e() {
        return this.f;
    }

    @Override // defpackage.bjlc
    @dzsi
    public CharSequence f() {
        return this.g;
    }

    @Override // defpackage.bjlc
    @dzsi
    public CharSequence g() {
        return this.b;
    }
}
