package defpackage;

import defpackage.dssj;
import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: czmv  reason: default package */
/* loaded from: classes5.dex */
public abstract class czmv<T extends dssj> implements czks<T> {
    public static <T extends dssj> czmv<T> d(T t, dsqa dsqaVar) {
        return new czmu(t, dsqaVar);
    }

    @Override // defpackage.czks
    public final /* bridge */ /* synthetic */ void a(Object obj, OutputStream outputStream) {
        ((dssj) obj).bT(outputStream);
    }

    public abstract T b();

    public abstract dsqa c();

    public final T e(InputStream inputStream) {
        return (T) b().bY().g(inputStream, c());
    }
}
