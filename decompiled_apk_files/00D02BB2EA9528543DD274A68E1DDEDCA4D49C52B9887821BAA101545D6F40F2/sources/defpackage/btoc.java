package defpackage;
/* renamed from: btoc  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class btoc implements dbrn {
    static final dbrn a = new btoc();

    private btoc() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String valueOf = String.valueOf((Integer) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append(" LIMIT ");
        sb.append(valueOf);
        return sb.toString();
    }
}
