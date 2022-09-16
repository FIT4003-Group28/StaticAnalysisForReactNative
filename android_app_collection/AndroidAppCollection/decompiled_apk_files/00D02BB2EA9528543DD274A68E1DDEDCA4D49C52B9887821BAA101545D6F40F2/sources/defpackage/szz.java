package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: szz  reason: default package */
/* loaded from: classes7.dex */
final class szz implements cqjb<tak, String> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ String a(tak takVar, Context context) {
        tak takVar2 = takVar;
        if (!cqjv.v(takVar2.a()).booleanValue()) {
            String a = takVar2.a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2);
            sb.append("(");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
        return "";
    }
}
