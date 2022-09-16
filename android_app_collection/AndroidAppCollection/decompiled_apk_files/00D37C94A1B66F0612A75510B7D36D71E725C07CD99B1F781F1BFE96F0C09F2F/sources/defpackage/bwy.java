package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwy  reason: default package */
/* loaded from: classes2.dex */
public final class bwy implements bxp {
    final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public bwy(String str) {
        this.a = str;
    }

    public bwy(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.bxp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.b == 0) {
            Throwable th = (Throwable) obj;
            bxe.a.remove(this.a);
            return;
        }
        bwx bwxVar = (bwx) obj;
        bxe.a.remove(this.a);
    }
}
