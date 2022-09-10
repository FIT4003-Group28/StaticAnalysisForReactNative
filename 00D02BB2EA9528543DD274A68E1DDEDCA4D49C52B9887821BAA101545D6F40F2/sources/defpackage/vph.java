package defpackage;

import android.content.res.Resources;
import java.util.List;
/* compiled from: PG */
/* renamed from: vph  reason: default package */
/* loaded from: classes7.dex */
public final class vph {
    public static boolean a(dowl dowlVar) {
        return dowlVar == dowl.UNSET || dowlVar == dowl.UNKNOWN_LICENSE_PLATE_TYPE;
    }

    @dzsi
    public static vpc b(@dzsi dowl dowlVar) {
        if (dowlVar == null) {
            return null;
        }
        dphv dphvVar = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dowlVar.ordinal()) {
            case 2:
            case 3:
                return vpc.JAKARTA;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return vpc.SAO_PAULO;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return vpc.MANILA;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return vpc.SANTIAGO;
            default:
                return null;
        }
    }

    public static dbsg<Integer> c(dowl dowlVar) {
        dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dowlVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return dbpy.a;
            case 4:
            case 9:
                return dbsg.i(1);
            case 5:
            case 10:
                return dbsg.i(3);
            case 6:
            case 11:
                return dbsg.i(5);
            case 7:
            case 12:
                return dbsg.i(7);
            case 8:
            case 13:
                return dbsg.i(9);
            case 14:
                return dbsg.i(0);
            case 15:
                return dbsg.i(2);
            case 16:
                return dbsg.i(4);
            case 17:
                return dbsg.i(6);
            case 18:
                return dbsg.i(8);
            default:
                return dbpy.a;
        }
    }

    public static dbsg<Integer> d(dowl dowlVar) {
        dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dowlVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return dbpy.a;
            case 4:
            case 9:
                return dbsg.i(2);
            case 5:
            case 10:
                return dbsg.i(4);
            case 6:
            case 11:
                return dbsg.i(6);
            case 7:
            case 12:
                return dbsg.i(8);
            case 8:
            case 13:
                return dbsg.i(0);
            case 14:
                return dbsg.i(1);
            case 15:
                return dbsg.i(3);
            case 16:
                return dbsg.i(5);
            case 17:
                return dbsg.i(7);
            case 18:
                return dbsg.i(9);
            default:
                return dbpy.a;
        }
    }

    public static dowl e(final vpc vpcVar, List<dowm> list) {
        return f(list, new dbsl(vpcVar) { // from class: vpg
            private final vpc a;

            {
                this.a = vpcVar;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                return vph.b((dowl) obj) == this.a;
            }
        });
    }

    public static dowl f(List<dowm> list, dbsl<dowl> dbslVar) {
        for (dowm dowmVar : list) {
            dowl b = dowl.b(dowmVar.b);
            if (b == null) {
                b = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
            }
            if (dbslVar.a(b)) {
                dowl b2 = dowl.b(dowmVar.b);
                return b2 == null ? dowl.UNKNOWN_LICENSE_PLATE_TYPE : b2;
            }
        }
        return dowl.UNSET;
    }

    @dzsi
    public static vpc g(dphv dphvVar) {
        dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar2 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dphvVar.ordinal()) {
            case 2:
            case 3:
                return vpc.JAKARTA;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return vpc.SAO_PAULO;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return vpc.MANILA;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return vpc.SANTIAGO;
            default:
                return null;
        }
    }

    public static void h(vpc vpcVar, dowi dowiVar, dowl dowlVar) {
        if (a(dowlVar) || b(dowlVar) == vpcVar) {
            int i = 0;
            while (i < ((dowr) dowiVar.b).i.size()) {
                dowl b = dowl.b(((dowr) dowiVar.b).i.get(i).b);
                if (b == null) {
                    b = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
                }
                if (b(b) == vpcVar) {
                    if (dowiVar.c) {
                        dowiVar.bF();
                        dowiVar.c = false;
                    }
                    dowr dowrVar = (dowr) dowiVar.b;
                    dowrVar.b();
                    dowrVar.i.remove(i);
                    i--;
                }
                i++;
            }
            if (b(dowlVar) != vpcVar) {
                return;
            }
            dowj bZ = dowm.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dowm dowmVar = (dowm) bZ.b;
            dowmVar.b = dowlVar.t;
            dowmVar.a |= 1;
            dowm bK = bZ.bK();
            if (dowiVar.c) {
                dowiVar.bF();
                dowiVar.c = false;
            }
            dowr dowrVar2 = (dowr) dowiVar.b;
            bK.getClass();
            dowrVar2.b();
            dowrVar2.i.add(bK);
        }
    }

    @dzsi
    public static CharSequence i(Resources resources, dowl dowlVar, int i, int i2, int i3, int i4) {
        dowl dowlVar2 = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dowlVar.ordinal()) {
            case 2:
                return resources.getString(i);
            case 3:
                return resources.getString(i2);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return resources.getString(i3, c(dowlVar).b(), d(dowlVar).b());
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return resources.getString(i4, c(dowlVar).b(), d(dowlVar).b());
            default:
                return null;
        }
    }

    @dzsi
    public static CharSequence j(Resources resources, dphv dphvVar, int i, int i2, int i3, dbsg<Integer> dbsgVar) {
        dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar2 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dphvVar.ordinal()) {
            case 2:
                return resources.getString(i2);
            case 3:
                return resources.getString(i);
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return resources.getString(i3, k(dphvVar).b(), l(dphvVar).b());
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                if (!dbsgVar.a()) {
                    return null;
                }
                return resources.getString(dbsgVar.b().intValue(), k(dphvVar).b(), l(dphvVar).b());
            default:
                return null;
        }
    }

    private static dbsg<Integer> k(dphv dphvVar) {
        dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar2 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dphvVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return dbpy.a;
            case 4:
            case 9:
                return dbsg.i(1);
            case 5:
            case 10:
                return dbsg.i(3);
            case 6:
            case 11:
                return dbsg.i(5);
            case 7:
            case 12:
                return dbsg.i(7);
            case 8:
            case 13:
                return dbsg.i(9);
            case 14:
                return dbsg.i(4);
            case 15:
                return dbsg.i(6);
            case 16:
                return dbsg.i(8);
            case 17:
                return dbsg.i(0);
            case 18:
                return dbsg.i(2);
            default:
                return dbpy.a;
        }
    }

    private static dbsg<Integer> l(dphv dphvVar) {
        dowl dowlVar = dowl.UNKNOWN_LICENSE_PLATE_TYPE;
        dphv dphvVar2 = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
        switch (dphvVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return dbpy.a;
            case 4:
            case 9:
                return dbsg.i(2);
            case 5:
            case 10:
                return dbsg.i(4);
            case 6:
            case 11:
                return dbsg.i(6);
            case 7:
            case 12:
                return dbsg.i(8);
            case 8:
            case 13:
                return dbsg.i(0);
            case 14:
                return dbsg.i(5);
            case 15:
                return dbsg.i(7);
            case 16:
                return dbsg.i(9);
            case 17:
                return dbsg.i(1);
            case 18:
                return dbsg.i(3);
            default:
                return dbpy.a;
        }
    }
}
