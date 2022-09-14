package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.aq;
import com.facebook.react.bridge.ar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongycastle.asn1.eac.EACTags;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropHelper.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4918a = Pattern.compile("^(-?\\d+(?:\\.\\d+)?)%$");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(com.facebook.react.bridge.am amVar, float[] fArr, float f) {
        int size = amVar.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) amVar.getDouble(0);
        fArr[1] = (float) amVar.getDouble(2);
        fArr[2] = ((float) amVar.getDouble(4)) * f;
        fArr[3] = (float) amVar.getDouble(1);
        fArr[4] = (float) amVar.getDouble(3);
        fArr[5] = ((float) amVar.getDouble(5)) * f;
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static double a(String str, double d2, double d3, double d4, double d5) {
        char c2;
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length == 0 || trim.equals("normal")) {
            return d3;
        }
        if (trim.codePointAt(i) == 37) {
            return ((Double.valueOf(trim.substring(0, i)).doubleValue() / 100.0d) * d2) + d3;
        }
        int i2 = length - 2;
        if (i2 > 0) {
            String substring = trim.substring(i2);
            int hashCode = substring.hashCode();
            if (hashCode == 3178) {
                if (substring.equals("cm")) {
                    c2 = 5;
                }
                c2 = 65535;
            } else if (hashCode == 3240) {
                if (substring.equals("em")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode == 3365) {
                if (substring.equals("in")) {
                    c2 = 6;
                }
                c2 = 65535;
            } else if (hashCode == 3488) {
                if (substring.equals("mm")) {
                    c2 = 4;
                }
                c2 = 65535;
            } else if (hashCode == 3571) {
                if (substring.equals("pc")) {
                    c2 = 3;
                }
                c2 = 65535;
            } else if (hashCode != 3588) {
                if (hashCode == 3592 && substring.equals("px")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (substring.equals("pt")) {
                    c2 = 2;
                }
                c2 = 65535;
            }
            switch (c2) {
                case 0:
                    d5 = 1.0d;
                    break;
                case 1:
                    break;
                case 2:
                    d5 = 1.25d;
                    break;
                case 3:
                    d5 = 15.0d;
                    break;
                case 4:
                    d5 = 3.543307d;
                    break;
                case 5:
                    d5 = 35.43307d;
                    break;
                case 6:
                    d5 = 90.0d;
                    break;
                default:
                    i2 = length;
                    d5 = 1.0d;
                    break;
            }
            return (Double.valueOf(trim.substring(0, i2)).doubleValue() * d5 * d4) + d3;
        }
        return (Double.valueOf(trim).doubleValue() * d4) + d3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        return f4918a.matcher(str).matches();
    }

    /* compiled from: PropHelper.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f4919a = Pattern.compile("[a-df-z]|[\\-+]?(?:[\\d.]e[\\-+]?|[^\\s\\-+,a-z])+", 2);

        /* renamed from: b  reason: collision with root package name */
        private static final Pattern f4920b = Pattern.compile("(\\.\\d+)(?=-?\\.)");

        /* renamed from: c  reason: collision with root package name */
        private Matcher f4921c;

        /* renamed from: d  reason: collision with root package name */
        private Path f4922d;
        private final String e;
        private float h;
        private float i;
        private float l;
        private String o;
        private String p;
        private aq q;
        private ar r;
        private float f = BitmapDescriptorFactory.HUE_RED;
        private float g = BitmapDescriptorFactory.HUE_RED;
        private float j = BitmapDescriptorFactory.HUE_RED;
        private float k = BitmapDescriptorFactory.HUE_RED;
        private boolean m = true;
        private boolean n = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(String str, float f) {
            this.l = 1.0f;
            this.l = f;
            this.e = str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private void a(String str) {
            char c2;
            switch (str.hashCode()) {
                case 65:
                    if (str.equals("A")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 67:
                    if (str.equals("C")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 72:
                    if (str.equals("H")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 76:
                    if (str.equals("L")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 77:
                    if (str.equals(Gender.MALE)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 81:
                    if (str.equals("Q")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 83:
                    if (str.equals("S")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 84:
                    if (str.equals("T")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 86:
                    if (str.equals("V")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 90:
                    if (str.equals("Z")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 97:
                    if (str.equals("a")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99:
                    if (str.equals("c")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 104:
                    if (str.equals("h")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108:
                    if (str.equals("l")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109:
                    if (str.equals("m")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 113:
                    if (str.equals("q")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 115:
                    if (str.equals("s")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 116:
                    if (str.equals("t")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 118:
                    if (str.equals("v")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case EACTags.SECURITY_SUPPORT_TEMPLATE /* 122 */:
                    if (str.equals("z")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    b(c(), c());
                    break;
                case 1:
                    c(c(), c());
                    break;
                case 2:
                    d(c(), c());
                    break;
                case 3:
                    e(c(), c());
                    break;
                case 4:
                    d(c(), BitmapDescriptorFactory.HUE_RED);
                    break;
                case 5:
                    e(c(), this.g);
                    break;
                case 6:
                    d(BitmapDescriptorFactory.HUE_RED, c());
                    break;
                case 7:
                    e(this.f, c());
                    break;
                case '\b':
                    a(c(), c(), c(), c(), c(), c());
                    break;
                case '\t':
                    b(c(), c(), c(), c(), c(), c());
                    break;
                case '\n':
                    a(c(), c(), c(), c());
                    break;
                case 11:
                    b(c(), c(), c(), c());
                    break;
                case '\f':
                    c(c(), c(), c(), c());
                    break;
                case '\r':
                    d(c(), c(), c(), c());
                    break;
                case 14:
                    f(c(), c());
                    break;
                case 15:
                    g(c(), c());
                    break;
                case 16:
                    a(c(), c(), c(), b(), b(), c(), c());
                    break;
                case 17:
                    b(c(), c(), c(), b(), b(), c(), c());
                    break;
                case 18:
                case 19:
                    d();
                    break;
                default:
                    this.p = str;
                    a(this.o);
                    return;
            }
            this.o = str;
            if (str.equals("m")) {
                this.o = "l";
            } else if (!str.equals(Gender.MALE)) {
            } else {
                this.o = "L";
            }
        }

        public Path a() {
            this.f4922d = new Path();
            this.q = com.facebook.react.bridge.b.a();
            this.f4921c = f4919a.matcher(f4920b.matcher(this.e).replaceAll("$1,"));
            while (this.f4921c.find() && this.m) {
                a(this.f4921c.group());
            }
            return this.f4922d;
        }

        private ar a(float f, float f2) {
            ar b2 = com.facebook.react.bridge.b.b();
            b2.putDouble("x", f * this.l);
            b2.putDouble("y", f2 * this.l);
            return b2;
        }

        private ar a(ar arVar) {
            ar b2 = com.facebook.react.bridge.b.b();
            b2.putDouble("x", arVar.getDouble("x"));
            b2.putDouble("y", arVar.getDouble("y"));
            return b2;
        }

        private boolean b() {
            if (this.f4921c.find()) {
                return this.f4921c.group().equals("1");
            }
            this.m = false;
            this.f4922d = new Path();
            return false;
        }

        private float c() {
            if (this.p != null) {
                String str = this.p;
                this.p = null;
                return Float.parseFloat(str);
            } else if (this.f4921c.find()) {
                return Float.parseFloat(this.f4921c.group());
            } else {
                this.m = false;
                this.f4922d = new Path();
                return BitmapDescriptorFactory.HUE_RED;
            }
        }

        private void b(float f, float f2) {
            c(f + this.f, f2 + this.g);
        }

        private void c(float f, float f2) {
            this.f = f;
            this.j = f;
            this.g = f2;
            this.k = f2;
            this.f4922d.moveTo(this.l * f, this.l * f2);
            this.r = a(f, f2);
            aq a2 = com.facebook.react.bridge.b.a();
            a2.a(a(f, f2));
            this.q.a(a2);
        }

        private void d(float f, float f2) {
            e(f + this.f, f2 + this.g);
        }

        private void e(float f, float f2) {
            e();
            this.f = f;
            this.j = f;
            this.g = f2;
            this.k = f2;
            this.f4922d.lineTo(this.l * f, this.l * f2);
            aq a2 = com.facebook.react.bridge.b.a();
            a2.a(a(f, f2));
            a2.a(a(f, f2));
            a2.a(a(f, f2));
            this.q.a(a2);
        }

        private void a(float f, float f2, float f3, float f4, float f5, float f6) {
            b(f + this.f, f2 + this.g, f3 + this.f, f4 + this.g, f5 + this.f, f6 + this.g);
        }

        private void b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.j = f3;
            this.k = f4;
            c(f, f2, f3, f4, f5, f6);
        }

        private void c(float f, float f2, float f3, float f4, float f5, float f6) {
            e();
            this.f = f5;
            this.g = f6;
            this.f4922d.cubicTo(this.l * f, this.l * f2, this.l * f3, this.l * f4, this.l * f5, this.l * f6);
            aq a2 = com.facebook.react.bridge.b.a();
            a2.a(a(f, f2));
            a2.a(a(f3, f4));
            a2.a(a(f5, f6));
            this.q.a(a2);
        }

        private void a(float f, float f2, float f3, float f4) {
            b(f + this.f, f2 + this.g, f3 + this.f, f4 + this.g);
        }

        private void b(float f, float f2, float f3, float f4) {
            this.j = f;
            this.k = f2;
            c((this.f * 2.0f) - this.j, (this.g * 2.0f) - this.k, f, f2, f3, f4);
        }

        private void c(float f, float f2, float f3, float f4) {
            d(f + this.f, f2 + this.g, f3 + this.f, f4 + this.g);
        }

        private void d(float f, float f2, float f3, float f4) {
            this.j = f;
            this.k = f2;
            float f5 = f * 2.0f;
            float f6 = f2 * 2.0f;
            float f7 = (this.f + f5) / 3.0f;
            float f8 = (this.g + f6) / 3.0f;
            c(f7, f8, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
        }

        private void f(float f, float f2) {
            g(f + this.f, f2 + this.g);
        }

        private void g(float f, float f2) {
            d((this.f * 2.0f) - this.j, (this.g * 2.0f) - this.k, f, f2);
        }

        private void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            b(f, f2, f3, z, z2, f4 + this.f, f5 + this.g);
        }

        private void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12 = this.f;
            float f13 = this.g;
            float abs = Math.abs(f2 == BitmapDescriptorFactory.HUE_RED ? f == BitmapDescriptorFactory.HUE_RED ? f5 - f13 : f : f2);
            float abs2 = Math.abs(f == BitmapDescriptorFactory.HUE_RED ? f4 - f12 : f);
            if (abs2 == BitmapDescriptorFactory.HUE_RED || abs == BitmapDescriptorFactory.HUE_RED || (f4 == f12 && f5 == f13)) {
                e(f4, f5);
                return;
            }
            float radians = (float) Math.toRadians(f3);
            double d2 = radians;
            float cos = (float) Math.cos(d2);
            float sin = (float) Math.sin(d2);
            float f14 = f4 - f12;
            float f15 = f5 - f13;
            float f16 = ((cos * f14) / 2.0f) + ((sin * f15) / 2.0f);
            float f17 = -sin;
            float f18 = ((f17 * f14) / 2.0f) + ((cos * f15) / 2.0f);
            float f19 = abs2 * abs2;
            float f20 = abs * abs * f16 * f16;
            if ((((f19 * abs) * abs) - ((f19 * f18) * f18)) - f20 < BitmapDescriptorFactory.HUE_RED) {
                float sqrt = (float) Math.sqrt(1.0f - (f8 / f6));
                abs *= sqrt;
                f9 = f14 / 2.0f;
                f10 = abs2 * sqrt;
                f11 = f15 / 2.0f;
            } else {
                float sqrt2 = (float) Math.sqrt(f8 / (f7 + f20));
                if (z == z2) {
                    sqrt2 = -sqrt2;
                }
                float f21 = (((-sqrt2) * f18) * abs2) / abs;
                float f22 = ((sqrt2 * f16) * abs) / abs2;
                f9 = ((cos * f21) - (sin * f22)) + (f14 / 2.0f);
                f10 = abs2;
                f11 = (f15 / 2.0f) + (f21 * sin) + (f22 * cos);
            }
            float f23 = cos / f10;
            float f24 = sin / f10;
            float f25 = f17 / abs;
            float f26 = cos / abs;
            float f27 = -f9;
            float f28 = -f11;
            float f29 = abs;
            float f30 = f10;
            float atan2 = (float) Math.atan2((f25 * f27) + (f26 * f28), (f27 * f23) + (f28 * f24));
            float f31 = f14 - f9;
            float f32 = f15 - f11;
            float atan22 = (float) Math.atan2((f25 * f31) + (f26 * f32), (f23 * f31) + (f24 * f32));
            float f33 = f9 + f12;
            float f34 = f11 + f13;
            float f35 = f14 + f12;
            float f36 = f15 + f13;
            e();
            this.j = f35;
            this.f = f35;
            this.k = f36;
            this.g = f36;
            if (f30 != f29 || radians != BitmapDescriptorFactory.HUE_RED) {
                a(f33, f34, f30, f29, atan2, atan22, z2, radians);
                return;
            }
            float degrees = (float) Math.toDegrees(atan2);
            float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
            if (z) {
                if (abs3 < 180.0f) {
                    abs3 = 360.0f - abs3;
                }
            } else if (abs3 > 180.0f) {
                abs3 = 360.0f - abs3;
            }
            if (!z2) {
                abs3 = -abs3;
            }
            this.f4922d.arcTo(new RectF((f33 - f30) * this.l, (f34 - f30) * this.l, (f33 + f30) * this.l, (f34 + f30) * this.l), degrees, abs3);
        }

        private void d() {
            if (this.n) {
                this.f = this.h;
                this.g = this.i;
                this.n = false;
                this.f4922d.close();
                aq a2 = com.facebook.react.bridge.b.a();
                a2.a(a(this.r));
                a2.a(a(this.r));
                a2.a(a(this.r));
                this.q.a(a2);
            }
        }

        private void a(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7) {
            float f8 = f5;
            double d2 = f7;
            float cos = (float) Math.cos(d2);
            float sin = (float) Math.sin(d2);
            float f9 = cos * f3;
            float f10 = (-sin) * f4;
            float f11 = sin * f3;
            float f12 = cos * f4;
            float f13 = f6 - f8;
            if (f13 < BitmapDescriptorFactory.HUE_RED && z) {
                f13 = (float) (f13 + 6.283185307179586d);
            } else if (f13 > BitmapDescriptorFactory.HUE_RED && !z) {
                f13 = (float) (f13 - 6.283185307179586d);
            }
            int ceil = (int) Math.ceil(Math.abs(f13 / 1.5707963267948966d));
            float f14 = f13 / ceil;
            float tan = ((float) Math.tan(f14 / 4.0f)) * 1.0f;
            double d3 = f8;
            float cos2 = (float) Math.cos(d3);
            float sin2 = (float) Math.sin(d3);
            int i = 0;
            while (i < ceil) {
                float f15 = cos2 - (tan * sin2);
                float f16 = sin2 + (cos2 * tan);
                float f17 = f8 + f14;
                float f18 = f14;
                int i2 = ceil;
                double d4 = f17;
                cos2 = (float) Math.cos(d4);
                float sin3 = (float) Math.sin(d4);
                float f19 = (tan * sin3) + cos2;
                float f20 = sin3 - (tan * cos2);
                this.f4922d.cubicTo((f + (f9 * f15) + (f10 * f16)) * this.l, (f2 + (f15 * f11) + (f16 * f12)) * this.l, (f + (f9 * f19) + (f10 * f20)) * this.l, (f2 + (f19 * f11) + (f20 * f12)) * this.l, (f + (f9 * cos2) + (f10 * sin3)) * this.l, (f2 + (f11 * cos2) + (f12 * sin3)) * this.l);
                i++;
                sin2 = sin3;
                ceil = i2;
                f14 = f18;
                f8 = f17;
                tan = tan;
            }
        }

        private void e() {
            if (!this.n) {
                this.h = this.f;
                this.i = this.g;
                this.n = true;
            }
        }
    }
}
