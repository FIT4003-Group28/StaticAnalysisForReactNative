package defpackage;
/* compiled from: PG */
/* renamed from: yap  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class yap implements zdt {
    public final /* synthetic */ yar a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ byte[] c;
    private final /* synthetic */ int d;

    public /* synthetic */ yap(yar yarVar, byte[] bArr, byte[] bArr2) {
        this.a = yarVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public /* synthetic */ yap(yar yarVar, byte[] bArr, byte[] bArr2, int i) {
        this.d = i;
        this.a = yarVar;
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
