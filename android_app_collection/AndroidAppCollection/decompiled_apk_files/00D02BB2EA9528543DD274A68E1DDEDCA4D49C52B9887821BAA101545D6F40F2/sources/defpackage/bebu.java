package defpackage;

import android.content.Intent;
import com.google.android.apps.gmm.shared.webview.api.WebViewCallbacks;
/* compiled from: PG */
/* renamed from: bebu  reason: default package */
/* loaded from: classes3.dex */
public class bebu {
    private final dzsj<gga> a;
    private final dzsj<dxio<bvvw>> b;
    private final dzsj<dxio<afha>> c;
    private final dzsj<dxio<afef>> d;
    private final dzsj<dxio<afec>> e;

    public bebu(dzsj<gga> dzsjVar, dzsj<dxio<bvvw>> dzsjVar2, dzsj<dxio<afha>> dzsjVar3, dzsj<dxio<afef>> dzsjVar4, dzsj<dxio<afec>> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bebt a(@dzsi Intent intent, @dzsi WebViewCallbacks webViewCallbacks, dnxf dnxfVar, ddho ddhoVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        b(dnxfVar, 8);
        b(ddhoVar, 9);
        return new bebt(a, a2, a3, a4, a5, intent, webViewCallbacks, dnxfVar, ddhoVar);
    }
}
