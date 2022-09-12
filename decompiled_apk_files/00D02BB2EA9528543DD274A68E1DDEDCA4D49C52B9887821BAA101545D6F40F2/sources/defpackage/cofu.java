package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: cofu  reason: default package */
/* loaded from: classes.dex */
public final class cofu extends cnof<cnnv> {
    public static final cnoa<cofy> a;
    static final cnnp<cofy, cnnv> k;
    public static final Api<cnnv> l;

    static {
        cnoa<cofy> cnoaVar = new cnoa<>();
        a = cnoaVar;
        cofr cofrVar = new cofr();
        k = cofrVar;
        l = new Api<>("LanguageProfile.API", cofrVar, cnoaVar);
    }

    public cofu(Context context) {
        super(context, l, (cnnx) null, cnoe.a);
    }
}
