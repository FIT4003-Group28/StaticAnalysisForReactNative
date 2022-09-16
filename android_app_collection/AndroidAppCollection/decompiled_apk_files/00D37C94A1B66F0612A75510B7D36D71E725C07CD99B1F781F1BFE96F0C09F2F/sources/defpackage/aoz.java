package defpackage;
/* compiled from: PG */
/* renamed from: aoz  reason: default package */
/* loaded from: classes.dex */
public final class aoz extends apm {
    private final String b;

    public aoz(dp dpVar, String str) {
        super(dpVar);
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Attempting to reuse fragment " + this.a + " with previous ID " + this.b;
    }
}
