package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: amug  reason: default package */
/* loaded from: classes2.dex */
public final class amug {
    @dzsi
    public static amtr a(amub amubVar) {
        try {
            return b(amubVar);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static amtr b(amub amubVar) {
        amve amveVar = amubVar.d;
        boolean z = true;
        if (amveVar.e() != 1) {
            z = false;
        }
        dbsk.e(z, "Route should have 1 path - actually has %s", amveVar.e());
        return amveVar.d(0);
    }

    public static amuq c(amtr amtrVar) {
        int e = amtrVar.e();
        for (int i = 0; i < e; i++) {
            if (amtrVar.d(i).f()) {
                return amtrVar.d(i);
            }
        }
        throw new IllegalArgumentException("Route should have transit step-group");
    }

    @dzsi
    public static amuf d(@dzsi amtr amtrVar) {
        amuq amuqVar;
        amuq amuqVar2;
        if (amtrVar != null) {
            try {
                int e = amtrVar.e();
                int i = 0;
                while (true) {
                    if (i >= e) {
                        amuqVar = null;
                        break;
                    } else if (amtrVar.d(i).f()) {
                        amuqVar = amtrVar.d(i);
                        break;
                    } else {
                        i++;
                    }
                }
                while (true) {
                    i++;
                    if (i >= e) {
                        amuqVar2 = null;
                        break;
                    } else if (amtrVar.d(i).f()) {
                        amuqVar2 = amtrVar.d(i);
                        break;
                    }
                }
                if (amuqVar != null && amuqVar2 != null) {
                    return new amsm(amuqVar, amuqVar2);
                }
                throw new IllegalArgumentException("Route should have two transit step-groups");
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static String e(dcdc<amub> dcdcVar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            amtr a = a(dcdcVar.get(i));
            if (a != null) {
                int e = a.e();
                for (int i2 = 0; i2 < e; i2++) {
                    amuq d = a.d(i2);
                    if (d.f()) {
                        arrayList.add(TextUtils.join("/", dcbg.b(alcf.o(d.h().c)).s(amud.a).o(amue.a)));
                    }
                }
            }
        }
        return arrayList.isEmpty() ? "" : TextUtils.join(charSequence, arrayList);
    }
}
