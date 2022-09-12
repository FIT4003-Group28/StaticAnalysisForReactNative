package defpackage;
/* compiled from: PG */
/* renamed from: aly  reason: default package */
/* loaded from: classes2.dex */
abstract class aly implements alu {
    private final alx a;

    public aly(alx alxVar) {
        this.a = alxVar;
    }

    @Override // defpackage.alu
    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        alx alxVar = this.a;
        if (alxVar == null) {
            return b();
        }
        int a = alxVar.a(charSequence, i);
        if (a == 0) {
            return true;
        }
        if (a == 1) {
            return false;
        }
        return b();
    }

    protected abstract boolean b();
}
