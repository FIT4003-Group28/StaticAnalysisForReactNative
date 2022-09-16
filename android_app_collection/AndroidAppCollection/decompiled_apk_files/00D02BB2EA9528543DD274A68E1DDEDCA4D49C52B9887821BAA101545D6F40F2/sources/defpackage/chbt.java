package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: chbt  reason: default package */
/* loaded from: classes4.dex */
public class chbt extends cgwu {
    private final afha d;

    public chbt(Activity activity, @dzsi String str, String str2, boolean z, cgwj cgwjVar, afha afhaVar) {
        super(activity, str, str2, z, cgwjVar);
        this.d = afhaVar;
    }

    @Override // defpackage.cgwu, defpackage.cguz
    public CharSequence c() {
        return this.a.getString(R.string.FACTUAL_MODERATION_WEBSITE_CALLOUT, new Object[]{this.b});
    }

    @Override // defpackage.cgwu, defpackage.cguz
    public Boolean d() {
        return true;
    }

    @Override // defpackage.cgwu, defpackage.cguz
    public cqkl f() {
        this.c.ab(doab.PRIOR_RESEARCH_VISITED_WEBSITE);
        afha afhaVar = this.d;
        Activity activity = this.a;
        String str = this.b;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() != 0 ? "http://".concat(valueOf) : new String("http://");
        }
        afhaVar.k(activity, str, 1);
        return cqkl.a;
    }

    @Override // defpackage.cgwu, defpackage.cguz
    @dzsi
    public cjtd g() {
        return cjtd.a(dtyd.u);
    }
}
