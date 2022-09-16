package defpackage;

import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kth  reason: default package */
/* loaded from: classes7.dex */
public final class kth implements btph {
    private final bvjj a;
    private final crzo<Boolean> b = new crzo<>(false);

    public kth(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("ProjectedAmbientStyleProvider:"));
        String valueOf = String.valueOf(a().l());
        StringBuilder sb = new StringBuilder(str.length() + 26 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("  shouldShowAmbientMap(): ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
        String valueOf2 = String.valueOf(b().l());
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + String.valueOf(valueOf2).length());
        sb2.append(str);
        sb2.append("  shouldShowAmbientUI(): ");
        sb2.append(valueOf2);
        printWriter.println(sb2.toString());
        String valueOf3 = String.valueOf((ksc) this.a.H(bvjk.aU, ksc.class, ksc.AUTO));
        StringBuilder sb3 = new StringBuilder(str.length() + 26 + String.valueOf(valueOf3).length());
        sb3.append(str);
        sb3.append("  getForcedAmbientness(): ");
        sb3.append(valueOf3);
        printWriter.println(sb3.toString());
    }

    public final crzm<Boolean> a() {
        return this.b.a;
    }

    public final crzm<Boolean> b() {
        return this.b.a;
    }
}
