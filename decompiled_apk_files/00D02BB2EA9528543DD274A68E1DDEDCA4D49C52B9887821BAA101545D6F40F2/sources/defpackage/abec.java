package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: abec  reason: default package */
/* loaded from: classes2.dex */
public class abec implements abdq {
    private final CharSequence a;
    private final dcha<String, abdw> b;

    public abec(abem abemVar, final abcz abczVar, final dqpq dqpqVar, final String str, final String str2, final String str3, final Map<String, dqpy> map, final String str4) {
        this.a = dqpqVar.a;
        this.b = new dbyv(new dckt(dckz.e(dqpqVar.b, abea.a), dcjz.u(new dbrn(abczVar, str, str2, str3, map, str4, dqpqVar) { // from class: abeb
            private final abcz a;
            private final String b;
            private final String c;
            private final String d;
            private final Map e;
            private final String f;
            private final dqpq g;

            {
                this.a = abczVar;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = map;
                this.f = str4;
                this.g = dqpqVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                abcz abczVar2 = this.a;
                String str5 = this.b;
                String str6 = this.c;
                String str7 = this.d;
                Map map2 = this.e;
                String str8 = this.f;
                dqpq dqpqVar2 = this.g;
                dqpw dqpwVar = (dqpw) obj;
                String str9 = dqpqVar2.a;
                String str10 = dqpqVar2.c;
                abdf a = abczVar2.a.a();
                abcz.a(a, 1);
                abcz.a(str5, 2);
                abcz.a(str6, 3);
                abcz.a(str7, 4);
                abcz.a(map2, 5);
                abcz.a(str8, 6);
                abcz.a(str9, 7);
                abcz.a(str10, 8);
                abcy abcyVar = new abcy(a, str5, str6, str7, map2, str8, str9, str10);
                abem.a(dqpwVar, 1);
                abem.a(abcyVar, 2);
                return new abel(dqpwVar, abcyVar);
            }
        })));
    }

    @Override // defpackage.abdq
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.abdq
    public dcha<String, abdw> b() {
        return this.b;
    }
}
