package defpackage;

import android.util.Pair;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aprm  reason: default package */
/* loaded from: classes2.dex */
public final class aprm implements degu<List<btlu>> {
    final /* synthetic */ apro a;

    public aprm(apro aproVar) {
        this.a = aproVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        Pair<String, Long> pair = apro.a;
        th.getCause();
        this.a.k = false;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<btlu> list) {
        List<btlu> list2 = list;
        apro aproVar = this.a;
        aproVar.l = new HashSet();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (btlu btluVar : list2) {
            aproVar.d.a().e = btluVar;
            bvac c = aproVar.d.c();
            aproVar.l.add(btluVar.d);
            c.b(apro.b, new aprn(aproVar, btluVar, copyOnWriteArrayList, list2), aproVar.e);
        }
    }
}
