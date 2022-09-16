package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bksh  reason: default package */
/* loaded from: classes3.dex */
public class bksh implements bksb {
    private final Activity b;
    private final cjtd c = cjtd.a(dtxy.nL);
    private final bksv d;
    private final String e;

    public bksh(Activity activity, bksv bksvVar) {
        this.b = activity;
        this.d = bksvVar;
        this.e = activity.getString(R.string.CLEAR_TOPIC_FILTERING_LABEL);
    }

    @Override // defpackage.bkrw
    public cqtd a() {
        return null;
    }

    @Override // defpackage.bkrw
    public cjtd b() {
        return null;
    }

    @Override // defpackage.bkrw
    public int c() {
        return 0;
    }

    @Override // defpackage.bkrw
    public CharSequence d() {
        return this.e;
    }

    @Override // defpackage.bkrw
    public CharSequence e() {
        return "";
    }

    @Override // defpackage.bkrw
    public cqkl f() {
        this.d.q();
        this.d.o();
        return cqkl.a;
    }

    @Override // defpackage.bkrw
    public Boolean g() {
        return Boolean.valueOf(!this.d.k().booleanValue());
    }

    @Override // defpackage.bkrw
    public cjtd h() {
        return this.c;
    }

    @Override // defpackage.bkrw
    public CharSequence i() {
        return this.b.getResources().getString(R.string.CLEAR_TOPIC_FILTERING_LABEL_DESCRIPTION_SELECTION_STATE, this.b.getResources().getString(true != g().booleanValue() ? R.string.REVIEW_FILTER_NOT_SELECTED_STATE : R.string.REVIEW_FILTER_SELECTED_STATE));
    }
}
