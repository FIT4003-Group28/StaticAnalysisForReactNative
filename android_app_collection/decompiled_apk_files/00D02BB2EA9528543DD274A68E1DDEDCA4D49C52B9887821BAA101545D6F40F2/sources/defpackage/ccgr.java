package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ccgr  reason: default package */
/* loaded from: classes4.dex */
public final class ccgr implements cchz {
    public final btrm a;
    private final HashMap<String, String> b = new HashMap<>();
    @dzsi
    private ccih c = null;
    private final crzo<ccih> d = new crzo<>(ccih.b);

    public ccgr(btrm btrmVar) {
        this.a = btrmVar;
    }

    private static String f(btlu btluVar) {
        return btluVar.s().name;
    }

    private final void g(ccih ccihVar) {
        if (!ccihVar.equals(this.c)) {
            this.c = ccihVar;
            this.a.b(ccihVar);
            this.d.a(ccihVar);
        }
    }

    @Override // defpackage.cchz
    public final synchronized void a(btlu btluVar, String str) {
        if (!btlu.a.equals(btluVar) && !dbsj.d(str)) {
            this.b.put(f(btluVar), str);
            ccih ccihVar = this.c;
            if (ccihVar == null || !btlu.g(btluVar, ((cchy) ccihVar).a)) {
                return;
            }
            g(ccih.d(btluVar, str, false));
        }
    }

    @dzsi
    public final synchronized String b(String str) {
        return this.b.get(str);
    }

    @Override // defpackage.cchz
    public final synchronized String c(btlu btluVar) {
        String a;
        if (btlu.a.equals(btluVar)) {
            return "https://lh3.googleusercontent.com/a/default-user=s120-cc";
        }
        String b = b(f(btluVar));
        if (b != null) {
            return b;
        }
        String str = btluVar.i;
        if (dbsj.d(str)) {
            a = "https://lh3.googleusercontent.com/a/default-user=s120-cc";
        } else {
            dsnh b2 = ckqj.b(str);
            b2.e(true);
            b2.i();
            a = ckqj.a(b2, str);
        }
        return a;
    }

    @Override // defpackage.cchz
    public final crzm<ccih> d() {
        return this.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(gds gdsVar) {
        btlu btluVar = gdsVar.a;
        if (btluVar != null && btlu.i(btluVar) == btlt.GOOGLE && !btlu.a.equals(btluVar)) {
            g(ccih.d(btluVar, c(btluVar), true));
            return;
        }
        g(ccih.b);
    }
}
