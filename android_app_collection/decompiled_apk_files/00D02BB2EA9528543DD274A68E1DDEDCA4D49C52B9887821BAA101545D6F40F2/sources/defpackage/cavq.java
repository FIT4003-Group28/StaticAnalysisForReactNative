package defpackage;
/* compiled from: PG */
/* renamed from: cavq  reason: default package */
/* loaded from: classes4.dex */
public class cavq implements cavu, amfq {
    @dzsi
    public cqtd a;
    private final cqss b;
    private final String c;
    private final String d;
    private final String e;
    private final bvrb f;

    public cavq(String str, cqss cqssVar, String str2, String str3, String str4, cqhn cqhnVar, amfi amfiVar, bvrb bvrbVar) {
        this.b = cqssVar;
        this.c = str2;
        this.d = str4;
        this.e = str3;
        this.f = bvrbVar;
        this.a = null;
        if (!str.isEmpty()) {
            this.a = amfiVar.a(str, "PerTypeStatsViewModelImpl", this).j();
        }
    }

    @Override // defpackage.amfq
    public void a(final amfu amfuVar) {
        this.f.b(new Runnable(this, amfuVar) { // from class: cavp
            private final cavq a;
            private final amfu b;

            {
                this.a = this;
                this.b = amfuVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cavq cavqVar = this.a;
                cavqVar.a = this.b.j();
                cqkx.p(cavqVar);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.cavu
    @dzsi
    public cqtd b() {
        return this.a;
    }

    @Override // defpackage.cavu
    public String c() {
        return this.c;
    }

    @Override // defpackage.cavu
    public String d() {
        return this.d;
    }

    @Override // defpackage.cavu
    public String e() {
        return this.e;
    }

    @Override // defpackage.cavu
    public cqss f() {
        return this.b;
    }
}
