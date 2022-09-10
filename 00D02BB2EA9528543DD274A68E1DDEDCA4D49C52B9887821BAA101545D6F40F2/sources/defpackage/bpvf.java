package defpackage;
/* compiled from: PG */
/* renamed from: bpvf  reason: default package */
/* loaded from: classes4.dex */
public class bpvf {
    @dzsi
    public bput a;
    private final bpuu b;

    public bpvf(bpuu bpuuVar) {
        this.b = bpuuVar;
    }

    public final void a(akqi akqiVar, bpus bpusVar) {
        bput b = b(akqiVar);
        this.a = b;
        dbsk.s(b);
        b.d(bpusVar);
    }

    public final bput b(akqi akqiVar) {
        bput bputVar = this.a;
        if (bputVar != null) {
            if (bputVar.a.equals(akqiVar)) {
                return this.a;
            }
            this.a.c();
        }
        return this.b.a(akqiVar);
    }
}
