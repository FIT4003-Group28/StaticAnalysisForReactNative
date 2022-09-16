package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: annw  reason: default package */
/* loaded from: classes.dex */
final class annw extends anmp {
    public annw(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqd) aopi.parseFrom(anqd.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        aopa createBuilder = anqc.a.createBuilder();
        aoob x = aoob.x(anum.a(((anqd) aoquVar).b));
        createBuilder.copyOnWrite();
        ((anqc) createBuilder.instance).c = x;
        createBuilder.copyOnWrite();
        ((anqc) createBuilder.instance).b = 0;
        return (anqc) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", annx.i(16, 1));
        hashMap.put("AES128_GCM_RAW", annx.i(16, 3));
        hashMap.put("AES256_GCM", annx.i(32, 1));
        hashMap.put("AES256_GCM_RAW", annx.i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anus.a(((anqd) aoquVar).b);
    }
}
