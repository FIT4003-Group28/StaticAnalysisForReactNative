package defpackage;

import java.util.concurrent.Executor;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: aeju  reason: default package */
/* loaded from: classes.dex */
public final class aeju {
    private final aadd a;
    private final agc b = new agc(10);
    private final Executor c;

    public aeju(aadd aaddVar, Executor executor) {
        this.a = aaddVar;
        this.c = executor;
    }

    public final aejv a(String str) {
        return (aejv) this.b.c(str);
    }

    public final void b(final aeuo aeuoVar, String str) {
        if (str != null && this.b.c(str) == null) {
            aujv s = afjz.s(this.a);
            boolean z = false;
            boolean z2 = s.i || (!s.j.isEmpty() && Pattern.compile(s.j).matcher(str).find());
            aujv s2 = afjz.s(this.a);
            if (s2.k || (!s2.l.isEmpty() && Pattern.compile(s2.l).matcher(str).find())) {
                z = true;
            }
            if (!z2 && !z) {
                return;
            }
            this.b.d(str, new aejv(aeuoVar, z2, z));
            this.c.execute(new Runnable() { // from class: aejt
                @Override // java.lang.Runnable
                public final void run() {
                    aeuo.this.i("cat", aest.b);
                }
            });
        }
    }
}
