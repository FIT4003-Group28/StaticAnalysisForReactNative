package defpackage;
/* compiled from: PG */
/* renamed from: dewc  reason: default package */
/* loaded from: classes6.dex */
public enum dewc implements dsrb {
    DEFAULT_CACHE_OK_IF_VALID(0),
    CACHE_OK_IF_AVAILABLE(1),
    SKIP_CACHE(2),
    CACHE_ONLY(3),
    VALID_CACHE_ONLY(4);
    
    private final int f;

    dewc(int i) {
        this.f = i;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
