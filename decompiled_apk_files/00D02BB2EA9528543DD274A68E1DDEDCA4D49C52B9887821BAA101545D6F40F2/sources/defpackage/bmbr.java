package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmbr  reason: default package */
/* loaded from: classes3.dex */
public class bmbr implements bmbh {
    private final String a;
    private final List<List<bmbi>> b;
    private final boolean c;

    public bmbr(dgls dglsVar) {
        this(dglsVar, false);
    }

    @Override // defpackage.bmbh
    public String a() {
        return this.a;
    }

    @Override // defpackage.bmbh
    public Boolean c() {
        return Boolean.valueOf(this.c);
    }

    public bmbr(dgls dglsVar, boolean z) {
        this.b = new ArrayList();
        this.a = dglsVar.c;
        this.c = z;
        for (int i = 0; i < 2; i++) {
            this.b.add(new ArrayList());
        }
        Iterator<E> it = new dcfk(this.b).iterator();
        for (dglo dgloVar : dglsVar.d) {
            ((List) it.next()).add(new bmbs(dgloVar));
        }
    }

    @Override // defpackage.bmbh
    public List<bmbi> b(int i) {
        if (i <= 0 || i > 2) {
            return new ArrayList();
        }
        return this.b.get(i - 1);
    }
}
