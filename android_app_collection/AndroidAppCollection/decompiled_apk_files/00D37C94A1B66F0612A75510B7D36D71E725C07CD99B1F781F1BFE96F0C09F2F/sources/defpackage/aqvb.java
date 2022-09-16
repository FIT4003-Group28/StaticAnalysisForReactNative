package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqvb  reason: default package */
/* loaded from: classes2.dex */
public final class aqvb {
    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int d(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            default:
                return 0;
        }
    }

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 3) {
                return 4;
            }
            return i != 4 ? 0 : 5;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }

    public static int h(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static void i(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void j(Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void k(String str, Object... objArr) {
        Log.e("YouTubeAndroidPlayerAPI", String.format(str, objArr));
    }

    public static void l(String str, Object... objArr) {
        Log.w("YouTubeAndroidPlayerAPI", String.format(str, objArr));
    }

    public static /* synthetic */ String m(int i) {
        switch (i) {
            case 1:
                return "EMBEDDING_DISABLED";
            case 2:
                return "BLOCKED_FOR_APP";
            case 3:
                return "NOT_PLAYABLE";
            case 4:
                return "NETWORK_ERROR";
            case 5:
                return "UNAUTHORIZED_OVERLAY";
            case 6:
                return "PLAYER_VIEW_TOO_SMALL";
            case 7:
                return "PLAYER_VIEW_NOT_VISIBLE";
            case 8:
                return "EMPTY_PLAYLIST";
            case 9:
                return "AUTOPLAY_DISABLED";
            case 10:
                return "USER_DECLINED_RESTRICTED_CONTENT";
            case 11:
                return "USER_DECLINED_HIGH_BANDWIDTH";
            case 12:
                return "UNEXPECTED_SERVICE_DISCONNECTION";
            case 13:
                return "INTERNAL_ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 2:
                return "INTERNAL_ERROR";
            case 3:
                return "UNKNOWN_ERROR";
            case 4:
                return "SERVICE_MISSING";
            case 5:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 6:
                return "SERVICE_DISABLED";
            case 7:
                return "SERVICE_INVALID";
            case 8:
                return "ERROR_CONNECTING_TO_SERVICE";
            case 9:
                return "CLIENT_LIBRARY_UPDATE_REQUIRED";
            case 10:
                return "NETWORK_ERROR";
            case 11:
                return "DEVELOPER_KEY_INVALID";
            default:
                return "INVALID_APPLICATION_SIGNATURE";
        }
    }

    public static float o(Uri uri) {
        String queryParameter = uri.getQueryParameter("audioSwapVolume");
        if (queryParameter == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(queryParameter);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static asjj p(String str, String str2) {
        aopa createBuilder = asjj.a.createBuilder();
        createBuilder.ap(r(str, str2));
        return (asjj) createBuilder.mo39build();
    }

    public static asjj q(List list, String str) {
        if (!list.isEmpty()) {
            aopa createBuilder = asjj.a.createBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                alfc alfcVar = (alfc) it.next();
                createBuilder.ap(r(alfcVar.e(), alfcVar.i));
            }
            return (asjj) createBuilder.mo39build();
        }
        return p(str, null);
    }

    private static aske r(String str, String str2) {
        aopa createBuilder = aske.a.createBuilder();
        if (str2 != null) {
            createBuilder.copyOnWrite();
            aske askeVar = (aske) createBuilder.instance;
            askeVar.b |= 4;
            askeVar.d = str2;
        }
        if (str != null) {
            createBuilder.copyOnWrite();
            aske askeVar2 = (aske) createBuilder.instance;
            askeVar2.b |= 1;
            askeVar2.c = str;
        }
        return (aske) createBuilder.mo39build();
    }
}
