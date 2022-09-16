package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zle  reason: default package */
/* loaded from: classes7.dex */
public class zle extends zqo implements zco {
    private final Context a;
    private final amve b;
    private final amsy c;

    public zle(Context context, amve amveVar, int i, amsy amsyVar) {
        super(context, amveVar, i, new zqx(context, amveVar), null, 0L, null);
        this.a = context;
        this.b = amveVar;
        this.c = amsyVar;
    }

    @Override // defpackage.zco
    @dzsi
    public String a() {
        if (this.c.i() == 0) {
            return null;
        }
        Context context = this.a;
        amsy amsyVar = this.c;
        return amvj.a(context, amsyVar.h(amsyVar.i() - 1));
    }

    @Override // defpackage.zco
    @dzsi
    public String b() {
        dgas x = vyb.x(this.b);
        if (x == null) {
            return null;
        }
        int i = x.a;
        if ((i & 1) != 0) {
            return bvtb.e(this.a.getResources(), x.b, bvsz.ABBREVIATED).toString();
        }
        if ((i & 2) == 0) {
            return null;
        }
        return x.c;
    }

    @Override // defpackage.zqo, defpackage.zca
    /* renamed from: c */
    public String k() {
        bvsi bvsiVar = new bvsi(this.a);
        String a = a();
        if (a != null) {
            bvsiVar.d(a);
        }
        String S = S();
        if (S != null) {
            bvsiVar.d(S);
        }
        zfn zfnVar = zfn.DIRECTIONS_RESULT_TRIPCARD;
        int ordinal = M().ordinal();
        if (ordinal == 1) {
            bvsiVar.d(this.a.getString(R.string.ACCESSIBILITY_STEPS_COLLAPSED));
            bvsiVar.d(this.a.getString(R.string.ACCESSIBILITY_INSTRUCTION_EXPAND));
        } else if (ordinal == 2) {
            bvsiVar.d(this.a.getString(R.string.INFORMAL_TRANSIT_TRIP_DETAILS_ACCESSIBILITY_MOSTLY_EXPANDED));
            bvsiVar.d(this.a.getString(R.string.INFORMAL_TRANSIT_TRIP_DETAILS_ACCESSIBILITY_FULLY_COLLAPSE));
        } else if (ordinal == 3) {
            bvsiVar.d(this.a.getString(R.string.INFORMAL_TRANSIT_TRIP_DETAILS_ACCESSIBILITY_FULLY_EXPANDED));
            bvsiVar.d(this.a.getString(R.string.INFORMAL_TRANSIT_TRIP_DETAILS_ACCESSIBILITY_PARTIALLY_COLLAPSE));
        }
        return bvsiVar.toString();
    }
}
