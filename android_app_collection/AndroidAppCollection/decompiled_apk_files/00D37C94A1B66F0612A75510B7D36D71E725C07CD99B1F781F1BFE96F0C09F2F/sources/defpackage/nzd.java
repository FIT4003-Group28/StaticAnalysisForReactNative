package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: nzd  reason: default package */
/* loaded from: classes3.dex */
public final class nzd implements oai {
    private static final Rect b = new Rect(0, 0, 2, 2);
    public oai a;
    private final nxi c;
    private final nze d;

    public nzd(nxi nxiVar, nze nzeVar) {
        this.c = nxiVar;
        this.d = nzeVar;
    }

    @Override // defpackage.oai
    public final Rect a() {
        oai oaiVar = this.a;
        if (oaiVar == null) {
            return b;
        }
        Rect a = oaiVar.a();
        return (a.width() > 1 || a.height() > 1) ? a : b;
    }

    public final boolean b() {
        if (this.d.b()) {
            return true;
        }
        oai oaiVar = this.a;
        if (oaiVar == null) {
            return !this.c.g() || this.c.f();
        }
        nzy nzyVar = (nzy) oaiVar;
        return (!nzyVar.a.d() && !nzyVar.a.e()) || (nzyVar.a.e() && nzyVar.f != null);
    }
}
