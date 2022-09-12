package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axpq  reason: default package */
/* loaded from: classes3.dex */
public class axpq implements axor {
    public final dzsj<cqhn> a;
    public final v<axfk> b;
    private final dzsj<gga> c;
    private final axjh d;

    public axpq(dzsj<gga> dzsjVar, axjh axjhVar, dzsj<cqhn> dzsjVar2, v<axfk> vVar) {
        this.c = dzsjVar;
        this.d = axjhVar;
        this.a = dzsjVar2;
        this.b = vVar;
    }

    @Override // defpackage.axor
    public String a() {
        return this.c.a().getString(R.string.REQUESTS_LABEL);
    }

    @Override // defpackage.axor
    public String b() {
        axfk h = this.b.h();
        dbsk.s(h);
        return (String) h.a().h(axpo.a).c(" ");
    }

    @Override // defpackage.axor
    public cqkl c() {
        this.d.n();
        return cqkl.a;
    }
}
