package com.teslamotors.plugins.ble.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.teslamotors.a.a;
import com.teslamotors.plugins.ble.d;
import com.teslamotors.plugins.ble.f;
import com.teslamotors.plugins.ble.g;
import com.teslamotors.plugins.client.e;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: VehicleStateMachine.java */
/* loaded from: classes.dex */
public class c {
    private static final Set<a> i = new HashSet(Arrays.asList(a.WAITING_FOR_STATUS, a.GET_STATUS, a.ALL_CRYPTO_COMPLETE, a.CONNECTED_IDLE));
    private static final Set<a> j = new HashSet(Arrays.asList(a.WAITING_FOR_STATUS, a.GET_STATUS, a.ALL_CRYPTO_COMPLETE, a.CONNECTED_IDLE, a.IDLE, a.WAITING_FOR_PERMISSION, a.WAITING_FOR_CRYPTO_COUNTER));
    private static final Set<a> k = new HashSet(Arrays.asList(a.WAITING_FOR_STATUS, a.WAITING_FOR_PUB_KEY, a.WAITING_FOR_PERMISSION, a.WAITING_FOR_CRYPTO_COUNTER, a.WAITING_FOR_WHITELIST, a.WAITING_FOR_COMMAND_PERIPHERAL));
    private static final Set<a> l = new HashSet(Arrays.asList(a.IDLE, a.WAITING_FOR_PUB_KEY, a.WAITING_FOR_WHITELIST, a.WAITING_FOR_COMMAND_PERIPHERAL, a.WAITING_FOR_PERMISSION, a.WAITING_FOR_CRYPTO_COUNTER, a.WAITING_FOR_STATUS, a.CONNECTED_IDLE));
    private final String C;
    private final f D;
    private final Context E;

    /* renamed from: a  reason: collision with root package name */
    byte[] f5232a;

    /* renamed from: c  reason: collision with root package name */
    public int f5234c;

    /* renamed from: d  reason: collision with root package name */
    public int f5235d;
    public int e;
    public int f;
    public int g;
    private PublicKey m;
    private PrivateKey n;
    private PublicKey o;
    private boolean t;
    private String u;
    private a.ab v;
    private int y;
    private int z;

