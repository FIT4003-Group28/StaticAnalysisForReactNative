package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bbro  reason: default package */
/* loaded from: classes3.dex */
final class bbro extends BroadcastReceiver {
    final /* synthetic */ bbrq a;

    public bbro(bbrq bbrqVar) {
        this.a = bbrqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dbsg dbsgVar;
        final crua cruaVar;
        final String str;
        final bbrk bbrkVar;
        byte[] byteArrayExtra = intent.getByteArrayExtra("geo.uploader.upload_state_key");
        if (byteArrayExtra == null) {
            dbsgVar = dbpy.a;
        } else {
            try {
                dbsgVar = dbsg.i(((crtt) crua.o.bZ().by(byteArrayExtra)).bK());
            } catch (dsrm unused) {
                dbsgVar = dbpy.a;
            }
        }
        if (!dbsgVar.a() || (bbrkVar = this.a.f.get((str = (cruaVar = (crua) dbsgVar.b()).b))) == null) {
            return;
        }
        this.a.g.execute(new Runnable(this, bbrkVar, cruaVar, str) { // from class: bbrn
            private final bbro a;
            private final bbrk b;
            private final crua c;
            private final String d;

            {
                this.a = this;
                this.b = bbrkVar;
                this.c = cruaVar;
                this.d = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbro bbroVar = this.a;
                bbrk bbrkVar2 = this.b;
                crua cruaVar2 = this.c;
                String str2 = this.d;
                if (bbrkVar2.a(cruaVar2)) {
                    bbroVar.a.f.remove(str2);
                }
            }
        });
    }
}
