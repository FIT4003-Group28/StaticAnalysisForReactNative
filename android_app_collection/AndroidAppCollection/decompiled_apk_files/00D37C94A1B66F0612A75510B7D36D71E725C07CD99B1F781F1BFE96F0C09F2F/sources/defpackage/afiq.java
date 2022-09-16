package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afiq  reason: default package */
/* loaded from: classes.dex */
public final class afiq implements afiv {
    final /* synthetic */ afiz a;
    private final List b = new ArrayList();
    private final List c = new ArrayList();

    public afiq(afiz afizVar) {
        this.a = afizVar;
    }

    private final synchronized String e() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (int i = 0; i < this.b.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(String.format(Locale.US, "%s:%s", this.a.c(((Long) this.c.get(i)).longValue()), this.a.c(((Long) this.b.get(i)).longValue())));
        }
        return sb.toString();
    }

    private final synchronized void f() {
        this.b.clear();
        this.c.clear();
    }

    @Override // defpackage.afiv
    public final synchronized int a() {
        if (this.b.isEmpty()) {
            return 0;
        }
        return e().length() + 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized long b() {
        if (this.c.isEmpty()) {
            return Long.MAX_VALUE;
        }
        long a = this.a.a();
        List list = this.c;
        return a - ((Long) list.get(list.size() - 1)).longValue();
    }

    @Override // defpackage.afiv
    public final synchronized void c(afix afixVar) {
        if (!this.b.isEmpty()) {
            afixVar.d("e2el", e());
            f();
        }
    }

    public final synchronized void d(long j) {
        this.b.add(Long.valueOf(j));
        this.c.add(Long.valueOf(this.a.a()));
    }
}
