package defpackage;
/* compiled from: PG */
/* renamed from: admj  reason: default package */
/* loaded from: classes.dex */
public enum admj {
    CAST_TOOLTIP("cast-tooltip", false, actj.CAST_TOOLTIP),
    CAST_TOOLTIP_REPRESSED("cast-tooltip-repressed", true, actj.CAST_TOOLTIP_REPRESSED),
    CAST_SNACKBAR("cast-snackbar", false, actj.CAST_SNACKBAR),
    CAST_SNACKBAR_REPRESSED("cast-snackbar-repressed", true, actj.CAST_SNACKBAR_REPRESSED),
    CAST_CLING("cast-cling", false, actj.CAST_CLING),
    CAST_CLING_REPRESSED("cast-cling-repressed", true, actj.CAST_CLING_REPRESSED);
    
    public final boolean g;
    public final actj h;
    private final String j;

    admj(String str, boolean z, actj actjVar) {
        this.j = str;
        this.g = z;
        this.h = actjVar;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.j;
    }
}
