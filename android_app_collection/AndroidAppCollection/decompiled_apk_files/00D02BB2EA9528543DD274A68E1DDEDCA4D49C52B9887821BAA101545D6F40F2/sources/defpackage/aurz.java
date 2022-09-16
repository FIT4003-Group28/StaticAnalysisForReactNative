package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.notification.intent.GenericWebviewNotificationCallbacks;
/* compiled from: PG */
/* renamed from: aurz  reason: default package */
/* loaded from: classes.dex */
public final class aurz extends afhx {
    public static final ddho a = dtxq.b;
    public static final dkyx b;
    public static final dbsl<afga> c;
    private final bvvw d;
    @dzsi
    private final String e;

    static {
        dkyw bZ = dkyx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkyx.b((dkyx) bZ.b);
        b = bZ.bK();
        c = aury.a;
    }

    public aurz(Intent intent, @dzsi String str, bvvw bvvwVar) {
        super(intent, str, afid.GENERIC_WEB_VIEW_NOTIFICATION);
        this.d = bvvwVar;
        this.e = intent.getStringExtra("cohort");
    }

    @Override // defpackage.afhx
    public final void a() {
        Uri data = this.f.getData();
        if (data == null || data.getPath() == null) {
            return;
        }
        GenericWebviewNotificationCallbacks genericWebviewNotificationCallbacks = new GenericWebviewNotificationCallbacks(GenericWebviewNotificationCallbacks.k(this.e));
        ((ckhe) genericWebviewNotificationCallbacks.b.a(ckht.aU)).a();
        bvvw bvvwVar = this.d;
        String uri = data.toString();
        bvxn bZ = bvxu.A.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        uri.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = uri;
        int i2 = i | 4;
        bvxuVar.a = i2;
        bvxuVar.d = true;
        bvxuVar.a = i2 | 32;
        bvxuVar.g = true;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        int i3 = bvxuVar2.a | 64;
        bvxuVar2.a = i3;
        bvxuVar2.h = "aGMM.GenericWebview";
        bvxuVar2.a = i3 | 8;
        bvxuVar2.e = true;
        dkyx dkyxVar = b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        dkyxVar.getClass();
        bvxuVar3.j = dkyxVar;
        bvxuVar3.a |= 256;
        bvvwVar.j(bZ.bK(), genericWebviewNotificationCallbacks, a);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_GENERIC_WEBVIEW_NOTIFICATION;
    }
}
