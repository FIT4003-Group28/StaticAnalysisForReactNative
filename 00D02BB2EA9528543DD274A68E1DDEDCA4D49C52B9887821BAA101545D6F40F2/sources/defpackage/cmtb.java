package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cmtb  reason: default package */
/* loaded from: classes5.dex */
final class cmtb extends cmsu {
    final /* synthetic */ cmtc a;

    public cmtb(cmtc cmtcVar) {
        this.a = cmtcVar;
    }

    @Override // defpackage.cmsu, defpackage.cmsx
    public final void b(String str) {
        if (str != null) {
            this.a.p(new cmte(str));
        } else {
            this.a.p(cmtc.a(new Status(3006)));
        }
    }
}
