package defpackage;
/* compiled from: PG */
/* renamed from: xhf  reason: default package */
/* loaded from: classes4.dex */
public final class xhf {
    private Boolean a;

    public final xhg a() {
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: remotePlayback");
        }
        return new xhg(bool.booleanValue());
    }

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }
}
