package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bixy  reason: default package */
/* loaded from: classes3.dex */
public class bixy {
    public final btvo a;
    @dzsi
    public bixw b;
    @dzsi
    public bixw c;
    @dzsi
    public bixw d;
    private final bixx e;

    public bixy(btvo btvoVar, bixx bixxVar) {
        this.a = btvoVar;
        this.e = bixxVar;
    }

    public final void a() {
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final bixw b(ddho ddhoVar, List<dgia> list, ilo iloVar) {
        bixx bixxVar = this.e;
        dxio a = ((dxjh) bixxVar.a).a();
        bixx.a(a, 1);
        gce a2 = bixxVar.b.a();
        bixx.a(a2, 2);
        dxio a3 = ((dxjh) bixxVar.c).a();
        bixx.a(a3, 3);
        btvo a4 = bixxVar.d.a();
        bixx.a(a4, 4);
        gga a5 = bixxVar.e.a();
        bixx.a(a5, 5);
        bixx.a(list, 6);
        bixx.a(iloVar, 7);
        bixx.a(ddhoVar, 8);
        return new bixw(a, a2, a3, a4, a5, list, iloVar, ddhoVar);
    }
}
