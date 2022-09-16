package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: duw  reason: default package */
/* loaded from: classes3.dex */
public final class duw {
    public final dtq a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public duw(dtq dtqVar, String str, String str2, Class... clsArr) {
        this.a = dtqVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        dtqVar.b.submit(new duv(this));
    }

    public static final String a(byte[] bArr, String str) {
        return new String(dtc.a(bArr, str), "UTF-8");
    }
}
