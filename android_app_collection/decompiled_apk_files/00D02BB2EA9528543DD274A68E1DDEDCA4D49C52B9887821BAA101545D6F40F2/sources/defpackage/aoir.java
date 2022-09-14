package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aoir  reason: default package */
/* loaded from: classes2.dex */
public class aoir implements bcdh {
    private final jic a;
    private final cjtd b;
    private final View.OnClickListener c;
    private final float d;
    private final String e;

    public aoir(jic jicVar, float f, View.OnClickListener onClickListener, cjtd cjtdVar, Application application) {
        this.a = jicVar;
        this.c = onClickListener;
        this.b = cjtdVar;
        this.d = f;
        this.e = application.getString(R.string.ACCESSIBILITY_PHOTO_GALLERY_THUMBNAIL);
    }

    @Override // defpackage.bcdh
    public void a(cqiv cqivVar) {
        cqivVar.a(new bcda(), this);
    }

    @Override // defpackage.bcdh
    public jic b() {
        return this.a;
    }

    @Override // defpackage.bcdh
    public Float c() {
        return Float.valueOf(this.d);
    }

    @Override // defpackage.bcdh
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bcdh
    public View.OnClickListener e() {
        return this.c;
    }

    @Override // defpackage.bcdh
    public cjtd f() {
        return this.b;
    }

    @Override // defpackage.bcdh
    public CharSequence g() {
        return this.e;
    }

    @Override // defpackage.bcdh
    public Boolean h() {
        return false;
    }

    @Override // defpackage.bcdh
    public Boolean i() {
        throw null;
    }

    @Override // defpackage.bcdh
    public CharSequence j() {
        throw null;
    }

    @Override // defpackage.bcdh
    public Boolean k() {
        return bcdg.a();
    }

    @Override // defpackage.bcdh
    public String l() {
        return null;
    }
}
