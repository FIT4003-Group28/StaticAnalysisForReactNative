package defpackage;
/* compiled from: PG */
/* renamed from: apj  reason: default package */
/* loaded from: classes.dex */
public final class apj extends apl {
    private final dp b;

    public apj(dp dpVar, dp dpVar2) {
        super(dpVar);
        this.b = dpVar2;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Attempting to set target fragment " + this.b + " with request code 0 for fragment " + this.a;
    }
}
