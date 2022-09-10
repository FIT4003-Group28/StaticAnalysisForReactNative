package defpackage;
/* compiled from: PG */
/* renamed from: chnj  reason: default package */
/* loaded from: classes4.dex */
final class chnj implements akey {
    final /* synthetic */ String a;
    final /* synthetic */ chnl b;

    public chnj(chnl chnlVar, String str) {
        this.b = chnlVar;
        this.a = str;
    }

    @Override // defpackage.akey
    public final void a(boolean z) {
        if (z) {
            this.b.a.a().p(false);
        }
        this.b.m(null, null, true, null, dwyd.UNKNOWN_ENTRY_POINT);
        this.b.b.e(this.a);
    }

    @Override // defpackage.akey
    public final void b() {
    }
}
