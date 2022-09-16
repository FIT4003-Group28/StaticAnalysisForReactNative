package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ac  reason: default package */
/* loaded from: classes.dex */
public class ac {
    public final Map b = new HashMap();
    public volatile boolean c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = this.b.get("android.arch.lifecycle.savedstate.vm.tag");
            if (obj2 == null) {
                this.b.put("android.arch.lifecycle.savedstate.vm.tag", obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.c) {
            a(obj);
        }
    }
}
