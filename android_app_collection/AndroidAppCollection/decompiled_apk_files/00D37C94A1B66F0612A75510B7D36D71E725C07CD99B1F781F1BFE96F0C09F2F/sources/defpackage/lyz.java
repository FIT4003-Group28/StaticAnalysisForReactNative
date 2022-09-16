package defpackage;
/* compiled from: PG */
/* renamed from: lyz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lyz implements lxn {
    public final /* synthetic */ lzd a;
    private final /* synthetic */ int b;

    public /* synthetic */ lyz(lzd lzdVar, int i) {
        this.b = i;
        this.a = lzdVar;
    }

    @Override // defpackage.lxn
    public final void a() {
        if (this.b != 0) {
            this.a.g = fsn.a;
            return;
        }
        lzd lzdVar = this.a;
        if (lzdVar.h == null) {
            return;
        }
        lzdVar.h = null;
        lzdVar.g = fsn.c;
        lzdVar.l();
    }
}
