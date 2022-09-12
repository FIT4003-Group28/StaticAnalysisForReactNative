package defpackage;

import android.app.Application;
import android.text.Spannable;
import android.text.Spanned;
import android.text.SpannedString;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvsl  reason: default package */
/* loaded from: classes.dex */
public class bvsl {
    private final bvjj c;
    private final Application d;
    private final bvsx e;
    private final dowa f;
    private static final dcqe b = dcqe.c("bvsl");
    public static final int a = Math.round(91.44f);

    public bvsl(Application application, bvjj bvjjVar) {
        String string = application.getString(R.string.DA_DISTANCE_FORMAT_MODE);
        this.c = bvjjVar;
        this.d = application;
        if ("imperial".equalsIgnoreCase(string)) {
            this.f = dowa.MILES;
        } else if ("imperial_yards".equalsIgnoreCase(string)) {
            this.f = dowa.MILES_YARDS;
        } else {
            this.f = dowa.KILOMETERS;
        }
        this.e = new bvsx(application.getResources());
    }

    @dzsi
    public static dowa a(bvjj bvjjVar) {
        return (dowa) bvjjVar.H(bvjk.z, dowa.class, null);
    }

    public static int f(int i) {
        if (Math.abs(i) >= 1000) {
            return i < 0 ? 1 : 3;
        }
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.bvsq k(int r11, defpackage.dowa r12, boolean r13) {
        /*
            long r0 = (long) r11
            r2 = 32808(0x8028, double:1.62093E-319)
            long r0 = r0 * r2
            dowa r11 = defpackage.dowa.MILES_YARDS
            r2 = 5000(0x1388, double:2.4703E-320)
            r4 = 5020000(0x4c9960, double:2.4802095E-317)
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r12 != r11) goto L33
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 >= 0) goto L33
            r11 = 3
            long r0 = r0 / r11
            int r11 = (int) r0
            int r11 = r11 / 10000
            int r12 = r11 * 10000
            long r4 = (long) r12
            long r0 = r0 - r4
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 < 0) goto L25
            int r11 = r11 + 1
        L25:
            if (r13 == 0) goto L2d
            r12 = 10
            int r11 = n(r11, r12)
        L2d:
            int r6 = r11 * 1000
            bvsp r11 = defpackage.bvsp.YARDS
            goto La9
        L33:
            dowa r11 = defpackage.dowa.MILES
            if (r12 != r11) goto L55
            int r11 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r11 >= 0) goto L55
            int r11 = (int) r0
            int r11 = r11 / 10000
            int r12 = r11 * 10000
            long r4 = (long) r12
            long r0 = r0 - r4
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 < 0) goto L48
            int r11 = r11 + 1
        L48:
            if (r13 == 0) goto L50
            r12 = 50
            int r11 = n(r11, r12)
        L50:
            int r6 = r11 * 1000
            bvsp r11 = defpackage.bvsp.FEET
            goto La9
        L55:
            r11 = 50160000(0x2fd6180, double:2.4782333E-316)
            r13 = 5280000(0x509100, float:7.398856E-39)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L68
            int r11 = m(r0, r13)
            int r6 = r11 * 100
            bvsp r11 = defpackage.bvsp.MILES_P1
            goto La9
        L68:
            r11 = 52800000(0x325aa00, double:2.6086666E-316)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L72
            bvsp r11 = defpackage.bvsp.MILES_P1
            goto La9
        L72:
            long r2 = r0 / r11
            long r0 = r0 % r11
            r11 = 0
            r4 = 1
            r6 = 10
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L87
            r8 = 26400000(0x192d500, double:1.3043333E-316)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 < 0) goto L87
            goto L90
        L87:
            int r13 = m(r0, r13)
            long r0 = (long) r13
            int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r13 != 0) goto L92
        L90:
            long r2 = r2 + r4
            goto L93
        L92:
            r11 = r0
        L93:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r13 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r13 < 0) goto L9f
            long r2 = r2 * r0
            int r6 = (int) r2
            bvsp r11 = defpackage.bvsp.MILES
            goto La9
        L9f:
            long r2 = r2 * r0
            r0 = 100
            long r11 = r11 * r0
            long r2 = r2 + r11
            int r6 = (int) r2
            bvsp r11 = defpackage.bvsp.MILES_P1
        La9:
            bvsq r11 = defpackage.bvsq.d(r11, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvsl.k(int, dowa, boolean):bvsq");
    }

    private final Spannable l(bvsq bvsqVar, boolean z, @dzsi bvsw bvswVar, @dzsi bvsw bvswVar2) {
        bvsx bvsxVar = this.e;
        bvsp a2 = bvsqVar.a();
        dowa dowaVar = dowa.KILOMETERS;
        bvsp bvspVar = bvsp.METERS;
        int ordinal = a2.ordinal();
        int i = R.string.DA_DISTANCE_FORMAT_METERS_ABBREVIATED;
        switch (ordinal) {
            case 0:
                if (true != z) {
                    i = R.string.DA_DISTANCE_FORMAT_METERS_EXTENDED;
                    break;
                }
                break;
            case 1:
            case 2:
                if (true == z) {
                    i = R.string.DA_DISTANCE_FORMAT_KILOMETERS_ABBREVIATED;
                    break;
                } else {
                    i = R.string.DA_DISTANCE_FORMAT_KILOMETERS_EXTENDED;
                    break;
                }
            case 3:
            case 4:
                if (true == z) {
                    i = R.string.DA_DISTANCE_FORMAT_MILES_ABBREVIATED;
                    break;
                } else {
                    i = R.string.DA_DISTANCE_FORMAT_MILES_EXTENDED;
                    break;
                }
            case 5:
                if (true == z) {
                    i = R.string.DA_DISTANCE_FORMAT_YARDS_ABBREVIATED;
                    break;
                } else {
                    i = R.string.DA_DISTANCE_FORMAT_YARDS_EXTENDED;
                    break;
                }
            case 6:
                if (true == z) {
                    i = R.string.DA_DISTANCE_FORMAT_FEET_ABBREVIATED;
                    break;
                } else {
                    i = R.string.DA_DISTANCE_FORMAT_FEET_EXTENDED;
                    break;
                }
            default:
                bvoo.h("Unknown RoundedDistance.Units: %s", a2);
                break;
        }
        bvsu c = bvsxVar.c(i);
        if (bvswVar2 != null) {
            c.b(bvswVar2);
        }
        if (bvswVar != null) {
            bvsv a3 = this.e.a(bvsqVar.c());
            a3.e(bvswVar);
            c.a(a3);
        } else {
            c.a(bvsqVar.c());
        }
        return c.c();
    }

    private static int m(long j, int i) {
        return (int) ((((j << 8) + (i << 7)) / i) >> 8);
    }

    private static int n(int i, int i2) {
        return ((i + (i2 >> 1)) / i2) * i2;
    }

    public final dowa b(@dzsi dowa dowaVar) {
        dowa a2 = a(this.c);
        return a2 != null ? a2 : dowaVar != null ? (dowaVar == dowa.MILES && this.f == dowa.MILES_YARDS) ? this.f : dowaVar : this.f;
    }

    public final String c(int i, @dzsi dowa dowaVar, boolean z, boolean z2) {
        bvsq d = d(i, dowaVar, z);
        return d == null ? "" : l(d, z2, null, null).toString();
    }

    @dzsi
    public final bvsq d(int i, @dzsi dowa dowaVar, boolean z) {
        int m;
        bvsp bvspVar;
        if (i < 0) {
            return null;
        }
        dowa b2 = b(dowaVar);
        if (b2 != dowa.KILOMETERS) {
            if (b2 == dowa.MILES) {
                return k(i, dowa.MILES, z);
            }
            if (b2 != dowa.MILES_YARDS) {
                return null;
            }
            return k(i, dowa.MILES_YARDS, z);
        }
        int i2 = 10;
        int i3 = 1000;
        if (i < 975) {
            if (z) {
                if (i >= 300) {
                    i2 = 50;
                }
                i = n(i, i2);
            }
            i3 = i * 1000;
            bvspVar = bvsp.METERS;
        } else if (i <= 1000) {
            bvspVar = bvsp.KILOMETERS_P1;
        } else {
            String num = Integer.toString(i);
            int length = num.length() - 3;
            int i4 = 0;
            int parseInt = Integer.parseInt(num.substring(0, length));
            int parseInt2 = Integer.parseInt(num.substring(length));
            if ((parseInt < 10 || parseInt2 < 500) && (m = m(parseInt2, 100)) != 10) {
                i4 = m;
            } else {
                parseInt++;
            }
            if (parseInt >= 10) {
                i3 = parseInt * 1000;
                bvspVar = bvsp.KILOMETERS;
            } else {
                i3 = (parseInt * 1000) + (i4 * 100);
                bvspVar = bvsp.KILOMETERS_P1;
            }
        }
        return bvsq.d(bvspVar, i3);
    }

    public final CharSequence e(dowb dowbVar) {
        dowa dowaVar;
        if ((dowbVar.a & 4) != 0) {
            dowaVar = dowa.b(dowbVar.c);
            if (dowaVar == null) {
                dowaVar = dowa.REGIONAL;
            }
        } else {
            dowaVar = null;
        }
        dowa b2 = b(dowaVar);
        dowa dowaVar2 = dowa.KILOMETERS;
        bvsp bvspVar = bvsp.METERS;
        bvsu c = this.e.c(b2.ordinal() != 0 ? R.string.DA_DISTANCE_FORMAT_FEET_ABBREVIATED : R.string.DA_DISTANCE_FORMAT_METERS_ABBREVIATED);
        int i = dowbVar.b;
        if (b2.ordinal() != 0) {
            i = Math.round(i * 3.28084f);
        }
        c.a(Integer.toString(i));
        return c.c();
    }

    public final List<String> g(int i, boolean z, @dzsi dowa dowaVar, boolean z2) {
        String string;
        List<String> i2;
        String str = true != z2 ? "\n" : " ";
        new ArrayList();
        if (!z) {
            i2 = dchl.b(c(i, dowaVar, true, true));
        } else {
            dowa dowaVar2 = dowa.KILOMETERS;
            bvsp bvspVar = bvsp.METERS;
            int f = f(i) - 1;
            if (f == 0) {
                string = this.d.getResources().getString(cpi.DA_DISTANCE_RELATIVE_SHORTER, c(Math.abs(i), dowaVar, true, true), str);
            } else if (f != 1) {
                string = this.d.getResources().getString(cpi.DA_DISTANCE_RELATIVE_LONGER, c(Math.abs(i), dowaVar, true, true), str);
            } else {
                string = this.d.getResources().getString(cpi.DA_DISTANCE_RELATIVE_EQUIVALENT, str);
            }
            dbsk.s(string);
            i2 = dbtm.a('\n').i(string);
        }
        dbsk.l(!i2.isEmpty());
        return i2;
    }

    public final Spanned h(int i, @dzsi dowa dowaVar, @dzsi bvsw bvswVar, @dzsi bvsw bvswVar2) {
        bvsq d = d(i, dowaVar, true);
        if (d == null) {
            return new SpannedString("");
        }
        return l(d, true, bvswVar, bvswVar2);
    }

    public final String i(dowb dowbVar) {
        bvsq bvsqVar;
        Object l;
        dowa dowaVar;
        int i = dowbVar.a;
        if ((i & 1) != 0) {
            if ((i & 4) != 0) {
                dowaVar = dowa.b(dowbVar.c);
                if (dowaVar == null) {
                    dowaVar = dowa.REGIONAL;
                }
            } else {
                dowaVar = null;
            }
            bvsqVar = d(dowbVar.b, dowaVar, true);
        } else {
            bvsqVar = null;
        }
        if (bvsqVar == null) {
            l = new SpannedString("");
        } else {
            l = l(bvsqVar, true, null, null);
        }
        return l.toString();
    }

    public final CharSequence j(float f, @dzsi dowa dowaVar) {
        bvsu c;
        dowa b2 = b(dowaVar);
        float seconds = f * ((float) TimeUnit.HOURS.toSeconds(1L));
        dowa dowaVar2 = dowa.KILOMETERS;
        bvsp bvspVar = bvsp.METERS;
        int round = b2.ordinal() != 0 ? Math.round(seconds / 1609.344f) : Math.round(seconds / 1000.0f);
        if (b2.ordinal() == 0) {
            c = this.e.c(R.string.DA_SPEED_FORMAT_KILOMETERS_PER_HOUR_ABBREVIATED_NON_BREAKING);
        } else {
            c = this.e.c(R.string.DA_SPEED_FORMAT_MILES_PER_HOUR_ABBREVIATED);
        }
        c.a(Integer.toString(round));
        return c.c();
    }
}
