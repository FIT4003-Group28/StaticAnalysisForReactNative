package defpackage;
/* compiled from: PG */
/* renamed from: bwka  reason: default package */
/* loaded from: classes4.dex */
public final class bwka {
    @dzsi
    public final ilo a;
    @dzsi
    public final String b;
    public final long c;
    public final int d;

    public bwka(@dzsi ilo iloVar, @dzsi String str, int i, cqat cqatVar) {
        this.a = iloVar;
        this.b = str;
        this.d = i;
        this.c = cqatVar.b() * 1000;
    }

    public static bwka a(ilo iloVar, cqat cqatVar) {
        return new bwka(iloVar, null, 5, cqatVar);
    }

    public static bwka b(ilo iloVar, cqat cqatVar) {
        return new bwka(iloVar, null, 3, cqatVar);
    }
}
