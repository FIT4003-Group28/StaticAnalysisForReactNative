package defpackage;

import android.app.Activity;
import android.text.format.DateUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aenr  reason: default package */
/* loaded from: classes2.dex */
public class aenr implements aeng {
    private final Activity a;
    private final ddho b;
    private final aenq c;
    private boolean d;
    private eapg e;

    public aenr(Activity activity, ddho ddhoVar, int i, eapg eapgVar, boolean z, aenq aenqVar) {
        this.a = activity;
        this.b = ddhoVar;
        this.e = eapgVar;
        this.d = z;
        this.c = aenqVar;
    }

    @Override // defpackage.aeng
    public eapg a() {
        return this.e;
    }

    @Override // defpackage.aeng
    public String b() {
        return DateUtils.formatDateTime(this.a, a().n().getTime(), 524314);
    }

    @Override // defpackage.aeng
    public String c() {
        String string;
        Activity activity = this.a;
        Object[] objArr = new Object[2];
        objArr[0] = DateUtils.formatDateTime(activity, a().n().getTime(), 26);
        if (e().booleanValue()) {
            string = this.a.getString(R.string.DATEPICKER_SELECTED);
        } else {
            string = this.a.getString(R.string.DATEPICKER_NOT_SELECTED);
        }
        objArr[1] = string;
        return activity.getString(R.string.DATEPICKER_DESCRIPTION_SELECTABLE, objArr);
    }

    @Override // defpackage.aeng
    public cqkl d(cjqm cjqmVar) {
        this.c.a(this.e);
        return cqkl.a;
    }

    @Override // defpackage.aeng
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aeng
    public cjtd f() {
        return cjtd.a(this.b);
    }

    @Override // defpackage.aeng
    @dzsi
    public aenf g() {
        return null;
    }

    @Override // defpackage.aeng
    @dzsi
    public aenf h() {
        return null;
    }

    public void i(eapg eapgVar) {
        this.e = eapgVar;
    }

    public void j(boolean z) {
        this.d = z;
    }
}
