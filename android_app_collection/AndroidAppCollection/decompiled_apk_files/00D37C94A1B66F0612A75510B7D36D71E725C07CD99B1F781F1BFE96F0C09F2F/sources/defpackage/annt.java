package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: annt  reason: default package */
/* loaded from: classes.dex */
final class annt extends anmp {
    public annt(Class cls) {
        super(cls);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ aoqu a(aoob aoobVar) {
        return (anqa) aopi.parseFrom(anqa.a, aoobVar, aoos.a());
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ Object b(aoqu aoquVar) {
        anqa anqaVar = (anqa) aoquVar;
        aopa createBuilder = anpz.a.createBuilder();
        aoob x = aoob.x(anum.a(anqaVar.c));
        createBuilder.copyOnWrite();
        ((anpz) createBuilder.instance).d = x;
        anqb anqbVar = anqaVar.b;
        if (anqbVar == null) {
            anqbVar = anqb.a;
        }
        createBuilder.copyOnWrite();
        anqbVar.getClass();
        ((anpz) createBuilder.instance).c = anqbVar;
        createBuilder.copyOnWrite();
        ((anpz) createBuilder.instance).b = 0;
        return (anpz) createBuilder.mo39build();
    }

    @Override // defpackage.anmp
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", annu.i(16, 1));
        hashMap.put("AES128_EAX_RAW", annu.i(16, 3));
        hashMap.put("AES256_EAX", annu.i(32, 1));
        hashMap.put("AES256_EAX_RAW", annu.i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anmp
    public final /* bridge */ /* synthetic */ void d(aoqu aoquVar) {
        anqa anqaVar = (anqa) aoquVar;
        anus.a(anqaVar.c);
        anqb anqbVar = anqaVar.b;
        if (anqbVar == null) {
            anqbVar = anqb.a;
        }
        if (anqbVar.b != 12) {
            anqb anqbVar2 = anqaVar.b;
            if (anqbVar2 == null) {
                anqbVar2 = anqb.a;
            }
            if (anqbVar2.b != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
