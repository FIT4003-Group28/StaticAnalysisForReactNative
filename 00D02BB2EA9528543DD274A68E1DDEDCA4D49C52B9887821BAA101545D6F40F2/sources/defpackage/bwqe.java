package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bwqe  reason: default package */
/* loaded from: classes4.dex */
public class bwqe implements bwok {
    private final dwaw a;
    private final amte b;
    private final CharSequence c;
    private final CharSequence d;
    private final qbt e;
    private final Activity f;
    private final eeu g;
    private final ahjq h;
    private final int i;

    public bwqe(Activity activity, eeu eeuVar, CharSequence charSequence, CharSequence charSequence2, amte amteVar, qbt qbtVar, dwaw dwawVar, ahjq ahjqVar, int i) {
        this.g = eeuVar;
        this.f = activity;
        this.e = qbtVar;
        this.a = dwawVar;
        this.b = amteVar;
        this.c = charSequence;
        this.d = charSequence2;
        this.h = ahjqVar;
        this.i = i;
    }

    @Override // defpackage.bwok
    public CharSequence a() {
        return this.c;
    }

    @Override // defpackage.bwok
    public CharSequence b() {
        return this.d;
    }

    @Override // defpackage.bwok
    public cqkl c() {
        if (!this.g.b()) {
            return cqkl.a;
        }
        qcr u = qct.u(this.e.e().j(vun.c(this.a, this.f), this.b, true, this.i), qbs.DEFAULT);
        u.e(true);
        if (this.h.a() != null) {
            u.h(true);
        }
        this.e.m(u.a());
        return cqkl.a;
    }
}
