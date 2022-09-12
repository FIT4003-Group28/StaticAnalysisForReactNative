package defpackage;
/* renamed from: bbpa  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbpa implements dbrn {
    static final dbrn a = new bbpa();

    private bbpa() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Integer.valueOf(Math.round(((Float) obj).floatValue() * 100.0f));
    }
}
