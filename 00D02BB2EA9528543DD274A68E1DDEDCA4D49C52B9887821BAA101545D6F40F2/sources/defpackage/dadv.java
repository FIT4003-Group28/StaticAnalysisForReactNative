package defpackage;
/* compiled from: PG */
/* renamed from: dadv  reason: default package */
/* loaded from: classes.dex */
public final class dadv extends dadl {
    @Override // defpackage.dadl
    public final void a(daeh daehVar, float f, float f2) {
        daehVar.f(f2 * f, 180.0f, 90.0f);
        float f3 = (f2 + f2) * f;
        daed daedVar = new daed(0.0f, 0.0f, f3, f3);
        daedVar.e = 180.0f;
        daedVar.f = 90.0f;
        daehVar.f.add(daedVar);
        daehVar.d(new daeb(daedVar), 180.0f, 270.0f);
        float f4 = f3 + 0.0f;
        float f5 = 0.5f * f4;
        float f6 = f4 / 2.0f;
        daehVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        daehVar.c = f5 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
