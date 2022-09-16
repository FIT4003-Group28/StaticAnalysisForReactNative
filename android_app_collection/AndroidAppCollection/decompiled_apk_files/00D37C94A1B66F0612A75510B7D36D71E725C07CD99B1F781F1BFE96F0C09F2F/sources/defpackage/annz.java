package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: annz  reason: default package */
/* loaded from: classes.dex */
final class annz extends anmp {
    public annz(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqf) aopi.parseFrom(anqf.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        aopa createBuilder = anqe.a.createBuilder();
        aoob x = aoob.x(anum.a(((anqf) aoquVar).b));
        createBuilder.copyOnWrite();
        ((anqe) createBuilder.instance).c = x;
        createBuilder.copyOnWrite();
        ((anqe) createBuilder.instance).b = 0;
        return (anqe) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", anoa.j(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", anoa.j(16, 3));
        hashMap.put("AES256_GCM_SIV", anoa.j(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", anoa.j(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anus.a(((anqf) aoquVar).b);
    }
}
