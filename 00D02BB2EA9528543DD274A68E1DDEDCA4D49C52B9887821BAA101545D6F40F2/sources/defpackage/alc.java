package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alc  reason: default package */
/* loaded from: classes2.dex */
public final class alc implements alm<alg> {
    final /* synthetic */ String a;

    public alc(String str) {
        this.a = str;
    }

    @Override // defpackage.alm
    public final /* bridge */ /* synthetic */ void a(alg algVar) {
        synchronized (alh.b) {
            ArrayList<alm<alg>> arrayList = alh.c.get(this.a);
            if (arrayList == null) {
                return;
            }
            alh.c.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).a(algVar);
            }
        }
    }
}
