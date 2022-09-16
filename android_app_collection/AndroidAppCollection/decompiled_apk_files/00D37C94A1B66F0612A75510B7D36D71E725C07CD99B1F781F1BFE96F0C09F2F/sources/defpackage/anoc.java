package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anoc  reason: default package */
/* loaded from: classes.dex */
final class anoc extends anmp {
    public anoc(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqj) aopi.parseFrom(anqj.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anqj anqjVar = (anqj) aoquVar;
        aopa createBuilder = anqi.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqi) createBuilder.instance).b = 0;
        aoob x = aoob.x(anum.a(32));
        createBuilder.copyOnWrite();
        ((anqi) createBuilder.instance).c = x;
        return (anqi) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new anmo(anqj.a, 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new anmo(anqj.a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anqj anqjVar = (anqj) aoquVar;
    }
}
