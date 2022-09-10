package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bkez  reason: default package */
/* loaded from: classes3.dex */
public class bkez implements bkfo {
    private final Activity a;
    private final String b;

    public bkez(Activity activity, String str, bkfd bkfdVar) {
        this.a = activity;
        this.b = str;
    }

    @Override // defpackage.bkfo
    public String a() {
        return dbsj.d(this.b) ? this.a.getString(R.string.STRUCTURED_QUOTE_REQUEST_CONFIRMATION_SNACKBAR_BODY) : this.b;
    }

    @Override // defpackage.bkfo
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.bkfo
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.bkfo
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.bkfo
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bkfo
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.bkfo
    @dzsi
    public cjtd g() {
        return null;
    }
}
