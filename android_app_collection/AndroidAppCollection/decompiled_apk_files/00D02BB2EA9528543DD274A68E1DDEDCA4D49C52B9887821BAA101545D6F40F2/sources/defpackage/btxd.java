package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: btxd  reason: default package */
/* loaded from: classes4.dex */
public final class btxd {
    public static boolean a(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072;
    }

    public static final dunb b(btvo btvoVar, Locale locale, dxio dxioVar, dxio dxioVar2, Context context) {
        String str;
        duna bZ = dunb.f.bZ();
        bZ.a(btvoVar.getParameterGroupsForRequest());
        dspd nextRequestToken = btvoVar.getNextRequestToken();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dunb dunbVar = (dunb) bZ.b;
        nextRequestToken.getClass();
        dunbVar.a |= 4;
        dunbVar.e = nextRequestToken;
        String str2 = "";
        if (btsj.b(context)) {
            str = dxioVar2.a() == null ? str2 : ((PseudonymousIdToken) dxioVar2.a()).a;
        } else {
            str = null;
        }
        dumy bZ2 = dumz.i.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dumz.c((dumz) bZ2.b);
        boolean a = a(context);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dumz dumzVar = (dumz) bZ2.b;
        dumzVar.a |= 2;
        dumzVar.c = a;
        dumz.e(dumzVar);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dumz.f((dumz) bZ2.b);
        if (true != dbsj.d(str)) {
            str2 = str;
        }
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dumz dumzVar2 = (dumz) bZ2.b;
        str2.getClass();
        int i = dumzVar2.a | 32;
        dumzVar2.a = i;
        dumzVar2.g = str2;
        dumzVar2.a = i | 64;
        dumzVar2.h = false;
        dmxb a2 = ((btxn) dxioVar.a()).a(btvoVar.getPaintParameters(), locale);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dumz dumzVar3 = (dumz) bZ2.b;
        a2.getClass();
        dumzVar3.f = a2;
        dumzVar3.a |= 16;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dunb dunbVar2 = (dunb) bZ.b;
        dumz bK = bZ2.bK();
        bK.getClass();
        dunbVar2.c = bK;
        dunbVar2.a |= 1;
        return bZ.bK();
    }
}
