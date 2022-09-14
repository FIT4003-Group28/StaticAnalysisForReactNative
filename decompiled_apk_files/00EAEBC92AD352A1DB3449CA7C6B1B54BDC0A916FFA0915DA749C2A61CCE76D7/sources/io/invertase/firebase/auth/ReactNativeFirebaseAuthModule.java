package io.invertase.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.e;
import com.google.firebase.auth.l0;
import com.google.firebase.auth.m0;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.s0;
import com.google.firebase.auth.t0;
import com.google.firebase.auth.u0;
import io.invertase.firebase.auth.ReactNativeFirebaseAuthModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReactNativeFirebaseAuthModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Auth";
    private static HashMap<String, FirebaseAuth.a> mAuthListeners = new HashMap<>();
    private static HashMap<String, FirebaseAuth.b> mIdTokenListeners = new HashMap<>();
    private m0 mCredential;
    private n0.a mForceResendingToken;
    private String mLastPhoneNumber;
    private String mVerificationId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends n0.b {

        /* renamed from: b  reason: collision with root package name */
        private boolean f10234b = false;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FirebaseAuth f10235c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f10236d;

        a(FirebaseAuth firebaseAuth, Promise promise) {
            this.f10235c = firebaseAuth;
            this.f10236d = promise;
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(c.e.b.f fVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:verification:failed");
            ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(this.f10236d, fVar);
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(final m0 m0Var) {
            c.e.a.b.g.h<com.google.firebase.auth.i> a2 = this.f10235c.a(m0Var);
            ExecutorService executor = ReactNativeFirebaseAuthModule.this.getExecutor();
            final Promise promise = this.f10236d;
            a2.a(executor, new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.a
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.a.this.a(m0Var, promise, hVar);
                }
            });
        }

        public /* synthetic */ void a(m0 m0Var, Promise promise, c.e.a.b.g.h hVar) {
            if (!hVar.e()) {
                Exception a2 = hVar.a();
                Log.e(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:failure", a2);
                if (this.f10234b) {
                    return;
                }
                ReactNativeFirebaseAuthModule.this.promiseRejectAuthException(promise, a2);
                return;
            }
            Log.d(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:success");
            if (this.f10234b) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            Parcel obtain = Parcel.obtain();
            m0Var.writeToParcel(obtain, 0);
            obtain.setDataPosition(16);
            String readString = obtain.readString();
            ReactNativeFirebaseAuthModule.this.mVerificationId = readString;
            obtain.recycle();
            createMap.putString("verificationId", readString);
            promise.resolve(createMap);
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(String str) {
            super.a(str);
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(String str, n0.a aVar) {
            ReactNativeFirebaseAuthModule.this.mVerificationId = str;
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = aVar;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            this.f10236d.resolve(createMap);
            this.f10234b = true;
        }
    }

    /* loaded from: classes.dex */
    class b extends n0.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f10238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f10239c;

        b(String str, String str2) {
            this.f10238b = str;
            this.f10239c = str2;
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(c.e.b.f fVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationFailed");
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("error", ReactNativeFirebaseAuthModule.this.getJSError(fVar));
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f10238b, this.f10239c, "onVerificationFailed", createMap);
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(m0 m0Var) {
            ReactNativeFirebaseAuthModule.this.mCredential = m0Var;
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onVerificationCompleted");
            WritableMap createMap = Arguments.createMap();
            Parcel obtain = Parcel.obtain();
            m0Var.writeToParcel(obtain, 0);
            obtain.setDataPosition(16);
            String readString = obtain.readString();
            obtain.setDataPosition(obtain.dataPosition() + 8);
            createMap.putString("code", obtain.readString());
            createMap.putString("verificationId", readString);
            obtain.recycle();
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f10238b, this.f10239c, "onVerificationComplete", createMap);
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(String str) {
            super.a(str);
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeAutoRetrievalTimeOut");
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f10238b, this.f10239c, "onCodeAutoRetrievalTimeout", createMap);
        }

        @Override // com.google.firebase.auth.n0.b
        public void a(String str, n0.a aVar) {
            Log.d(ReactNativeFirebaseAuthModule.TAG, "verifyPhoneNumber:verification:onCodeSent");
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = aVar;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f10238b, this.f10239c, "onCodeSent", createMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactNativeFirebaseAuthModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    private com.google.firebase.auth.e buildActionCodeSettings(ReadableMap readableMap) {
        e.a x = com.google.firebase.auth.e.x();
        x.c((String) Objects.requireNonNull(readableMap.getString("url")));
        if (readableMap.hasKey("handleCodeInApp")) {
            x.a(readableMap.getBoolean("handleCodeInApp"));
        }
        if (readableMap.hasKey("dynamicLinkDomain")) {
            x.a(readableMap.getString("dynamicLinkDomain"));
        }
        if (readableMap.hasKey("android")) {
            ReadableMap mo210getMap = readableMap.mo210getMap("android");
            x.a((String) Objects.requireNonNull(mo210getMap.getString("packageName")), ((ReadableMap) Objects.requireNonNull(mo210getMap)).hasKey("installApp") && mo210getMap.getBoolean("installApp"), mo210getMap.hasKey("minimumVersion") ? mo210getMap.getString("minimumVersion") : null);
        }
        if (readableMap.hasKey("iOS")) {
            x.b((String) Objects.requireNonNull(readableMap.mo210getMap("iOS").getString("bundleId")));
        }
        return x.a();
    }

    private WritableArray convertProviderData(List<? extends t0> list, com.google.firebase.auth.z zVar) {
        String o;
        WritableArray createArray = Arguments.createArray();
        for (t0 t0Var : list) {
            if (!"firebase".equals(t0Var.a())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("providerId", t0Var.a());
                createMap.putString("uid", t0Var.i());
                createMap.putString("displayName", t0Var.p());
                Uri h2 = t0Var.h();
                if (h2 == null || "".equals(h2.toString())) {
                    createMap.putNull("photoURL");
                } else {
                    createMap.putString("photoURL", h2.toString());
                }
                String m = t0Var.m();
                if ("phone".equals(t0Var.a()) && (t0Var.m() == null || "".equals(t0Var.m()))) {
                    m = zVar.m();
                } else if (m == null || "".equals(m)) {
                    createMap.putNull("phoneNumber");
                    if (!"password".equals(t0Var.a()) && (t0Var.o() == null || "".equals(t0Var.o()))) {
                        o = t0Var.i();
                    } else if (t0Var.o() != null || "".equals(t0Var.o())) {
                        createMap.putNull("email");
                        createArray.pushMap(createMap);
                    } else {
                        o = t0Var.o();
                    }
                    createMap.putString("email", o);
                    createArray.pushMap(createMap);
                }
                createMap.putString("phoneNumber", m);
                if (!"password".equals(t0Var.a())) {
                }
                if (t0Var.o() != null) {
                }
                createMap.putNull("email");
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    @ReactMethod
    private void createUserWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "createUserWithEmailAndPassword");
        c.e.a.b.g.h<com.google.firebase.auth.i> b2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).b(str2, str3);
        b2.a(new c.e.a.b.g.e() { // from class: io.invertase.firebase.auth.n
            @Override // c.e.a.b.g.e
            public final void a(Object obj) {
                ReactNativeFirebaseAuthModule.this.a(promise, (com.google.firebase.auth.i) obj);
            }
        });
        b2.a(new c.e.a.b.g.d() { // from class: io.invertase.firebase.auth.d
            @Override // c.e.a.b.g.d
            public final void a(Exception exc) {
                ReactNativeFirebaseAuthModule.this.a(promise, exc);
            }
        });
    }

    private WritableMap firebaseUserToMap(com.google.firebase.auth.z zVar) {
        WritableMap createMap = Arguments.createMap();
        String i = zVar.i();
        String o = zVar.o();
        Uri h2 = zVar.h();
        String p = zVar.p();
        String a2 = zVar.a();
        boolean l = zVar.l();
        String m = zVar.m();
        createMap.putString("uid", i);
        createMap.putString("providerId", a2);
        createMap.putBoolean("emailVerified", l);
        createMap.putBoolean("isAnonymous", zVar.u());
        if (o == null || "".equals(o)) {
            createMap.putNull("email");
        } else {
            createMap.putString("email", o);
        }
        if (p == null || "".equals(p)) {
            createMap.putNull("displayName");
        } else {
            createMap.putString("displayName", p);
        }
        if (h2 == null || "".equals(h2.toString())) {
            createMap.putNull("photoURL");
        } else {
            createMap.putString("photoURL", h2.toString());
        }
        if (m == null || "".equals(m)) {
            createMap.putNull("phoneNumber");
        } else {
            createMap.putString("phoneNumber", m);
        }
        createMap.putArray("providerData", convertProviderData(zVar.t(), zVar));
        WritableMap createMap2 = Arguments.createMap();
        com.google.firebase.auth.a0 r = zVar.r();
        if (r != null) {
            createMap2.putDouble("creationTime", r.b());
            createMap2.putDouble("lastSignInTime", r.d());
        }
        createMap.putMap("metadata", createMap2);
        return createMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private com.google.firebase.auth.h getCredentialForProvider(String str, String str2, String str3) {
        char c2;
        switch (str.hashCode()) {
            case -1830313082:
                if (str.equals("twitter.com")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1536293812:
                if (str.equals("google.com")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -364826023:
                if (str.equals("facebook.com")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 105516695:
                if (str.equals("oauth")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1216985755:
                if (str.equals("password")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1985010934:
                if (str.equals("github.com")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2120171958:
                if (str.equals("emailLink")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return com.google.firebase.auth.m.a(str2);
            case 1:
                return com.google.firebase.auth.f0.a(str2, str3);
            case 2:
                return s0.a(str2, str3);
            case 3:
                return com.google.firebase.auth.d0.a(str2);
            case 4:
                return l0.a(str, str2, str3);
            case 5:
                return getPhoneAuthCredential(str2, str3);
            case 6:
                return com.google.firebase.auth.k.a(str2, str3);
            case 7:
                return com.google.firebase.auth.k.b(str2, str3);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c9, code lost:
        if (r6.equals("CUSTOM_TOKEN_MISMATCH") != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.react.bridge.WritableMap getJSError(java.lang.Exception r11) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.invertase.firebase.auth.ReactNativeFirebaseAuthModule.getJSError(java.lang.Exception):com.facebook.react.bridge.WritableMap");
    }

    private m0 getPhoneAuthCredential(String str, String str2) {
        m0 m0Var;
        if (str == null && (m0Var = this.mCredential) != null) {
            this.mCredential = null;
            return m0Var;
        } else if (str == null) {
            return null;
        } else {
            return n0.a(str, str2);
        }
    }

    @ReactMethod
    private void linkWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.h credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "link");
        if (a2 != null) {
            a2.a(credentialForProvider).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.t
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.h(promise, hVar);
                }
            });
        } else {
            promiseNoUser(promise, true);
        }
    }

    private void promiseNoUser(Promise promise, Boolean bool) {
        if (bool.booleanValue()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "no-current-user", "No user currently signed in.");
        } else {
            promise.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void promiseRejectAuthException(Promise promise, Exception exc) {
        WritableMap jSError = getJSError(exc);
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, jSError.getString("code"), jSError.getString("message"));
    }

    private void promiseWithAuthResult(com.google.firebase.auth.i iVar, Promise promise) {
        if (iVar == null || iVar.getUser() == null) {
            promiseNoUser(promise, true);
            return;
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap firebaseUserToMap = firebaseUserToMap(iVar.getUser());
        if (iVar.e() != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isNewUser", iVar.e().c());
            if (iVar.e().getProfile() != null) {
                io.invertase.firebase.common.l.a("profile", iVar.e().getProfile(), createMap2);
            }
            if (iVar.e().a() != null) {
                createMap2.putString("providerId", iVar.e().a());
            }
            if (iVar.e().getUsername() != null) {
                createMap2.putString("username", iVar.e().getUsername());
            }
            createMap.putMap("additionalUserInfo", createMap2);
        }
        createMap.putMap("user", firebaseUserToMap);
        promise.resolve(createMap);
    }

    private void promiseWithUser(com.google.firebase.auth.z zVar, Promise promise) {
        if (zVar != null) {
            promise.resolve(firebaseUserToMap(zVar));
        } else {
            promiseNoUser(promise, true);
        }
    }

    @ReactMethod
    private void reauthenticateWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.h credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "reauthenticate");
        if (a2 != null) {
            a2.b(credentialForProvider).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.u
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.i(promise, hVar);
                }
            });
        } else {
            promiseNoUser(promise, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPhoneStateEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        io.invertase.firebase.common.g b2 = io.invertase.firebase.common.g.b();
        createMap.putString("appName", str);
        createMap.putString("requestKey", str2);
        createMap.putString("type", str3);
        createMap.putMap("state", writableMap);
        b2.b(new io.invertase.firebase.common.f("phone_auth_state_changed", createMap, str));
    }

    @ReactMethod
    private void signInAnonymously(String str, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        Log.d(TAG, "signInAnonymously");
        c.e.a.b.g.h<com.google.firebase.auth.i> d2 = firebaseAuth.d();
        d2.a(new c.e.a.b.g.e() { // from class: io.invertase.firebase.auth.x
            @Override // c.e.a.b.g.e
            public final void a(Object obj) {
                ReactNativeFirebaseAuthModule.this.b(promise, (com.google.firebase.auth.i) obj);
            }
        });
        d2.a(new c.e.a.b.g.d() { // from class: io.invertase.firebase.auth.j
            @Override // c.e.a.b.g.d
            public final void a(Exception exc) {
                ReactNativeFirebaseAuthModule.this.b(promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.h credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        Log.d(TAG, "signInWithCredential");
        firebaseAuth.a(credentialForProvider).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.s
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.l(promise, hVar);
            }
        });
    }

    @ReactMethod
    private void signInWithCustomToken(String str, String str2, final Promise promise) {
        Log.d(TAG, "signInWithCustomToken");
        c.e.a.b.g.h<com.google.firebase.auth.i> f2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).f(str2);
        f2.a(new c.e.a.b.g.e() { // from class: io.invertase.firebase.auth.d0
            @Override // c.e.a.b.g.e
            public final void a(Object obj) {
                ReactNativeFirebaseAuthModule.this.c(promise, (com.google.firebase.auth.i) obj);
            }
        });
        f2.a(new c.e.a.b.g.d() { // from class: io.invertase.firebase.auth.l
            @Override // c.e.a.b.g.d
            public final void a(Exception exc) {
                ReactNativeFirebaseAuthModule.this.c(promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "signInWithEmailAndPassword");
        c.e.a.b.g.h<com.google.firebase.auth.i> c2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).c(str2, str3);
        c2.a(new c.e.a.b.g.e() { // from class: io.invertase.firebase.auth.g
            @Override // c.e.a.b.g.e
            public final void a(Object obj) {
                ReactNativeFirebaseAuthModule.this.d(promise, (com.google.firebase.auth.i) obj);
            }
        });
        c2.a(new c.e.a.b.g.d() { // from class: io.invertase.firebase.auth.m
            @Override // c.e.a.b.g.d
            public final void a(Exception exc) {
                ReactNativeFirebaseAuthModule.this.d(promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithEmailLink(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "signInWithEmailLink");
        c.e.a.b.g.h<com.google.firebase.auth.i> d2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).d(str2, str3);
        d2.a(new c.e.a.b.g.e() { // from class: io.invertase.firebase.auth.w
            @Override // c.e.a.b.g.e
            public final void a(Object obj) {
                ReactNativeFirebaseAuthModule.this.e(promise, (com.google.firebase.auth.i) obj);
            }
        });
        d2.a(new c.e.a.b.g.d() { // from class: io.invertase.firebase.auth.q
            @Override // c.e.a.b.g.d
            public final void a(Exception exc) {
                ReactNativeFirebaseAuthModule.this.e(promise, exc);
            }
        });
    }

    @ReactMethod
    private void updatePhoneNumber(String str, String str2, String str3, String str4, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        if (!str2.equals("phone")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential does not have a phone provider.");
        }
        m0 phoneAuthCredential = getPhoneAuthCredential(str3, str4);
        if (phoneAuthCredential == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else if (a2 == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "updatePhoneNumber:failure:noCurrentUser");
        } else {
            Log.d(TAG, "updatePhoneNumber");
            a2.a(phoneAuthCredential).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.h0
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.f(firebaseAuth, promise, hVar);
                }
            });
        }
    }

    public /* synthetic */ void a(Promise promise, c.e.a.b.g.h hVar) {
        if (!hVar.e()) {
            Exception a2 = hVar.a();
            Log.e(TAG, "checkActionCode:onComplete:failure", a2);
            promiseRejectAuthException(promise, a2);
            return;
        }
        Log.d(TAG, "checkActionCode:onComplete:success");
        com.google.firebase.auth.d dVar = (com.google.firebase.auth.d) Objects.requireNonNull(hVar.b());
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("email", dVar.a(0));
        createMap2.putString("fromEmail", dVar.a(1));
        createMap.putMap("data", createMap2);
        int a3 = dVar.a();
        createMap.putString("operation", a3 != 0 ? a3 != 1 ? a3 != 2 ? a3 != 3 ? a3 != 4 ? "UNKNOWN" : "EMAIL_SIGNIN" : "ERROR" : "RECOVER_EMAIL" : "VERIFY_EMAIL" : "PASSWORD_RESET");
        promise.resolve(createMap);
    }

    public /* synthetic */ void a(Promise promise, com.google.firebase.auth.i iVar) {
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(iVar, promise);
        Log.d(TAG, "createUserWithEmailAndPassword:onComplete:promiseResolved");
    }

    public /* synthetic */ void a(Promise promise, Exception exc) {
        Log.e(TAG, "createUserWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void a(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "applyActionCode:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "applyActionCode:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void a(String str, FirebaseAuth firebaseAuth) {
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        WritableMap createMap = Arguments.createMap();
        io.invertase.firebase.common.g b2 = io.invertase.firebase.common.g.b();
        createMap.putString("appName", str);
        if (a2 != null) {
            createMap.putMap("user", firebaseUserToMap(a2));
        }
        Log.d(TAG, "addAuthStateListener:eventBody " + createMap.toString());
        b2.b(new io.invertase.firebase.common.f("auth_state_changed", createMap, str));
    }

    @ReactMethod
    public void addAuthStateListener(final String str) {
        Log.d(TAG, "addAuthStateListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        if (mAuthListeners.get(str) == null) {
            FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: io.invertase.firebase.auth.c
                @Override // com.google.firebase.auth.FirebaseAuth.a
                public final void a(FirebaseAuth firebaseAuth2) {
                    ReactNativeFirebaseAuthModule.this.a(str, firebaseAuth2);
                }
            };
            firebaseAuth.a(aVar);
            mAuthListeners.put(str, aVar);
        }
    }

    @ReactMethod
    public void addIdTokenListener(final String str) {
        Log.d(TAG, "addIdTokenListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        if (!mIdTokenListeners.containsKey(str)) {
            FirebaseAuth.b bVar = new FirebaseAuth.b() { // from class: io.invertase.firebase.auth.e
                @Override // com.google.firebase.auth.FirebaseAuth.b
                public final void a(FirebaseAuth firebaseAuth2) {
                    ReactNativeFirebaseAuthModule.this.b(str, firebaseAuth2);
                }
            };
            firebaseAuth.a(bVar);
            mIdTokenListeners.put(str, bVar);
        }
    }

    @ReactMethod
    public void applyActionCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "applyActionCode");
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        firebaseAuth.a(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.b
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.a(firebaseAuth, promise, hVar);
            }
        });
    }

    public /* synthetic */ void b(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "confirmPasswordReset:onComplete:success");
            promiseNoUser(promise, false);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "confirmPasswordReset:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void b(Promise promise, com.google.firebase.auth.i iVar) {
        Log.d(TAG, "signInAnonymously:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    public /* synthetic */ void b(Promise promise, Exception exc) {
        Log.e(TAG, "signInAnonymously:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void b(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "reload:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "reload:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void b(String str, FirebaseAuth firebaseAuth) {
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        io.invertase.firebase.common.g b2 = io.invertase.firebase.common.g.b();
        WritableMap createMap = Arguments.createMap();
        if (a2 != null) {
            createMap.putBoolean("authenticated", true);
            createMap.putString("appName", str);
            createMap.putMap("user", firebaseUserToMap(a2));
        } else {
            createMap.putString("appName", str);
            createMap.putBoolean("authenticated", false);
        }
        b2.b(new io.invertase.firebase.common.f("auth_id_token_changed", createMap, str));
    }

    public /* synthetic */ void c(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:success");
            promiseWithAuthResult((com.google.firebase.auth.i) Objects.requireNonNull(hVar.b()), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void c(Promise promise, com.google.firebase.auth.i iVar) {
        Log.d(TAG, "signInWithCustomToken:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    public /* synthetic */ void c(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithCustomToken:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void c(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "sendEmailVerification:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "sendEmailVerification:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    @ReactMethod
    public void checkActionCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "checkActionCode");
        FirebaseAuth.getInstance(c.e.b.d.a(str)).b(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.k
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.a(promise, hVar);
            }
        });
    }

    @ReactMethod
    public void confirmPasswordReset(String str, String str2, String str3, final Promise promise) {
        Log.d(TAG, "confirmPasswordReset");
        FirebaseAuth.getInstance(c.e.b.d.a(str)).a(str2, str3).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.i0
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.b(promise, hVar);
            }
        });
    }

    @ReactMethod
    public void confirmationResultConfirm(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(c.e.b.d.a(str)).a(n0.a(this.mVerificationId, str2)).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.f
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.c(promise, hVar);
            }
        });
    }

    public /* synthetic */ void d(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "delete:onComplete:success");
            promiseNoUser(promise, false);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "delete:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void d(Promise promise, com.google.firebase.auth.i iVar) {
        Log.d(TAG, "signInWithEmailAndPassword:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    public /* synthetic */ void d(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailAndPassword:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void d(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "updateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "updateEmail:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    @ReactMethod
    public void delete(String str, final Promise promise) {
        com.google.firebase.auth.z a2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).a();
        Log.d(TAG, "delete");
        if (a2 != null) {
            a2.q().a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.a0
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.d(promise, hVar);
                }
            });
            return;
        }
        Log.e(TAG, "delete:failure:noCurrentUser");
        promiseNoUser(promise, true);
    }

    public /* synthetic */ void e(Promise promise, c.e.a.b.g.h hVar) {
        if (!hVar.e()) {
            Exception a2 = hVar.a();
            Log.d(TAG, "fetchProvidersForEmail:onComplete:failure", a2);
            promiseRejectAuthException(promise, a2);
            return;
        }
        Log.d(TAG, "fetchProvidersForEmail:onComplete:success");
        List<String> a3 = ((q0) Objects.requireNonNull(hVar.b())).a();
        WritableArray createArray = Arguments.createArray();
        if (a3 != null) {
            for (String str : a3) {
                createArray.pushString(str);
            }
        }
        promise.resolve(createArray);
    }

    public /* synthetic */ void e(Promise promise, com.google.firebase.auth.i iVar) {
        Log.d(TAG, "signInWithEmailLink:onComplete:success");
        promiseWithAuthResult(iVar, promise);
    }

    public /* synthetic */ void e(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailLink:onComplete:failure", exc);
        promiseRejectAuthException(promise, exc);
    }

    public /* synthetic */ void e(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "updatePassword:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "updatePassword:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void f(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "getIdToken:onComplete:success");
            promise.resolve(((com.google.firebase.auth.b0) Objects.requireNonNull((com.google.firebase.auth.b0) hVar.b())).f());
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "getIdToken:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void f(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "updatePhoneNumber:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "updatePhoneNumber:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    @ReactMethod
    public void fetchSignInMethodsForEmail(String str, String str2, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        Log.d(TAG, "fetchProvidersForEmail");
        firebaseAuth.c(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.z
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.e(promise, hVar);
            }
        });
    }

    public /* synthetic */ void g(Promise promise, c.e.a.b.g.h hVar) {
        if (!hVar.e()) {
            Exception a2 = hVar.a();
            Log.e(TAG, "getIdTokenResult:onComplete:failure", a2);
            promiseRejectAuthException(promise, a2);
            return;
        }
        Log.d(TAG, "getIdTokenResult:onComplete:success");
        com.google.firebase.auth.b0 b0Var = (com.google.firebase.auth.b0) hVar.b();
        WritableMap createMap = Arguments.createMap();
        io.invertase.firebase.common.l.a("authTime", io.invertase.firebase.common.l.a(((com.google.firebase.auth.b0) Objects.requireNonNull(b0Var)).a()), createMap);
        io.invertase.firebase.common.l.a("expirationTime", io.invertase.firebase.common.l.a(b0Var.c()), createMap);
        io.invertase.firebase.common.l.a("issuedAtTime", io.invertase.firebase.common.l.a(b0Var.d()), createMap);
        io.invertase.firebase.common.l.a("claims", b0Var.b(), createMap);
        io.invertase.firebase.common.l.a("signInProvider", b0Var.e(), createMap);
        io.invertase.firebase.common.l.a("token", b0Var.f(), createMap);
        promise.resolve(createMap);
    }

    public /* synthetic */ void g(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "updateProfile:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "updateProfile:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        List<c.e.b.d> a2 = c.e.b.d.a(getReactApplicationContext());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (c.e.b.d dVar : a2) {
            String c2 = dVar.c();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(c2));
            com.google.firebase.auth.z a3 = firebaseAuth.a();
            hashMap2.put(c2, firebaseAuth.c());
            if (a3 != null) {
                hashMap3.put(c2, firebaseUserToMap(a3));
            }
        }
        hashMap.put("APP_LANGUAGE", hashMap2);
        hashMap.put("APP_USER", hashMap3);
        return hashMap;
    }

    @ReactMethod
    public void getIdToken(String str, Boolean bool, final Promise promise) {
        Log.d(TAG, "getIdToken");
        com.google.firebase.auth.z a2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).a();
        if (a2 == null) {
            promiseNoUser(promise, true);
        } else {
            a2.a(bool.booleanValue()).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.r
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.f(promise, hVar);
                }
            });
        }
    }

    @ReactMethod
    public void getIdTokenResult(String str, Boolean bool, final Promise promise) {
        Log.d(TAG, "getIdTokenResult");
        com.google.firebase.auth.z a2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).a();
        if (a2 == null) {
            promiseNoUser(promise, true);
        } else {
            a2.a(bool.booleanValue()).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.e0
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.g(promise, hVar);
                }
            });
        }
    }

    public /* synthetic */ void h(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "link:onComplete:success");
            promiseWithAuthResult((com.google.firebase.auth.i) hVar.b(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "link:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void h(FirebaseAuth firebaseAuth, Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "verifyBeforeUpdateEmail:onComplete:success");
            promiseWithUser(firebaseAuth.a(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "verifyBeforeUpdateEmail:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void i(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "reauthenticate:onComplete:success");
            promiseWithAuthResult((com.google.firebase.auth.i) hVar.b(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "reauthenticate:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        Log.d(TAG, "instance-initialized");
    }

    public /* synthetic */ void j(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "sendPasswordResetEmail:onComplete:success");
            promiseNoUser(promise, false);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "sendPasswordResetEmail:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void k(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "sendSignInLinkToEmail:onComplete:success");
            promiseNoUser(promise, false);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "sendSignInLinkToEmail:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void l(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "signInWithCredential:onComplete:success");
            promiseWithAuthResult((com.google.firebase.auth.i) hVar.b(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "signInWithCredential:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void m(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "unlink:onComplete:success");
            promiseWithUser(((com.google.firebase.auth.i) Objects.requireNonNull(hVar.b())).getUser(), promise);
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "unlink:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    public /* synthetic */ void n(Promise promise, c.e.a.b.g.h hVar) {
        if (hVar.e()) {
            Log.d(TAG, "verifyPasswordResetCode:onComplete:success");
            promise.resolve(hVar.b());
            return;
        }
        Exception a2 = hVar.a();
        Log.e(TAG, "verifyPasswordResetCode:onComplete:failure", a2);
        promiseRejectAuthException(promise, a2);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        Log.d(TAG, "instance-destroyed");
        Iterator<Map.Entry<String, FirebaseAuth.a>> it = mAuthListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, FirebaseAuth.a> next = it.next();
            FirebaseAuth.getInstance(c.e.b.d.a(next.getKey())).b(next.getValue());
            it.remove();
        }
        Iterator<Map.Entry<String, FirebaseAuth.b>> it2 = mIdTokenListeners.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, FirebaseAuth.b> next2 = it2.next();
            FirebaseAuth.getInstance(c.e.b.d.a(next2.getKey())).b(next2.getValue());
            it2.remove();
        }
    }

    @ReactMethod
    public void reload(String str, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "reload");
        if (a2 != null) {
            a2.v().a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.o
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.b(firebaseAuth, promise, hVar);
                }
            });
            return;
        }
        promiseNoUser(promise, false);
        Log.e(TAG, "reload:failure:noCurrentUser");
    }

    @ReactMethod
    public void removeAuthStateListener(String str) {
        Log.d(TAG, "removeAuthStateListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        FirebaseAuth.a aVar = mAuthListeners.get(str);
        if (aVar != null) {
            firebaseAuth.b(aVar);
            mAuthListeners.remove(str);
        }
    }

    @ReactMethod
    public void removeIdTokenListener(String str) {
        Log.d(TAG, "removeIdTokenListener");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        FirebaseAuth.b bVar = mIdTokenListeners.get(str);
        if (bVar != null) {
            firebaseAuth.b(bVar);
            mIdTokenListeners.remove(str);
        }
    }

    @ReactMethod
    public void sendEmailVerification(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "sendEmailVerification");
        if (a2 == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "sendEmailVerification:failure:noCurrentUser");
            return;
        }
        (readableMap == null ? a2.x() : a2.a(buildActionCodeSettings(readableMap))).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.y
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.c(firebaseAuth, promise, hVar);
            }
        });
    }

    @ReactMethod
    public void sendPasswordResetEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        Log.d(TAG, "sendPasswordResetEmail");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        (readableMap == null ? firebaseAuth.d(str2) : firebaseAuth.a(str2, buildActionCodeSettings(readableMap))).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.v
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.j(promise, hVar);
            }
        });
    }

    @ReactMethod
    public void sendSignInLinkToEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        Log.d(TAG, "sendSignInLinkToEmail");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        firebaseAuth.b(str2, buildActionCodeSettings(readableMap)).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.b0
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.k(promise, hVar);
            }
        });
    }

    @ReactMethod
    public void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2, String str3, Promise promise) {
        Log.d(TAG, "setAutoRetrievedSmsCodeForPhoneNumber");
        FirebaseAuth.getInstance(c.e.b.d.a(str)).b().a(str2, str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void setLanguageCode(String str, String str2) {
        FirebaseAuth.getInstance(c.e.b.d.a(str)).e(str2);
    }

    @ReactMethod
    public void signInWithPhoneNumber(String str, String str2, boolean z, Promise promise) {
        Log.d(TAG, "signInWithPhoneNumber");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mVerificationId = null;
        a aVar = new a(firebaseAuth, promise);
        if (currentActivity != null) {
            if (!z || this.mForceResendingToken == null) {
                n0.a(firebaseAuth).a(str2, 60L, TimeUnit.SECONDS, currentActivity, aVar);
            } else {
                n0.a(firebaseAuth).a(str2, 60L, TimeUnit.SECONDS, currentActivity, aVar, this.mForceResendingToken);
            }
        }
    }

    @ReactMethod
    public void signOut(String str, Promise promise) {
        boolean z;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        Log.d(TAG, "signOut");
        if (firebaseAuth == null || firebaseAuth.a() == null) {
            z = true;
        } else {
            firebaseAuth.e();
            z = false;
        }
        promiseNoUser(promise, Boolean.valueOf(z));
    }

    @ReactMethod
    public void unlink(String str, String str2, final Promise promise) {
        com.google.firebase.auth.z a2 = FirebaseAuth.getInstance(c.e.b.d.a(str)).a();
        Log.d(TAG, "unlink");
        if (a2 != null) {
            a2.a(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.g0
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.m(promise, hVar);
                }
            });
        } else {
            promiseNoUser(promise, true);
        }
    }

    @ReactMethod
    public void updateEmail(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "updateEmail");
        if (a2 != null) {
            a2.b(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.p
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.d(firebaseAuth, promise, hVar);
                }
            });
            return;
        }
        promiseNoUser(promise, false);
        Log.e(TAG, "updateEmail:failure:noCurrentUser");
    }

    @ReactMethod
    public void updatePassword(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "updatePassword");
        if (a2 != null) {
            a2.c(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.f0
                @Override // c.e.a.b.g.c
                public final void a(c.e.a.b.g.h hVar) {
                    ReactNativeFirebaseAuthModule.this.e(firebaseAuth, promise, hVar);
                }
            });
            return;
        }
        promiseNoUser(promise, false);
        Log.e(TAG, "updatePassword:failure:noCurrentUser");
    }

    @ReactMethod
    public void updateProfile(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "updateProfile");
        if (a2 == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "updateProfile:failure:noCurrentUser");
            return;
        }
        u0.a aVar = new u0.a();
        if (readableMap.hasKey("displayName")) {
            aVar.a(readableMap.getString("displayName"));
        }
        if (readableMap.hasKey("photoURL")) {
            String string = readableMap.getString("photoURL");
            aVar.a(string == null ? null : Uri.parse(string));
        }
        a2.a(aVar.a()).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.c0
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.g(firebaseAuth, promise, hVar);
            }
        });
    }

    @ReactMethod
    public void useDeviceLanguage(String str) {
        FirebaseAuth.getInstance(c.e.b.d.a(str)).f();
    }

    @ReactMethod
    public void verifyBeforeUpdateEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        com.google.firebase.auth.z a2 = firebaseAuth.a();
        Log.d(TAG, "verifyBeforeUpdateEmail");
        if (a2 == null) {
            promiseNoUser(promise, false);
            Log.e(TAG, "verifyBeforeUpdateEmail:failure:noCurrentUser");
            return;
        }
        (readableMap == null ? a2.d(str2) : a2.a(str2, buildActionCodeSettings(readableMap))).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.h
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.h(firebaseAuth, promise, hVar);
            }
        });
    }

    @ReactMethod
    public void verifyPasswordResetCode(String str, String str2, final Promise promise) {
        Log.d(TAG, "verifyPasswordResetCode");
        FirebaseAuth.getInstance(c.e.b.d.a(str)).g(str2).a(getExecutor(), new c.e.a.b.g.c() { // from class: io.invertase.firebase.auth.i
            @Override // c.e.a.b.g.c
            public final void a(c.e.a.b.g.h hVar) {
                ReactNativeFirebaseAuthModule.this.n(promise, hVar);
            }
        });
    }

    @ReactMethod
    public void verifyPhoneNumber(String str, String str2, String str3, int i, boolean z) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(c.e.b.d.a(str));
        Activity currentActivity = getCurrentActivity();
        Log.d(TAG, "verifyPhoneNumber:" + str2);
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mCredential = null;
        b bVar = new b(str, str3);
        if (currentActivity != null) {
            if (!z || this.mForceResendingToken == null) {
                n0.a(firebaseAuth).a(str2, i, TimeUnit.SECONDS, currentActivity, bVar);
            } else {
                n0.a(firebaseAuth).a(str2, i, TimeUnit.SECONDS, currentActivity, bVar, this.mForceResendingToken);
            }
        }
    }
}
