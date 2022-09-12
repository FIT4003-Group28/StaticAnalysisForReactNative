package defpackage;
/* compiled from: PG */
/* renamed from: cktx  reason: default package */
/* loaded from: classes4.dex */
public final class cktx implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ ckuf c;

    public cktx(ckuf ckufVar, String str, byte[] bArr) {
        this.c = ckufVar;
        this.a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        dbsk.s(this.a);
        if (this.c.i && (bArr = this.b) != null) {
            try {
                ckwr ckwrVar = (ckwr) dsqw.cq(ckwr.c, bArr);
                if (ckwrVar.a) {
                    this.c.c(this.a);
                }
                if (!ckwrVar.b) {
                    return;
                }
                this.c.d(this.a);
            } catch (dsrm unused) {
            }
        }
    }
}
