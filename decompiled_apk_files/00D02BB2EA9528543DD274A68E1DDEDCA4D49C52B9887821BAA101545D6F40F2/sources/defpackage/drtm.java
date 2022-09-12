package defpackage;
/* compiled from: PG */
/* renamed from: drtm  reason: default package */
/* loaded from: classes6.dex */
public enum drtm implements dsrb {
    FEATURE_UNSPECIFIED(0),
    USER_FEEDBACK_IHNR(1),
    IN_APP_PROMPTS(2);
    
    public final int d;

    drtm(int i) {
        this.d = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
