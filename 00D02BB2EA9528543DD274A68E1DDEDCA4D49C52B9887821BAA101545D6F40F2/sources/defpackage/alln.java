package defpackage;

import com.google.android.apps.gmm.map.internal.vector.gl.GeometryUtil;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: alln  reason: default package */
/* loaded from: classes2.dex */
public final class alln implements alri {
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;
    int c = Integer.MIN_VALUE;
    int d = 0;
    final /* synthetic */ allr e;

    /* JADX INFO: Access modifiers changed from: protected */
    public alln(allr allrVar) {
        this.e = allrVar;
    }

    @Override // defpackage.alri
    @dzsi
    public final bnvn a(List<ampl> list, boolean z, float[] fArr, float[] fArr2, float[] fArr3, float f, GeometryUtil geometryUtil, amoa amoaVar, amgr amgrVar) {
        Object b;
        int i = this.a;
        int i2 = this.b;
        allr allrVar = this.e;
        float f2 = allrVar.s;
        boolean z2 = allrVar.l;
        Iterator<ampl> it = list.iterator();
        while (it.hasNext()) {
            ampl next = it.next();
            ampk d = ampn.d(amoaVar, next.b.get(0).j[0], f2, next.c, next.d);
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
            Iterator<ampm> it2 = next.b.iterator();
            while (it2.hasNext()) {
                ampm next2 = it2.next();
                int[] iArr = next2.b;
                int[] iArr2 = next2.a;
                int[] iArr3 = next2.i;
                alxp[] alxpVarArr = next2.j;
                int i3 = d.a;
                Iterator<ampl> it3 = it;
                int i4 = d.b;
                ampk ampkVar = d;
                int i5 = next.e;
                ampl amplVar = next;
                int[] iArr4 = next2.d;
                int[] iArr5 = next2.e;
                Iterator<ampm> it4 = it2;
                if (iArr.length != 0 && alxpVarArr[0] != null) {
                    geometryUtil.addExtrudedMultiSegmentRoadsWithNormals(iArr, iArr2, new akra(i, i2), ampn.a(iArr3, alxpVarArr, f2, z2), amgrVar, i3, i4, i5, 0.0f, iArr3, z, fArr, fArr2, fArr3, true, f, floatValue, iArr4, iArr5);
                }
                it = it3;
                d = ampkVar;
                next = amplVar;
                it2 = it4;
            }
        }
        return ampn.b(amgrVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    @Override // defpackage.alri
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ampl r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alln.b(ampl):void");
    }

    @Override // defpackage.alri
    public final akra c() {
        return new akra(this.a, this.b);
    }

    @Override // defpackage.alri
    public final float d() {
        return this.d;
    }
}
