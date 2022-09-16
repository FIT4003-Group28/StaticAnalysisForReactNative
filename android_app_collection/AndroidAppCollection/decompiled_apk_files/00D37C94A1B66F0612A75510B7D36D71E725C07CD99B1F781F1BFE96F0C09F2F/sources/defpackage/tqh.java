package defpackage;
/* compiled from: PG */
/* renamed from: tqh  reason: default package */
/* loaded from: classes4.dex */
public enum tqh implements aopm {
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);
    
    private final int f;

    tqh(int i) {
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
