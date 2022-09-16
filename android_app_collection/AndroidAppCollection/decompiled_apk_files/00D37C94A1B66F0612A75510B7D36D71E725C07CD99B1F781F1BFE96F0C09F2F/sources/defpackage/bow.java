package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bow  reason: default package */
/* loaded from: classes2.dex */
public final class bow extends adn {
    final Matrix a;
    final ArrayList b;
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

    public bow() {
        this.a = new Matrix();
        this.b = new ArrayList();
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

    @Override // defpackage.adn
    public final boolean e() {
        for (int i = 0; i < this.b.size(); i++) {
            if (((adn) this.b.get(i)).e()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.adn
    public final boolean f(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.b.size(); i++) {
            z |= ((adn) this.b.get(i)).f(iArr);
        }
        return z;
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

    public final void h() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            h();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            h();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            h();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            h();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            h();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            h();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            h();
        }
    }

    public bow(bow bowVar, afw afwVar) {
        box bouVar;
        this.a = new Matrix();
        this.b = new ArrayList();
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
        this.c = bowVar.c;
        this.d = bowVar.d;
        this.e = bowVar.e;
        this.f = bowVar.f;
        this.g = bowVar.g;
        this.h = bowVar.h;
        this.i = bowVar.i;
        int[] iArr = bowVar.l;
        this.l = null;
        String str = bowVar.m;
        this.m = str;
        int i = bowVar.k;
        this.k = 0;
        if (str != null) {
            afwVar.put(str, this);
        }
        matrix.set(bowVar.j);
        ArrayList arrayList = bowVar.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof bow) {
                this.b.add(new bow((bow) obj, afwVar));
            } else {
                if (obj instanceof bov) {
                    bouVar = new bov((bov) obj);
                } else if (obj instanceof bou) {
                    bouVar = new bou((bou) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(bouVar);
                Object obj2 = bouVar.n;
                if (obj2 != null) {
                    afwVar.put(obj2, bouVar);
                }
            }
        }
    }
}
