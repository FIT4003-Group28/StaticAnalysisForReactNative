package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
/* compiled from: PG */
/* renamed from: couc  reason: default package */
/* loaded from: classes5.dex */
public final class couc {
    static final cnoa<coug> a;
    static final cnnp<coug, cnnw> b;
    public static final Api<cnnw> c;

    static {
        cnoa<coug> cnoaVar = new cnoa<>();
        a = cnoaVar;
        coub coubVar = new coub();
        b = coubVar;
        c = new Api<>("Pay.API", coubVar, cnoaVar);
    }

    public static couf a(Context context) {
        return new couf(context);
    }
}
