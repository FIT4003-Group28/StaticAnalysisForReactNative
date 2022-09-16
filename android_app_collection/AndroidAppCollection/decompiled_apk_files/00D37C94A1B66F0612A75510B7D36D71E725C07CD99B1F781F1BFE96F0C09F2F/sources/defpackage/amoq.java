package defpackage;
/* compiled from: PG */
/* renamed from: amoq  reason: default package */
/* loaded from: classes.dex */
public final class amoq extends amov {
    public static final amoq a = new amoq();

    public amoq() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.amoy
    public final boolean b(char c) {
        return c <= 127;
    }
}
