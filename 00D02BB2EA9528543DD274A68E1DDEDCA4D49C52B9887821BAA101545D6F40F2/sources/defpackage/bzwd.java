package defpackage;

import android.app.Application;
import defpackage.dssj;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: bzwd  reason: default package */
/* loaded from: classes.dex */
public final class bzwd<M extends dssj> {
    private static final dcqe a = dcqe.c("bzwd");
    private final Application b;
    private final bwsa c;
    private final String d;
    private final dssr<M> e;

    public bzwd(Application application, bwsa bwsaVar, String str, dssr<M> dssrVar) {
        this.b = application;
        this.c = bwsaVar;
        this.d = str;
        this.e = dssrVar;
    }

    private final String c() {
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? "ShortTermStorage_".concat(valueOf) : new String("ShortTermStorage_");
    }

    private final String d() {
        String str = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("ShortTermStorage_");
        sb.append(str);
        sb.append("_Version");
        return sb.toString();
    }

    private final byte[] e() {
        return decn.e(bvoc.c(this.b));
    }

    @dzsi
    public final M a() {
        byte[] a2;
        byte[] a3 = this.c.a(d());
        if (a3 == null || !Arrays.equals(a3, e()) || (a2 = this.c.a(c())) == null) {
            return null;
        }
        try {
            return (M) bvrs.j(this.e, a2, a2.length, dsqa.b());
        } catch (IOException unused) {
            return null;
        }
    }

    public final void b(M m) {
        try {
            this.c.b(d());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bvrs.a(new DataOutputStream(byteArrayOutputStream), m);
                this.c.d(byteArrayOutputStream.toByteArray(), c());
                this.c.d(e(), d());
            } catch (IOException e) {
                bvoo.h("Failed trying to write protobuf %s", e);
                throw e;
            }
        } catch (IOException unused) {
        }
    }
}
