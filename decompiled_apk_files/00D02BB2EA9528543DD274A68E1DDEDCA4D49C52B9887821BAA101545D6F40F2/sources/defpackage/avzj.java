package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;
/* compiled from: PG */
/* renamed from: avzj  reason: default package */
/* loaded from: classes.dex */
public final class avzj {
    static final btlu a = btlu.B("incognitoAccount", btlt.INCOGNITO);
    private final Context b;
    private final dxio<akfa> c;

    public avzj(Application application, dxio<akfa> dxioVar) {
        this.b = application;
        this.c = dxioVar;
    }

    public static boolean d(dlsw dlswVar) {
        return dlswVar != null && "notLoggedInAccount".equals(dlswVar.b);
    }

    public final long a() {
        UserManager userManager = (UserManager) this.b.getSystemService("user");
        if (userManager != null) {
            return userManager.getSerialNumberForUser(Process.myUserHandle());
        }
        return 0L;
    }

    public final dlsw b(@dzsi btlu btluVar) {
        dlsv bZ = dlsw.d.bZ();
        String l = Long.toString(a());
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dlsw dlswVar = (dlsw) bZ.b;
        l.getClass();
        dlswVar.a |= 2;
        dlswVar.c = l;
        btlt btltVar = btlt.UNKNOWN;
        int ordinal = btlu.i(btluVar).ordinal();
        if (ordinal == 0) {
            return bZ.bK();
        }
        if (ordinal == 1) {
            String h = btlu.h(btluVar);
            dbsk.s(h);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlsw dlswVar2 = (dlsw) bZ.b;
            h.getClass();
            dlswVar2.a = 1 | dlswVar2.a;
            dlswVar2.b = h;
            bZ.bK();
        } else if (ordinal == 2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlsw dlswVar3 = (dlsw) bZ.b;
            dlswVar3.a |= 1;
            dlswVar3.b = "incognitoAccount";
            return bZ.bK();
        } else if (ordinal == 3) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlsw dlswVar4 = (dlsw) bZ.b;
            dlswVar4.a |= 1;
            dlswVar4.b = "notLoggedInAccount";
            return bZ.bK();
        }
        return bZ.bK();
    }

    public final btlu c(dlsw dlswVar) {
        if (!dlswVar.b.equals("incognitoAccount")) {
            if (dlswVar.b.equals("notLoggedInAccount")) {
                return btlu.b;
            }
            btlu n = this.c.a().n(dlswVar.b);
            if (n != null) {
                return n;
            }
            String str = dlswVar.c;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35);
            sb.append("Owner{account_id=");
            sb.append("redacted");
            sb.append(",user_id=");
            sb.append(str);
            sb.append("}");
            throw new avzi(sb.toString());
        }
        return a;
    }
}
