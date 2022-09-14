package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.modules.core.c;
import com.facebook.react.modules.core.d;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class PermissionsModule extends ReactContextBaseJavaModule implements d {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<com.facebook.react.bridge.d> mCallbacks;
    private int mRequestCode;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PermissionsAndroid";
    }

    public PermissionsModule(ah ahVar) {
        super(ahVar);
        this.mRequestCode = 0;
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    @al
    public void checkPermission(String str, af afVar) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                z = true;
            }
            afVar.a(Boolean.valueOf(z));
            return;
        }
        if (baseContext.checkSelfPermission(str) == 0) {
            z = true;
        }
        afVar.a(Boolean.valueOf(z));
    }

    @al
    public void shouldShowRequestPermissionRationale(String str, af afVar) {
        if (Build.VERSION.SDK_INT < 23) {
            afVar.a((Object) false);
            return;
        }
        try {
            afVar.a(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            afVar.a(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @al
    public void requestPermission(final String str, final af afVar) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
                z = true;
            }
            afVar.a(Boolean.valueOf(z));
        } else if (baseContext.checkSelfPermission(str) == 0) {
            afVar.a("granted");
        } else {
            try {
                c permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new com.facebook.react.bridge.d() { // from class: com.facebook.react.modules.permissions.PermissionsModule.1
                    @Override // com.facebook.react.bridge.d
                    public void a(Object... objArr) {
                        int[] iArr = (int[]) objArr[0];
                        if (iArr.length > 0 && iArr[0] == 0) {
                            afVar.a((Object) "granted");
                        } else if (((c) objArr[1]).shouldShowRequestPermissionRationale(str)) {
                            afVar.a((Object) "denied");
                        } else {
                            afVar.a((Object) "never_ask_again");
                        }
                    }
                });
                permissionAwareActivity.a(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e) {
                afVar.a(ERROR_INVALID_ACTIVITY, e);
            }
        }
    }

    @al
    public void requestMultiplePermissions(am amVar, final af afVar) {
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < amVar.size(); i2++) {
            String string = amVar.getString(i2);
            if (Build.VERSION.SDK_INT < 23) {
                writableNativeMap.putString(string, baseContext.checkPermission(string, Process.myPid(), Process.myUid()) == 0 ? "granted" : "denied");
                i++;
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
                i++;
            } else {
                arrayList.add(string);
            }
        }
        if (amVar.size() == i) {
            afVar.a(writableNativeMap);
            return;
        }
        try {
            c permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new com.facebook.react.bridge.d() { // from class: com.facebook.react.modules.permissions.PermissionsModule.2
                @Override // com.facebook.react.bridge.d
                public void a(Object... objArr) {
                    int[] iArr = (int[]) objArr[0];
                    c cVar = (c) objArr[1];
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        String str = (String) arrayList.get(i3);
                        if (iArr.length > 0 && iArr[i3] == 0) {
                            writableNativeMap.putString(str, "granted");
                        } else if (cVar.shouldShowRequestPermissionRationale(str)) {
                            writableNativeMap.putString(str, "denied");
                        } else {
                            writableNativeMap.putString(str, "never_ask_again");
                        }
                    }
                    afVar.a(writableNativeMap);
                }
            });
            permissionAwareActivity.a((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            afVar.a(ERROR_INVALID_ACTIVITY, e);
        }
    }

    @Override // com.facebook.react.modules.core.d
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).a(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        return this.mCallbacks.size() == 0;
    }

    private c getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (!(currentActivity instanceof c)) {
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        return (c) currentActivity;
    }
}
