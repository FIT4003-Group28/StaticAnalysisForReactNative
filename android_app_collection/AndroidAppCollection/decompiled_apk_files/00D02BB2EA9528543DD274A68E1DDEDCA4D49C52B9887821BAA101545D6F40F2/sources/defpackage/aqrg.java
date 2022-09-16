package defpackage;

import android.content.Intent;
import android.net.Uri;
/* renamed from: aqrg  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class aqrg implements dbsl {
    static final dbsl a = new aqrg();

    private aqrg() {
    }

    @Override // defpackage.dbsl
    public final boolean a(Object obj) {
        Uri data;
        Intent intent = ((afga) obj).a;
        if ("com.google.business.ACTION_MESSAGE".equals(intent.getAction())) {
            return true;
        }
        return "android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null && "business.google.com".equals(data.getHost()) && "/message".equals(data.getPath());
    }
}
