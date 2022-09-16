package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: avtd  reason: default package */
/* loaded from: classes3.dex */
final class avtd implements dbrn<avte, String> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ String a(avte avteVar) {
        String str;
        avte avteVar2 = avteVar;
        Iterator<avtf> it = avteVar2.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            avtf next = it.next();
            if (next instanceof avtg) {
                String valueOf = String.valueOf(((avtg) next).a);
                str = valueOf.length() != 0 ? " DEFAULT ".concat(valueOf) : new String(" DEFAULT ");
            }
        }
        String str2 = avteVar2.a;
        String str3 = avteVar2.b;
        StringBuilder sb = new StringBuilder(str2.length() + 1 + str3.length() + String.valueOf(str).length());
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(str);
        return sb.toString();
    }
}
