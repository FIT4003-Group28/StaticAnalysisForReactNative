package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: gd  reason: default package */
/* loaded from: classes3.dex */
public final class gd implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    private gd(Context context) {
        this.b = context;
    }

    public static gd a(Context context) {
        return new gd(context);
    }

    public final void b(Intent intent) {
        this.a.add(intent);
    }

    public final void c(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent G = iy.G(this.b, componentName);
            while (G != null) {
                this.a.add(size, G);
                G = iy.G(this.b, G.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
