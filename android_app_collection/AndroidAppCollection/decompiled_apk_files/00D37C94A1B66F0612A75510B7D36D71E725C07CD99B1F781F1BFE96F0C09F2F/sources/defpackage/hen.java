package defpackage;

import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hen  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hen implements zdt {
    public final /* synthetic */ hes a;
    public final /* synthetic */ acti b;
    private final /* synthetic */ int c;

    public /* synthetic */ hen(hes hesVar, acti actiVar) {
        this.a = hesVar;
        this.b = actiVar;
    }

    public /* synthetic */ hen(hes hesVar, acti actiVar, int i) {
        this.c = i;
        this.a = hesVar;
        this.b = actiVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            hes hesVar = this.a;
            acti actiVar = this.b;
            if (!Boolean.TRUE.equals((Boolean) obj)) {
                return;
            }
            hesVar.aL(R.string.shorts_permission_storage_open_settings_title, R.string.shorts_permission_storage_open_settings_description, actiVar);
        } else if (i != 1) {
            hes hesVar2 = this.a;
            acti actiVar2 = this.b;
            zwn a = zwn.a(hesVar2, hes.a);
            amuk amukVar = hes.a;
            amuk amukVar2 = hes.b;
            dt mJ = hesVar2.mJ();
            boolean equals = Boolean.TRUE.equals((Boolean) obj);
            if (zwn.d(mJ, amukVar)) {
                amukVar2 = amuk.q();
            } else if (equals) {
                amukVar2 = amuk.q();
            }
            a.f(amukVar2);
            a.a = actiVar2;
            a.b = actj.SHORTS_CREATION_GALLERY_ALLOW_ACCESS_BUTTON;
            a.d = new hen(hesVar2, actiVar2);
            a.c();
            hesVar2.ar = a;
            ylx.o(hesVar2, hesVar2.aw.b(gvq.g, anjk.a), etg.n, etg.o);
        } else {
            hes hesVar3 = this.a;
            acti actiVar3 = this.b;
            if (!Boolean.TRUE.equals((Boolean) obj)) {
                return;
            }
            hesVar3.aL(R.string.shorts_permission_camera_open_settings_title, R.string.shorts_permission_camera_open_settings_description, actiVar3);
        }
    }
}
