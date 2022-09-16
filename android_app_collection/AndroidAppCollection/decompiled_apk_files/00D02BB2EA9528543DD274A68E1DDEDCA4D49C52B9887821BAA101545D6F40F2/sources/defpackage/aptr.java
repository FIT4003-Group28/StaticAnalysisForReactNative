package defpackage;

import android.webkit.MimeTypeMap;
/* compiled from: PG */
/* renamed from: aptr  reason: default package */
/* loaded from: classes2.dex */
public final class aptr {
    private static final dcep<String> a = dcep.E("image/jpeg", "image/png", "image/tiff", "image/bmp");

    public static dbod a(bbtj bbtjVar, dbsg<String> dbsgVar) {
        dbnz bZ = dbod.e.bZ();
        String c = dbsgVar.c(bbtjVar.a().toString());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dbod dbodVar = (dbod) bZ.b;
        c.getClass();
        dbodVar.a |= 2;
        dbodVar.b = c;
        bbti bbtiVar = bbti.PHOTO;
        int ordinal = bbtjVar.b().ordinal();
        if (ordinal == 0) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbod dbodVar2 = (dbod) bZ.b;
            dbodVar2.c = 1;
            dbodVar2.a |= 32;
        } else if (ordinal == 1) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dbod dbodVar3 = (dbod) bZ.b;
            dbodVar3.c = 2;
            dbodVar3.a |= 32;
        }
        dboa bZ2 = dbob.d.bZ();
        if (bbtjVar.s().a()) {
            int intValue = bbtjVar.s().b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dbob dbobVar = (dbob) bZ2.b;
            dbobVar.a = 2 | dbobVar.a;
            dbobVar.c = intValue;
        }
        if (bbtjVar.r().a()) {
            int intValue2 = bbtjVar.r().b().intValue();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dbob dbobVar2 = (dbob) bZ2.b;
            dbobVar2.a = 1 | dbobVar2.a;
            dbobVar2.b = intValue2;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dbod dbodVar4 = (dbod) bZ.b;
        dbob bK = bZ2.bK();
        bK.getClass();
        dbodVar4.d = bK;
        dbodVar4.a |= 64;
        return bZ.bK();
    }

    public static boolean b(bbtj bbtjVar) {
        if (bbtjVar.i() == null) {
            return false;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String i = bbtjVar.i();
        dbsk.s(i);
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(i.replaceAll("[~]", "")));
        return mimeTypeFromExtension != null && a.contains(mimeTypeFromExtension);
    }

    public static int c(bbtj bbtjVar) {
        int intValue = bbtjVar.r().c(0).intValue();
        int intValue2 = bbtjVar.s().c(0).intValue();
        if (intValue < 400 || intValue2 < 300) {
            return 2;
        }
        return (intValue > 10000 || intValue2 > 10000) ? 1 : 3;
    }
}
