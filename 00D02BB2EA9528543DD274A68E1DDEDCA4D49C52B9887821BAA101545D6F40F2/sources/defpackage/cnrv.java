package defpackage;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cnrv  reason: default package */
/* loaded from: classes.dex */
public interface cnrv {
    <A extends cnnq, R extends cnom, T extends cnpg<R, A>> T a(T t);

    <A extends cnnq, T extends cnpg<? extends cnom, A>> T b(T t);

    ConnectionResult c(Api<?> api);

    void d();

    ConnectionResult e();

    ConnectionResult f(long j, TimeUnit timeUnit);

    void g();

    boolean h();

    boolean i();

    boolean j(cnss cnssVar);

    void k();

    void l();

    boolean m();

    void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
