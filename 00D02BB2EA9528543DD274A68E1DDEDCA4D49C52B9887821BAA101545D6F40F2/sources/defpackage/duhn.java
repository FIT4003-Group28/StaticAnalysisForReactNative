package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: duhn  reason: default package */
/* loaded from: classes6.dex */
public final class duhn {
    private static final Comparator<duhk> a = new duhm();

    public static int a(duhk duhkVar, duhk duhkVar2) {
        return a.compare(duhkVar, duhkVar2);
    }

    public static void b(duhk duhkVar) {
        int i;
        int i2;
        int i3;
        int i4 = duhkVar.a;
        dbsk.c(i4 >= 0 && i4 <= 23 && (i = duhkVar.b) >= 0 && i <= 59 && (i2 = duhkVar.c) >= 0 && i2 <= 59 && (i3 = duhkVar.d) >= 0 && i3 <= 999999999, "Proto TimeOfDay argument is invalid. The class required: 0 <= hours <= %s, 0 <= minutes <= %s, 0 <= seconds <= %s, 0 <= nanos <= %s. Received: hours = %s, minutes = %s, seconds = %s, nanos = %s.", 23, 59, 59, 999999999, Integer.valueOf(duhkVar.a), Integer.valueOf(duhkVar.b), Integer.valueOf(duhkVar.c), Integer.valueOf(duhkVar.d));
    }
}
