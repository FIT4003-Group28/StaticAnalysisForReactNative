package defpackage;

import android.location.Location;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahyb  reason: default package */
/* loaded from: classes2.dex */
public final class ahyb {
    public final ahwo a;

    public ahyb(ahwo ahwoVar) {
        this.a = ahwoVar;
    }

    public static final String a(cokn coknVar, acjw acjwVar) {
        acke ackeVar;
        String str;
        int i = coknVar.b;
        String str2 = i != 1 ? i != 2 ? i != 4 ? "unknown" : "dwell" : "exit" : "enter";
        StringBuilder sb = new StringBuilder();
        sb.append("Geofence triggered: ");
        if (acjwVar.b == 8) {
            ackeVar = (acke) acjwVar.c;
        } else {
            ackeVar = acke.c;
        }
        dzvx.b(ackeVar, "geofence.locationSharingAlert");
        sb.append(ackeVar.b);
        sb.append("\n      |Transition: ");
        sb.append(str2);
        sb.append(", TriggeringInfo { lat: ");
        Location location = coknVar.d;
        dzvx.b(location, "event.triggeringLocation");
        sb.append(location.getLatitude());
        sb.append(",\n      |lng: ");
        Location location2 = coknVar.d;
        dzvx.b(location2, "event.triggeringLocation");
        sb.append(location2.getLongitude());
        sb.append(", accuracy: ");
        Location location3 = coknVar.d;
        dzvx.b(location3, "event.triggeringLocation");
        sb.append(location3.getAccuracy());
        sb.append(",\n      ");
        String sb2 = sb.toString();
        dzvx.c(sb2, "$this$trimMargin");
        dzvx.c(sb2, "$this$replaceIndentByMargin");
        if (dzxg.a("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        dzvx.c(sb2, "$this$lines");
        dzvx.c(sb2, "$this$lineSequence");
        dzvx.c(sb2, "$this$splitToSequence");
        dzwz dzwzVar = new dzwz(new dzxf(sb2, new dzxs(dztd.a(new String[]{"\r\n", "\n", "\r"}))), new dzxt(sb2));
        ArrayList arrayList = new ArrayList();
        dzwy dzwyVar = new dzwy(dzwzVar);
        while (dzwyVar.hasNext()) {
            arrayList.add(dzwyVar.next());
        }
        List b = dzti.b(arrayList);
        int length = sb2.length();
        b.size();
        dzve dzxjVar = "".length() == 0 ? dzxi.a : new dzxj();
        dzvx.c(b, "$this$lastIndex");
        int size = b.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj : b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                dzti.c();
            }
            String str3 = (String) obj;
            String str4 = null;
            if ((i2 == 0 || i2 == size) && dzxg.a(str3)) {
                str3 = null;
            } else {
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    } else if (!dzxa.a(str3.charAt(i4))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 != -1) {
                    dzvx.c(str3, "$this$startsWith");
                    if (str3.startsWith("|", i4)) {
                        int i5 = i4 + 1;
                        if (str3 != null) {
                            str4 = str3.substring(i5);
                            dzvx.b(str4, "(this as java.lang.String).substring(startIndex)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                if (str4 != null && (str = (String) dzxjVar.a(str4)) != null) {
                    str3 = str;
                }
            }
            if (str3 != null) {
                arrayList2.add(str3);
            }
            i2 = i3;
        }
        StringBuilder sb3 = new StringBuilder(length);
        dzti.k(arrayList2, sb3, "\n");
        String sb4 = sb3.toString();
        dzvx.b(sb4, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb4;
    }
}
