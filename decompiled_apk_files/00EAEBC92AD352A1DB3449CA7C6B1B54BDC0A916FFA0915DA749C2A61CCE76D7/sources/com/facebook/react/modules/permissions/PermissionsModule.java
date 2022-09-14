package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import java.util.ArrayList;
@com.facebook.react.d0.a.a(name = PermissionsModule.NAME)
/* loaded from: classes.dex */
public class PermissionsModule extends ReactContextBaseJavaModule implements f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> mCallbacks;
    private int mRequestCode;

    /* loaded from: classes.dex */
    class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f5736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5737b;

        a(PermissionsModule permissionsModule, Promise promise, String str) {
            this.f5736a = promise;
            this.f5737b = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            Promise promise;
            String str;
            int[] iArr = (int[]) objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                promise = this.f5736a;
                str = "granted";
            } else if (((e) objArr[1]).shouldShowRequestPermissionRationale(this.f5737b)) {
                promise = this.f5736a;
                str = "denied";
            } else {
                promise = this.f5736a;
                str = "never_ask_again";
            }
            promise.resolve(str);
        }
    }

    /* loaded from: classes.dex */
    class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f5738a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableMap f5739b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5740c;

        b(PermissionsModule permissionsModule, ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f5738a = arrayList;
            this.f5739b = writableMap;
            this.f5740c = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            WritableMap writableMap;
            String str;
            int[] iArr = (int[]) objArr[0];
            e eVar = (e) objArr[1];
            for (int i = 0; i < this.f5738a.size(); i++) {
                String str2 = (String) this.f5738a.get(i);
                if (iArr.length > 0 && iArr[i] == 0) {
                    writableMap = this.f5739b;
                    str = "granted";
                } else if (eVar.shouldShowRequestPermissionRationale(str2)) {
                    writableMap = this.f5739b;
                    str = "denied";
                } else {
                    writableMap = this.f5739b;
                    str = "never_ask_again";
                }
                writableMap.putString(str2, str);
            }
            this.f5740c.resolve(this.f5739b);
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRequestCode = 0;
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (!(currentActivity instanceof e)) {
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
            return (e) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
    }

    @ReactMethod
    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23 ? baseContext.checkSelfPermission(str) != 0 : baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            z = false;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.modules.core.f
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }

    @ReactMethod
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            String str = "granted";
            if (Build.VERSION.SDK_INT < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    str = "denied";
                }
            } else if (baseContext.checkSelfPermission(string) != 0) {
                arrayList.add(string);
            }
            writableNativeMap.putString(string, str);
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new b(this, arrayList, writableNativeMap, promise));
            permissionAwareActivity.a((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }

    @ReactMethod
    public void requestPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        String str2 = "granted";
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                str2 = "denied";
            }
            promise.resolve(str2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve(str2);
        } else {
            try {
                e permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new a(this, promise, str));
                permissionAwareActivity.a(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e2) {
                promise.reject(ERROR_INVALID_ACTIVITY, e2);
            }
        }
    }

    @ReactMethod
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(false);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }
}
