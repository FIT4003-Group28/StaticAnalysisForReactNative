package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aijk  reason: default package */
/* loaded from: classes.dex */
public final class aijk extends aijj {
    public static apzg f(String str, String str2, int i) {
        aopa createBuilder = attf.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            attf attfVar = (attf) createBuilder.instance;
            str.getClass();
            attfVar.b |= 1;
            attfVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            attf attfVar2 = (attf) createBuilder.instance;
            str2.getClass();
            attfVar2.b |= 2;
            attfVar2.d = str2;
        }
        createBuilder.copyOnWrite();
        attf attfVar3 = (attf) createBuilder.instance;
        attfVar3.b |= 4;
        attfVar3.e = i;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(attg.a, (attf) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static apzg g(String str, String str2, int i, float f) {
        aopa createBuilder = attf.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            attf attfVar = (attf) createBuilder.instance;
            str.getClass();
            attfVar.b |= 1;
            attfVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            attf attfVar2 = (attf) createBuilder.instance;
            attfVar2.b |= 2;
            attfVar2.d = str2;
        }
        createBuilder.copyOnWrite();
        attf attfVar3 = (attf) createBuilder.instance;
        attfVar3.b |= 4;
        attfVar3.e = i;
        createBuilder.copyOnWrite();
        attf attfVar4 = (attf) createBuilder.instance;
        attfVar4.b |= 16;
        attfVar4.g = f;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopcVar.e(attg.a, (attf) createBuilder.mo39build());
        return (apzg) aopcVar.mo39build();
    }

    public static final String m(attf attfVar) {
        return (attfVar.b & 2) != 0 ? attfVar.d : "";
    }

    public static final String n(attf attfVar) {
        return (attfVar.b & 1) != 0 ? attfVar.c : "";
    }

    public static final int o(attf attfVar) {
        return ahfo.d(attfVar.e, m(attfVar));
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ ory a(Object obj) {
        attf attfVar = (attf) obj;
        aopa createBuilder = ory.a.createBuilder();
        String n = n(attfVar);
        createBuilder.copyOnWrite();
        ory oryVar = (ory) createBuilder.instance;
        n.getClass();
        oryVar.b |= 1;
        oryVar.c = n;
        String m = m(attfVar);
        createBuilder.copyOnWrite();
        ory oryVar2 = (ory) createBuilder.instance;
        m.getClass();
        oryVar2.b |= 2;
        oryVar2.e = m;
        int o = o(attfVar);
        createBuilder.copyOnWrite();
        ory oryVar3 = (ory) createBuilder.instance;
        oryVar3.b |= 4;
        oryVar3.f = o;
        String str = attfVar.f;
        createBuilder.copyOnWrite();
        ory oryVar4 = (ory) createBuilder.instance;
        str.getClass();
        oryVar4.b |= 8;
        oryVar4.g = str;
        createBuilder.copyOnWrite();
        ory oryVar5 = (ory) createBuilder.instance;
        oryVar5.b |= 512;
        oryVar5.m = "";
        createBuilder.copyOnWrite();
        ory oryVar6 = (ory) createBuilder.instance;
        oryVar6.b |= 64;
        oryVar6.j = false;
        boolean z = attfVar.h;
        createBuilder.copyOnWrite();
        ory oryVar7 = (ory) createBuilder.instance;
        oryVar7.b |= 128;
        oryVar7.k = z;
        createBuilder.copyOnWrite();
        ory oryVar8 = (ory) createBuilder.instance;
        oryVar8.b |= 32;
        oryVar8.i = true;
        long millis = TimeUnit.SECONDS.toMillis(attfVar.g);
        createBuilder.copyOnWrite();
        ory oryVar9 = (ory) createBuilder.instance;
        oryVar9.b |= 256;
        oryVar9.l = millis;
        return (ory) createBuilder.mo39build();
    }

    @Override // defpackage.aijm
    public final aooq b() {
        return attg.a;
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String c(Object obj) {
        return m((attf) obj);
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ String d(Object obj) {
        return n((attf) obj);
    }

    @Override // defpackage.aijj
    public final /* bridge */ /* synthetic */ boolean e(Object obj, Object obj2) {
        attf attfVar = (attf) obj;
        attf attfVar2 = (attf) obj2;
        if (akzj.f(attfVar, attfVar2)) {
            return true;
        }
        String m = m(attfVar);
        int o = o(attfVar);
        String m2 = m(attfVar2);
        int o2 = o(attfVar2);
        if (!TextUtils.equals(m, m2)) {
            return false;
        }
        if (!TextUtils.equals("", m) && o != o2) {
            return false;
        }
        return TextUtils.equals(n(attfVar), n(attfVar2));
    }
}
