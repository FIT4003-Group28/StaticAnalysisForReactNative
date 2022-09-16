package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjxc  reason: default package */
/* loaded from: classes3.dex */
public class bjxc implements bjwc {
    private final CharSequence a;
    private final CharSequence b;
    private final cjtd c;
    private final bjjo d;

    public bjxc(gga ggaVar, ilo iloVar, djao djaoVar, bjjo bjjoVar, bjgs bjgsVar) {
        cjtd b;
        int i = djaoVar.d;
        this.a = i > 0 ? String.valueOf(i) : ggaVar.getString(R.string.PLACE_QA_ANSWER_PROMPT);
        djam djamVar = djaoVar.b;
        djamVar = djamVar == null ? djam.m : djamVar;
        String string = i > 0 ? ggaVar.getString(R.string.PLACE_QA_REVIEW_ANSWERS_CONTENT_DESCRIPTION, new Object[]{ggaVar.getResources().getQuantityString(R.plurals.PLACE_QA_REVIEW_ANSWERS_PEOPLE_COUNT, i, Integer.valueOf(i))}) : "";
        Object[] objArr = new Object[2];
        djag djagVar = djamVar.c;
        objArr[0] = bjgr.a(ggaVar, iloVar, djagVar == null ? djag.d : djagVar);
        objArr[1] = string;
        this.b = ggaVar.getString(R.string.PLACE_QA_ACCESSIBILITY_QUESTION_ANSWER_BUTTON_CONTENT_DESCRIPTION, objArr);
        this.d = bjjoVar;
        cjta d = bjgr.d(iloVar);
        int ordinal = bjgsVar.ordinal();
        if (ordinal == 0) {
            b = d.b(dtxy.ll);
        } else if (ordinal == 1) {
            b = d.b(dtxy.fK);
        } else if (ordinal == 2) {
            b = d.b(dtxy.gt);
        } else {
            b = cjtd.b;
        }
        this.c = b;
    }

    @Override // defpackage.bjwc
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bjwc
    public CharSequence b() {
        return this.b;
    }

    @Override // defpackage.bjwc
    public cqkl c() {
        this.d.a.b.t(true);
        return cqkl.a;
    }

    @Override // defpackage.bjwc
    public cjtd d() {
        return this.c;
    }
}
