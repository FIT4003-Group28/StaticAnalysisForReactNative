package defpackage;
/* compiled from: PG */
/* renamed from: mxa  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mxa implements Runnable {
    public final /* synthetic */ mxc a;
    private final /* synthetic */ int b;

    public /* synthetic */ mxa(mxc mxcVar, int i) {
        this.b = i;
        this.a = mxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                mxc mxcVar = this.a;
                mxcVar.b.e(mxcVar.d, true);
                return;
            }
            mxc mxcVar2 = this.a;
            mxcVar2.b.q(mxcVar2.c);
            return;
        }
        mxc mxcVar3 = this.a;
        boolean l = mxcVar3.l();
        mxcVar3.b.e(l ? mxcVar3.f : mxcVar3.e, true);
        boolean z = true ^ l;
        mxcVar3.a().a = z;
        mxb mxbVar = mxcVar3.a;
        if (mxbVar == null) {
            return;
        }
        mxbVar.a(z);
    }
}
