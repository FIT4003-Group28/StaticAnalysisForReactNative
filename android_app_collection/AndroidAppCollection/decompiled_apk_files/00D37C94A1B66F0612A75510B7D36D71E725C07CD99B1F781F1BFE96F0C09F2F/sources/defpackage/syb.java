package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: syb  reason: default package */
/* loaded from: classes4.dex */
public final class syb implements tek {
    public static void d(axml axmlVar, tdq tdqVar) {
        if ((tdqVar.f() || tdqVar.d() || tdqVar.e()) && aodq.r(axmlVar, 14)) {
            tdqVar.a().u(axmlVar.aG());
        }
    }

    @Override // defpackage.tek
    public final int a() {
        return 168774763;
    }

    @Override // defpackage.tek
    public final /* bridge */ /* synthetic */ aodt b(ByteBuffer byteBuffer) {
        axml axmlVar = new axml();
        axml.aH(byteBuffer, axmlVar);
        return axmlVar;
    }

    @Override // defpackage.tel
    public final /* bridge */ /* synthetic */ void c(cyv cyvVar, tda tdaVar, String str, Object obj, tdq tdqVar, tcr tcrVar) {
        axml axmlVar = (axml) obj;
        cyp a = tdqVar.a();
        int b = axmlVar.b(6);
        String str2 = null;
        String e = b != 0 ? axmlVar.e(b + axmlVar.a) : null;
        int b2 = axmlVar.b(4);
        String e2 = b2 != 0 ? axmlVar.e(b2 + axmlVar.a) : null;
        boolean z = !TextUtils.isEmpty(e);
        boolean z2 = !TextUtils.isEmpty(e2);
        if (z && z2) {
            StringBuilder sb = new StringBuilder(String.valueOf(e2).length() + 1 + String.valueOf(e).length());
            sb.append(e2);
            sb.append(" ");
            sb.append(e);
            str2 = sb.toString();
        } else if (z) {
            str2 = e;
        } else if (z2) {
            str2 = e2;
        }
        if (!TextUtils.isEmpty(axmlVar.X())) {
            a.A(axmlVar.X());
        }
        if (str2 != null) {
            a.t(str2);
        }
        if (aodq.r(axmlVar, 14)) {
            a.u(axmlVar.aG());
        }
        if (!TextUtils.isEmpty(axmlVar.X()) && axmlVar.aG()) {
            a.C(axmlVar.X());
        }
        int i = 0;
        int i2 = 1;
        boolean z3 = false;
        while (true) {
            int b3 = axmlVar.b(12);
            if (i < (b3 != 0 ? axmlVar.d(b3) : 0)) {
                int b4 = axmlVar.b(12);
                int i3 = b4 != 0 ? axmlVar.b.getInt(axmlVar.c(b4) + (i * 4)) : 0;
                if (i3 != 2 && i3 != 4) {
                    switch (i3) {
                        case 10:
                            z3 = true;
                            continue;
                            i++;
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 13:
                            a.c.C().D().a(true);
                            continue;
                            i++;
                        default:
                            i++;
                    }
                }
                if (i3 > i2) {
                    i2 = i3;
                }
                i++;
            } else {
                a.c.C().D().b(i2 != 2 ? i2 != 4 ? i2 != 14 ? i2 != 11 ? i2 != 12 ? "" : "android.widget.RadioButton" : "android.widget.Spinner" : "android.widget.CompoundButton" : "android.widget.ImageView" : "android.widget.Button");
                if (i2 == 12 || i2 == 14) {
                    tdqVar.q();
                    tdqVar.r(z3);
                }
                int b5 = axmlVar.b(16);
                if (b5 != 0) {
                    int i4 = axmlVar.b.getInt(b5 + axmlVar.a);
                    if (i4 == 1) {
                        a.v(1);
                        return;
                    } else if (i4 == 2) {
                        a.v(8);
                        return;
                    } else if (i4 == 3) {
                        a.v(2);
                        return;
                    } else if (i4 == 4) {
                        a.v(4);
                        return;
                    }
                }
                a.v(0);
                return;
            }
        }
    }

    @Override // defpackage.tel
    public final /* synthetic */ void e(tdq tdqVar) {
    }
}
