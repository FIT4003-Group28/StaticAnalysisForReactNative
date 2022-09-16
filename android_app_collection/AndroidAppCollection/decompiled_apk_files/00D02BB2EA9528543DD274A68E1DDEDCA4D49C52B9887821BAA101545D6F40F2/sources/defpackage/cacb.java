package defpackage;

import android.text.Html;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cacb  reason: default package */
/* loaded from: classes4.dex */
public class cacb implements cafs {
    final /* synthetic */ cacc a;
    private final boolean b;

    public cacb(cacc caccVar, dori doriVar) {
        this.a = caccVar;
        this.b = doriVar.c;
    }

    @Override // defpackage.cafs
    public Boolean a() {
        cauh cauhVar = this.a.f;
        boolean z = false;
        if (cauhVar != null && !cauhVar.e && cauhVar.c.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cafs
    public CharSequence b() {
        int i;
        cauh cauhVar = this.a.f;
        if (cauhVar == null) {
            return "";
        }
        cauj caujVar = cauj.ALL;
        int ordinal = cauhVar.b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = true != this.b ? R.string.PLACE_QA_NO_QUESTIONS_OR_ANSWERS_YET : R.string.PLACE_QA_ASK_OR_ANSWER_QUESTIONS;
        } else if (ordinal == 2) {
            i = true != this.b ? R.string.PLACE_QA_NO_QUESTIONS_YET : R.string.PLACE_QA_ASK_QUESTIONS;
        } else if (ordinal == 3) {
            i = true != this.b ? R.string.PLACE_QA_NO_ANSWERS_YET : R.string.PLACE_QA_ANSWER_QUESTIONS;
        } else if (ordinal != 4) {
            i = 0;
        } else if (this.b) {
            i = bdys.PLACE_QA_REPLY_TO_ANSWERS;
        } else {
            i = bdys.PLACE_QA_NO_REPLIES_YET;
        }
        return i != 0 ? this.a.a.getString(i) : "";
    }

    @Override // defpackage.cafs
    public CharSequence c() {
        int i;
        cauh cauhVar = this.a.f;
        if (cauhVar == null) {
            return "";
        }
        cauj caujVar = cauj.ALL;
        int ordinal = cauhVar.b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = true != this.b ? R.string.PLACE_QA_NO_QUESTIONS_OR_ANSWERS_YET_HELP_TEXT : R.string.PLACE_QA_ASK_OR_ANSWER_QUESTIONS_HELP_TEXT;
        } else if (ordinal == 2) {
            i = true != this.b ? R.string.PLACE_QA_NO_QUESTIONS_YET_HELP_TEXT : R.string.PLACE_QA_ASK_QUESTIONS_HELP_TEXT;
        } else if (ordinal == 3) {
            i = true != this.b ? R.string.PLACE_QA_NO_ANSWERS_YET_HELP_TEXT : R.string.PLACE_QA_ANSWER_QUESTIONS_HELP_TEXT;
        } else if (ordinal != 4) {
            i = 0;
        } else if (this.b) {
            i = bdys.PLACE_QA_REPLY_TO_ANSWERS_HELP_TEXT;
        } else {
            i = bdys.PLACE_QA_NO_REPLIES_YET_HELP_TEXT;
        }
        return i != 0 ? Html.fromHtml(this.a.a.getString(i)) : "";
    }

    @Override // defpackage.cafs
    @dzsi
    public CharSequence d() {
        if (this.b) {
            return this.a.a.getString(R.string.LEARN_MORE);
        }
        return null;
    }

    @Override // defpackage.cafs
    public cqkl e() {
        this.a.a.D(gfk.g("https://support.google.com/maps/answer/7421661", false));
        return cqkl.a;
    }
}
