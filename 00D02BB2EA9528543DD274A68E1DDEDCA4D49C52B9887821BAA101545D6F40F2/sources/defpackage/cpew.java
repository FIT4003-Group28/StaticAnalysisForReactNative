package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cpew  reason: default package */
/* loaded from: classes5.dex */
public final class cpew {
    public static dsob a(Context context, int i, String str) {
        dsnx bZ = dsob.g.bZ();
        String languageTag = context.getResources().getConfiguration().locale.toLanguageTag();
        if (languageTag != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsob dsobVar = (dsob) bZ.b;
            languageTag.getClass();
            dsobVar.a |= 1;
            dsobVar.b = languageTag;
        }
        dsny bZ2 = dsoa.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsoa dsoaVar = (dsoa) bZ2.b;
        dsoaVar.b = 1;
        dsoaVar.a |= 1;
        int i2 = context.getResources().getDisplayMetrics().densityDpi;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsoa dsoaVar2 = (dsoa) bZ2.b;
        dsoaVar2.a |= 2;
        dsoaVar2.c = i2;
        String format = String.format(Locale.US, "%s;%d", Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT));
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dsoa dsoaVar3 = (dsoa) bZ2.b;
        format.getClass();
        dsoaVar3.a |= 4;
        dsoaVar3.d = format;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsob dsobVar2 = (dsob) bZ.b;
        dsoa bK = bZ2.bK();
        bK.getClass();
        dsobVar2.c = bK;
        dsobVar2.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsob dsobVar3 = (dsob) bZ.b;
        dsobVar3.a |= 4;
        dsobVar3.d = i;
        if (str != null && !TextUtils.isEmpty(str)) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dsob dsobVar4 = (dsob) bZ.b;
            str.getClass();
            dsobVar4.a |= 8;
            dsobVar4.e = str;
        }
        dsob bK2 = bZ.bK();
        dsqp dsqpVar = (dsqp) bK2.cu(5);
        dsqpVar.bC(bK2);
        dsnx dsnxVar = (dsnx) dsqpVar;
        dsnw dsnwVar = bK2.f;
        if (dsnwVar == null) {
            dsnwVar = dsnw.c;
        }
        dsqp dsqpVar2 = (dsqp) dsnwVar.cu(5);
        dsqpVar2.bC(dsnwVar);
        dsnv dsnvVar = (dsnv) dsqpVar2;
        if (dsnvVar.c) {
            dsnvVar.bF();
            dsnvVar.c = false;
        }
        dsnw dsnwVar2 = (dsnw) dsnvVar.b;
        dsnwVar2.a |= 1;
        dsnwVar2.b = "204612000";
        if (dsnxVar.c) {
            dsnxVar.bF();
            dsnxVar.c = false;
        }
        dsob dsobVar5 = (dsob) dsnxVar.b;
        dsnw bK3 = dsnvVar.bK();
        bK3.getClass();
        dsobVar5.f = bK3;
        dsobVar5.a |= 64;
        return dsnxVar.bK();
    }
}
