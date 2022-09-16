package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: afis  reason: default package */
/* loaded from: classes.dex */
public class afis {
    public final List a = new ArrayList();
    private final String b;

    public afis(String str) {
        this.b = str;
    }

    public final void a(String str) {
        for (afiz afizVar : this.a) {
            long j = afiz.a;
            afiw afiwVar = afizVar.e;
            String str2 = this.b;
            String e = afizVar.e();
            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + String.valueOf(str).length());
            sb.append(e);
            sb.append(":");
            sb.append(str);
            afiwVar.a(str2, sb.toString());
        }
    }
}
