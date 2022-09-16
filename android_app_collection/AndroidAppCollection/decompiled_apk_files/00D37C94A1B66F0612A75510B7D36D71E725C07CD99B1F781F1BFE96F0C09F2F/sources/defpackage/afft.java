package defpackage;

import java.util.LinkedList;
import java.util.List;
/* compiled from: PG */
/* renamed from: afft  reason: default package */
/* loaded from: classes.dex */
public class afft {
    public static final afft a = new affs();
    private final LinkedList b = new LinkedList();
    private aepk c = aepk.a;
    private aegx d = aegx.a;

    public synchronized void a(List list, int i, aepk aepkVar, aegx aegxVar) {
        if (list.isEmpty()) {
            this.b.clear();
            this.c = aepkVar;
            if (aegxVar == null) {
                aegxVar = aegx.a;
            }
            this.d = aegxVar;
            return;
        }
        long j = ((ovq) list.get(0)).g / 1000;
        long j2 = ((ovq) list.get(i - 1)).h / 1000;
        while (!this.b.isEmpty() && ((affr) this.b.getFirst()).a < j) {
            this.b.removeFirst();
        }
        while (!this.b.isEmpty() && ((affr) this.b.getLast()).a >= j2) {
            this.b.removeLast();
        }
        this.b.add(new affr(j2, aepkVar, aegxVar));
    }

    public final synchronized affr b(long j) {
        affr affrVar = new affr(j, aepk.a, aegx.a);
        if (!this.b.isEmpty() && j >= ((affr) this.b.getFirst()).a) {
            while (!this.b.isEmpty() && j >= ((affr) this.b.getFirst()).a) {
                if (j == ((affr) this.b.getFirst()).a) {
                    affrVar = (affr) this.b.getFirst();
                }
                this.b.removeFirst();
            }
            return affrVar;
        }
        affr affrVar2 = new affr(j, this.c, this.d);
        this.d = aegx.a;
        this.c = aepk.a;
        return affrVar2;
    }

    public final synchronized void c() {
        this.b.clear();
        this.c = aepk.a;
    }
}
