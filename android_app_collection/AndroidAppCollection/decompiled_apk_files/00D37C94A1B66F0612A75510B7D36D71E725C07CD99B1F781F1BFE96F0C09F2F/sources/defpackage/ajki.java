package defpackage;
/* compiled from: PG */
/* renamed from: ajki  reason: default package */
/* loaded from: classes.dex */
public final class ajki {
    private Boolean a;

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final ajkj a() {
        Boolean bool = this.a;
        if (bool == null) {
            throw new IllegalStateException("Missing required properties: swipeToCameraEnabled");
        }
        return new ajkj(bool.booleanValue());
    }
}
