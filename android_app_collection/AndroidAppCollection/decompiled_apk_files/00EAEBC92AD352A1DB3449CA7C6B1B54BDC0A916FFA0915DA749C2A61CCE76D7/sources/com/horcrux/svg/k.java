package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
/* loaded from: classes.dex */
class k {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Path> f9629a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int[][] f9630b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    private final Paint f9631c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Paint paint) {
        this.f9631c = paint;
        this.f9629a.add(new Path());
    }

    private int a(char c2) {
        int[] iArr = this.f9630b[c2 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c2 & 255];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a(char c2, String str) {
        Path path;
        int a2 = a(c2);
        if (a2 != 0) {
            path = this.f9629a.get(a2);
        } else {
            Path path2 = new Path();
            this.f9631c.getTextPath(str, 0, 1, 0.0f, 0.0f, path2);
            int[][] iArr = this.f9630b;
            int i = c2 >> '\b';
            int[] iArr2 = iArr[i];
            if (iArr2 == null) {
                iArr2 = new int[256];
                iArr[i] = iArr2;
            }
            iArr2[c2 & 255] = this.f9629a.size();
            this.f9629a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
