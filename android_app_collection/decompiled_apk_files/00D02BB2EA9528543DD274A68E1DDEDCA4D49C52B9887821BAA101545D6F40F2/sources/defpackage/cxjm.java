package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxjm  reason: default package */
/* loaded from: classes5.dex */
public final class cxjm extends cxju<Integer> {
    public cxjm(cxjs cxjsVar, String str, Integer num) {
        super(cxjsVar, str, num, false);
    }

    @Override // defpackage.cxju
    public final /* bridge */ /* synthetic */ Integer a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String e = super.e();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 24 + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(e);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
