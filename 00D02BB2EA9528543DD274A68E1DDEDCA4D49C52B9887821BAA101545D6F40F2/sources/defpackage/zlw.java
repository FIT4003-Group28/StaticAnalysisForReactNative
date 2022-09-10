package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zlw  reason: default package */
/* loaded from: classes7.dex */
public class zlw implements zdr {
    private final Activity a;
    private final zds b;
    private final String c;
    @dzsi
    private final jhk d;
    private final ddho e;

    public zlw(Activity activity, zds zdsVar, String str, @dzsi jhk jhkVar, ddho ddhoVar) {
        this.a = activity;
        this.b = zdsVar;
        this.c = str;
        this.d = jhkVar;
        this.e = ddhoVar;
    }

    @Override // defpackage.zdr
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.zdr
    public CharSequence b() {
        return e().booleanValue() ? this.a.getString(R.string.DIRECTIONS_SUB_TAB_SELECTED, new Object[]{a()}) : a();
    }

    @Override // defpackage.zdr
    public String c() {
        return a().toString();
    }

    @Override // defpackage.zdr
    @dzsi
    public jhk d() {
        return this.d;
    }

    @Override // defpackage.zdr
    public Boolean e() {
        return Boolean.valueOf(this.b.g().get(this.b.Os().intValue()) == this);
    }

    @Override // defpackage.zdr
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = this.e;
        return b.a();
    }
}
