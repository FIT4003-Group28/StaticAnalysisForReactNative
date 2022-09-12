package defpackage;

import java.io.File;
/* compiled from: PG */
/* renamed from: pnm  reason: default package */
/* loaded from: classes.dex */
public final class pnm {
    final dcdn<Integer, pny> a;
    @dzsi
    final File b;
    public final dcdn<pnu, String> c;

    public pnm(dcdn<Integer, pny> dcdnVar, @dzsi File file, dcdn<pnu, String> dcdnVar2) {
        this.a = dcdnVar;
        this.b = file;
        this.c = dcdnVar2;
    }

    public final dbsg<pob> a(int i, String str) {
        pny pnyVar = this.a.get(Integer.valueOf(i));
        return pnyVar != null ? pnyVar.a(str) : dbpy.a;
    }
}
