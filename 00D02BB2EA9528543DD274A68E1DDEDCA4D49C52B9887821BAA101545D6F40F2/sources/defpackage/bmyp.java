package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmyp  reason: default package */
/* loaded from: classes3.dex */
public class bmyp implements jbf {
    private final Activity a;
    private dbsg<bmoe> b = dbpy.a;

    public bmyp(Activity activity) {
        this.a = activity;
    }

    public void a(bmoe bmoeVar) {
        this.b = dbsg.i(bmoeVar);
    }

    public boolean b() {
        return this.b.a() && this.b.b().f().booleanValue();
    }

    public boolean c() {
        return this.b.a() && this.b.b().g().booleanValue();
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        if (this.b.a()) {
            this.b.b().e();
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return cjtd.c;
    }

    @Override // defpackage.jbf
    @dzsi
    public CharSequence l() {
        return null;
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return this.a.getString(R.string.ADD_TO_VISITED_PLACES);
    }
}
