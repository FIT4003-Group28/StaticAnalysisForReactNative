package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: cknd  reason: default package */
/* loaded from: classes4.dex */
public final class cknd implements ckqd {
    private final dwfl a;
    private final String b;
    private final double c;

    public cknd(dwfl dwflVar) {
        this.a = dwflVar;
        dizh dizhVar = dwflVar.p;
        dghk dghkVar = (dizhVar == null ? dizh.j : dizhVar).c;
        dghg dghgVar = (dghkVar == null ? dghk.g : dghkVar).f;
        this.b = (dghgVar == null ? dghg.b : dghgVar).a;
        dizh dizhVar2 = dwflVar.p;
        diis diisVar = (dizhVar2 == null ? dizh.j : dizhVar2).g;
        dikg dikgVar = (diisVar == null ? diis.h : diisVar).g;
        double d = (dikgVar == null ? dikg.d : dikgVar).c;
        Double.isNaN(d);
        this.c = d * 1.3d;
    }

    @Override // defpackage.ckqd
    public final String a(String str, int i, int i2, @dzsi ImageView.ScaleType scaleType) {
        int i3 = i * i2;
        if (!ckob.b(this.a) || dbsj.d(this.b)) {
            return str;
        }
        double d = this.c;
        return (d <= dcyn.a || ((double) i3) <= d) ? str : this.b;
    }
}
