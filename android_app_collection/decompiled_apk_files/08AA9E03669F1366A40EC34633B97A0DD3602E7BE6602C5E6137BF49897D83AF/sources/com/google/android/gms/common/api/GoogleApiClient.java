package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.j;
import android.support.v4.i.a;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zzav;
import com.google.android.gms.common.api.internal.zzch;
import com.google.android.gms.common.api.internal.zzi;
import com.google.android.gms.common.api.internal.zzp;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignIn;
import com.google.android.gms.signin.SignInClient;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
@KeepForSdk
/* loaded from: classes.dex */
public abstract class GoogleApiClient {
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set<GoogleApiClient> zzcu = Collections.newSetFromMap(new WeakHashMap());

    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class Builder {
        private final Context mContext;
        private Looper zzcn;
        private final Set<Scope> zzcv;
        private final Set<Scope> zzcw;
        private int zzcx;
        private View zzcy;
        private String zzcz;
        private String zzda;
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> zzdb;
        private final Map<Api<?>, Api.ApiOptions> zzdc;
        private LifecycleActivity zzdd;
        private int zzde;
        private OnConnectionFailedListener zzdf;
        private GoogleApiAvailability zzdg;
        private Api.AbstractClientBuilder<? extends SignInClient, SignInOptions> zzdh;
        private final ArrayList<ConnectionCallbacks> zzdi;
        private final ArrayList<OnConnectionFailedListener> zzdj;
        private boolean zzdk;
        private Account zzs;

        @KeepForSdk
        public Builder(Context context) {
            this.zzcv = new HashSet();
            this.zzcw = new HashSet();
            this.zzdb = new a();
            this.zzdc = new a();
            this.zzde = -1;
            this.zzdg = GoogleApiAvailability.getInstance();
            this.zzdh = SignIn.CLIENT_BUILDER;
            this.zzdi = new ArrayList<>();
            this.zzdj = new ArrayList<>();
            this.zzdk = false;
            this.mContext = context;
            this.zzcn = context.getMainLooper();
            this.zzcz = context.getPackageName();
            this.zzda = context.getClass().getName();
        }

        @KeepForSdk
        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zzdi.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zzdj.add(onConnectionFailedListener);
        }

        private final <O extends Api.ApiOptions> void zza(Api<O> api, O o, Scope... scopeArr) {
            HashSet hashSet = new HashSet(api.zzj().getImpliedScopes(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.zzdb.put(api, new ClientSettings.OptionalApiSettings(hashSet));
        }

        public final Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zzdc.put(api, null);
            List<Scope> impliedScopes = api.zzj().getImpliedScopes(null);
            this.zzcw.addAll(impliedScopes);
            this.zzcv.addAll(impliedScopes);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zzdc.put(api, o);
            List<Scope> impliedScopes = api.zzj().getImpliedScopes(o);
            this.zzcw.addAll(impliedScopes);
            this.zzcv.addAll(impliedScopes);
            return this;
        }

        public final <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(Api<O> api, O o, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zzdc.put(api, o);
            zza(api, o, scopeArr);
            return this;
        }

        public final Builder addApiIfAvailable(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zzdc.put(api, null);
            zza(api, null, scopeArr);
            return this;
        }

        public final Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zzdi.add(connectionCallbacks);
            return this;
        }

