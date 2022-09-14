package defpackage;
/* compiled from: PG */
/* renamed from: dhdr  reason: default package */
/* loaded from: classes6.dex */
public enum dhdr implements dsrb {
    REQUEST_CERTIFICATES_UNKNOWN(0),
    SMIME_EMAIL_CERTIFICATE(1),
    UNRECOGNIZED(-1);
    
    private final int d;

    dhdr(int i) {
        this.d = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
