package defpackage;
/* compiled from: PG */
/* renamed from: aode  reason: default package */
/* loaded from: classes.dex */
public enum aode implements anyx {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    private final int f;

    aode(int i) {
        this.f = i;
    }

    @Override // defpackage.anyx
    public final int a() {
        return this.f;
    }
}
