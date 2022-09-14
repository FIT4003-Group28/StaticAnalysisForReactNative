package com.idehub.GoogleAnalyticsBridge;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.an;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.TagManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class GoogleTagManagerBridge extends ReactContextBaseJavaModule {
    private final String E_CONTAINER_ALREADY_OPEN;
    private final String E_CONTAINER_NOT_OPENED;
    private final String E_ONGOING_OPEN_OPERATION;
    private final String E_OPEN_CONTAINER_FAILED;
    private final String E_PUSH_EVENT_FAILED;
    private ContainerHolder mContainerHolder;
    private DataLayer mDatalayer;
    private Boolean openOperationInProgress;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "GoogleTagManagerBridge";
    }

    public GoogleTagManagerBridge(ah ahVar) {
        super(ahVar);
        this.E_CONTAINER_ALREADY_OPEN = "E_CONTAINER_ALREADY_OPEN";
        this.E_ONGOING_OPEN_OPERATION = "E_ONGOING_OPEN_OPERATION";
        this.E_CONTAINER_NOT_OPENED = "E_CONTAINER_NOT_OPENED";
        this.E_OPEN_CONTAINER_FAILED = "E_OPEN_CONTAINER_FAILED";
        this.E_PUSH_EVENT_FAILED = "E_PUSH_EVENT_FAILED";
        this.openOperationInProgress = false;
    }

    @al
    public void openContainerWithId(final String str, final af afVar) {
        if (this.mContainerHolder != null) {
            afVar.a("E_CONTAINER_ALREADY_OPEN", new Throwable("The container is already open."));
        } else if (this.openOperationInProgress.booleanValue()) {
            afVar.a("E_ONGOING_OPEN_OPERATION", new Throwable("Container open-operation already in progress."));
        } else {
            TagManager tagManager = TagManager.getInstance(getReactApplicationContext());
            this.openOperationInProgress = true;
            tagManager.loadContainerPreferFresh(str, -1).setResultCallback(new ResultCallback<ContainerHolder>() { // from class: com.idehub.GoogleAnalyticsBridge.GoogleTagManagerBridge.1
                @Override // com.google.android.gms.common.api.ResultCallback
                /* renamed from: a */
                public void onResult(ContainerHolder containerHolder) {
                    if (containerHolder != null && containerHolder.getStatus().isSuccess()) {
                        GoogleTagManagerBridge.this.mContainerHolder = containerHolder;
                        afVar.a((Object) true);
                    } else {
                        afVar.a("E_OPEN_CONTAINER_FAILED", new Throwable(String.format("Failed to open container. Does container with id %s exist?", str)));
                    }
                    GoogleTagManagerBridge.this.openOperationInProgress = false;
                }
            }, 2000L, TimeUnit.MILLISECONDS);
        }
    }

    @al
    public void booleanForKey(String str, af afVar) {
        if (this.mContainerHolder != null && this.mContainerHolder.getContainer() != null) {
            afVar.a(Boolean.valueOf(this.mContainerHolder.getContainer().getBoolean(str)));
        } else {
            afVar.a("E_CONTAINER_NOT_OPENED", new Throwable("The container has not been opened. You must call openContainerWithId(..)"));
        }
    }

    @al
    public void stringForKey(String str, af afVar) {
        if (this.mContainerHolder != null && this.mContainerHolder.getContainer() != null) {
            afVar.a((Object) this.mContainerHolder.getContainer().getString(str));
        } else {
            afVar.a("E_CONTAINER_NOT_OPENED", new Throwable("The container has not been opened. You must call openContainerWithId(..)"));
        }
    }

    @al
    public void doubleForKey(String str, af afVar) {
        if (this.mContainerHolder != null && this.mContainerHolder.getContainer() != null) {
            afVar.a(Double.valueOf(this.mContainerHolder.getContainer().getDouble(str)));
        } else {
            afVar.a("E_CONTAINER_NOT_OPENED", new Throwable("The container has not been opened. You must call openContainerWithId(..)"));
        }
    }

    @al
    public void pushDataLayerEvent(an anVar, af afVar) {
        if (this.mContainerHolder != null && isValidMapToPushEvent(anVar)) {
            getDataLayer().push(getMap(anVar));
            afVar.a((Object) true);
        } else if (this.mContainerHolder == null) {
            afVar.a("E_CONTAINER_NOT_OPENED", new Throwable("The container has not been opened. You must call openContainerWithId(..)"));
        } else {
            afVar.a("E_PUSH_EVENT_FAILED", new Throwable("Validation error, data must have a key \"event\" with valid event name"));
        }
    }

    private boolean isValidMapToPushEvent(an anVar) {
        return (anVar == null || anVar.getString(DataLayer.EVENT_KEY) == null || anVar.getString(DataLayer.EVENT_KEY).length() <= 0) ? false : true;
    }

    private Map<String, Object> getMap(an anVar) {
        HashMap hashMap = new HashMap();
        ReadableMapKeySetIterator a2 = anVar.a();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            hashMap.put(nextKey, anVar.getString(nextKey));
        }
        return hashMap;
    }

    private DataLayer getDataLayer() {
        if (this.mDatalayer == null) {
            this.mDatalayer = TagManager.getInstance(getReactApplicationContext()).getDataLayer();
        }
        return this.mDatalayer;
    }
}
