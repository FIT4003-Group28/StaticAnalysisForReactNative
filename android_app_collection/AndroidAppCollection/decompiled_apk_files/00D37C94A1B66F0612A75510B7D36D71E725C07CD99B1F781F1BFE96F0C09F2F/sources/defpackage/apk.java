package defpackage;
/* compiled from: PG */
/* renamed from: apk  reason: default package */
/* loaded from: classes.dex */
public final class apk extends apm {
    private final boolean b;

    public apk(dp dpVar, boolean z) {
        super(dpVar);
        this.b = z;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Attempting to set user visible hint to " + this.b + " for fragment " + this.a;
    }
}
