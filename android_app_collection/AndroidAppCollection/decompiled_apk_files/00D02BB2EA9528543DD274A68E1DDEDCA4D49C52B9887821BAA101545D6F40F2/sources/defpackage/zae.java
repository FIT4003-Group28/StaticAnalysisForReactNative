package defpackage;

import android.net.Uri;
import android.util.Base64;
import android.util.Pair;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: zae  reason: default package */
/* loaded from: classes7.dex */
public final class zae {
    public static URL a(afhv afhvVar, amub amubVar) {
        amvj.k(amubVar.ai());
        dbsk.b(amubVar.h != dqvj.TWO_WHEELER, "Sharing two-wheeler routes is not supported.");
        ArrayList arrayList = new ArrayList();
        amvh[] amvhVarArr = amubVar.o;
        int length = amvhVarArr.length;
        int i = 0;
        while (true) {
            String str = "";
            if (i < length) {
                amvh amvhVar = amvhVarArr[i];
                String w = amvhVar.w();
                if (dbsj.d(w)) {
                    return null;
                }
                akqi akqiVar = amvhVar.d;
                akqq akqqVar = amvhVar.e;
                if (akqiVar != null || akqqVar != null) {
                    dtbr bZ = dtbs.g.bZ();
                    if (akqqVar != null) {
                        int a = anae.a(akqqVar.a);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dtbs dtbsVar = (dtbs) bZ.b;
                        dtbsVar.a |= 2;
                        dtbsVar.b = a;
                        int a2 = anae.a(akqqVar.b);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dtbs dtbsVar2 = (dtbs) bZ.b;
                        dtbsVar2.a |= 4;
                        dtbsVar2.c = a2;
                    }
                    if (akqiVar != null) {
                        long j = akqiVar.b;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dtbs dtbsVar3 = (dtbs) bZ.b;
                        int i2 = dtbsVar3.a | 16;
                        dtbsVar3.a = i2;
                        dtbsVar3.e = j;
                        long j2 = akqiVar.c;
                        dtbsVar3.a = i2 | 32;
                        dtbsVar3.f = j2;
                    }
                    str = Base64.encodeToString(bZ.bK().bS(), 10);
                }
                arrayList.add(new Pair(w, str));
                i++;
            } else {
                dqvj dqvjVar = amubVar.h;
                boolean z = afhvVar.d;
                Uri.Builder buildUpon = Uri.parse("http://maps.google.com/maps").buildUpon();
                int size = arrayList.size();
                buildUpon.appendQueryParameter("saddr", (String) ((Pair) arrayList.get(0)).first);
                String str2 = str;
                for (int i3 = 1; i3 < size; i3++) {
                    if (i3 > 1) {
                        str2 = String.valueOf(str2).concat(" to:");
                    }
                    String valueOf = String.valueOf(str2);
                    String valueOf2 = String.valueOf((String) ((Pair) arrayList.get(i3)).first);
                    str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                buildUpon.appendQueryParameter("daddr", str2);
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    if (!dbsj.d((String) ((Pair) arrayList.get(i5)).second)) {
                        i4++;
                    }
                }
                if (i4 > 0) {
                    for (int i6 = 0; i6 < size; i6++) {
                        String str3 = (String) ((Pair) arrayList.get(i6)).second;
                        if (i6 > 0 && i4 > 0) {
                            str = String.valueOf(str).concat(";");
                        }
                        if (!dbsj.d(str3)) {
                            String valueOf3 = String.valueOf(str);
                            String valueOf4 = String.valueOf(str3);
                            str = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                            i4--;
                            if (i4 == 0) {
                                break;
                            }
                        }
                    }
                    buildUpon.appendQueryParameter("geocode", str);
                }
                buildUpon.appendQueryParameter("dirflg", afhi.h(dqvjVar));
                if (z) {
                    buildUpon.appendQueryParameter("nav", "1");
                }
                try {
                    return new URL(buildUpon.build().toString());
                } catch (MalformedURLException e) {
                    bvoo.j(e);
                    return null;
                }
            }
        }
    }

    public static void b(StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
    }
}
