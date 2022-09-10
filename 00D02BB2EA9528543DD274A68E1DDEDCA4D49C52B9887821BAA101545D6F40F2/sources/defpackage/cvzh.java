package defpackage;
/* compiled from: PG */
/* renamed from: cvzh  reason: default package */
/* loaded from: classes.dex */
final class cvzh<T> extends cvyv<T> {
    private cvyu<T> a;
    private cvyu<T> b;
    private cvyu<T> c;

    public cvzh() {
    }

    public cvzh(cvyw<T> cvywVar) {
        cvzi cvziVar = (cvzi) cvywVar;
        this.a = cvziVar.a;
        this.b = cvziVar.b;
        this.c = cvziVar.c;
    }

    @Override // defpackage.cvyv
    public final void b(cvyu<T> cvyuVar) {
        if (cvyuVar != null) {
            this.c = cvyuVar;
            return;
        }
        throw new NullPointerException("Null manageAccountsClickListener");
    }

    @Override // defpackage.cvyv
    public final void c(cvyu<T> cvyuVar) {
        if (cvyuVar != null) {
            this.a = cvyuVar;
            return;
        }
        throw new NullPointerException("Null myAccountClickListener");
    }

    @Override // defpackage.cvyv
    public final void d(cvyu<T> cvyuVar) {
        if (cvyuVar != null) {
            this.b = cvyuVar;
            return;
        }
        throw new NullPointerException("Null useAnotherAccountClickListener");
    }

    @Override // defpackage.cvyv
    public final cvyw<T> a() {
        String str = this.a == null ? " myAccountClickListener" : "";
        if (this.b == null) {
            str = str.concat(" useAnotherAccountClickListener");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" manageAccountsClickListener");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvzi(this.a, this.b, this.c);
    }
}
