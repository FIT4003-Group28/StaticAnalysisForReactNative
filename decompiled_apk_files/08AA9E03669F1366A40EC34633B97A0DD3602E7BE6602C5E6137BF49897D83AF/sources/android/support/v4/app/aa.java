package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.y;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes.dex */
class aa {

    /* renamed from: b  reason: collision with root package name */
    private static Field f189b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f190c;

    /* renamed from: a  reason: collision with root package name */
    private static final Object f188a = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f191d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (f188a) {
            if (f190c) {
                return null;
            }
            try {
                if (f189b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f190c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f189b = declaredField;
                }
                Bundle bundle = (Bundle) f189b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f189b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f190c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f190c = true;
                return null;
            }
        }
    }

    public static Bundle a(Notification.Builder builder, y.a aVar) {
        builder.addAction(aVar.a(), aVar.b(), aVar.c());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", a(aVar.f()));
        }
        if (aVar.g() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(aVar.g()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.e());
        return bundle;
    }

    private static Bundle a(ad adVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", adVar.a());
        bundle.putCharSequence("label", adVar.b());
        bundle.putCharSequenceArray("choices", adVar.c());
        bundle.putBoolean("allowFreeFormInput", adVar.e());
        bundle.putBundle("extras", adVar.f());
        Set<String> d2 = adVar.d();
        if (d2 != null && !d2.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d2.size());
            for (String str : d2) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] a(ad[] adVarArr) {
        if (adVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[adVarArr.length];
        for (int i = 0; i < adVarArr.length; i++) {
            bundleArr[i] = a(adVarArr[i]);
        }
        return bundleArr;
    }
}
