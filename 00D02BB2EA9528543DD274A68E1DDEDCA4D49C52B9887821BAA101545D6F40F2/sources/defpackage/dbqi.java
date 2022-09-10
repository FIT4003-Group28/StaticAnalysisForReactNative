package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dbqi  reason: default package */
/* loaded from: classes5.dex */
final class dbqi extends dbqu {
    static final dbqi a = new dbqi();

    private dbqi() {
        super("CharMatcher.any()");
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return true;
    }

    @Override // defpackage.dbrb
    public final int c(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    @Override // defpackage.dbrb
    public final int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        dbsk.y(i, length);
        if (i == length) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.dbrb
    public final int e(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    @Override // defpackage.dbrb
    public final boolean f(CharSequence charSequence) {
        dbsk.s(charSequence);
        return true;
    }

    @Override // defpackage.dbrb
    public final boolean g(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.dbrb
    public final String h(CharSequence charSequence) {
        dbsk.s(charSequence);
        return "";
    }

    @Override // defpackage.dbrb
    public final String i(CharSequence charSequence, char c) {
        char[] cArr = new char[charSequence.length()];
        Arrays.fill(cArr, '.');
        return new String(cArr);
    }

    @Override // defpackage.dbrb
    public final dbrb j(dbrb dbrbVar) {
        dbsk.s(dbrbVar);
        return this;
    }

    @Override // defpackage.dbqn, defpackage.dbrb
    public final dbrb k() {
        return dbqx.a;
    }
}
