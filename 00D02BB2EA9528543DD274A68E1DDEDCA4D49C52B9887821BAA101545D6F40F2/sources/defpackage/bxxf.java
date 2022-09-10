package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bxxf  reason: default package */
/* loaded from: classes4.dex */
public class bxxf implements bxxe {
    private final ff a;
    private final awtn b;
    private final awre c;
    private final awtj d;
    private final eeu e;
    private final cqat f;

    public bxxf(awtn awtnVar, ff ffVar, eeu eeuVar, cqat cqatVar, awre awreVar, awtj awtjVar) {
        this.b = awtnVar;
        this.a = ffVar;
        this.e = eeuVar;
        this.f = cqatVar;
        this.c = awreVar;
        this.d = awtjVar;
    }

    @Override // defpackage.bxxe
    public CharSequence a() {
        String e = this.b.e();
        if (!dbsj.d(e)) {
            return this.a.getString(R.string.PARKING_LOCATION_NEAR, new Object[]{e});
        }
        return awtj.b(this.a, this.f, this.b);
    }

    @Override // defpackage.bxxe
    public CharSequence b() {
        return this.a.getString(R.string.PARKING_LOCATION_ODELAY_CARD_TITLE);
    }

    @Override // defpackage.bxxe
    public cqkl c() {
        if (this.e.b()) {
            this.a.g().f();
            this.c.e();
        }
        return cqkl.a;
    }

    public awtn d() {
        return this.b;
    }
}
