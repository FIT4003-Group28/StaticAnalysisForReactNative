package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: jnx  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jnx implements ayqe {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jnx u = new jnx(20);
    public static final /* synthetic */ jnx t = new jnx(19);
    public static final /* synthetic */ jnx s = new jnx(18);
    public static final /* synthetic */ jnx r = new jnx(17);
    public static final /* synthetic */ jnx q = new jnx(16);
    public static final /* synthetic */ jnx p = new jnx(15);
    public static final /* synthetic */ jnx o = new jnx(14);
    public static final /* synthetic */ jnx n = new jnx(13);
    public static final /* synthetic */ jnx m = new jnx(12);
    public static final /* synthetic */ jnx l = new jnx(11);
    public static final /* synthetic */ jnx k = new jnx(10);
    public static final /* synthetic */ jnx j = new jnx(9);
    public static final /* synthetic */ jnx i = new jnx(8);
    public static final /* synthetic */ jnx h = new jnx(7);
    public static final /* synthetic */ jnx g = new jnx(6);
    public static final /* synthetic */ jnx f = new jnx(5);
    public static final /* synthetic */ jnx e = new jnx(4);
    public static final /* synthetic */ jnx d = new jnx(3);
    public static final /* synthetic */ jnx c = new jnx(2);
    public static final /* synthetic */ jnx b = new jnx(1);
    public static final /* synthetic */ jnx a = new jnx();

    private /* synthetic */ jnx() {
    }

    private /* synthetic */ jnx(int i2) {
        this.v = i2;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        atyx atyxVar;
        int i2 = 3;
        boolean z = false;
        switch (this.v) {
            case 0:
                return amuk.o((List) obj);
            case 1:
                amuf f2 = amuk.f();
                for (awkb awkbVar : ((awka) obj).getDownloads()) {
                    if (awkbVar.b == 1) {
                        f2.h((String) awkbVar.c);
                    }
                }
                return f2.g();
            case 2:
                return ayoi.Q((amuk) obj);
            case 3:
                aqpe aqpeVar = (aqpe) obj;
                if (aqpeVar.qn(aqpy.b)) {
                    return ayoc.v((aqpy) aqpeVar.qm(aqpy.b));
                }
                return ayoc.p();
            case 4:
                return (amuk) obj;
            case 5:
                return ((awjr) obj).g();
            case 6:
                return ((awkx) obj).getVideoId();
            case 7:
                if (((fav) obj).a == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                return ((aqpy) obj).c;
            case 9:
                return ((fav) obj).b;
            case 10:
                return (Integer) ((ampq) obj).c();
            case 11:
                ahfb ahfbVar = (ahfb) obj;
                return kag.b;
            case 12:
                kao kaoVar = kag.b;
                if (((ahgn) obj).d() == aijs.BACKGROUND) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return Integer.valueOf(((ahia) obj).a());
            case 14:
                return kan.b;
            case 15:
                ahgf ahgfVar = (ahgf) obj;
                return 2;
            case 16:
                amuk amukVar = kan.a;
                int a2 = ((ahia) obj).a();
                if (a2 == 2) {
                    i2 = 1;
                } else if (a2 != 3) {
                    i2 = 0;
                }
                return Integer.valueOf(i2);
            case 17:
                switch (((aikd) obj).i - 1) {
                    case 0:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_UNKNOWN;
                        break;
                    case 1:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_VIDEO_ERROR;
                        break;
                    case 2:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE;
                        break;
                    case 3:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_REQUEST_FAILED;
                        break;
                    case 4:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_USER_AGE_CHECK_FAILED;
                        break;
                    case 5:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_USER_CONTENT_CHECK_FAILED;
                        break;
                    case 6:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_ERROR;
                        break;
                    case 7:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_NET_ERROR;
                        break;
                    case 8:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_LICENSE_SERVER_CONCURRENT_PLAYBACK_ERROR;
                        break;
                    case 9:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_PLAYER_ERROR;
                        break;
                    case 10:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_NO_STREAMS;
                        break;
                    case 11:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_WATCH_NEXT_ERROR;
                        break;
                    case 12:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_IN_BACKGROUND;
                        break;
                    case 13:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_UNPLAYABLE_BY_APP_POLICY;
                        break;
                    default:
                        atyxVar = atyx.PLAYBACK_EXCEPTION_ERROR_REASON_PARTIAL_PLAYBACK_DATA_EXHAUSTED;
                        break;
                }
                return new kar(atyxVar);
            case 18:
                return Boolean.valueOf(((ahhw) obj).c().a(aika.PLAYBACK_INTERRUPTED, aika.INTERSTITIAL_REQUESTED, aika.INTERSTITIAL_PLAYING));
            case 19:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            default:
                return Integer.valueOf(((fgu) obj).k);
        }
    }
}
