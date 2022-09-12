package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: itk  reason: default package */
/* loaded from: classes6.dex */
final class itk {
    public final int[] a = new int[2];
    public final View b;
    public final Rect c;

    public itk(View view, Rect rect) {
        this.b = view;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof itk)) {
                return false;
            }
            itk itkVar = (itk) obj;
            return dzvx.d(this.b, itkVar.b) && dzvx.d(this.c, itkVar.c);
        }
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LocationOnScreen(view=" + this.b + ", location=" + this.c + ")";
    }
}
