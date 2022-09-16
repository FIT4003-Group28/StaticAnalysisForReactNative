package defpackage;
/* compiled from: PG */
/* renamed from: aodd  reason: default package */
/* loaded from: classes.dex */
public enum aodd implements anyx {
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    MESSAGE_OPEN(2);
    
    private final int e;

    aodd(int i) {
        this.e = i;
    }

    @Override // defpackage.anyx
    public int a() {
        return this.e;
    }
}
