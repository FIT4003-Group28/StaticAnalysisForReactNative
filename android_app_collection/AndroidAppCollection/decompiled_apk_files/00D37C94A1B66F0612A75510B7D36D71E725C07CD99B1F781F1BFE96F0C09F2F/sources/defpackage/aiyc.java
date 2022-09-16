package defpackage;

import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: aiyc  reason: default package */
/* loaded from: classes.dex */
public final class aiyc {
    public static final aiyc a = new aiyc();
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public String j;
    public int k;
    public String l;
    public int m;
    public String n;

    public aiyc() {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = PrivateKeyType.INVALID;
        this.l = "#000000";
        this.m = PrivateKeyType.INVALID;
        this.n = "#000000";
    }

    public aiyc(aiyc aiycVar) {
        this.b = -1;
        this.f = 1;
        this.g = 100;
        this.j = "#FFFFFF";
        this.k = PrivateKeyType.INVALID;
        this.l = "#000000";
        this.m = PrivateKeyType.INVALID;
        this.n = "#000000";
        this.b = aiycVar.b;
        this.c = aiycVar.c;
        this.d = aiycVar.d;
        this.e = aiycVar.e;
        this.f = aiycVar.f;
        this.g = aiycVar.g;
        this.h = aiycVar.h;
        this.i = aiycVar.i;
        this.j = aiycVar.j;
        this.k = aiycVar.k;
        this.l = aiycVar.l;
        this.m = aiycVar.m;
        this.n = aiycVar.n;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder(128);
        if (!this.j.equals("#FFFFFF")) {
            sb.append("<font color=");
            sb.append(this.j);
            sb.append(">");
        }
        if (this.c) {
            sb.append("<I>");
        }
        return sb.toString();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder(128);
        if (this.c) {
            sb.append("</I>");
        }
        if (!this.j.equals("#FFFFFF")) {
            sb.append("</font>");
        }
        return sb.toString();
    }
}
