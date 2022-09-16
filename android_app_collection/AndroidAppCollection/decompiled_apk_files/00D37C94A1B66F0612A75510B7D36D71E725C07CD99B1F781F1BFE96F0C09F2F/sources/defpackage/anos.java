package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anos  reason: default package */
/* loaded from: classes.dex */
final class anos extends anmp {
    public anos(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqh) aopi.parseFrom(anqh.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        aopa createBuilder = anqg.a.createBuilder();
        aoob x = aoob.x(anum.a(((anqh) aoquVar).b));
        createBuilder.copyOnWrite();
        ((anqg) createBuilder.instance).c = x;
        createBuilder.copyOnWrite();
        ((anqg) createBuilder.instance).b = 0;
        return (anqg) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        aopa createBuilder = anqh.a.createBuilder();
        createBuilder.copyOnWrite();
        anqh.a((anqh) createBuilder.instance);
        hashMap.put("AES256_SIV", new anmo((anqh) createBuilder.mo39build(), 1));
        aopa createBuilder2 = anqh.a.createBuilder();
        createBuilder2.copyOnWrite();
        anqh.a((anqh) createBuilder2.instance);
        hashMap.put("AES256_SIV_RAW", new anmo((anqh) createBuilder2.mo39build(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        int i = ((anqh) aoquVar).b;
        if (i == 64) {
            return;
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(i);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
