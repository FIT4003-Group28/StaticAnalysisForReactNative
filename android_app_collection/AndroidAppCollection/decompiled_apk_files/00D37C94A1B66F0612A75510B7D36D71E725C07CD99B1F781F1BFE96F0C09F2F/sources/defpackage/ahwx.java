package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahwx  reason: default package */
/* loaded from: classes.dex */
public final class ahwx {
    public final List a = new ArrayList();
    public final azpb b = azpd.ar();

    public final void a(amuk amukVar) {
        this.a.clear();
        int size = amukVar.size();
        int i = 0;
        while (i < size) {
            ahwn ahwnVar = (ahwn) amukVar.get(i);
            i++;
            if (ahwnVar instanceof ahwr) {
                this.a.addAll(((ahwr) ahwnVar).b);
                return;
            }
        }
    }
}
