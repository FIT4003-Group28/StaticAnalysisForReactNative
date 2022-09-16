package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: sna  reason: default package */
/* loaded from: classes4.dex */
public final class sna {
    public final aet a;
    public final IBinder b;
    public final Parcelable c;
    public final snb d;
    private volatile Boolean e;

    public sna(snb snbVar, aet aetVar) {
        a();
        a();
        a();
        this.e = null;
        this.d = snbVar;
        this.a = aetVar;
        this.b = new aeq(aetVar).a().a.getExtras().getBinder("android.support.customtabs.extra.SESSION");
        this.c = new aeq(aetVar).a().a.getParcelableExtra("android.support.customtabs.extra.SESSION_ID");
    }

    private static void a() {
        new AtomicBoolean(false);
    }
}
