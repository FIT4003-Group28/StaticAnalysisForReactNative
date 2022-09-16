package com.dooboolab.RNIap;

import android.util.Log;
import com.facebook.react.bridge.ObjectAlreadyConsumedException;
import com.facebook.react.bridge.Promise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f5181b = new a();

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, ArrayList<Promise>> f5182a = new HashMap<>();

    public static a a() {
        return f5181b;
    }

    public void a(Promise promise, int i) {
        String[] a2 = a(i);
        promise.reject(a2[0], a2[1]);
    }

    public void a(String str, int i) {
        try {
            if (!this.f5182a.containsKey(str)) {
                return;
            }
            Iterator<Promise> it = this.f5182a.get(str).iterator();
            while (it.hasNext()) {
                a(it.next(), i);
            }
            this.f5182a.remove(str);
        } catch (ObjectAlreadyConsumedException e2) {
            Log.e("DoobooUtils", e2.getMessage());
        }
    }

    public void a(String str, Promise promise) {
        ArrayList<Promise> arrayList;
        try {
            if (this.f5182a.containsKey(str)) {
                arrayList = this.f5182a.get(str);
            } else {
                ArrayList<Promise> arrayList2 = new ArrayList<>();
                this.f5182a.put(str, arrayList2);
                arrayList = arrayList2;
            }
            arrayList.add(promise);
        } catch (ObjectAlreadyConsumedException e2) {
            Log.e("DoobooUtils", e2.getMessage());
        }
    }

    public void a(String str, Object obj) {
        try {
            if (!this.f5182a.containsKey(str)) {
                return;
            }
            Iterator<Promise> it = this.f5182a.get(str).iterator();
            while (it.hasNext()) {
                it.next().resolve(obj);
            }
            this.f5182a.remove(str);
        } catch (ObjectAlreadyConsumedException e2) {
            Log.e("DoobooUtils", e2.getMessage());
        }
    }

    public String[] a(int i) {
        String[] strArr = new String[2];
        switch (i) {
            case -2:
                strArr[0] = "E_SERVICE_ERROR";
                strArr[1] = "This feature is not available on your device.";
                break;
            case -1:
                strArr[0] = "E_NETWORK_ERROR";
                strArr[1] = "The service is disconnected (check your internet connection.)";
                break;
            case 0:
                strArr[0] = "OK";
                strArr[1] = "";
                break;
            case 1:
                strArr[0] = "E_USER_CANCELLED";
                strArr[1] = "Payment is Cancelled.";
                break;
            case 2:
                strArr[0] = "E_SERVICE_ERROR";
                strArr[1] = "The service is unreachable. This may be your internet connection, or the Play Store may be down.";
                break;
            case 3:
                strArr[0] = "E_SERVICE_ERROR";
                strArr[1] = "Billing is unavailable. This may be a problem with your device, or the Play Store may be down.";
                break;
            case 4:
                strArr[0] = "E_ITEM_UNAVAILABLE";
                strArr[1] = "That item is unavailable.";
                break;
            case 5:
                strArr[0] = "E_DEVELOPER_ERROR";
                strArr[1] = "Google is indicating that we have some issue connecting to payment.";
                break;
            case 6:
                strArr[0] = "E_UNKNOWN";
                strArr[1] = "An unknown or unexpected error has occured. Please try again later.";
                break;
            case 7:
                strArr[0] = "E_ALREADY_OWNED";
                strArr[1] = "You already own this item.";
                break;
            default:
                strArr[0] = "E_UNKNOWN";
                strArr[1] = "Purchase failed with code: " + i;
                break;
        }
        Log.e("DoobooUtils", "Error Code : " + i);
        return strArr;
    }
}
