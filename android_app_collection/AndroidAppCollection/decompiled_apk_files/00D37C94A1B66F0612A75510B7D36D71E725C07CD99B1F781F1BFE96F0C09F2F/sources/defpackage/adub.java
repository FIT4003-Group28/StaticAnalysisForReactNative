package defpackage;
/* compiled from: PG */
/* renamed from: adub  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adub implements ampg {
    public final /* synthetic */ adui a;
    private final /* synthetic */ int b;

    public /* synthetic */ adub(adui aduiVar) {
        this.a = aduiVar;
    }

    public /* synthetic */ adub(adui aduiVar, int i) {
        this.b = i;
        this.a = aduiVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.b == 0) {
            adui aduiVar = this.a;
            aopa mo52toBuilder = ((awua) obj).mo52toBuilder();
            long c = aduiVar.f.c();
            mo52toBuilder.copyOnWrite();
            awua awuaVar = (awua) mo52toBuilder.instance;
            awuaVar.b |= 1;
            awuaVar.c = c;
            return (awua) mo52toBuilder.mo39build();
        }
        adui aduiVar2 = this.a;
        aopa mo52toBuilder2 = ((awua) obj).mo52toBuilder();
        String str = aduiVar2.j.b;
        long c2 = aduiVar2.f.c();
        StringBuilder sb = new StringBuilder(str.length() + 21);
        sb.append(str);
        sb.append(":");
        sb.append(c2);
        String sb2 = sb.toString();
        mo52toBuilder2.copyOnWrite();
        awua awuaVar2 = (awua) mo52toBuilder2.instance;
        sb2.getClass();
        aopu aopuVar = awuaVar2.e;
        if (!aopuVar.c()) {
            awuaVar2.e = aopi.mutableCopy(aopuVar);
        }
        awuaVar2.e.add(sb2);
        return (awua) mo52toBuilder2.mo39build();
    }
}