    /* renamed from: b  reason: collision with root package name */
    byte[] f5233b = null;
    private AtomicLong w = new AtomicLong();
    private Runnable F = new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.2
        @Override // java.lang.Runnable
        public void run() {
            if (c.k.contains(c.this.p) && c.this.D.h() != b.CONNECTED) {
                if (!c.this.D.j()) {
                    c.this.a(String.format("Timed out in state %s but no other candidates. Cancelling retries", c.this.p.name()));
                    c.this.a(a.IDLE);
                    return;
                }
                c.this.a(String.format("Timed out in state %s. Trying a different command peripheral", c.this.p.name()));
                c.this.a(a.CONNECT_TO_COMMAND_PERIPHERAL);
            } else if (c.this.f5234c > 10 && !c.this.r) {
                c.this.a("Timed out getting public key");
                c.this.a(a.IDLE);
                c.this.D.l();
            } else if (c.this.f5235d > 10 && !c.this.t) {
                c.this.a("Timed out getting whitelist");
                c.this.a(a.IDLE);
                c.this.D.l();
            } else if (c.this.f == 10) {
                c.this.a("Timed out getting status", new Exception("[TMBLE Logic] Failed to get vehicle status after 10 attempts; resetting command peripheral."));
                c.this.a(a.IDLE);
                c.this.D.l();
            } else if (c.this.g > 10) {
                c.this.a("Timed out getting permissions");
                c.this.a(a.SYNC_CRYPTO_COUNTER);
            } else if (c.this.e > 10) {
                c.this.a("Timed out getting IV");
                c.this.a(a.ALL_CRYPTO_COMPLETE);
            } else if (c.this.p != a.WAITING_FOR_PUB_KEY) {
                if (c.this.p != a.WAITING_FOR_WHITELIST) {
                    if (c.this.p != a.WAITING_FOR_STATUS) {
                        if (c.this.p != a.WAITING_FOR_PERMISSION) {
                            if (c.this.p != a.WAITING_FOR_CRYPTO_COUNTER) {
                                return;
                            }
                            c.this.e++;
                            c.this.a("Restarting timer for syncing crypto counter");
                            c.this.a(a.SYNC_CRYPTO_COUNTER);
                            return;
                        }
                        c.this.g++;
                        c.this.a("Restarting timer for permission");
                        c.this.a(a.GET_PERMISSION);
                        return;
                    }
                    c.this.f++;
                    c.this.a("Restarting timer for status");
                    c.this.a(a.GET_STATUS);
                    return;
                }
                c.this.f5235d++;
                c.this.a("Restarting timer for whitelist");
                c.this.a(a.CHECK_WHITELIST);
            } else {
                c.this.f5234c++;
                c.this.a("Restarting timer for request pub key");
                c.this.a(a.REQUEST_PUB_KEY);
            }
        }
    };
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean A = false;
    private a p = a.IDLE;
    Handler h = new Handler(Looper.getMainLooper());
    private final d B = new d();
    private a.f x = null;

    public c(f fVar, String str, String str2, Context context) {
        boolean z = false;
        this.t = false;
        this.D = fVar;
        this.C = str;
        this.u = str2;
        this.E = context;
        this.w.set(e.a(this.E).d(this.C, str2));
        this.y = (int) e.a(this.E).e(this.C, str2);
        this.t = this.y > 0 ? true : z;
    }

    private synchronized long q() {
        return e.a(this.E).a(this.w.incrementAndGet(), this.C, this.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a aVar) {
        boolean z = true;
        a(String.format("State Change: %s -> %s", this.p, aVar));
        if (this.p == aVar) {
            z = false;
        }
        this.p = aVar;
        if (z || !l.contains(this.p)) {
            r();
        }
    }

    private void r() {
        a(String.format("State: %s", this.p));
        switch (this.p) {
            case GENERATE_KEY_PAIR:
                if (!this.q) {
                    try {
                        KeyPair a2 = this.B.a(this.u, this.E);
                        if (a2 == null) {
                            a("Generating key pair for ");
                            try {
                                a2 = d.a();
                                if (!this.B.a(a2, this.u, this.E)) {
                                    a("[TMBLE] Unable to store local key pair");
                                    a2 = null;
                                }
                            } catch (Exception e) {
                                a("Unrecoverable failure trying to generate local key pair", e);
                                return;
                            }
                        } else {
                            a("Found key pair");
                        }
                        if (a2 != null) {
                            this.q = true;
                            this.n = a2.getPrivate();
                            this.m = a2.getPublic();
                            this.f5233b = d.a(this.m);
                            a(String.format("Local pub key ID    : %s", g.a(this.f5233b)));
                        }
                        s();
                    } catch (Exception e2) {
                        a("Unrecoverable failure trying to get local key pair", e2);
                        return;
                    }
                }
                a(a.IDLE);
                return;
            case CONNECT_TO_COMMAND_PERIPHERAL:
                if (this.D.i()) {
                    a("trying to connect to new command peripheral when one already exists");
                    e.a(this.E).a("[TMBLE Logic] trying to connect to new command peripheral when one already exists", (Integer) 100, (Map<String, Object>) null);
                    a(a.CONNECTION_ESTABLISHED);
                    return;
                } else if (this.D.j()) {
                    a("connect to command peripheral with candidate peripherals but no command peripheral");
                    t();
                    a(a.WAITING_FOR_COMMAND_PERIPHERAL);
                    this.D.k();
                    return;
                } else {
                    a("connect to command peripheral with no peripherals; going back to idle");
                    a(a.IDLE);
                    return;
                }
            case CONNECTION_ESTABLISHED:
                if (!this.r) {
                    a(a.REQUEST_PUB_KEY);
                    return;
                } else if (!this.q) {
                    a(a.GENERATE_KEY_PAIR);
                    return;
                } else if (!this.s) {
                    a(a.DERIVE_SHARED_KEY);
                    return;
                } else if (!this.t) {
                    a(a.CHECK_WHITELIST);
                    return;
                } else {
                    s();
                    a(a.ALL_CRYPTO_COMPLETE);
                    return;
                }
            case REQUEST_PUB_KEY:
                if (!this.A) {
                    return;
                }
                t();
                a(a.WAITING_FOR_PUB_KEY);
                b(a.s.INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY);
                return;
            case PARSE_PUB_KEY:
                PublicKey u = u();
                this.o = u;
                this.f5234c = 0;
                if (u != null) {
                    this.r = true;
                    a(a.DERIVE_SHARED_KEY);
                    s();
                    return;
                }
                a("Failed to parse public key");
                e.a(this.E).a("[TMBLE Logic] Could not parse public key", (Integer) 100, (Map<String, Object>) null);
                a(a.REQUEST_PUB_KEY);
                return;
            case DERIVE_SHARED_KEY:
                if (!this.s && this.r && this.q) {
                    a("Performing ECDH Key Exchange");
                    this.f5232a = d.a(this.o, this.n);
                    if (this.f5232a != null) {
                        this.s = true;
                        a("Performed ECDH Key Exchange - shared secret:");
                        if (!this.t) {
                            a(a.CHECK_WHITELIST);
                            return;
                        } else {
                            a(a.ALL_CRYPTO_COMPLETE);
                            return;
                        }
                    }
                    a("Could not perform Key Exchange.");
                    e.a(this.E).a("[TMBLE Logic] Could not perform key exchange", (Integer) 100, (Map<String, Object>) null);
                    this.r = false;
                    a(a.REQUEST_PUB_KEY);
                    return;
                } else if (this.s && this.r && this.q) {
                    return;
                } else {
                    a(String.format("Could not derive shared keys. Derived keys %s. Remote key %s. Local key %s", Boolean.valueOf(this.s), Boolean.valueOf(this.r), Boolean.valueOf(this.q)));
                    e.a(this.E).a("[TMBLE Logic] Could not derive shared keys", (Integer) 100, (Map<String, Object>) new HashMap<String, Object>() { // from class: com.teslamotors.plugins.ble.c.c.1
                        {
                            put("derived_keys", Boolean.valueOf(c.this.s));
                            put("remote_key", Boolean.valueOf(c.this.r));
                            put("local_key", Boolean.valueOf(c.this.q));
                        }
                    });
                    return;
                }
            case CHECK_WHITELIST:
                if (!this.A) {
                    return;
                }
                t();
                a(a.WAITING_FOR_WHITELIST);
                b(a.s.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO);
                return;
            case GET_STATUS:
                if (!this.A) {
                    return;
                }
                t();
                a(a.WAITING_FOR_STATUS);
                b(a.s.INFORMATION_REQUEST_TYPE_GET_STATUS);
                return;
            case GET_PERMISSION:
                if (!this.A) {
                    return;
                }
                t();
                a(a.WAITING_FOR_PERMISSION);
                b(a.s.INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO);
                return;
            case SYNC_CRYPTO_COUNTER:
                if (!this.A) {
                    return;
                }
                t();
                a(a.WAITING_FOR_CRYPTO_COUNTER);
                b(a.s.INFORMATION_REQUEST_TYPE_GET_COUNTER);
                return;
            case ALL_CRYPTO_COMPLETE:
                a(a.GET_STATUS);
                return;
            case CONNECTED_IDLE:
                this.D.n();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.D.a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Exception exc) {
        this.D.a(String.format("[Logic Error] %s", str), exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.D.a(String.format("[Logic] %s", str));
    }

    private void t() {
        this.h.removeCallbacks(this.F);
        this.h.postDelayed(this.F, 2000L);
    }

    private PublicKey u() {
        a(String.format("Parsing certificate to retrieve public key: %s", "REDACTED"));
        this.o = this.B.a(this.v.e().d());
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a.s sVar) {
        this.D.a(a(sVar), sVar.name());
    }

    public void a() {
        this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.3
            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a("start: " + c.this.p);
                if (c.this.p != a.IDLE || c.this.u == null || c.this.u.isEmpty()) {
                    return;
                }
                c.this.a(a.GENERATE_KEY_PAIR);
            }
        });
    }

    public void b() {
        this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.4
            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a("connectionEstablished - in state " + c.this.p);
                c.this.f5234c = 0;
                c.this.f5235d = 0;
                c.this.f = 0;
                c.this.e = 0;
                c.this.g = 0;
                c.this.A = true;
                c.this.a(a.CONNECTION_ESTABLISHED);
            }
        });
    }

    public void a(com.teslamotors.plugins.ble.a.c cVar, final boolean z) {
        this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.5
            @Override // java.lang.Runnable
            public void run() {
                c cVar2 = c.this;
                cVar2.a("connectionLost - in state " + c.this.p);
                if (!z) {
                    c.this.a("connectionLost non-command peripheral");
                    return;
                }
                c.this.A = false;
                c.this.h.removeCallbacks(c.this.F);
                c.this.a(a.CONNECT_TO_COMMAND_PERIPHERAL);
            }
        });
    }

    public void a(final com.teslamotors.plugins.ble.a.c cVar) {
        this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.6
            @Override // java.lang.Runnable
            public void run() {
                c.this.a(String.format("Found peripheral %s - in state %s", cVar, c.this.p));
                if (c.this.D.i() || c.this.p == a.WAITING_FOR_COMMAND_PERIPHERAL || c.this.p == a.CONNECT_TO_COMMAND_PERIPHERAL) {
                    c.this.D.n();
                    return;
                }
                c.this.a("mVehicleController does not have command peripheral... Connecting");
                c.this.a(a.CONNECT_TO_COMMAND_PERIPHERAL);
            }
        });
    }

    public void c() {
        this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.7
            @Override // java.lang.Runnable
            public void run() {
                c.this.r = false;
                c.this.s = false;
                c.this.t = false;
                c.this.y = 0;
                e.a(c.this.E).a(c.this.C, c.this.u, 0L);
                c.this.f5234c = 0;
                c.this.e = 0;
                c.this.f5235d = 0;
                c.this.f = 0;
                c.this.g = 0;
                c.this.f5232a = null;
                c.this.z = 0;
                c.this.x = null;
                c.this.a("Forgetting remote ephemeral and derived secret");
                c.this.a(a.IDLE);
            }
        });
    }

    public void a(final a.o oVar, final com.teslamotors.plugins.ble.a.c cVar) {
        this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.8
            @Override // java.lang.Runnable
            public void run() {
                final a.ab e = oVar.e();
                if (!e.e().c()) {
                    c.this.a(String.format("Received session info with public key: %s", "REDACTED"));
                    if (c.this.p == a.WAITING_FOR_PUB_KEY) {
                        c.this.v = e;
                        c.this.a(a.PARSE_PUB_KEY);
                    }
                }
                if (e.d() != 0 || c.this.p == a.WAITING_FOR_CRYPTO_COUNTER) {
                    c.this.e = 0;
                    final long j2 = c.this.w.get();
                    c.this.a(String.format("Received session info with counter. VCSEC: %d Phone: %d", Integer.valueOf(e.d()), Long.valueOf(j2)));
                    if (e.d() > j2) {
                        c.this.w.set(e.d());
                        e.a(c.this.E).a(c.this.w.get(), c.this.C, c.this.u);
                        if (!c.this.D.t()) {
                            e.a(c.this.E).a("[TMBLE Logic] IV inconsistent outside of pairing", (Integer) 100, (Map<String, Object>) new HashMap<String, Object>() { // from class: com.teslamotors.plugins.ble.c.c.8.1
                                {
                                    put("vcsec_iv", Integer.valueOf(e.d()));
                                    put("phone_iv", Long.valueOf(j2));
                                }
                            });
                            c.this.a(String.format("WARNING! VCSEC and phone IV were inconsistent outside of pairing. VCSEC: %d Phone: %d", Integer.valueOf(e.d()), Long.valueOf(j2)));
                        }
                    }
                    if (c.this.p == a.WAITING_FOR_CRYPTO_COUNTER) {
                        c.this.a(a.ALL_CRYPTO_COMPLETE);
                    }
                }
                a.aq d2 = oVar.d();
                if (d2 != d2.F()) {
                    c.this.f = 0;
                    c.this.a(String.format("Received vehicle status: %s", com.teslamotors.plugins.ble.a.d.b(d2)));
                    if (c.this.p == a.WAITING_FOR_STATUS) {
                        if (c.this.x == null) {
                            c.this.b(a.s.INFORMATION_REQUEST_TYPE_GET_CAPABILITIES);
                        }
                        c.this.a(a.CONNECTED_IDLE);
                    }
                }
                if (oVar.k() != a.f.h()) {
                    c.this.x = oVar.k();
                    c.this.a(String.format("Received capabilities: CP Open: %s, CP Close: %s", Boolean.valueOf(c.this.x.c()), Boolean.valueOf(c.this.x.d())));
                }
                a.k g = oVar.g();
                if (g.F() != g) {
                    if (g.f() == a.ah.i()) {
                        c.this.a(String.format("Command Status: %s", g.e().name()));
                    } else {
                        a.ag e2 = g.f().e();
                        int c2 = g.f().c();
                        c.this.D.a(c2, com.teslamotors.plugins.ble.b.b.a(g.e()), com.teslamotors.plugins.ble.b.b.a(e2), cVar);
                        c.this.a(String.format("Command Status: %s, Counter: %s, Message Information: %s", g.e().name(), Integer.valueOf(c2), e2.name()));
                        if (g.e() == a.v.OPERATIONSTATUS_ERROR) {
                            if (e2 == a.ag.SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST) {
                                c.this.b(a.s.INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO);
                            } else {
                                c.this.b(a.s.INFORMATION_REQUEST_TYPE_GET_COUNTER);
                            }
                        }
                    }
                }
                a.au h = oVar.h();
                if (h != h.F()) {
                    boolean z = c.this.t;
                    c.this.t = false;
                    c.this.y = h.c();
                    c.this.f5235d = 0;
                    c.this.a(String.format("Received whitelist message with %s entries", Integer.valueOf(c.this.y)));
                    for (int i2 = 0; i2 < c.this.y; i2++) {
                        a.t a2 = h.a(i2);
                        if (!a2.c().c()) {
                            byte[] d3 = a2.c().d();
                            if (Arrays.equals(d3, c.this.f5233b)) {
                                c.this.t = true;
                            }
                            c.this.a(String.format("Whitelist Entry %s", g.a(Arrays.copyOf(d3, 4))));
                        }
                    }
                    if (!z || !c.this.t) {
                        if (c.this.t) {
                            c.this.a(String.format("Found [%s] in whitelist! -> GET_PERMISSION", g.a(c.this.f5233b)));
                            c.this.a(a.GET_PERMISSION);
                        } else {
                            c.this.z = 0;
                            c.this.a(String.format("Did NOT find key [%s] in whitelist -> IDLE", g.a(c.this.f5233b)));
                            c.this.a(a.IDLE);
                            if (c.this.D.t()) {
                                c.this.a("Staying connected while unauthorized");
                            } else {
                                c.this.h.post(new Runnable() { // from class: com.teslamotors.plugins.ble.c.c.8.2
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        c.this.D.m();
                                    }
                                });
                            }
                        }
                    }
                    e.a(c.this.E).a(c.this.C, c.this.u, c.this.t ? c.this.y : 0L);
                    c.this.s();
                }
                a.as i3 = oVar.i();
                if (i3 != i3.F()) {
                    int size = i3.g().size();
                    if (size == 0 || !i3.c()) {
                        c.this.a(String.format("WARNING. Whitelist Entry Information Empty. %o permissions, isKeyIDPresent: %b", Integer.valueOf(size), Boolean.valueOf(i3.c())));
                    } else {
                        c.this.a(String.format("Whitelist Entry Information. %o permissions found for key [%s]", Integer.valueOf(size), g.a(Arrays.copyOf(i3.d().c().d(), 4))));
                        c.this.z = 0;
                        for (int i4 = 0; i4 < size; i4++) {
                            c.this.a(String.format("Permission %o: %s", Integer.valueOf(i4), i3.a(i4).name()));
                            c.this.z |= 1 << i3.a(i4).a();
                        }
                    }
                    c.this.g = 0;
                    c.this.a("Received permissions! -> SYNC_CRYPTO_COUNTER");
                    c.this.a(a.SYNC_CRYPTO_COUNTER);
                }
            }
        });
    }

    public com.teslamotors.plugins.ble.a.a a(a.EnumC0091a enumC0091a) {
        a.al t = a.al.i().a(a.d.e().a(enumC0091a).t()).t();
        if (i.contains(this.p)) {
            return a(t);
        }
        a(String.format("Skipped authentication response due to wrong state: %s", this.p.name()));
        return null;
    }

    public com.teslamotors.plugins.ble.a.a a(a.aa aaVar) {
        a.al t = a.al.i().a(aaVar).t();
        if (i.contains(this.p)) {
            return a(t);
        }
        a(String.format("Rejected command due to wrong state: %s", this.p.name()));
        return null;
    }

    private com.teslamotors.plugins.ble.a.a a(a.al alVar) {
        long q = q();
        byte[] a2 = d.a(alVar.toByteArray(), this.f5232a, q);
        if (a2 == null) {
            a("Encrypted command is null!");
            return null;
        }
        a(String.format("Signed message - (%s) %s %s", Integer.valueOf(a2.length - 16), g.a(this.f5233b), Long.valueOf(q)));
        return new com.teslamotors.plugins.ble.a.a(q, a(a(a.ad.SIGNATURE_TYPE_AES_GCM, Arrays.copyOf(a2, a2.length - 16), Arrays.copyOfRange(a2, a2.length - 16, a2.length), q, this.f5233b)));
    }

    private a.ae a(a.ad adVar, byte[] bArr, byte[] bArr2, long j2, byte[] bArr3) {
        a.ae.C0093a C = a.ae.l().C();
        if (adVar == a.ad.SIGNATURE_TYPE_AES_GCM && bArr3 != null && bArr2 != null) {
            C.a((int) j2).b(com.google.protobuf.f.a(bArr3)).d(com.google.protobuf.f.a(bArr2));
        }
        C.a(adVar);
        C.c(com.google.protobuf.f.a(bArr));
        return C.t();
    }

    private a.aj a(a.ae aeVar) {
        if (aeVar == null) {
            return null;
        }
        return a.aj.g().a(aeVar).t();
    }

    public a.aj d() {
        return a(a(true, d.b(this.m)));
    }

    public a.aj e() {
        return a(a(false, d.b(this.m)));
    }

    private a.ae a(boolean z, byte[] bArr) {
        if (!j.contains(this.p)) {
            a(String.format("Rejected whitelist operation due to wrong state %s", this.p));
            return null;
        } else if (this.q && bArr != null) {
            a.y t = a.y.g().C().a(com.google.protobuf.f.a(bArr)).t();
            a.ax.C0101a C = a.ax.l().C();
            if (z) {
                a.w.C0111a C2 = a.w.k().C();
                C2.a(a.aw.WHITELISTKEYPERMISSION_LOCAL_UNLOCK);
                C2.a(a.aw.WHITELISTKEYPERMISSION_LOCAL_DRIVE);
                C2.a(a.aw.WHITELISTKEYPERMISSION_REMOTE_UNLOCK);
                C2.a(a.aw.WHITELISTKEYPERMISSION_REMOTE_DRIVE);
                C2.a(t);
                C.a(C2);
            } else {
                C.b(t);
            }
            return a(a.ad.SIGNATURE_TYPE_PRESENT_KEY, a.al.i().a(C).t().toByteArray(), null, q(), this.f5233b);
        } else {
            a("Rejected whitelist operation due to keys not generated");
            return null;
        }
    }

    public boolean f() {
        return this.f5232a != null;
    }

    public int g() {
        return this.y;
    }

    public boolean h() {
        return this.t;
    }

    public boolean i() {
        return this.q;
    }

    public boolean j() {
        return this.r;
    }

    public long k() {
        return this.w.get();
    }

    public int l() {
        return this.z;
    }

    public a.f m() {
        return this.x;
    }

    public a.aj a(a.s sVar) {
        return a(sVar, this.f5233b);
    }

    public a.aj a(a.s sVar, byte[] bArr) {
        a.q.C0109a a2 = a.q.g().a(sVar);
        if (this.f5233b != null && (sVar == a.s.INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO || sVar == a.s.INFORMATION_REQUEST_TYPE_GET_TOKEN || sVar == a.s.INFORMATION_REQUEST_TYPE_GET_COUNTER || sVar == a.s.INFORMATION_REQUEST_TYPE_GET_SESSION_DATA)) {
            a2.a(a.t.g().C().a(com.google.protobuf.f.a(bArr)).t());
        }
        return a.aj.g().a(a.al.i().a(a2.t()).t()).t();
    }

    public String n() {
        if (this.f5233b == null || this.f5233b.length == 0) {
            return null;
        }
        return g.a(this.f5233b);
    }

    public byte[] o() {
        if (this.m == null) {
            return null;
        }
        return d.b(this.m);
    }
}
