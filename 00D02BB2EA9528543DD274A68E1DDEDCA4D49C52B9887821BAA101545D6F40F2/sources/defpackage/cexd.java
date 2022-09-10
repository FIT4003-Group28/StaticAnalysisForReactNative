package defpackage;

import android.text.Html;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cexd  reason: default package */
/* loaded from: classes4.dex */
class cexd implements cesy {
    final /* synthetic */ cexe a;
    private final gga b;
    private String c = "";
    private CharSequence d = "";

    public cexd(cexe cexeVar, gga ggaVar) {
        this.a = cexeVar;
        this.b = ggaVar;
    }

    @Override // defpackage.cesy
    public String a() {
        return this.c;
    }

    @Override // defpackage.cesy
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.cesy
    public String c() {
        return this.a.d ? this.b.getString(R.string.LEARN_MORE) : "";
    }

    @Override // defpackage.cesy
    public cqkl d() {
        this.b.D(gfk.g("https://support.google.com/maps/answer/7421661", false));
        return cqkl.a;
    }

    public void e() {
        int i;
        cerw cerwVar = cerw.ALL;
        int ordinal = this.a.b.k().b.ordinal();
        int i2 = 0;
        if (ordinal == 0 || ordinal == 1) {
            boolean z = this.a.d;
            i2 = true != z ? R.string.PLACE_QA_NO_QUESTIONS_OR_ANSWERS_YET : R.string.PLACE_QA_ASK_OR_ANSWER_QUESTIONS;
            i = true != z ? R.string.PLACE_QA_NO_QUESTIONS_OR_ANSWERS_YET_HELP_TEXT : R.string.PLACE_QA_ASK_OR_ANSWER_QUESTIONS_HELP_TEXT;
        } else if (ordinal == 2) {
            boolean z2 = this.a.d;
            i2 = true != z2 ? R.string.PLACE_QA_NO_QUESTIONS_YET : R.string.PLACE_QA_ASK_QUESTIONS;
            i = true != z2 ? R.string.PLACE_QA_NO_QUESTIONS_YET_HELP_TEXT : R.string.PLACE_QA_ASK_QUESTIONS_HELP_TEXT;
        } else if (ordinal == 3) {
            boolean z3 = this.a.d;
            i2 = true != z3 ? R.string.PLACE_QA_NO_ANSWERS_YET : R.string.PLACE_QA_ANSWER_QUESTIONS;
            i = true != z3 ? R.string.PLACE_QA_NO_ANSWERS_YET_HELP_TEXT : R.string.PLACE_QA_ANSWER_QUESTIONS_HELP_TEXT;
        } else if (ordinal != 4) {
            i = 0;
        } else {
            i2 = this.a.d ? bdys.PLACE_QA_REPLY_TO_ANSWERS : bdys.PLACE_QA_NO_REPLIES_YET;
            if (this.a.d) {
                i = bdys.PLACE_QA_REPLY_TO_ANSWERS_HELP_TEXT;
            } else {
                i = bdys.PLACE_QA_NO_REPLIES_YET_HELP_TEXT;
            }
        }
        CharSequence charSequence = "";
        this.c = i2 != 0 ? this.b.getString(i2) : charSequence;
        CharSequence charSequence2 = charSequence;
        if (i != 0) {
            charSequence2 = Html.fromHtml(this.b.getString(i));
        }
        this.d = charSequence2;
    }
}
