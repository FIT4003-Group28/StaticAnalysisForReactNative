package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: npm  reason: default package */
/* loaded from: classes7.dex */
public final class npm {
    private static final dcdc<npl> a = dcdc.m(new npl(bvjk.gj, 3), new npl(bvjk.gk, 3), new npl(bvjk.ec, 2), new npl(bvjk.ed, 2), new npl(bvjk.ee, 2), new npl(bvjk.ef, 2), new npl(bvjk.ea, 2), new npl(bvjk.eg, 2));

    static {
        dcdc.g(new npl(bvjk.jG, 3), new npl(bvjk.aS, 4));
        dcdc.h(new npl(bvjk.W, 3), new npl(bvjk.aq, 4), new npl(bvjk.kl, 2));
    }

    public static void a(bvjj bvjjVar, String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("CarGmmSettingsUtil:"));
        for (npl nplVar : a) {
            bvjk bvjkVar = nplVar.a;
            if (!bvjkVar.equals(bvjk.e) && !bvjkVar.equals(bvjk.f)) {
                if (!bvjjVar.i(bvjkVar)) {
                    String valueOf = String.valueOf(bvjkVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf).length());
                    sb.append(str);
                    sb.append("  ");
                    sb.append(valueOf);
                    sb.append(": not set");
                    printWriter.println(sb.toString());
                } else {
                    String valueOf2 = String.valueOf(bvjkVar);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(valueOf2).length());
                    sb2.append(str);
                    sb2.append("  ");
                    sb2.append(valueOf2);
                    sb2.append(": ");
                    printWriter.print(sb2.toString());
                    int i = nplVar.b - 1;
                    if (i == 1) {
                        printWriter.println(bvjjVar.w(bvjkVar, Long.MIN_VALUE));
                    } else if (i != 2) {
                        printWriter.println(bvjjVar.z(bvjkVar, "default value"));
                    } else {
                        printWriter.println(bvjjVar.m(bvjkVar, false));
                    }
                }
            }
        }
    }
}
