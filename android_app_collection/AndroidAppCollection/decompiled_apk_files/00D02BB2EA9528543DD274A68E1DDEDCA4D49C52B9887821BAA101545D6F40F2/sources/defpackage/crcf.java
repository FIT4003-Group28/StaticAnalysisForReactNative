package defpackage;
/* compiled from: PG */
/* renamed from: crcf  reason: default package */
/* loaded from: classes5.dex */
final class crcf implements crbb {
    final /* synthetic */ crcg a;
    private final crbb b;
    private int c;

    public crcf(crcg crcgVar, crbb crbbVar) {
        this.a = crcgVar;
        this.b = crbbVar;
    }

    @Override // defpackage.crbb
    public final void a(crbc crbcVar) {
        crcg crcgVar = this.a;
        if (crbcVar == crcgVar.a[0]) {
            this.b.a(crcgVar);
        }
    }

    @Override // defpackage.crbb
    public final void b(crbc crbcVar) {
        if (!c()) {
            this.b.b(this.a);
        }
    }

    public final boolean c() {
        int i = this.c;
        crbc[] crbcVarArr = this.a.a;
        if (i >= crbcVarArr.length) {
            return false;
        }
        crbc crbcVar = crbcVarArr[i];
        this.c = i + 1;
        crbcVar.b(this);
        return true;
    }
}
