package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: abba  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class abba implements ayqe {
    public final /* synthetic */ aajl a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ abba(aajl aajlVar, String str) {
        this.a = aajlVar;
        this.b = str;
    }

    public /* synthetic */ abba(aajl aajlVar, String str, int i) {
        this.c = i;
        this.a = aajlVar;
        this.b = str;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.c;
        if (i == 0) {
            aajl aajlVar = this.a;
            String str = this.b;
            aahb c = ((aagu) aajlVar).c();
            auoe e = ((auog) obj).e();
            String[] strArr = {str};
            for (int i2 = 0; i2 <= 0; i2++) {
                e.a.aH(strArr[i2]);
            }
            c.d(e.c());
            return c.b();
        } else if (i == 1) {
            aajl aajlVar2 = this.a;
            String str2 = this.b;
            List<String> list = (List) obj;
            int i3 = kpi.a;
            aahb c2 = ((aagu) aajlVar2).c();
            str2.getClass();
            aqxo.z(!str2.isEmpty(), "key cannot be empty");
            aopa createBuilder = atjk.a.createBuilder();
            createBuilder.copyOnWrite();
            atjk atjkVar = (atjk) createBuilder.instance;
            atjkVar.b = 1 | atjkVar.b;
            atjkVar.c = str2;
            atjh atjhVar = new atjh(createBuilder);
            if (list != null && !list.isEmpty()) {
                for (String str3 : list) {
                    aopa aopaVar = atjhVar.a;
                    aopaVar.copyOnWrite();
                    atjk atjkVar2 = (atjk) aopaVar.instance;
                    str3.getClass();
                    aopu aopuVar = atjkVar2.d;
                    if (!aopuVar.c()) {
                        atjkVar2.d = aopi.mutableCopy(aopuVar);
                    }
                    atjkVar2.d.add(str3);
                }
            }
            c2.j(atjhVar);
            return c2.b();
        } else {
            aajl aajlVar3 = this.a;
            String str4 = this.b;
            aahb c3 = ((aagu) aajlVar3).c();
            auoe e2 = ((auog) obj).e();
            LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(str4));
            List<String> unmodifiableList = Collections.unmodifiableList(((auoh) e2.a.instance).d);
            aopa aopaVar2 = e2.a;
            aopaVar2.copyOnWrite();
            ((auoh) aopaVar2.instance).d = aopi.emptyProtobufList();
            for (String str5 : unmodifiableList) {
                if (!linkedHashSet.contains(str5)) {
                    e2.a.aH(str5);
                }
            }
            c3.d(e2.c());
            return c3.b();
        }
    }
}
