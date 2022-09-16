package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: ptv  reason: default package */
/* loaded from: classes4.dex */
public final class ptv extends psi {
    private static final Pattern a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern b = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder c;
    private final ArrayList d;

    public ptv() {
        super("SubripDecoder");
        this.c = new StringBuilder();
        this.d = new ArrayList();
    }

    static float s(int i) {
        if (i != 0) {
            if (i == 1) {
                return 0.5f;
            }
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            return 0.92f;
        }
        return 0.08f;
    }

    private static long t(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        ptx.a(group2);
        long parseLong2 = Long.parseLong(group2);
        String group3 = matcher.group(i + 3);
        ptx.a(group3);
        long parseLong3 = parseLong + (parseLong2 * 60000) + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.psi
    protected final psk g(byte[] bArr, int i, boolean z) {
        String str;
        char c;
        int i2;
        char c2;
        int i3;
        psg a2;
        ArrayList arrayList = new ArrayList();
        pwi pwiVar = new pwi();
        pwu pwuVar = new pwu(bArr, i);
        while (true) {
            String s = pwuVar.s();
            if (s != null) {
                if (s.length() != 0) {
                    try {
                        Integer.parseInt(s);
                        String s2 = pwuVar.s();
                        if (s2 == null) {
                            Log.w("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = a.matcher(s2);
                            if (matcher.matches()) {
                                pwiVar.b(t(matcher, 1));
                                pwiVar.b(t(matcher, 6));
                                this.c.setLength(0);
                                this.d.clear();
                                for (String s3 = pwuVar.s(); !TextUtils.isEmpty(s3); s3 = pwuVar.s()) {
                                    if (this.c.length() > 0) {
                                        this.c.append("<br>");
                                    }
                                    StringBuilder sb = this.c;
                                    ArrayList arrayList2 = this.d;
                                    String trim = s3.trim();
                                    StringBuilder sb2 = new StringBuilder(trim);
                                    Matcher matcher2 = b.matcher(trim);
                                    int i4 = 0;
                                    while (matcher2.find()) {
                                        String group = matcher2.group();
                                        arrayList2.add(group);
                                        int start = matcher2.start() - i4;
                                        int length = group.length();
                                        sb2.replace(start, start + length, "");
                                        i4 += length;
                                    }
                                    sb.append(sb2.toString());
                                }
                                Spanned fromHtml = Html.fromHtml(this.c.toString());
                                int i5 = 0;
                                while (true) {
                                    if (i5 < this.d.size()) {
                                        str = (String) this.d.get(i5);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i5++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                psf psfVar = new psf();
                                psfVar.a = fromHtml;
                                if (str == null) {
                                    a2 = psfVar.a();
                                } else {
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                c = 3;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620617:
                                            if (str.equals("{\\an4}")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620555:
                                            if (str.equals("{\\an6}")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    if (c == 0 || c == 1 || c == 2) {
                                        psfVar.g = 0;
                                        i2 = 0;
                                    } else if (c == 3 || c == 4 || c == 5) {
                                        psfVar.g = 2;
                                        i2 = 2;
                                    } else {
                                        psfVar.g = 1;
                                        i2 = 1;
                                    }
                                    switch (str.hashCode()) {
                                        case -685620710:
                                            if (str.equals("{\\an1}")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620679:
                                            if (str.equals("{\\an2}")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620648:
                                            if (str.equals("{\\an3}")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620524:
                                            if (str.equals("{\\an7}")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620493:
                                            if (str.equals("{\\an8}")) {
                                                c2 = 4;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -685620462:
                                            if (str.equals("{\\an9}")) {
                                                c2 = 5;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    if (c2 == 0 || c2 == 1 || c2 == 2) {
                                        i3 = 0;
                                        psfVar.e = 2;
                                    } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                        i3 = 0;
                                        psfVar.e = 0;
                                    } else {
                                        psfVar.e = 1;
                                        i3 = 0;
                                    }
                                    psfVar.f = s(i2);
                                    psfVar.b(s(psfVar.e), i3);
                                    a2 = psfVar.a();
                                }
                                arrayList.add(a2);
                                arrayList.add(psg.a);
                            } else {
                                Log.w("SubripDecoder", s2.length() != 0 ? "Skipping invalid timing: ".concat(s2) : new String("Skipping invalid timing: "));
                            }
                        }
                    } catch (NumberFormatException unused) {
                        Log.w("SubripDecoder", s.length() != 0 ? "Skipping invalid index: ".concat(s) : new String("Skipping invalid index: "));
                    }
                }
            }
        }
        return new ptw((psg[]) arrayList.toArray(new psg[0]), Arrays.copyOf(pwiVar.b, pwiVar.a));
    }
}
