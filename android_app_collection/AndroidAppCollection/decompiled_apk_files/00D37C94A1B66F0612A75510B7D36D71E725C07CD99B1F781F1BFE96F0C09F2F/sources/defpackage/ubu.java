package defpackage;
/* compiled from: PG */
/* renamed from: ubu  reason: default package */
/* loaded from: classes4.dex */
public final class ubu {
    public Throwable a;
    public int b;

    public final uby a() {
        int i = this.b;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: code");
        }
        return new uby(i, this.a);
    }
}
