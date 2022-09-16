package defpackage;

import android.text.TextUtils;
import java.util.List;
/* compiled from: PG */
/* renamed from: aave  reason: default package */
/* loaded from: classes.dex */
public final class aave extends aaqs {
    public aufp A;
    private String B;
    private String C;
    public List a;
    public String b;
    public String c;
    public String d;
    public String s;
    public String t;
    public arif u;
    public arnj v;
    public String w;
    public Long x;
    public amuk y;
    public Long z;

    public aave(aaqf aaqfVar, afvm afvmVar) {
        super("comment/create_comment", aaqfVar, afvmVar);
        this.B = "";
        this.C = "";
        this.a = null;
        this.b = "";
        this.c = "";
        this.d = "";
        this.s = "";
        this.t = "";
        this.u = null;
        this.v = null;
        this.w = "";
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = arny.a.createBuilder();
        String str = this.B;
        createBuilder.copyOnWrite();
        arny arnyVar = (arny) createBuilder.instance;
        str.getClass();
        arnyVar.b |= 2;
        arnyVar.f = str;
        String str2 = this.C;
        createBuilder.copyOnWrite();
        arny arnyVar2 = (arny) createBuilder.instance;
        str2.getClass();
        arnyVar2.b |= 4;
        arnyVar2.g = str2;
        Long l = this.z;
        if (l != null) {
            long longValue = l.longValue();
            createBuilder.copyOnWrite();
            arny arnyVar3 = (arny) createBuilder.instance;
            arnyVar3.b |= 65536;
            arnyVar3.j = longValue;
        }
        List list = this.a;
        if (list != null && list.size() > 0) {
            aopa createBuilder2 = arnn.a.createBuilder();
            List list2 = this.a;
            createBuilder2.copyOnWrite();
            arnn arnnVar = (arnn) createBuilder2.instance;
            aopu aopuVar = arnnVar.b;
            if (!aopuVar.c()) {
                arnnVar.b = aopi.mutableCopy(aopuVar);
            }
            aonk.addAll((Iterable) list2, (List) arnnVar.b);
            arnn arnnVar2 = (arnn) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            arny arnyVar4 = (arny) createBuilder.instance;
            arnnVar2.getClass();
            arnyVar4.d = arnnVar2;
            arnyVar4.c = 8;
        }
        if (!TextUtils.isEmpty(this.b)) {
            aopa createBuilder3 = arnk.a.createBuilder();
            String str3 = this.b;
            createBuilder3.copyOnWrite();
            arnk arnkVar = (arnk) createBuilder3.instance;
            str3.getClass();
            arnkVar.b |= 1;
            arnkVar.c = str3;
            if (!TextUtils.isEmpty(this.t)) {
                String str4 = this.t;
                createBuilder3.copyOnWrite();
                arnk arnkVar2 = (arnk) createBuilder3.instance;
                str4.getClass();
                arnkVar2.b |= 2;
                arnkVar2.d = str4;
            }
            arif arifVar = this.u;
            if (arifVar != null) {
                createBuilder3.copyOnWrite();
                arnk arnkVar3 = (arnk) createBuilder3.instance;
                arnkVar3.e = arifVar;
                arnkVar3.b |= 4;
            }
            createBuilder.copyOnWrite();
            arny arnyVar5 = (arny) createBuilder.instance;
            arnk arnkVar4 = (arnk) createBuilder3.mo39build();
            arnkVar4.getClass();
            arnyVar5.d = arnkVar4;
            arnyVar5.c = 9;
        }
        if (!TextUtils.isEmpty(this.c)) {
            aopa createBuilder4 = arnp.a.createBuilder();
            String str5 = this.c;
            createBuilder4.copyOnWrite();
            arnp arnpVar = (arnp) createBuilder4.instance;
            str5.getClass();
            arnpVar.b |= 1;
            arnpVar.c = str5;
            createBuilder.copyOnWrite();
            arny arnyVar6 = (arny) createBuilder.instance;
            arnp arnpVar2 = (arnp) createBuilder4.mo39build();
            arnpVar2.getClass();
            arnyVar6.d = arnpVar2;
            arnyVar6.c = 7;
        }
        if (!TextUtils.isEmpty(this.d)) {
            aopa createBuilder5 = arnl.a.createBuilder();
            String str6 = this.d;
            createBuilder5.copyOnWrite();
            arnl arnlVar = (arnl) createBuilder5.instance;
            str6.getClass();
            arnlVar.b |= 1;
            arnlVar.c = str6;
            createBuilder.copyOnWrite();
            arny arnyVar7 = (arny) createBuilder.instance;
            arnl arnlVar2 = (arnl) createBuilder5.mo39build();
            arnlVar2.getClass();
            arnyVar7.d = arnlVar2;
            arnyVar7.c = 10;
        }
        if (!TextUtils.isEmpty(this.w)) {
            aopa createBuilder6 = arno.a.createBuilder();
            String str7 = this.w;
            createBuilder6.copyOnWrite();
            arno arnoVar = (arno) createBuilder6.instance;
            str7.getClass();
            arnoVar.b |= 1;
            arnoVar.c = str7;
            createBuilder.copyOnWrite();
            arny arnyVar8 = (arny) createBuilder.instance;
            arno arnoVar2 = (arno) createBuilder6.mo39build();
            arnoVar2.getClass();
            arnyVar8.d = arnoVar2;
            arnyVar8.c = 15;
        }
        if (!TextUtils.isEmpty(this.s)) {
            String str8 = this.s;
            createBuilder.copyOnWrite();
            arny arnyVar9 = (arny) createBuilder.instance;
            str8.getClass();
            arnyVar9.b |= 32;
            arnyVar9.h = str8;
        }
        arnj arnjVar = this.v;
        if (arnjVar != null) {
            createBuilder.copyOnWrite();
            arny arnyVar10 = (arny) createBuilder.instance;
            arnyVar10.d = arnjVar;
            arnyVar10.c = 14;
        }
        Long l2 = this.x;
        if (l2 != null) {
            long longValue2 = l2.longValue();
            createBuilder.copyOnWrite();
            arny arnyVar11 = (arny) createBuilder.instance;
            arnyVar11.b |= 32768;
            arnyVar11.i = longValue2;
        }
        amuk amukVar = this.y;
        if (amukVar != null && !amukVar.isEmpty()) {
            aopa createBuilder7 = aufu.a.createBuilder();
            amuk amukVar2 = this.y;
            createBuilder7.copyOnWrite();
            aufu aufuVar = (aufu) createBuilder7.instance;
            aopu aopuVar2 = aufuVar.b;
            if (!aopuVar2.c()) {
                aufuVar.b = aopi.mutableCopy(aopuVar2);
            }
            aonk.addAll((Iterable) amukVar2, (List) aufuVar.b);
            createBuilder.copyOnWrite();
            arny arnyVar12 = (arny) createBuilder.instance;
            aufu aufuVar2 = (aufu) createBuilder7.mo39build();
            aufuVar2.getClass();
            arnyVar12.d = aufuVar2;
            arnyVar12.c = 18;
        }
        aufp aufpVar = this.A;
        if (aufpVar != null) {
            createBuilder.copyOnWrite();
            arny arnyVar13 = (arny) createBuilder.instance;
            arnyVar13.k = aufpVar;
            arnyVar13.b |= 131072;
        }
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        amuk amukVar;
        zgh.m(this.B);
        boolean z = false;
        if (!TextUtils.isEmpty(this.C) || !TextUtils.isEmpty(this.b) || ((amukVar = this.y) != null && abgc.k(amukVar))) {
            z = true;
        }
        aqxo.p(z);
    }

    public final void t(String str) {
        this.C = g(str);
    }

    public final void u(String str) {
        this.B = g(str);
    }
}
