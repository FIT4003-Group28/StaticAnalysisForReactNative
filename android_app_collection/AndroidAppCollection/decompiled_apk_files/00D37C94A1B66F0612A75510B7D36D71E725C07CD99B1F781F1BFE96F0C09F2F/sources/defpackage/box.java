package defpackage;
/* compiled from: PG */
/* renamed from: box  reason: default package */
/* loaded from: classes2.dex */
class box extends adn {
    protected hb[] m;
    String n;
    int o;
    int p;

    public box() {
        this.m = null;
        this.o = 0;
    }

    public box(box boxVar) {
        this.m = null;
        this.o = 0;
        this.n = boxVar.n;
        int i = boxVar.p;
        this.p = 0;
        this.m = iy.w(boxVar.m);
    }

    public hb[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public boolean h() {
        return false;
    }

    public void setPathData(hb[] hbVarArr) {
        if (!iy.u(this.m, hbVarArr)) {
            this.m = iy.w(hbVarArr);
            return;
        }
        hb[] hbVarArr2 = this.m;
        for (int i = 0; i < hbVarArr.length; i++) {
            hbVarArr2[i].a = hbVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = hbVarArr[i].b;
                if (i2 < fArr.length) {
                    hbVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
