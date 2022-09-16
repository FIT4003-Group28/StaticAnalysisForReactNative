package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: aggw  reason: default package */
/* loaded from: classes.dex */
public class aggw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i) {
        return i != 0 ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static agvx g(agrf agrfVar, String str) {
        if (!TextUtils.equals(agrfVar.d(), str)) {
            return null;
        }
        return agrfVar.a();
    }

    public static void h(yjs yjsVar) {
        yjsVar.e("offline_transfer_keep_alive", 0L, false, 1, null, null, false);
    }

    public static void i(agfs agfsVar) {
        ylr.c();
        Collection<agfo> c = agfsVar.c();
        String.format(Locale.US, "There are %d active GCM topic subscriptions:", Integer.valueOf(c.size()));
        for (agfo agfoVar : c) {
            j(agfoVar, true);
        }
    }

    public static boolean k() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? "UNSUBSCRIBE" : "SUBSCRIBE";
    }

    public static double m(double d) {
        double d2 = (((((((((((4.30638E-5d * d) + 2.765672E-4d) * d) + 1.520143E-4d) * d) + 0.0092705272d) * d) + 0.0422820123d) * d) + 0.0705230784d) * d) + 1.0d;
        double d3 = d2 * d2;
        double d4 = d3 * d3;
        double d5 = d4 * d4;
        return 1.0d - (1.0d / (d5 * d5));
    }

    public static double n(double d) {
        double d2;
        double d3;
        double d4 = -Math.log1p((-d) * d);
        if (d4 < 5.0d) {
            double d5 = d4 - 2.5d;
            d2 = ((((((((((((((2.81022636E-8d * d5) + 3.43273939E-7d) * d5) - 3.5233877E-6d) * d5) - 4.39150654E-6d) * d5) + 2.1858087E-4d) * d5) - 0.00125372503d) * d5) - 0.00417768164d) * d5) + 0.246640727d) * d5;
            d3 = 1.50140941d;
        } else {
            double sqrt = Math.sqrt(d4) - 3.0d;
            d2 = (((((((((((((((-2.00214257E-4d) * sqrt) + 1.00950558E-4d) * sqrt) + 0.00134934322d) * sqrt) - 0.00367342844d) * sqrt) + 0.00573950773d) * sqrt) - 0.0076224613d) * sqrt) + 0.00943887047d) * sqrt) + 1.00167406d) * sqrt;
            d3 = 2.83297682d;
        }
        return (d2 + d3) * d;
    }

    public static asv o(afjm afjmVar) {
        return afjmVar.a();
    }

    public static int[] p(ave aveVar, afbk afbkVar) {
        ArrayList arrayList = new ArrayList();
        List list = aveVar.a().b;
        for (int i = 0; i < list.size(); i++) {
            if (((afzp) list.get(i)).b == afbkVar.a) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public afbi a(String str, PlayerConfigModel playerConfigModel, aetv aetvVar, VideoStreamingData videoStreamingData, int i) {
        return null;
    }

    public void c(afnh afnhVar) {
    }

    public void d(auz auzVar) {
    }

    public static void j(agfo agfoVar, boolean z) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = true != z ? "" : "    ";
        objArr[1] = agfoVar.b;
        int i = agfoVar.h;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNSUBSCRIBED" : "UNSUBSCRIBING" : "SUBSCRIBED" : "SUBSCRIBING";
        if (i == 0) {
            throw null;
        }
        objArr[2] = str;
        objArr[3] = Integer.valueOf(agfoVar.c.size());
        String.format(locale, "%s%s: %s - %d subscribers", objArr);
    }
}
