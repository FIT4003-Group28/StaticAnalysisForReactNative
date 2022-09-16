package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cjsc  reason: default package */
/* loaded from: classes.dex */
public final class cjsc {
    public static final cjsc a = new cjsc();

    public static ddll a(Context context) {
        Intent d = btox.d(context);
        if (d == null) {
            return ddll.e;
        }
        ddlk bZ = ddll.e.bZ();
        int intExtra = d.getIntExtra("status", -1);
        int i = 5;
        if (intExtra == 2) {
            i = 2;
        } else if (intExtra == 3) {
            i = 4;
        } else if (intExtra == 4) {
            i = 3;
        } else if (intExtra != 5) {
            i = 1;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddll ddllVar = (ddll) bZ.b;
        ddllVar.b = i - 1;
        ddllVar.a = 1 | ddllVar.a;
        int b = b(d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddll ddllVar2 = (ddll) bZ.b;
        ddllVar2.c = b - 1;
        ddllVar2.a |= 2;
        int c = btox.c(d);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddll ddllVar3 = (ddll) bZ.b;
        ddllVar3.a |= 4;
        ddllVar3.d = c;
        return bZ.bK();
    }

    public static int b(Intent intent) {
        int intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra != 1) {
            if (intExtra == 2) {
                return 3;
            }
            return intExtra != 4 ? 1 : 4;
        }
        return 2;
    }
}
