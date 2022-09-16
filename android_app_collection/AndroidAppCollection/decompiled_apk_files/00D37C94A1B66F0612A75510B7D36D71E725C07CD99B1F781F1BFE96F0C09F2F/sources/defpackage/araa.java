package defpackage;

import com.google.android.youtube.R;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: araa  reason: default package */
/* loaded from: classes2.dex */
public final class araa {
    public static int A(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static boolean B(sgt sgtVar, final List list, awsf awsfVar) {
        int i;
        awry awryVar;
        final NumberFormat v;
        awrx awrxVar;
        int i2 = 0;
        if (list.size() == sgtVar.a() && ((awsfVar.b != 2 || ((awry) awsfVar.c).b.size() == sgtVar.a()) && (i = awsfVar.d) != 4)) {
            if (i == 4) {
                awryVar = (awry) awsfVar.e;
            } else {
                awryVar = awry.a;
            }
            if (awryVar.b.size() == sgtVar.a()) {
                sgu sguVar = sgu.c;
                String str = awsfVar.f;
                shd shdVar = sgtVar.c;
                sho.g(sguVar, "key");
                shdVar.a.put(sguVar, str);
                int i3 = awsfVar.b;
                if (i3 == 2) {
                    sgtVar.f(sgq.f, new akrl(awsfVar, 1));
                } else {
                    if (i3 == 0) {
                        i2 = 4;
                    } else if (i3 == 5) {
                        i2 = 3;
                    } else if (i3 == 2) {
                        i2 = 1;
                    } else if (i3 == 3) {
                        i2 = 2;
                    }
                    int i4 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    if (i4 == 1) {
                        v = aqmv.v();
                    } else if (i4 == 2) {
                        if (i3 == 5) {
                            awrxVar = (awrx) awsfVar.c;
                        } else {
                            awrxVar = awrx.a;
                        }
                        v = aqmv.u(awrxVar.b);
                    } else {
                        v = DecimalFormat.getInstance(Locale.getDefault());
                    }
                    sgtVar.f(sgq.f, new sgp() { // from class: akrm
                        @Override // defpackage.sgp
                        public final Object a(Object obj, int i5, sgt sgtVar2) {
                            sgw sgwVar = (sgw) obj;
                            return v.format(list.get(i5));
                        }
                    });
                }
                sgtVar.f(sgq.g, new akrl(awsfVar));
                return true;
            }
        }
        return false;
    }

    public static void C(sar sarVar) {
        sarVar.setImportantForAccessibility(2);
    }

    public static void D(eo eoVar, dp dpVar) {
        ex l = eoVar.l();
        l.w(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
        l.y(R.id.element_fragment, dpVar);
        l.s();
        l.a();
    }

    public static int a(int i) {
        if (i != 0) {
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 14) {
                return 15;
            }
            if (i == 16) {
                return 17;
            }
            return i != 18 ? 0 : 19;
        }
        return 1;
    }

    public static int d(int i) {
        if (i != 0) {
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int e(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int i(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    public static int j(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    public static int k(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int l(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int G = arey.G(obj);
        int i4 = G & i;
        int m = m(obj3, i4);
        if (m == 0) {
            return -1;
        }
        int i5 = i(G, i);
        int i6 = -1;
        while (true) {
            i2 = m - 1;
            i3 = iArr[i2];
            if (i(i3, i) != i5 || !akzj.f(obj, objArr[i2]) || (objArr2 != null && !akzj.f(obj2, objArr2[i2]))) {
                int i7 = i3 & i;
                if (i7 == 0) {
                    return -1;
                }
                i6 = i2;
                m = i7;
            }
        }
        int i8 = i3 & i;
        if (i6 == -1) {
            o(obj3, i4, i8);
        } else {
            iArr[i6] = j(iArr[i6], i8, i);
        }
        return i2;
    }

    public static int m(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Object n(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void o(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static Collection p(Collection collection, ampt amptVar) {
        amptVar.getClass();
        return new amsg(collection, amptVar);
    }

    public static Collection q(Collection collection, ampg ampgVar) {
        return new amsh(collection, ampgVar);
    }

    public static boolean r(Collection collection, Collection collection2) {
        for (Object obj : collection2) {
            if (!collection.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean s(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void t(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 != null) {
        } else {
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf2);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
    }

    public static void u(boolean z) {
        aqxo.z(z, "no calls to next() since the last call to remove()");
    }

    public static void v(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object w(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
            return obj;
        }
        throw new amqw(aqxo.k("expected a non-null reference", objArr));
    }

    public static void x(boolean z) {
        if (z) {
            return;
        }
        throw new amqw();
    }

    public static void y(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new amqw(aqxo.k(str, obj));
    }

    public static int z(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }
}
