package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: fgz  reason: default package */
/* loaded from: classes3.dex */
public final class fgz implements ye {
    public final ArrayList a = new ArrayList(2);

    @Override // defpackage.ye
    public final void a(yo yoVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ye) arrayList.get(i)).a(yoVar);
        }
    }
}
