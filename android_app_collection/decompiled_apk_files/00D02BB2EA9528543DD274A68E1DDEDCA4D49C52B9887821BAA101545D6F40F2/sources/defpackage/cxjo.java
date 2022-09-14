package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxjo  reason: default package */
/* loaded from: classes5.dex */
public final class cxjo extends cxju<Double> {
    public cxjo(cxjs cxjsVar, String str, Double d, boolean z) {
        super(cxjsVar, str, d, z);
    }

    @Override // defpackage.cxju
    public final /* bridge */ /* synthetic */ Double a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String e = super.e();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(e);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
