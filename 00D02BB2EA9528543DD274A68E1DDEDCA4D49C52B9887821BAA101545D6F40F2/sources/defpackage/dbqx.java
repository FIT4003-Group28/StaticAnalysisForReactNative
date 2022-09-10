package defpackage;
/* compiled from: PG */
/* renamed from: dbqx  reason: default package */
/* loaded from: classes.dex */
public final class dbqx extends dbqu {
    public static final dbqx a = new dbqx();

    private dbqx() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.dbrb
    public final boolean b(char c) {
        return false;
    }

    @Override // defpackage.dbrb
    public final int c(CharSequence charSequence) {
        dbsk.s(charSequence);
        return -1;
    }

    @Override // defpackage.dbrb
    public final int d(CharSequence charSequence, int i) {
        dbsk.y(i, charSequence.length());
        return -1;
    }

    @Override // defpackage.dbrb
    public final int e(CharSequence charSequence) {
        dbsk.s(charSequence);
        return -1;
    }

    @Override // defpackage.dbrb
    public final boolean f(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.dbrb
    public final boolean g(CharSequence charSequence) {
        dbsk.s(charSequence);
        return true;
    }

    @Override // defpackage.dbrb
    public final String h(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override // defpackage.dbrb
    public final String i(CharSequence charSequence, char c) {
        return charSequence.toString();
    }

    @Override // defpackage.dbrb
    public final dbrb j(dbrb dbrbVar) {
        dbsk.s(dbrbVar);
        return dbrbVar;
    }

    @Override // defpackage.dbqn, defpackage.dbrb
    public final dbrb k() {
        return dbqi.a;
    }
}
