package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ccgm  reason: default package */
/* loaded from: classes4.dex */
public final class ccgm implements bvwz {
    public final ccgo a;
    public final Intent b;
    public final gga c;
    public final dxio<afha> d;

    public ccgm(ccgo ccgoVar, Intent intent, gga ggaVar, dxio<afha> dxioVar) {
        this.a = ccgoVar;
        this.b = intent;
        this.c = ggaVar;
        this.d = dxioVar;
    }

    @Override // defpackage.bvwz
    public final dbrn<Map<String, Object>, Map<String, Object>> a() {
        return new dbrn(this) { // from class: ccgk
            private final ccgm a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final ccgm ccgmVar = this.a;
                Map map = (Map) obj;
                if (map != null && map.containsKey("mni.iifu")) {
                    final String str = (String) map.get("mni.iifu");
                    ccgmVar.c.runOnUiThread(new Runnable(ccgmVar, str) { // from class: ccgl
                        private final ccgm a;
                        private final String b;

                        {
                            this.a = ccgmVar;
                            this.b = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ccgm ccgmVar2 = this.a;
                            String str2 = this.b;
                            ccgo ccgoVar = ccgmVar2.a;
                            ccgq ccgqVar = ccgoVar.g;
                            if (ccgqVar != null) {
                                ccgoVar.a(ccgoVar.h, ((ccgj) ccgqVar).b);
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
                            cjqg.j(ccgmVar2.b, intent);
                            ccgmVar2.d.a().o(intent, 1);
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
        return "mni.iifi";
    }
}
