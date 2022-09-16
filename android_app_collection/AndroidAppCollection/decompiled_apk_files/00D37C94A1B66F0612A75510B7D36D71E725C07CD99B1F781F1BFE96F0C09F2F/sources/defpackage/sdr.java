package defpackage;

import android.graphics.Paint;
/* compiled from: PG */
/* renamed from: sdr  reason: default package */
/* loaded from: classes4.dex */
public final class sdr extends sds {
    private static final float n(sdq sdqVar, set setVar, int i) {
        float round = Math.round(setVar.a(sdqVar.a));
        float c = setVar.c();
        if (c > 0.0f) {
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 2) {
                int i3 = sdqVar.i;
                if (i3 == 0) {
                    return round - (c / 2.0f);
                }
                if (i3 == 1) {
                    return round + (c / 2.0f);
                }
            } else {
                int i4 = sdqVar.i;
                if (i4 == 0) {
                    return round + (c / 2.0f);
                }
                if (i4 == 1) {
                    return round - (c / 2.0f);
                }
            }
        }
        return round;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sdn
    public final void f(sdm sdmVar, set setVar, set setVar2, int i) {
        super.f(sdmVar, setVar, setVar2, i);
        sdq sdqVar = (sdq) sdmVar;
        float n = n(sdqVar, setVar, i);
        sdqVar.a((setVar2 == null || !setVar2.o(sdqVar.a)) ? n : n(sdqVar, setVar2, i));
        sdqVar.b(n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sdn
    public final void i(sdm sdmVar, sdm sdmVar2, set setVar, int i) {
        super.i(sdmVar, sdmVar2, setVar, i);
        sdq sdqVar = (sdq) sdmVar;
        sdqVar.i = ((sdq) sdmVar2).i;
        sdqVar.b(n(sdqVar, setVar, i));
    }

    @Override // defpackage.sdn
    protected final sdm k(Object obj, CharSequence charSequence, int i, int i2) {
        sdq sdqVar = new sdq(obj, charSequence);
        sdqVar.i = i == 0 ? 0 : i == i2 + (-1) ? 1 : 2;
        return sdqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.sds
    public final Paint.Align l(int i, float f, sdm sdmVar) {
        int i2 = ((sdq) sdmVar).i;
        int i3 = i - 1;
        if (i != 0) {
            if (i3 == 0 || i3 == 2) {
                if (f == 0.0f) {
                    if (i2 == 0) {
                        return Paint.Align.LEFT;
                    }
                    if (i2 == 1) {
                        return Paint.Align.RIGHT;
                    }
                }
            } else if (f == 90.0f) {
                if (i2 == 0) {
                    return Paint.Align.LEFT;
                }
                if (i2 == 1) {
                    return Paint.Align.RIGHT;
                }
            } else if (f == -90.0f) {
                if (i2 == 0) {
                    return Paint.Align.RIGHT;
                }
                if (i2 == 1) {
                    return Paint.Align.LEFT;
                }
            }
            return super.l(i, f, sdmVar);
        }
        throw null;
    }
}
