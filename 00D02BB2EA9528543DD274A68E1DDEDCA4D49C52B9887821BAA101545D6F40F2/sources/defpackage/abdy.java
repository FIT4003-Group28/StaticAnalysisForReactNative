package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abdy  reason: default package */
/* loaded from: classes2.dex */
public class abdy implements abdp {
    private final dcdc<abdq> a;

    public abdy(final abed abedVar, final dqpm dqpmVar, int i, final String str, final String str2, final String str3, final Map<String, dqpy> map) {
        this.a = dcbg.b(dqpmVar.c).x(i).s(new dbrn(abedVar, str, str2, str3, map, dqpmVar) { // from class: abdx
            private final abed a;
            private final String b;
            private final String c;
            private final String d;
            private final Map e;
            private final dqpm f;

            {
                this.a = abedVar;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = map;
                this.f = dqpmVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                abed abedVar2 = this.a;
                String str4 = this.b;
                String str5 = this.c;
                String str6 = this.d;
                Map map2 = this.e;
                dqpq dqpqVar = (dqpq) obj;
                String str7 = this.f.b;
                abem a = abedVar2.a.a();
                abed.a(a, 1);
                abcz a2 = abedVar2.b.a();
                abed.a(a2, 2);
                abed.a(dqpqVar, 3);
                abed.a(str4, 4);
                abed.a(str5, 5);
                abed.a(str6, 6);
                abed.a(map2, 7);
                abed.a(str7, 8);
                return new abec(a, a2, dqpqVar, str4, str5, str6, map2, str7);
            }
        }).z();
    }

    @Override // defpackage.abdp
    public List<abdq> a() {
        return this.a;
    }
}
