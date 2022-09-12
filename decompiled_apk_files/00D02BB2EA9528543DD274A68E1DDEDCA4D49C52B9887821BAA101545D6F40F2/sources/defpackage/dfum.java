package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: dfum  reason: default package */
/* loaded from: classes6.dex */
public final class dfum {
    public final dfuh a;
    private final Resources c;
    private float d = 1.0f;
    private float e = 0.0f;
    private float f = 1.0f;
    private float h = 1.0f;
    private float g = 0.3f;
    private float i = 0.15f;
    public boolean b = false;
    private boolean j = false;

    public dfum(dfuh dfuhVar, Resources resources) {
        this.a = dfuhVar;
        this.c = resources;
    }

    public final dftn a() {
        dftm bZ = dftn.l.bZ();
        float f = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dftn dftnVar = (dftn) bZ.b;
        int i = dftnVar.a | 1;
        dftnVar.a = i;
        dftnVar.b = f;
        float f2 = this.e;
        int i2 = i | 2;
        dftnVar.a = i2;
        dftnVar.c = f2;
        float f3 = this.f;
        int i3 = i2 | 16;
        dftnVar.a = i3;
        dftnVar.f = f3;
        float f4 = this.h;
        int i4 = i3 | 128;
        dftnVar.a = i4;
        dftnVar.i = f4;
        float f5 = this.g;
        int i5 = i4 | 32;
        dftnVar.a = i5;
        dftnVar.g = f5;
        float f6 = this.i;
        int i6 = i5 | 64;
        dftnVar.a = i6;
        dftnVar.h = f6;
        boolean z = this.b;
        int i7 = i6 | 4;
        dftnVar.a = i7;
        dftnVar.d = z;
        dftnVar.a = i7 | 8;
        dftnVar.e = true;
        float f7 = this.c.getDisplayMetrics().density;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dftn dftnVar2 = (dftn) bZ.b;
        int i8 = dftnVar2.a | 256;
        dftnVar2.a = i8;
        dftnVar2.j = f7;
        boolean z2 = this.j;
        dftnVar2.a = i8 | 512;
        dftnVar2.k = z2;
        return bZ.bK();
    }

    public final ValueAnimator b(String str, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, str, f);
        ofFloat.setDuration(this.c.getInteger(17694720));
        ofFloat.addUpdateListener(new dful(this));
        return ofFloat;
    }

    public boolean getHideNavArrows() {
        return this.j;
    }

    public float getPhotoAOpacity() {
        return this.d;
    }

    public float getPhotoBOpacity() {
        return this.e;
    }

    public float getRailWidthMeters() {
        return this.i;
    }

    public float getRoadLabelOpacity() {
        return this.f;
    }

    public float getUiNavArrowOpacity() {
        return this.h;
    }

    public float getUiSwipeRailOpacity() {
        return this.g;
    }

    public void setHideNavArrows(boolean z) {
        this.j = z;
    }

    public void setPhotoAOpacity(float f) {
        this.d = f;
    }

    public void setPhotoBOpacity(float f) {
        this.e = f;
    }

    public void setRailWidthMeters(float f) {
        this.i = f;
    }

    public void setRoadLabelOpacity(float f) {
        this.f = f;
    }

    public void setUiNavArrowOpacity(float f) {
        this.h = f;
    }

    public void setUiSwipeRailOpacity(float f) {
        this.g = f;
    }
}
