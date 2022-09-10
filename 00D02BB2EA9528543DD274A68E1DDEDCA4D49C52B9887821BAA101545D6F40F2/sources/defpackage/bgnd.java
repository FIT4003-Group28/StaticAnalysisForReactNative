package defpackage;

import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgnd  reason: default package */
/* loaded from: classes3.dex */
public final class bgnd implements btzi<dipt, dipv> {
    public final bhhf a;
    public final String b;
    @dzsi
    public final Long c;
    @dzsi
    public final Long d;
    public final ilo e;
    @dzsi
    public dipt f;
    @dzsi
    public btzc g;
    @dzsi
    public dspd h = null;
    public final buuk i;
    private final bgpp j;

    public bgnd(buuk buukVar, bhhf bhhfVar, bgpp bgppVar, String str, Long l, Long l2, ilo iloVar) {
        this.i = buukVar;
        this.a = bhhfVar;
        this.j = bgppVar;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = iloVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dipt> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        this.f = null;
        this.j.a();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dipt> btzrVar, dipv dipvVar) {
        dipv dipvVar2 = dipvVar;
        bvrj.UI_THREAD.c();
        this.f = null;
        this.h = dipvVar2.b;
        dipo dipoVar = dipvVar2.a;
        if (dipoVar == null) {
            dipoVar = dipo.e;
        }
        if (dipoVar.c.size() <= 0) {
            this.j.a();
            return;
        }
        dipo dipoVar2 = dipvVar2.a;
        if (dipoVar2 == null) {
            dipoVar2 = dipo.e;
        }
        bgpp bgppVar = this.j;
        bgppVar.a.d = true;
        bgpt bgptVar = bgppVar.a;
        dsrj<dipk> dsrjVar = dipoVar2.c;
        int size = bgptVar.f.size();
        if (bgptVar.p != null) {
            size++;
        }
        int i = size;
        for (dipk dipkVar : dsrjVar) {
            List<bgns> list = bgptVar.f;
            bgow bgowVar = bgptVar.h;
            apnq apnqVar = bgptVar.i;
            HashSet<bgqj> hashSet = bgptVar.t;
            bgez bgezVar = bgptVar.n;
            dbsk.s(bgezVar);
            ilo iloVar = bgptVar.o;
            dbsk.s(iloVar);
            bgnk bgnkVar = bgptVar.q;
            dbsk.s(bgnkVar);
            list.add(bgowVar.a(dipkVar, false, i, apnqVar, hashSet, bgezVar, iloVar, bgnkVar, bgptVar.j));
            i++;
        }
        bgppVar.a.m();
    }
}
