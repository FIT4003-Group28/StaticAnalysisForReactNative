package defpackage;
/* renamed from: bfhh  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bfhh implements dbrn {
    static final dbrn a = new bfhh();

    private bfhh() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Integer.valueOf(Math.round(((Float) obj).floatValue() * 100.0f));
    }
}
