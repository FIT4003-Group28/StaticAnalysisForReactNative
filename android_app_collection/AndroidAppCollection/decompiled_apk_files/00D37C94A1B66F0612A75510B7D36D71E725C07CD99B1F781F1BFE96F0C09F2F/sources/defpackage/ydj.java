package defpackage;
/* compiled from: PG */
/* renamed from: ydj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class ydj implements zdt {
    public final /* synthetic */ ydl a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ byte[] c;
    private final /* synthetic */ int d;

    public /* synthetic */ ydj(ydl ydlVar, byte[] bArr, byte[] bArr2) {
        this.a = ydlVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public /* synthetic */ ydj(ydl ydlVar, byte[] bArr, byte[] bArr2, int i) {
        this.d = i;
        this.a = ydlVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        if (this.d == 0) {
            Throwable th = (Throwable) obj;
            this.a.a(aade.PRODUCTION, this.b, this.c);
            return;
        }
        this.a.a((aade) obj, this.b, this.c);
    }
}
