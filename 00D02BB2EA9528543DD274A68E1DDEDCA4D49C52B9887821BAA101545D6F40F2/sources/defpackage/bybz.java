package defpackage;
/* compiled from: PG */
/* renamed from: bybz  reason: default package */
/* loaded from: classes4.dex */
final class bybz extends dees<Object> implements amcm {
    @Override // defpackage.amcm
    public final void a(alyh alyhVar, int i, @dzsi alyg alygVar, @dzsi alyg alygVar2) {
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                j(null);
                return;
            } else if (i2 == 3) {
                return;
            } else {
                String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "NETWORK_ERROR" : "NOT_OFFLINEABLE" : "NOT_FOUND_LOCALLY" : "NOT_FOUND" : "IO_ERROR" : "OK";
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append("Bad status code ");
                sb.append(str);
                k(new IllegalStateException(sb.toString()));
                return;
            }
        }
        throw null;
    }
}
