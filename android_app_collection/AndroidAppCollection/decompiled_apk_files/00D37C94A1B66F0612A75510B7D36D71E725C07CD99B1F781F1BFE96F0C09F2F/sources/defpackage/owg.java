package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: owg  reason: default package */
/* loaded from: classes4.dex */
public final class owg implements Comparator {
    public ArrayList a;
    public boolean b;

    public final void a(owd owdVar) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        ArrayList arrayList = this.a;
        if (!arrayList.contains(owdVar)) {
            for (int i = 0; i < arrayList.size(); i++) {
                pce.d(!((owd) arrayList.get(i)).a.equals(owdVar.a));
            }
            arrayList.add(owdVar);
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((owd) obj).a.compareTo(((owd) obj2).a);
    }
}
