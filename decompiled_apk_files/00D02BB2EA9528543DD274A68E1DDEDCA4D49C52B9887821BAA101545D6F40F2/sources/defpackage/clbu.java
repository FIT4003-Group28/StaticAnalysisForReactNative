package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.viewer.client.Dimensions;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: clbu  reason: default package */
/* loaded from: classes5.dex */
public final class clbu {
    public static final Dimensions a = new Dimensions(800, 800);
    public static final claz b = new claz();
    public final claz c;
    public final Dimensions d;
    public final int e;
    public final Bitmap[] f;
    public final clbs[] g;
    public clbr h;
    public final HashSet<Integer> i;
    public final clby j;
    private final String k;

    public clbu(int i, Dimensions dimensions, claz clazVar, clby clbyVar) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("TileBoard #");
        sb.append(i);
        String sb2 = sb.toString();
        int i2 = dimensions.b;
        Dimensions dimensions2 = a;
        int i3 = (i2 - 1) / dimensions2.b;
        int i4 = ((dimensions.a - 1) / dimensions2.a) + 1;
        this.k = sb2;
        this.c = clazVar;
        this.d = dimensions;
        this.e = i4;
        int i5 = (i3 + 1) * i4;
        this.f = new Bitmap[i5];
        this.g = new clbs[i5];
        this.i = new HashSet<>(i5);
        this.j = clbyVar;
    }

    public final int a() {
        return this.f.length;
    }

    public final int b() {
        return a() / this.e;
    }

    public final void c() {
        Bitmap[] bitmapArr;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Bitmap bitmap : this.f) {
            if (bitmap != null) {
                claz.c(bitmap);
                sb.append(i);
                sb.append(",");
            }
            i++;
        }
        int length = this.f.length;
    }

    protected final void finalize() {
        super.finalize();
        int i = 0;
        for (Bitmap bitmap : this.f) {
            if (bitmap != null) {
                String valueOf = String.valueOf(this.g[i]);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                sb.append("Finalize -- Memory leak candidate (bitmap not null) ");
                sb.append(valueOf);
                sb.toString();
            }
            i++;
        }
    }

    public final String toString() {
        return String.format(String.valueOf(this.k).concat(" (%s x %s), vis: %s"), Integer.valueOf(b()), Integer.valueOf(this.e), this.h);
    }
}
