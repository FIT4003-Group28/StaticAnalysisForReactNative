package defpackage;
/* compiled from: PG */
/* renamed from: bpfv  reason: default package */
/* loaded from: classes3.dex */
public enum bpfv {
    UNNAMED_SEGMENT,
    NAMED_SEGMENT,
    PRESELECTED_ROUTE;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                throw null;
            }
            return true;
        }
        return true;
    }
}
