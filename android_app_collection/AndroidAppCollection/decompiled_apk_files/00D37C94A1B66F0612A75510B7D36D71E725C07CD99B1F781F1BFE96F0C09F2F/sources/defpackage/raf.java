package defpackage;

import android.content.Context;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: raf  reason: default package */
/* loaded from: classes4.dex */
public abstract class raf {
    private final String a;
    private Object b;

    /* JADX INFO: Access modifiers changed from: protected */
    public raf(String str) {
        this.a = str;
    }

    protected abstract Object c(IBinder iBinder);

    public final Object d(Context context) {
        if (this.b == null) {
            qnm.b(context);
            Context c = qse.c(context);
            if (c == null) {
                throw new rae();
            }
            try {
                this.b = c((IBinder) c.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new rae("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new rae("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new rae("Could not instantiate creator.", e3);
            }
        }
        return this.b;
    }
}
