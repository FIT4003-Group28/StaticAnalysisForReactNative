package defpackage;

import android.app.Application;
import java.util.List;
/* compiled from: PG */
/* renamed from: wsm  reason: default package */
/* loaded from: classes7.dex */
public class wsm {
    private final dzsj<Application> a;
    private final dzsj<dxio<qbt>> b;
    private final dzsj<btvo> c;
    private final dzsj<cqat> d;
    private final dzsj<zuz> e;
    private final dzsj<wsg> f;
    private final dzsj<xax> g;
    private final dzsj<vtn> h;
    private final dzsj<xcq> i;
    private final dzsj<xcr> j;
    private final dzsj<xaz> k;
    private final dzsj<cqhn> l;

    public wsm(dzsj<Application> dzsjVar, dzsj<dxio<qbt>> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<zuz> dzsjVar5, dzsj<wsg> dzsjVar6, dzsj<xax> dzsjVar7, dzsj<vtn> dzsjVar8, dzsj<xcq> dzsjVar9, dzsj<xcr> dzsjVar10, dzsj<xaz> dzsjVar11, dzsj<cqhn> dzsjVar12) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final wsl a(@dzsi akqi akqiVar, @dzsi String str, @dzsi dnoh dnohVar, @dzsi akqi akqiVar2, dooj doojVar, @dzsi zef zefVar, dool doolVar, @dzsi String str2, @dzsi Long l, wsk wskVar, List<dood> list, @dzsi ddho ddhoVar, @dzsi ddho ddhoVar2, @dzsi String str3, int i, @dzsi xmw xmwVar, boolean z, boolean z2, boolean z3) {
        Application a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        btvo a3 = this.c.a();
        b(a3, 3);
        cqat a4 = this.d.a();
        b(a4, 4);
        wsg a5 = this.f.a();
        b(a5, 6);
        xax a6 = this.g.a();
        b(a6, 7);
        vtn a7 = this.h.a();
        b(a7, 8);
        xcq a8 = this.i.a();
        b(a8, 9);
        xcr a9 = this.j.a();
        b(a9, 10);
        xaz a10 = this.k.a();
        b(a10, 11);
        cqhn a11 = this.l.a();
        b(a11, 12);
        b(doojVar, 17);
        b(doolVar, 19);
        b(wskVar, 23);
        b(list, 24);
        return new wsl(a, a2, a3, a4, this.e.a(), a5, a6, a7, a8, a9, a10, a11, akqiVar, str, dnohVar, akqiVar2, doojVar, zefVar, doolVar, str2, false, l, wskVar, list, ddhoVar, ddhoVar2, str3, i, xmwVar, z, z2, z3);
    }
}
