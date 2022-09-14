package androidx.core.app;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.g;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1546a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Field f1547b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1548c;

    public static Bundle a(Notification.Builder builder, g.a aVar) {
        IconCompat e2 = aVar.e();
        builder.addAction(e2 != null ? e2.a() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", a(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", a(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }

    public static Bundle a(Notification notification) {
        String str;
        String str2;
        synchronized (f1546a) {
            if (f1548c) {
                return null;
            }
            try {
                if (f1547b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1548c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1547b = declaredField;
                }
                Bundle bundle = (Bundle) f1547b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1547b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1548c = true;
                return null;
            } catch (NoSuchFieldException e3) {
                e = e3;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f1548c = true;
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(g.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat e2 = aVar.e();
        bundle.putInt("icon", e2 != null ? e2.a() : 0);
        bundle.putCharSequence("title", aVar.i());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", a(aVar.f()));
        bundle.putBoolean("showsUserInterface", aVar.h());
        bundle.putInt("semanticAction", aVar.g());
        return bundle;
    }

    private static Bundle a(l lVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", lVar.g());
        bundle.putCharSequence("label", lVar.f());
        bundle.putCharSequenceArray("choices", lVar.c());
        bundle.putBoolean("allowFreeFormInput", lVar.a());
        bundle.putBundle("extras", lVar.e());
        Set<String> b2 = lVar.b();
        if (b2 != null && !b2.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(b2.size());
            for (String str : b2) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

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

    private static Bundle[] a(l[] lVarArr) {
        if (lVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lVarArr.length];
        for (int i = 0; i < lVarArr.length; i++) {
            bundleArr[i] = a(lVarArr[i]);
        }
        return bundleArr;
    }
}
