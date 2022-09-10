package defpackage;
/* compiled from: PG */
/* renamed from: dbqt  reason: default package */
/* loaded from: classes5.dex */
public final class dbqt extends dbrb {
    public static final dbqt a = new dbqt();

    private dbqt() {
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return Character.isLetter(c);
    }

    public final String toString() {
        return "CharMatcher.javaLetter()";
    }
}
