package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amfn  reason: default package */
/* loaded from: classes.dex */
public final class amfn extends dp implements amfp {
    public Executor a;
    public Set c;
    public final amfe b = new amfe();
    public boolean d = false;

    @Override // defpackage.dp
    public final void lU() {
        super.lU();
        aqxo.z(!this.d, "FuturesMixinRetainedFragment.stopCallbacks() must be called before it becomes detached from its parent.");
        amfe amfeVar = this.b;
        uwp.f();
        amfeVar.c.clear();
        this.a = null;
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        aC();
        if (bundle != null) {
            Parcelable[] parcelableArray = bundle.getParcelableArray("future_wrappers");
            this.c = new HashSet(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                this.c.add((ParcelableFuture) parcelable);
            }
        } else {
            this.c = new HashSet(1);
        }
        amfe amfeVar = this.b;
        uwp.f();
        if (bundle != null) {
            String str = amfeVar.b;
            String concat = str.length() != 0 ? "CallbackIdMap.classes".concat(str) : new String("CallbackIdMap.classes");
            aqxo.z(bundle.containsKey(concat), "CallbackIdMap writes its keys unconditionally. It did not find its state on restore, which suggests state loss.");
            String[] stringArray = bundle.getStringArray(concat);
            String str2 = amfeVar.b;
            int[] intArray = bundle.getIntArray(str2.length() != 0 ? "CallbackIdMap.class_ids".concat(str2) : new String("CallbackIdMap.class_ids"));
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    Integer num = (Integer) amfeVar.d.put(Class.forName(stringArray[i]), Integer.valueOf(intArray[i]));
                    if (num != null) {
                        int intValue = num.intValue();
                        int i2 = intArray[i];
                        aqxo.F(intValue == i2, "Callback ID for class %s was restored with ID %s, but had an existing mapping of %s. Always register for FuturesMixin callbacks and subscribe to SubscriptionMixin callbacks in onCreate()! Do *not* subscribe in a Peer's constructor", stringArray[i], Integer.valueOf(i2), num);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        Set set = this.c;
        bundle.putParcelableArray("future_wrappers", (Parcelable[]) set.toArray(new ParcelableFuture[set.size()]));
        amfe amfeVar = this.b;
        uwp.f();
        String str = amfeVar.b;
        String concat = str.length() != 0 ? "CallbackIdMap.classes".concat(str) : new String("CallbackIdMap.classes");
        aqxo.B(!bundle.containsKey(concat), "Bundle already contains key %s. This suggests that two instances of CallbackIdMap were created with the same key in the same Fragment or Activity. This creates state store/restore collisions. Check for bugs where the same mixin is created for a Fragment twice during one lifecycle.", concat);
        afw afwVar = amfeVar.d;
        int i = afwVar.j;
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (Map.Entry entry : afwVar.entrySet()) {
            strArr[i2] = ((Class) entry.getKey()).getName();
            iArr[i2] = ((Integer) entry.getValue()).intValue();
            i2++;
        }
        bundle.putStringArray(concat, strArr);
        String str2 = amfeVar.b;
        bundle.putIntArray(str2.length() != 0 ? "CallbackIdMap.class_ids".concat(str2) : new String("CallbackIdMap.class_ids"), iArr);
    }
}
