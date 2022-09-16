package defpackage;
/* compiled from: PG */
/* renamed from: ufq  reason: default package */
/* loaded from: classes4.dex */
public final class ufq {
    public aoqu a;
    public aoqu b;
    public Throwable c;
    private Boolean d;

    public final ufr a() {
        Boolean bool = this.d;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: isRetryableError");
        }
        return new ufr(this.a, this.b, this.c, bool.booleanValue());
    }

    public final void b(boolean z) {
        this.d = Boolean.valueOf(z);
    }
}
