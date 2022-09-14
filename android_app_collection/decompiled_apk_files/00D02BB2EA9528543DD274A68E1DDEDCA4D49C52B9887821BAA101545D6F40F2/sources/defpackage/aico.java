package defpackage;
/* renamed from: aico  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aico implements dbrn {
    static final dbrn a = new aico();

    private aico() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String valueOf = String.valueOf(Integer.toHexString(System.identityHashCode((aicq) obj)));
        return valueOf.length() != 0 ? "#".concat(valueOf) : new String("#");
    }
}
