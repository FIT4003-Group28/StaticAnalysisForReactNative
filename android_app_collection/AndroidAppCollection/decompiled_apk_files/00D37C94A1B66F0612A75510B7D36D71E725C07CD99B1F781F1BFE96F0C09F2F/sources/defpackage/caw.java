package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: caw  reason: default package */
/* loaded from: classes2.dex */
public final class caw {
    public final List a;
    public PointF b;
    public boolean c;

    public caw() {
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

    public caw(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }
}
