package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.i.a;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzr implements zzbp {
    private final Context mContext;
    private final Looper zzcn;
    private final zzav zzfq;
    private final zzbd zzfr;
    private final zzbd zzfs;
    private final Map<Api.AnyClientKey<?>, zzbd> zzft;
    private final Api.Client zzfv;
    private Bundle zzfw;
    private final Lock zzga;
    private final Set<SignInConnectionListener> zzfu = Collections.newSetFromMap(new WeakHashMap());
    private ConnectionResult zzfx = null;
    private ConnectionResult zzfy = null;
    private boolean zzfz = false;
    private int zzgb = 0;

    private zzr(Context context, zzav zzavVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zzp> arrayList, ArrayList<zzp> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.mContext = context;
        this.zzfq = zzavVar;
        this.zzga = lock;
        this.zzcn = looper;
        this.zzfv = client;
        this.zzfr = new zzbd(context, this.zzfq, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new zzt(this, null));
        this.zzfs = new zzbd(context, this.zzfq, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new zzu(this, null));
        a aVar = new a();
        for (Api.AnyClientKey<?> anyClientKey : map2.keySet()) {
            aVar.put(anyClientKey, this.zzfr);
        }
        for (Api.AnyClientKey<?> anyClientKey2 : map.keySet()) {
            aVar.put(anyClientKey2, this.zzfs);
        }
        this.zzft = Collections.unmodifiableMap(aVar);
    }

    public static zzr zza(Context context, zzav zzavVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> abstractClientBuilder, ArrayList<zzp> arrayList) {
        a aVar = new a();
        a aVar2 = new a();
        Api.Client client = null;
        for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
            Api.Client value = entry.getValue();
            if (value.providesSignIn()) {
                client = value;
            }
            if (value.requiresSignIn()) {
                aVar.put(entry.getKey(), value);
            } else {
                aVar2.put(entry.getKey(), value);
            }
        }
        Preconditions.checkState(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        a aVar3 = new a();
        a aVar4 = new a();
        for (Api<?> api : map2.keySet()) {
            Api.AnyClientKey<?> clientKey = api.getClientKey();
            if (aVar.containsKey(clientKey)) {
                aVar3.put(api, map2.get(api));
            } else if (!aVar2.containsKey(clientKey)) {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            } else {
                aVar4.put(api, map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList<zzp> arrayList4 = arrayList;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            zzp zzpVar = arrayList4.get(i);
            i++;
            zzp zzpVar2 = zzpVar;
            if (aVar3.containsKey(zzpVar2.mApi)) {
                arrayList2.add(zzpVar2);
            } else if (!aVar4.containsKey(zzpVar2.mApi)) {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            } else {
                arrayList3.add(zzpVar2);
            }
        }
        return new zzr(context, zzavVar, lock, looper, googleApiAvailabilityLight, aVar, aVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, aVar3, aVar4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, boolean z) {
        this.zzfq.zzb(i, z);
        this.zzfy = null;
        this.zzfx = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Bundle bundle) {
        if (this.zzfw == null) {
            this.zzfw = bundle;
        } else if (bundle == null) {
        } else {
            this.zzfw.putAll(bundle);
        }
    }

    private final void zza(ConnectionResult connectionResult) {
        switch (this.zzgb) {
            case 2:
                this.zzfq.zzc(connectionResult);
            case 1:
                zzab();
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        this.zzgb = 0;
    }

    private final boolean zza(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> clientKey = apiMethodImpl.getClientKey();
        Preconditions.checkArgument(this.zzft.containsKey(clientKey), "GoogleApiClient is not configured to use the API required for this call.");
        return this.zzft.get(clientKey).equals(this.zzfs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa() {
        if (!zzb(this.zzfx)) {
            if (this.zzfx != null && zzb(this.zzfy)) {
                this.zzfs.disconnect();
                zza(this.zzfx);
            } else if (this.zzfx == null || this.zzfy == null) {
            } else {
                ConnectionResult connectionResult = this.zzfx;
                if (this.zzfs.zzje < this.zzfr.zzje) {
                    connectionResult = this.zzfy;
                }
                zza(connectionResult);
            }
        } else if (zzb(this.zzfy) || zzac()) {
            switch (this.zzgb) {
                case 2:
                    this.zzfq.zzb(this.zzfw);
                case 1:
                    zzab();
                    break;
                default:
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    break;
            }
            this.zzgb = 0;
        } else if (this.zzfy == null) {
        } else {
            if (this.zzgb == 1) {
                zzab();
                return;
            }
            zza(this.zzfy);
            this.zzfr.disconnect();
        }
    }

    private final void zzab() {
        for (SignInConnectionListener signInConnectionListener : this.zzfu) {
            signInConnectionListener.onComplete();
        }
        this.zzfu.clear();
    }

    private final boolean zzac() {
        return this.zzfy != null && this.zzfy.getErrorCode() == 4;
    }

    private final PendingIntent zzad() {
        if (this.zzfv == null) {
            return null;
        }
        return PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zzfq), this.zzfv.getSignInIntent(), 134217728);
    }

    private static boolean zzb(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final void connect() {
        this.zzgb = 2;
        this.zzfz = false;
        this.zzfy = null;
        this.zzfx = null;
        this.zzfr.connect();
        this.zzfs.connect();
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final void disconnect() {
        this.zzfy = null;
        this.zzfx = null;
        this.zzgb = 0;
        this.zzfr.disconnect();
        this.zzfs.disconnect();
        zzab();
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.zzfs.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.zzfr.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        if (zza((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            if (!zzac()) {
                return (T) this.zzfs.enqueue(t);
            }
            t.setFailedResult(new Status(4, null, zzad()));
            return t;
        }
        return (T) this.zzfr.enqueue(t);
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        if (zza((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            if (!zzac()) {
                return (T) this.zzfs.execute(t);
            }
            t.setFailedResult(new Status(4, null, zzad()));
            return t;
        }
        return (T) this.zzfr.execute(t);
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final ConnectionResult getConnectionResult(Api<?> api) {
        return this.zzft.get(api.getClientKey()).equals(this.zzfs) ? zzac() ? new ConnectionResult(4, zzad()) : this.zzfs.getConnectionResult(api) : this.zzfr.getConnectionResult(api);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r2.zzgb == 1) goto L12;
     */
    @Override // com.google.android.gms.common.api.internal.zzbp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isConnected() {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.zzga
            r0.lock()
            com.google.android.gms.common.api.internal.zzbd r0 = r2.zzfr     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L28
            r1 = 1
            if (r0 == 0) goto L21
            com.google.android.gms.common.api.internal.zzbd r0 = r2.zzfs     // Catch: java.lang.Throwable -> L28
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            boolean r0 = r2.zzac()     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L22
            int r0 = r2.zzgb     // Catch: java.lang.Throwable -> L28
            if (r0 != r1) goto L21
            goto L22
        L21:
            r1 = 0
        L22:
            java.util.concurrent.locks.Lock r0 = r2.zzga
            r0.unlock()
            return r1
        L28:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r2.zzga
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzr.isConnected():boolean");
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final boolean isConnecting() {
        this.zzga.lock();
        try {
            return this.zzgb == 2;
        } finally {
            this.zzga.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        this.zzga.lock();
        try {
            if ((!isConnecting() && !isConnected()) || this.zzfs.isConnected()) {
                this.zzga.unlock();
                return false;
            }
            this.zzfu.add(signInConnectionListener);
            if (this.zzgb == 0) {
                this.zzgb = 1;
            }
            this.zzfy = null;
            this.zzfs.connect();
            return true;
        } finally {
            this.zzga.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final void maybeSignOut() {
        this.zzga.lock();
        try {
            boolean isConnecting = isConnecting();
            this.zzfs.disconnect();
            this.zzfy = new ConnectionResult(4);
            if (isConnecting) {
                new Handler(this.zzcn).post(new zzs(this));
            } else {
                zzab();
            }
        } finally {
            this.zzga.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zzbp
    public final void zzz() {
        this.zzfr.zzz();
        this.zzfs.zzz();
    }
}
