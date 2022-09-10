package defpackage;

import android.app.Activity;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cpdo  reason: default package */
/* loaded from: classes5.dex */
public final class cpdo {
    public static final cnoa<cpes> a;
    static final cnnp<cpes, cpdn> b;
    public static final Api<cpdn> c;
    @Deprecated
    public static final cpeq d;

    static {
        cnoa<cpes> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cpdm cpdmVar = new cpdm();
        b = cpdmVar;
        c = new Api<>("Udc.API", cpdmVar, cnoaVar);
        d = new cpeq();
    }

    public static cpdv a(Activity activity, cpdn cpdnVar) {
        return new cpdv(activity, cpdnVar);
    }
}
