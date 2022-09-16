package defpackage;

import java.util.Locale;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: axhb  reason: default package */
/* loaded from: classes2.dex */
public final class axhb extends axgz {
    private double c = 0.0d;
    private double d = 0.0d;
    private int e = 0;

    private final double e() {
        double d = this.e;
        Double.isNaN(d);
        return Math.pow(4.0d, d / 20.0d);
    }

    private final void f(boolean z) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = true != z ? "undershooting" : "overshooting";
        objArr[1] = Double.valueOf(e());
        objArr[2] = Integer.valueOf(this.b);
        objArr[3] = Integer.valueOf(this.a / 1000);
        Logging.a("IMCDynamicBitrate", String.format(locale, "Encoder is %s. Scale bitrate by %.2f. Fps: %d, Kbps: %d", objArr));
    }

    @Override // defpackage.axgz
    public final synchronized int a() {
        double d;
        double e;
        d = this.a;
        e = e();
        Double.isNaN(d);
        return (int) (d * e);
    }

    @Override // defpackage.axgz
    public final synchronized void c(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return;
        }
        double d = this.a;
        Double.isNaN(d);
        double d2 = d / 8.0d;
        double d3 = i2;
        double d4 = this.c;
        double d5 = i;
        Double.isNaN(d3);
        Double.isNaN(d5);
        double d6 = d4 + (d5 - (d2 / d3));
        this.c = d6;
        double d7 = this.d;
        Double.isNaN(d3);
        this.d = d7 + (1000.0d / d3);
        double d8 = 3.0d * d2;
        double min = Math.min(d6, d8);
        this.c = min;
        double max = Math.max(min, -d8);
        this.c = max;
        if (this.d <= 3000.0d) {
            return;
        }
        if (max > d2) {
            int i3 = this.e - ((int) ((max / d2) + 0.5d));
            this.e = i3;
            this.e = Math.max(i3, -20);
            this.c = d2;
            f(true);
        } else {
            double d9 = -d2;
            if (max < d9) {
                int i4 = this.e + ((int) (((-max) / d2) + 0.5d));
                this.e = i4;
                this.e = Math.min(i4, 20);
                this.c = d9;
                f(false);
            }
        }
        this.d = 0.0d;
    }

    @Override // defpackage.axgz
    public final synchronized void d(int i, int i2) {
        int i3 = this.a;
        if (i3 > 0 && i < i3) {
            double d = this.c;
            double d2 = i;
            Double.isNaN(d2);
            double d3 = d * d2;
            double d4 = i3;
            Double.isNaN(d4);
            this.c = d3 / d4;
        }
        super.d(i, i2);
    }
}
