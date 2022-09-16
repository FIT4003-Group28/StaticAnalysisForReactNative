package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ansd  reason: default package */
/* loaded from: classes.dex */
final class ansd extends anmp {
    public ansd(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqu) aopi.parseFrom(anqu.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anqu anquVar = (anqu) aoquVar;
        byte[] a = anum.a(32);
        if (a.length != 32) {
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }
        byte[] f = antu.f(antu.e(a));
        aopa createBuilder = anqw.a.createBuilder();
        createBuilder.copyOnWrite();
        ((anqw) createBuilder.instance).b = 0;
        aoob x = aoob.x(Arrays.copyOf(f, 32));
        createBuilder.copyOnWrite();
        ((anqw) createBuilder.instance).c = x;
        anqw anqwVar = (anqw) createBuilder.mo39build();
        aopa createBuilder2 = anqv.a.createBuilder();
        createBuilder2.copyOnWrite();
        ((anqv) createBuilder2.instance).b = 0;
        aoob x2 = aoob.x(Arrays.copyOf(a, 32));
        createBuilder2.copyOnWrite();
        ((anqv) createBuilder2.instance).c = x2;
        createBuilder2.copyOnWrite();
        anqwVar.getClass();
        ((anqv) createBuilder2.instance).d = anqwVar;
        return (anqv) createBuilder2.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("ED25519", new anmo(anqu.a, 1));
        hashMap.put("ED25519_RAW", new anmo(anqu.a, 3));
        hashMap.put("ED25519WithRawOutput", new anmo(anqu.a, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anqu anquVar = (anqu) aoquVar;
    }
}
