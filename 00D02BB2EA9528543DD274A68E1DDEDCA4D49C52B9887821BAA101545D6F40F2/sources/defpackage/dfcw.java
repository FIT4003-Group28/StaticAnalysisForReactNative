package defpackage;
/* compiled from: PG */
/* renamed from: dfcw  reason: default package */
/* loaded from: classes6.dex */
public final class dfcw {
    public static <ExtensionT extends dssj> dyhs<byte[]> a(dspy<dtro, ExtensionT> dspyVar) {
        int a = dspyVar.a();
        StringBuilder sb = new StringBuilder(26);
        sb.append("x-goog-ext-");
        sb.append(a);
        sb.append("-bin");
        return dyhs.c(sb.toString(), dyhw.a);
    }
}
