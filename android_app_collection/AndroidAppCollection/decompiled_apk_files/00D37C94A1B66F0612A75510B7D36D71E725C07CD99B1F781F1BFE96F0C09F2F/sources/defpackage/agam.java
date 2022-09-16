package defpackage;

import android.graphics.Bitmap;
/* compiled from: PG */
/* renamed from: agam  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class agam implements ampg {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ agam(int i, int i2, boolean z, int i3) {
        this.d = i3;
        this.b = i;
        this.c = i2;
        this.a = z;
    }

    public /* synthetic */ agam(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        if (this.d == 0) {
            boolean z = this.a;
            int i = this.b;
            int i2 = this.c;
            Bitmap bitmap = (Bitmap) obj;
            return (!z || bitmap == null) ? bitmap : (bitmap.getWidth() == i && bitmap.getHeight() == i2) ? bitmap : Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        int i3 = this.b;
        int i4 = this.c;
        boolean z2 = this.a;
        egw egwVar = (egw) obj;
        aopa mo52toBuilder = egwVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        egw egwVar2 = (egw) mo52toBuilder.instance;
        egwVar2.b |= 1;
        egwVar2.c = true;
        mo52toBuilder.copyOnWrite();
        egw egwVar3 = (egw) mo52toBuilder.instance;
        egwVar3.b |= 128;
        egwVar3.j = false;
        mo52toBuilder.copyOnWrite();
        egw egwVar4 = (egw) mo52toBuilder.instance;
        egwVar4.b |= 2;
        egwVar4.d = i3;
        mo52toBuilder.copyOnWrite();
        egw egwVar5 = (egw) mo52toBuilder.instance;
        egwVar5.b |= 4;
        egwVar5.e = i4;
        mo52toBuilder.copyOnWrite();
        egw egwVar6 = (egw) mo52toBuilder.instance;
        egwVar6.b |= 8;
        egwVar6.f = z2;
        boolean z3 = egwVar.l;
        mo52toBuilder.copyOnWrite();
        egw egwVar7 = (egw) mo52toBuilder.instance;
        egwVar7.b |= 512;
        egwVar7.l = true;
        return (egw) mo52toBuilder.mo39build();
    }
}
