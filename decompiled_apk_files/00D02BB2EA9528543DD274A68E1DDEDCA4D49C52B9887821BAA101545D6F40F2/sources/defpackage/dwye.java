package defpackage;
/* compiled from: PG */
/* renamed from: dwye  reason: default package */
/* loaded from: classes6.dex */
public enum dwye implements dsrb {
    UNKNOWN_MODIFICATION(0),
    CAPTION(1),
    EDIT(2);
    
    private final int d;

    dwye(int i) {
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
