package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: scp  reason: default package */
/* loaded from: classes4.dex */
public final class scp {
    final List a;
    final int b;
    final scx c;
    final set d;
    final scx e;
    final scx f;
    final set g;

    public scp(List list, int i, scx scxVar, set setVar, scx scxVar2, scx scxVar3, set setVar2) {
        sho.g(list, "data");
        sho.g(scxVar, "domains");
        sho.g(setVar, "domainScale");
        sho.g(scxVar2, "measures");
        sho.g(scxVar3, "measureOffsets");
        sho.g(setVar2, "measureScale");
        boolean z = true;
        sho.a(i <= list.size(), "Claiming to use more data than given.");
        sho.a(i == scxVar.c, "domain size doesn't match data");
        sho.a(i == scxVar2.c, "measures size doesn't match data");
        sho.a(i != scxVar3.c ? false : z, "measureOffsets size doesn't match data");
        this.a = list;
        this.b = i;
        this.c = scxVar;
        this.d = setVar;
        this.e = scxVar2;
        this.f = scxVar3;
        this.g = setVar2;
    }
}
