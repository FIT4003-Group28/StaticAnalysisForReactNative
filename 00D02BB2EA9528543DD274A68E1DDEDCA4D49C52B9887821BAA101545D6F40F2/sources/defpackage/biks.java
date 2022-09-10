package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: biks  reason: default package */
/* loaded from: classes3.dex */
public final class biks {
    public final dwfl a;
    public final String b;
    public final int c;
    private final Activity d;
    private final aesb e;
    private final eeu f;
    private final bwrs<ilo> g;
    private final bmea h;

    public biks(Activity activity, eeu eeuVar, aesb aesbVar, bbut bbutVar, bwsh bwshVar, bwrs<ilo> bwrsVar, dwfl dwflVar, String str, int i) {
        this.d = activity;
        this.e = aesbVar;
        this.f = eeuVar;
        this.g = bwrsVar;
        this.a = dwflVar;
        this.b = str;
        this.c = i;
        this.h = new bmeb(bbutVar, bwshVar);
    }

    @dzsi
    private final ddho d() {
        int i = this.c - 1;
        return i != 1 ? i != 2 ? dtxy.mw : dtxy.ld : dtxy.je;
    }

    public final String a() {
        int i = this.c;
        return (i == 1 || i == 2) ? this.d.getString(R.string.STREET_VIEW_THUMBNAIL) : this.b;
    }

    public final void b() {
        if (!((efh) this.f).b) {
            return;
        }
        this.h.a(this.g, this.a);
        this.e.D((ilo) bwrs.b(this.g), 8, d());
    }

    public final cjtd c() {
        ddho d = d();
        cjta b = cjtd.b();
        dwfl dwflVar = this.a;
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.d = d;
        return b.a();
    }
}
