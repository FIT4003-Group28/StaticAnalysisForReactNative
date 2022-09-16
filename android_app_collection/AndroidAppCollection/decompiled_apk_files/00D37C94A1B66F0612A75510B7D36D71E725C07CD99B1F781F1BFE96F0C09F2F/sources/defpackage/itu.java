package defpackage;
/* compiled from: PG */
/* renamed from: itu  reason: default package */
/* loaded from: classes3.dex */
public final class itu {
    public final aqya a;
    private itv b;

    public itu(aqya aqyaVar) {
        this.a = aqyaVar;
        aqyb aqybVar = aqyaVar.h;
        aqxo.y(((aqybVar == null ? aqyb.a : aqybVar).b & 8) != 0);
    }

    public final itv a() {
        if (this.b == null) {
            aqyb aqybVar = this.a.h;
            if (aqybVar == null) {
                aqybVar = aqyb.a;
            }
            audn audnVar = aqybVar.c;
            if (audnVar == null) {
                audnVar = audn.a;
            }
            this.b = new itv(audnVar);
        }
        return this.b;
    }

    public final byte[] b() {
        return a().a.m.I();
    }
}
