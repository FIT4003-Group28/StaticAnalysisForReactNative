package defpackage;
/* renamed from: bdln  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdln implements dbrn {
    static final dbrn a = new bdln();

    private bdln() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Float.valueOf(((Float) obj).floatValue() > 1.0f ? 1.33f : 0.75f);
    }
}
