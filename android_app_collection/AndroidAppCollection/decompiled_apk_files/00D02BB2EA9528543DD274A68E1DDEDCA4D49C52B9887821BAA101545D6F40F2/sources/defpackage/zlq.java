package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zlq  reason: default package */
/* loaded from: classes7.dex */
public class zlq implements zcp {
    private final gga a;
    private final vpd b;
    private final amsy c;
    private final amub d;

    public zlq(vpd vpdVar, gga ggaVar, amub amubVar, amsy amsyVar) {
        this.b = vpdVar;
        this.d = amubVar;
        this.c = amsyVar;
        this.a = ggaVar;
    }

    @Override // defpackage.zcp
    public Boolean a() {
        return Boolean.valueOf(m() != null);
    }

    @Override // defpackage.zcp
    public cqtd b() {
        return vyt.g;
    }

    @Override // defpackage.jbi
    @dzsi
    public CharSequence m() {
        dbsg dbsgVar;
        dbsg dbsgVar2;
        if (this.d.h != dqvj.DRIVE) {
            return null;
        }
        dphv b = dphv.b(this.d.d.a.z);
        if (b == null) {
            b = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        }
        dphv dphvVar = b;
        if (this.b.b(dphvVar) || vph.g(dphvVar) == null) {
            return null;
        }
        if (this.b.a()) {
            dphv b2 = dphv.b(this.d.d.a.z);
            if (b2 == null) {
                b2 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
            }
            for (int i = 0; i < this.c.n(); i++) {
                dqvj c = dqvj.c(this.c.m(i).b().b);
                if (c == null) {
                    c = dqvj.DRIVE;
                }
                if (c == this.d.h) {
                    dphv b3 = dphv.b(this.c.m(i).a.z);
                    if (b3 == null) {
                        b3 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
                    }
                    if (b3 != b2) {
                    }
                }
            }
            Resources resources = this.a.getResources();
            if (this.b.d(vpc.MANILA)) {
                dbsgVar2 = dbsg.i(Integer.valueOf((int) R.string.ROUTES_ALL_GO_THROUGH_MANILA_AREA));
            } else {
                dbsgVar2 = dbpy.a;
            }
            return vph.j(resources, dphvVar, R.string.ROUTES_ALL_CONTAIN_ODD_PLATE_ROADS, R.string.ROUTES_ALL_CONTAIN_EVEN_PLATE_ROADS, R.string.ROUTES_ALL_GO_THROUGH_RODIZIO_AREA, dbsgVar2);
        }
        Resources resources2 = this.a.getResources();
        if (this.b.d(vpc.MANILA)) {
            dbsgVar = dbsg.i(Integer.valueOf((int) R.string.ROUTE_GOES_THROUGH_MANILA_AREA));
        } else {
            dbsgVar = dbpy.a;
        }
        return vph.j(resources2, dphvVar, R.string.ROUTE_INCLUDES_ODD_PLATE_ROADS, R.string.ROUTE_INCLUDES_EVEN_PLATE_ROADS, R.string.ROUTE_GOES_THROUGH_RODIZIO_AREA, dbsgVar);
    }
}
