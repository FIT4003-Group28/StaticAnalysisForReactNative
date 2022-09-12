package defpackage;
/* renamed from: ysu  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class ysu implements dbrn {
    static final dbrn a = new ysu();

    private ysu() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dood doodVar = (dood) obj;
        ysk yskVar = new ysk();
        if (doodVar != null) {
            yskVar.a = doodVar;
            String str = yskVar.a == null ? " scheduleEvent" : "";
            if (str.isEmpty()) {
                return new ysl(yskVar.a);
            }
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        throw new NullPointerException("Null scheduleEvent");
    }
}
