package defpackage;
/* renamed from: aije  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aije implements dbrn {
    static final dbrn a = new aije();

    private aije() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String valueOf = String.valueOf(Integer.toHexString(System.identityHashCode((aijb) obj)));
        return valueOf.length() != 0 ? "#".concat(valueOf) : new String("#");
    }
}
