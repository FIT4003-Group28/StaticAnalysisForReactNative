package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ubz  reason: default package */
/* loaded from: classes7.dex */
public class ubz implements ubq {
    private final tgg a;
    private final CharSequence b;
    private final CharSequence c;

    public ubz(Activity activity, tgg tggVar) {
        this.a = tggVar;
        this.b = activity.getString(R.string.OFFLINE_RESULT_LIST_WARNING);
        this.c = activity.getString(R.string.OFFLINE_RESULT_LIST_ACTION_TEXT);
    }

    @Override // defpackage.ubq
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.ubq
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.ubq
    public cqkl c() {
        this.a.a();
        return cqkl.a;
    }
}
