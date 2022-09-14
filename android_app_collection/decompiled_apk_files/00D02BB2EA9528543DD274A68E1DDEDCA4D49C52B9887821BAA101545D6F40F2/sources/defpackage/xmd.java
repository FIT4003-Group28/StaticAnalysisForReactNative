package defpackage;
/* compiled from: PG */
/* renamed from: xmd  reason: default package */
/* loaded from: classes7.dex */
public final class xmd {
    public final alxh a;
    public final akrk b;

    public xmd(akrk akrkVar) {
        this.b = akrkVar;
        this.a = new alxh(akrkVar);
    }

    public static int a(akrn akrnVar, akrn akrnVar2, boolean z) {
        int compareTo = akrnVar.compareTo(akrnVar2);
        return (compareTo == 0 || Math.abs(akrnVar.c - akrnVar2.c) <= akrnVar.a.r() * 3.0d) ? z ? b(akrnVar2, akrnVar) : b(akrnVar, akrnVar2) : compareTo;
    }

    private static int b(akrn akrnVar, akrn akrnVar2) {
        return Integer.compare(akrnVar.d, akrnVar2.d);
    }
}
