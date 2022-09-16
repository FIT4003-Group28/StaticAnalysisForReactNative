package defpackage;

import java.util.Arrays;
/* compiled from: PG */
@Deprecated
/* renamed from: cmsn  reason: default package */
/* loaded from: classes5.dex */
public final class cmsn implements cnnu, cnnw {
    public static final cmsn a = new cmsm().a();
    public final String b = null;
    public final boolean c;
    public final String d;

    public cmsn(cmsm cmsmVar) {
        this.c = cmsmVar.a.booleanValue();
        this.d = cmsmVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cmsn)) {
            return false;
        }
        cmsn cmsnVar = (cmsn) obj;
        String str = cmsnVar.b;
        return cnvv.a(null, null) && this.c == cmsnVar.c && cnvv.a(this.d, cmsnVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.c), this.d});
    }
}
