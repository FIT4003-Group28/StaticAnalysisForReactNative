package defpackage;
/* compiled from: PG */
/* renamed from: aulh  reason: default package */
/* loaded from: classes2.dex */
public final class aulh {
    private final ausy a;
    private final dxio<akfa> b;
    private final dxio<aump> c;
    private final auso d;
    private final btwr e;
    private final ault f;
    private final auhn g;

    public aulh(ausy ausyVar, dxio<akfa> dxioVar, dxio<aump> dxioVar2, auso ausoVar, btwr btwrVar, ault aultVar, auhn auhnVar) {
        this.a = ausyVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = ausoVar;
        this.e = btwrVar;
        this.f = aultVar;
        this.g = auhnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @dzsi
    public static String c(dlfv dlfvVar) {
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        if ((dlgnVar.b & 2) != 0) {
            dlgn dlgnVar2 = dlfvVar.g;
            if (dlgnVar2 == null) {
                dlgnVar2 = dlgn.G;
            }
            return dlgnVar2.F;
        }
        return null;
    }

    public static dbsg<dlfv> e(cvkj cvkjVar) {
        dsok h = cvkjVar.h();
        if (h != null && "type.googleapis.com/gmm.notifications.GenericNotificationClientData".equals(h.a)) {
            try {
                return dbsg.i((dlfv) dsqw.cp(dlfv.h, h.b));
            } catch (dsrm unused) {
                return dbpy.a;
            }
        }
        return dbpy.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dbsg<dlgf> f(dsbi dsbiVar) {
        if ((dsbiVar.a & 64) != 0) {
            dsok dsokVar = dsbiVar.i;
            if (dsokVar == null) {
                dsokVar = dsok.c;
            }
            if (!"type.googleapis.com/gmm.notifications.GenericNotificationaGMMAction".equals(dsokVar.a)) {
                String str = dsokVar.a;
                return dbpy.a;
            }
            try {
                return dbsg.i((dlgf) dsqw.cp(dlgf.l, dsokVar.b));
            } catch (dsrm unused) {
                return dbpy.a;
            }
        }
        return dbpy.a;
    }

    private static aulc g(aujb aujbVar, btvo btvoVar, dlfv dlfvVar, cjtd cjtdVar, boolean z) {
        dbsg<ausn> dbsgVar;
        dbsg dbsgVar2;
        String c = c(dlfvVar);
        aukl auklVar = new aukl();
        auklVar.a = Integer.valueOf(aujbVar.a);
        auklVar.b = dbsg.j(c);
        if (cjtdVar != null) {
            auklVar.c = cjtdVar;
            auklVar.d = Boolean.valueOf(z);
            ddos l = aujbVar.l(btvoVar);
            if (l != null) {
                dlgn dlgnVar = dlfvVar.g;
                if (dlgnVar == null) {
                    dlgnVar = dlgn.G;
                }
                if ((dlgnVar.a & 536870912) != 0) {
                    dlgn dlgnVar2 = dlfvVar.g;
                    if (dlgnVar2 == null) {
                        dlgnVar2 = dlgn.G;
                    }
                    dbsgVar2 = dbsg.j(akqi.b(dlgnVar2.B));
                } else {
                    dbsgVar2 = dbpy.a;
                }
                dbsgVar = dbsg.i(ausn.c(l, dbsgVar2));
            } else {
                dbsgVar = dbpy.a;
            }
            auklVar.e = dbsgVar;
            String str = auklVar.a == null ? " loggingId" : "";
            if (auklVar.c == null) {
                str = str.concat(" loggingParams");
            }
            if (auklVar.d == null) {
                str = String.valueOf(str).concat(" autoCancelOnClick");
            }
            if (str.isEmpty()) {
                return new aukm(auklVar.a.intValue(), auklVar.b, auklVar.c, auklVar.d.booleanValue(), auklVar.e);
            }
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null loggingParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dbsg<defpackage.aule> a(@defpackage.dzsi defpackage.cvkc r28, defpackage.cvkj r29) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aulh.a(cvkc, cvkj):dbsg");
    }

    public final dbsg<btlu> b(@dzsi cvkc cvkcVar) {
        String c = cvkcVar != null ? cvkcVar.c() : null;
        return c != null ? dbsg.j(this.b.a().n(c)) : dbpy.a;
    }

    @dzsi
    public final aujb d(dlfv dlfvVar) {
        Integer d = this.a.d(dlfvVar);
        if (d != null) {
            return this.a.e(d.intValue());
        }
        return null;
    }
}
