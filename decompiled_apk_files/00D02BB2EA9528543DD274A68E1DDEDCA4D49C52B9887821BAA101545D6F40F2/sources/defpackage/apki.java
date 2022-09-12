package defpackage;
/* compiled from: PG */
/* renamed from: apki  reason: default package */
/* loaded from: classes2.dex */
public final class apki<T> extends btrh<T> {
    private apki(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    public static void b(btrm btrmVar, Object obj) {
        btrmVar.a(obj);
    }

    public static void c(btrm btrmVar, apkh apkhVar) {
        dceq a = dcet.a();
        a.b(alho.class, new apki(alho.class, apkhVar, bvrj.UI_THREAD));
        btrmVar.g(apkhVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        String str;
        dbsg dbsgVar;
        apkh apkhVar = (apkh) this.a;
        alaq alaqVar = ((alho) obj).a;
        if (!(alaqVar instanceof alap) || (str = ((alap) alaqVar).q) == null) {
            return;
        }
        String[] split = str.split("@");
        if (split.length != 2) {
            dbsgVar = dbpy.a;
        } else {
            try {
                dbsgVar = dbsg.i(aoha.c(aogb.f(eapg.c(split[0])), Integer.parseInt(split[1])));
            } catch (IllegalArgumentException unused) {
                dbsgVar = dbpy.a;
            }
        }
        if (!dbsgVar.a()) {
            return;
        }
        apkhVar.a.e((aoha) dbsgVar.b());
    }
}
