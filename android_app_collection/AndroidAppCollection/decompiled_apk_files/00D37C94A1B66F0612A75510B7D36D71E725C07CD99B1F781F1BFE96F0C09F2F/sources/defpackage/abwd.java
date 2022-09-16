package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abwd  reason: default package */
/* loaded from: classes.dex */
public final class abwd implements aafl {
    private final Activity a;
    private final abie b;
    private final abjy c;

    public abwd(Activity activity, abie abieVar, abjy abjyVar) {
        this.a = activity;
        this.b = abieVar;
        this.c = abjyVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        eo supportFragmentManager = ((dt) this.a).getSupportFragmentManager();
        if (!this.c.a.h || map == null || map.get("context_menu_header_renderer_key") == null) {
            abie abieVar = this.b;
            abln ablnVar = new abln();
            Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", apzgVar.toByteArray());
            ablnVar.ae(bundle);
            ablnVar.ag = abieVar;
            ablnVar.qv(supportFragmentManager, "live_chat_item_context_menu_dialog");
            return;
        }
        asrf asrfVar = (asrf) map.get("context_menu_header_renderer_key");
        abie abieVar2 = this.b;
        abieVar2.getClass();
        ablk ablkVar = new ablk();
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("navigation_endpoint", apzgVar.toByteArray());
        if (asrfVar != null) {
            bundle2.putParcelable("live_chat_context_menu_included_renderer", new ParcelableMessageLite(asrfVar));
        }
        ablkVar.ae(bundle2);
        ablkVar.ak = abieVar2;
        ablkVar.qv(supportFragmentManager, "live_chat_item_context_menu_bottom_sheet_fragment");
    }
}
