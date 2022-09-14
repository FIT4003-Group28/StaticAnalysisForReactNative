package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckvf  reason: default package */
/* loaded from: classes4.dex */
public final class ckvf implements askl {
    final /* synthetic */ ckvk a;

    public ckvf(ckvk ckvkVar) {
        this.a = ckvkVar;
    }

    @Override // defpackage.askl
    public final void a() {
        ckvk ckvkVar = this.a;
        if (!ckvkVar.r) {
            return;
        }
        ckvkVar.r = false;
        this.a.m.S(bvjk.bR, true);
        this.a.j();
    }

    @Override // defpackage.askl
    public final void b() {
        ckvk ckvkVar = this.a;
        if (!ckvkVar.r) {
            return;
        }
        ckvkVar.r = false;
        this.a.finish();
    }
}
