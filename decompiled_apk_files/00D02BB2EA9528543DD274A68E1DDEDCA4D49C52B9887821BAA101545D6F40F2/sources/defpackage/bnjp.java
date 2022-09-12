package defpackage;
/* renamed from: bnjp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bnjp implements dbrn {
    static final dbrn a = new bnjp();

    private bnjp() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Integer.valueOf(Math.round(((Float) obj).floatValue() * 100.0f));
    }
}
