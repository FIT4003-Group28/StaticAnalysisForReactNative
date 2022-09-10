package defpackage;

import android.graphics.RectF;
/* compiled from: PG */
/* renamed from: awha  reason: default package */
/* loaded from: classes3.dex */
final class awha implements degu<dvgg> {
    final /* synthetic */ deig a;
    final /* synthetic */ awhd b;

    public awha(awhd awhdVar, deig deigVar) {
        this.b = awhdVar;
        this.a = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        double d;
        double d2;
        double d3;
        awhd awhdVar = this.b;
        RectF b = awhdVar.f.b(awhdVar.d.getWidth(), awhdVar.d.getHeight(), awhdVar.c.d, awhdVar.e);
        float width = b.width();
        float height = b.height();
        avyx avyxVar = awhdVar.b;
        Double.isNaN(width);
        Double.isNaN(height);
        this.a.j(awhb.c(false, avyxVar.a((long) ((d2 / d) * (d3 / d)))));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dvgg dvggVar) {
        this.a.j(awhb.c(true, dvggVar.a / 1000000));
    }
}
