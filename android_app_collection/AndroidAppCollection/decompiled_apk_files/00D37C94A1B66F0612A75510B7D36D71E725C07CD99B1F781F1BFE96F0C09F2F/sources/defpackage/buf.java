package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buf  reason: default package */
/* loaded from: classes2.dex */
public final class buf extends bkm {
    public buf(bks bksVar) {
        super(bksVar);
    }

    @Override // defpackage.bkm
    public final /* bridge */ /* synthetic */ void b(bmb bmbVar, Object obj) {
        bue bueVar = (bue) obj;
        String str = bueVar.a;
        bmbVar.e(1);
        bpx bpxVar = bueVar.b;
        byte[] e = bpx.e(null);
        if (e == null) {
            bmbVar.e(2);
        } else {
            bmbVar.c(2, e);
        }
    }

    @Override // defpackage.bkw
    public final String c() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}
