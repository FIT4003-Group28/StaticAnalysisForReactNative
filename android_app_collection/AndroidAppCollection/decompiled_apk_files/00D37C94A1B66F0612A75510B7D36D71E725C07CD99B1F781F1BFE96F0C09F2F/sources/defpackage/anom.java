package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anom  reason: default package */
/* loaded from: classes.dex */
final class anom extends anmp {
    public anom(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anrw) aopi.parseFrom(anrw.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anrw anrwVar = (anrw) aoquVar;
        aopa createBuilder = anrv.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anrv) createBuilder.instance).b = 0;
        aoob x = aoob.x(anum.a(32));
        createBuilder.copyOnWrite();
        ((anrv) createBuilder.instance).c = x;
        return (anrv) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new anmo(anrw.a, 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new anmo(anrw.a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anrw anrwVar = (anrw) aoquVar;
    }
}
