package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bhjg  reason: default package */
/* loaded from: classes3.dex */
public final class bhjg {
    private final bvjj a;

    public bhjg(bvjj bvjjVar) {
        this.a = bvjjVar;
    }

    public final void a(@dzsi ilo iloVar) {
        if (iloVar == null) {
            return;
        }
        Set<String> C = this.a.C(bvjk.ix, new HashSet());
        C.add(iloVar.ai().o());
        this.a.af(bvjk.ix, C);
    }
}
