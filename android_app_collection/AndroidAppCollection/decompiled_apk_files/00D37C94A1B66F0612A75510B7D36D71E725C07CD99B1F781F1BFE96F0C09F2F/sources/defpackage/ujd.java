package defpackage;
/* compiled from: PG */
/* renamed from: ujd  reason: default package */
/* loaded from: classes4.dex */
public final class ujd {
    public aoqu a;
    public Throwable b;
    private Boolean c;

    public final ujf a() {
        Boolean bool = this.c;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: isRetryableError");
        }
        return new ujf(this.a, this.b, bool.booleanValue());
    }

    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }
}
