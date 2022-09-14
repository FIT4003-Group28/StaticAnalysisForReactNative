package defpackage;

import com.google.android.gms.common.api.Api;
import defpackage.cnnx;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cnpa  reason: default package */
/* loaded from: classes.dex */
public final class cnpa<O extends cnnx> {
    public final Api<O> a;
    private final int b;
    private final O c;
    private final String d;

    private cnpa(Api<O> api, O o, String str) {
        this.a = api;
        this.c = o;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{api, o, str});
    }

    public static <O extends cnnx> cnpa<O> a(Api<O> api, O o, String str) {
        return new cnpa<>(api, o, str);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cnpa)) {
            return false;
        }
        cnpa cnpaVar = (cnpa) obj;
        return cnvv.a(this.a, cnpaVar.a) && cnvv.a(this.c, cnpaVar.c) && cnvv.a(this.d, cnpaVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
