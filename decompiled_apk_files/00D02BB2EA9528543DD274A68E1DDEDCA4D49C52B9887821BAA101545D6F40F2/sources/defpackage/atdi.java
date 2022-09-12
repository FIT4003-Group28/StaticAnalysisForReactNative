package defpackage;
/* renamed from: atdi  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class atdi implements dbrn {
    public static final dbrn a = new atdi();

    private atdi() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dpen b = dpen.b(((dpeo) obj).b);
        if (b == null) {
            b = dpen.UNKNOWN_STYLE;
        }
        int ordinal = b.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "" : "TRAFFIC_JAM" : "SLOWER_TRAFFIC" : "UNKNOWN_STYLE";
    }
}
