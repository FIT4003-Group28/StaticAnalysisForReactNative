package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
/* compiled from: GlyphPathBag.java */
/* loaded from: classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Path> f4883a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int[][] f4884b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    private final Paint f4885c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Paint paint) {
        this.f4885c = paint;
        this.f4883a.add(new Path());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a(char c2, String str) {
        Path path;
        int a2 = a(c2);
        if (a2 != 0) {
            path = this.f4883a.get(a2);
        } else {
            Path path2 = new Path();
            this.f4885c.getTextPath(str, 0, 1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, path2);
            int i = c2 >> '\b';
            int[] iArr = this.f4884b[i];
            if (iArr == null) {
                int[] iArr2 = new int[256];
                this.f4884b[i] = iArr2;
                iArr = iArr2;
            }
            iArr[c2 & 255] = this.f4883a.size();
            this.f4883a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }

    private int a(char c2) {
        int[] iArr = this.f4884b[c2 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c2 & 255];
    }
}
