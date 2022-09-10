package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cav  reason: default package */
/* loaded from: classes.dex */
public final class cav<Model, Data> implements cap<Model, Data> {
    private final List<cap<Model, Data>> a;
    private final my<List<Throwable>> b;

    public cav(List<cap<Model, Data>> list, my<List<Throwable>> myVar) {
        this.a = list;
        this.b = myVar;
    }

    @Override // defpackage.cap
    public final boolean a(Model model) {
        for (cap<Model, Data> capVar : this.a) {
            if (capVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cap
    public final cao<Data> b(Model model, int i, int i2, bua buaVar) {
        cao<Data> b;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        btw btwVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            cap<Model, Data> capVar = this.a.get(i3);
            if (capVar.a(model) && (b = capVar.b(model, i, i2, buaVar)) != null) {
                btwVar = b.a;
                arrayList.add(b.c);
            }
        }
        if (arrayList.isEmpty() || btwVar == null) {
            return null;
        }
        return new cao<>(btwVar, new cau(arrayList, this.b));
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
