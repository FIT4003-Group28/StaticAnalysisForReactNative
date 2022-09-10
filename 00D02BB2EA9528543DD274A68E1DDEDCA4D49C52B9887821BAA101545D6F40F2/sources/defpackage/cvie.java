package defpackage;

import java.io.File;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cvie  reason: default package */
/* loaded from: classes5.dex */
public final class cvie {
    public final String a;
    public final File b;
    public final String c;
    public final cvib d;
    public final cvip e;
    final boolean g;
    final boolean h;
    private final cvin m;
    private cvid o;
    final dcha<String, String> f = dbyv.N();
    int i = 0;
    private boolean n = false;
    @dzsi
    public cvic j = null;
    public final int k = -1;
    public final int l = -1;

    public cvie(cvin cvinVar, String str, File file, String str2, cvib cvibVar, cvip cvipVar) {
        this.o = cvid.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.d = cvibVar;
        this.m = cvinVar;
        this.e = cvipVar;
        boolean a = cvhx.a(str);
        this.g = a;
        boolean a2 = a(str);
        this.h = a2;
        if (a2 || a) {
            this.o = cvid.NONE;
        }
    }

    public static boolean a(String str) {
        return str.startsWith("file:");
    }

    public final synchronized cvid b() {
        return this.o;
    }

    public final synchronized boolean c() {
        return this.n;
    }

    public final void d() {
        this.m.b(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        this.n = true;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cvie)) {
            return false;
        }
        cvie cvieVar = (cvie) obj;
        return dbsd.a(this.a, cvieVar.a) && dbsd.a(this.b, cvieVar.b) && dbsd.a(this.c, cvieVar.c) && dbsd.a(this.o, cvieVar.o) && this.n == cvieVar.n;
    }

    public final void f(cvid cvidVar) {
        if (this.h || this.g) {
            return;
        }
        this.o = cvidVar;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        dbsb c = dbsc.c(cvie.class);
        c.b("", this.a);
        c.b("targetDirectory", this.b);
        c.b("fileName", this.c);
        c.b("requiredConnectivity", this.o);
        c.h("canceled", this.n);
        return c.toString();
    }
}
