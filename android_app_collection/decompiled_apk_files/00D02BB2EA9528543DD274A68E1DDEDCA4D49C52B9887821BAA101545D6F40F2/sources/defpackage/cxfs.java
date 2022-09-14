package defpackage;
/* compiled from: PG */
/* renamed from: cxfs  reason: default package */
/* loaded from: classes5.dex */
public final class cxfs {
    public final String a;
    public final cxfi b;
    public final cxfp c;
    public final String d;
    public final boolean e;

    public cxfs(String str, String str2, cxfi cxfiVar, cxfp cxfpVar, boolean z) {
        dbsk.s(str2);
        this.d = str2;
        dbsk.s(cxfiVar);
        this.b = cxfiVar;
        dbsk.s(cxfpVar);
        this.c = cxfpVar;
        this.e = z;
        String valueOf = String.valueOf(str);
        this.a = valueOf.length() != 0 ? "com.google.android.libraries.performance.primes#".concat(valueOf) : new String("com.google.android.libraries.performance.primes#");
    }
}
