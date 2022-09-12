package defpackage;
/* compiled from: PG */
/* renamed from: mfi  reason: default package */
/* loaded from: classes7.dex */
public class mfi implements mfc {
    private final mfh a;
    private final boolean b;

    public mfi(mfh mfhVar, boolean z) {
        this.a = mfhVar;
        this.b = z;
    }

    @Override // defpackage.mfc
    public cqkl a() {
        mbn mbnVar = (mbn) this.a;
        mbnVar.a.x.b();
        mbp mbpVar = mbnVar.a;
        mbpVar.h.a(mbpVar.j, true);
        mbnVar.a.v.h();
        return cqkl.a;
    }

    @Override // defpackage.mfc
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }
}
