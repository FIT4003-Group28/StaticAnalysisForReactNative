package defpackage;
/* compiled from: PG */
/* renamed from: apmm  reason: default package */
/* loaded from: classes2.dex */
public class apmm implements apml {
    public final cqhn a;
    public boolean b = false;
    private final aplj c;
    private final dehn<Void> d;
    private final aplk e;

    public apmm(aplj apljVar, cqhn cqhnVar, dehn<Void> dehnVar, aplk aplkVar) {
        this.c = apljVar;
        this.d = dehnVar;
        this.e = aplkVar;
        this.a = cqhnVar;
    }

    @Override // defpackage.apml
    public Boolean a() {
        return Boolean.valueOf(this.d.isDone());
    }

    @Override // defpackage.apml
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.apml
    public jar c() {
        return this.c;
    }

    @Override // defpackage.apml
    public jam d() {
        return this.e;
    }
}
