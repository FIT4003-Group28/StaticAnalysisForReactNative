package defpackage;

import com.google.android.apps.gmm.notification.intent.GenericWebviewNotificationCallbacks;
import java.util.Map;
/* compiled from: PG */
/* renamed from: auru  reason: default package */
/* loaded from: classes2.dex */
public final class auru implements bvwz {
    public final gga a;
    public final dxio<afha> b;
    public final GenericWebviewNotificationCallbacks c;

    public auru(gga ggaVar, dxio<afha> dxioVar, GenericWebviewNotificationCallbacks genericWebviewNotificationCallbacks) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = genericWebviewNotificationCallbacks;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: aurs
            private final auru a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final auru auruVar = this.a;
                Map map = (Map) obj;
                if (map != null && map.containsKey("gwn.lufu")) {
                    final String str = (String) map.get("gwn.lufu");
                    auruVar.a.runOnUiThread(new Runnable(auruVar, str) { // from class: aurt
                        private final auru a;
                        private final String b;

                        {
                            this.a = auruVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            auru auruVar2 = this.a;
                            String str2 = this.b;
                            GenericWebviewNotificationCallbacks genericWebviewNotificationCallbacks = auruVar2.c;
                            ((ckco) genericWebviewNotificationCallbacks.b.a(ckht.aV)).a(genericWebviewNotificationCallbacks.c - 1);
                            int i = genericWebviewNotificationCallbacks.c - 1;
                            if (i == 1) {
                                ((ckcn) genericWebviewNotificationCallbacks.b.a(ckft.c)).a();
                            } else if (i == 2) {
                                ((ckcn) genericWebviewNotificationCallbacks.b.a(ckft.b)).a();
                            }
                            auruVar2.b.a().r(str2, 1);
                        }
                    });
                }
                return bvwy.a;
            }
        };
    }

    @Override // defpackage.bvwz
    @dzsi
    public final dehn<Map<String, Object>> b(Object obj) {
        return null;
    }

    @Override // defpackage.bvwz
    public final String c() {
        return "gwn.lufi";
    }
}
