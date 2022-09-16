package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class JSCSamplingProfiler extends ReactContextBaseJavaModule {
    private static final HashSet<JSCSamplingProfiler> sRegisteredDumpers = new HashSet<>();
    private String mOperationError;
    private boolean mOperationInProgress;
    private int mOperationToken;
    private SamplingProfiler mSamplingProfiler;
    private String mSamplingProfilerResult;

    /* loaded from: classes.dex */
    public interface SamplingProfiler extends JavaScriptModule {
        void poke(int i);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JSCSamplingProfiler";
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    private static synchronized void registerSamplingProfiler(JSCSamplingProfiler jSCSamplingProfiler) {
        synchronized (JSCSamplingProfiler.class) {
            if (sRegisteredDumpers.contains(jSCSamplingProfiler)) {
                throw new RuntimeException("a JSCSamplingProfiler registered more than once");
            }
            sRegisteredDumpers.add(jSCSamplingProfiler);
        }
    }

    private static synchronized void unregisterSamplingProfiler(JSCSamplingProfiler jSCSamplingProfiler) {
        synchronized (JSCSamplingProfiler.class) {
            sRegisteredDumpers.remove(jSCSamplingProfiler);
        }
    }

    public static synchronized List<String> poke(long j) {
        LinkedList linkedList;
        synchronized (JSCSamplingProfiler.class) {
            linkedList = new LinkedList();
            if (sRegisteredDumpers.isEmpty()) {
                throw new a("No JSC registered");
            }
            Iterator<JSCSamplingProfiler> it = sRegisteredDumpers.iterator();
            while (it.hasNext()) {
                JSCSamplingProfiler next = it.next();
                next.pokeHelper(j);
                linkedList.add(next.mSamplingProfilerResult);
            }
        }
        return linkedList;
    }

    public JSCSamplingProfiler(ah ahVar) {
        super(ahVar);
        this.mSamplingProfiler = null;
        this.mOperationInProgress = false;
        this.mOperationToken = 0;
        this.mOperationError = null;
        this.mSamplingProfilerResult = null;
    }

    private synchronized void pokeHelper(long j) {
        if (this.mSamplingProfiler == null) {
            throw new a("SamplingProfiler.js module not connected");
        }
        this.mSamplingProfiler.poke(getOperationToken());
        waitForOperation(j);
    }

    private int getOperationToken() {
        if (this.mOperationInProgress) {
            throw new a("Another operation already in progress.");
        }
        this.mOperationInProgress = true;
        int i = this.mOperationToken + 1;
        this.mOperationToken = i;
        return i;
    }

    private void waitForOperation(long j) {
        try {
            wait(j);
            if (this.mOperationInProgress) {
                this.mOperationInProgress = false;
                throw new a("heap capture timed out.");
            } else if (this.mOperationError == null) {
            } else {
                throw new a(this.mOperationError);
            }
        } catch (InterruptedException e) {
            throw new a("Waiting for heap capture failed: " + e.getMessage());
        }
    }

    @al
    public synchronized void operationComplete(int i, String str, String str2) {
        if (i == this.mOperationToken) {
            this.mOperationInProgress = false;
            this.mSamplingProfilerResult = str;
            this.mOperationError = str2;
            notify();
        } else {
            throw new RuntimeException("Completed operation is not in progress.");
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        this.mSamplingProfiler = (SamplingProfiler) getReactApplicationContext().a(SamplingProfiler.class);
        registerSamplingProfiler(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        unregisterSamplingProfiler(this);
        this.mSamplingProfiler = null;
    }
}
