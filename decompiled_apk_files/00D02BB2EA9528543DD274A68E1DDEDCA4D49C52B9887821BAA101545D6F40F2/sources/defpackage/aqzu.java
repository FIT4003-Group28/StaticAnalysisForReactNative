package defpackage;

import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.Closeable;
/* compiled from: PG */
/* renamed from: aqzu  reason: default package */
/* loaded from: classes.dex */
public interface aqzu extends Closeable {
    void a(area areaVar);

    boolean b(long j);

    void c(akzh akzhVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d();

    void e();

    void f();

    void g();

    boolean h(GmmLocation gmmLocation);

    void i(AndroidLocationEvent androidLocationEvent);

    boolean j(CarHeadingEvent carHeadingEvent);

    boolean k(float f);

    void l(float f);

    void m(boolean z);

    void n();

    void o();
}
