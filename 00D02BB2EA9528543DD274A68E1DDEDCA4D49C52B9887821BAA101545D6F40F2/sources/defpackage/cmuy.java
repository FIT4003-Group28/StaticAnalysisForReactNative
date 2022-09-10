package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cmuy  reason: default package */
/* loaded from: classes5.dex */
public final class cmuy {
    public static final cnoa<cnyz> a;
    @Deprecated
    public static final Api<cmuz> b;
    private static final cnnp<cnyz, cmuz> c;

    static {
        cnoa<cnyz> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cmux cmuxVar = new cmux();
        c = cmuxVar;
        b = new Api<>("ContextManager.API", cmuxVar, cnoaVar);
    }

    public static cmva a(Context context, cmuz cmuzVar) {
        return new cmva(context, cmuzVar);
    }

    public static cmuw b(Context context, cmuz cmuzVar) {
        return new cmuw(context, cmuzVar);
    }
}
