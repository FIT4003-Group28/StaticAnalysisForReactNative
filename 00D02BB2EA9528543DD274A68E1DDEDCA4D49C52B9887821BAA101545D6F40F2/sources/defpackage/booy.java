package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: booy  reason: default package */
/* loaded from: classes3.dex */
public class booy implements jab {
    private final List<boox> a;
    private int b = 0;

    public booy(Activity activity) {
        this.a = dcdc.g(new boox(activity.getString(R.string.REPORT_EDIT_FOR_MODERATION_INAPPROPRIATE_CONTENT_OPTION), doso.VOTE_REASON_OFFENSIVE, cjtd.a(dtxv.dN)), new boox(activity.getString(R.string.REPORT_EDIT_FOR_MODERATION_INAPPROPRIATE_SPAM_OPTION), doso.VOTE_REASON_SPAM, cjtd.a(dtxv.dO)));
    }

    public doso a() {
        return this.a.get(this.b).b;
    }

    @Override // defpackage.jab
    public Integer c() {
        throw null;
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(i == this.b);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return this.a.get(i).a;
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        this.a.get(this.b);
        this.a.get(i);
        this.b = i;
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        return this.a.get(i).c;
    }
}
