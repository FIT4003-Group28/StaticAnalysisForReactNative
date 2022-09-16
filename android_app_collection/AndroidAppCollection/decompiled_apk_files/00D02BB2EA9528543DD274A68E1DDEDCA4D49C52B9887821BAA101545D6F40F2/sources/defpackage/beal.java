package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beal  reason: default package */
/* loaded from: classes3.dex */
public class beal implements bdzv {
    private final Activity a;
    private final dzsj<brba> b;
    private final ilo c;
    private final cjtd d;

    public beal(Activity activity, dzsj<brba> dzsjVar, ilo iloVar, ilm ilmVar) {
        this.a = activity;
        this.b = dzsjVar;
        this.c = iloVar;
        ddho ddhoVar = dtyb.aK;
        cjta c = cjtd.c(iloVar.cb());
        c.d = ddhoVar;
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = iloVar.ai().g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        c.s(bZ.bK());
        c.w(ddhj.VISIBILITY_VISIBLE);
        if ((ilmVar.b().a & 2048) != 0) {
            c.g(ilmVar.b().h);
        }
        this.d = c.a();
    }

    @Override // defpackage.bdzv
    public CharSequence a() {
        return this.a.getString(R.string.INLINE_HOTEL_BOOKING_HEADER);
    }

    @Override // defpackage.bdzv
    public cjtd b() {
        return this.d;
    }

    @Override // defpackage.bdzv
    public cqkl c() {
        begj begjVar = new begj();
        begjVar.n = true;
        begjVar.c = jjn.FULLY_EXPANDED;
        begjVar.e = bege.PRICES;
        begjVar.B = true;
        this.b.a().J(this.c, begjVar);
        return cqkl.a;
    }

    @Override // defpackage.bdzv
    public Boolean d() {
        return Boolean.valueOf(this.c.aa() != null);
    }

    @Override // defpackage.bdzv
    public CharSequence e() {
        return a();
    }

    @Override // defpackage.bdzv
    public jic f() {
        return null;
    }
}
