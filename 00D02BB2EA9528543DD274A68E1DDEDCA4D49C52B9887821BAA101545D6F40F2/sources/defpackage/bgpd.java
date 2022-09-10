package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgpd  reason: default package */
/* loaded from: classes3.dex */
public class bgpd implements bgnv {
    private final Activity a;
    private final dipk b;
    private int c;

    public bgpd(Activity activity, dipk dipkVar) {
        this.a = activity;
        this.b = dipkVar;
    }

    @Override // defpackage.bgnv
    public String a() {
        return this.a.getResources().getString(R.string.MEDIA_POST_INDICATOR_TEXT, Integer.valueOf(this.c), Integer.valueOf(this.b.m.size()));
    }

    @Override // defpackage.bgnv
    @dzsi
    public cjtd b() {
        cjta b = cjtd.b();
        b.d = dtxu.aM;
        b.g(this.b.q);
        return b.a();
    }

    @Override // defpackage.bgnv
    public void c(int i) {
        this.c = i;
    }

    @Override // defpackage.bgnv
    public String d() {
        return this.a.getResources().getString(R.string.MEDIA_INDICATOR_CONTENT_DESCRIPTION, Integer.valueOf(this.c), Integer.valueOf(this.b.m.size()));
    }
}
