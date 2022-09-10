package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apob  reason: default package */
/* loaded from: classes2.dex */
public abstract class apob implements apoa {
    private final Context a;
    protected long f;
    protected boolean g;
    protected boolean h;
    protected long i;
    protected int j;

    public apob(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.apoa
    public String f() {
        Resources resources = this.a.getResources();
        dgar bZ = dgas.e.bZ();
        int i = ((int) this.f) / 1000;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgas dgasVar = (dgas) bZ.b;
        dgasVar.a |= 1;
        dgasVar.b = i;
        return bvtb.c(resources, bZ.bK(), bvsz.FULL).toString();
    }

    @Override // defpackage.apoa
    public CharSequence g() {
        return this.a.getString(R.string.PLAY_BUTTON_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.apoa
    public CharSequence h() {
        return this.a.getString(R.string.PAUSE_BUTTON_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.apoa
    public Boolean k() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.apoa
    public Boolean l() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.apoa
    public Integer m() {
        return Integer.valueOf(this.j);
    }

    @Override // defpackage.apoa
    public CharSequence n() {
        return "";
    }

    @Override // defpackage.apoa
    public String o() {
        Resources resources = this.a.getResources();
        dgar bZ = dgas.e.bZ();
        int i = ((int) this.i) / 1000;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgas dgasVar = (dgas) bZ.b;
        dgasVar.a |= 1;
        dgasVar.b = i;
        return bvtb.c(resources, bZ.bK(), bvsz.FULL).toString();
    }
}
