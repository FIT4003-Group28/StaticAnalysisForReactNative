package defpackage;

import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: allo  reason: default package */
/* loaded from: classes.dex */
public final class allo implements alri {
    float a = Float.MAX_VALUE;
    float b = Float.MAX_VALUE;
    float c = -3.4028235E38f;
    float d = 0.0f;
    final /* synthetic */ allr e;

    /* JADX INFO: Access modifiers changed from: protected */
    public allo(allr allrVar) {
        this.e = allrVar;
    }

    @Override // defpackage.alri
    @dzsi
    public final bnvn a(List<ampl> list, boolean z, float[] fArr, float[] fArr2, float[] fArr3, float f, GeometryUtil geometryUtil, amoa amoaVar, amgr amgrVar) {
        Object b;
        float f2 = this.a;
        float f3 = this.b;
        allr allrVar = this.e;
        float f4 = allrVar.s;
        boolean z2 = allrVar.l;
        Iterator<ampl> it = list.iterator();
        while (it.hasNext()) {
            ampl next = it.next();
            char c = 0;
            ampk d = ampn.d(amoaVar, next.b.get(0).j[0], f4, next.c, next.d);
            dmqg dmqgVar = next.a;
            dsqv<dmqg, Float> dsqvVar = akvj.e;
            dmqgVar.f(dsqvVar);
            Object l = dmqgVar.V.l(dsqvVar.d);
            if (l == null) {
                b = dsqvVar.b;
            } else {
                b = dsqvVar.b(l);
            }
            float floatValue = ((Float) b).floatValue();
            for (ampm ampmVar : next.b) {
                float[] fArr4 = ampmVar.c;
                int[] iArr = ampmVar.a;
                int[] iArr2 = ampmVar.i;
                alxp[] alxpVarArr = ampmVar.j;
                int i = d.a;
                int i2 = d.b;
                int i3 = next.e;
                if (fArr4.length != 0 && alxpVarArr[c] != null) {
                    geometryUtil.addExtrudedMultiSegmentRoadsWithNormals(fArr4, iArr, f2, f3, ampn.a(iArr2, alxpVarArr, f4, z2), amgrVar, i, i2, i3, 0.0f, iArr2, z, fArr, fArr2, fArr3, f, 0, floatValue);
                    d = d;
                    next = next;
                    z2 = z2;
                    f4 = f4;
                    f3 = f3;
                    f2 = f2;
                    c = 0;
                }
            }
        }
        return ampn.b(amgrVar, z);
    }

    @Override // defpackage.alri
    public final void b(ampl amplVar) {
        float[] fArr;
        for (ampm ampmVar : amplVar.b) {
            float[] fArr2 = ampmVar.c;
            int length = fArr2.length;
            if (length == 0 || (length & 1) != 0) {
                fArr = new float[]{0.0f, 0.0f, 0.0f};
            } else {
                float f = -3.4028235E38f;
                float f2 = Float.MAX_VALUE;
                float f3 = Float.MAX_VALUE;
                for (int i = 0; i < fArr2.length; i += 2) {
                    f2 = Math.min(fArr2[i], f2);
                    f = Math.max(fArr2[i], f);
                    f3 = Math.min(fArr2[i + 1], f3);
                }
                fArr = new float[]{f2, f, f3};
            }
            this.a = Math.min(fArr[0], this.a);
            this.c = Math.max(fArr[1], this.c);
            this.b = Math.min(fArr[2], this.b);
            this.d = this.c - this.a;
        }
    }

    @Override // defpackage.alri
    public final akra c() {
        return new akra(Math.round(this.a), Math.round(this.b));
    }

    @Override // defpackage.alri
    public final float d() {
        return this.d;
    }
}
