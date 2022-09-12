package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnc  reason: default package */
/* loaded from: classes3.dex */
public final class bnc {
    public final List<blu> a;
    public PointF b;
    public boolean c;

    public bnc() {
        this.a = new ArrayList();
    }

    public final String toString() {
        int size = this.a.size();
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(44);
        sb.append("ShapeData{numCurves=");
        sb.append(size);
        sb.append("closed=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public bnc(PointF pointF, boolean z, List<blu> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }
}
