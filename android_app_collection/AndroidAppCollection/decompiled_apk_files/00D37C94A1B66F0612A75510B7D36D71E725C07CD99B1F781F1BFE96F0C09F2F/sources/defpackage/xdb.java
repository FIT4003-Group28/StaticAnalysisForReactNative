package defpackage;
/* compiled from: PG */
/* renamed from: xdb  reason: default package */
/* loaded from: classes4.dex */
public enum xdb {
    PRE_ROLL(1, "Preroll"),
    MID_ROLL(2, "Midroll"),
    POST_ROLL(3, "Postroll");
    
    public final int d;
    private final String f;

    xdb(int i, String str) {
        this.d = i;
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
