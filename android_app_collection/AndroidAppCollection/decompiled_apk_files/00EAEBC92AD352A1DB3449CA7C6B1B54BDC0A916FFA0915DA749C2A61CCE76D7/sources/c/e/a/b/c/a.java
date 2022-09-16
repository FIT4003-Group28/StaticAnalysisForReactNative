package c.e.a.b.c;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: c.e.a.b.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0096a extends c.e.a.b.d.c.b implements a {

        /* renamed from: c.e.a.b.c.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0097a extends c.e.a.b.d.c.a implements a {
            C0097a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public AbstractBinderC0096a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new C0097a(iBinder);
        }
    }
}
