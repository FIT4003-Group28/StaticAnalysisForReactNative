package defpackage;

import android.app.Activity;
import android.content.Context;
/* compiled from: PG */
/* renamed from: ghs  reason: default package */
/* loaded from: classes3.dex */
public final class ghs {
    public final aynx a;
    public final aynx b;
    public final aynx c;
    public final aynx d;
    public boolean e;

    public ghs(Activity activity, ayoi ayoiVar, ntt nttVar) {
        ayoi V = ayoiVar.V(new iiv(activity, 1));
        aynx sq = aynx.e(V.i(aynq.BUFFER), nttVar.a.C(gam.i).n(), eho.e).L().aj().sq();
        this.d = sq;
        this.b = V.V(gam.f).V(gam.h).i(aynq.BUFFER);
        this.c = sq.C(gam.j);
        this.a = sq.C(gam.k);
        V.V(gam.g).i(aynq.BUFFER);
        V.as(new ayqb() { // from class: ghr
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Context context = (Context) obj;
                ghs.this.e = zew.y(context);
                zew.x(context);
                zew.w(context);
            }
        });
    }

    public static arou a(Context context) {
        int m = zew.m(context);
        if (m == 1 || m == 2) {
            return arou.SMALL_FORM_FACTOR;
        }
        if (m == 3 || m == 4) {
            return arou.LARGE_FORM_FACTOR;
        }
        return arou.UNKNOWN_FORM_FACTOR;
    }
}
