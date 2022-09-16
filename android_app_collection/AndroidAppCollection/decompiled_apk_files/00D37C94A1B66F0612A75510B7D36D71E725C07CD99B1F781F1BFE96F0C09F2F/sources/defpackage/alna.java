package defpackage;
/* compiled from: PG */
/* renamed from: alna  reason: default package */
/* loaded from: classes.dex */
public final class alna extends anlz {
    @Override // defpackage.anlz
    public final void a(alnm alnmVar, float f, float f2) {
        alnmVar.f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        alni alniVar = new alni(0.0f, 0.0f, f3, f3);
        alniVar.e = 180.0f;
        alniVar.f = 90.0f;
        alnmVar.f.add(alniVar);
        alnmVar.b(new alng(alniVar), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        alnmVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        alnmVar.c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
