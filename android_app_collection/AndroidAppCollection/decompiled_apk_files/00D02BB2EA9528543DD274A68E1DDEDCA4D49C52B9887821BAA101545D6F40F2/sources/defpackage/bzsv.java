package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bzsv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bzsv implements dbrn {
    static final dbrn a = new bzsv();

    private bzsv() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("'");
        sb.append(valueOf);
        sb.append("'");
        return sb.toString();
    }
}
