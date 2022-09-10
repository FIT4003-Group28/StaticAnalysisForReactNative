package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: andh  reason: default package */
/* loaded from: classes2.dex */
final class andh implements akzy {
    final /* synthetic */ andm a;

    public andh(andm andmVar) {
        this.a = andmVar;
    }

    @Override // defpackage.akzy
    public final void a(alad aladVar) {
        andm andmVar = this.a;
        akqq akqqVar = aladVar.i;
        andmVar.aR(akqqVar);
        ilo iloVar = andmVar.c;
        if (iloVar == null || andmVar.b) {
            return;
        }
        akqq aj = iloVar.aj();
        if (aj != null) {
            float[] fArr = new float[1];
            Location.distanceBetween(aj.a, aj.b, akqqVar.a, akqqVar.b, fArr);
            if (fArr[0] < 10.0f) {
                return;
            }
        }
        andmVar.c = null;
    }
}
