package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ccrt  reason: default package */
/* loaded from: classes4.dex */
public final class ccrt extends BroadcastReceiver {
    public final bvqg<dbsg<String>> a;

    public ccrt(bvqg<dbsg<String>> bvqgVar) {
        this.a = bvqgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dbsg dbsgVar;
        if (!"geo.uploader.upload_progress_broadcast_action".equals(intent.getAction())) {
            dbsgVar = dbpy.a;
        } else {
            dbsgVar = dbpy.a;
            try {
                dbsgVar = dbsg.i(((crtt) crua.o.bZ().by(intent.getByteArrayExtra("geo.uploader.upload_state_key"))).bK());
            } catch (dsrm unused) {
            }
        }
        if (dbsgVar.a()) {
            String str = ((crua) dbsgVar.b()).c;
            String str2 = ((crua) dbsgVar.b()).b;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.a.NU(dbsg.i(str));
        }
    }
}
