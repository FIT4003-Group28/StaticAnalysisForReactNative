package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.ConnectionResult;
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
/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class GoogleApiClient {
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String RESOLUTION_FAILURE_ERROR_DETAIL = "<<ResolutionFailureErrorDetail>>";
    public static final int SIGN_IN_MODE_NONE = 3;
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    private static final Set<GoogleApiClient> sAllClients = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes.dex */
    public final class Builder {
        private static final int DEFAULT_CLIENT_ID = 0;
        private Account mAccount;
        private cnmq mApiAvailability;
        private final Map<Api<?>, cnnx> mApis;
        private int mAutoManageId;
        private final ArrayList<ConnectionCallbacks> mConnectedCallbacks;
        private OnConnectionFailedListener mConnectionFailedWithoutFixListener;
        private final Context mContext;
        private int mGravityForPopups;
        private final Set<Scope> mImpliedScopes;
        private boolean mIsSignInClientDisconnectFixEnabled;
        private cnrw mLifecycleActivity;
        private Looper mLooper;
        private final ArrayList<OnConnectionFailedListener> mOnConnectionFailedListeners;
        private final Map<Api<?>, cnul> mOptionalApis;
        private String mRealClientClassName;
        private String mRealClientPackageName;
        private final Set<Scope> mRequiredScopes;
        private cnnp<? extends coza, cozb> mSignInApiBuilder;
        private View mViewForPopups;

        public Builder(Context context) {
            this.mRequiredScopes = new HashSet();
            this.mImpliedScopes = new HashSet();
            this.mOptionalApis = new aif();
            this.mIsSignInClientDisconnectFixEnabled = false;
            this.mApis = new aif();
            this.mAutoManageId = -1;
            this.mApiAvailability = cnmq.a;
            this.mSignInApiBuilder = coyz.c;
            this.mConnectedCallbacks = new ArrayList<>();
            this.mOnConnectionFailedListeners = new ArrayList<>();
            this.mContext = context;
            this.mLooper = context.getMainLooper();
            this.mRealClientPackageName = context.getPackageName();
            this.mRealClientClassName = context.getClass().getName();
        }

        private <O extends cnnx> void addApiIfAvailableInternal(Api<O> api, O o, Scope... scopeArr) {
            cnny<?, O> baseClientBuilder = api.getBaseClientBuilder();
            cnwc.n(baseClientBuilder, "Base client builder must not be null");
            HashSet hashSet = new HashSet(baseClientBuilder.c(o));
            for (Scope scope : scopeArr) {
                hashSet.add(scope);
            }
            this.mOptionalApis.put(api, new cnul(hashSet));
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <C extends cnnz, O> C buildClient(cnnp<C, O> cnnpVar, Object obj, Context context, Looper looper, cnum cnumVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return cnnpVar.b(context, looper, cnumVar, obj, connectionCallbacks, onConnectionFailedListener);
        }

        private GoogleApiClient buildInternal() {
            cnum buildClientSettings = buildClientSettings();
            Map<Api<?>, cnul> map = buildClientSettings.d;
            aif aifVar = new aif();
            aif aifVar2 = new aif();
            ArrayList arrayList = new ArrayList();
            Iterator<Api<?>> it = this.mApis.keySet().iterator();
            Api<?> api = null;
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    Api<?> next = it.next();
                    cnnx cnnxVar = this.mApis.get(next);
                    if (map.get(next) != null) {
                        z = true;
                    }
                    aifVar.put(next, Boolean.valueOf(z));
                    cnpp cnppVar = new cnpp(next, z);
                    arrayList.add(cnppVar);
                    cnnp<?, ?> clientBuilder = next.getClientBuilder();
                    cnwc.a(clientBuilder);
                    cnnz buildClient = buildClient(clientBuilder, cnnxVar, this.mContext, this.mLooper, buildClientSettings, cnppVar, cnppVar);
                    aifVar2.put(next.getClientKey(), buildClient);
                    if (buildClient.k()) {
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
                } else {
                    if (api != null) {
                        cnwc.d(this.mAccount == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.getName());
                        cnwc.d(this.mRequiredScopes.equals(this.mImpliedScopes), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.getName());
                    }
                    return new cnqx(this.mContext, new ReentrantLock(), this.mLooper, buildClientSettings, this.mApiAvailability, this.mSignInApiBuilder, aifVar, this.mConnectedCallbacks, this.mOnConnectionFailedListeners, aifVar2, this.mAutoManageId, cnqx.h(aifVar2.values(), true), arrayList);
                }
            }
        }

        private Builder enableAutoManageInternal(cnrw cnrwVar, int i, OnConnectionFailedListener onConnectionFailedListener) {
            cnwc.e(i >= 0, "clientId must be non-negative");
            this.mAutoManageId = i;
            this.mConnectionFailedWithoutFixListener = onConnectionFailedListener;
            this.mLifecycleActivity = cnrwVar;
            return this;
        }

        private void startAutoManage(GoogleApiClient googleApiClient) {
            cnpc a = cnpc.a(this.mLifecycleActivity);
            int i = this.mAutoManageId;
            OnConnectionFailedListener onConnectionFailedListener = this.mConnectionFailedWithoutFixListener;
            cnwc.n(googleApiClient, "GoogleApiClient instance cannot be null");
            boolean z = a.a.indexOfKey(i) < 0;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Already managing a GoogleApiClient with id ");
            sb.append(i);
            cnwc.c(z, sb.toString());
            cnpi cnpiVar = a.c.get();
            boolean z2 = a.b;
            String valueOf = String.valueOf(cnpiVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb2.append("starting AutoManage for client ");
            sb2.append(i);
            sb2.append(" ");
            sb2.append(z2);
            sb2.append(" ");
            sb2.append(valueOf);
            sb2.toString();
            cnpb cnpbVar = new cnpb(a, i, googleApiClient, onConnectionFailedListener);
            googleApiClient.registerConnectionFailedListener(cnpbVar);
            a.a.put(i, cnpbVar);
            if (!a.b || cnpiVar != null) {
                return;
            }
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            sb3.toString();
            googleApiClient.connect();
        }

        public Builder addApi(Api<? extends cnnw> api) {
            cnwc.n(api, "Api must not be null");
            this.mApis.put(api, null);
            cnny<?, ? extends cnnw> baseClientBuilder = api.getBaseClientBuilder();
            cnwc.n(baseClientBuilder, "Base client builder must not be null");
            List<Scope> c = baseClientBuilder.c(null);
            this.mImpliedScopes.addAll(c);
            this.mRequiredScopes.addAll(c);
            return this;
        }

        public <O extends cnnu> Builder addApiIfAvailable(Api<O> api, O o, Scope... scopeArr) {
            cnwc.n(api, "Api must not be null");
            cnwc.n(o, "Null options are not permitted for this Api");
            this.mApis.put(api, o);
            addApiIfAvailableInternal(api, o, scopeArr);
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            cnwc.n(connectionCallbacks, "Listener must not be null");
            this.mConnectedCallbacks.add(connectionCallbacks);
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            cnwc.n(onConnectionFailedListener, "Listener must not be null");
            this.mOnConnectionFailedListeners.add(onConnectionFailedListener);
            return this;
        }

        public Builder addScope(Scope scope) {
            cnwc.n(scope, "Scope must not be null");
            this.mRequiredScopes.add(scope);
            return this;
        }

        public Builder addScopeNames(String[] strArr) {
            for (String str : strArr) {
                this.mRequiredScopes.add(new Scope(str));
            }
            return this;
        }

        public GoogleApiClient build() {
            cnwc.e(!this.mApis.isEmpty(), "must call addApi() to add at least one API");
            GoogleApiClient buildInternal = buildInternal();
            synchronized (GoogleApiClient.sAllClients) {
                GoogleApiClient.sAllClients.add(buildInternal);
            }
            if (this.mAutoManageId >= 0) {
                startAutoManage(buildInternal);
            }
            return buildInternal;
        }

        public cnum buildClientSettings() {
            cozb cozbVar = cozb.a;
            if (this.mApis.containsKey(coyz.e)) {
                cozbVar = (cozb) this.mApis.get(coyz.e);
            }
            return new cnum(this.mAccount, this.mRequiredScopes, this.mOptionalApis, this.mRealClientPackageName, this.mRealClientClassName, cozbVar, this.mIsSignInClientDisconnectFixEnabled);
        }

        public Builder enableAutoManage(ff ffVar, int i, OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManageInternal(new cnrw(ffVar), i, onConnectionFailedListener);
            return this;
        }

        public Builder enableSignInClientDisconnectFix() {
            this.mIsSignInClientDisconnectFixEnabled = true;
            return this;
        }

        public Map<Api<?>, cnnx> getApiMapForTest() {
            return this.mApis;
        }

        public Map<Api<?>, cnul> getOptionalApiMapForTest() {
            return this.mOptionalApis;
        }

        public Builder setAccount(Account account) {
            this.mAccount = account;
            return this;
        }

        public Builder setAccountName(String str) {
            this.mAccount = str == null ? null : new Account(str, "com.google");
            return this;
        }

        public Builder setApiAvailabilityForTesting(cnmq cnmqVar) {
            this.mApiAvailability = cnmqVar;
            return this;
        }

        public Builder setGravityForPopups(int i) {
            this.mGravityForPopups = i;
            return this;
        }

        public Builder setHandler(Handler handler) {
            cnwc.n(handler, "Handler must not be null");
            this.mLooper = handler.getLooper();
            return this;
        }

        public Builder setRealClientName(String str) {
            this.mRealClientClassName = str;
            return this;
        }

        public Builder setRealClientPackageName(String str) {
            this.mRealClientPackageName = str;
            return this;
        }

        public Builder setSignInApiBuilderForTest(cnnp<? extends coza, cozb> cnnpVar) {
            this.mSignInApiBuilder = cnnpVar;
            return this;
        }

        public Builder setViewForPopups(View view) {
            cnwc.n(view, "View must not be null");
            this.mViewForPopups = view;
            return this;
        }

        public Builder useDefaultAccount() {
            setAccountName(GoogleApiClient.DEFAULT_ACCOUNT);
            return this;
        }

        public Builder enableAutoManage(ff ffVar, OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(ffVar, 0, onConnectionFailedListener);
            return this;
        }

        public Builder enableAutoManage(Activity activity, int i, OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManageInternal(new cnrw(activity), i, onConnectionFailedListener);
            return this;
        }

        public Builder enableAutoManage(Activity activity, OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(activity, 0, onConnectionFailedListener);
            return this;
        }

        public <T extends cnnw> Builder addApiIfAvailable(Api<? extends cnnw> api, Scope... scopeArr) {
            cnwc.n(api, "Api must not be null");
            this.mApis.put(api, null);
            addApiIfAvailableInternal(api, null, scopeArr);
            return this;
        }

        public <O extends cnnu> Builder addApi(Api<O> api, O o) {
            cnwc.n(api, "Api must not be null");
            cnwc.n(o, "Null options are not permitted for this Api");
            this.mApis.put(api, o);
            cnny<?, O> baseClientBuilder = api.getBaseClientBuilder();
            cnwc.n(baseClientBuilder, "Base client builder must not be null");
            List<Scope> c = baseClientBuilder.c(o);
            this.mImpliedScopes.addAll(c);
            this.mRequiredScopes.addAll(c);
            return this;
        }

        public Builder(Context context, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            cnwc.n(connectionCallbacks, "Must provide a connected listener");
            this.mConnectedCallbacks.add(connectionCallbacks);
            cnwc.n(onConnectionFailedListener, "Must provide a connection failed listener");
            this.mOnConnectionFailedListeners.add(onConnectionFailedListener);
        }
    }

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes.dex */
    public interface ConnectionCallbacks extends cnpv {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes.dex */
    public interface OnConnectionFailedListener extends cnsi {
    }

    public static void dumpAll(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Set<GoogleApiClient> set = sAllClients;
        synchronized (set) {
            String concat = String.valueOf(str).concat("  ");
            int i = 0;
            for (GoogleApiClient googleApiClient : set) {
                printWriter.append((CharSequence) str).append("GoogleApiClient#").println(i);
                googleApiClient.dump(concat, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = sAllClients;
        synchronized (set) {
        }
        return set;
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long j, TimeUnit timeUnit);

    public abstract cnoh<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends cnnq, R extends cnom, T extends cnpg<R, A>> T enqueue(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends cnnq, T extends cnpg<? extends cnom, A>> T execute(T t) {
        throw new UnsupportedOperationException();
    }

    public <C extends cnnz> C getClient(cnnr<C> cnnrVar) {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public boolean hasApi(Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public boolean hasAuthenticatedScope(Scope scope) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener);

    public boolean isSignedIn() {
        throw new UnsupportedOperationException();
    }

    public boolean maybeSignIn(cnss cnssVar) {
        throw new UnsupportedOperationException();
    }

    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public <L> cnsd<L> registerListener(L l) {
        throw new UnsupportedOperationException();
    }

    public void registerPendingTransform(cntg cntgVar) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(Activity activity);

    public abstract void stopAutoManage(ff ffVar);

    public abstract void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public void unregisterPendingTransform(cntg cntgVar) {
        throw new UnsupportedOperationException();
    }
}
