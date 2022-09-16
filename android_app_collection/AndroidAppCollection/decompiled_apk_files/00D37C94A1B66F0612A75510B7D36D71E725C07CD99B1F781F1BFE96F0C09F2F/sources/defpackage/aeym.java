package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: aeym  reason: default package */
/* loaded from: classes.dex */
public final class aeym extends bba {
    private final afge p;
    private final ArrayDeque q;

    public aeym(afge afgeVar) {
        super(1);
        this.q = new ArrayDeque();
        this.p = afgeVar;
    }

    @Override // defpackage.bba
    public final int a(int i) {
        if (i == 17543 || i == 17827) {
            return 3;
        }
        if (i != 26568 && i != 29555 && i != 307544935) {
            return super.a(i);
        }
        return 1;
    }

    @Override // defpackage.bba, defpackage.aze
    public final void g(long j, long j2) {
        this.q.clear();
        super.g(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bba
    public final void k(int i) {
        String str;
        if (i == 26568) {
            aeyl aeylVar = (aeyl) this.q.removeFirst();
            String str2 = aeylVar.a;
            if (str2 != null && (str = aeylVar.b) != null) {
                afge afgeVar = this.p;
                aeyw aeywVar = (aeyw) afgeVar;
                if (aeywVar.a.isEmpty() || aeywVar.a.contains(str2)) {
                    try {
                        HashMap hashMap = new HashMap();
                        for (String str3 : amqf.d("[\\r\\n]+").f(str)) {
                            List h = amqf.c(": ").h(str3);
                            if (h.size() >= 2) {
                                hashMap.put((String) h.get(0), (String) h.get(1));
                            }
                        }
                        ((aeyw) afgeVar).b.i(new aeui(str2, hashMap));
                    } catch (IOException e) {
                        aeywVar.b.j(e);
                    }
                }
            }
            i = 26568;
        }
        super.k(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bba
    public final void l(int i, long j, long j2) {
        int i2;
        if (i == 26568) {
            this.q.addFirst(new aeyl());
            i2 = 26568;
        } else {
            i2 = i;
        }
        super.l(i2, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bba
    public final void m(int i, String str) {
        aeyl aeylVar = (aeyl) this.q.peekFirst();
        if (i == 17827) {
            afms.a(aeylVar);
            aeylVar.a = str;
        } else if (i == 17543) {
            afms.a(aeylVar);
            aeylVar.b = str;
            i = 17543;
        }
        super.m(i, str);
    }
}
