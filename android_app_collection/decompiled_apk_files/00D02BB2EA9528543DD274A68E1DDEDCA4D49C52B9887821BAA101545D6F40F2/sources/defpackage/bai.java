package defpackage;
/* compiled from: PG */
/* renamed from: bai  reason: default package */
/* loaded from: classes.dex */
class bai extends bah {
    protected kf[] m;
    String n;
    int o;
    int p;

    public bai() {
        this.m = null;
        this.o = 0;
    }

    public bai(bai baiVar) {
        this.m = null;
        this.o = 0;
        this.n = baiVar.n;
        int i = baiVar.p;
        this.p = 0;
        this.m = kg.b(baiVar.m);
    }

    public boolean a() {
        return false;
    }

    public kf[] getPathData() {
        return this.m;
    }

    public String getPathName() {
        return this.n;
    }

    public void setPathData(kf[] kfVarArr) {
        if (!kg.c(this.m, kfVarArr)) {
            this.m = kg.b(kfVarArr);
            return;
        }
        kf[] kfVarArr2 = this.m;
        for (int i = 0; i < kfVarArr.length; i++) {
            kfVarArr2[i].a = kfVarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = kfVarArr[i].b;
                if (i2 < fArr.length) {
                    kfVarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }
}
