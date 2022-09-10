package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwpw  reason: default package */
/* loaded from: classes4.dex */
public class bwpw implements bwog {
    private final ff a;
    private final awtn b;
    private final awre c;
    private final awtj d;
    private final eeu e;
    private final cqat f;

    public bwpw(ff ffVar, eeu eeuVar, cqat cqatVar, awtn awtnVar, awre awreVar, awtj awtjVar) {
        this.a = ffVar;
        this.e = eeuVar;
        this.f = cqatVar;
        this.b = awtnVar;
        this.c = awreVar;
        this.d = awtjVar;
    }

    @Override // defpackage.bwog
    public CharSequence a() {
        String e = this.b.e();
        if (!dbsj.d(e)) {
            return this.a.getString(R.string.PARKING_LOCATION_NEAR, new Object[]{e});
        }
        return awtj.b(this.a, this.f, this.b);
    }

    @Override // defpackage.bwog
    public CharSequence b() {
        return this.a.getString(R.string.PARKING_LOCATION_ODELAY_CARD_TITLE);
    }

    @Override // defpackage.bwog
    public cqkl c() {
        if (this.e.b()) {
            this.a.g().f();
            this.c.e();
        }
        return cqkl.a;
    }
}
