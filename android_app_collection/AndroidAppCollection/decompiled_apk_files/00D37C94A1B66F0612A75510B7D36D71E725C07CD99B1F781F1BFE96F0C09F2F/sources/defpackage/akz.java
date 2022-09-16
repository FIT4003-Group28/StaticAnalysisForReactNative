package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: akz  reason: default package */
/* loaded from: classes.dex */
public final class akz implements ji {
    final /* synthetic */ String a;

    public akz(String str) {
        this.a = str;
    }

    @Override // defpackage.ji
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ala alaVar = (ala) obj;
        synchronized (alb.c) {
            ArrayList arrayList = (ArrayList) alb.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            alb.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((ji) arrayList.get(i)).accept(alaVar);
            }
        }
    }
}
