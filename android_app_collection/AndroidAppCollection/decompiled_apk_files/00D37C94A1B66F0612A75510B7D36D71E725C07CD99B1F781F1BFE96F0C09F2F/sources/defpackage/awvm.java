package defpackage;
/* compiled from: PG */
/* renamed from: awvm  reason: default package */
/* loaded from: classes2.dex */
public enum awvm implements aopm {
    ACTION_TYPE_UNKNOWN(0),
    ACTION_TYPE_RETRY(1),
    ACTION_TYPE_GIVE_UP(2),
    ACTION_TYPE_PASS_THROUGH_ERROR(3);
    
    private final int f;

    awvm(int i) {
        this.f = i;
    }

    @Override // defpackage.aopm
    public final int getNumber() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
