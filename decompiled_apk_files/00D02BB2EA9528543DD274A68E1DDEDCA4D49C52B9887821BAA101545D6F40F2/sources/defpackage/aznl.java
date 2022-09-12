package defpackage;
/* compiled from: PG */
/* renamed from: aznl  reason: default package */
/* loaded from: classes.dex */
enum aznl {
    SYNCED(0),
    ADD(1),
    UPDATE(2),
    DELETE(3);
    
    public final int e;

    aznl(int i) {
        this.e = i;
    }

    public static aznl a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? SYNCED : DELETE : UPDATE : ADD;
    }
}
