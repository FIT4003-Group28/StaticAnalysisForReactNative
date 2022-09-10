package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ahyn  reason: default package */
/* loaded from: classes2.dex */
public final class ahyn extends afhx {
    private static final dcqe a = dcqe.c("ahyn");
    private final ahwf b;

    public ahyn(Intent intent, @dzsi String str, ahwf ahwfVar) {
        super(intent, str, afid.REQUEST_LOCATION);
        this.b = ahwfVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        Uri data = this.f.getData();
        dbsk.s(data);
        String queryParameter = data.getQueryParameter("recipient");
        String queryParameter2 = data.getQueryParameter("sender");
        if (dbsj.d(queryParameter2) || dbsj.d(queryParameter)) {
            bvoo.h("Missing required information to handle notification intent.", new Object[0]);
        } else {
            this.b.k(queryParameter, queryParameter2, dbpy.a, !affw.b(this.f));
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_LOCATION_SHARING_REQUEST_LOCATION;
    }
}
