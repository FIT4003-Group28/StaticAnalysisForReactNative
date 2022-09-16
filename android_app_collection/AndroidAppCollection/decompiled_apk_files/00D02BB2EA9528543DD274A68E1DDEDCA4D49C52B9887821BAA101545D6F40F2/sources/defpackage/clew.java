package defpackage;

import android.util.Base64;
/* compiled from: PG */
/* renamed from: clew  reason: default package */
/* loaded from: classes5.dex */
public abstract class clew {
    public static clev d() {
        clem clemVar = new clem();
        clemVar.c(clcv.DEFAULT);
        return clemVar;
    }

    public abstract String a();

    public abstract byte[] b();

    public abstract clcv c();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = a();
        objArr[1] = c();
        objArr[2] = b() == null ? "" : Base64.encodeToString(b(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
