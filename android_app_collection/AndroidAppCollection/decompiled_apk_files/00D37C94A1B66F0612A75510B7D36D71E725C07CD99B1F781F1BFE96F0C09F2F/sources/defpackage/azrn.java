package defpackage;
/* compiled from: PG */
/* renamed from: azrn  reason: default package */
/* loaded from: classes2.dex */
public abstract class azrn extends azri implements azss {
    private final int arity;

    public azrn(int i) {
        this(i, null);
    }

    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.azrg
    public String toString() {
        if (getCompletion() == null) {
            int i = azsw.a;
            String a = azsr.a(this);
            a.getClass();
            return a;
        }
        return super.toString();
    }

    public azrn(int i, azqy azqyVar) {
        super(azqyVar);
        this.arity = i;
    }
}
