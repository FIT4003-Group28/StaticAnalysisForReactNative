package defpackage;

import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acbe  reason: default package */
/* loaded from: classes2.dex */
public abstract class acbe implements acba {
    private final CharSequence a;
    private final View.OnClickListener b;
    private final String c;
    private final String d;
    private final cjtd e;

    public acbe(dwfl dwflVar, View.OnClickListener onClickListener, Application application, String str, String str2, int i) {
        this.a = application.getString(R.string.ACCESSIBILITY_PHOTO_GALLERY_NUMBERED_THUMBNAIL, new Object[]{Integer.valueOf(i + 1)});
        this.b = onClickListener;
        this.c = str;
        this.d = str2;
        cjta b = cjtd.b();
        b.d = dtye.u;
        b.g(dwflVar.c);
        this.e = b.a();
    }

    @Override // defpackage.acba
    public Boolean b() {
        return true;
    }

    @Override // defpackage.acba
    public View.OnClickListener c() {
        return this.b;
    }

    @Override // defpackage.acba
    public CharSequence d() {
        return this.a;
    }

    @Override // defpackage.acba
    public Boolean f() {
        return Boolean.valueOf(!this.c.isEmpty());
    }

    @Override // defpackage.acba
    public String g() {
        return this.c;
    }

    @Override // defpackage.acba
    public Boolean h() {
        return Boolean.valueOf(!this.d.isEmpty());
    }

    @Override // defpackage.acba
    public String i() {
        return this.d;
    }

    @Override // defpackage.acba
    @dzsi
    public cqtd j() {
        return null;
    }

    @Override // defpackage.acba
    public cjtd k() {
        return this.e;
    }
}
