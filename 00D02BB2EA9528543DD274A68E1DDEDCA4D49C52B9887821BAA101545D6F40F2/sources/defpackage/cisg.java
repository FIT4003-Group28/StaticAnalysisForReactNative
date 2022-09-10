package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cisg  reason: default package */
/* loaded from: classes4.dex */
public class cisg implements cisf {
    private final Activity a;
    private final chug b;
    private final boolean c;
    private final chrw d;

    public cisg(Activity activity, chug chugVar, boolean z, chrw chrwVar) {
        this.a = activity;
        this.b = chugVar;
        this.c = z;
        this.d = chrwVar;
    }

    @Override // defpackage.cisf
    public cqkl a() {
        if (this.c) {
            this.d.c(this.b.b);
        } else {
            this.d.b(this.b.b);
        }
        return cqkl.a;
    }

    @Override // defpackage.cisf
    public String b() {
        return this.b.b;
    }

    @Override // defpackage.cisf
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.cisf
    public String d() {
        return Integer.toString(this.b.c);
    }

    @Override // defpackage.cisf
    public String e() {
        String string = this.a.getResources().getString(true != this.c ? R.string.GCID_FILTER_NOT_SELECTED_STATE : R.string.GCID_FILTER_SELECTED_STATE);
        Resources resources = this.a.getResources();
        chug chugVar = this.b;
        int i = chugVar.c;
        return resources.getQuantityString(R.plurals.GCID_FILTER_CATEGORY_BUTTON_A11Y, i, chugVar.b, Integer.valueOf(i), string);
    }

    @Override // defpackage.cisf
    public cjtd f() {
        cjta b = cjtd.b();
        b.d = dtxl.gx;
        chug chugVar = this.b;
        if ((chugVar.a & 256) != 0) {
            b.g(chugVar.j);
        }
        return b.a();
    }

    public int hashCode() {
        return this.b.b.hashCode();
    }
}
