package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyf  reason: default package */
/* loaded from: classes2.dex */
public final class ahyf extends afhx {
    private static final dcqe a = dcqe.c("ahyf");
    private final ahwf b;

    public ahyf(Intent intent, @dzsi String str, ahwf ahwfVar) {
        super(intent, str, afid.LOCATION_SHARE);
        this.b = ahwfVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String queryParameter = this.f.getData().getQueryParameter("recipient");
        String queryParameter2 = this.f.getData().getQueryParameter("sharer");
        String queryParameter3 = this.f.getData().getQueryParameter("token");
        if (dbsj.d(queryParameter2) || dbsj.d(queryParameter)) {
            bvoo.h("Missing required information to handle notification intent.", new Object[0]);
        } else {
            this.b.j(queryParameter, queryParameter2, queryParameter3, !affw.b(this.f));
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_LOCATION_SHARING;
    }
}
