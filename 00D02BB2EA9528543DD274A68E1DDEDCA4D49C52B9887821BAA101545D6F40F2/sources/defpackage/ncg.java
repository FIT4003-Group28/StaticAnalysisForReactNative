package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ncg  reason: default package */
/* loaded from: classes7.dex */
public final class ncg implements bwjw {
    public final dcdc<ldm> a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ncg(bvjj bvjjVar) {
        char c;
        dccx F = dcdc.F();
        for (String str : bvjjVar.F(bvjk.ar, dcdc.e())) {
            List<String> i = dbtm.a('|').i(str);
            int i2 = 6;
            if (i.size() >= 6) {
                String str2 = i.get(0);
                String str3 = i.get(1);
                String str4 = i.get(2);
                akqq a = akqv.a(i.get(3));
                akqi f = akqi.f(i.get(4));
                String str5 = i.get(5);
                if (i.size() == 7) {
                    String upperCase = i.get(6).toUpperCase(Locale.ROOT);
                    switch (upperCase.hashCode()) {
                        case -1850236827:
                            if (upperCase.equals("SHARED")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1179204385:
                            if (upperCase.equals("STARRED")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2223327:
                            if (upperCase.equals("HOME")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2670353:
                            if (upperCase.equals("WORK")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 853317742:
                            if (upperCase.equals("NICKNAME")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1398681149:
                            if (upperCase.equals("WANT_TO_GO")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1833417116:
                            if (upperCase.equals("FAVORITE")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 1:
                            i2 = 7;
                            break;
                        case 2:
                            i2 = 49;
                            break;
                        case 3:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 4091;
                            break;
                        case 5:
                            i2 = 4092;
                            break;
                        case 6:
                            i2 = 11;
                            break;
                    }
                    amvg P = amvh.P();
                    P.b = str2;
                    P.d = a;
                    P.c = f;
                    P.k = true;
                    P.j = str5;
                    F.g(new ldm(P.a(), str2, str3, str4, i2));
                }
                i2 = 3;
                amvg P2 = amvh.P();
                P2.b = str2;
                P2.d = a;
                P2.c = f;
                P2.k = true;
                P2.j = str5;
                F.g(new ldm(P2.a(), str2, str3, str4, i2));
            }
        }
        this.a = F.f();
    }

    @Override // defpackage.bwjw
    public final void a(bwnq bwnqVar) {
    }

    @Override // defpackage.bwjw
    public final void b() {
    }
}
