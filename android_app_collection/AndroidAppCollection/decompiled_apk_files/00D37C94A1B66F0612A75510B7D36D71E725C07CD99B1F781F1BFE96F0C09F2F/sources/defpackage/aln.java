package defpackage;
/* compiled from: PG */
/* renamed from: aln  reason: default package */
/* loaded from: classes.dex */
abstract class aln implements alk {
    private final alm a;

    public aln(alm almVar) {
        this.a = almVar;
    }

    @Override // defpackage.alk
    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        alm almVar = this.a;
        if (almVar != null) {
            int a = almVar.a(charSequence, i);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                return false;
            }
            return b();
        }
        return b();
    }

    protected abstract boolean b();
}
