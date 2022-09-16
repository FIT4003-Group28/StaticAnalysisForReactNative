package defpackage;
/* compiled from: PG */
/* renamed from: cko  reason: default package */
/* loaded from: classes4.dex */
public enum cko implements dsrb {
    UNSPECIFIED(0),
    USER(1),
    MODERATOR(2);
    
    public final int d;

    cko(int i) {
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
