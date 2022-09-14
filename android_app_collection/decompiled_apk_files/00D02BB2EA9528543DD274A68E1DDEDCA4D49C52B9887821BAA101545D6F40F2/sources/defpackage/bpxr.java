package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpxr  reason: default package */
/* loaded from: classes4.dex */
public final class bpxr extends bvxb<dgoq, dgos> {
    private final dxio<bote> a;

    public bpxr(dxio<bote> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "rmi.mb";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgos e(dgoq dgoqVar) {
        bote a = this.a.a();
        dnqe dnqeVar = dgoqVar.a;
        if (dnqeVar == null) {
            dnqeVar = dnqe.i;
        }
        dnqb b = dnqb.b(dnqeVar.b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        aker i = akeu.i(new botd(b));
        aken a2 = i.a();
        a2.i(R.string.RAP_AAP_LOGIN_SCREEN_TITLE);
        a2.h(R.string.RAP_AAP_LOGIN_SCREEN_SUBTITLE);
        a2.c(R.string.DISABLE_INCOGNITO_BODY_TEXT);
        a.a.a().b(i.b());
        return dgos.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bvxb
    public final /* bridge */ /* synthetic */ dgoq j(byte[] bArr) {
        return ((dgop) dgoq.b.bZ().bx(bArr, dsqa.c())).bK();
    }
}
