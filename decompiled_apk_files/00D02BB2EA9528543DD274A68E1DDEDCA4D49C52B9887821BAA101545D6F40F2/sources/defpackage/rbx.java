package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rbx  reason: default package */
/* loaded from: classes7.dex */
public class rbx implements rbh {
    private final Activity a;
    private final jad b;
    private final qud c;

    public rbx(Activity activity, rbw rbwVar, qud qudVar) {
        this.a = activity;
        this.b = rbwVar;
        this.c = qudVar;
    }

    @Override // defpackage.rbh
    public CharSequence a() {
        return this.a.getString(R.string.COMMUTE_HUB_TITLE);
    }

    @Override // defpackage.rbh
    public CharSequence b() {
        return this.a.getString(R.string.COMMUTE_HUB_HEADING);
    }

    @Override // defpackage.rbh
    public CharSequence c() {
        return this.a.getString(R.string.COMMUTE_HUB_DESCRIPTION, new Object[]{"\n", "\n"});
    }

    @Override // defpackage.rbh
    public jad d() {
        return this.b;
    }

    @Override // defpackage.rbh
    public Boolean e() {
        return Boolean.valueOf(this.c.a);
    }

    @Override // defpackage.rbh
    public cqkl f() {
        qud qudVar = this.c;
        gfq.l(qudVar.b);
        que queVar = qudVar.b;
        queVar.ad.C(byet.i(queVar.f, false, null, true, false, queVar.ah, queVar.ai, queVar.ae.f()), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        return cqkl.a;
    }
}
