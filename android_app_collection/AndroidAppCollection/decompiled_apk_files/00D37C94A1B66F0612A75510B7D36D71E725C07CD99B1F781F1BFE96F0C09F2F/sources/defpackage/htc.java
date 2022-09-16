package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: htc  reason: default package */
/* loaded from: classes3.dex */
public final class htc {
    public final hta a;
    public final acth b;

    public htc(hta htaVar, acth acthVar) {
        this.a = htaVar;
        this.b = acthVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(acth acthVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aoqu k = ajjh.k((aunb) it.next());
            if (k instanceof auzi) {
                acthVar.oi().D(new acte(hve.e((auzi) k).I()));
            } else if (k instanceof auzh) {
                acthVar.oi().D(hve.a((auzh) k));
            }
        }
    }
}
