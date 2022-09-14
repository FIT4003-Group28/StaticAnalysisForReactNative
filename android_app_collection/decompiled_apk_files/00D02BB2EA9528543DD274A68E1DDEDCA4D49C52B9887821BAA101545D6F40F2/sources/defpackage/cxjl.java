package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxjl  reason: default package */
/* loaded from: classes5.dex */
public final class cxjl extends cxju<Long> {
    public cxjl(cxjs cxjsVar, String str, Long l, boolean z) {
        super(cxjsVar, str, l, z);
    }

    @Override // defpackage.cxju
    public final /* bridge */ /* synthetic */ Long a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String e = super.e();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(e);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
