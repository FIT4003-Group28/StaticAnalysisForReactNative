package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: czo  reason: default package */
/* loaded from: classes3.dex */
public final class czo {
    public static final Object a = new Object();
    public static final Map b = new HashMap(4);
    public static final WeakHashMap c = new WeakHashMap();
    private static final WeakHashMap d = new WeakHashMap();
    private static czn e;

    public static dcm a(Context context, czb czbVar) {
        synchronized (a) {
            Map map = b;
            SparseArray sparseArray = (SparseArray) map.get(context);
            if (sparseArray == null) {
                if (c.containsKey(czu.a(context))) {
                    return null;
                }
                if (!d.containsKey(context) && e == null) {
                    e = new czn();
                    ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(e);
                }
                sparseArray = new SparseArray();
                map.put(context, sparseArray);
            }
            dcm dcmVar = (dcm) sparseArray.get(czbVar.u);
            if (dcmVar == null) {
                dcmVar = czbVar.I();
                sparseArray.put(czbVar.u, dcmVar);
            }
            return dcmVar;
        }
    }
}
