package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxjn  reason: default package */
/* loaded from: classes5.dex */
public final class cxjn extends cxju<Boolean> {
    public cxjn(cxjs cxjsVar, String str, Boolean bool, boolean z) {
        super(cxjsVar, str, bool, z);
    }

    @Override // defpackage.cxju
    public final /* bridge */ /* synthetic */ Boolean a(Object obj) {
        boolean z;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (cpke.c.matcher(str).matches()) {
                z = true;
            } else if (cpke.d.matcher(str).matches()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        String e = super.e();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(e);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
        return null;
    }
}
