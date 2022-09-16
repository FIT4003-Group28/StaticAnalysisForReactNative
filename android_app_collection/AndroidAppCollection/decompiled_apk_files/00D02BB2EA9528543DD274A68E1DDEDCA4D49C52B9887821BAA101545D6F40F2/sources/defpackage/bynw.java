package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bynw  reason: default package */
/* loaded from: classes4.dex */
public final class bynw {
    public static final String a = "bynw";

    private bynw() {
    }

    @dzsi
    public static String a(@dzsi String str) {
        if (str == null) {
            return null;
        }
        return !str.startsWith("http") ? str.length() != 0 ? "https:".concat(str) : new String("https:") : str;
    }

    public static String b(Resources resources, bvsl bvslVar, dowb dowbVar) {
        return resources.getString(R.string.DISTANCE_TO_TRIP_LEVEL_NOTICE, bvslVar.i(dowbVar));
    }

    public static cqtd d(@dzsi amfu amfuVar) {
        cqtd j = amfuVar == null ? null : amfuVar.j();
        return j == null ? cqtt.c() : j;
    }

    public static Boolean e(@dzsi dpad dpadVar) {
        int a2;
        boolean z = false;
        if (dpadVar != null && (a2 = dpac.a(dpadVar.b)) != 0 && a2 == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static int f(cray crayVar) {
        int i = crayVar.a.D;
        int i2 = crayVar.g;
        if (i2 == -1 || i2 > i) {
            i2 = 0;
        }
        return i - i2;
    }

    @dzsi
    public static dowb g(@dzsi dowb dowbVar, int i) {
        int i2;
        if (dowbVar == null || (dowbVar.a & 1) == 0 || (i2 = dowbVar.b - i) <= 0) {
            return null;
        }
        dovy bZ = dowb.d.bZ();
        dowa b = dowa.b(dowbVar.c);
        if (b == null) {
            b = dowa.REGIONAL;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dowb dowbVar2 = (dowb) bZ.b;
        dowbVar2.c = b.e;
        int i3 = dowbVar2.a | 4;
        dowbVar2.a = i3;
        dowbVar2.a = i3 | 1;
        dowbVar2.b = i2;
        return bZ.bK();
    }

    public static cqtd c(@dzsi String str, amfi amfiVar, amfq amfqVar) {
        return d(str == null ? null : amfiVar.a(str, a, amfqVar));
    }
}