        public final Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zzdj.add(onConnectionFailedListener);
            return this;
        }

        public final Builder addScope(Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zzcv.add(scope);
            return this;
        }

        @KeepForSdk
        public final Builder addScopeNames(String[] strArr) {
            for (String str : strArr) {
                this.zzcv.add(new Scope(str));
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.common.api.Api$Client, java.lang.Object] */
        public final GoogleApiClient build() {
            boolean z;
            Preconditions.checkArgument(!this.zzdc.isEmpty(), "must call addApi() to add at least one API");
            ClientSettings buildClientSettings = buildClientSettings();
            Api<?> api = null;
            Map<Api<?>, ClientSettings.OptionalApiSettings> optionalApiSettings = buildClientSettings.getOptionalApiSettings();
            a aVar = new a();
            a aVar2 = new a();
            ArrayList arrayList = new ArrayList();
            Iterator<Api<?>> it = this.zzdc.keySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                Api<?> next = it.next();
                Api.ApiOptions apiOptions = this.zzdc.get(next);
                boolean z3 = optionalApiSettings.get(next) != null;
                aVar.put(next, Boolean.valueOf(z3));
                zzp zzpVar = new zzp(next, z3);
                arrayList.add(zzpVar);
                Api.AbstractClientBuilder<?, ?> zzk = next.zzk();
                Map<Api<?>, ClientSettings.OptionalApiSettings> map = optionalApiSettings;
                Iterator<Api<?>> it2 = it;
                ?? buildClient = zzk.buildClient(this.mContext, this.zzcn, buildClientSettings, apiOptions, zzpVar, zzpVar);
                aVar2.put(next.getClientKey(), buildClient);
                if (zzk.getPriority() == 1) {
                    z2 = apiOptions != null;
                }
                if (buildClient.providesSignIn()) {
                    if (api != null) {
                        String name = next.getName();
                        String name2 = api.getName();
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21 + String.valueOf(name2).length());
                        sb.append(name);
                        sb.append(" cannot be used with ");
                        sb.append(name2);
                        throw new IllegalStateException(sb.toString());
                    }
                    api = next;
                }
                optionalApiSettings = map;
                it = it2;
            }
            if (api == null) {
                z = true;
            } else if (z2) {
                String name3 = api.getName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(name3).length() + 82);
                sb2.append("With using ");
                sb2.append(name3);
                sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                throw new IllegalStateException(sb2.toString());
            } else {
                z = true;
                Preconditions.checkState(this.zzs == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                Preconditions.checkState(this.zzcv.equals(this.zzcw), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
            }
            zzav zzavVar = new zzav(this.mContext, new ReentrantLock(), this.zzcn, buildClientSettings, this.zzdg, this.zzdh, aVar, this.zzdi, this.zzdj, aVar2, this.zzde, zzav.zza(aVar2.values(), z), arrayList, false);
            synchronized (GoogleApiClient.zzcu) {
                GoogleApiClient.zzcu.add(zzavVar);
            }
            if (this.zzde >= 0) {
                zzi.zza(this.zzdd).zza(this.zzde, zzavVar, this.zzdf);
            }
            return zzavVar;
        }

        @VisibleForTesting
        @KeepForSdk
        public final ClientSettings buildClientSettings() {
            SignInOptions signInOptions = SignInOptions.DEFAULT;
            if (this.zzdc.containsKey(SignIn.API)) {
                signInOptions = (SignInOptions) this.zzdc.get(SignIn.API);
            }
            return new ClientSettings(this.zzs, this.zzcv, this.zzdb, this.zzcx, this.zzcy, this.zzcz, this.zzda, signInOptions);
        }

        public final Builder enableAutoManage(j jVar, int i, OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity(jVar);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zzde = i;
            this.zzdf = onConnectionFailedListener;
            this.zzdd = lifecycleActivity;
            return this;
        }

        public final Builder enableAutoManage(j jVar, OnConnectionFailedListener onConnectionFailedListener) {
            return enableAutoManage(jVar, 0, onConnectionFailedListener);
        }

        public final Builder setAccountName(String str) {
            this.zzs = str == null ? null : new Account(str, AccountType.GOOGLE);
            return this;
        }

        public final Builder setGravityForPopups(int i) {
            this.zzcx = i;
            return this;
        }

        public final Builder setHandler(Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zzcn = handler.getLooper();
            return this;
        }

        public final Builder setViewForPopups(View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zzcy = view;
            return this;
        }

        public final Builder useDefaultAccount() {
            return setAccountName("<<default account>>");
        }
    }

    /* loaded from: classes.dex */
    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* loaded from: classes.dex */
    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (zzcu) {
            int i = 0;
            String concat = String.valueOf(str).concat("  ");
            for (GoogleApiClient googleApiClient : zzcu) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set;
        synchronized (zzcu) {
            set = zzcu;
        }
        return set;
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, TimeUnit timeUnit);

    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(j jVar);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public void zza(zzch zzchVar) {
        throw new UnsupportedOperationException();
    }

    public void zzb(zzch zzchVar) {
        throw new UnsupportedOperationException();
    }
}
