package defpackage;

import android.os.Bundle;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
/* compiled from: PG */
/* renamed from: bvrs  reason: default package */
/* loaded from: classes.dex */
public final class bvrs {
    public static void a(OutputStream outputStream, dssj dssjVar) {
        new DataOutputStream(outputStream).writeInt(dssjVar.cb());
        dssjVar.bT(outputStream);
    }

    @dzsi
    public static <T extends dssj> T b(@dzsi byte[] bArr, dssr<T> dssrVar) {
        if (bArr == null) {
            return null;
        }
        try {
            return dssrVar.j(bArr);
        } catch (dsrm unused) {
            return null;
        }
    }

    @dzsi
    public static <T extends dssj> T c(@dzsi dspd dspdVar, dssr<T> dssrVar) {
        if (dspdVar == null) {
            return null;
        }
        try {
            return dssrVar.l(dspdVar);
        } catch (dsrm unused) {
            return null;
        }
    }

    public static <T extends dssj> Bundle d(T t) {
        Bundle bundle = new Bundle();
        l(bundle, t);
        return bundle;
    }

    @dzsi
    public static <T extends dssj> T e(@dzsi Bundle bundle, Class<T> cls, dssr<T> dssrVar) {
        return (T) f(bundle, cls.getName(), dssrVar);
    }

    @dzsi
    public static <T extends dssj> T f(@dzsi Bundle bundle, String str, dssr<T> dssrVar) {
        return (T) g(bundle, str, dssrVar, null);
    }

    public static <T extends dssj> T g(@dzsi Bundle bundle, String str, dssr<T> dssrVar, T t) {
        return (T) h(bundle, str, dssrVar, t, null);
    }

    public static <T extends dssj> T h(@dzsi Bundle bundle, String str, dssr<T> dssrVar, T t, @dzsi dsqa dsqaVar) {
        byte[] byteArray;
        if (bundle == null || (byteArray = bundle.getByteArray(str)) == null) {
            return t;
        }
        try {
            return dsqaVar == null ? dssrVar.j(byteArray) : dssrVar.i(byteArray, dsqaVar);
        } catch (dsrm unused) {
            return t;
        }
    }

    @dzsi
    public static <T extends dssj> T i(String str, dssr<T> dssrVar) {
        try {
            return dssrVar.j(Base64.decode(str, 0));
        } catch (dsrm | IllegalArgumentException unused) {
            return null;
        }
    }

    public static <T extends dssj> void k(Bundle bundle, String str, T t) {
        bundle.putByteArray(str, t.bS());
    }

    public static <T extends dssj> void l(Bundle bundle, T t) {
        k(bundle, t.getClass().getName(), t);
    }

    public static <T extends dssj> T j(dssr<T> dssrVar, byte[] bArr, int i, dsqa dsqaVar) {
        if (i < 4) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("not enough bytes, length=");
            sb.append(i);
            throw new IOException(sb.toString());
        }
        int k = decl.k(bArr[0], bArr[1], bArr[2], bArr[3]);
        int abs = Math.abs(k);
        if (k >= 0) {
            return dssrVar.k(bArr, 4, abs, dsqaVar);
        }
        if (abs <= 65536) {
            byte[] a = deea.a(bArr, 4, abs);
            return dssrVar.k(a, 0, a.length, dsqaVar);
        }
        return dssrVar.g(new GZIPInputStream(new ByteArrayInputStream(bArr, 4, abs)), dsqaVar);
    }
}
