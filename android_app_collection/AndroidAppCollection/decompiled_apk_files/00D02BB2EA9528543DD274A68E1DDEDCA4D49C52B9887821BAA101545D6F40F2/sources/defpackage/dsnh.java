package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dsnh  reason: default package */
/* loaded from: classes.dex */
public final class dsnh {
    private static final dbrz b = dbrz.e("-");
    public final dsnj a;

    public dsnh() {
        this.a = dsnm.a();
    }

    public final void a() {
        this.a.a(dsne.SIZE);
    }

    public final void b(int i) {
        this.a.d(dsne.BORDER_COLOR, Integer.valueOf(i));
        this.a.c(dsne.BORDER_COLOR);
    }

    public final void c(int i) {
        this.a.d(dsne.BORDER_RADIUS, Integer.valueOf(i));
        this.a.c(dsne.BORDER_RADIUS);
    }

    public final void d() {
        this.a.d(dsne.CENTER_CROP, true);
        this.a.c(dsne.CENTER_CROP);
    }

    public final void e(boolean z) {
        this.a.d(dsne.CIRCLE_CROP, Boolean.valueOf(z));
        this.a.c(dsne.CIRCLE_CROP);
    }

    public final void f(int i) {
        this.a.d(dsne.HEIGHT, Integer.valueOf(i));
        this.a.c(dsne.HEIGHT);
    }

    public final void g(String str) {
        this.a.d(dsne.IMAGE_FILTER, str);
        this.a.c(dsne.IMAGE_FILTER);
    }

    public final void h() {
        this.a.d(dsne.MONOGRAM, true);
        this.a.c(dsne.MONOGRAM);
    }

    public final void i() {
        this.a.d(dsne.REQUEST_PNG, true);
        this.a.c(dsne.REQUEST_PNG);
    }

    public final void j() {
        this.a.d(dsne.SMART_CROP, true);
        this.a.c(dsne.SMART_CROP);
    }

    public final void k() {
        this.a.d(dsne.STRETCH, true);
        this.a.c(dsne.STRETCH);
    }

    public final void l(int i) {
        this.a.d(dsne.WIDTH, Integer.valueOf(i));
        this.a.c(dsne.WIDTH);
    }

    public final String m() {
        boolean z;
        String i;
        int i2;
        dsnj dsnjVar = this.a;
        String str = dsnjVar.a;
        Map<dsne, dsnf> map = dsnjVar.b;
        Map<dsne, dsnk> map2 = dsnjVar.c;
        if (map2.size() == 0) {
            if (str.isEmpty()) {
                return "";
            }
            String valueOf = String.valueOf(str);
            return valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<dsne, dsnf>> it = map.entrySet().iterator();
        Iterator<Map.Entry<dsne, dsnk>> it2 = map2.entrySet().iterator();
        Map.Entry<dsne, dsnf> next = it.hasNext() ? it.next() : null;
        Map.Entry<dsne, dsnk> next2 = it2.hasNext() ? it2.next() : null;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (next != null || next2 != null) {
                if (next2 == null) {
                    z = true;
                } else if (next == null) {
                    z = false;
                } else {
                    int compareTo = next.getKey().compareTo(next2.getKey());
                    z = compareTo < 0;
                    if (compareTo == 0) {
                        next = null;
                    }
                }
                if (z) {
                    dsnf value = next.getValue();
                    if (z2) {
                        int i5 = value.b;
                        if (i5 != i4 + 1) {
                            arrayList.add(str.substring(i3, i4));
                            i3 = value.b;
                            i2 = value.d;
                        } else {
                            i4 = i5 + value.d;
                            next = null;
                            z2 = true;
                        }
                    } else {
                        i3 = value.b;
                        i2 = value.d;
                    }
                    i4 = i2 + i3;
                    next = null;
                    z2 = true;
                } else {
                    dsne key = next2.getKey();
                    dsnk value2 = next2.getValue();
                    if (z2) {
                        arrayList.add(str.substring(i3, i4));
                    }
                    if (value2.a != null) {
                        boolean z3 = value2.b;
                        String str2 = key.aP;
                        dsnd dsndVar = dsnd.FIXED_LENGTH_BASE_64;
                        switch (key.aQ.ordinal()) {
                            case 0:
                                i = ddae.e.h().i(decn.e(((Long) next2.getValue().a).longValue()));
                                break;
                            case 1:
                                i = "";
                                break;
                            case 2:
                                i = ((String) next2.getValue().a).replace(';', ':');
                                break;
                            case 3:
                                i = ((Integer) next2.getValue().a).toString();
                                break;
                            case 4:
                                i = ((Long) next2.getValue().a).toString();
                                break;
                            case 5:
                                i = ((Float) next2.getValue().a).toString();
                                break;
                            case 6:
                                String valueOf2 = String.valueOf(String.format("%08x", Integer.valueOf(((Integer) next2.getValue().a).intValue())));
                                if (valueOf2.length() == 0) {
                                    i = new String("0x");
                                    break;
                                } else {
                                    i = "0x".concat(valueOf2);
                                    break;
                                }
                            default:
                                String valueOf3 = String.valueOf(key.aQ);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                                sb.append("OptionType ");
                                sb.append(valueOf3);
                                sb.append(" not handled.");
                                throw new IllegalStateException(sb.toString());
                        }
                        String valueOf4 = String.valueOf(str2);
                        String valueOf5 = String.valueOf(i);
                        arrayList.add(valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4));
                    }
                    next2 = null;
                    z2 = false;
                }
                if (next == null && it.hasNext()) {
                    next = it.next();
                }
                if (next2 == null && it2.hasNext()) {
                    next2 = it2.next();
                }
            } else {
                if (z2) {
                    arrayList.add(str.substring(i3, i4));
                }
                if (arrayList.isEmpty()) {
                    return "";
                }
                String valueOf6 = String.valueOf(b.g(arrayList));
                return valueOf6.length() != 0 ? "".concat(valueOf6) : new String("");
            }
        }
    }

    public dsnh(dsnm dsnmVar) {
        this.a = new dsnj(dsnmVar);
    }
}
