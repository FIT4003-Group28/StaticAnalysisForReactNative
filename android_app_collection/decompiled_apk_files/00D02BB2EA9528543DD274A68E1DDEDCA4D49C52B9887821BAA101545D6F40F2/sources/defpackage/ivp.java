package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ivp  reason: default package */
/* loaded from: classes6.dex */
public class ivp implements iyy {
    private final LinkedList<iyx> a = new LinkedList<>();
    private final String b;

    public ivp(Context context, int i, String str) {
        double d;
        boolean z;
        boolean z2;
        int a;
        i = i < 0 ? 0 : i;
        this.b = str;
        RoundingMode roundingMode = RoundingMode.CEILING;
        debb.e(i);
        byte b = deay.a[Integer.numberOfLeadingZeros(i)];
        int a2 = b - deay.a(i, deay.b[b]);
        int i2 = deay.b[a2];
        switch (deax.a[roundingMode.ordinal()]) {
            case 1:
                debb.a(i == i2);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                a = deay.a(i2, i);
                a2 += a;
                break;
            case 6:
            case 7:
            case 8:
                a = deay.a(deay.c[a2], i);
                a2 += a;
                break;
            default:
                throw new AssertionError();
        }
        int max = Math.max(3, Math.min(a2, 5));
        double d2 = i;
        double pow = Math.pow(10.0d, max);
        i = d2 >= pow ? ((int) Math.pow(10.0d, d)) - 1 : i;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMinimumIntegerDigits(max);
        String format = numberFormat.format(i);
        if (d2 >= pow) {
            String string = context.getString(R.string.BIGGER_THAN_NUMBER, format);
            z2 = string.endsWith(format);
            boolean startsWith = string.startsWith(format);
            format = string;
            z = startsWith;
        } else {
            z = false;
            z2 = false;
        }
        int i3 = 0;
        while (i3 < format.length()) {
            if (i3 == 0) {
                if (z2) {
                    this.a.add(new ivo(format.substring(0, 2)));
                    i3 = 2;
                } else {
                    i3 = 0;
                }
            }
            if (i3 != format.length() - 2 || !z) {
                if (Character.isDigit(format.charAt(i3))) {
                    this.a.add(new ivo(String.valueOf(format.charAt(i3))));
                }
                i3++;
            } else {
                this.a.add(new ivo(format.substring(i3, format.length())));
                i3 += 2;
            }
        }
    }

    @Override // defpackage.iyy
    public List<iyx> a() {
        return this.a;
    }

    @Override // defpackage.iyy
    public String b() {
        return this.b;
    }

    @Override // defpackage.iyy
    public Boolean c() {
        return Boolean.valueOf(!dbsj.d(this.b));
    }
}
