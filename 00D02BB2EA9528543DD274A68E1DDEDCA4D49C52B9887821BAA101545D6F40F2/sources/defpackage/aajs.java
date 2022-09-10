package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aajs  reason: default package */
/* loaded from: classes2.dex */
public final class aajs {
    private final Activity a;

    public aajs(Activity activity) {
        this.a = activity;
    }

    public final dijh a(boolean z) {
        dhkd e = bfki.e(this.a);
        dhkc bZ = dhkd.d.bZ();
        int a = jmj.a(this.a, 200);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar = (dhkd) bZ.b;
        dhkdVar.a |= 2;
        dhkdVar.c = a;
        int a2 = jmj.a(this.a, e.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhkd dhkdVar2 = (dhkd) bZ.b;
        dhkdVar2.a |= 1;
        dhkdVar2.b = a2;
        dhkd bK = bZ.bK();
        dijh bZ2 = diji.e.bZ();
        diwc bZ3 = diwd.j.bZ();
        int i = akga.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        diwd diwdVar = (diwd) bZ3.b;
        int i2 = diwdVar.a | 2;
        diwdVar.a = i2;
        diwdVar.b = i;
        e.getClass();
        diwdVar.c = e;
        int i3 = i2 | 4;
        diwdVar.a = i3;
        bK.getClass();
        diwdVar.d = bK;
        int i4 = i3 | 8;
        diwdVar.a = i4;
        diwdVar.a = i4 | 16;
        diwdVar.e = true;
        diwd.b((diwd) bZ3.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        diwd diwdVar2 = (diwd) bZ3.b;
        diwdVar2.a |= 4096;
        diwdVar2.i = true;
        diwd diwdVar3 = (diwd) bZ3.b;
        int i5 = diwdVar3.a | 64;
        diwdVar3.a = i5;
        diwdVar3.f = z;
        diwdVar3.a = i5 | 256;
        diwdVar3.g = true;
        diwd diwdVar4 = (diwd) bZ3.b;
        diwdVar4.a |= 1024;
        diwdVar4.h = true;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        diji dijiVar = (diji) bZ2.b;
        diwd bK2 = bZ3.bK();
        bK2.getClass();
        dijiVar.d = bK2;
        dijiVar.a |= 4;
        return bZ2;
    }
}
