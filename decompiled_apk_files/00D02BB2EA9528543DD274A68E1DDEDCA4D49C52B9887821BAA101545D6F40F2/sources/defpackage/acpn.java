package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: acpn  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class acpn {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ImageView.ScaleType.values().length];
        a = iArr;
        try {
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ImageView.ScaleType.FIT_XY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[ImageView.ScaleType.FIT_START.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
