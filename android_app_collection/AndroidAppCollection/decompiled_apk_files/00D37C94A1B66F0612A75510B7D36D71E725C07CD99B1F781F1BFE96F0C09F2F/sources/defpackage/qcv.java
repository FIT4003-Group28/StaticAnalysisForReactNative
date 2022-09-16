package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qcv  reason: default package */
/* loaded from: classes4.dex */
public abstract class qcv {
    public final int a;
    public final String b;
    public final Object c;

    public qcv(int i, String str, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
        qat.a().a.add(this);
    }

    public static qcv d(int i, String str, Boolean bool) {
        return new qcq(i, str, bool);
    }

    public static void f(String str, float f) {
        new qct(str, Float.valueOf(f));
    }

    public static void g(String str, int i) {
        new qcr(str, Integer.valueOf(i));
    }

    public static qcv h(String str, long j) {
        return new qcs(str, Long.valueOf(j));
    }

    public static qcv i(String str, String str2) {
        return new qcu(str, str2);
    }

    protected abstract Object a(JSONObject jSONObject);

    public abstract Object b(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object c(SharedPreferences sharedPreferences);

    public final Object e() {
        final qda b = qat.b();
        if (!b.b.block(5000L)) {
            synchronized (b.a) {
                if (!b.d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!b.c || b.e == null) {
            synchronized (b.a) {
                if (b.c && b.e != null) {
                }
                return this.c;
            }
        }
        if (this.a == 2) {
            Bundle bundle = b.f;
            return bundle == null ? this.c : b(bundle);
        } else if (!b.h.has(this.b)) {
            return ptx.k(new amqo() { // from class: qcy
                @Override // defpackage.amqo
                public final Object get() {
                    return this.c(qda.this.e);
                }
            });
        } else {
            return a(b.h);
        }
    }
}
