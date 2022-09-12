package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bag  reason: default package */
/* loaded from: classes.dex */
public final class bag extends bah {
    final Matrix a;
    final ArrayList<bah> b;
    float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    final Matrix j;
    int k;
    public int[] l;
    public String m;

    public bag() {
        this.a = new Matrix();
        this.b = new ArrayList<>();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public final void a() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    @Override // defpackage.bah
    public final boolean b() {
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bah
    public final boolean c(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= this.b.get(i).c(iArr);
        }
        return true == z;
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            a();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            a();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            a();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            a();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            a();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            a();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            a();
        }
    }

    public bag(bag bagVar, aif<String, Object> aifVar) {
        bai baeVar;
        this.a = new Matrix();
        this.b = new ArrayList<>();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.c = bagVar.c;
        this.d = bagVar.d;
        this.e = bagVar.e;
        this.f = bagVar.f;
        this.g = bagVar.g;
        this.h = bagVar.h;
        this.i = bagVar.i;
        int[] iArr = bagVar.l;
        this.l = null;
        String str = bagVar.m;
        this.m = str;
        int i = bagVar.k;
        this.k = 0;
        if (str != null) {
            aifVar.put(str, this);
        }
        matrix.set(bagVar.j);
        ArrayList<bah> arrayList = bagVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bah bahVar = arrayList.get(i2);
            if (bahVar instanceof bag) {
                this.b.add(new bag((bag) bahVar, aifVar));
            } else {
                if (bahVar instanceof baf) {
                    baeVar = new baf((baf) bahVar);
                } else if (bahVar instanceof bae) {
                    baeVar = new bae((bae) bahVar);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(baeVar);
                String str2 = baeVar.n;
                if (str2 != null) {
                    aifVar.put(str2, baeVar);
                }
            }
        }
    }
}
