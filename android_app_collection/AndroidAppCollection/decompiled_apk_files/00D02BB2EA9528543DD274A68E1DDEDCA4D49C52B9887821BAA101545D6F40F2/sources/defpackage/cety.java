package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cety  reason: default package */
/* loaded from: classes4.dex */
public class cety implements cetb {
    private final Activity a;
    private final ceet b;
    private final gfw c;
    private dhtc d;

    public cety(Activity activity, ceet ceetVar, dhtc dhtcVar, gfw gfwVar) {
        this.d = dhtcVar;
        this.c = gfwVar;
        this.b = ceetVar;
        this.a = activity;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.cetb
    public Boolean b() {
        return false;
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.b.k(this.d, this.c);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxl.eP);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.getString(R.string.CREATOR_PROFILE_EDIT_LINK_TEXT);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.cetb, defpackage.jad
    public cqtd i() {
        return cqrt.i(iup.e(R.raw.ic_mod_edit), ibm.x());
    }

    public void j(dhtc dhtcVar) {
        bvrj.UI_THREAD.c();
        this.d = dhtcVar;
    }
}
