package com.teslamotors.a;

import com.google.protobuf.j;
import com.google.protobuf.s;
import com.google.protobuf.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: VCSEC.java */
/* loaded from: classes.dex */
public final class a {
    private static final j.a A;
    private static final s.f B;
    private static final j.a C;
    private static final s.f D;
    private static final j.a E;
    private static final s.f F;
    private static final j.a G;
    private static final s.f H;
    private static final j.a I;
    private static final s.f J;
    private static final j.a K;
    private static final s.f L;
    private static final j.a M;
    private static final s.f N;
    private static final j.a O;
    private static final s.f P;
    private static final j.a Q;
    private static final s.f R;
    private static j.g S;

    /* renamed from: a  reason: collision with root package name */
    private static final j.a f4958a;

    /* renamed from: b  reason: collision with root package name */
    private static final s.f f4959b;

    /* renamed from: c  reason: collision with root package name */
    private static final j.a f4960c;

    /* renamed from: d  reason: collision with root package name */
    private static final s.f f4961d;
    private static final j.a e;
    private static final s.f f;
    private static final j.a g;
    private static final s.f h;
    private static final j.a i;
    private static final s.f j;
    private static final j.a k;
    private static final s.f l;
    private static final j.a m;
    private static final s.f n;
    private static final j.a o;
    private static final s.f p;
    private static final j.a q;
    private static final s.f r;
    private static final j.a s;
    private static final s.f t;
    private static final j.a u;
    private static final s.f v;
    private static final j.a w;
    private static final s.f x;
    private static final j.a y;
    private static final s.f z;

    /* loaded from: classes.dex */
    public interface ac extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface af extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface ai extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface ak extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface am extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface ao extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface ar extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface at extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface av extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface ay extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface c extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface e extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface g extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface j extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface l extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface n extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface p extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface r extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface u extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface x extends com.google.protobuf.af {
    }

    /* loaded from: classes.dex */
    public interface z extends com.google.protobuf.af {
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum h implements com.google.protobuf.ak {
        CLOSURESTATE_CLOSED(0),
        CLOSURESTATE_OPEN(1),
        CLOSURESTATE_AJAR(2),
        CLOSURESTATE_UNKNOWN(3),
        UNRECOGNIZED(-1);
        
        private static final t.b<h> f = new t.b<h>() { // from class: com.teslamotors.a.a.h.1
        };
        private static final h[] g = values();
        private final int h;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.h;
        }

        @Deprecated
        public static h a(int i2) {
            return b(i2);
        }

        public static h b(int i2) {
            switch (i2) {
                case 0:
                    return CLOSURESTATE_CLOSED;
                case 1:
                    return CLOSURESTATE_OPEN;
                case 2:
                    return CLOSURESTATE_AJAR;
                case 3:
                    return CLOSURESTATE_UNKNOWN;
                default:
                    return null;
            }
        }

