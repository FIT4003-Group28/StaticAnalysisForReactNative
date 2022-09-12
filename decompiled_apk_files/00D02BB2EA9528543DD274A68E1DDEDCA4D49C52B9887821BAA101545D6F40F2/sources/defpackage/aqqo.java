package defpackage;

import android.content.Intent;
import android.net.Uri;
/* renamed from: aqqo  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class aqqo implements dbsl {
    static final dbsl a = new aqqo();

    private aqqo() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Uri data;
        Intent intent = ((afga) obj).a;
        String action = intent.getAction();
        return "com.google.business.ACTION_MAPS_MESSAGE".equals(action) || ("android.intent.action.VIEW".equals(action) && (data = intent.getData()) != null && "business.google.com".equals(data.getHost()) && "/maps_message".equals(data.getPath()));
    }
}
