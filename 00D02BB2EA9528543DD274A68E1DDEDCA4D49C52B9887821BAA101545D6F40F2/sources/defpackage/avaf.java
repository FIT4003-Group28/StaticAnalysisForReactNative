package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: avaf  reason: default package */
/* loaded from: classes2.dex */
class avaf implements auzv {
    private final Application a;
    private final auiw b;
    private final auix c;
    private final auzu d;
    private final CharSequence e;

    public avaf(Application application, auiw auiwVar, auix auixVar, auzu auzuVar, boolean z) {
        String string;
        this.a = application;
        this.b = auiwVar;
        this.c = auixVar;
        this.d = auzuVar;
        if (z) {
            string = application.getString(R.string.MANAGE);
        } else {
            string = application.getString(R.string.NOTIFICATION_OPT_OUT_TURN_OFF);
        }
        this.e = string;
    }

    @Override // defpackage.auzv
    public cqkl a() {
        this.d.w();
        return cqkl.a;
    }

    @Override // defpackage.auzv
    public cqkl b() {
        this.d.aJ();
        return cqkl.a;
    }

    @Override // defpackage.auzv
    public cjtd c() {
        return cjtd.a(this.b.d);
    }

    @Override // defpackage.auzv
    public cjtd d() {
        return cjtd.a(this.b.c);
    }

    @Override // defpackage.auzv
    public cjtd e() {
        return cjtd.a(this.b.e);
    }

    @Override // defpackage.auzv
    public CharSequence f() {
        return this.a.getString(this.c.b);
    }

    @Override // defpackage.auzv
    public CharSequence g() {
        return this.a.getString(this.c.d);
    }

    @Override // defpackage.auzv
    public CharSequence h() {
        return this.e;
    }
}
