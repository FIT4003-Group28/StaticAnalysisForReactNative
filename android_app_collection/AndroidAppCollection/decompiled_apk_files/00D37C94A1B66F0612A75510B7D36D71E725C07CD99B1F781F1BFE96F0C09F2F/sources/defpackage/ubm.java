package defpackage;

import java.io.File;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ubm  reason: default package */
/* loaded from: classes4.dex */
public final class ubm {
    public final String a;
    public final File b;
    public final String c;
    public final ubt d;
    final boolean f;
    final boolean g;
    public final tsi k;
    public final vkd l;
    private ubl o;
    public final amwg e = amry.u();
    int h = 0;
    private boolean n = false;
    public twx m = null;
    public int i = -1;
    public final int j = -1;

    public ubm(ubt ubtVar, String str, File file, String str2, tsi tsiVar, vkd vkdVar) {
        this.o = ubl.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.k = tsiVar;
        this.d = ubtVar;
        this.l = vkdVar;
        boolean a = ubj.a(str);
        this.f = a;
        boolean d = d(str);
        this.g = d;
        if (d || a) {
            this.o = ubl.NONE;
        }
    }

    public static boolean d(String str) {
        return str.startsWith("file:");
    }

    public final synchronized ubl a() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.n = true;
    }

    public final synchronized boolean c() {
        return this.n;
    }

    public final void e(ubl ublVar) {
        if (this.g || this.f) {
            return;
        }
        this.o = ublVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ubm)) {
            return false;
        }
        ubm ubmVar = (ubm) obj;
        return akzj.f(this.a, ubmVar.a) && akzj.f(this.b, ubmVar.b) && akzj.f(this.c, ubmVar.c) && akzj.f(this.o, ubmVar.o) && this.n == ubmVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        ampp b = akzj.b(ubm.class);
        b.b("", this.a);
        b.b("targetDirectory", this.b);
        b.b("fileName", this.c);
        b.b("requiredConnectivity", this.o);
        b.g("canceled", this.n);
        return b.toString();
    }
}
