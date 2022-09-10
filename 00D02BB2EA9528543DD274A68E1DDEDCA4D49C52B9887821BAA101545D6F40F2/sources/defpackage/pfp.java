package defpackage;
/* compiled from: PG */
/* renamed from: pfp  reason: default package */
/* loaded from: classes7.dex */
public final class pfp {
    public final ilo a;
    public final int b;

    private pfp(ilo iloVar, int i) {
        this.a = iloVar;
        this.b = i;
    }

    public static pfp a(ilo iloVar) {
        return new pfp(iloVar, 1);
    }

    public static pfp b(ilo iloVar) {
        return new pfp(iloVar, 2);
    }
}
