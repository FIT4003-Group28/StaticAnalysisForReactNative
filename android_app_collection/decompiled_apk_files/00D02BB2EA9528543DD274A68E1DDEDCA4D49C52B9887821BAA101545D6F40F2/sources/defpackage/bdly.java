package defpackage;
/* compiled from: PG */
/* renamed from: bdly  reason: default package */
/* loaded from: classes3.dex */
final class bdly implements axrw {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bdmb c;

    public bdly(bdmb bdmbVar, String str, boolean z) {
        this.c = bdmbVar;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.axrw
    public final void a(int i) {
        bdlz bdlzVar;
        if (i == 0) {
            this.c.a = bdma.RESPONDED_GRANTED;
            this.c.b = bdlz.GRANTED;
            return;
        }
        this.c.a = bdma.RESPONDED_DENIED;
        boolean shouldShowRequestPermissionRationale = this.c.c.shouldShowRequestPermissionRationale(this.a);
        bdmb bdmbVar = this.c;
        boolean z = this.b;
        if (shouldShowRequestPermissionRationale) {
            if (z) {
                bdlzVar = bdlz.DENIED_REPEAT;
            } else {
                bdlzVar = bdlz.DENIED_FIRST;
            }
        } else if (z) {
            bdlzVar = bdlz.PERMANENTLY_DENIED_FIRST;
        } else {
            bdlzVar = bdlz.PERMANENTLY_DENIED_REPEAT;
        }
        bdmbVar.b = bdlzVar;
    }
}
