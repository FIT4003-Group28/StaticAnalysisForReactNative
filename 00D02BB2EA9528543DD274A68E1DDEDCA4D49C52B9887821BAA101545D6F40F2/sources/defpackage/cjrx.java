package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cjrx  reason: default package */
/* loaded from: classes4.dex */
public final class cjrx {
    private static final dcqe a = dcqe.c("cjrx");

    @Deprecated
    public static String a(int i) {
        ddxx bK;
        if (i == 0) {
            bK = null;
        } else {
            ddxw bZ = ddxx.j.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddxx ddxxVar = (ddxx) bZ.b;
            ddxxVar.a |= 8;
            ddxxVar.d = i;
            bK = bZ.bK();
        }
        return bK != null ? b(bK) : "";
    }

    public static String b(ddxx ddxxVar) {
        String str = (ddxxVar.a & 4) == 0 ? "0" : "2";
        String valueOf = String.valueOf(ddae.e.h().i(ddxxVar.bS()));
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    @dzsi
    public static ddxx c(@dzsi String str) {
        String[] split;
        if (str == null) {
            return null;
        }
        if (str.startsWith("0") || str.startsWith("2")) {
            String substring = str.substring(1);
            try {
                return (ddxx) dsqw.cq(ddxx.j, ddae.e.j(substring));
            } catch (dsrm unused) {
                return null;
            } catch (IllegalArgumentException e) {
                bvoo.h("Bad Base64 string: %s %s", substring, e);
                return null;
            }
        } else if (!str.startsWith("1")) {
            return null;
        } else {
            String substring2 = str.substring(1);
            ddxw bZ = ddxx.j.bZ();
            for (String str2 : substring2.split(",")) {
                if (str2.length() < 3 || str2.charAt(1) != ':') {
                    return null;
                }
                char charAt = str2.charAt(0);
                String substring3 = str2.substring(2);
                if (charAt == 'e') {
                    int parseInt = Integer.parseInt(substring3);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar = (ddxx) bZ.b;
                    ddxxVar.a |= 32;
                    ddxxVar.f = parseInt;
                } else if (charAt == 'i') {
                    int parseInt2 = Integer.parseInt(substring3);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar2 = (ddxx) bZ.b;
                    ddxxVar2.a |= 1;
                    ddxxVar2.b = parseInt2;
                } else if (charAt == 'p') {
                    ddxz e2 = cjra.e(substring3);
                    if (e2 == null) {
                        return null;
                    }
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar3 = (ddxx) bZ.b;
                    e2.getClass();
                    ddxxVar3.i = e2;
                    ddxxVar3.a |= 2048;
                } else if (charAt == 'y') {
                    int parseInt3 = Integer.parseInt(substring3);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    ddxx ddxxVar4 = (ddxx) bZ.b;
                    ddxxVar4.a |= 16;
                    ddxxVar4.e = parseInt3;
                } else {
                    switch (charAt) {
                        case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                            int parseInt4 = Integer.parseInt(substring3);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ddxx ddxxVar5 = (ddxx) bZ.b;
                            ddxxVar5.a |= 64;
                            ddxxVar5.g = parseInt4;
                            continue;
                        case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                            int parseInt5 = Integer.parseInt(substring3);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            ddxx ddxxVar6 = (ddxx) bZ.b;
                            ddxxVar6.a |= 128;
                            ddxxVar6.h = parseInt5;
                            continue;
                        case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                            try {
                                int parseInt6 = Integer.parseInt(substring3);
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                ddxx ddxxVar7 = (ddxx) bZ.b;
                                ddxxVar7.a |= 8;
                                ddxxVar7.d = parseInt6;
                                continue;
                            } catch (NumberFormatException unused2) {
                                return null;
                            }
                        default:
                            return bZ.bK();
                    }
                }
            }
            return bZ.bK();
        }
    }
}
