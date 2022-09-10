package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: avth  reason: default package */
/* loaded from: classes3.dex */
final class avth {
    public static final avtf a = new avtb();
    private static final dbrn<avte, String> d = new avtc();
    private static final dbrn<avte, String> e = new avtd();
    final List<avte> b = new ArrayList();
    final List<String> c = new ArrayList();

    public static avtf d() {
        return new avtg(Integer.toString(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        StringBuilder sb = new StringBuilder();
        dbrz.e(", ").m(sb, dcft.o(this.b, e));
        if (!this.c.isEmpty()) {
            sb.append(", PRIMARY KEY(");
            dbrz.e(", ").m(sb, this.c);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(Set<String> set) {
        return dbrz.e(", ").g(dcbg.b(this.b).s(d).o(dbst.a(new dbso(set))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str, String str2, avtf... avtfVarArr) {
        avte avteVar = new avte(str, str2, avtfVarArr);
        int length = avtfVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (avtfVarArr[i] == a) {
                this.c.add(str);
                break;
            } else {
                i++;
            }
        }
        this.b.add(avteVar);
    }
}
