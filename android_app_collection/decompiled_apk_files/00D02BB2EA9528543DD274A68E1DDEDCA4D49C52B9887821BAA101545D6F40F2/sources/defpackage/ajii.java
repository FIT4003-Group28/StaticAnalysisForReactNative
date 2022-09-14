package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.sharing.sms.api.SmsController$SmsMessage;
import java.util.List;
/* compiled from: PG */
/* renamed from: ajii  reason: default package */
/* loaded from: classes2.dex */
public final class ajii {
    public static boolean a(List<diss> list, boolean z) {
        return c(list).size() > 1;
    }

    public static dbsg<SmsController$SmsMessage> b(dqzv dqzvVar, Context context, int i) {
        dqya dqyaVar;
        dqya dqyaVar2;
        if (dqzvVar.b == 2) {
            dqyb dqybVar = (dqyb) dqzvVar.c;
            if (dqybVar.b == 6) {
                dqyaVar = (dqya) dqybVar.c;
            } else {
                dqyaVar = dqya.e;
            }
            if ((dqyaVar.a & 4) == 0) {
                return dbpy.a;
            }
            bwhp f = SmsController$SmsMessage.f();
            f.b();
            f.c(context.getString(i, dqybVar.d));
            if (dqybVar.b == 6) {
                dqyaVar2 = (dqya) dqybVar.c;
            } else {
                dqyaVar2 = dqya.e;
            }
            f.d(dqyaVar2.d);
            return dbsg.i(f.a());
        }
        return dbpy.a;
    }

    public static dcdc<String> c(List<diss> list) {
        dqyb dqybVar;
        dqya dqyaVar;
        dccx F = dcdc.F();
        for (diss dissVar : list) {
            if (d(dissVar)) {
                dqzx dqzxVar = dissVar.b;
                if (dqzxVar == null) {
                    dqzxVar = dqzx.c;
                }
                if (dqzxVar.a == 2) {
                    dqybVar = (dqyb) dqzxVar.b;
                } else {
                    dqybVar = dqyb.j;
                }
                if (dqybVar.b == 6) {
                    dqyaVar = (dqya) dqybVar.c;
                } else {
                    dqyaVar = dqya.e;
                }
                F.g(dqyaVar.d);
            }
        }
        return F.f();
    }

    public static boolean d(diss dissVar) {
        dqyb dqybVar;
        dqya dqyaVar;
        dqzx dqzxVar = dissVar.b;
        if (dqzxVar == null) {
            dqzxVar = dqzx.c;
        }
        if (dqzxVar.a == 2) {
            dqzx dqzxVar2 = dissVar.b;
            if (dqzxVar2 == null) {
                dqzxVar2 = dqzx.c;
            }
            if (dqzxVar2.a == 2) {
                dqybVar = (dqyb) dqzxVar2.b;
            } else {
                dqybVar = dqyb.j;
            }
            if (dqybVar.b == 6) {
                dqyaVar = (dqya) dqybVar.c;
            } else {
                dqyaVar = dqya.e;
            }
            return (dqyaVar.a & 4) != 0;
        }
        return false;
    }
}
