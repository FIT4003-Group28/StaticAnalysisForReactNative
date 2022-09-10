package defpackage;
/* renamed from: kdx  reason: default package */
/* loaded from: classes7.dex */
public final /* synthetic */ class kdx implements dbrn {
    public static final dbrn a = new kdx();

    private kdx() {
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
