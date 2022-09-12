package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: pot  reason: default package */
/* loaded from: classes7.dex */
public class pot {
    public final bvjj a;
    private final btvo b;

    public pot(btvo btvoVar, bvjj bvjjVar) {
        this.b = btvoVar;
        this.a = bvjjVar;
    }

    public static boolean c(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    public final dbsg<dvdy> a(int i) {
        if (this.b.getNavigationParameters() == null) {
            return dbpy.a;
        }
        for (dvdy dvdyVar : this.b.getNavigationParameters().M().d) {
            if (dvdyVar.b == i) {
                return dbsg.i(dvdyVar);
            }
        }
        return dbpy.a;
    }

    public final Boolean b() {
        boolean z = false;
        if (this.a.s(bvjk.jm, 0) == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final dbsg<dvdy> d(List<dqtx> list) {
        for (dqtx dqtxVar : list) {
            dbsg<dvdy> a = a(dqtxVar.a);
            if (a.a()) {
                int i = a.b().a;
                if ((i & 1) != 0 && (i & 8192) != 0) {
                    return a;
                }
            }
        }
        return dbpy.a;
    }

    public final String e(int i) {
        for (dvdy dvdyVar : this.b.getNavigationParameters().M().d) {
            if (dvdyVar.b == i) {
                return dvdyVar.j;
            }
        }
        return "";
    }
}
