package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: zpp  reason: default package */
/* loaded from: classes7.dex */
public class zpp extends acoi implements zfa {
    public static final dcqe a = dcqe.c("zpp");
    public dcdc<zpm> b = dcdc.e();
    @dzsi
    public qbr c;
    public final cjqy d;
    public dqvj e;
    public final bvrb f;
    private final Context g;
    private final Resources h;
    private final vtn i;
    private final qbv j;
    private final boolean k;
    private final acnw l;

    public zpp(vtn vtnVar, bvrb bvrbVar, cjqy cjqyVar, yys yysVar, btvo btvoVar, vwv vwvVar, qbv qbvVar, Context context, List<vnu> list, dqvj dqvjVar) {
        zpo zpoVar = new zpo(this);
        this.l = zpoVar;
        this.i = vtnVar;
        this.f = bvrbVar;
        this.d = cjqyVar;
        this.h = context.getResources();
        this.g = context;
        this.e = dqvjVar;
        this.j = qbvVar;
        this.k = btvoVar.getDirectionsPageParameters().e;
        d(list, dqvjVar);
        Y(zpoVar);
    }

    private final String f(vnu vnuVar) {
        if (vnuVar.b()) {
            return "—";
        }
        amte p = vnuVar.d().p();
        amsy amsyVar = p != null ? p.a : null;
        if (p != null && amsyVar != null && vnuVar.a() == dqvj.DRIVE && amsyVar.i() > 0 && amsyVar.l() == amsyVar.i()) {
            dpal dpalVar = amsyVar.j(amsyVar.i() - 1).b;
            if (dpalVar == null) {
                dpalVar = dpal.e;
            }
            if ((dpalVar.a & 2) != 0) {
                amub b = p.b(vnuVar.d().e(), this.g);
                if (b == null) {
                    return "";
                }
                amve amveVar = b.d;
                return vyb.A(this.h, amveVar, vyb.x(amveVar));
            }
        }
        if (!vnuVar.c().isEmpty()) {
            return vnuVar.c();
        }
        if (!vnuVar.d().t() || amsyVar == null || amsyVar.A() != 0 || amsyVar.n() <= 0) {
            return "";
        }
        Resources resources = this.h;
        amve m = amsyVar.m(0);
        return vyb.A(resources, m, vyb.x(m));
    }

    private final String g(dqvj dqvjVar) {
        dqvj dqvjVar2 = dqvj.DRIVE;
        int ordinal = dqvjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return this.g.getString(R.string.DIRECTIONS_BICYCLE);
            }
            if (ordinal == 2) {
                return this.g.getString(R.string.DIRECTIONS_WALK);
            }
            if (ordinal == 3) {
                return this.g.getString(R.string.DIRECTIONS_TRANSPORT);
            }
            if (ordinal == 4) {
                return this.g.getString(R.string.DIRECTIONS_FLY);
            }
            if (ordinal == 5) {
                return this.g.getString(R.string.DIRECTIONS_TWO_WHEELER);
            }
            return ordinal != 7 ? "" : this.g.getString(R.string.DIRECTIONS_TAXI);
        }
        return this.g.getString(R.string.DIRECTIONS_DRIVE);
    }

    @Override // defpackage.zfa
    public List<? extends zex> a() {
        return this.b;
    }

    public void c(@dzsi qbr qbrVar) {
        this.c = qbrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (r12.isEmpty() != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.util.List<defpackage.vnu> r19, defpackage.dqvj r20) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpp.d(java.util.List, dqvj):void");
    }
}
