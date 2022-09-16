package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cnv  reason: default package */
/* loaded from: classes2.dex */
public final class cnv implements cnq {
    private final List a;
    private final jk b;

    public cnv(List list, jk jkVar) {
        this.a = list;
        this.b = jkVar;
    }

    @Override // defpackage.cnq
    public final cnp a(Object obj, int i, int i2, cic cicVar) {
        cnp a;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        chy chyVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            cnq cnqVar = (cnq) this.a.get(i3);
            if (cnqVar.b(obj) && (a = cnqVar.a(obj, i, i2, cicVar)) != null) {
                chyVar = a.a;
                arrayList.add(a.c);
            }
        }
        if (arrayList.isEmpty() || chyVar == null) {
            return null;
        }
        return new cnp(chyVar, new cnu(arrayList, this.b));
    }

    @Override // defpackage.cnq
    public final boolean b(Object obj) {
        for (cnq cnqVar : this.a) {
            if (cnqVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 31);
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
