package defpackage;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnvu  reason: default package */
/* loaded from: classes3.dex */
public final class bnvu {
    public static final bnvu a = new bnvu(dchl.a(), new bnvs(), new bnvs());
    public int b = 0;
    public final ArrayList<bnvt> c;
    public final bnvs d;
    public final bnvs e;
    public final bnvs f;
    public final float g;

    public bnvu(ArrayList<bnvt> arrayList, bnvs bnvsVar, bnvs bnvsVar2) {
        ArrayList<bnvt> a2 = dchl.a();
        this.c = a2;
        a2.addAll(arrayList);
        this.d = bnvsVar;
        this.f = bnvsVar2;
        bnvs bnvsVar3 = new bnvs(bnvsVar2);
        this.e = bnvsVar3;
        bnvsVar3.k(0.5f);
        bnvsVar3.h(bnvsVar);
        this.g = Math.max(bnvsVar2.e() > bnvsVar2.f() ? bnvsVar2.e() : bnvsVar2.f(), bnvsVar2.g());
    }

    public static bnvu c(List<bnvu> list) {
        if (list.isEmpty()) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        bnvs bnvsVar = list.get(0).d;
        bnvs bnvsVar2 = list.get(0).f;
        for (bnvu bnvuVar : list) {
            float[] fArr = bnvuVar.d.a;
            bnvsVar.j(fArr[0], fArr[1], fArr[2]);
            float[] fArr2 = bnvuVar.f.a;
            bnvsVar2.i(fArr2[0], fArr2[1], fArr2[2]);
            arrayList.addAll(bnvuVar.c);
        }
        return new bnvu(arrayList, bnvsVar, bnvsVar2);
    }

    public final boolean a() {
        return (this.b & 1) != 0;
    }

    public final void b() {
        synchronized (this) {
            this.b += 2;
            int size = this.c.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = this.c.get(i).f;
            }
            GLES20.glDeleteBuffers(size, iArr, 0);
        }
    }
}
