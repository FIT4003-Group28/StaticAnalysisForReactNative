package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agbp  reason: default package */
/* loaded from: classes2.dex */
public final class agbp {
    public final dxio<cztz> a;
    public final Executor b;
    public final dxio<bbdv> c;
    @dzsi
    public final agxf d;
    @dzsi
    public final dlcv e;
    private final afzs f;

    public agbp(dxio<cztz> dxioVar, Executor executor, dxio<bbdv> dxioVar2, afzs afzsVar, @dzsi agxf agxfVar, @dzsi dlcv dlcvVar) {
        this.a = dxioVar;
        this.b = executor;
        this.c = dxioVar2;
        this.f = afzsVar;
        this.d = agxfVar;
        this.e = dlcvVar;
    }

    public final boolean a(ilo iloVar) {
        if (this.d != null && this.e != null && this.f.e()) {
            dqbi dqbiVar = iloVar.h().bg;
            if (dqbiVar == null) {
                dqbiVar = dqbi.g;
            }
            if (dqbiVar.e.size() > 0) {
                return true;
            }
        }
        return false;
    }
}
