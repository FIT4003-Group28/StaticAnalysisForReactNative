package defpackage;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cprv  reason: default package */
/* loaded from: classes5.dex */
public final class cprv implements cpru {
    final /* synthetic */ acrf a;

    public cprv(acrf acrfVar) {
        this.a = acrfVar;
    }

    @Override // defpackage.cpru
    public final List<String> a(List list) {
        String str;
        ArrayList b = cpwi.b(list.size());
        for (Object obj : list) {
            acrf acrfVar = this.a;
            int intValue = ((Double) obj).intValue();
            if (intValue % 3 == 0) {
                int i = intValue % 24;
                if (DateFormat.is24HourFormat(acrfVar.a.c)) {
                    StringBuilder sb = new StringBuilder(14);
                    sb.append(i);
                    sb.append(":00");
                    str = sb.toString();
                } else {
                    int i2 = 12;
                    String str2 = i < 12 ? "a" : "p";
                    int i3 = i % 12;
                    if (i3 != 0) {
                        i2 = i3;
                    }
                    StringBuilder sb2 = new StringBuilder(str2.length() + 11);
                    sb2.append(i2);
                    sb2.append(str2);
                    str = sb2.toString();
                }
            } else {
                str = "";
            }
            b.add(str);
        }
        return b;
    }
}
