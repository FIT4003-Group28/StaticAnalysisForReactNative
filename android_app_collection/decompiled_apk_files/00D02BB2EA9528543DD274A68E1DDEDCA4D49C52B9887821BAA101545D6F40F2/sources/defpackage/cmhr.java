package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cmhr  reason: default package */
/* loaded from: classes5.dex */
public final class cmhr extends cmfy {
    private static final Pattern f = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern g = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder h = new StringBuilder();
    private final ArrayList<String> i = new ArrayList<>();

    static float n(int i) {
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

    private static long o(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        cmmn.f(group2);
        long parseLong2 = Long.parseLong(group2);
        String group3 = matcher.group(i + 3);
        cmmn.f(group3);
        long parseLong3 = parseLong + (parseLong2 * 60000) + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cmfy
    protected final cmga m(byte[] bArr, int i, boolean z) {
        String str;
        char c;
        int i2;
        char c2;
        int i3;
        cmfw a;
        ArrayList arrayList = new ArrayList();
        cmnb cmnbVar = new cmnb();
        cmnk cmnkVar = new cmnk(bArr, i);
        while (true) {
            String C = cmnkVar.C();
            if (C != null) {
                if (C.length() != 0) {
                    String C2 = cmnkVar.C();
                    if (C2 != null) {
                        Matcher matcher = f.matcher(C2);
                        if (matcher.matches()) {
                            cmnbVar.a(o(matcher, 1));
                            cmnbVar.a(o(matcher, 6));
                            this.h.setLength(0);
                            this.i.clear();
                            for (String C3 = cmnkVar.C(); !TextUtils.isEmpty(C3); C3 = cmnkVar.C()) {
                                if (this.h.length() > 0) {
                                    this.h.append("<br>");
                                }
                                StringBuilder sb = this.h;
                                ArrayList<String> arrayList2 = this.i;
                                String trim = C3.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = g.matcher(trim);
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
                            Spanned fromHtml = Html.fromHtml(this.h.toString());
                            int i5 = 0;
                            while (true) {
                                if (i5 < this.i.size()) {
                                    str = this.i.get(i5);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i5++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            cmfv cmfvVar = new cmfv();
                            cmfvVar.a = fromHtml;
                            if (str == null) {
                                a = cmfvVar.a();
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
                                    cmfvVar.f = 0;
                                    i2 = 0;
                                } else if (c == 3 || c == 4 || c == 5) {
                                    cmfvVar.f = 2;
                                    i2 = 2;
                                } else {
                                    cmfvVar.f = 1;
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
                                    cmfvVar.d = 2;
                                } else if (c2 == 3 || c2 == 4 || c2 == 5) {
                                    i3 = 0;
                                    cmfvVar.d = 0;
                                } else {
                                    cmfvVar.d = 1;
                                    i3 = 0;
                                }
                                cmfvVar.e = n(i2);
                                cmfvVar.b(n(cmfvVar.d), i3);
                                a = cmfvVar.a();
                            }
                            arrayList.add(a);
                            arrayList.add(cmfw.a);
                        } else if (C2.length() == 0) {
                            new String("Skipping invalid timing: ");
                        }
                    }
                }
            }
        }
        return new cmhs((cmfw[]) arrayList.toArray(new cmfw[0]), Arrays.copyOf(cmnbVar.b, cmnbVar.a));
    }
}
