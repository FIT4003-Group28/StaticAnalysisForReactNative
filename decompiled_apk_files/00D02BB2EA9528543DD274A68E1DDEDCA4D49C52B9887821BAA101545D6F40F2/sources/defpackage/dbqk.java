package defpackage;
/* compiled from: PG */
/* renamed from: dbqk  reason: default package */
/* loaded from: classes5.dex */
public final class dbqk extends dbqu {
    public static final dbqk a = new dbqk();

    public dbqk() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return c <= 127;
    }
}
