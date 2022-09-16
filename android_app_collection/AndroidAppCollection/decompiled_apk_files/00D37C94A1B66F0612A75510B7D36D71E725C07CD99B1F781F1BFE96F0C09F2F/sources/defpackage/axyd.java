package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axyd  reason: default package */
/* loaded from: classes2.dex */
public final class axyd {
    public static final axyd a = new axyd();
    public axyy b;
    public Executor c;
    public List d;
    public Boolean e;
    public Integer f;
    public Integer g;
    private Object[][] h;

    private axyd() {
        this.d = Collections.emptyList();
        this.h = (Object[][]) Array.newInstance(Object.class, 0, 2);
    }

    public final axyd a(axyy axyyVar) {
        axyd axydVar = new axyd(this);
        axydVar.b = axyyVar;
        return axydVar;
    }

    public final axyd b(int i) {
        aqxo.s(i >= 0, "invalid maxsize %s", i);
        axyd axydVar = new axyd(this);
        axydVar.f = Integer.valueOf(i);
        return axydVar;
    }

    public final axyd c(int i) {
        aqxo.s(i >= 0, "invalid maxsize %s", i);
        axyd axydVar = new axyd(this);
        axydVar.g = Integer.valueOf(i);
        return axydVar;
    }

    public final axyd d(axyc axycVar, Object obj) {
        axycVar.getClass();
        obj.getClass();
        axyd axydVar = new axyd(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.h;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (axycVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance(Object.class, this.h.length + (i == -1 ? 1 : 0), 2);
        axydVar.h = objArr2;
        Object[][] objArr3 = this.h;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            Object[][] objArr4 = axydVar.h;
            int length = this.h.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = axycVar;
            objArr5[1] = obj;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = axydVar.h;
            Object[] objArr7 = new Object[2];
            objArr7[0] = axycVar;
            objArr7[1] = obj;
            objArr6[i] = objArr7;
        }
        return axydVar;
    }

    public final Object e(axyc axycVar) {
        axycVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.h;
            if (i < objArr.length) {
                if (axycVar.equals(objArr[i][0])) {
                    return this.h[i][1];
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.e);
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("deadline", this.b);
        c.b("authority", null);
        c.b("callCredentials", null);
        Executor executor = this.c;
        c.b("executor", executor != null ? executor.getClass() : null);
        c.b("compressorName", null);
        c.b("customOptions", Arrays.deepToString(this.h));
        c.g("waitForReady", f());
        c.b("maxInboundMessageSize", this.f);
        c.b("maxOutboundMessageSize", this.g);
        c.b("streamTracerFactories", this.d);
        return c.toString();
    }

    public axyd(axyd axydVar) {
        this.d = Collections.emptyList();
        this.b = axydVar.b;
        this.c = axydVar.c;
        this.h = axydVar.h;
        this.e = axydVar.e;
        this.f = axydVar.f;
        this.g = axydVar.g;
        this.d = axydVar.d;
    }
}
