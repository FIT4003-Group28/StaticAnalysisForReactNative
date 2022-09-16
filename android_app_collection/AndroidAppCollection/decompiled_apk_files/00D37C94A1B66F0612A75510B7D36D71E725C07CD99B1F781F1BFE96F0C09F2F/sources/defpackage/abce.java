package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abce  reason: default package */
/* loaded from: classes.dex */
public final class abce extends aaqs {
    public String a;
    public String b;
    public String c;
    public ascj d;
    public asbv s;
    public boolean t;
    public final List u;
    public String v;
    public int w;
    private String x;
    private final aopa y;

    public abce(aaqf aaqfVar, afvm afvmVar, boolean z) {
        super("search", aaqfVar, afvmVar, 3);
        this.u = new ArrayList();
        this.w = 1;
        this.i = z;
        this.y = asbq.a.createBuilder();
        i();
    }

    @Override // defpackage.aaqs
    public final /* bridge */ /* synthetic */ aoqt a() {
        aopa createBuilder = asby.a.createBuilder();
        String str = this.b;
        if (str != null) {
            createBuilder.copyOnWrite();
            asby asbyVar = (asby) createBuilder.instance;
            asbyVar.b |= 4;
            asbyVar.e = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            createBuilder.copyOnWrite();
            asby asbyVar2 = (asby) createBuilder.instance;
            asbyVar2.b |= 4096;
            asbyVar2.k = str2;
        }
        aopa aopaVar = this.y;
        if (aopaVar != null) {
            createBuilder.copyOnWrite();
            asby asbyVar3 = (asby) createBuilder.instance;
            asbq asbqVar = (asbq) aopaVar.mo39build();
            asbqVar.getClass();
            asbyVar3.h = asbqVar;
            asbyVar3.b |= 32;
        }
        String str3 = this.x;
        if (str3 != null) {
            createBuilder.copyOnWrite();
            asby asbyVar4 = (asby) createBuilder.instance;
            asbyVar4.b |= 2;
            asbyVar4.d = str3;
        }
        asbv asbvVar = this.s;
        if (asbvVar != null) {
            createBuilder.copyOnWrite();
            asby asbyVar5 = (asby) createBuilder.instance;
            asbyVar5.i = asbvVar;
            asbyVar5.b |= 64;
        }
        createBuilder.copyOnWrite();
        asby asbyVar6 = (asby) createBuilder.instance;
        asbyVar6.g = 0;
        asbyVar6.b |= 16;
        String str4 = this.a;
        if (str4 != null) {
            createBuilder.copyOnWrite();
            asby asbyVar7 = (asby) createBuilder.instance;
            asbyVar7.b |= 8;
            asbyVar7.f = str4;
        }
        List list = this.u;
        createBuilder.copyOnWrite();
        asby asbyVar8 = (asby) createBuilder.instance;
        aopq aopqVar = asbyVar8.n;
        if (!aopqVar.c()) {
            asbyVar8.n = aopi.mutableCopy(aopqVar);
        }
        aonk.addAll((Iterable) list, (List) asbyVar8.n);
        ascj ascjVar = this.d;
        if (ascjVar != null) {
            createBuilder.copyOnWrite();
            asby asbyVar9 = (asby) createBuilder.instance;
            asbyVar9.j = ascjVar;
            asbyVar9.b |= 1024;
        }
        String str5 = this.v;
        if (str5 != null) {
            createBuilder.copyOnWrite();
            asby asbyVar10 = (asby) createBuilder.instance;
            asbyVar10.b |= 8388608;
            asbyVar10.m = str5;
        }
        if (!TextUtils.isEmpty(null)) {
            aopa createBuilder2 = aqzk.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqzk aqzkVar = (aqzk) createBuilder2.instance;
            throw null;
        } else if (TextUtils.isEmpty(null)) {
            boolean z = this.t;
            createBuilder.copyOnWrite();
            asby asbyVar11 = (asby) createBuilder.instance;
            asbyVar11.b |= 262144;
            asbyVar11.l = z;
            int i = this.w;
            if (i != 1) {
                createBuilder.copyOnWrite();
                asby asbyVar12 = (asby) createBuilder.instance;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                asbyVar12.o = i2;
                asbyVar12.b |= 16777216;
            }
            return createBuilder;
        } else {
            aopa createBuilder3 = aqzl.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqzl aqzlVar = (aqzl) createBuilder3.instance;
            throw null;
        }
    }

    @Override // defpackage.aapd
    public final String b() {
        afrt e = e();
        e.c("query", this.x);
        e.c("params", this.b);
        e.c("conversationId", this.c);
        e.c("continuation", this.a);
        e.e("filterOptions", ((asbq) this.y.mo39build()).toByteArray());
        asbv asbvVar = this.s;
        if (asbvVar != null) {
            e.e("searchFormData", asbvVar.toByteArray());
        }
        return e.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        r(this.x, this.a);
    }

    public final void t(String str) {
        this.x = g(str);
    }
}
