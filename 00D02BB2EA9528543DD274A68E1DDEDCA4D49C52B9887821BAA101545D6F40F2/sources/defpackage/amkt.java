package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amkt  reason: default package */
/* loaded from: classes2.dex */
final class amkt {
    public final aktr a;
    public int b;
    public final dcep<amkr> c;
    public final Set<amkr> d = new HashSet();
    public final dcep<amkr> e;

    public amkt(aktr aktrVar, Set<amkr> set, Set<amkr> set2) {
        this.a = aktrVar;
        this.b = set.size();
        this.c = dcep.K(set);
        this.e = dcep.K(set2);
    }
}
