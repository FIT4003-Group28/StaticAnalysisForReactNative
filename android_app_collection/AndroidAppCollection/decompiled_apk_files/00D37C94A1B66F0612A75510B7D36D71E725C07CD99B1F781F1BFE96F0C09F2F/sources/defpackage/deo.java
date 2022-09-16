package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: deo  reason: default package */
/* loaded from: classes3.dex */
public final class deo extends dee {
    public final ArrayList a = new ArrayList();

    public deo(List list) {
        for (int i = 0; i < list.size(); i++) {
            dee deeVar = (dee) list.get(i);
            if (deeVar instanceof ddw) {
                ArrayList a = ((ddw) deeVar).a();
                if (a.size() > 1) {
                    this.a.add(new deo(a));
                } else {
                    this.a.add((dee) a.get(0));
                }
            } else if (deeVar != null) {
                this.a.add(deeVar);
            } else {
                throw new IllegalStateException("Null element is not allowed in transition set");
            }
        }
    }
}
