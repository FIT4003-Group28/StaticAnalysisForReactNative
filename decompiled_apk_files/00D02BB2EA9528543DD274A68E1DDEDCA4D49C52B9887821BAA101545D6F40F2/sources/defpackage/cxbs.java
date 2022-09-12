package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: cxbs  reason: default package */
/* loaded from: classes5.dex */
final class cxbs {
    public final String a;
    public final int b;
    final /* synthetic */ cxbt c;

    public cxbs(cxbt cxbtVar) {
        this.c = cxbtVar;
        this.a = "";
        this.b = 0;
    }

    public cxbs(cxbt cxbtVar, cxbs cxbsVar, String str) {
        this.c = cxbtVar;
        if (cxbsVar.b != 0) {
            String str2 = cxbsVar.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
            sb.append(str2);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        this.a = str;
        this.b = cxbsVar.b + 1;
    }

    public final File a() {
        return new File(this.c.a, this.a);
    }
}
