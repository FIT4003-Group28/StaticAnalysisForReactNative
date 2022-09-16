package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alep  reason: default package */
/* loaded from: classes2.dex */
public final class alep extends aldi {
    private static final dcqe a = dcqe.c("alep");
    private static final int[] b = new int[0];
    private final aleq c;
    private final akxa d;

    public alep(aleq aleqVar, akxa akxaVar) {
        this.c = aleqVar;
        this.d = akxaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    @Override // defpackage.aldi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.util.List b(defpackage.aldp r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alep.b(aldp, boolean, boolean):java.util.List");
    }

    protected final void d(aldp aldpVar, List<akra> list, List<Integer> list2, List<akuh> list3) {
        int[] iArr;
        list3.add(this.c.b);
        list.addAll(aldpVar.a);
        List<aldo> list4 = aldpVar.b;
        if (list4.isEmpty()) {
            iArr = b;
        } else {
            int[] iArr2 = new int[list4.size() - 1];
            for (int i = 1; i < list4.size(); i++) {
                iArr2[i - 1] = list4.get(i).a;
            }
            iArr = iArr2;
        }
        list2.addAll(decl.m(iArr));
    }

    @Override // defpackage.aleh
    public final List<akte> e(aldp aldpVar, boolean z) {
        ArrayList a2 = dchl.a();
        ArrayList a3 = dchl.a();
        ArrayList a4 = dchl.a();
        if (z) {
            if (aldpVar.b.isEmpty()) {
                bvoo.h("polyline.getVertexBreaks() is empty", new Object[0]);
                d(aldpVar, a2, a4, a3);
            } else {
                a(aldpVar, true, a2, a4, a3);
            }
        } else {
            bvoo.h("generateStyledPolyline called with an unselected line", new Object[0]);
            d(aldpVar, a2, a4, a3);
        }
        return this.d.d(a2, decl.l(a4), a3, 0, 2, 2, 1, aldpVar.j);
    }
}
