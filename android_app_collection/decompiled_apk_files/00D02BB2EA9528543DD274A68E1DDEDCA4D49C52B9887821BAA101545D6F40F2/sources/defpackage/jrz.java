package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jrz  reason: default package */
/* loaded from: classes7.dex */
public class jrz implements jrd {
    private final Activity a;
    private final dzsj<ahjq> b;
    private final bvsl c;
    private final dxio<afha> d;
    private final dhmz e;
    @dzsi
    private final String f;
    private final jic g;
    private final cjtd h;
    private final cjtd i;

    public jrz(Activity activity, dzsj<ahjq> dzsjVar, bvsl bvslVar, dxio<afha> dxioVar, dhmz dhmzVar, Set<dkdt> set, jic jicVar) {
        String string;
        this.a = activity;
        this.b = dzsjVar;
        this.c = bvslVar;
        this.d = dxioVar;
        this.e = dhmzVar;
        this.g = jicVar;
        if (set.contains(dkdt.PAST_BOOKINGS)) {
            string = activity.getString(R.string.RECOMMENDATION_BADGE_BOOK_AGAIN);
        } else if (set.contains(dkdt.NEWLY_BOOKABLE)) {
            string = activity.getString(R.string.RECOMMENDATION_BADGE_NEW);
        } else {
            string = set.contains(dkdt.DEAL) ? activity.getString(R.string.RECOMMENDATION_BADGE_DEALS) : null;
        }
        this.f = string;
        this.h = jsi.a(dtxv.f, dhmzVar);
        this.i = jsi.a(dtxv.g, dhmzVar);
    }

    @Override // defpackage.jrd
    public String a() {
        return this.e.d;
    }

    @Override // defpackage.jrd
    @dzsi
    public Float b() {
        return Float.valueOf(this.e.g);
    }

    @Override // defpackage.jrd
    public jic c() {
        dhmz dhmzVar = this.e;
        return (dhmzVar.a & 16) != 0 ? new jic(dhmzVar.f, ckqc.FIFE, R.drawable.generic_image_placeholder) : this.g;
    }

    @Override // defpackage.jrd
    @dzsi
    public String d() {
        return this.f;
    }

    @Override // defpackage.jrd
    @dzsi
    public String e() {
        GmmLocation a = this.b.a().a();
        dhjz dhjzVar = this.e.e;
        if (dhjzVar == null) {
            dhjzVar = dhjz.e;
        }
        return isl.b(a, dhjzVar, this.c);
    }

    @Override // defpackage.jrd
    public cqkl f() {
        Activity activity = this.a;
        dxio<afha> dxioVar = this.d;
        String valueOf = String.valueOf(this.e.b);
        jru.a(activity, dxioVar, valueOf.length() != 0 ? "m=".concat(valueOf) : new String("m="));
        return cqkl.a;
    }

    @Override // defpackage.jrd
    public cjtd g() {
        return this.h;
    }

    @Override // defpackage.jrd
    public cjtd h() {
        return this.i;
    }
}
