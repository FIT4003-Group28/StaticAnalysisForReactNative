package defpackage;

import android.accounts.AuthenticatorException;
import android.content.Context;
import com.google.android.youtube.R;
import java.io.IOException;
import java.net.SocketException;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: yyx  reason: default package */
/* loaded from: classes4.dex */
public final class yyx implements yzj {
    private final Context a;
    private final yrj b;
    private final alj c;
    private final axxb d;

    public yyx(Context context, yrj yrjVar, axxb axxbVar) {
        context.getClass();
        this.a = context;
        yrjVar.getClass();
        this.b = yrjVar;
        this.c = alj.a();
        this.d = axxbVar;
    }

    private final zdy f(Object... objArr) {
        if (this.b.o()) {
            if (objArr.length <= 0) {
                return zdy.a(this.a, R.string.common_error_network, new Object[0]);
            }
            return new zdy(this.a.getString(R.string.common_error_network), zdy.c(this.a, R.string.common_error_network, objArr));
        } else if (objArr.length <= 0) {
            return zdy.b(this.a, 1, R.string.common_no_network, new Object[0]);
        } else {
            return new zdy(this.a.getString(R.string.common_no_network), zdy.c(this.a, R.string.common_no_network, objArr), 1);
        }
    }

    @Override // defpackage.yzj
    public final zdy a(Throwable th) {
        Boolean bool;
        int i;
        if (th == null) {
            return zdy.a(this.a, R.string.common_error_generic, new Object[0]);
        }
        if (th instanceof zeo) {
            return ((zeo) th).a(this.a);
        }
        if (th instanceof AuthenticatorException) {
            return zdy.a(this.a, R.string.common_error_authenticating, new Object[0]);
        }
        if (th instanceof SocketException) {
            return f(new Object[0]);
        }
        if (th instanceof yrc) {
            yrc yrcVar = (yrc) th;
            Context context = this.a;
            int i2 = yrcVar.a;
            if (i2 == 403) {
                return new zdy(context.getString(R.string.common_error_forbidden_action), zdy.c(context, R.string.common_error_http, 403));
            }
            if (i2 == 500) {
                return new zdy(context.getString(R.string.common_error_generic), zdy.c(context, R.string.common_error_http, 500));
            }
            if (i2 == 401) {
                return new zdy(context.getString(R.string.common_error_unauthorized), zdy.c(context, R.string.common_error_http, 401));
            }
            String format = String.format(Locale.US, "%d", Integer.valueOf(yrcVar.a));
            return new zdy(context.getString(R.string.common_error_http, this.c.b(format)), zdy.c(context, R.string.common_error_http, format));
        }
        if (th instanceof cff) {
            cff cffVar = (cff) th;
            cew cewVar = cffVar.b;
            if (cewVar != null && (i = cewVar.a) > 0) {
                if (i == 403) {
                    return new zdy(this.a.getString(R.string.common_error_forbidden_action), zdy.c(this.a, R.string.common_error_http, 403));
                }
                if (i == 401) {
                    return new zdy(this.a.getString(R.string.common_error_unauthorized), zdy.c(this.a, R.string.common_error_http, 401));
                }
                if (i == 500) {
                    return new zdy(this.a.getString(R.string.common_error_generic), zdy.c(this.a, R.string.common_error_http, 500));
                }
                String format2 = String.format(Locale.US, "%d", Integer.valueOf(cewVar.a));
                return new zdy(this.a.getString(R.string.common_error_http, this.c.b(format2)), zdy.c(this.a, R.string.common_error_http, format2));
            }
            if (th instanceof ceq) {
                if (!(th.getCause() instanceof IOException)) {
                    String message = th.getMessage();
                    if (message == null || message.isEmpty()) {
                        return zdy.a(this.a, R.string.common_error_authenticating, new Object[0]);
                    }
                    return new zdy(this.a.getString(R.string.common_error_authenticating), zdy.c(this.a, R.string.common_error_authenticating, message.replace(' ', '_')));
                }
                axxb axxbVar = this.d;
                if (axxbVar != null) {
                    aqxe aqxeVar = axxbVar.b.b().C;
                    if (aqxeVar == null) {
                        aqxeVar = aqxe.a;
                    }
                    if (aqxeVar.a(45355319L)) {
                        aoqp aoqpVar = aqxeVar.b;
                        if (!aoqpVar.containsKey(45355319L)) {
                            throw new IllegalArgumentException();
                        }
                        aqxf aqxfVar = (aqxf) aoqpVar.get(45355319L);
                        bool = Boolean.valueOf(aqxfVar.b == 1 ? ((Boolean) aqxfVar.c).booleanValue() : false);
                    } else {
                        bool = false;
                    }
                    if (bool.booleanValue()) {
                        return f("AuthFailureError");
                    }
                }
            }
            if (cffVar instanceof cfe) {
                return zdy.a(this.a, R.string.common_error_timeout, new Object[0]);
            }
        }
        if (th instanceof IOException) {
            return f(new Object[0]);
        }
        return a(th.getCause());
    }

    @Override // defpackage.yzj
    public final String b(Throwable th) {
        return a(th).a;
    }

    @Override // defpackage.yzj
    public final void c(int i) {
        d(this.a.getString(i));
    }

    @Override // defpackage.yzj
    public final void d(String str) {
        zag.r(this.a, str, 1);
    }

    @Override // defpackage.yzj
    public final void e(Throwable th) {
        d(b(th));
    }
}
