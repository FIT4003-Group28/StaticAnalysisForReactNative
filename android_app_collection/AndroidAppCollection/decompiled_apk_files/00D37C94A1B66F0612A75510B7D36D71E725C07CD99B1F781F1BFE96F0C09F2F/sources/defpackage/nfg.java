package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.EdgeEffect;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: nfg  reason: default package */
/* loaded from: classes3.dex */
public final class nfg {
    private final amqo a;
    private final amqo b;
    private final amqo c;

    public nfg(Context context) {
        aqxo.i(new nfd(context, 1));
        this.a = aqxo.i(new nfd(context));
        this.b = aqxo.i(new nfd(context, 2));
        this.c = aqxo.i(new nfd(context, 3));
    }

    public final EdgeEffect a(int i) {
        if (i != 1) {
            if (i != 2) {
                return (EdgeEffect) this.c.get();
            }
            return (EdgeEffect) this.b.get();
        }
        return (EdgeEffect) this.a.get();
    }

    public final void b(int i, View view, EdgeEffect edgeEffect) {
        WeakHashMap weakHashMap;
        if (i == 1) {
            int i2 = nff.b;
            weakHashMap = ((nff) this.a.get()).a;
        } else if (i != 2) {
            int i3 = nff.b;
            weakHashMap = ((nff) this.c.get()).a;
        } else {
            int i4 = nff.b;
            weakHashMap = ((nff) this.b.get()).a;
        }
        weakHashMap.put(view, new WeakReference(edgeEffect));
    }
}