        h(int i2) {
            this.h = i2;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum ap implements com.google.protobuf.ak {
        VEHICLELOCKSTATE_UNLOCKED(0),
        VEHICLELOCKSTATE_LOCKED(1),
        VEHICLELOCKSTATE_INTERNAL_LOCKED(2),
        VEHICLELOCKSTATE_SELECTIVE_UNLOCKED(3),
        UNRECOGNIZED(-1);
        
        private static final t.b<ap> f = new t.b<ap>() { // from class: com.teslamotors.a.a.ap.1
        };
        private static final ap[] g = values();
        private final int h;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.h;
        }

        @Deprecated
        public static ap a(int i2) {
            return b(i2);
        }

        public static ap b(int i2) {
            switch (i2) {
                case 0:
                    return VEHICLELOCKSTATE_UNLOCKED;
                case 1:
                    return VEHICLELOCKSTATE_LOCKED;
                case 2:
                    return VEHICLELOCKSTATE_INTERNAL_LOCKED;
                case 3:
                    return VEHICLELOCKSTATE_SELECTIVE_UNLOCKED;
                default:
                    return null;
            }
        }

        ap(int i2) {
            this.h = i2;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum ad implements com.google.protobuf.ak {
        SIGNATURE_TYPE_AES_GCM(0),
        SIGNATURE_TYPE_ECDSA(1),
        SIGNATURE_TYPE_PRESENT_KEY(2),
        UNRECOGNIZED(-1);
        
        private static final t.b<ad> e = new t.b<ad>() { // from class: com.teslamotors.a.a.ad.1
        };
        private static final ad[] f = values();
        private final int g;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.g;
        }

        ad(int i) {
            this.g = i;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum s implements com.google.protobuf.ak {
        INFORMATION_REQUEST_TYPE_GET_STATUS(0),
        INFORMATION_REQUEST_TYPE_GET_TOKEN(1),
        INFORMATION_REQUEST_TYPE_GET_COUNTER(2),
        INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY(3),
        INFORMATION_REQUEST_TYPE_GET_SESSION_DATA(4),
        INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO(5),
        INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO(6),
        INFORMATION_REQUEST_TYPE_GET_VEHICLE_INFO(7),
        INFORMATION_REQUEST_TYPE_GET_CAPABILITIES(16),
        UNRECOGNIZED(-1);
        
        private static final t.b<s> k = new t.b<s>() { // from class: com.teslamotors.a.a.s.1
        };
        private static final s[] l = values();
        private final int m;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.m;
        }

        s(int i) {
            this.m = i;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum aa implements com.google.protobuf.ak {
        RKE_ACTION_UNLOCK(0),
        RKE_ACTION_LOCK(1),
        RKE_ACTION_OPEN_TRUNK(2),
        RKE_ACTION_OPEN_FRUNK(3),
        RKE_ACTION_OPEN_CHARGE_PORT(4),
        RKE_ACTION_CLOSE_CHARGE_PORT(5),
        RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE(6),
        UNRECOGNIZED(-1);
        
        private static final t.b<aa> i = new t.b<aa>() { // from class: com.teslamotors.a.a.aa.1
        };
        private static final aa[] j = values();
        private final int k;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.k;
        }

        aa(int i2) {
            this.k = i2;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum aw implements com.google.protobuf.ak {
        WHITELISTKEYPERMISSION_ADD_TO_WHITELIST(0),
        WHITELISTKEYPERMISSION_LOCAL_UNLOCK(1),
        WHITELISTKEYPERMISSION_LOCAL_DRIVE(2),
        WHITELISTKEYPERMISSION_REMOTE_UNLOCK(3),
        WHITELISTKEYPERMISSION_REMOTE_DRIVE(4),
        WHITELISTKEYPERMISSION_CHANGE_PERMISSIONS(5),
        WHITELISTKEYPERMISSION_REMOVE_FROM_WHITELIST(6),
        WHITELISTKEYPERMISSION_REMOVE_SELF_FROM_WHITELIST(7),
        WHITELISTKEYPERMISSION_UNKNOWN(31),
        UNRECOGNIZED(-1);
        
        private static final t.b<aw> k = new t.b<aw>() { // from class: com.teslamotors.a.a.aw.1
        };
        private static final aw[] l = values();
        private final int m;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.m;
        }

        @Deprecated
        public static aw a(int i) {
            return b(i);
        }

        public static aw b(int i) {
            if (i != 31) {
                switch (i) {
                    case 0:
                        return WHITELISTKEYPERMISSION_ADD_TO_WHITELIST;
                    case 1:
                        return WHITELISTKEYPERMISSION_LOCAL_UNLOCK;
                    case 2:
                        return WHITELISTKEYPERMISSION_LOCAL_DRIVE;
                    case 3:
                        return WHITELISTKEYPERMISSION_REMOTE_UNLOCK;
                    case 4:
                        return WHITELISTKEYPERMISSION_REMOTE_DRIVE;
                    case 5:
                        return WHITELISTKEYPERMISSION_CHANGE_PERMISSIONS;
                    case 6:
                        return WHITELISTKEYPERMISSION_REMOVE_FROM_WHITELIST;
                    case 7:
                        return WHITELISTKEYPERMISSION_REMOVE_SELF_FROM_WHITELIST;
                    default:
                        return null;
                }
            }
            return WHITELISTKEYPERMISSION_UNKNOWN;
        }

        aw(int i) {
            this.m = i;
        }
    }

    /* compiled from: VCSEC.java */
    /* renamed from: com.teslamotors.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0091a implements com.google.protobuf.ak {
        AUTHENTICATION_LEVEL_NONE(0),
        AUTHENTICATION_LEVEL_UNLOCK(1),
        AUTHENTICATION_LEVEL_DRIVE(2),
        UNRECOGNIZED(-1);
        
        private static final t.b<EnumC0091a> e = new t.b<EnumC0091a>() { // from class: com.teslamotors.a.a.a.1
        };
        private static final EnumC0091a[] f = values();
        private final int g;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.g;
        }

        @Deprecated
        public static EnumC0091a a(int i) {
            return b(i);
        }

        public static EnumC0091a b(int i) {
            switch (i) {
                case 0:
                    return AUTHENTICATION_LEVEL_NONE;
                case 1:
                    return AUTHENTICATION_LEVEL_UNLOCK;
                case 2:
                    return AUTHENTICATION_LEVEL_DRIVE;
                default:
                    return null;
            }
        }

        EnumC0091a(int i) {
            this.g = i;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum v implements com.google.protobuf.ak {
        OPERATIONSTATUS_OK(0),
        OPERATIONSTATUS_WAIT(1),
        OPERATIONSTATUS_ERROR(2),
        UNRECOGNIZED(-1);
        
        private static final t.b<v> e = new t.b<v>() { // from class: com.teslamotors.a.a.v.1
        };
        private static final v[] f = values();
        private final int g;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.g;
        }

        @Deprecated
        public static v a(int i) {
            return b(i);
        }

        public static v b(int i) {
            switch (i) {
                case 0:
                    return OPERATIONSTATUS_OK;
                case 1:
                    return OPERATIONSTATUS_WAIT;
                case 2:
                    return OPERATIONSTATUS_ERROR;
                default:
                    return null;
            }
        }

        v(int i) {
            this.g = i;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public enum ag implements com.google.protobuf.ak {
        SIGNEDMESSAGE_INFORMATION_NONE(0),
        SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN(1),
        SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST(2),
        SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED(3),
        SIGNEDMESSAGE_INFORMATION_FAULT_INVALID_TOKEN(4),
        SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID(5),
        SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH(6),
        SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT(7),
        SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE(8),
        SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START(9),
        SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT(10),
        UNRECOGNIZED(-1);
        
        private static final t.b<ag> m = new t.b<ag>() { // from class: com.teslamotors.a.a.ag.1
        };
        private static final ag[] n = values();
        private final int o;

        @Override // com.google.protobuf.t.a
        public final int a() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.o;
        }

        @Deprecated
        public static ag a(int i) {
            return b(i);
        }

        public static ag b(int i) {
            switch (i) {
                case 0:
                    return SIGNEDMESSAGE_INFORMATION_NONE;
                case 1:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN;
                case 2:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST;
                case 3:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED;
                case 4:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_INVALID_TOKEN;
                case 5:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID;
                case 6:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH;
                case 7:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT;
                case 8:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE;
                case 9:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START;
                case 10:
                    return SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT;
                default:
                    return null;
            }
        }

        ag(int i) {
            this.o = i;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class i extends com.google.protobuf.s implements j {
        private static final i k = new i();
        private static final com.google.protobuf.ai<i> l = new com.google.protobuf.c<i>() { // from class: com.teslamotors.a.a.i.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public i d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new i(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5072a;

        /* renamed from: d  reason: collision with root package name */
        private int f5073d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private byte j;

        private i(s.a<?> aVar) {
            super(aVar);
            this.j = (byte) -1;
        }

        private i() {
            this.j = (byte) -1;
            this.f5072a = 0;
            this.f5073d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private i(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.f5072a = gVar.n();
                                } else if (a2 == 16) {
                                    this.f5073d = gVar.n();
                                } else if (a2 == 24) {
                                    this.e = gVar.n();
                                } else if (a2 == 32) {
                                    this.f = gVar.n();
                                } else if (a2 == 40) {
                                    this.g = gVar.n();
                                } else if (a2 == 48) {
                                    this.h = gVar.n();
                                } else if (a2 != 56) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.i = gVar.n();
                                }
                            }
                            z = true;
                        } catch (IOException e) {
                            throw new com.google.protobuf.u(e).a(this);
                        }
                    } catch (com.google.protobuf.u e2) {
                        throw e2.a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.f4958a;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.f4959b.a(i.class, C0105a.class);
        }

        public int c() {
            return this.f5072a;
        }

        public h d() {
            h a2 = h.a(this.f5072a);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        public int e() {
            return this.f5073d;
        }

        public h f() {
            h a2 = h.a(this.f5073d);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        public int g() {
            return this.e;
        }

        public h h() {
            h a2 = h.a(this.e);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        public int i() {
            return this.f;
        }

        public h j() {
            h a2 = h.a(this.f);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        public int k() {
            return this.g;
        }

        public h l() {
            h a2 = h.a(this.g);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        public int m() {
            return this.h;
        }

        public h n() {
            h a2 = h.a(this.h);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        public int o() {
            return this.i;
        }

        public h p() {
            h a2 = h.a(this.i);
            return a2 == null ? h.UNRECOGNIZED : a2;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.j;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.j = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5072a != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(1, this.f5072a);
            }
            if (this.f5073d != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(2, this.f5073d);
            }
            if (this.e != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(3, this.e);
            }
            if (this.f != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(4, this.f);
            }
            if (this.g != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(5, this.g);
            }
            if (this.h != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(6, this.h);
            }
            if (this.i != h.CLOSURESTATE_CLOSED.a()) {
                hVar.e(7, this.i);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5072a != h.CLOSURESTATE_CLOSED.a()) {
                i2 = 0 + com.google.protobuf.h.i(1, this.f5072a);
            }
            if (this.f5073d != h.CLOSURESTATE_CLOSED.a()) {
                i2 += com.google.protobuf.h.i(2, this.f5073d);
            }
            if (this.e != h.CLOSURESTATE_CLOSED.a()) {
                i2 += com.google.protobuf.h.i(3, this.e);
            }
            if (this.f != h.CLOSURESTATE_CLOSED.a()) {
                i2 += com.google.protobuf.h.i(4, this.f);
            }
            if (this.g != h.CLOSURESTATE_CLOSED.a()) {
                i2 += com.google.protobuf.h.i(5, this.g);
            }
            if (this.h != h.CLOSURESTATE_CLOSED.a()) {
                i2 += com.google.protobuf.h.i(6, this.h);
            }
            if (this.i != h.CLOSURESTATE_CLOSED.a()) {
                i2 += com.google.protobuf.h.i(7, this.i);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof i)) {
                return super.equals(obj);
            }
            i iVar = (i) obj;
            return ((((((this.f5072a == iVar.f5072a) && this.f5073d == iVar.f5073d) && this.e == iVar.e) && this.f == iVar.f) && this.g == iVar.g) && this.h == iVar.h) && this.i == iVar.i;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((((((779 + a().hashCode()) * 37) + 1) * 53) + this.f5072a) * 37) + 2) * 53) + this.f5073d) * 37) + 3) * 53) + this.e) * 37) + 4) * 53) + this.f) * 37) + 5) * 53) + this.g) * 37) + 6) * 53) + this.h) * 37) + 7) * 53) + this.i) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: q */
        public C0105a C() {
            return r();
        }

        public static C0105a r() {
            return k.D();
        }

        public static C0105a a(i iVar) {
            return k.D().a(iVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: s */
        public C0105a D() {
            return this == k ? new C0105a() : new C0105a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0105a b(s.b bVar) {
            return new C0105a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$i$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0105a extends s.a<C0105a> implements j {

            /* renamed from: a  reason: collision with root package name */
            private int f5074a;

            /* renamed from: b  reason: collision with root package name */
            private int f5075b;

            /* renamed from: c  reason: collision with root package name */
            private int f5076c;

            /* renamed from: d  reason: collision with root package name */
            private int f5077d;
            private int e;
            private int f;
            private int g;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0105a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0105a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.f4959b.a(i.class, C0105a.class);
            }

            private C0105a() {
                this.f5074a = 0;
                this.f5075b = 0;
                this.f5076c = 0;
                this.f5077d = 0;
                this.e = 0;
                this.f = 0;
                this.g = 0;
                j();
            }

            private C0105a(s.b bVar) {
                super(bVar);
                this.f5074a = 0;
                this.f5075b = 0;
                this.f5076c = 0;
                this.f5077d = 0;
                this.e = 0;
                this.f = 0;
                this.g = 0;
                j();
            }

            private void j() {
                boolean unused = i.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.f4958a;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public i F() {
                return i.t();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public i t() {
                i r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public i r() {
                i iVar = new i(this);
                iVar.f5072a = this.f5074a;
                iVar.f5073d = this.f5075b;
                iVar.e = this.f5076c;
                iVar.f = this.f5077d;
                iVar.g = this.e;
                iVar.h = this.f;
                iVar.i = this.g;
                u();
                return iVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0105a q() {
                return (C0105a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0105a f(j.f fVar, Object obj) {
                return (C0105a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0105a e(j.f fVar, Object obj) {
                return (C0105a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0105a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof i) {
                    return a((i) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0105a a(i iVar) {
                if (iVar == i.t()) {
                    return this;
                }
                if (iVar.f5072a != 0) {
                    a(iVar.c());
                }
                if (iVar.f5073d != 0) {
                    b(iVar.e());
                }
                if (iVar.e != 0) {
                    c(iVar.g());
                }
                if (iVar.f != 0) {
                    d(iVar.i());
                }
                if (iVar.g != 0) {
                    e(iVar.k());
                }
                if (iVar.h != 0) {
                    h(iVar.m());
                }
                if (iVar.i != 0) {
                    i(iVar.o());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.i.C0105a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.i.x()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$i r3 = (com.teslamotors.a.a.i) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$i r4 = (com.teslamotors.a.a.i) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.i.C0105a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$i$a");
            }

            public C0105a a(int i) {
                this.f5074a = i;
                x();
                return this;
            }

            public C0105a b(int i) {
                this.f5075b = i;
                x();
                return this;
            }

            public C0105a c(int i) {
                this.f5076c = i;
                x();
                return this;
            }

            public C0105a d(int i) {
                this.f5077d = i;
                x();
                return this;
            }

            public C0105a e(int i) {
                this.e = i;
                x();
                return this;
            }

            public C0105a h(int i) {
                this.f = i;
                x();
                return this;
            }

            public C0105a i(int i) {
                this.g = i;
                x();
                return this;
            }
        }

        public static i t() {
            return k;
        }

        public static com.google.protobuf.ai<i> u() {
            return l;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<i> getParserForType() {
            return l;
        }

        @Override // com.google.protobuf.af
        /* renamed from: v */
        public i F() {
            return k;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class aq extends com.google.protobuf.s implements ar {
        private static final aq f = new aq();
        private static final com.google.protobuf.ai<aq> g = new com.google.protobuf.c<aq>() { // from class: com.teslamotors.a.a.aq.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public aq d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new aq(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private i f5024a;

        /* renamed from: d  reason: collision with root package name */
        private int f5025d;
        private byte e;

        private aq(s.a<?> aVar) {
            super(aVar);
            this.e = (byte) -1;
        }

        private aq() {
            this.e = (byte) -1;
            this.f5025d = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private aq(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 == 10) {
                                    i.C0105a D = this.f5024a != null ? this.f5024a.D() : null;
                                    this.f5024a = (i) gVar.a(i.u(), pVar);
                                    if (D != null) {
                                        D.a(this.f5024a);
                                        this.f5024a = D.r();
                                    }
                                } else if (a2 != 16) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.f5025d = gVar.n();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.f4960c;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.f4961d.a(aq.class, C0098a.class);
        }

        public boolean c() {
            return this.f5024a != null;
        }

        public i d() {
            return this.f5024a == null ? i.t() : this.f5024a;
        }

        public int e() {
            return this.f5025d;
        }

        public ap f() {
            ap a2 = ap.a(this.f5025d);
            return a2 == null ? ap.UNRECOGNIZED : a2;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5024a != null) {
                hVar.a(1, d());
            }
            if (this.f5025d != ap.VEHICLELOCKSTATE_UNLOCKED.a()) {
                hVar.e(2, this.f5025d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5024a != null) {
                i2 = 0 + com.google.protobuf.h.c(1, d());
            }
            if (this.f5025d != ap.VEHICLELOCKSTATE_UNLOCKED.a()) {
                i2 += com.google.protobuf.h.i(2, this.f5025d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof aq)) {
                return super.equals(obj);
            }
            aq aqVar = (aq) obj;
            boolean z = c() == aqVar.c();
            if (c()) {
                z = z && d().equals(aqVar.d());
            }
            return z && this.f5025d == aqVar.f5025d;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 2) * 53) + this.f5025d) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: g */
        public C0098a C() {
            return h();
        }

        public static C0098a h() {
            return f.D();
        }

        public static C0098a a(aq aqVar) {
            return f.D().a(aqVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: i */
        public C0098a D() {
            return this == f ? new C0098a() : new C0098a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0098a b(s.b bVar) {
            return new C0098a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$aq$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0098a extends s.a<C0098a> implements ar {

            /* renamed from: a  reason: collision with root package name */
            private i f5026a;

            /* renamed from: b  reason: collision with root package name */
            private com.google.protobuf.an<i, i.C0105a, j> f5027b;

            /* renamed from: c  reason: collision with root package name */
            private int f5028c;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0098a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0098a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.f4961d.a(aq.class, C0098a.class);
            }

            private C0098a() {
                this.f5026a = null;
                this.f5028c = 0;
                j();
            }

            private C0098a(s.b bVar) {
                super(bVar);
                this.f5026a = null;
                this.f5028c = 0;
                j();
            }

            private void j() {
                boolean unused = aq.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.f4960c;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public aq F() {
                return aq.j();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public aq t() {
                aq r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public aq r() {
                aq aqVar = new aq(this);
                if (this.f5027b == null) {
                    aqVar.f5024a = this.f5026a;
                } else {
                    aqVar.f5024a = this.f5027b.c();
                }
                aqVar.f5025d = this.f5028c;
                u();
                return aqVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0098a q() {
                return (C0098a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0098a f(j.f fVar, Object obj) {
                return (C0098a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0098a e(j.f fVar, Object obj) {
                return (C0098a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0098a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof aq) {
                    return a((aq) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0098a a(aq aqVar) {
                if (aqVar == aq.j()) {
                    return this;
                }
                if (aqVar.c()) {
                    a(aqVar.d());
                }
                if (aqVar.f5025d != 0) {
                    a(aqVar.e());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.aq.C0098a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.aq.n()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$aq r3 = (com.teslamotors.a.a.aq) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$aq r4 = (com.teslamotors.a.a.aq) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.aq.C0098a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$aq$a");
            }

            public C0098a a(i iVar) {
                if (this.f5027b == null) {
                    if (this.f5026a != null) {
                        this.f5026a = i.a(this.f5026a).a(iVar).r();
                    } else {
                        this.f5026a = iVar;
                    }
                    x();
                } else {
                    this.f5027b.b(iVar);
                }
                return this;
            }

            public C0098a a(int i) {
                this.f5028c = i;
                x();
                return this;
            }
        }

        public static aq j() {
            return f;
        }

        public static com.google.protobuf.ai<aq> k() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<aq> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: l */
        public aq F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class an extends com.google.protobuf.s implements ao {
        private static final an e = new an();
        private static final com.google.protobuf.ai<an> f = new com.google.protobuf.c<an>() { // from class: com.teslamotors.a.a.an.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public an d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new an(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private volatile Object f5017a;

        /* renamed from: d  reason: collision with root package name */
        private byte f5018d;

        private an(s.a<?> aVar) {
            super(aVar);
            this.f5018d = (byte) -1;
        }

        private an() {
            this.f5018d = (byte) -1;
            this.f5017a = "";
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private an(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 != 10) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.f5017a = gVar.k();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e2) {
                            throw e2.a(this);
                        }
                    } catch (IOException e3) {
                        throw new com.google.protobuf.u(e3).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.e;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.f.a(an.class, C0097a.class);
        }

        public String c() {
            Object obj = this.f5017a;
            if (obj instanceof String) {
                return (String) obj;
            }
            String e2 = ((com.google.protobuf.f) obj).e();
            this.f5017a = e2;
            return e2;
        }

        public com.google.protobuf.f d() {
            Object obj = this.f5017a;
            if (obj instanceof String) {
                com.google.protobuf.f a2 = com.google.protobuf.f.a((String) obj);
                this.f5017a = a2;
                return a2;
            }
            return (com.google.protobuf.f) obj;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f5018d;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f5018d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (!d().c()) {
                com.google.protobuf.s.a(hVar, 1, this.f5017a);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!d().c()) {
                i2 = 0 + com.google.protobuf.s.a(1, this.f5017a);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof an)) {
                return super.equals(obj);
            }
            return c().equals(((an) obj).c());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((779 + a().hashCode()) * 37) + 1) * 53) + c().hashCode()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: e */
        public C0097a C() {
            return f();
        }

        public static C0097a f() {
            return e.D();
        }

        public static C0097a a(an anVar) {
            return e.D().a(anVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: g */
        public C0097a D() {
            return this == e ? new C0097a() : new C0097a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0097a b(s.b bVar) {
            return new C0097a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$an$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0097a extends s.a<C0097a> implements ao {

            /* renamed from: a  reason: collision with root package name */
            private Object f5019a;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0097a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0097a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.f.a(an.class, C0097a.class);
            }

            private C0097a() {
                this.f5019a = "";
                j();
            }

            private C0097a(s.b bVar) {
                super(bVar);
                this.f5019a = "";
                j();
            }

            private void j() {
                boolean unused = an.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.e;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public an F() {
                return an.h();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public an t() {
                an r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public an r() {
                an anVar = new an(this);
                anVar.f5017a = this.f5019a;
                u();
                return anVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0097a q() {
                return (C0097a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0097a f(j.f fVar, Object obj) {
                return (C0097a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0097a e(j.f fVar, Object obj) {
                return (C0097a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0097a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof an) {
                    return a((an) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0097a a(an anVar) {
                if (anVar == an.h()) {
                    return this;
                }
                if (!anVar.c().isEmpty()) {
                    this.f5019a = anVar.f5017a;
                    x();
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.an.C0097a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.an.l()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$an r3 = (com.teslamotors.a.a.an) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$an r4 = (com.teslamotors.a.a.an) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.an.C0097a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$an$a");
            }
        }

        public static an h() {
            return e;
        }

        public static com.google.protobuf.ai<an> i() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<an> getParserForType() {
            return f;
        }

        @Override // com.google.protobuf.af
        /* renamed from: j */
        public an F() {
            return e;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class f extends com.google.protobuf.s implements g {
        private static final f f = new f();
        private static final com.google.protobuf.ai<f> g = new com.google.protobuf.c<f>() { // from class: com.teslamotors.a.a.f.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public f d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new f(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private boolean f5064a;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5065d;
        private byte e;

        private f(s.a<?> aVar) {
            super(aVar);
            this.e = (byte) -1;
        }

        private f() {
            this.e = (byte) -1;
            this.f5064a = false;
            this.f5065d = false;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private f(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.f5064a = gVar.i();
                            } else if (a2 != 16) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                this.f5065d = gVar.i();
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.g;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.h.a(f.class, C0104a.class);
        }

        public boolean c() {
            return this.f5064a;
        }

        public boolean d() {
            return this.f5065d;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5064a) {
                hVar.a(1, this.f5064a);
            }
            if (this.f5065d) {
                hVar.a(2, this.f5065d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5064a) {
                i2 = 0 + com.google.protobuf.h.b(1, this.f5064a);
            }
            if (this.f5065d) {
                i2 += com.google.protobuf.h.b(2, this.f5065d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f)) {
                return super.equals(obj);
            }
            f fVar = (f) obj;
            return (c() == fVar.c()) && d() == fVar.d();
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + a().hashCode()) * 37) + 1) * 53) + com.google.protobuf.t.a(c())) * 37) + 2) * 53) + com.google.protobuf.t.a(d())) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: e */
        public C0104a C() {
            return f();
        }

        public static C0104a f() {
            return f.D();
        }

        public static C0104a a(f fVar) {
            return f.D().a(fVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: g */
        public C0104a D() {
            return this == f ? new C0104a() : new C0104a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0104a b(s.b bVar) {
            return new C0104a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0104a extends s.a<C0104a> implements g {

            /* renamed from: a  reason: collision with root package name */
            private boolean f5066a;

            /* renamed from: b  reason: collision with root package name */
            private boolean f5067b;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0104a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0104a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.h.a(f.class, C0104a.class);
            }

            private C0104a() {
                j();
            }

            private C0104a(s.b bVar) {
                super(bVar);
                j();
            }

            private void j() {
                boolean unused = f.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.g;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public f F() {
                return f.h();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public f t() {
                f r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public f r() {
                f fVar = new f(this);
                fVar.f5064a = this.f5066a;
                fVar.f5065d = this.f5067b;
                u();
                return fVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0104a q() {
                return (C0104a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0104a f(j.f fVar, Object obj) {
                return (C0104a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0104a e(j.f fVar, Object obj) {
                return (C0104a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0104a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof f) {
                    return a((f) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0104a a(f fVar) {
                if (fVar == f.h()) {
                    return this;
                }
                if (fVar.c()) {
                    a(fVar.c());
                }
                if (fVar.d()) {
                    b(fVar.d());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.f.C0104a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.f.l()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$f r3 = (com.teslamotors.a.a.f) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$f r4 = (com.teslamotors.a.a.f) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.f.C0104a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$f$a");
            }

            public C0104a a(boolean z) {
                this.f5066a = z;
                x();
                return this;
            }

            public C0104a b(boolean z) {
                this.f5067b = z;
                x();
                return this;
            }
        }

        public static f h() {
            return f;
        }

        public static com.google.protobuf.ai<f> i() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<f> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: j */
        public f F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class t extends com.google.protobuf.s implements u {
        private static final t e = new t();
        private static final com.google.protobuf.ai<t> f = new com.google.protobuf.c<t>() { // from class: com.teslamotors.a.a.t.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public t d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new t(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private com.google.protobuf.f f5112a;

        /* renamed from: d  reason: collision with root package name */
        private byte f5113d;

        private t(s.a<?> aVar) {
            super(aVar);
            this.f5113d = (byte) -1;
        }

        private t() {
            this.f5113d = (byte) -1;
            this.f5112a = com.google.protobuf.f.f4423a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private t(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 != 10) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.f5112a = gVar.l();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e2) {
                            throw e2.a(this);
                        }
                    } catch (IOException e3) {
                        throw new com.google.protobuf.u(e3).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.i;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.j.a(t.class, C0110a.class);
        }

        public com.google.protobuf.f c() {
            return this.f5112a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f5113d;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f5113d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (!this.f5112a.c()) {
                hVar.a(1, this.f5112a);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f5112a.c()) {
                i2 = 0 + com.google.protobuf.h.c(1, this.f5112a);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof t)) {
                return super.equals(obj);
            }
            return c().equals(((t) obj).c());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((779 + a().hashCode()) * 37) + 1) * 53) + c().hashCode()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: d */
        public C0110a C() {
            return e();
        }

        public static C0110a e() {
            return e.D();
        }

        public static C0110a a(t tVar) {
            return e.D().a(tVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: f */
        public C0110a D() {
            return this == e ? new C0110a() : new C0110a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0110a b(s.b bVar) {
            return new C0110a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$t$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0110a extends s.a<C0110a> implements u {

            /* renamed from: a  reason: collision with root package name */
            private com.google.protobuf.f f5114a;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0110a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0110a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.j.a(t.class, C0110a.class);
            }

            private C0110a() {
                this.f5114a = com.google.protobuf.f.f4423a;
                j();
            }

            private C0110a(s.b bVar) {
                super(bVar);
                this.f5114a = com.google.protobuf.f.f4423a;
                j();
            }

            private void j() {
                boolean unused = t.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.i;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public t F() {
                return t.g();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public t t() {
                t r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public t r() {
                t tVar = new t(this);
                tVar.f5112a = this.f5114a;
                u();
                return tVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0110a q() {
                return (C0110a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0110a f(j.f fVar, Object obj) {
                return (C0110a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0110a e(j.f fVar, Object obj) {
                return (C0110a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0110a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof t) {
                    return a((t) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0110a a(t tVar) {
                if (tVar == t.g()) {
                    return this;
                }
                if (tVar.c() != com.google.protobuf.f.f4423a) {
                    a(tVar.c());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.t.C0110a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.t.k()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$t r3 = (com.teslamotors.a.a.t) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$t r4 = (com.teslamotors.a.a.t) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.t.C0110a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$t$a");
            }

            public C0110a a(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f5114a = fVar;
                x();
                return this;
            }
        }

        public static t g() {
            return e;
        }

        public static com.google.protobuf.ai<t> h() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<t> getParserForType() {
            return f;
        }

        @Override // com.google.protobuf.af
        /* renamed from: i */
        public t F() {
            return e;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class ae extends com.google.protobuf.s implements af {
        private static final ae j = new ae();
        private static final com.google.protobuf.ai<ae> k = new com.google.protobuf.c<ae>() { // from class: com.teslamotors.a.a.ae.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ae d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ae(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private com.google.protobuf.f f4983a;

        /* renamed from: d  reason: collision with root package name */
        private int f4984d;
        private com.google.protobuf.f e;
        private com.google.protobuf.f f;
        private int g;
        private com.google.protobuf.f h;
        private byte i;

        private ae(s.a<?> aVar) {
            super(aVar);
            this.i = (byte) -1;
        }

        private ae() {
            this.i = (byte) -1;
            this.f4983a = com.google.protobuf.f.f4423a;
            this.f4984d = 0;
            this.e = com.google.protobuf.f.f4423a;
            this.f = com.google.protobuf.f.f4423a;
            this.g = 0;
            this.h = com.google.protobuf.f.f4423a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private ae(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.f4983a = gVar.l();
                            } else if (a2 == 18) {
                                this.f = gVar.l();
                            } else if (a2 == 24) {
                                this.g = gVar.n();
                            } else if (a2 == 34) {
                                this.h = gVar.l();
                            } else if (a2 == 42) {
                                this.e = gVar.l();
                            } else if (a2 != 48) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                this.f4984d = gVar.m();
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.k;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.l.a(ae.class, C0093a.class);
        }

        public com.google.protobuf.f c() {
            return this.f4983a;
        }

        public int d() {
            return this.f4984d;
        }

        public com.google.protobuf.f e() {
            return this.e;
        }

        public com.google.protobuf.f f() {
            return this.f;
        }

        public int g() {
            return this.g;
        }

        public com.google.protobuf.f h() {
            return this.h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (!this.f4983a.c()) {
                hVar.a(1, this.f4983a);
            }
            if (!this.f.c()) {
                hVar.a(2, this.f);
            }
            if (this.g != ad.SIGNATURE_TYPE_AES_GCM.a()) {
                hVar.e(3, this.g);
            }
            if (!this.h.c()) {
                hVar.a(4, this.h);
            }
            if (!this.e.c()) {
                hVar.a(5, this.e);
            }
            if (this.f4984d != 0) {
                hVar.c(6, this.f4984d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f4983a.c()) {
                i2 = 0 + com.google.protobuf.h.c(1, this.f4983a);
            }
            if (!this.f.c()) {
                i2 += com.google.protobuf.h.c(2, this.f);
            }
            if (this.g != ad.SIGNATURE_TYPE_AES_GCM.a()) {
                i2 += com.google.protobuf.h.i(3, this.g);
            }
            if (!this.h.c()) {
                i2 += com.google.protobuf.h.c(4, this.h);
            }
            if (!this.e.c()) {
                i2 += com.google.protobuf.h.c(5, this.e);
            }
            if (this.f4984d != 0) {
                i2 += com.google.protobuf.h.g(6, this.f4984d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ae)) {
                return super.equals(obj);
            }
            ae aeVar = (ae) obj;
            return (((((c().equals(aeVar.c())) && d() == aeVar.d()) && e().equals(aeVar.e())) && f().equals(aeVar.f())) && this.g == aeVar.g) && h().equals(aeVar.h());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((((((((((((((779 + a().hashCode()) * 37) + 1) * 53) + c().hashCode()) * 37) + 6) * 53) + d()) * 37) + 5) * 53) + e().hashCode()) * 37) + 2) * 53) + f().hashCode()) * 37) + 3) * 53) + this.g) * 37) + 4) * 53) + h().hashCode()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public C0093a C() {
            return j();
        }

        public static C0093a j() {
            return j.D();
        }

        public static C0093a a(ae aeVar) {
            return j.D().a(aeVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public C0093a D() {
            return this == j ? new C0093a() : new C0093a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0093a b(s.b bVar) {
            return new C0093a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$ae$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0093a extends s.a<C0093a> implements af {

            /* renamed from: a  reason: collision with root package name */
            private com.google.protobuf.f f4985a;

            /* renamed from: b  reason: collision with root package name */
            private int f4986b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.f f4987c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.f f4988d;
            private int e;
            private com.google.protobuf.f f;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0093a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0093a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.l.a(ae.class, C0093a.class);
            }

            private C0093a() {
                this.f4985a = com.google.protobuf.f.f4423a;
                this.f4987c = com.google.protobuf.f.f4423a;
                this.f4988d = com.google.protobuf.f.f4423a;
                this.e = 0;
                this.f = com.google.protobuf.f.f4423a;
                j();
            }

            private C0093a(s.b bVar) {
                super(bVar);
                this.f4985a = com.google.protobuf.f.f4423a;
                this.f4987c = com.google.protobuf.f.f4423a;
                this.f4988d = com.google.protobuf.f.f4423a;
                this.e = 0;
                this.f = com.google.protobuf.f.f4423a;
                j();
            }

            private void j() {
                boolean unused = ae.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.k;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ae F() {
                return ae.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ae t() {
                ae r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ae r() {
                ae aeVar = new ae(this);
                aeVar.f4983a = this.f4985a;
                aeVar.f4984d = this.f4986b;
                aeVar.e = this.f4987c;
                aeVar.f = this.f4988d;
                aeVar.g = this.e;
                aeVar.h = this.f;
                u();
                return aeVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0093a q() {
                return (C0093a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0093a f(j.f fVar, Object obj) {
                return (C0093a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0093a e(j.f fVar, Object obj) {
                return (C0093a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0093a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ae) {
                    return a((ae) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0093a a(ae aeVar) {
                if (aeVar == ae.l()) {
                    return this;
                }
                if (aeVar.c() != com.google.protobuf.f.f4423a) {
                    a(aeVar.c());
                }
                if (aeVar.d() != 0) {
                    a(aeVar.d());
                }
                if (aeVar.e() != com.google.protobuf.f.f4423a) {
                    b(aeVar.e());
                }
                if (aeVar.f() != com.google.protobuf.f.f4423a) {
                    c(aeVar.f());
                }
                if (aeVar.g != 0) {
                    b(aeVar.g());
                }
                if (aeVar.h() != com.google.protobuf.f.f4423a) {
                    d(aeVar.h());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.ae.C0093a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.ae.p()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$ae r3 = (com.teslamotors.a.a.ae) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$ae r4 = (com.teslamotors.a.a.ae) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.ae.C0093a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$ae$a");
            }

            public C0093a a(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f4985a = fVar;
                x();
                return this;
            }

            public C0093a a(int i) {
                this.f4986b = i;
                x();
                return this;
            }

            public C0093a b(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f4987c = fVar;
                x();
                return this;
            }

            public C0093a c(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f4988d = fVar;
                x();
                return this;
            }

            public C0093a b(int i) {
                this.e = i;
                x();
                return this;
            }

            public C0093a a(ad adVar) {
                if (adVar == null) {
                    throw new NullPointerException();
                }
                this.e = adVar.a();
                x();
                return this;
            }

            public C0093a d(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f = fVar;
                x();
                return this;
            }
        }

        public static ae l() {
            return j;
        }

        public static com.google.protobuf.ai<ae> m() {
            return k;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ae> getParserForType() {
            return k;
        }

        @Override // com.google.protobuf.af
        /* renamed from: n */
        public ae F() {
            return j;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class y extends com.google.protobuf.s implements z {
        private static final y e = new y();
        private static final com.google.protobuf.ai<y> f = new com.google.protobuf.c<y>() { // from class: com.teslamotors.a.a.y.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public y d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new y(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private com.google.protobuf.f f5125a;

        /* renamed from: d  reason: collision with root package name */
        private byte f5126d;

        private y(s.a<?> aVar) {
            super(aVar);
            this.f5126d = (byte) -1;
        }

        private y() {
            this.f5126d = (byte) -1;
            this.f5125a = com.google.protobuf.f.f4423a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private y(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 != 10) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.f5125a = gVar.l();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e2) {
                            throw e2.a(this);
                        }
                    } catch (IOException e3) {
                        throw new com.google.protobuf.u(e3).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.m;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.n.a(y.class, C0112a.class);
        }

        public com.google.protobuf.f c() {
            return this.f5125a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f5126d;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f5126d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (!this.f5125a.c()) {
                hVar.a(1, this.f5125a);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f5125a.c()) {
                i2 = 0 + com.google.protobuf.h.c(1, this.f5125a);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return super.equals(obj);
            }
            return c().equals(((y) obj).c());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((779 + a().hashCode()) * 37) + 1) * 53) + c().hashCode()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: d */
        public C0112a C() {
            return e();
        }

        public static C0112a e() {
            return e.D();
        }

        public static C0112a a(y yVar) {
            return e.D().a(yVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: f */
        public C0112a D() {
            return this == e ? new C0112a() : new C0112a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0112a b(s.b bVar) {
            return new C0112a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$y$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0112a extends s.a<C0112a> implements z {

            /* renamed from: a  reason: collision with root package name */
            private com.google.protobuf.f f5127a;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0112a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0112a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.n.a(y.class, C0112a.class);
            }

            private C0112a() {
                this.f5127a = com.google.protobuf.f.f4423a;
                j();
            }

            private C0112a(s.b bVar) {
                super(bVar);
                this.f5127a = com.google.protobuf.f.f4423a;
                j();
            }

            private void j() {
                boolean unused = y.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.m;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public y F() {
                return y.g();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public y t() {
                y r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public y r() {
                y yVar = new y(this);
                yVar.f5125a = this.f5127a;
                u();
                return yVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0112a q() {
                return (C0112a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0112a f(j.f fVar, Object obj) {
                return (C0112a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0112a e(j.f fVar, Object obj) {
                return (C0112a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0112a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof y) {
                    return a((y) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0112a a(y yVar) {
                if (yVar == y.g()) {
                    return this;
                }
                if (yVar.c() != com.google.protobuf.f.f4423a) {
                    a(yVar.c());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.y.C0112a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.y.k()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$y r3 = (com.teslamotors.a.a.y) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$y r4 = (com.teslamotors.a.a.y) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.y.C0112a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$y$a");
            }

            public C0112a a(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f5127a = fVar;
                x();
                return this;
            }
        }

        public static y g() {
            return e;
        }

        public static com.google.protobuf.ai<y> h() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<y> getParserForType() {
            return f;
        }

        @Override // com.google.protobuf.af
        /* renamed from: i */
        public y F() {
            return e;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class au extends com.google.protobuf.s implements av {
        private static final au g = new au();
        private static final com.google.protobuf.ai<au> h = new com.google.protobuf.c<au>() { // from class: com.teslamotors.a.a.au.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public au d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new au(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5035a;

        /* renamed from: d  reason: collision with root package name */
        private int f5036d;
        private List<t> e;
        private byte f;

        private au(s.a<?> aVar) {
            super(aVar);
            this.f = (byte) -1;
        }

        private au() {
            this.f = (byte) -1;
            this.f5036d = 0;
            this.e = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private au(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.f5036d = gVar.m();
                                } else if (a2 != 18) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    if (!(z2 & true)) {
                                        this.e = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.e.add(gVar.a(t.h(), pVar));
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.o;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.p.a(au.class, C0100a.class);
        }

        public int c() {
            return this.f5036d;
        }

        public List<t> d() {
            return this.e;
        }

        public int e() {
            return this.e.size();
        }

        public t a(int i) {
            return this.e.get(i);
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5036d != 0) {
                hVar.c(1, this.f5036d);
            }
            for (int i = 0; i < this.e.size(); i++) {
                hVar.a(2, this.e.get(i));
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int g2 = this.f5036d != 0 ? com.google.protobuf.h.g(1, this.f5036d) + 0 : 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                g2 += com.google.protobuf.h.c(2, this.e.get(i2));
            }
            this.memoizedSize = g2;
            return g2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof au)) {
                return super.equals(obj);
            }
            au auVar = (au) obj;
            return (c() == auVar.c()) && d().equals(auVar.d());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + a().hashCode()) * 37) + 1) * 53) + c();
            if (e() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + d().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: f */
        public C0100a C() {
            return g();
        }

        public static C0100a g() {
            return g.D();
        }

        public static C0100a a(au auVar) {
            return g.D().a(auVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: h */
        public C0100a D() {
            return this == g ? new C0100a() : new C0100a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0100a b(s.b bVar) {
            return new C0100a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$au$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0100a extends s.a<C0100a> implements av {

            /* renamed from: a  reason: collision with root package name */
            private int f5037a;

            /* renamed from: b  reason: collision with root package name */
            private int f5038b;

            /* renamed from: c  reason: collision with root package name */
            private List<t> f5039c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.am<t, t.C0110a, u> f5040d;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0100a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0100a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.p.a(au.class, C0100a.class);
            }

            private C0100a() {
                this.f5039c = Collections.emptyList();
                j();
            }

            private C0100a(s.b bVar) {
                super(bVar);
                this.f5039c = Collections.emptyList();
                j();
            }

            private void j() {
                if (au.f4719b) {
                    l();
                }
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.o;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public au F() {
                return au.i();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public au t() {
                au r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public au r() {
                au auVar = new au(this);
                int i = this.f5037a;
                auVar.f5036d = this.f5038b;
                if (this.f5040d != null) {
                    auVar.e = this.f5040d.e();
                } else {
                    if ((this.f5037a & 2) == 2) {
                        this.f5039c = Collections.unmodifiableList(this.f5039c);
                        this.f5037a &= -3;
                    }
                    auVar.e = this.f5039c;
                }
                auVar.f5035a = 0;
                u();
                return auVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0100a q() {
                return (C0100a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0100a f(j.f fVar, Object obj) {
                return (C0100a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0100a e(j.f fVar, Object obj) {
                return (C0100a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0100a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof au) {
                    return a((au) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0100a a(au auVar) {
                if (auVar == au.i()) {
                    return this;
                }
                if (auVar.c() != 0) {
                    a(auVar.c());
                }
                if (this.f5040d == null) {
                    if (!auVar.e.isEmpty()) {
                        if (this.f5039c.isEmpty()) {
                            this.f5039c = auVar.e;
                            this.f5037a &= -3;
                        } else {
                            k();
                            this.f5039c.addAll(auVar.e);
                        }
                        x();
                    }
                } else if (!auVar.e.isEmpty()) {
                    if (!this.f5040d.d()) {
                        this.f5040d.a(auVar.e);
                    } else {
                        this.f5040d.b();
                        com.google.protobuf.am<t, t.C0110a, u> amVar = null;
                        this.f5040d = null;
                        this.f5039c = auVar.e;
                        this.f5037a &= -3;
                        if (au.f4719b) {
                            amVar = l();
                        }
                        this.f5040d = amVar;
                    }
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.au.C0100a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.au.n()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$au r3 = (com.teslamotors.a.a.au) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$au r4 = (com.teslamotors.a.a.au) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.au.C0100a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$au$a");
            }

            public C0100a a(int i) {
                this.f5038b = i;
                x();
                return this;
            }

            private void k() {
                if ((this.f5037a & 2) != 2) {
                    this.f5039c = new ArrayList(this.f5039c);
                    this.f5037a |= 2;
                }
            }

            private com.google.protobuf.am<t, t.C0110a, u> l() {
                if (this.f5040d == null) {
                    this.f5040d = new com.google.protobuf.am<>(this.f5039c, (this.f5037a & 2) == 2, w(), v());
                    this.f5039c = null;
                }
                return this.f5040d;
            }
        }

        public static au i() {
            return g;
        }

        public static com.google.protobuf.ai<au> j() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<au> getParserForType() {
            return h;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public au F() {
            return g;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class as extends com.google.protobuf.s implements at {
        private static final t.c.a<Integer, aw> g = new t.c.a<Integer, aw>() { // from class: com.teslamotors.a.a.as.1
            @Override // com.google.protobuf.t.c.a
            public aw a(Integer num) {
                aw a2 = aw.a(num.intValue());
                return a2 == null ? aw.UNRECOGNIZED : a2;
            }
        };
        private static final as j = new as();
        private static final com.google.protobuf.ai<as> k = new com.google.protobuf.c<as>() { // from class: com.teslamotors.a.a.as.2
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public as d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new as(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5029a;

        /* renamed from: d  reason: collision with root package name */
        private t f5030d;
        private y e;
        private List<Integer> f;
        private int h;
        private byte i;

        private as(s.a<?> aVar) {
            super(aVar);
            this.i = (byte) -1;
        }

        private as() {
            this.i = (byte) -1;
            this.f = Collections.emptyList();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private as(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            y.C0112a c0112a = null;
                            t.C0110a D = null;
                            if (a2 == 10) {
                                D = this.f5030d != null ? this.f5030d.D() : D;
                                this.f5030d = (t) gVar.a(t.h(), pVar);
                                if (D != null) {
                                    D.a(this.f5030d);
                                    this.f5030d = D.r();
                                }
                            } else if (a2 == 18) {
                                c0112a = this.e != null ? this.e.D() : c0112a;
                                this.e = (y) gVar.a(y.h(), pVar);
                                if (c0112a != null) {
                                    c0112a.a(this.e);
                                    this.e = c0112a.r();
                                }
                            } else if (a2 == 24) {
                                int n = gVar.n();
                                if (!(z2 & true)) {
                                    this.f = new ArrayList();
                                    z2 |= true;
                                }
                                this.f.add(Integer.valueOf(n));
                            } else if (a2 != 26) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                int c2 = gVar.c(gVar.s());
                                while (gVar.u() > 0) {
                                    int n2 = gVar.n();
                                    if (!(z2 & true)) {
                                        this.f = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.f.add(Integer.valueOf(n2));
                                }
                                gVar.d(c2);
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.f = Collections.unmodifiableList(this.f);
                    }
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.q;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.r.a(as.class, C0099a.class);
        }

        public boolean c() {
            return this.f5030d != null;
        }

        public t d() {
            return this.f5030d == null ? t.g() : this.f5030d;
        }

        public boolean e() {
            return this.e != null;
        }

        public y f() {
            return this.e == null ? y.g() : this.e;
        }

        public List<aw> g() {
            return new t.c(this.f, g);
        }

        public int h() {
            return this.f.size();
        }

        public aw a(int i) {
            return g.a(this.f.get(i));
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            getSerializedSize();
            if (this.f5030d != null) {
                hVar.a(1, d());
            }
            if (this.e != null) {
                hVar.a(2, f());
            }
            if (g().size() > 0) {
                hVar.c(26);
                hVar.c(this.h);
            }
            for (int i = 0; i < this.f.size(); i++) {
                hVar.g(this.f.get(i).intValue());
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int c2 = this.f5030d != null ? com.google.protobuf.h.c(1, d()) + 0 : 0;
            if (this.e != null) {
                c2 += com.google.protobuf.h.c(2, f());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                i2 += com.google.protobuf.h.n(this.f.get(i3).intValue());
            }
            int i4 = c2 + i2;
            if (!g().isEmpty()) {
                i4 = i4 + 1 + com.google.protobuf.h.j(i2);
            }
            this.h = i2;
            this.memoizedSize = i4;
            return i4;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof as)) {
                return super.equals(obj);
            }
            as asVar = (as) obj;
            boolean z = c() == asVar.c();
            if (c()) {
                z = z && d().equals(asVar.d());
            }
            boolean z2 = z && e() == asVar.e();
            if (e()) {
                z2 = z2 && f().equals(asVar.f());
            }
            return z2 && this.f.equals(asVar.f);
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
            }
            if (h() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + this.f.hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public C0099a C() {
            return j();
        }

        public static C0099a j() {
            return j.D();
        }

        public static C0099a a(as asVar) {
            return j.D().a(asVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public C0099a D() {
            return this == j ? new C0099a() : new C0099a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0099a b(s.b bVar) {
            return new C0099a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$as$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0099a extends s.a<C0099a> implements at {

            /* renamed from: a  reason: collision with root package name */
            private int f5031a;

            /* renamed from: b  reason: collision with root package name */
            private t f5032b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<t, t.C0110a, u> f5033c;

            /* renamed from: d  reason: collision with root package name */
            private y f5034d;
            private com.google.protobuf.an<y, y.C0112a, z> e;
            private List<Integer> f;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0099a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0099a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.r.a(as.class, C0099a.class);
            }

            private C0099a() {
                this.f5032b = null;
                this.f5034d = null;
                this.f = Collections.emptyList();
                j();
            }

            private C0099a(s.b bVar) {
                super(bVar);
                this.f5032b = null;
                this.f5034d = null;
                this.f = Collections.emptyList();
                j();
            }

            private void j() {
                boolean unused = as.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.q;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public as F() {
                return as.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public as t() {
                as r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public as r() {
                as asVar = new as(this);
                int i = this.f5031a;
                if (this.f5033c == null) {
                    asVar.f5030d = this.f5032b;
                } else {
                    asVar.f5030d = this.f5033c.c();
                }
                if (this.e == null) {
                    asVar.e = this.f5034d;
                } else {
                    asVar.e = this.e.c();
                }
                if ((this.f5031a & 4) == 4) {
                    this.f = Collections.unmodifiableList(this.f);
                    this.f5031a &= -5;
                }
                asVar.f = this.f;
                asVar.f5029a = 0;
                u();
                return asVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0099a q() {
                return (C0099a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0099a f(j.f fVar, Object obj) {
                return (C0099a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0099a e(j.f fVar, Object obj) {
                return (C0099a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0099a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof as) {
                    return a((as) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0099a a(as asVar) {
                if (asVar == as.l()) {
                    return this;
                }
                if (asVar.c()) {
                    a(asVar.d());
                }
                if (asVar.e()) {
                    a(asVar.f());
                }
                if (!asVar.f.isEmpty()) {
                    if (this.f.isEmpty()) {
                        this.f = asVar.f;
                        this.f5031a &= -5;
                    } else {
                        k();
                        this.f.addAll(asVar.f);
                    }
                    x();
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.as.C0099a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.as.p()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$as r3 = (com.teslamotors.a.a.as) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$as r4 = (com.teslamotors.a.a.as) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.as.C0099a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$as$a");
            }

            public C0099a a(t tVar) {
                if (this.f5033c == null) {
                    if (this.f5032b != null) {
                        this.f5032b = t.a(this.f5032b).a(tVar).r();
                    } else {
                        this.f5032b = tVar;
                    }
                    x();
                } else {
                    this.f5033c.b(tVar);
                }
                return this;
            }

            public C0099a a(y yVar) {
                if (this.e == null) {
                    if (this.f5034d != null) {
                        this.f5034d = y.a(this.f5034d).a(yVar).r();
                    } else {
                        this.f5034d = yVar;
                    }
                    x();
                } else {
                    this.e.b(yVar);
                }
                return this;
            }

            private void k() {
                if ((this.f5031a & 4) != 4) {
                    this.f = new ArrayList(this.f);
                    this.f5031a |= 4;
                }
            }
        }

        public static as l() {
            return j;
        }

        public static com.google.protobuf.ai<as> m() {
            return k;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<as> getParserForType() {
            return k;
        }

        @Override // com.google.protobuf.af
        /* renamed from: n */
        public as F() {
            return j;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class q extends com.google.protobuf.s implements r {
        private static final q f = new q();
        private static final com.google.protobuf.ai<q> g = new com.google.protobuf.c<q>() { // from class: com.teslamotors.a.a.q.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public q d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new q(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5103a;

        /* renamed from: d  reason: collision with root package name */
        private t f5104d;
        private byte e;

        private q(s.a<?> aVar) {
            super(aVar);
            this.e = (byte) -1;
        }

        private q() {
            this.e = (byte) -1;
            this.f5103a = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private q(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.f5103a = gVar.n();
                                } else if (a2 != 18) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    t.C0110a D = this.f5104d != null ? this.f5104d.D() : null;
                                    this.f5104d = (t) gVar.a(t.h(), pVar);
                                    if (D != null) {
                                        D.a(this.f5104d);
                                        this.f5104d = D.r();
                                    }
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.s;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.t.a(q.class, C0109a.class);
        }

        public int c() {
            return this.f5103a;
        }

        public boolean d() {
            return this.f5104d != null;
        }

        public t e() {
            return this.f5104d == null ? t.g() : this.f5104d;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5103a != s.INFORMATION_REQUEST_TYPE_GET_STATUS.a()) {
                hVar.e(1, this.f5103a);
            }
            if (this.f5104d != null) {
                hVar.a(2, e());
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5103a != s.INFORMATION_REQUEST_TYPE_GET_STATUS.a()) {
                i2 = 0 + com.google.protobuf.h.i(1, this.f5103a);
            }
            if (this.f5104d != null) {
                i2 += com.google.protobuf.h.c(2, e());
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof q)) {
                return super.equals(obj);
            }
            q qVar = (q) obj;
            boolean z = (this.f5103a == qVar.f5103a) && d() == qVar.d();
            return d() ? z && e().equals(qVar.e()) : z;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + a().hashCode()) * 37) + 1) * 53) + this.f5103a;
            if (d()) {
                hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: f */
        public C0109a C() {
            return g();
        }

        public static C0109a g() {
            return f.D();
        }

        public static C0109a a(q qVar) {
            return f.D().a(qVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: h */
        public C0109a D() {
            return this == f ? new C0109a() : new C0109a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0109a b(s.b bVar) {
            return new C0109a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$q$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0109a extends s.a<C0109a> implements r {

            /* renamed from: a  reason: collision with root package name */
            private int f5105a;

            /* renamed from: b  reason: collision with root package name */
            private t f5106b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<t, t.C0110a, u> f5107c;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0109a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0109a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.t.a(q.class, C0109a.class);
            }

            private C0109a() {
                this.f5105a = 0;
                this.f5106b = null;
                j();
            }

            private C0109a(s.b bVar) {
                super(bVar);
                this.f5105a = 0;
                this.f5106b = null;
                j();
            }

            private void j() {
                boolean unused = q.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.s;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public q F() {
                return q.i();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public q t() {
                q r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public q r() {
                q qVar = new q(this);
                qVar.f5103a = this.f5105a;
                if (this.f5107c == null) {
                    qVar.f5104d = this.f5106b;
                } else {
                    qVar.f5104d = this.f5107c.c();
                }
                u();
                return qVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0109a q() {
                return (C0109a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0109a f(j.f fVar, Object obj) {
                return (C0109a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0109a e(j.f fVar, Object obj) {
                return (C0109a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0109a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof q) {
                    return a((q) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0109a a(q qVar) {
                if (qVar == q.i()) {
                    return this;
                }
                if (qVar.f5103a != 0) {
                    a(qVar.c());
                }
                if (qVar.d()) {
                    b(qVar.e());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.q.C0109a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.q.m()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$q r3 = (com.teslamotors.a.a.q) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$q r4 = (com.teslamotors.a.a.q) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.q.C0109a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$q$a");
            }

            public C0109a a(int i) {
                this.f5105a = i;
                x();
                return this;
            }

            public C0109a a(s sVar) {
                if (sVar == null) {
                    throw new NullPointerException();
                }
                this.f5105a = sVar.a();
                x();
                return this;
            }

            public C0109a a(t tVar) {
                if (this.f5107c != null) {
                    this.f5107c.a(tVar);
                } else if (tVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5106b = tVar;
                    x();
                }
                return this;
            }

            public C0109a b(t tVar) {
                if (this.f5107c == null) {
                    if (this.f5106b != null) {
                        this.f5106b = t.a(this.f5106b).a(tVar).r();
                    } else {
                        this.f5106b = tVar;
                    }
                    x();
                } else {
                    this.f5107c.b(tVar);
                }
                return this;
            }
        }

        public static q i() {
            return f;
        }

        public static com.google.protobuf.ai<q> j() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<q> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public q F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class w extends com.google.protobuf.s implements x {
        private static final t.c.a<Integer, aw> f = new t.c.a<Integer, aw>() { // from class: com.teslamotors.a.a.w.1
            @Override // com.google.protobuf.t.c.a
            public aw a(Integer num) {
                aw a2 = aw.a(num.intValue());
                return a2 == null ? aw.UNRECOGNIZED : a2;
            }
        };
        private static final w j = new w();
        private static final com.google.protobuf.ai<w> k = new com.google.protobuf.c<w>() { // from class: com.teslamotors.a.a.w.2
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public w d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new w(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5119a;

        /* renamed from: d  reason: collision with root package name */
        private y f5120d;
        private List<Integer> e;
        private int g;
        private int h;
        private byte i;

        private w(s.a<?> aVar) {
            super(aVar);
            this.i = (byte) -1;
        }

        private w() {
            this.i = (byte) -1;
            this.e = Collections.emptyList();
            this.h = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private w(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (z) {
                    break;
                }
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                y.C0112a D = this.f5120d != null ? this.f5120d.D() : null;
                                this.f5120d = (y) gVar.a(y.h(), pVar);
                                if (D != null) {
                                    D.a(this.f5120d);
                                    this.f5120d = D.r();
                                }
                            } else if (a2 == 16) {
                                int n = gVar.n();
                                if (!(z2 & true)) {
                                    this.e = new ArrayList();
                                    z2 |= true;
                                }
                                this.e.add(Integer.valueOf(n));
                            } else if (a2 == 18) {
                                int c2 = gVar.c(gVar.s());
                                while (gVar.u() > 0) {
                                    int n2 = gVar.n();
                                    if (!(z2 & true)) {
                                        this.e = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.e.add(Integer.valueOf(n2));
                                }
                                gVar.d(c2);
                            } else if (a2 != 24) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                this.h = gVar.m();
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    if (z2 & true) {
                        this.e = Collections.unmodifiableList(this.e);
                    }
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.u;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.v.a(w.class, C0111a.class);
        }

        public boolean c() {
            return this.f5120d != null;
        }

        public y d() {
            return this.f5120d == null ? y.g() : this.f5120d;
        }

        public List<aw> e() {
            return new t.c(this.e, f);
        }

        public int f() {
            return this.e.size();
        }

        public int g() {
            return this.h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.i;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.i = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            getSerializedSize();
            if (this.f5120d != null) {
                hVar.a(1, d());
            }
            if (e().size() > 0) {
                hVar.c(18);
                hVar.c(this.g);
            }
            for (int i = 0; i < this.e.size(); i++) {
                hVar.g(this.e.get(i).intValue());
            }
            if (this.h != 0) {
                hVar.c(3, this.h);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int c2 = this.f5120d != null ? com.google.protobuf.h.c(1, d()) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                i2 += com.google.protobuf.h.n(this.e.get(i3).intValue());
            }
            int i4 = c2 + i2;
            if (!e().isEmpty()) {
                i4 = i4 + 1 + com.google.protobuf.h.j(i2);
            }
            this.g = i2;
            if (this.h != 0) {
                i4 += com.google.protobuf.h.g(3, this.h);
            }
            this.memoizedSize = i4;
            return i4;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof w)) {
                return super.equals(obj);
            }
            w wVar = (w) obj;
            boolean z = c() == wVar.c();
            if (c()) {
                z = z && d().equals(wVar.d());
            }
            return (z && this.e.equals(wVar.e)) && g() == wVar.g();
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (f() > 0) {
                hashCode = (((hashCode * 37) + 2) * 53) + this.e.hashCode();
            }
            int g = (((((hashCode * 37) + 3) * 53) + g()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = g;
            return g;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: h */
        public C0111a C() {
            return i();
        }

        public static C0111a i() {
            return j.D();
        }

        public static C0111a a(w wVar) {
            return j.D().a(wVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: j */
        public C0111a D() {
            return this == j ? new C0111a() : new C0111a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0111a b(s.b bVar) {
            return new C0111a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$w$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0111a extends s.a<C0111a> implements x {

            /* renamed from: a  reason: collision with root package name */
            private int f5121a;

            /* renamed from: b  reason: collision with root package name */
            private y f5122b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<y, y.C0112a, z> f5123c;

            /* renamed from: d  reason: collision with root package name */
            private List<Integer> f5124d;
            private int e;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0111a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0111a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.v.a(w.class, C0111a.class);
            }

            private C0111a() {
                this.f5122b = null;
                this.f5124d = Collections.emptyList();
                j();
            }

            private C0111a(s.b bVar) {
                super(bVar);
                this.f5122b = null;
                this.f5124d = Collections.emptyList();
                j();
            }

            private void j() {
                boolean unused = w.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.u;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public w F() {
                return w.k();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public w t() {
                w r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public w r() {
                w wVar = new w(this);
                int i = this.f5121a;
                if (this.f5123c == null) {
                    wVar.f5120d = this.f5122b;
                } else {
                    wVar.f5120d = this.f5123c.c();
                }
                if ((this.f5121a & 2) == 2) {
                    this.f5124d = Collections.unmodifiableList(this.f5124d);
                    this.f5121a &= -3;
                }
                wVar.e = this.f5124d;
                wVar.h = this.e;
                wVar.f5119a = 0;
                u();
                return wVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0111a q() {
                return (C0111a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0111a f(j.f fVar, Object obj) {
                return (C0111a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0111a e(j.f fVar, Object obj) {
                return (C0111a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0111a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof w) {
                    return a((w) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0111a a(w wVar) {
                if (wVar == w.k()) {
                    return this;
                }
                if (wVar.c()) {
                    b(wVar.d());
                }
                if (!wVar.e.isEmpty()) {
                    if (this.f5124d.isEmpty()) {
                        this.f5124d = wVar.e;
                        this.f5121a &= -3;
                    } else {
                        k();
                        this.f5124d.addAll(wVar.e);
                    }
                    x();
                }
                if (wVar.g() != 0) {
                    a(wVar.g());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.w.C0111a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.w.o()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$w r3 = (com.teslamotors.a.a.w) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$w r4 = (com.teslamotors.a.a.w) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.w.C0111a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$w$a");
            }

            public C0111a a(y yVar) {
                if (this.f5123c != null) {
                    this.f5123c.a(yVar);
                } else if (yVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5122b = yVar;
                    x();
                }
                return this;
            }

            public C0111a b(y yVar) {
                if (this.f5123c == null) {
                    if (this.f5122b != null) {
                        this.f5122b = y.a(this.f5122b).a(yVar).r();
                    } else {
                        this.f5122b = yVar;
                    }
                    x();
                } else {
                    this.f5123c.b(yVar);
                }
                return this;
            }

            private void k() {
                if ((this.f5121a & 2) != 2) {
                    this.f5124d = new ArrayList(this.f5124d);
                    this.f5121a |= 2;
                }
            }

            public C0111a a(aw awVar) {
                if (awVar == null) {
                    throw new NullPointerException();
                }
                k();
                this.f5124d.add(Integer.valueOf(awVar.a()));
                x();
                return this;
            }

            public C0111a a(int i) {
                this.e = i;
                x();
                return this;
            }
        }

        public static w k() {
            return j;
        }

        public static com.google.protobuf.ai<w> l() {
            return k;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<w> getParserForType() {
            return k;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public w F() {
            return j;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class ax extends com.google.protobuf.s implements ay {
        private static final ax f = new ax();
        private static final com.google.protobuf.ai<ax> g = new com.google.protobuf.c<ax>() { // from class: com.teslamotors.a.a.ax.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ax d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ax(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5045a;

        /* renamed from: d  reason: collision with root package name */
        private Object f5046d;
        private byte e;

        private ax(s.a<?> aVar) {
            super(aVar);
            this.f5045a = 0;
            this.e = (byte) -1;
        }

        private ax() {
            this.f5045a = 0;
            this.e = (byte) -1;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private ax(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            w.C0111a c0111a = null;
                            y.C0112a D = null;
                            y.C0112a D2 = null;
                            w.C0111a D3 = null;
                            w.C0111a D4 = null;
                            if (a2 == 10) {
                                D = this.f5045a == 1 ? ((y) this.f5046d).D() : D;
                                this.f5046d = gVar.a(y.h(), pVar);
                                if (D != null) {
                                    D.a((y) this.f5046d);
                                    this.f5046d = D.r();
                                }
                                this.f5045a = 1;
                            } else if (a2 == 18) {
                                D2 = this.f5045a == 2 ? ((y) this.f5046d).D() : D2;
                                this.f5046d = gVar.a(y.h(), pVar);
                                if (D2 != null) {
                                    D2.a((y) this.f5046d);
                                    this.f5046d = D2.r();
                                }
                                this.f5045a = 2;
                            } else if (a2 == 26) {
                                D3 = this.f5045a == 3 ? ((w) this.f5046d).D() : D3;
                                this.f5046d = gVar.a(w.l(), pVar);
                                if (D3 != null) {
                                    D3.a((w) this.f5046d);
                                    this.f5046d = D3.r();
                                }
                                this.f5045a = 3;
                            } else if (a2 == 34) {
                                D4 = this.f5045a == 4 ? ((w) this.f5046d).D() : D4;
                                this.f5046d = gVar.a(w.l(), pVar);
                                if (D4 != null) {
                                    D4.a((w) this.f5046d);
                                    this.f5046d = D4.r();
                                }
                                this.f5045a = 4;
                            } else if (a2 != 42) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                c0111a = this.f5045a == 5 ? ((w) this.f5046d).D() : c0111a;
                                this.f5046d = gVar.a(w.l(), pVar);
                                if (c0111a != null) {
                                    c0111a.a((w) this.f5046d);
                                    this.f5046d = c0111a.r();
                                }
                                this.f5045a = 5;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.w;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.x.a(ax.class, C0101a.class);
        }

        /* compiled from: VCSEC.java */
        /* loaded from: classes.dex */
        public enum b implements t.a {
            ADDPUBLICKEYTOWHITELIST(1),
            REMOVEPUBLICKEYFROMWHITELIST(2),
            ADDPERMISSIONSTOPUBLICKEY(3),
            REMOVEPERMISSIONSFROMPUBLICKEY(4),
            ADDKEYTOWHITELISTANDADDPERMISSIONS(5),
            SUBMESSAGE_NOT_SET(0);
            
            private final int g;

            b(int i) {
                this.g = i;
            }

            public static b a(int i) {
                switch (i) {
                    case 0:
                        return SUBMESSAGE_NOT_SET;
                    case 1:
                        return ADDPUBLICKEYTOWHITELIST;
                    case 2:
                        return REMOVEPUBLICKEYFROMWHITELIST;
                    case 3:
                        return ADDPERMISSIONSTOPUBLICKEY;
                    case 4:
                        return REMOVEPERMISSIONSFROMPUBLICKEY;
                    case 5:
                        return ADDKEYTOWHITELISTANDADDPERMISSIONS;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.t.a
            public int a() {
                return this.g;
            }
        }

        public b c() {
            return b.a(this.f5045a);
        }

        public y d() {
            if (this.f5045a == 1) {
                return (y) this.f5046d;
            }
            return y.g();
        }

        public y e() {
            if (this.f5045a == 2) {
                return (y) this.f5046d;
            }
            return y.g();
        }

        public w f() {
            if (this.f5045a == 3) {
                return (w) this.f5046d;
            }
            return w.k();
        }

        public w g() {
            if (this.f5045a == 4) {
                return (w) this.f5046d;
            }
            return w.k();
        }

        public w h() {
            if (this.f5045a == 5) {
                return (w) this.f5046d;
            }
            return w.k();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5045a == 1) {
                hVar.a(1, (y) this.f5046d);
            }
            if (this.f5045a == 2) {
                hVar.a(2, (y) this.f5046d);
            }
            if (this.f5045a == 3) {
                hVar.a(3, (w) this.f5046d);
            }
            if (this.f5045a == 4) {
                hVar.a(4, (w) this.f5046d);
            }
            if (this.f5045a == 5) {
                hVar.a(5, (w) this.f5046d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5045a == 1) {
                i2 = 0 + com.google.protobuf.h.c(1, (y) this.f5046d);
            }
            if (this.f5045a == 2) {
                i2 += com.google.protobuf.h.c(2, (y) this.f5046d);
            }
            if (this.f5045a == 3) {
                i2 += com.google.protobuf.h.c(3, (w) this.f5046d);
            }
            if (this.f5045a == 4) {
                i2 += com.google.protobuf.h.c(4, (w) this.f5046d);
            }
            if (this.f5045a == 5) {
                i2 += com.google.protobuf.h.c(5, (w) this.f5046d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN, SYNTHETIC] */
        @Override // com.google.protobuf.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.teslamotors.a.a.ax
                if (r1 != 0) goto Ld
                boolean r5 = super.equals(r5)
                return r5
            Ld:
                com.teslamotors.a.a$ax r5 = (com.teslamotors.a.a.ax) r5
                com.teslamotors.a.a$ax$b r1 = r4.c()
                com.teslamotors.a.a$ax$b r2 = r5.c()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 == 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 != 0) goto L24
                return r2
            L24:
                int r3 = r4.f5045a
                switch(r3) {
                    case 1: goto L71;
                    case 2: goto L60;
                    case 3: goto L4f;
                    case 4: goto L3e;
                    case 5: goto L2a;
                    default: goto L29;
                }
            L29:
                goto L82
            L2a:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$w r1 = r4.h()
                com.teslamotors.a.a$w r5 = r5.h()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
            L3a:
                r1 = 1
                goto L82
            L3c:
                r1 = 0
                goto L82
            L3e:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$w r1 = r4.g()
                com.teslamotors.a.a$w r5 = r5.g()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
                goto L3a
            L4f:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$w r1 = r4.f()
                com.teslamotors.a.a$w r5 = r5.f()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
                goto L3a
            L60:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$y r1 = r4.e()
                com.teslamotors.a.a$y r5 = r5.e()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
                goto L3a
            L71:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$y r1 = r4.d()
                com.teslamotors.a.a$y r5 = r5.d()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
                goto L3a
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.ax.equals(java.lang.Object):boolean");
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            switch (this.f5045a) {
                case 1:
                    hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
                    break;
                case 2:
                    hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
                    break;
                case 3:
                    hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
                    break;
                case 4:
                    hashCode = (((hashCode * 37) + 4) * 53) + g().hashCode();
                    break;
                case 5:
                    hashCode = (((hashCode * 37) + 5) * 53) + h().hashCode();
                    break;
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public C0101a C() {
            return j();
        }

        public static C0101a j() {
            return f.D();
        }

        public static C0101a a(ax axVar) {
            return f.D().a(axVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public C0101a D() {
            return this == f ? new C0101a() : new C0101a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0101a b(s.b bVar) {
            return new C0101a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$ax$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0101a extends s.a<C0101a> implements ay {

            /* renamed from: a  reason: collision with root package name */
            private int f5047a;

            /* renamed from: b  reason: collision with root package name */
            private Object f5048b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<y, y.C0112a, z> f5049c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.an<y, y.C0112a, z> f5050d;
            private com.google.protobuf.an<w, w.C0111a, x> e;
            private com.google.protobuf.an<w, w.C0111a, x> f;
            private com.google.protobuf.an<w, w.C0111a, x> g;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0101a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0101a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.x.a(ax.class, C0101a.class);
            }

            private C0101a() {
                this.f5047a = 0;
                j();
            }

            private C0101a(s.b bVar) {
                super(bVar);
                this.f5047a = 0;
                j();
            }

            private void j() {
                boolean unused = ax.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.w;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ax F() {
                return ax.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ax t() {
                ax r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ax r() {
                ax axVar = new ax(this);
                if (this.f5047a == 1) {
                    if (this.f5049c == null) {
                        axVar.f5046d = this.f5048b;
                    } else {
                        axVar.f5046d = this.f5049c.c();
                    }
                }
                if (this.f5047a == 2) {
                    if (this.f5050d == null) {
                        axVar.f5046d = this.f5048b;
                    } else {
                        axVar.f5046d = this.f5050d.c();
                    }
                }
                if (this.f5047a == 3) {
                    if (this.e == null) {
                        axVar.f5046d = this.f5048b;
                    } else {
                        axVar.f5046d = this.e.c();
                    }
                }
                if (this.f5047a == 4) {
                    if (this.f == null) {
                        axVar.f5046d = this.f5048b;
                    } else {
                        axVar.f5046d = this.f.c();
                    }
                }
                if (this.f5047a == 5) {
                    if (this.g == null) {
                        axVar.f5046d = this.f5048b;
                    } else {
                        axVar.f5046d = this.g.c();
                    }
                }
                axVar.f5045a = this.f5047a;
                u();
                return axVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0101a q() {
                return (C0101a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0101a f(j.f fVar, Object obj) {
                return (C0101a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0101a e(j.f fVar, Object obj) {
                return (C0101a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0101a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ax) {
                    return a((ax) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0101a a(ax axVar) {
                if (axVar == ax.l()) {
                    return this;
                }
                switch (axVar.c()) {
                    case ADDPUBLICKEYTOWHITELIST:
                        a(axVar.d());
                        break;
                    case REMOVEPUBLICKEYFROMWHITELIST:
                        c(axVar.e());
                        break;
                    case ADDPERMISSIONSTOPUBLICKEY:
                        a(axVar.f());
                        break;
                    case REMOVEPERMISSIONSFROMPUBLICKEY:
                        b(axVar.g());
                        break;
                    case ADDKEYTOWHITELISTANDADDPERMISSIONS:
                        c(axVar.h());
                        break;
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.ax.C0101a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.ax.p()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$ax r3 = (com.teslamotors.a.a.ax) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$ax r4 = (com.teslamotors.a.a.ax) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.ax.C0101a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$ax$a");
            }

            public C0101a a(y yVar) {
                if (this.f5049c == null) {
                    if (this.f5047a == 1 && this.f5048b != y.g()) {
                        this.f5048b = y.a((y) this.f5048b).a(yVar).r();
                    } else {
                        this.f5048b = yVar;
                    }
                    x();
                } else {
                    if (this.f5047a == 1) {
                        this.f5049c.b(yVar);
                    }
                    this.f5049c.a(yVar);
                }
                this.f5047a = 1;
                return this;
            }

            public C0101a b(y yVar) {
                if (this.f5050d != null) {
                    this.f5050d.a(yVar);
                } else if (yVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5048b = yVar;
                    x();
                }
                this.f5047a = 2;
                return this;
            }

            public C0101a c(y yVar) {
                if (this.f5050d == null) {
                    if (this.f5047a == 2 && this.f5048b != y.g()) {
                        this.f5048b = y.a((y) this.f5048b).a(yVar).r();
                    } else {
                        this.f5048b = yVar;
                    }
                    x();
                } else {
                    if (this.f5047a == 2) {
                        this.f5050d.b(yVar);
                    }
                    this.f5050d.a(yVar);
                }
                this.f5047a = 2;
                return this;
            }

            public C0101a a(w wVar) {
                if (this.e == null) {
                    if (this.f5047a == 3 && this.f5048b != w.k()) {
                        this.f5048b = w.a((w) this.f5048b).a(wVar).r();
                    } else {
                        this.f5048b = wVar;
                    }
                    x();
                } else {
                    if (this.f5047a == 3) {
                        this.e.b(wVar);
                    }
                    this.e.a(wVar);
                }
                this.f5047a = 3;
                return this;
            }

            public C0101a b(w wVar) {
                if (this.f == null) {
                    if (this.f5047a == 4 && this.f5048b != w.k()) {
                        this.f5048b = w.a((w) this.f5048b).a(wVar).r();
                    } else {
                        this.f5048b = wVar;
                    }
                    x();
                } else {
                    if (this.f5047a == 4) {
                        this.f.b(wVar);
                    }
                    this.f.a(wVar);
                }
                this.f5047a = 4;
                return this;
            }

            public C0101a a(w.C0111a c0111a) {
                if (this.g == null) {
                    this.f5048b = c0111a.t();
                    x();
                } else {
                    this.g.a(c0111a.t());
                }
                this.f5047a = 5;
                return this;
            }

            public C0101a c(w wVar) {
                if (this.g == null) {
                    if (this.f5047a == 5 && this.f5048b != w.k()) {
                        this.f5048b = w.a((w) this.f5048b).a(wVar).r();
                    } else {
                        this.f5048b = wVar;
                    }
                    x();
                } else {
                    if (this.f5047a == 5) {
                        this.g.b(wVar);
                    }
                    this.g.a(wVar);
                }
                this.f5047a = 5;
                return this;
            }
        }

        public static ax l() {
            return f;
        }

        public static com.google.protobuf.ai<ax> m() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ax> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: n */
        public ax F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class d extends com.google.protobuf.s implements e {
        private static final d e = new d();
        private static final com.google.protobuf.ai<d> f = new com.google.protobuf.c<d>() { // from class: com.teslamotors.a.a.d.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public d d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new d(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5061a;

        /* renamed from: d  reason: collision with root package name */
        private byte f5062d;

        private d(s.a<?> aVar) {
            super(aVar);
            this.f5062d = (byte) -1;
        }

        private d() {
            this.f5062d = (byte) -1;
            this.f5061a = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 != 8) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.f5061a = gVar.n();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e2) {
                            throw e2.a(this);
                        }
                    } catch (IOException e3) {
                        throw new com.google.protobuf.u(e3).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.y;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.z.a(d.class, C0103a.class);
        }

        public int c() {
            return this.f5061a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f5062d;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f5062d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5061a != EnumC0091a.AUTHENTICATION_LEVEL_NONE.a()) {
                hVar.e(1, this.f5061a);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5061a != EnumC0091a.AUTHENTICATION_LEVEL_NONE.a()) {
                i2 = 0 + com.google.protobuf.h.i(1, this.f5061a);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return super.equals(obj);
            }
            return this.f5061a == ((d) obj).f5061a;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((779 + a().hashCode()) * 37) + 1) * 53) + this.f5061a) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: d */
        public C0103a C() {
            return e();
        }

        public static C0103a e() {
            return e.D();
        }

        public static C0103a a(d dVar) {
            return e.D().a(dVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: f */
        public C0103a D() {
            return this == e ? new C0103a() : new C0103a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0103a b(s.b bVar) {
            return new C0103a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0103a extends s.a<C0103a> implements e {

            /* renamed from: a  reason: collision with root package name */
            private int f5063a;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0103a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0103a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.z.a(d.class, C0103a.class);
            }

            private C0103a() {
                this.f5063a = 0;
                j();
            }

            private C0103a(s.b bVar) {
                super(bVar);
                this.f5063a = 0;
                j();
            }

            private void j() {
                boolean unused = d.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.y;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public d F() {
                return d.g();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public d t() {
                d r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public d r() {
                d dVar = new d(this);
                dVar.f5061a = this.f5063a;
                u();
                return dVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0103a q() {
                return (C0103a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0103a f(j.f fVar, Object obj) {
                return (C0103a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0103a e(j.f fVar, Object obj) {
                return (C0103a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0103a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof d) {
                    return a((d) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0103a a(d dVar) {
                if (dVar == d.g()) {
                    return this;
                }
                if (dVar.f5061a != 0) {
                    a(dVar.c());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.d.C0103a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.d.k()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$d r3 = (com.teslamotors.a.a.d) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$d r4 = (com.teslamotors.a.a.d) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.d.C0103a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$d$a");
            }

            public C0103a a(int i) {
                this.f5063a = i;
                x();
                return this;
            }

            public C0103a a(EnumC0091a enumC0091a) {
                if (enumC0091a == null) {
                    throw new NullPointerException();
                }
                this.f5063a = enumC0091a.a();
                x();
                return this;
            }
        }

        public static d g() {
            return e;
        }

        public static com.google.protobuf.ai<d> h() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<d> getParserForType() {
            return f;
        }

        @Override // com.google.protobuf.af
        /* renamed from: i */
        public d F() {
            return e;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class ah extends com.google.protobuf.s implements ai {
        private static final ah f = new ah();
        private static final com.google.protobuf.ai<ah> g = new com.google.protobuf.c<ah>() { // from class: com.teslamotors.a.a.ah.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ah d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ah(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f4993a;

        /* renamed from: d  reason: collision with root package name */
        private int f4994d;
        private byte e;

        private ah(s.a<?> aVar) {
            super(aVar);
            this.e = (byte) -1;
        }

        private ah() {
            this.e = (byte) -1;
            this.f4993a = 0;
            this.f4994d = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private ah(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.f4993a = gVar.m();
                            } else if (a2 != 16) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                this.f4994d = gVar.n();
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.A;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.B.a(ah.class, C0094a.class);
        }

        public int c() {
            return this.f4993a;
        }

        public int d() {
            return this.f4994d;
        }

        public ag e() {
            ag a2 = ag.a(this.f4994d);
            return a2 == null ? ag.UNRECOGNIZED : a2;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f4993a != 0) {
                hVar.c(1, this.f4993a);
            }
            if (this.f4994d != ag.SIGNEDMESSAGE_INFORMATION_NONE.a()) {
                hVar.e(2, this.f4994d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f4993a != 0) {
                i2 = 0 + com.google.protobuf.h.g(1, this.f4993a);
            }
            if (this.f4994d != ag.SIGNEDMESSAGE_INFORMATION_NONE.a()) {
                i2 += com.google.protobuf.h.i(2, this.f4994d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ah)) {
                return super.equals(obj);
            }
            ah ahVar = (ah) obj;
            return (c() == ahVar.c()) && this.f4994d == ahVar.f4994d;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((779 + a().hashCode()) * 37) + 1) * 53) + c()) * 37) + 2) * 53) + this.f4994d) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: f */
        public C0094a C() {
            return g();
        }

        public static C0094a g() {
            return f.D();
        }

        public static C0094a a(ah ahVar) {
            return f.D().a(ahVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: h */
        public C0094a D() {
            return this == f ? new C0094a() : new C0094a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0094a b(s.b bVar) {
            return new C0094a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$ah$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0094a extends s.a<C0094a> implements ai {

            /* renamed from: a  reason: collision with root package name */
            private int f4995a;

            /* renamed from: b  reason: collision with root package name */
            private int f4996b;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0094a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0094a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.B.a(ah.class, C0094a.class);
            }

            private C0094a() {
                this.f4996b = 0;
                j();
            }

            private C0094a(s.b bVar) {
                super(bVar);
                this.f4996b = 0;
                j();
            }

            private void j() {
                boolean unused = ah.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.A;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ah F() {
                return ah.i();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ah t() {
                ah r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ah r() {
                ah ahVar = new ah(this);
                ahVar.f4993a = this.f4995a;
                ahVar.f4994d = this.f4996b;
                u();
                return ahVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0094a q() {
                return (C0094a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0094a f(j.f fVar, Object obj) {
                return (C0094a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0094a e(j.f fVar, Object obj) {
                return (C0094a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0094a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ah) {
                    return a((ah) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0094a a(ah ahVar) {
                if (ahVar == ah.i()) {
                    return this;
                }
                if (ahVar.c() != 0) {
                    a(ahVar.c());
                }
                if (ahVar.f4994d != 0) {
                    b(ahVar.d());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.ah.C0094a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.ah.m()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$ah r3 = (com.teslamotors.a.a.ah) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$ah r4 = (com.teslamotors.a.a.ah) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.ah.C0094a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$ah$a");
            }

            public C0094a a(int i) {
                this.f4995a = i;
                x();
                return this;
            }

            public C0094a b(int i) {
                this.f4996b = i;
                x();
                return this;
            }
        }

        public static ah i() {
            return f;
        }

        public static com.google.protobuf.ai<ah> j() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ah> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public ah F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class k extends com.google.protobuf.s implements l {
        private static final k g = new k();
        private static final com.google.protobuf.ai<k> h = new com.google.protobuf.c<k>() { // from class: com.teslamotors.a.a.k.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public k d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new k(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5078a;

        /* renamed from: d  reason: collision with root package name */
        private Object f5079d;
        private int e;
        private byte f;

        private k(s.a<?> aVar) {
            super(aVar);
            this.f5078a = 0;
            this.f = (byte) -1;
        }

        private k() {
            this.f5078a = 0;
            this.f = (byte) -1;
            this.e = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private k(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            if (a2 == 8) {
                                this.e = gVar.n();
                            } else if (a2 != 18) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                ah.C0094a D = this.f5078a == 2 ? ((ah) this.f5079d).D() : null;
                                this.f5079d = gVar.a(ah.j(), pVar);
                                if (D != null) {
                                    D.a((ah) this.f5079d);
                                    this.f5079d = D.r();
                                }
                                this.f5078a = 2;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.C;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.D.a(k.class, C0106a.class);
        }

        /* compiled from: VCSEC.java */
        /* loaded from: classes.dex */
        public enum b implements t.a {
            SIGNEDMESSAGESTATUS(2),
            SUBMESSAGE_NOT_SET(0);
            

            /* renamed from: c  reason: collision with root package name */
            private final int f5087c;

            b(int i) {
                this.f5087c = i;
            }

            public static b a(int i) {
                if (i != 0) {
                    if (i == 2) {
                        return SIGNEDMESSAGESTATUS;
                    }
                    return null;
                }
                return SUBMESSAGE_NOT_SET;
            }

            @Override // com.google.protobuf.t.a
            public int a() {
                return this.f5087c;
            }
        }

        public b c() {
            return b.a(this.f5078a);
        }

        public int d() {
            return this.e;
        }

        public v e() {
            v a2 = v.a(this.e);
            return a2 == null ? v.UNRECOGNIZED : a2;
        }

        public ah f() {
            if (this.f5078a == 2) {
                return (ah) this.f5079d;
            }
            return ah.i();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.e != v.OPERATIONSTATUS_OK.a()) {
                hVar.e(1, this.e);
            }
            if (this.f5078a == 2) {
                hVar.a(2, (ah) this.f5079d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.e != v.OPERATIONSTATUS_OK.a()) {
                i2 = 0 + com.google.protobuf.h.i(1, this.e);
            }
            if (this.f5078a == 2) {
                i2 += com.google.protobuf.h.c(2, (ah) this.f5079d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof k)) {
                return super.equals(obj);
            }
            k kVar = (k) obj;
            boolean z = (this.e == kVar.e) && c().equals(kVar.c());
            if (!z) {
                return false;
            }
            return this.f5078a != 2 ? z : z && f().equals(kVar.f());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + a().hashCode()) * 37) + 1) * 53) + this.e;
            if (this.f5078a == 2) {
                hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: g */
        public C0106a C() {
            return h();
        }

        public static C0106a h() {
            return g.D();
        }

        public static C0106a a(k kVar) {
            return g.D().a(kVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: i */
        public C0106a D() {
            return this == g ? new C0106a() : new C0106a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0106a b(s.b bVar) {
            return new C0106a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0106a extends s.a<C0106a> implements l {

            /* renamed from: a  reason: collision with root package name */
            private int f5080a;

            /* renamed from: b  reason: collision with root package name */
            private Object f5081b;

            /* renamed from: c  reason: collision with root package name */
            private int f5082c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.an<ah, ah.C0094a, ai> f5083d;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0106a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0106a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.D.a(k.class, C0106a.class);
            }

            private C0106a() {
                this.f5080a = 0;
                this.f5082c = 0;
                j();
            }

            private C0106a(s.b bVar) {
                super(bVar);
                this.f5080a = 0;
                this.f5082c = 0;
                j();
            }

            private void j() {
                boolean unused = k.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.C;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public k F() {
                return k.j();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public k t() {
                k r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public k r() {
                k kVar = new k(this);
                kVar.e = this.f5082c;
                if (this.f5080a == 2) {
                    if (this.f5083d == null) {
                        kVar.f5079d = this.f5081b;
                    } else {
                        kVar.f5079d = this.f5083d.c();
                    }
                }
                kVar.f5078a = this.f5080a;
                u();
                return kVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0106a q() {
                return (C0106a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0106a f(j.f fVar, Object obj) {
                return (C0106a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0106a e(j.f fVar, Object obj) {
                return (C0106a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0106a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof k) {
                    return a((k) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0106a a(k kVar) {
                if (kVar == k.j()) {
                    return this;
                }
                if (kVar.e != 0) {
                    a(kVar.d());
                }
                if (AnonymousClass2.f4963b[kVar.c().ordinal()] == 1) {
                    a(kVar.f());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.k.C0106a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.k.n()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$k r3 = (com.teslamotors.a.a.k) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$k r4 = (com.teslamotors.a.a.k) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.k.C0106a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$k$a");
            }

            public C0106a a(int i) {
                this.f5082c = i;
                x();
                return this;
            }

            public C0106a a(ah ahVar) {
                if (this.f5083d == null) {
                    if (this.f5080a == 2 && this.f5081b != ah.i()) {
                        this.f5081b = ah.a((ah) this.f5081b).a(ahVar).r();
                    } else {
                        this.f5081b = ahVar;
                    }
                    x();
                } else {
                    if (this.f5080a == 2) {
                        this.f5083d.b(ahVar);
                    }
                    this.f5083d.a(ahVar);
                }
                this.f5080a = 2;
                return this;
            }
        }

        public static k j() {
            return g;
        }

        public static com.google.protobuf.ai<k> k() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<k> getParserForType() {
            return h;
        }

        @Override // com.google.protobuf.af
        /* renamed from: l */
        public k F() {
            return g;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class al extends com.google.protobuf.s implements am {
        private static final al f = new al();
        private static final com.google.protobuf.ai<al> g = new com.google.protobuf.c<al>() { // from class: com.teslamotors.a.a.al.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public al d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new al(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5007a;

        /* renamed from: d  reason: collision with root package name */
        private Object f5008d;
        private byte e;

        private al(s.a<?> aVar) {
            super(aVar);
            this.f5007a = 0;
            this.e = (byte) -1;
        }

        private al() {
            this.f5007a = 0;
            this.e = (byte) -1;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private al(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                ax.C0101a c0101a = null;
                                q.C0109a D = null;
                                d.C0103a D2 = null;
                                if (a2 == 10) {
                                    D = this.f5007a == 1 ? ((q) this.f5008d).D() : D;
                                    this.f5008d = gVar.a(q.j(), pVar);
                                    if (D != null) {
                                        D.a((q) this.f5008d);
                                        this.f5008d = D.r();
                                    }
                                    this.f5007a = 1;
                                } else if (a2 == 16) {
                                    int n = gVar.n();
                                    this.f5007a = 2;
                                    this.f5008d = Integer.valueOf(n);
                                } else if (a2 == 26) {
                                    D2 = this.f5007a == 3 ? ((d) this.f5008d).D() : D2;
                                    this.f5008d = gVar.a(d.h(), pVar);
                                    if (D2 != null) {
                                        D2.a((d) this.f5008d);
                                        this.f5008d = D2.r();
                                    }
                                    this.f5007a = 3;
                                } else if (a2 != 130) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    c0101a = this.f5007a == 16 ? ((ax) this.f5008d).D() : c0101a;
                                    this.f5008d = gVar.a(ax.m(), pVar);
                                    if (c0101a != null) {
                                        c0101a.a((ax) this.f5008d);
                                        this.f5008d = c0101a.r();
                                    }
                                    this.f5007a = 16;
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.E;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.F.a(al.class, C0096a.class);
        }

        /* compiled from: VCSEC.java */
        /* loaded from: classes.dex */
        public enum b implements t.a {
            INFORMATIONREQUEST(1),
            RKEACTION(2),
            AUTHENTICATIONRESPONSE(3),
            WHITELISTOPERATION(16),
            SUBMESSAGE_NOT_SET(0);
            
            private final int f;

            b(int i) {
                this.f = i;
            }

            public static b a(int i) {
                if (i == 16) {
                    return WHITELISTOPERATION;
                }
                switch (i) {
                    case 0:
                        return SUBMESSAGE_NOT_SET;
                    case 1:
                        return INFORMATIONREQUEST;
                    case 2:
                        return RKEACTION;
                    case 3:
                        return AUTHENTICATIONRESPONSE;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.t.a
            public int a() {
                return this.f;
            }
        }

        public b c() {
            return b.a(this.f5007a);
        }

        public q d() {
            if (this.f5007a == 1) {
                return (q) this.f5008d;
            }
            return q.i();
        }

        public int e() {
            if (this.f5007a == 2) {
                return ((Integer) this.f5008d).intValue();
            }
            return 0;
        }

        public d f() {
            if (this.f5007a == 3) {
                return (d) this.f5008d;
            }
            return d.g();
        }

        public ax g() {
            if (this.f5007a == 16) {
                return (ax) this.f5008d;
            }
            return ax.l();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5007a == 1) {
                hVar.a(1, (q) this.f5008d);
            }
            if (this.f5007a == 2) {
                hVar.e(2, ((Integer) this.f5008d).intValue());
            }
            if (this.f5007a == 3) {
                hVar.a(3, (d) this.f5008d);
            }
            if (this.f5007a == 16) {
                hVar.a(16, (ax) this.f5008d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5007a == 1) {
                i2 = 0 + com.google.protobuf.h.c(1, (q) this.f5008d);
            }
            if (this.f5007a == 2) {
                i2 += com.google.protobuf.h.i(2, ((Integer) this.f5008d).intValue());
            }
            if (this.f5007a == 3) {
                i2 += com.google.protobuf.h.c(3, (d) this.f5008d);
            }
            if (this.f5007a == 16) {
                i2 += com.google.protobuf.h.c(16, (ax) this.f5008d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0040 A[RETURN, SYNTHETIC] */
        @Override // com.google.protobuf.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r6 != r5) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof com.teslamotors.a.a.al
                if (r1 != 0) goto Ld
                boolean r6 = super.equals(r6)
                return r6
            Ld:
                com.teslamotors.a.a$al r6 = (com.teslamotors.a.a.al) r6
                com.teslamotors.a.a$al$b r1 = r5.c()
                com.teslamotors.a.a$al$b r2 = r6.c()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 == 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 != 0) goto L24
                return r2
            L24:
                int r3 = r5.f5007a
                r4 = 16
                if (r3 == r4) goto L60
                switch(r3) {
                    case 1: goto L4f;
                    case 2: goto L42;
                    case 3: goto L2e;
                    default: goto L2d;
                }
            L2d:
                goto L71
            L2e:
                if (r1 == 0) goto L40
                com.teslamotors.a.a$d r1 = r5.f()
                com.teslamotors.a.a$d r6 = r6.f()
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L40
            L3e:
                r1 = 1
                goto L71
            L40:
                r1 = 0
                goto L71
            L42:
                if (r1 == 0) goto L40
                int r1 = r5.e()
                int r6 = r6.e()
                if (r1 != r6) goto L40
                goto L3e
            L4f:
                if (r1 == 0) goto L40
                com.teslamotors.a.a$q r1 = r5.d()
                com.teslamotors.a.a$q r6 = r6.d()
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L40
                goto L3e
            L60:
                if (r1 == 0) goto L40
                com.teslamotors.a.a$ax r1 = r5.g()
                com.teslamotors.a.a$ax r6 = r6.g()
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L40
                goto L3e
            L71:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.al.equals(java.lang.Object):boolean");
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            int i = this.f5007a;
            if (i != 16) {
                switch (i) {
                    case 1:
                        hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
                        break;
                    case 2:
                        hashCode = (((hashCode * 37) + 2) * 53) + e();
                        break;
                    case 3:
                        hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
                        break;
                }
            } else {
                hashCode = (((hashCode * 37) + 16) * 53) + g().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: h */
        public C0096a C() {
            return i();
        }

        public static C0096a i() {
            return f.D();
        }

        public static C0096a a(al alVar) {
            return f.D().a(alVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: j */
        public C0096a D() {
            return this == f ? new C0096a() : new C0096a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0096a b(s.b bVar) {
            return new C0096a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$al$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0096a extends s.a<C0096a> implements am {

            /* renamed from: a  reason: collision with root package name */
            private int f5009a;

            /* renamed from: b  reason: collision with root package name */
            private Object f5010b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<q, q.C0109a, r> f5011c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.an<d, d.C0103a, e> f5012d;
            private com.google.protobuf.an<ax, ax.C0101a, ay> e;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0096a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0096a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.F.a(al.class, C0096a.class);
            }

            private C0096a() {
                this.f5009a = 0;
                j();
            }

            private C0096a(s.b bVar) {
                super(bVar);
                this.f5009a = 0;
                j();
            }

            private void j() {
                boolean unused = al.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.E;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public al F() {
                return al.k();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public al t() {
                al r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public al r() {
                al alVar = new al(this);
                if (this.f5009a == 1) {
                    if (this.f5011c == null) {
                        alVar.f5008d = this.f5010b;
                    } else {
                        alVar.f5008d = this.f5011c.c();
                    }
                }
                if (this.f5009a == 2) {
                    alVar.f5008d = this.f5010b;
                }
                if (this.f5009a == 3) {
                    if (this.f5012d == null) {
                        alVar.f5008d = this.f5010b;
                    } else {
                        alVar.f5008d = this.f5012d.c();
                    }
                }
                if (this.f5009a == 16) {
                    if (this.e == null) {
                        alVar.f5008d = this.f5010b;
                    } else {
                        alVar.f5008d = this.e.c();
                    }
                }
                alVar.f5007a = this.f5009a;
                u();
                return alVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0096a q() {
                return (C0096a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0096a f(j.f fVar, Object obj) {
                return (C0096a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0096a e(j.f fVar, Object obj) {
                return (C0096a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0096a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof al) {
                    return a((al) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0096a a(al alVar) {
                if (alVar == al.k()) {
                    return this;
                }
                switch (alVar.c()) {
                    case INFORMATIONREQUEST:
                        b(alVar.d());
                        break;
                    case RKEACTION:
                        a(alVar.e());
                        break;
                    case AUTHENTICATIONRESPONSE:
                        b(alVar.f());
                        break;
                    case WHITELISTOPERATION:
                        a(alVar.g());
                        break;
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.al.C0096a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.al.o()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$al r3 = (com.teslamotors.a.a.al) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$al r4 = (com.teslamotors.a.a.al) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.al.C0096a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$al$a");
            }

            public C0096a a(q qVar) {
                if (this.f5011c != null) {
                    this.f5011c.a(qVar);
                } else if (qVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5010b = qVar;
                    x();
                }
                this.f5009a = 1;
                return this;
            }

            public C0096a b(q qVar) {
                if (this.f5011c == null) {
                    if (this.f5009a == 1 && this.f5010b != q.i()) {
                        this.f5010b = q.a((q) this.f5010b).a(qVar).r();
                    } else {
                        this.f5010b = qVar;
                    }
                    x();
                } else {
                    if (this.f5009a == 1) {
                        this.f5011c.b(qVar);
                    }
                    this.f5011c.a(qVar);
                }
                this.f5009a = 1;
                return this;
            }

            public C0096a a(int i) {
                this.f5009a = 2;
                this.f5010b = Integer.valueOf(i);
                x();
                return this;
            }

            public C0096a a(aa aaVar) {
                if (aaVar == null) {
                    throw new NullPointerException();
                }
                this.f5009a = 2;
                this.f5010b = Integer.valueOf(aaVar.a());
                x();
                return this;
            }

            public C0096a a(d dVar) {
                if (this.f5012d != null) {
                    this.f5012d.a(dVar);
                } else if (dVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5010b = dVar;
                    x();
                }
                this.f5009a = 3;
                return this;
            }

            public C0096a b(d dVar) {
                if (this.f5012d == null) {
                    if (this.f5009a == 3 && this.f5010b != d.g()) {
                        this.f5010b = d.a((d) this.f5010b).a(dVar).r();
                    } else {
                        this.f5010b = dVar;
                    }
                    x();
                } else {
                    if (this.f5009a == 3) {
                        this.f5012d.b(dVar);
                    }
                    this.f5012d.a(dVar);
                }
                this.f5009a = 3;
                return this;
            }

            public C0096a a(ax.C0101a c0101a) {
                if (this.e == null) {
                    this.f5010b = c0101a.t();
                    x();
                } else {
                    this.e.a(c0101a.t());
                }
                this.f5009a = 16;
                return this;
            }

            public C0096a a(ax axVar) {
                if (this.e == null) {
                    if (this.f5009a == 16 && this.f5010b != ax.l()) {
                        this.f5010b = ax.a((ax) this.f5010b).a(axVar).r();
                    } else {
                        this.f5010b = axVar;
                    }
                    x();
                } else {
                    if (this.f5009a == 16) {
                        this.e.b(axVar);
                    }
                    this.e.a(axVar);
                }
                this.f5009a = 16;
                return this;
            }
        }

        public static al k() {
            return f;
        }

        public static com.google.protobuf.ai<al> l() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<al> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: m */
        public al F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class m extends com.google.protobuf.s implements n {
        private static final m f = new m();
        private static final com.google.protobuf.ai<m> g = new com.google.protobuf.c<m>() { // from class: com.teslamotors.a.a.m.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public m d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new m(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private boolean f5088a;

        /* renamed from: d  reason: collision with root package name */
        private al f5089d;
        private byte e;

        private m(s.a<?> aVar) {
            super(aVar);
            this.e = (byte) -1;
        }

        private m() {
            this.e = (byte) -1;
            this.f5088a = false;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private m(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                if (a2 == 8) {
                                    this.f5088a = gVar.i();
                                } else if (a2 != 18) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    al.C0096a D = this.f5089d != null ? this.f5089d.D() : null;
                                    this.f5089d = (al) gVar.a(al.l(), pVar);
                                    if (D != null) {
                                        D.a(this.f5089d);
                                        this.f5089d = D.r();
                                    }
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.G;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.H.a(m.class, C0107a.class);
        }

        public boolean c() {
            return this.f5088a;
        }

        public boolean d() {
            return this.f5089d != null;
        }

        public al e() {
            return this.f5089d == null ? al.k() : this.f5089d;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5088a) {
                hVar.a(1, this.f5088a);
            }
            if (this.f5089d != null) {
                hVar.a(2, e());
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5088a) {
                i2 = 0 + com.google.protobuf.h.b(1, this.f5088a);
            }
            if (this.f5089d != null) {
                i2 += com.google.protobuf.h.c(2, e());
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof m)) {
                return super.equals(obj);
            }
            m mVar = (m) obj;
            boolean z = (c() == mVar.c()) && d() == mVar.d();
            return d() ? z && e().equals(mVar.e()) : z;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((779 + a().hashCode()) * 37) + 1) * 53) + com.google.protobuf.t.a(c());
            if (d()) {
                hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: f */
        public C0107a C() {
            return g();
        }

        public static C0107a g() {
            return f.D();
        }

        public static C0107a a(m mVar) {
            return f.D().a(mVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: h */
        public C0107a D() {
            return this == f ? new C0107a() : new C0107a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0107a b(s.b bVar) {
            return new C0107a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$m$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0107a extends s.a<C0107a> implements n {

            /* renamed from: a  reason: collision with root package name */
            private boolean f5090a;

            /* renamed from: b  reason: collision with root package name */
            private al f5091b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<al, al.C0096a, am> f5092c;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0107a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0107a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.H.a(m.class, C0107a.class);
            }

            private C0107a() {
                this.f5091b = null;
                j();
            }

            private C0107a(s.b bVar) {
                super(bVar);
                this.f5091b = null;
                j();
            }

            private void j() {
                boolean unused = m.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.G;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public m F() {
                return m.i();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public m t() {
                m r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public m r() {
                m mVar = new m(this);
                mVar.f5088a = this.f5090a;
                if (this.f5092c == null) {
                    mVar.f5089d = this.f5091b;
                } else {
                    mVar.f5089d = this.f5092c.c();
                }
                u();
                return mVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0107a q() {
                return (C0107a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0107a f(j.f fVar, Object obj) {
                return (C0107a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0107a e(j.f fVar, Object obj) {
                return (C0107a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0107a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof m) {
                    return a((m) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0107a a(m mVar) {
                if (mVar == m.i()) {
                    return this;
                }
                if (mVar.c()) {
                    a(mVar.c());
                }
                if (mVar.d()) {
                    a(mVar.e());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.m.C0107a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.m.m()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$m r3 = (com.teslamotors.a.a.m) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$m r4 = (com.teslamotors.a.a.m) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.m.C0107a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$m$a");
            }

            public C0107a a(boolean z) {
                this.f5090a = z;
                x();
                return this;
            }

            public C0107a a(al alVar) {
                if (this.f5092c == null) {
                    if (this.f5091b != null) {
                        this.f5091b = al.a(this.f5091b).a(alVar).r();
                    } else {
                        this.f5091b = alVar;
                    }
                    x();
                } else {
                    this.f5092c.b(alVar);
                }
                return this;
            }
        }

        public static m i() {
            return f;
        }

        public static com.google.protobuf.ai<m> j() {
            return g;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<m> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public m F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class b extends com.google.protobuf.s implements c {
        private static final b g = new b();
        private static final com.google.protobuf.ai<b> h = new com.google.protobuf.c<b>() { // from class: com.teslamotors.a.a.b.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public b d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new b(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private t f5055a;

        /* renamed from: d  reason: collision with root package name */
        private ab f5056d;
        private int e;
        private byte f;

        private b(s.a<?> aVar) {
            super(aVar);
            this.f = (byte) -1;
        }

        private b() {
            this.f = (byte) -1;
            this.e = 0;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private b(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                ab.C0092a c0092a = null;
                                t.C0110a D = null;
                                if (a2 == 10) {
                                    D = this.f5055a != null ? this.f5055a.D() : D;
                                    this.f5055a = (t) gVar.a(t.h(), pVar);
                                    if (D != null) {
                                        D.a(this.f5055a);
                                        this.f5055a = D.r();
                                    }
                                } else if (a2 == 18) {
                                    c0092a = this.f5056d != null ? this.f5056d.D() : c0092a;
                                    this.f5056d = (ab) gVar.a(ab.j(), pVar);
                                    if (c0092a != null) {
                                        c0092a.a(this.f5056d);
                                        this.f5056d = c0092a.r();
                                    }
                                } else if (a2 != 24) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    this.e = gVar.n();
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.I;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.J.a(b.class, C0102a.class);
        }

        public boolean c() {
            return this.f5055a != null;
        }

        public t d() {
            return this.f5055a == null ? t.g() : this.f5055a;
        }

        public boolean e() {
            return this.f5056d != null;
        }

        public ab f() {
            return this.f5056d == null ? ab.i() : this.f5056d;
        }

        public int g() {
            return this.e;
        }

        public EnumC0091a h() {
            EnumC0091a a2 = EnumC0091a.a(this.e);
            return a2 == null ? EnumC0091a.UNRECOGNIZED : a2;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5055a != null) {
                hVar.a(1, d());
            }
            if (this.f5056d != null) {
                hVar.a(2, f());
            }
            if (this.e != EnumC0091a.AUTHENTICATION_LEVEL_NONE.a()) {
                hVar.e(3, this.e);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5055a != null) {
                i2 = 0 + com.google.protobuf.h.c(1, d());
            }
            if (this.f5056d != null) {
                i2 += com.google.protobuf.h.c(2, f());
            }
            if (this.e != EnumC0091a.AUTHENTICATION_LEVEL_NONE.a()) {
                i2 += com.google.protobuf.h.i(3, this.e);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            boolean z = c() == bVar.c();
            if (c()) {
                z = z && d().equals(bVar.d());
            }
            boolean z2 = z && e() == bVar.e();
            if (e()) {
                z2 = z2 && f().equals(bVar.f());
            }
            return z2 && this.e == bVar.e;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            if (c()) {
                hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
            }
            if (e()) {
                hashCode = (((hashCode * 37) + 2) * 53) + f().hashCode();
            }
            int hashCode2 = (((((hashCode * 37) + 3) * 53) + this.e) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: i */
        public C0102a C() {
            return j();
        }

        public static C0102a j() {
            return g.D();
        }

        public static C0102a a(b bVar) {
            return g.D().a(bVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: k */
        public C0102a D() {
            return this == g ? new C0102a() : new C0102a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0102a b(s.b bVar) {
            return new C0102a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0102a extends s.a<C0102a> implements c {

            /* renamed from: a  reason: collision with root package name */
            private t f5057a;

            /* renamed from: b  reason: collision with root package name */
            private com.google.protobuf.an<t, t.C0110a, u> f5058b;

            /* renamed from: c  reason: collision with root package name */
            private ab f5059c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.an<ab, ab.C0092a, ac> f5060d;
            private int e;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0102a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0102a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.J.a(b.class, C0102a.class);
            }

            private C0102a() {
                this.f5057a = null;
                this.f5059c = null;
                this.e = 0;
                j();
            }

            private C0102a(s.b bVar) {
                super(bVar);
                this.f5057a = null;
                this.f5059c = null;
                this.e = 0;
                j();
            }

            private void j() {
                boolean unused = b.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.I;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public b F() {
                return b.l();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public b t() {
                b r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public b r() {
                b bVar = new b(this);
                if (this.f5058b == null) {
                    bVar.f5055a = this.f5057a;
                } else {
                    bVar.f5055a = this.f5058b.c();
                }
                if (this.f5060d == null) {
                    bVar.f5056d = this.f5059c;
                } else {
                    bVar.f5056d = this.f5060d.c();
                }
                bVar.e = this.e;
                u();
                return bVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0102a q() {
                return (C0102a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0102a f(j.f fVar, Object obj) {
                return (C0102a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0102a e(j.f fVar, Object obj) {
                return (C0102a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0102a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof b) {
                    return a((b) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0102a a(b bVar) {
                if (bVar == b.l()) {
                    return this;
                }
                if (bVar.c()) {
                    a(bVar.d());
                }
                if (bVar.e()) {
                    a(bVar.f());
                }
                if (bVar.e != 0) {
                    a(bVar.g());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.b.C0102a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.b.p()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$b r3 = (com.teslamotors.a.a.b) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$b r4 = (com.teslamotors.a.a.b) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.b.C0102a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$b$a");
            }

            public C0102a a(t tVar) {
                if (this.f5058b == null) {
                    if (this.f5057a != null) {
                        this.f5057a = t.a(this.f5057a).a(tVar).r();
                    } else {
                        this.f5057a = tVar;
                    }
                    x();
                } else {
                    this.f5058b.b(tVar);
                }
                return this;
            }

            public C0102a a(ab abVar) {
                if (this.f5060d == null) {
                    if (this.f5059c != null) {
                        this.f5059c = ab.a(this.f5059c).a(abVar).r();
                    } else {
                        this.f5059c = abVar;
                    }
                    x();
                } else {
                    this.f5060d.b(abVar);
                }
                return this;
            }

            public C0102a a(int i) {
                this.e = i;
                x();
                return this;
            }
        }

        public static b l() {
            return g;
        }

        public static com.google.protobuf.ai<b> m() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<b> getParserForType() {
            return h;
        }

        @Override // com.google.protobuf.af
        /* renamed from: n */
        public b F() {
            return g;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class ab extends com.google.protobuf.s implements ac {
        private static final ab g = new ab();
        private static final com.google.protobuf.ai<ab> h = new com.google.protobuf.c<ab>() { // from class: com.teslamotors.a.a.ab.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public ab d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new ab(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private com.google.protobuf.f f4974a;

        /* renamed from: d  reason: collision with root package name */
        private int f4975d;
        private com.google.protobuf.f e;
        private byte f;

        private ab(s.a<?> aVar) {
            super(aVar);
            this.f = (byte) -1;
        }

        private ab() {
            this.f = (byte) -1;
            this.f4974a = com.google.protobuf.f.f4423a;
            this.f4975d = 0;
            this.e = com.google.protobuf.f.f4423a;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private ab(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            if (a2 == 10) {
                                this.f4974a = gVar.l();
                            } else if (a2 == 16) {
                                this.f4975d = gVar.m();
                            } else if (a2 != 26) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                this.e = gVar.l();
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.M;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.N.a(ab.class, C0092a.class);
        }

        public com.google.protobuf.f c() {
            return this.f4974a;
        }

        public int d() {
            return this.f4975d;
        }

        public com.google.protobuf.f e() {
            return this.e;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.f;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (!this.f4974a.c()) {
                hVar.a(1, this.f4974a);
            }
            if (this.f4975d != 0) {
                hVar.c(2, this.f4975d);
            }
            if (!this.e.c()) {
                hVar.a(3, this.e);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.f4974a.c()) {
                i2 = 0 + com.google.protobuf.h.c(1, this.f4974a);
            }
            if (this.f4975d != 0) {
                i2 += com.google.protobuf.h.g(2, this.f4975d);
            }
            if (!this.e.c()) {
                i2 += com.google.protobuf.h.c(3, this.e);
            }
            this.memoizedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ab)) {
                return super.equals(obj);
            }
            ab abVar = (ab) obj;
            return ((c().equals(abVar.c())) && d() == abVar.d()) && e().equals(abVar.e());
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((((((((779 + a().hashCode()) * 37) + 1) * 53) + c().hashCode()) * 37) + 2) * 53) + d()) * 37) + 3) * 53) + e().hashCode()) * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode;
            return hashCode;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: f */
        public C0092a C() {
            return g();
        }

        public static C0092a g() {
            return g.D();
        }

        public static C0092a a(ab abVar) {
            return g.D().a(abVar);
        }

        @Override // com.google.protobuf.ac
        /* renamed from: h */
        public C0092a D() {
            return this == g ? new C0092a() : new C0092a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0092a b(s.b bVar) {
            return new C0092a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$ab$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0092a extends s.a<C0092a> implements ac {

            /* renamed from: a  reason: collision with root package name */
            private com.google.protobuf.f f4976a;

            /* renamed from: b  reason: collision with root package name */
            private int f4977b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.f f4978c;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0092a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0092a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.N.a(ab.class, C0092a.class);
            }

            private C0092a() {
                this.f4976a = com.google.protobuf.f.f4423a;
                this.f4978c = com.google.protobuf.f.f4423a;
                j();
            }

            private C0092a(s.b bVar) {
                super(bVar);
                this.f4976a = com.google.protobuf.f.f4423a;
                this.f4978c = com.google.protobuf.f.f4423a;
                j();
            }

            private void j() {
                boolean unused = ab.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.M;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public ab F() {
                return ab.i();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public ab t() {
                ab r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public ab r() {
                ab abVar = new ab(this);
                abVar.f4974a = this.f4976a;
                abVar.f4975d = this.f4977b;
                abVar.e = this.f4978c;
                u();
                return abVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0092a q() {
                return (C0092a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0092a f(j.f fVar, Object obj) {
                return (C0092a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0092a e(j.f fVar, Object obj) {
                return (C0092a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0092a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof ab) {
                    return a((ab) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0092a a(ab abVar) {
                if (abVar == ab.i()) {
                    return this;
                }
                if (abVar.c() != com.google.protobuf.f.f4423a) {
                    a(abVar.c());
                }
                if (abVar.d() != 0) {
                    a(abVar.d());
                }
                if (abVar.e() != com.google.protobuf.f.f4423a) {
                    b(abVar.e());
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.ab.C0092a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.ab.m()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$ab r3 = (com.teslamotors.a.a.ab) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$ab r4 = (com.teslamotors.a.a.ab) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.ab.C0092a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$ab$a");
            }

            public C0092a a(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f4976a = fVar;
                x();
                return this;
            }

            public C0092a a(int i) {
                this.f4977b = i;
                x();
                return this;
            }

            public C0092a b(com.google.protobuf.f fVar) {
                if (fVar == null) {
                    throw new NullPointerException();
                }
                this.f4978c = fVar;
                x();
                return this;
            }
        }

        public static ab i() {
            return g;
        }

        public static com.google.protobuf.ai<ab> j() {
            return h;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<ab> getParserForType() {
            return h;
        }

        @Override // com.google.protobuf.af
        /* renamed from: k */
        public ab F() {
            return g;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class aj extends com.google.protobuf.s implements ak {
        private static final aj f = new aj();
        private static final com.google.protobuf.ai<aj> g = new com.google.protobuf.c<aj>() { // from class: com.teslamotors.a.a.aj.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public aj d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new aj(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f4997a;

        /* renamed from: d  reason: collision with root package name */
        private Object f4998d;
        private byte e;

        private aj(s.a<?> aVar) {
            super(aVar);
            this.f4997a = 0;
            this.e = (byte) -1;
        }

        private aj() {
            this.f4997a = 0;
            this.e = (byte) -1;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private aj(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int a2 = gVar.a();
                            if (a2 != 0) {
                                al.C0096a c0096a = null;
                                ae.C0093a D = null;
                                if (a2 == 10) {
                                    D = this.f4997a == 1 ? ((ae) this.f4998d).D() : D;
                                    this.f4998d = gVar.a(ae.m(), pVar);
                                    if (D != null) {
                                        D.a((ae) this.f4998d);
                                        this.f4998d = D.r();
                                    }
                                    this.f4997a = 1;
                                } else if (a2 != 18) {
                                    if (!gVar.b(a2)) {
                                    }
                                } else {
                                    c0096a = this.f4997a == 2 ? ((al) this.f4998d).D() : c0096a;
                                    this.f4998d = gVar.a(al.l(), pVar);
                                    if (c0096a != null) {
                                        c0096a.a((al) this.f4998d);
                                        this.f4998d = c0096a.r();
                                    }
                                    this.f4997a = 2;
                                }
                            }
                            z = true;
                        } catch (com.google.protobuf.u e) {
                            throw e.a(this);
                        }
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.O;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.P.a(aj.class, C0095a.class);
        }

        /* compiled from: VCSEC.java */
        /* loaded from: classes.dex */
        public enum b implements t.a {
            SIGNEDMESSAGE(1),
            UNSIGNEDMESSAGE(2),
            SUBMESSAGE_NOT_SET(0);
            

            /* renamed from: d  reason: collision with root package name */
            private final int f5006d;

            b(int i) {
                this.f5006d = i;
            }

            public static b a(int i) {
                switch (i) {
                    case 0:
                        return SUBMESSAGE_NOT_SET;
                    case 1:
                        return SIGNEDMESSAGE;
                    case 2:
                        return UNSIGNEDMESSAGE;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.t.a
            public int a() {
                return this.f5006d;
            }
        }

        public b c() {
            return b.a(this.f4997a);
        }

        public ae d() {
            if (this.f4997a == 1) {
                return (ae) this.f4998d;
            }
            return ae.l();
        }

        public al e() {
            if (this.f4997a == 2) {
                return (al) this.f4998d;
            }
            return al.k();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f4997a == 1) {
                hVar.a(1, (ae) this.f4998d);
            }
            if (this.f4997a == 2) {
                hVar.a(2, (al) this.f4998d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f4997a == 1) {
                i2 = 0 + com.google.protobuf.h.c(1, (ae) this.f4998d);
            }
            if (this.f4997a == 2) {
                i2 += com.google.protobuf.h.c(2, (al) this.f4998d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x003a A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[RETURN, SYNTHETIC] */
        @Override // com.google.protobuf.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.teslamotors.a.a.aj
                if (r1 != 0) goto Ld
                boolean r5 = super.equals(r5)
                return r5
            Ld:
                com.teslamotors.a.a$aj r5 = (com.teslamotors.a.a.aj) r5
                com.teslamotors.a.a$aj$b r1 = r4.c()
                com.teslamotors.a.a$aj$b r2 = r5.c()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 == 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 != 0) goto L24
                return r2
            L24:
                int r3 = r4.f4997a
                switch(r3) {
                    case 1: goto L3e;
                    case 2: goto L2a;
                    default: goto L29;
                }
            L29:
                goto L4f
            L2a:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$al r1 = r4.e()
                com.teslamotors.a.a$al r5 = r5.e()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
            L3a:
                r1 = 1
                goto L4f
            L3c:
                r1 = 0
                goto L4f
            L3e:
                if (r1 == 0) goto L3c
                com.teslamotors.a.a$ae r1 = r4.d()
                com.teslamotors.a.a$ae r5 = r5.d()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3c
                goto L3a
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.aj.equals(java.lang.Object):boolean");
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            switch (this.f4997a) {
                case 1:
                    hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
                    break;
                case 2:
                    hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
                    break;
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.google.protobuf.ab
        /* renamed from: f */
        public C0095a C() {
            return g();
        }

        public static C0095a g() {
            return f.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: h */
        public C0095a D() {
            return this == f ? new C0095a() : new C0095a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0095a b(s.b bVar) {
            return new C0095a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$aj$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0095a extends s.a<C0095a> implements ak {

            /* renamed from: a  reason: collision with root package name */
            private int f4999a;

            /* renamed from: b  reason: collision with root package name */
            private Object f5000b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<ae, ae.C0093a, af> f5001c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.an<al, al.C0096a, am> f5002d;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0095a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0095a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.P.a(aj.class, C0095a.class);
            }

            private C0095a() {
                this.f4999a = 0;
                j();
            }

            private C0095a(s.b bVar) {
                super(bVar);
                this.f4999a = 0;
                j();
            }

            private void j() {
                boolean unused = aj.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.O;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public aj F() {
                return aj.i();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public aj t() {
                aj r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public aj r() {
                aj ajVar = new aj(this);
                if (this.f4999a == 1) {
                    if (this.f5001c == null) {
                        ajVar.f4998d = this.f5000b;
                    } else {
                        ajVar.f4998d = this.f5001c.c();
                    }
                }
                if (this.f4999a == 2) {
                    if (this.f5002d == null) {
                        ajVar.f4998d = this.f5000b;
                    } else {
                        ajVar.f4998d = this.f5002d.c();
                    }
                }
                ajVar.f4997a = this.f4999a;
                u();
                return ajVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0095a q() {
                return (C0095a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0095a f(j.f fVar, Object obj) {
                return (C0095a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0095a e(j.f fVar, Object obj) {
                return (C0095a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0095a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof aj) {
                    return a((aj) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0095a a(aj ajVar) {
                if (ajVar == aj.i()) {
                    return this;
                }
                switch (ajVar.c()) {
                    case SIGNEDMESSAGE:
                        b(ajVar.d());
                        break;
                    case UNSIGNEDMESSAGE:
                        b(ajVar.e());
                        break;
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.aj.C0095a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.aj.l()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$aj r3 = (com.teslamotors.a.a.aj) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$aj r4 = (com.teslamotors.a.a.aj) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.aj.C0095a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$aj$a");
            }

            public C0095a a(ae aeVar) {
                if (this.f5001c != null) {
                    this.f5001c.a(aeVar);
                } else if (aeVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5000b = aeVar;
                    x();
                }
                this.f4999a = 1;
                return this;
            }

            public C0095a b(ae aeVar) {
                if (this.f5001c == null) {
                    if (this.f4999a == 1 && this.f5000b != ae.l()) {
                        this.f5000b = ae.a((ae) this.f5000b).a(aeVar).r();
                    } else {
                        this.f5000b = aeVar;
                    }
                    x();
                } else {
                    if (this.f4999a == 1) {
                        this.f5001c.b(aeVar);
                    }
                    this.f5001c.a(aeVar);
                }
                this.f4999a = 1;
                return this;
            }

            public C0095a a(al alVar) {
                if (this.f5002d != null) {
                    this.f5002d.a(alVar);
                } else if (alVar == null) {
                    throw new NullPointerException();
                } else {
                    this.f5000b = alVar;
                    x();
                }
                this.f4999a = 2;
                return this;
            }

            public C0095a b(al alVar) {
                if (this.f5002d == null) {
                    if (this.f4999a == 2 && this.f5000b != al.k()) {
                        this.f5000b = al.a((al) this.f5000b).a(alVar).r();
                    } else {
                        this.f5000b = alVar;
                    }
                    x();
                } else {
                    if (this.f4999a == 2) {
                        this.f5002d.b(alVar);
                    }
                    this.f5002d.a(alVar);
                }
                this.f4999a = 2;
                return this;
            }
        }

        public static aj i() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<aj> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: j */
        public aj F() {
            return f;
        }
    }

    /* compiled from: VCSEC.java */
    /* loaded from: classes.dex */
    public static final class o extends com.google.protobuf.s implements p {
        private static final o f = new o();
        private static final com.google.protobuf.ai<o> g = new com.google.protobuf.c<o>() { // from class: com.teslamotors.a.a.o.1
            @Override // com.google.protobuf.ai
            /* renamed from: c */
            public o d(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
                return new o(gVar, pVar);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        private int f5093a;

        /* renamed from: d  reason: collision with root package name */
        private Object f5094d;
        private byte e;

        private o(s.a<?> aVar) {
            super(aVar);
            this.f5093a = 0;
            this.e = (byte) -1;
        }

        private o() {
            this.f5093a = 0;
            this.e = (byte) -1;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.af
        public final com.google.protobuf.at getUnknownFields() {
            return com.google.protobuf.at.b();
        }

        private o(com.google.protobuf.g gVar, com.google.protobuf.p pVar) {
            this();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int a2 = gVar.a();
                        if (a2 != 0) {
                            m.C0107a c0107a = null;
                            aq.C0098a D = null;
                            ab.C0092a D2 = null;
                            b.C0102a D3 = null;
                            k.C0106a D4 = null;
                            au.C0100a D5 = null;
                            as.C0099a D6 = null;
                            an.C0097a D7 = null;
                            f.C0104a D8 = null;
                            if (a2 == 10) {
                                D = this.f5093a == 1 ? ((aq) this.f5094d).D() : D;
                                this.f5094d = gVar.a(aq.k(), pVar);
                                if (D != null) {
                                    D.a((aq) this.f5094d);
                                    this.f5094d = D.r();
                                }
                                this.f5093a = 1;
                            } else if (a2 == 18) {
                                D2 = this.f5093a == 2 ? ((ab) this.f5094d).D() : D2;
                                this.f5094d = gVar.a(ab.j(), pVar);
                                if (D2 != null) {
                                    D2.a((ab) this.f5094d);
                                    this.f5094d = D2.r();
                                }
                                this.f5093a = 2;
                            } else if (a2 == 26) {
                                D3 = this.f5093a == 3 ? ((b) this.f5094d).D() : D3;
                                this.f5094d = gVar.a(b.m(), pVar);
                                if (D3 != null) {
                                    D3.a((b) this.f5094d);
                                    this.f5094d = D3.r();
                                }
                                this.f5093a = 3;
                            } else if (a2 == 34) {
                                D4 = this.f5093a == 4 ? ((k) this.f5094d).D() : D4;
                                this.f5094d = gVar.a(k.k(), pVar);
                                if (D4 != null) {
                                    D4.a((k) this.f5094d);
                                    this.f5094d = D4.r();
                                }
                                this.f5093a = 4;
                            } else if (a2 == 130) {
                                D5 = this.f5093a == 16 ? ((au) this.f5094d).D() : D5;
                                this.f5094d = gVar.a(au.j(), pVar);
                                if (D5 != null) {
                                    D5.a((au) this.f5094d);
                                    this.f5094d = D5.r();
                                }
                                this.f5093a = 16;
                            } else if (a2 == 138) {
                                D6 = this.f5093a == 17 ? ((as) this.f5094d).D() : D6;
                                this.f5094d = gVar.a(as.m(), pVar);
                                if (D6 != null) {
                                    D6.a((as) this.f5094d);
                                    this.f5094d = D6.r();
                                }
                                this.f5093a = 17;
                            } else if (a2 == 146) {
                                D7 = this.f5093a == 18 ? ((an) this.f5094d).D() : D7;
                                this.f5094d = gVar.a(an.i(), pVar);
                                if (D7 != null) {
                                    D7.a((an) this.f5094d);
                                    this.f5094d = D7.r();
                                }
                                this.f5093a = 18;
                            } else if (a2 == 154) {
                                D8 = this.f5093a == 19 ? ((f) this.f5094d).D() : D8;
                                this.f5094d = gVar.a(f.i(), pVar);
                                if (D8 != null) {
                                    D8.a((f) this.f5094d);
                                    this.f5094d = D8.r();
                                }
                                this.f5093a = 19;
                            } else if (a2 != 162) {
                                if (!gVar.b(a2)) {
                                }
                            } else {
                                c0107a = this.f5093a == 20 ? ((m) this.f5094d).D() : c0107a;
                                this.f5094d = gVar.a(m.j(), pVar);
                                if (c0107a != null) {
                                    c0107a.a((m) this.f5094d);
                                    this.f5094d = c0107a.r();
                                }
                                this.f5093a = 20;
                            }
                        }
                        z = true;
                    } catch (com.google.protobuf.u e) {
                        throw e.a(this);
                    } catch (IOException e2) {
                        throw new com.google.protobuf.u(e2).a(this);
                    }
                } finally {
                    V();
                }
            }
        }

        public static final j.a a() {
            return a.Q;
        }

        @Override // com.google.protobuf.s
        protected s.f b() {
            return a.R.a(o.class, C0108a.class);
        }

        /* compiled from: VCSEC.java */
        /* loaded from: classes.dex */
        public enum b implements t.a {
            VEHICLESTATUS(1),
            SESSIONINFO(2),
            AUTHENTICATIONREQUEST(3),
            COMMANDSTATUS(4),
            WHITELISTINFO(16),
            WHITELISTENTRYINFO(17),
            VEHICLEINFO(18),
            CAPABILITIES(19),
            EXTERNALAUTHSTATUS(20),
            SUBMESSAGE_NOT_SET(0);
            
            private final int k;

            b(int i) {
                this.k = i;
            }

            public static b a(int i) {
                switch (i) {
                    case 0:
                        return SUBMESSAGE_NOT_SET;
                    case 1:
                        return VEHICLESTATUS;
                    case 2:
                        return SESSIONINFO;
                    case 3:
                        return AUTHENTICATIONREQUEST;
                    case 4:
                        return COMMANDSTATUS;
                    default:
                        switch (i) {
                            case 16:
                                return WHITELISTINFO;
                            case 17:
                                return WHITELISTENTRYINFO;
                            case 18:
                                return VEHICLEINFO;
                            case 19:
                                return CAPABILITIES;
                            case 20:
                                return EXTERNALAUTHSTATUS;
                            default:
                                return null;
                        }
                }
            }

            @Override // com.google.protobuf.t.a
            public int a() {
                return this.k;
            }
        }

        public b c() {
            return b.a(this.f5093a);
        }

        public aq d() {
            if (this.f5093a == 1) {
                return (aq) this.f5094d;
            }
            return aq.j();
        }

        public ab e() {
            if (this.f5093a == 2) {
                return (ab) this.f5094d;
            }
            return ab.i();
        }

        public b f() {
            if (this.f5093a == 3) {
                return (b) this.f5094d;
            }
            return b.l();
        }

        public k g() {
            if (this.f5093a == 4) {
                return (k) this.f5094d;
            }
            return k.j();
        }

        public au h() {
            if (this.f5093a == 16) {
                return (au) this.f5094d;
            }
            return au.i();
        }

        public as i() {
            if (this.f5093a == 17) {
                return (as) this.f5094d;
            }
            return as.l();
        }

        public an j() {
            if (this.f5093a == 18) {
                return (an) this.f5094d;
            }
            return an.h();
        }

        public f k() {
            if (this.f5093a == 19) {
                return (f) this.f5094d;
            }
            return f.h();
        }

        public m l() {
            if (this.f5093a == 20) {
                return (m) this.f5094d;
            }
            return m.i();
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ad
        public final boolean isInitialized() {
            byte b2 = this.e;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.e = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public void writeTo(com.google.protobuf.h hVar) {
            if (this.f5093a == 1) {
                hVar.a(1, (aq) this.f5094d);
            }
            if (this.f5093a == 2) {
                hVar.a(2, (ab) this.f5094d);
            }
            if (this.f5093a == 3) {
                hVar.a(3, (b) this.f5094d);
            }
            if (this.f5093a == 4) {
                hVar.a(4, (k) this.f5094d);
            }
            if (this.f5093a == 16) {
                hVar.a(16, (au) this.f5094d);
            }
            if (this.f5093a == 17) {
                hVar.a(17, (as) this.f5094d);
            }
            if (this.f5093a == 18) {
                hVar.a(18, (an) this.f5094d);
            }
            if (this.f5093a == 19) {
                hVar.a(19, (f) this.f5094d);
            }
            if (this.f5093a == 20) {
                hVar.a(20, (m) this.f5094d);
            }
        }

        @Override // com.google.protobuf.s, com.google.protobuf.a, com.google.protobuf.ac
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.f5093a == 1) {
                i2 = 0 + com.google.protobuf.h.c(1, (aq) this.f5094d);
            }
            if (this.f5093a == 2) {
                i2 += com.google.protobuf.h.c(2, (ab) this.f5094d);
            }
            if (this.f5093a == 3) {
                i2 += com.google.protobuf.h.c(3, (b) this.f5094d);
            }
            if (this.f5093a == 4) {
                i2 += com.google.protobuf.h.c(4, (k) this.f5094d);
            }
            if (this.f5093a == 16) {
                i2 += com.google.protobuf.h.c(16, (au) this.f5094d);
            }
            if (this.f5093a == 17) {
                i2 += com.google.protobuf.h.c(17, (as) this.f5094d);
            }
            if (this.f5093a == 18) {
                i2 += com.google.protobuf.h.c(18, (an) this.f5094d);
            }
            if (this.f5093a == 19) {
                i2 += com.google.protobuf.h.c(19, (f) this.f5094d);
            }
            if (this.f5093a == 20) {
                i2 += com.google.protobuf.h.c(20, (m) this.f5094d);
            }
            this.memoizedSize = i2;
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0041 A[RETURN, SYNTHETIC] */
        @Override // com.google.protobuf.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.teslamotors.a.a.o
                if (r1 != 0) goto Ld
                boolean r5 = super.equals(r5)
                return r5
            Ld:
                com.teslamotors.a.a$o r5 = (com.teslamotors.a.a.o) r5
                com.teslamotors.a.a$o$b r1 = r4.c()
                com.teslamotors.a.a$o$b r2 = r5.c()
                boolean r1 = r1.equals(r2)
                r2 = 0
                if (r1 == 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 != 0) goto L24
                return r2
            L24:
                int r3 = r4.f5093a
                switch(r3) {
                    case 1: goto Lbb;
                    case 2: goto Laa;
                    case 3: goto L99;
                    case 4: goto L88;
                    default: goto L29;
                }
            L29:
                switch(r3) {
                    case 16: goto L77;
                    case 17: goto L66;
                    case 18: goto L55;
                    case 19: goto L44;
                    case 20: goto L2e;
                    default: goto L2c;
                }
            L2c:
                goto Lcd
            L2e:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$m r1 = r4.l()
                com.teslamotors.a.a$m r5 = r5.l()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
            L3e:
                r1 = 1
                goto Lcd
            L41:
                r1 = 0
                goto Lcd
            L44:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$f r1 = r4.k()
                com.teslamotors.a.a$f r5 = r5.k()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            L55:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$an r1 = r4.j()
                com.teslamotors.a.a$an r5 = r5.j()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            L66:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$as r1 = r4.i()
                com.teslamotors.a.a$as r5 = r5.i()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            L77:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$au r1 = r4.h()
                com.teslamotors.a.a$au r5 = r5.h()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            L88:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$k r1 = r4.g()
                com.teslamotors.a.a$k r5 = r5.g()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            L99:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$b r1 = r4.f()
                com.teslamotors.a.a$b r5 = r5.f()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            Laa:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$ab r1 = r4.e()
                com.teslamotors.a.a$ab r5 = r5.e()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            Lbb:
                if (r1 == 0) goto L41
                com.teslamotors.a.a$aq r1 = r4.d()
                com.teslamotors.a.a$aq r5 = r5.d()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L41
                goto L3e
            Lcd:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.o.equals(java.lang.Object):boolean");
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = 779 + a().hashCode();
            int i = this.f5093a;
            switch (i) {
                case 1:
                    hashCode = (((hashCode * 37) + 1) * 53) + d().hashCode();
                    break;
                case 2:
                    hashCode = (((hashCode * 37) + 2) * 53) + e().hashCode();
                    break;
                case 3:
                    hashCode = (((hashCode * 37) + 3) * 53) + f().hashCode();
                    break;
                case 4:
                    hashCode = (((hashCode * 37) + 4) * 53) + g().hashCode();
                    break;
                default:
                    switch (i) {
                        case 16:
                            hashCode = (((hashCode * 37) + 16) * 53) + h().hashCode();
                            break;
                        case 17:
                            hashCode = (((hashCode * 37) + 17) * 53) + i().hashCode();
                            break;
                        case 18:
                            hashCode = (((hashCode * 37) + 18) * 53) + j().hashCode();
                            break;
                        case 19:
                            hashCode = (((hashCode * 37) + 19) * 53) + k().hashCode();
                            break;
                        case 20:
                            hashCode = (((hashCode * 37) + 20) * 53) + l().hashCode();
                            break;
                    }
            }
            int hashCode2 = (hashCode * 29) + this.f4720c.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static o a(byte[] bArr) {
            return g.b(bArr);
        }

        @Override // com.google.protobuf.ab
        /* renamed from: m */
        public C0108a C() {
            return n();
        }

        public static C0108a n() {
            return f.D();
        }

        @Override // com.google.protobuf.ac
        /* renamed from: o */
        public C0108a D() {
            return this == f ? new C0108a() : new C0108a().a(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.s
        /* renamed from: a */
        public C0108a b(s.b bVar) {
            return new C0108a(bVar);
        }

        /* compiled from: VCSEC.java */
        /* renamed from: com.teslamotors.a.a$o$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0108a extends s.a<C0108a> implements p {

            /* renamed from: a  reason: collision with root package name */
            private int f5095a;

            /* renamed from: b  reason: collision with root package name */
            private Object f5096b;

            /* renamed from: c  reason: collision with root package name */
            private com.google.protobuf.an<aq, aq.C0098a, ar> f5097c;

            /* renamed from: d  reason: collision with root package name */
            private com.google.protobuf.an<ab, ab.C0092a, ac> f5098d;
            private com.google.protobuf.an<b, b.C0102a, c> e;
            private com.google.protobuf.an<k, k.C0106a, l> f;
            private com.google.protobuf.an<au, au.C0100a, av> g;
            private com.google.protobuf.an<as, as.C0099a, at> h;
            private com.google.protobuf.an<an, an.C0097a, ao> i;
            private com.google.protobuf.an<f, f.C0104a, g> j;
            private com.google.protobuf.an<m, m.C0107a, n> k;

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public final C0108a f(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: c */
            public final C0108a d(com.google.protobuf.at atVar) {
                return this;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ad
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.s.a
            protected s.f e() {
                return a.R.a(o.class, C0108a.class);
            }

            private C0108a() {
                this.f5095a = 0;
                j();
            }

            private C0108a(s.b bVar) {
                super(bVar);
                this.f5095a = 0;
                j();
            }

            private void j() {
                boolean unused = o.f4719b;
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a, com.google.protobuf.af
            public j.a getDescriptorForType() {
                return a.Q;
            }

            @Override // com.google.protobuf.af
            /* renamed from: f */
            public o F() {
                return o.p();
            }

            @Override // com.google.protobuf.ac.a
            /* renamed from: g */
            public o t() {
                o r = r();
                if (!r.isInitialized()) {
                    throw b(r);
                }
                return r;
            }

            @Override // com.google.protobuf.ab.a
            /* renamed from: h */
            public o r() {
                o oVar = new o(this);
                if (this.f5095a == 1) {
                    if (this.f5097c == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.f5097c.c();
                    }
                }
                if (this.f5095a == 2) {
                    if (this.f5098d == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.f5098d.c();
                    }
                }
                if (this.f5095a == 3) {
                    if (this.e == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.e.c();
                    }
                }
                if (this.f5095a == 4) {
                    if (this.f == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.f.c();
                    }
                }
                if (this.f5095a == 16) {
                    if (this.g == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.g.c();
                    }
                }
                if (this.f5095a == 17) {
                    if (this.h == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.h.c();
                    }
                }
                if (this.f5095a == 18) {
                    if (this.i == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.i.c();
                    }
                }
                if (this.f5095a == 19) {
                    if (this.j == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.j.c();
                    }
                }
                if (this.f5095a == 20) {
                    if (this.k == null) {
                        oVar.f5094d = this.f5096b;
                    } else {
                        oVar.f5094d = this.k.c();
                    }
                }
                oVar.f5093a = this.f5095a;
                u();
                return oVar;
            }

            @Override // com.google.protobuf.s.a
            /* renamed from: i */
            public C0108a q() {
                return (C0108a) super.d();
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: a */
            public C0108a f(j.f fVar, Object obj) {
                return (C0108a) super.f(fVar, obj);
            }

            @Override // com.google.protobuf.s.a, com.google.protobuf.ab.a
            /* renamed from: b */
            public C0108a e(j.f fVar, Object obj) {
                return (C0108a) super.e(fVar, obj);
            }

            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.ab.a
            /* renamed from: d */
            public C0108a c(com.google.protobuf.ab abVar) {
                if (abVar instanceof o) {
                    return a((o) abVar);
                }
                super.c(abVar);
                return this;
            }

            public C0108a a(o oVar) {
                if (oVar == o.p()) {
                    return this;
                }
                switch (oVar.c()) {
                    case VEHICLESTATUS:
                        a(oVar.d());
                        break;
                    case SESSIONINFO:
                        a(oVar.e());
                        break;
                    case AUTHENTICATIONREQUEST:
                        a(oVar.f());
                        break;
                    case COMMANDSTATUS:
                        a(oVar.g());
                        break;
                    case WHITELISTINFO:
                        a(oVar.h());
                        break;
                    case WHITELISTENTRYINFO:
                        a(oVar.i());
                        break;
                    case VEHICLEINFO:
                        a(oVar.j());
                        break;
                    case CAPABILITIES:
                        a(oVar.k());
                        break;
                    case EXTERNALAUTHSTATUS:
                        a(oVar.l());
                        break;
                }
                x();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.a.AbstractC0077a, com.google.protobuf.b.a, com.google.protobuf.ac.a
            /* renamed from: d */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.teslamotors.a.a.o.C0108a c(com.google.protobuf.g r3, com.google.protobuf.p r4) {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.ai r1 = com.teslamotors.a.a.o.s()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    java.lang.Object r3 = r1.d(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    com.teslamotors.a.a$o r3 = (com.teslamotors.a.a.o) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.u -> L13
                    if (r3 == 0) goto L10
                    r2.a(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.ac r4 = r3.a()     // Catch: java.lang.Throwable -> L11
                    com.teslamotors.a.a$o r4 = (com.teslamotors.a.a.o) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.b()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.a(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.teslamotors.a.a.o.C0108a.c(com.google.protobuf.g, com.google.protobuf.p):com.teslamotors.a.a$o$a");
            }

            public C0108a a(aq aqVar) {
                if (this.f5097c == null) {
                    if (this.f5095a == 1 && this.f5096b != aq.j()) {
                        this.f5096b = aq.a((aq) this.f5096b).a(aqVar).r();
                    } else {
                        this.f5096b = aqVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 1) {
                        this.f5097c.b(aqVar);
                    }
                    this.f5097c.a(aqVar);
                }
                this.f5095a = 1;
                return this;
            }

            public C0108a a(ab abVar) {
                if (this.f5098d == null) {
                    if (this.f5095a == 2 && this.f5096b != ab.i()) {
                        this.f5096b = ab.a((ab) this.f5096b).a(abVar).r();
                    } else {
                        this.f5096b = abVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 2) {
                        this.f5098d.b(abVar);
                    }
                    this.f5098d.a(abVar);
                }
                this.f5095a = 2;
                return this;
            }

            public C0108a a(b bVar) {
                if (this.e == null) {
                    if (this.f5095a == 3 && this.f5096b != b.l()) {
                        this.f5096b = b.a((b) this.f5096b).a(bVar).r();
                    } else {
                        this.f5096b = bVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 3) {
                        this.e.b(bVar);
                    }
                    this.e.a(bVar);
                }
                this.f5095a = 3;
                return this;
            }

            public C0108a a(k kVar) {
                if (this.f == null) {
                    if (this.f5095a == 4 && this.f5096b != k.j()) {
                        this.f5096b = k.a((k) this.f5096b).a(kVar).r();
                    } else {
                        this.f5096b = kVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 4) {
                        this.f.b(kVar);
                    }
                    this.f.a(kVar);
                }
                this.f5095a = 4;
                return this;
            }

            public C0108a a(au auVar) {
                if (this.g == null) {
                    if (this.f5095a == 16 && this.f5096b != au.i()) {
                        this.f5096b = au.a((au) this.f5096b).a(auVar).r();
                    } else {
                        this.f5096b = auVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 16) {
                        this.g.b(auVar);
                    }
                    this.g.a(auVar);
                }
                this.f5095a = 16;
                return this;
            }

            public C0108a a(as asVar) {
                if (this.h == null) {
                    if (this.f5095a == 17 && this.f5096b != as.l()) {
                        this.f5096b = as.a((as) this.f5096b).a(asVar).r();
                    } else {
                        this.f5096b = asVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 17) {
                        this.h.b(asVar);
                    }
                    this.h.a(asVar);
                }
                this.f5095a = 17;
                return this;
            }

            public C0108a a(an anVar) {
                if (this.i == null) {
                    if (this.f5095a == 18 && this.f5096b != an.h()) {
                        this.f5096b = an.a((an) this.f5096b).a(anVar).r();
                    } else {
                        this.f5096b = anVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 18) {
                        this.i.b(anVar);
                    }
                    this.i.a(anVar);
                }
                this.f5095a = 18;
                return this;
            }

            public C0108a a(f fVar) {
                if (this.j == null) {
                    if (this.f5095a == 19 && this.f5096b != f.h()) {
                        this.f5096b = f.a((f) this.f5096b).a(fVar).r();
                    } else {
                        this.f5096b = fVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 19) {
                        this.j.b(fVar);
                    }
                    this.j.a(fVar);
                }
                this.f5095a = 19;
                return this;
            }

            public C0108a a(m mVar) {
                if (this.k == null) {
                    if (this.f5095a == 20 && this.f5096b != m.i()) {
                        this.f5096b = m.a((m) this.f5096b).a(mVar).r();
                    } else {
                        this.f5096b = mVar;
                    }
                    x();
                } else {
                    if (this.f5095a == 20) {
                        this.k.b(mVar);
                    }
                    this.k.a(mVar);
                }
                this.f5095a = 20;
                return this;
            }
        }

        public static o p() {
            return f;
        }

        @Override // com.google.protobuf.s, com.google.protobuf.ac
        public com.google.protobuf.ai<o> getParserForType() {
            return g;
        }

        @Override // com.google.protobuf.af
        /* renamed from: q */
        public o F() {
            return f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VCSEC.java */
    /* renamed from: com.teslamotors.a.a$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f4963b;

        static {
            try {
                e[o.b.VEHICLESTATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[o.b.SESSIONINFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[o.b.AUTHENTICATIONREQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[o.b.COMMANDSTATUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[o.b.WHITELISTINFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[o.b.WHITELISTENTRYINFO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[o.b.VEHICLEINFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[o.b.CAPABILITIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[o.b.EXTERNALAUTHSTATUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[o.b.SUBMESSAGE_NOT_SET.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f4965d = new int[aj.b.values().length];
            try {
                f4965d[aj.b.SIGNEDMESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4965d[aj.b.UNSIGNEDMESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4965d[aj.b.SUBMESSAGE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f4964c = new int[al.b.values().length];
            try {
                f4964c[al.b.INFORMATIONREQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4964c[al.b.RKEACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4964c[al.b.AUTHENTICATIONRESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4964c[al.b.WHITELISTOPERATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4964c[al.b.SUBMESSAGE_NOT_SET.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            f4963b = new int[k.b.values().length];
            try {
                f4963b[k.b.SIGNEDMESSAGESTATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4963b[k.b.SUBMESSAGE_NOT_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            f4962a = new int[ax.b.values().length];
            try {
                f4962a[ax.b.ADDPUBLICKEYTOWHITELIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4962a[ax.b.REMOVEPUBLICKEYFROMWHITELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4962a[ax.b.ADDPERMISSIONSTOPUBLICKEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4962a[ax.b.REMOVEPERMISSIONSFROMPUBLICKEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4962a[ax.b.ADDKEYTOWHITELISTANDADDPERMISSIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4962a[ax.b.SUBMESSAGE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
        }
    }

    public static j.g a() {
        return S;
    }

    static {
        j.g.a(new String[]{"\n\u000bVCSEC.proto\u0012\u0005vcsec\"Õ\u0002\n\u000fClosureStatuses\u0012.\n\u000ffrontDriverDoor\u0018\u0001 \u0001(\u000e2\u0015.vcsec.ClosureState_E\u00121\n\u0012frontPassengerDoor\u0018\u0002 \u0001(\u000e2\u0015.vcsec.ClosureState_E\u0012-\n\u000erearDriverDoor\u0018\u0003 \u0001(\u000e2\u0015.vcsec.ClosureState_E\u00120\n\u0011rearPassengerDoor\u0018\u0004 \u0001(\u000e2\u0015.vcsec.ClosureState_E\u0012(\n\trearTrunk\u0018\u0005 \u0001(\u000e2\u0015.vcsec.ClosureState_E\u0012)\n\nfrontTrunk\u0018\u0006 \u0001(\u000e2\u0015.vcsec.ClosureState_E\u0012)\n\nchargePort\u0018\u0007 \u0001(\u000e2\u0015.vcsec.ClosureState_E\"u\n\rVehicleStatus\u0012/\n\u000fclosureStatuses", "\u0018\u0001 \u0001(\u000b2\u0016.vcsec.ClosureStatuses\u00123\n\u0010vehicleLockState\u0018\u0002 \u0001(\u000e2\u0019.vcsec.VehicleLockState_E\"\u001a\n\u000bVehicleInfo\u0012\u000b\n\u0003VIN\u0018\u0001 \u0001(\t\"?\n\fCapabilities\u0012\u0016\n\u000echargePortOpen\u0018\u0001 \u0001(\b\u0012\u0017\n\u000fchargePortClose\u0018\u0002 \u0001(\b\"&\n\rKeyIdentifier\u0012\u0015\n\rpublicKeySHA1\u0018\u0001 \u0001(\f\"\u009e\u0001\n\rSignedMessage\u0012\r\n\u0005token\u0018\u0001 \u0001(\f\u0012\u000f\n\u0007counter\u0018\u0006 \u0001(\r\u0012\r\n\u0005keyId\u0018\u0005 \u0001(\f\u0012\u001e\n\u0016protobufMessageAsBytes\u0018\u0002 \u0001(\f\u0012+\n\rsignatureType\u0018\u0003 \u0001(\u000e2\u0014.vcsec.SignatureType\u0012\u0011\n\tsignature\u0018\u0004 \u0001(\f\"!\n\tPublicKey\u0012\u0014\n\fPublic", "KeyRaw\u0018\u0001 \u0001(\f\"X\n\rWhitelistInfo\u0012\u0017\n\u000fnumberOfEntries\u0018\u0001 \u0001(\r\u0012.\n\u0010whitelistEntries\u0018\u0002 \u0003(\u000b2\u0014.vcsec.KeyIdentifier\"\u0094\u0001\n\u0012WhitelistEntryInfo\u0012#\n\u0005keyId\u0018\u0001 \u0001(\u000b2\u0014.vcsec.KeyIdentifier\u0012#\n\tpublicKey\u0018\u0002 \u0001(\u000b2\u0010.vcsec.PublicKey\u00124\n\u000bpermissions\u0018\u0003 \u0003(\u000e2\u001f.vcsec.WhitelistKeyPermission_E\"x\n\u0012InformationRequest\u0012=\n\u0016informationRequestType\u0018\u0001 \u0001(\u000e2\u001d.vcsec.InformationRequestType\u0012#\n\u0005keyId\u0018\u0002 \u0001(\u000b2\u0014.vcsec.KeyIdentifier\"\u0081\u0001\n\u0010PermissionChange\u0012\u001d\n\u0003", "key\u0018\u0001 \u0001(\u000b2\u0010.vcsec.PublicKey\u00123\n\npermission\u0018\u0002 \u0003(\u000e2\u001f.vcsec.WhitelistKeyPermission_E\u0012\u0019\n\u0011secondsToBeActive\u0018\u0003 \u0001(\r\"Ú\u0002\n\u0012WhitelistOperation\u00123\n\u0017addPublicKeyToWhitelist\u0018\u0001 \u0001(\u000b2\u0010.vcsec.PublicKeyH\u0000\u00128\n\u001cremovePublicKeyFromWhitelist\u0018\u0002 \u0001(\u000b2\u0010.vcsec.PublicKeyH\u0000\u0012<\n\u0019addPermissionsToPublicKey\u0018\u0003 \u0001(\u000b2\u0017.vcsec.PermissionChangeH\u0000\u0012A\n\u001eremovePermissionsFromPublicKey\u0018\u0004 \u0001(\u000b2\u0017.vcsec.PermissionChangeH\u0000\u0012E\n\"addKeyToWhitelistAndAddPer", "missions\u0018\u0005 \u0001(\u000b2\u0017.vcsec.PermissionChangeH\u0000B\r\n\u000bsub_message\"S\n\u0016AuthenticationResponse\u00129\n\u0013authenticationLevel\u0018\u0001 \u0001(\u000e2\u001c.vcsec.AuthenticationLevel_E\"m\n\u0014SignedMessage_status\u0012\u000f\n\u0007counter\u0018\u0001 \u0001(\r\u0012D\n\u0018signedMessageInformation\u0018\u0002 \u0001(\u000e2\".vcsec.SignedMessage_information_E\"\u008d\u0001\n\rCommandStatus\u00121\n\u000foperationStatus\u0018\u0001 \u0001(\u000e2\u0018.vcsec.OperationStatus_E\u0012:\n\u0013signedMessageStatus\u0018\u0002 \u0001(\u000b2\u001b.vcsec.SignedMessage_statusH\u0000B\r\n\u000bsub_message\"ü\u0001\n", "\u000fUnsignedMessage\u00127\n\u0012InformationRequest\u0018\u0001 \u0001(\u000b2\u0019.vcsec.InformationRequestH\u0000\u0012'\n\tRKEAction\u0018\u0002 \u0001(\u000e2\u0012.vcsec.RKEAction_EH\u0000\u0012?\n\u0016authenticationResponse\u0018\u0003 \u0001(\u000b2\u001d.vcsec.AuthenticationResponseH\u0000\u00127\n\u0012WhitelistOperation\u0018\u0010 \u0001(\u000b2\u0019.vcsec.WhitelistOperationH\u0000B\r\n\u000bsub_message\"^\n\u0012ExternalAuthStatus\u0012\u000e\n\u0006active\u0018\u0001 \u0001(\b\u00128\n\u0018messageToBeSignedAsBytes\u0018\u0002 \u0001(\u000b2\u0016.vcsec.UnsignedMessage\"¡\u0001\n\u0015AuthenticationRequest\u0012)\n\u000bkeyIdToAuth\u0018\u0001 \u0001(\u000b2\u0014.vcs", "ec.KeyIdentifier\u0012'\n\u000bsessionInfo\u0018\u0002 \u0001(\u000b2\u0012.vcsec.SessionInfo\u00124\n\u000erequestedLevel\u0018\u0003 \u0001(\u000e2\u001c.vcsec.AuthenticationLevel_E\" \n\tPhoneInfo\u0012\u0013\n\u000bcar_version\u0018\u0001 \u0001(\r\"@\n\u000bSessionInfo\u0012\r\n\u0005token\u0018\u0001 \u0001(\f\u0012\u000f\n\u0007counter\u0018\u0002 \u0001(\r\u0012\u0011\n\tpublicKey\u0018\u0003 \u0001(\f\"\u0081\u0001\n\u000eToVCSECMessage\u0012-\n\rsignedMessage\u0018\u0001 \u0001(\u000b2\u0014.vcsec.SignedMessageH\u0000\u00121\n\u000funsignedMessage\u0018\u0002 \u0001(\u000b2\u0016.vcsec.UnsignedMessageH\u0000B\r\n\u000bsub_message\"â\u0003\n\u0010FromVCSECMessage\u0012-\n\rvehicleStatus\u0018\u0001 \u0001(\u000b2\u0014.vcsec.Vehi", "cleStatusH\u0000\u0012)\n\u000bsessionInfo\u0018\u0002 \u0001(\u000b2\u0012.vcsec.SessionInfoH\u0000\u0012=\n\u0015authenticationRequest\u0018\u0003 \u0001(\u000b2\u001c.vcsec.AuthenticationRequestH\u0000\u0012-\n\rcommandStatus\u0018\u0004 \u0001(\u000b2\u0014.vcsec.CommandStatusH\u0000\u0012-\n\rwhitelistInfo\u0018\u0010 \u0001(\u000b2\u0014.vcsec.WhitelistInfoH\u0000\u00127\n\u0012whitelistEntryInfo\u0018\u0011 \u0001(\u000b2\u0019.vcsec.WhitelistEntryInfoH\u0000\u0012)\n\u000bvehicleInfo\u0018\u0012 \u0001(\u000b2\u0012.vcsec.VehicleInfoH\u0000\u0012+\n\fcapabilities\u0018\u0013 \u0001(\u000b2\u0013.vcsec.CapabilitiesH\u0000\u00127\n\u0012externalAuthStatus\u0018\u0014 \u0001(\u000b2\u0019.vcsec.Externa", "lAuthStatusH\u0000B\r\n\u000bsub_message*q\n\u000eClosureState_E\u0012\u0017\n\u0013CLOSURESTATE_CLOSED\u0010\u0000\u0012\u0015\n\u0011CLOSURESTATE_OPEN\u0010\u0001\u0012\u0015\n\u0011CLOSURESTATE_AJAR\u0010\u0002\u0012\u0018\n\u0014CLOSURESTATE_UNKNOWN\u0010\u0003*\u009f\u0001\n\u0012VehicleLockState_E\u0012\u001d\n\u0019VEHICLELOCKSTATE_UNLOCKED\u0010\u0000\u0012\u001b\n\u0017VEHICLELOCKSTATE_LOCKED\u0010\u0001\u0012$\n VEHICLELOCKSTATE_INTERNAL_LOCKED\u0010\u0002\u0012'\n#VEHICLELOCKSTATE_SELECTIVE_UNLOCKED\u0010\u0003*e\n\rSignatureType\u0012\u001a\n\u0016SIGNATURE_TYPE_AES_GCM\u0010\u0000\u0012\u0018\n\u0014SIGNATURE_TYPE_ECDSA\u0010\u0001\u0012\u001e\n\u001aSIGNATURE_TYPE_PRESE", "NT_KEY\u0010\u0002*¿\u0003\n\u0016InformationRequestType\u0012'\n#INFORMATION_REQUEST_TYPE_GET_STATUS\u0010\u0000\u0012&\n\"INFORMATION_REQUEST_TYPE_GET_TOKEN\u0010\u0001\u0012(\n$INFORMATION_REQUEST_TYPE_GET_COUNTER\u0010\u0002\u00125\n1INFORMATION_REQUEST_TYPE_GET_EPHEMERAL_PUBLIC_KEY\u0010\u0003\u0012-\n)INFORMATION_REQUEST_TYPE_GET_SESSION_DATA\u0010\u0004\u0012/\n+INFORMATION_REQUEST_TYPE_GET_WHITELIST_INFO\u0010\u0005\u00125\n1INFORMATION_REQUEST_TYPE_GET_WHITELIST_ENTRY_INFO\u0010\u0006\u0012-\n)INFORMATION_REQUEST_TYPE_GET_VEH", "ICLE_INFO\u0010\u0007\u0012-\n)INFORMATION_REQUEST_TYPE_GET_CAPABILITIES\u0010\u0010*ß\u0001\n\u000bRKEAction_E\u0012\u0015\n\u0011RKE_ACTION_UNLOCK\u0010\u0000\u0012\u0013\n\u000fRKE_ACTION_LOCK\u0010\u0001\u0012\u0019\n\u0015RKE_ACTION_OPEN_TRUNK\u0010\u0002\u0012\u0019\n\u0015RKE_ACTION_OPEN_FRUNK\u0010\u0003\u0012\u001f\n\u001bRKE_ACTION_OPEN_CHARGE_PORT\u0010\u0004\u0012 \n\u001cRKE_ACTION_CLOSE_CHARGE_PORT\u0010\u0005\u0012+\n'RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE\u0010\u0006*§\u0003\n\u0018WhitelistKeyPermission_E\u0012+\n'WHITELISTKEYPERMISSION_ADD_TO_WHITELIST\u0010\u0000\u0012'\n#WHITELISTKEYPERMISSION_LOCAL_UNLOCK\u0010\u0001\u0012", "&\n\"WHITELISTKEYPERMISSION_LOCAL_DRIVE\u0010\u0002\u0012(\n$WHITELISTKEYPERMISSION_REMOTE_UNLOCK\u0010\u0003\u0012'\n#WHITELISTKEYPERMISSION_REMOTE_DRIVE\u0010\u0004\u0012-\n)WHITELISTKEYPERMISSION_CHANGE_PERMISSIONS\u0010\u0005\u00120\n,WHITELISTKEYPERMISSION_REMOVE_FROM_WHITELIST\u0010\u0006\u00125\n1WHITELISTKEYPERMISSION_REMOVE_SELF_FROM_WHITELIST\u0010\u0007\u0012\"\n\u001eWHITELISTKEYPERMISSION_UNKNOWN\u0010\u001f*w\n\u0015AuthenticationLevel_E\u0012\u001d\n\u0019AUTHENTICATION_LEVEL_NONE\u0010\u0000\u0012\u001f\n\u001bAUTHENTICATION_LEVEL_UNLOCK\u0010\u0001\u0012", "\u001e\n\u001aAUTHENTICATION_LEVEL_DRIVE\u0010\u0002*`\n\u0011OperationStatus_E\u0012\u0016\n\u0012OPERATIONSTATUS_OK\u0010\u0000\u0012\u0018\n\u0014OPERATIONSTATUS_WAIT\u0010\u0001\u0012\u0019\n\u0015OPERATIONSTATUS_ERROR\u0010\u0002*á\u0004\n\u001bSignedMessage_information_E\u0012\"\n\u001eSIGNEDMESSAGE_INFORMATION_NONE\u0010\u0000\u0012+\n'SIGNEDMESSAGE_INFORMATION_FAULT_UNKNOWN\u0010\u0001\u00124\n0SIGNEDMESSAGE_INFORMATION_FAULT_NOT_ON_WHITELIST\u0010\u0002\u0012<\n8SIGNEDMESSAGE_INFORMATION_FAULT_IV_SMALLER_THAN_EXPECTED\u0010\u0003\u00121\n-SIGNEDMESSAGE_INFORMATION_FAULT_INVALI", "D_TOKEN\u0010\u0004\u0012=\n9SIGNEDMESSAGE_INFORMATION_FAULT_TOKEN_AND_COUNTER_INVALID\u0010\u0005\u00124\n0SIGNEDMESSAGE_INFORMATION_FAULT_AES_DECRYPT_AUTH\u0010\u0006\u0012/\n+SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_INPUT\u0010\u0007\u00123\n/SIGNEDMESSAGE_INFORMATION_FAULT_ECDSA_SIGNATURE\u0010\b\u00126\n2SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_START\u0010\t\u00127\n3SIGNEDMESSAGE_INFORMATION_FAULT_LOCAL_ENTITY_RESULT\u0010\nB!\n\u0018com.teslamotors.protocolB\u0005VCSECb\u0006proto3"}, new j.g[0], new j.g.a() { // from class: com.teslamotors.a.a.1
            @Override // com.google.protobuf.j.g.a
            public com.google.protobuf.n a(j.g gVar) {
                j.g unused = a.S = gVar;
                return null;
            }
        });
        f4958a = a().g().get(0);
        f4959b = new s.f(f4958a, new String[]{"FrontDriverDoor", "FrontPassengerDoor", "RearDriverDoor", "RearPassengerDoor", "RearTrunk", "FrontTrunk", "ChargePort"});
        f4960c = a().g().get(1);
        f4961d = new s.f(f4960c, new String[]{"ClosureStatuses", "VehicleLockState"});
        e = a().g().get(2);
        f = new s.f(e, new String[]{"VIN"});
        g = a().g().get(3);
        h = new s.f(g, new String[]{"ChargePortOpen", "ChargePortClose"});
        i = a().g().get(4);
        j = new s.f(i, new String[]{"PublicKeySHA1"});
        k = a().g().get(5);
        l = new s.f(k, new String[]{"Token", "Counter", "KeyId", "ProtobufMessageAsBytes", "SignatureType", "Signature"});
        m = a().g().get(6);
        n = new s.f(m, new String[]{"PublicKeyRaw"});
        o = a().g().get(7);
        p = new s.f(o, new String[]{"NumberOfEntries", "WhitelistEntries"});
        q = a().g().get(8);
        r = new s.f(q, new String[]{"KeyId", "PublicKey", "Permissions"});
        s = a().g().get(9);
        t = new s.f(s, new String[]{"InformationRequestType", "KeyId"});
        u = a().g().get(10);
        v = new s.f(u, new String[]{"Key", "Permission", "SecondsToBeActive"});
        w = a().g().get(11);
        x = new s.f(w, new String[]{"AddPublicKeyToWhitelist", "RemovePublicKeyFromWhitelist", "AddPermissionsToPublicKey", "RemovePermissionsFromPublicKey", "AddKeyToWhitelistAndAddPermissions", "SubMessage"});
        y = a().g().get(12);
        z = new s.f(y, new String[]{"AuthenticationLevel"});
        A = a().g().get(13);
        B = new s.f(A, new String[]{"Counter", "SignedMessageInformation"});
        C = a().g().get(14);
        D = new s.f(C, new String[]{"OperationStatus", "SignedMessageStatus", "SubMessage"});
        E = a().g().get(15);
        F = new s.f(E, new String[]{"InformationRequest", "RKEAction", "AuthenticationResponse", "WhitelistOperation", "SubMessage"});
        G = a().g().get(16);
        H = new s.f(G, new String[]{"Active", "MessageToBeSignedAsBytes"});
        I = a().g().get(17);
        J = new s.f(I, new String[]{"KeyIdToAuth", "SessionInfo", "RequestedLevel"});
        K = a().g().get(18);
        L = new s.f(K, new String[]{"CarVersion"});
        M = a().g().get(19);
        N = new s.f(M, new String[]{"Token", "Counter", "PublicKey"});
        O = a().g().get(20);
        P = new s.f(O, new String[]{"SignedMessage", "UnsignedMessage", "SubMessage"});
        Q = a().g().get(21);
        R = new s.f(Q, new String[]{"VehicleStatus", "SessionInfo", "AuthenticationRequest", "CommandStatus", "WhitelistInfo", "WhitelistEntryInfo", "VehicleInfo", "Capabilities", "ExternalAuthStatus", "SubMessage"});
    }
}
