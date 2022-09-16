package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: cipg  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cipg implements cqjb {
    static final cqjb a = new cipg();

    private cipg() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cipl ciplVar = (cipl) cqkpVar;
        String e = ciplVar.e();
        String string = context.getString(R.string.DRAFT_REVIEW_TASK_TITLE);
        String f = ciplVar.f();
        int length = String.valueOf(e).length();
        StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(string).length() + String.valueOf(f).length());
        sb.append(e);
        sb.append(" ");
        sb.append(string);
        sb.append(" ");
        sb.append(f);
        return sb.toString();
    }
}
