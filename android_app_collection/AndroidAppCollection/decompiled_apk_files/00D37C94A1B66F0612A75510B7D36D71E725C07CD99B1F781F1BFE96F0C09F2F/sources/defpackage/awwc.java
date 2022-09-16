package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import com.google.cardboard.sdk.R;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: awwc  reason: default package */
/* loaded from: classes2.dex */
public final class awwc {
    public static Thread a;

    private awwc() {
    }

    public static int A(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int B(int i) {
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

    public static int C(int i) {
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

    public static int D(int i) {
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

    public static int E(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int F(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static /* synthetic */ String G(int i) {
        if (i != 12) {
            if (i == 13) {
                return "LOG_LEVEL_ERROR_DEPRECATED";
            }
            switch (i) {
                case 21:
                    return "ERROR_TYPE_ROOT_ELEMENT_CONVERTER_DEPRECATED";
                case 22:
                    return "LOG_TYPE_INVALID_FIELD";
                case 23:
                    return "LOG_TYPE_MISSING_FIELD";
                case 24:
                    return "LOG_TYPE_UNKNOWN_EXTENSION";
                case 25:
                    return "LOG_TYPE_MODEL_ERROR";
                case 26:
                    return "LOG_TYPE_WIRE_FORMAT_ERROR";
                case 27:
                    return "LOG_TYPE_CONFIGURATION_ERROR";
                case 28:
                    return "LOG_TYPE_INTERNAL_ERROR";
                case 29:
                    return "LOG_TYPE_INTERNAL_TEMPLATE_RESOLUTION_ERROR";
                case 30:
                    return "LOG_TYPE_INTERNAL_MISSING_TEMPLATE_ERROR";
                case 31:
                    return "LOG_TYPE_COMMAND_EXECUTION_ERROR";
                case 32:
                    return "LOG_TYPE_INTERNAL_RESOURCE_ERROR";
                case 33:
                    return "LOG_TYPE_INTERNAL_UTP_ERROR";
                case 34:
                    return "LOG_TYPE_RESOURCE_WARNING";
                default:
                    return "null";
            }
        }
        return "LOG_LEVEL_WARN";
    }

    public static int H(int i) {
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

    public static int I(int i) {
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

    public static int J(int i) {
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

    public static int K(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int L(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int M(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int N(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int O(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int P(int i) {
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

    public static int Q(int i) {
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

    public static int R(int i) {
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

    public static int S(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int T(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int U(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int V(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int W(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int X(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int Y(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            switch (i) {
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
        return 1;
    }

    public static int Z(int i) {
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

    public static int a(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aA(int i) {
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

    public static int aB(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aC(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aD(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aE(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aF(int i) {
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

    public static int aG(int i) {
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

    public static int aH(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aI(int i) {
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
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int aJ(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aK(int i) {
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

    public static int aL(int i) {
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

    public static int aM(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aN(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aO(int i) {
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

    public static int aP(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aQ(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aR(int i) {
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

    public static int aS(int i) {
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

    public static int aT(int i) {
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

    public static int aU(int i) {
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

    public static int aV(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int aW(int i) {
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

    public static int aX(int i) {
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

    public static int aY(int i) {
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

    public static int aZ(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aa(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ab(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ac(int i) {
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

    public static int ad(int i) {
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

    public static int ae(int i) {
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

    public static int af(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ag(int i) {
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

    public static int ah(int i) {
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

    public static int ai(int i) {
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

    public static int aj(int i) {
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

    public static int ak(int i) {
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

    public static String al(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void am(int i) {
        if (i != 0) {
            return;
        }
        throw null;
    }

    public static int an(int i) {
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

    public static int ao(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int ap(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int aq(int i) {
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
            default:
                return 0;
        }
    }

    public static int ar(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int as(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            if (i == 5) {
                return 6;
            }
            if (i == 6) {
                return 7;
            }
            return i != 22 ? 0 : 23;
        }
        return 1;
    }

    public static int at(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int au(int i) {
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

    public static int av(int i) {
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

    public static int aw(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ax(int i) {
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
            default:
                return 0;
        }
    }

    public static int ay(int i) {
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

    public static int az(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int b(int i) {
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
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            default:
                return 0;
        }
    }

    public static int bA(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bB(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bC(int i) {
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
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int bD(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bE(int i) {
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

    public static int bF(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bG(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bH(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bI(int i) {
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
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            default:
                return 0;
        }
    }

    public static int bJ(int i) {
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

    public static int bK(int i) {
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

    public static int bL(int i) {
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

    public static int bM(int i) {
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
            default:
                return 0;
        }
    }

    public static int bN(int i) {
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

    public static int bO(int i) {
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
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int bP(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bQ(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bR(int i) {
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

    public static int bS(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bT(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bU(int i) {
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

    public static int bV(int i) {
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

    public static int bW(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bX(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bY(int i) {
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
            default:
                return 0;
        }
    }

    public static int bZ(int i) {
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

    public static int ba(int i) {
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

    public static int bb(int i) {
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

    public static int bc(int i) {
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

    public static int bd(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int be(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bf(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 3) {
                return 4;
            }
            if (i == 4) {
                return 5;
            }
            if (i == 5) {
                return 6;
            }
            if (i == 6) {
                return 7;
            }
            switch (i) {
                case 17:
                    return 18;
                case 18:
                    return 19;
                case 19:
                    return 20;
                case 20:
                    return 21;
                case 21:
                    return 22;
                case 22:
                    return 23;
                case 23:
                    return 24;
                case 24:
                    return 25;
                case 25:
                    return 26;
                case 26:
                    return 27;
                case 27:
                    return 28;
                case 28:
                    return 29;
                case 29:
                    return 30;
                case 30:
                    return 31;
                case 31:
                    return 32;
                case 32:
                    return 33;
                case 33:
                    return 34;
                case 34:
                    return 35;
                case 35:
                    return 36;
                case 36:
                    return 37;
                case 37:
                    return 38;
                case 38:
                    return 39;
                case 39:
                    return 40;
                case 40:
                    return 41;
                case 41:
                    return 42;
                case 42:
                    return 43;
                case 43:
                    return 44;
                case 44:
                    return 45;
                case 45:
                    return 46;
                case 46:
                    return 47;
                case 47:
                    return 48;
                case 48:
                    return 49;
                case 49:
                    return 50;
                case 50:
                    return 51;
                case 51:
                    return 52;
                case 52:
                    return 53;
                case 53:
                    return 54;
                case 54:
                    return 55;
                case 55:
                    return 56;
                case 56:
                    return 57;
                case 57:
                    return 58;
                case 58:
                    return 59;
                case 59:
                    return 60;
                case 60:
                    return 61;
                case 61:
                    return 62;
                case 62:
                    return 63;
                case 63:
                    return 64;
                case 64:
                    return 65;
                case 65:
                    return 66;
                case 66:
                    return 67;
                case 67:
                    return 68;
                case 68:
                    return 69;
                case 69:
                    return 70;
                case 70:
                    return 71;
                case 71:
                    return 72;
                case 72:
                    return 73;
                case 73:
                    return 74;
                case 74:
                    return 75;
                case 75:
                    return 76;
                case 76:
                    return 77;
                case 77:
                    return 78;
                case 78:
                    return 79;
                case 79:
                    return 80;
                case 80:
                    return 81;
                case 81:
                    return 82;
                case 82:
                    return 83;
                case 83:
                    return 84;
                case 84:
                    return 85;
                case 85:
                    return 86;
                case 87:
                    return 88;
                case 190:
                    return 191;
                case 191:
                    return 192;
                case 193:
                    return 194;
                case 194:
                    return 195;
                case 195:
                    return 196;
                case 196:
                    return 197;
                case 197:
                    return 198;
                case 198:
                    return 199;
                case 199:
                    return 200;
                case 200:
                    return 201;
                case 201:
                    return 202;
                case 202:
                    return 203;
                case 203:
                    return 204;
                case 204:
                    return 205;
                case 205:
                    return 206;
                case 206:
                    return 207;
                case 207:
                    return 208;
                case 208:
                    return 209;
                case 209:
                    return 210;
                case 210:
                    return 211;
                case 211:
                    return 212;
                case 212:
                    return 213;
                case 213:
                    return 214;
                case 214:
                    return 215;
                case 215:
                    return 216;
                case 216:
                    return 217;
                case 217:
                    return 218;
                case 218:
                    return 219;
                case 219:
                    return 220;
                case 220:
                    return 221;
                case 221:
                    return 222;
                case 222:
                    return 223;
                case 223:
                    return 224;
                case 224:
                    return 225;
                case 225:
                    return 226;
                case 226:
                    return 227;
                case 227:
                    return 228;
                case 228:
                    return 229;
                case 229:
                    return 230;
                case 230:
                    return 231;
                case 231:
                    return 232;
                case 232:
                    return 233;
                case 233:
                    return 234;
                case 234:
                    return 235;
                case 235:
                    return 236;
                case 236:
                    return 237;
                case 237:
                    return 238;
                case 238:
                    return 239;
                case 239:
                    return 240;
                case 240:
                    return 241;
                case 241:
                    return 242;
                case 242:
                    return 243;
                case 243:
                    return 244;
                case 244:
                    return 245;
                case 245:
                    return 246;
                case 246:
                    return 247;
                case 247:
                    return 248;
                case 248:
                    return 249;
                case 249:
                    return 250;
                case 250:
                    return 251;
                case 251:
                    return 252;
                case 252:
                    return 253;
                case 253:
                    return 254;
                case 254:
                    return PrivateKeyType.INVALID;
                case PrivateKeyType.INVALID /* 255 */:
                    return 256;
                case 256:
                    return 257;
                case 257:
                    return 258;
                case 258:
                    return 259;
                case 259:
                    return 260;
                case 260:
                    return 261;
                case 261:
                    return 262;
                case 262:
                    return 263;
                case 263:
                    return 264;
                case 264:
                    return 265;
                case 265:
                    return 266;
                case 267:
                    return 268;
                case 268:
                    return 269;
                case 269:
                    return 270;
                case 270:
                    return 271;
                case 271:
                    return 272;
                case 272:
                    return 273;
                case 273:
                    return 274;
                case 274:
                    return 275;
                case 275:
                    return 276;
                case 276:
                    return 277;
                case 277:
                    return 278;
                case 278:
                    return 279;
                case 279:
                    return 280;
                case 280:
                    return 281;
                case 281:
                    return 282;
                case 282:
                    return 283;
                case 283:
                    return 284;
                case 284:
                    return 285;
                case 285:
                    return 286;
                case 286:
                    return 287;
                case 287:
                    return 288;
                case 288:
                    return 289;
                case 289:
                    return 290;
                case 290:
                    return 291;
                case 291:
                    return 292;
                case 292:
                    return 293;
                case 293:
                    return 294;
                case 294:
                    return 295;
                case 295:
                    return 296;
                case 296:
                    return 297;
                case 297:
                    return 298;
                case 298:
                    return 299;
                case 299:
                    return 300;
                case 300:
                    return 301;
                case 301:
                    return 302;
                case 302:
                    return 303;
                case 304:
                    return 305;
                case 305:
                    return 306;
                case 306:
                    return 307;
                case 307:
                    return 308;
                case 308:
                    return 309;
                case 309:
                    return 310;
                case 310:
                    return 311;
                case 311:
                    return 312;
                case 312:
                    return 313;
                case 313:
                    return 314;
                case 314:
                    return 315;
                case 315:
                    return 316;
                case 316:
                    return 317;
                case 317:
                    return 318;
                case 318:
                    return 319;
                case 319:
                    return 320;
                case 320:
                    return 321;
                case 321:
                    return 322;
                case 322:
                    return 323;
                case 323:
                    return 324;
                case 324:
                    return 325;
                case 325:
                    return 326;
                case 326:
                    return 327;
                case 327:
                    return 328;
                case 328:
                    return 329;
                case 329:
                    return 330;
                case 330:
                    return 331;
                case 332:
                    return 333;
                case 333:
                    return 334;
                case 334:
                    return 335;
                case 335:
                    return 336;
                case 336:
                    return 337;
                case 337:
                    return 338;
                case 338:
                    return 339;
                case 339:
                    return 340;
                case 340:
                    return 341;
                case 341:
                    return 342;
                case 342:
                    return 343;
                case 343:
                    return 344;
                case 344:
                    return 345;
                case 345:
                    return 346;
                case 346:
                    return 347;
                case 347:
                    return 348;
                case 348:
                    return 349;
                case 349:
                    return 350;
                case 350:
                    return 351;
                case 351:
                    return 352;
                case 352:
                    return 353;
                case 353:
                    return 354;
                case 354:
                    return 355;
                case 355:
                    return 356;
                case 356:
                    return 357;
                case 357:
                    return 358;
                case 358:
                    return 359;
                case 359:
                    return 360;
                case 360:
                    return 361;
                case 361:
                    return 362;
                case 362:
                    return 363;
                case 363:
                    return 364;
                case 364:
                    return 365;
                case 365:
                    return 366;
                case 366:
                    return 367;
                case 367:
                    return 368;
                case 368:
                    return 369;
                case 369:
                    return 370;
                case 370:
                    return 371;
                case 371:
                    return 372;
                case 372:
                    return 373;
                case 373:
                    return 374;
                case 374:
                    return 375;
                case 375:
                    return 376;
                case 376:
                    return 377;
                case 377:
                    return 378;
                case 378:
                    return 379;
                case 379:
                    return 380;
                case 380:
                    return 381;
                case 381:
                    return 382;
                case 382:
                    return 383;
                case 383:
                    return 384;
                case 384:
                    return 385;
                case 385:
                    return 386;
                case 386:
                    return 387;
                case 387:
                    return 388;
                case 388:
                    return 389;
                case 389:
                    return 390;
                case 390:
                    return 391;
                case 391:
                    return 392;
                case 10070:
                    return 10071;
                case 10111:
                    return 10112;
                case 20031:
                    return 20032;
                case 20032:
                    return 20033;
                case 20033:
                    return 20034;
                default:
                    switch (i) {
                        case 89:
                            return 90;
                        case 90:
                            return 91;
                        case 91:
                            return 92;
                        case 92:
                            return 93;
                        case 93:
                            return 94;
                        case 94:
                            return 95;
                        case 95:
                            return 96;
                        case 96:
                            return 97;
                        case 97:
                            return 98;
                        case 98:
                            return 99;
                        case 99:
                            return 100;
                        case 100:
                            return 101;
                        case 101:
                            return 102;
                        default:
                            switch (i) {
                                case 103:
                                    return 104;
                                case 104:
                                    return 105;
                                case 105:
                                    return 106;
                                case 106:
                                    return 107;
                                default:
                                    switch (i) {
                                        case 108:
                                            return 109;
                                        case 109:
                                            return 110;
                                        case 110:
                                            return 111;
                                        case 111:
                                            return 112;
                                        case 112:
                                            return 113;
                                        case 113:
                                            return 114;
                                        case 114:
                                            return 115;
                                        case 115:
                                            return 116;
                                        case 116:
                                            return 117;
                                        case 117:
                                            return 118;
                                        case 118:
                                            return 119;
                                        case 119:
                                            return 120;
                                        case 120:
                                            return 121;
                                        case 121:
                                            return 122;
                                        default:
                                            switch (i) {
                                                case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                    return R.styleable.AppCompatTheme_windowMinWidthMajor;
                                                case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                    return R.styleable.AppCompatTheme_windowMinWidthMinor;
                                                case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                    return R.styleable.AppCompatTheme_windowNoTitle;
                                                case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                    return 127;
                                                case 127:
                                                    return 128;
                                                case 128:
                                                    return 129;
                                                case 129:
                                                    return 130;
                                                case 130:
                                                    return 131;
                                                case 131:
                                                    return 132;
                                                case 132:
                                                    return 133;
                                                case 133:
                                                    return 134;
                                                case 134:
                                                    return 135;
                                                case 135:
                                                    return 136;
                                                case 136:
                                                    return 137;
                                                case 137:
                                                    return 138;
                                                case 138:
                                                    return 139;
                                                case 139:
                                                    return 140;
                                                case 140:
                                                    return 141;
                                                case 141:
                                                    return 142;
                                                case 142:
                                                    return 143;
                                                case 143:
                                                    return 144;
                                                case 144:
                                                    return 145;
                                                case 145:
                                                    return 146;
                                                case 146:
                                                    return 147;
                                                case 147:
                                                    return 148;
                                                case 148:
                                                    return 149;
                                                case 149:
                                                    return 150;
                                                case 150:
                                                    return 151;
                                                case 151:
                                                    return 152;
                                                case 152:
                                                    return 153;
                                                case 153:
                                                    return 154;
                                                case 154:
                                                    return 155;
                                                case 155:
                                                    return 156;
                                                case 156:
                                                    return 157;
                                                case 157:
                                                    return 158;
                                                case 158:
                                                    return 159;
                                                default:
                                                    switch (i) {
                                                        case 160:
                                                            return 161;
                                                        case 161:
                                                            return 162;
                                                        case 162:
                                                            return 163;
                                                        case 163:
                                                            return 164;
                                                        case 164:
                                                            return 165;
                                                        case 165:
                                                            return 166;
                                                        case 166:
                                                            return 167;
                                                        case 167:
                                                            return 168;
                                                        default:
                                                            switch (i) {
                                                                case 169:
                                                                    return 170;
                                                                case 170:
                                                                    return 171;
                                                                case 171:
                                                                    return 172;
                                                                case 172:
                                                                    return 173;
                                                                case 173:
                                                                    return 174;
                                                                case 174:
                                                                    return 175;
                                                                case 175:
                                                                    return 176;
                                                                case 176:
                                                                    return 177;
                                                                case 177:
                                                                    return 178;
                                                                case 178:
                                                                    return 179;
                                                                case 179:
                                                                    return 180;
                                                                case 180:
                                                                    return 181;
                                                                case 181:
                                                                    return 182;
                                                                case 182:
                                                                    return 183;
                                                                case 183:
                                                                    return 184;
                                                                default:
                                                                    switch (i) {
                                                                        case 185:
                                                                            return 186;
                                                                        case 186:
                                                                            return 187;
                                                                        case 187:
                                                                            return 188;
                                                                        case 188:
                                                                            return 189;
                                                                        default:
                                                                            return 0;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return 1;
    }

    public static int bg(int i) {
        if (i != 0) {
            switch (i) {
                case 20000:
                    return 20001;
                case 20001:
                    return 20002;
                case 20002:
                    return 20003;
                case 20003:
                    return 20004;
                case 20004:
                    return 20005;
                case 20005:
                    return 20006;
                case 20006:
                    return 20007;
                case 20007:
                    return 20008;
                case 20008:
                    return 20009;
                case 20009:
                    return 20010;
                case 20010:
                    return 20011;
                case 20011:
                    return 20012;
                case 20012:
                    return 20013;
                case 20013:
                    return 20014;
                case 20014:
                    return 20015;
                case 20015:
                    return 20016;
                case 20016:
                    return 20017;
                case 20017:
                    return 20018;
                case 20018:
                    return 20019;
                case 20019:
                    return 20020;
                default:
                    switch (i) {
                        case 20024:
                            return 20025;
                        case 20025:
                            return 20026;
                        case 20026:
                            return 20027;
                        case 20027:
                            return 20028;
                        case 20028:
                            return 20029;
                        case 20029:
                            return 20030;
                        case 20030:
                            return 20031;
                        default:
                            return 0;
                    }
            }
        }
        return 1;
    }

    public static int bh(int i) {
        if (i != 0) {
            if (i == 10112) {
                return 10113;
            }
            if (i == 10113) {
                return 10114;
            }
            switch (i) {
                case 10000:
                    return 10001;
                case 10001:
                    return 10002;
                case 10002:
                    return 10003;
                case 10003:
                    return 10004;
                case 10004:
                    return 10005;
                case 10005:
                    return 10006;
                case 10006:
                    return 10007;
                case 10007:
                    return 10008;
                case 10008:
                    return 10009;
                case 10009:
                    return 10010;
                case 10010:
                    return 10011;
                case 10011:
                    return 10012;
                case 10012:
                    return 10013;
                case 10013:
                    return 10014;
                case 10014:
                    return 10015;
                case 10015:
                    return 10016;
                case 10016:
                    return 10017;
                case 10017:
                    return 10018;
                case 10018:
                    return 10019;
                case 10019:
                    return 10020;
                case 10020:
                    return 10021;
                case 10021:
                    return 10022;
                case 10022:
                    return 10023;
                case 10023:
                    return 10024;
                case 10024:
                    return 10025;
                case 10025:
                    return 10026;
                case 10026:
                    return 10027;
                case 10027:
                    return 10028;
                case 10028:
                    return 10029;
                case 10029:
                    return 10030;
                case 10030:
                    return 10031;
                case 10031:
                    return 10032;
                case 10032:
                    return 10033;
                case 10033:
                    return 10034;
                case 10034:
                    return 10035;
                case 10035:
                    return 10036;
                case 10036:
                    return 10037;
                default:
                    switch (i) {
                        case 10038:
                            return 10039;
                        case 10039:
                            return 10040;
                        case 10040:
                            return 10041;
                        case 10041:
                            return 10042;
                        case 10042:
                            return 10043;
                        case 10043:
                            return 10044;
                        case 10044:
                            return 10045;
                        case 10045:
                            return 10046;
                        case 10046:
                            return 10047;
                        case 10047:
                            return 10048;
                        case 10048:
                            return 10049;
                        case 10049:
                            return 10050;
                        case 10050:
                            return 10051;
                        case 10051:
                            return 10052;
                        case 10052:
                            return 10053;
                        case 10053:
                            return 10054;
                        case 10054:
                            return 10055;
                        case 10055:
                            return 10056;
                        case 10056:
                            return 10057;
                        case 10057:
                            return 10058;
                        case 10058:
                            return 10059;
                        case 10059:
                            return 10060;
                        case 10060:
                            return 10061;
                        case 10061:
                            return 10062;
                        case 10062:
                            return 10063;
                        case 10063:
                            return 10064;
                        case 10064:
                            return 10065;
                        case 10065:
                            return 10066;
                        case 10066:
                            return 10067;
                        case 10067:
                            return 10068;
                        case 10068:
                            return 10069;
                        case 10069:
                            return 10070;
                        case 10070:
                            return 10071;
                        case 10071:
                            return 10072;
                        case 10072:
                            return 10073;
                        case 10073:
                            return 10074;
                        case 10074:
                            return 10075;
                        case 10075:
                            return 10076;
                        default:
                            switch (i) {
                                case 10077:
                                    return 10078;
                                case 10078:
                                    return 10079;
                                case 10079:
                                    return 10080;
                                case 10080:
                                    return 10081;
                                case 10081:
                                    return 10082;
                                case 10082:
                                    return 10083;
                                case 10083:
                                    return 10084;
                                case 10084:
                                    return 10085;
                                case 10085:
                                    return 10086;
                                case 10086:
                                    return 10087;
                                case 10087:
                                    return 10088;
                                case 10088:
                                    return 10089;
                                case 10089:
                                    return 10090;
                                case 10090:
                                    return 10091;
                                case 10091:
                                    return 10092;
                                case 10092:
                                    return 10093;
                                case 10093:
                                    return 10094;
                                case 10094:
                                    return 10095;
                                case 10095:
                                    return 10096;
                                case 10096:
                                    return 10097;
                                case 10097:
                                    return 10098;
                                case 10098:
                                    return 10099;
                                case 10099:
                                    return 10100;
                                case 10100:
                                    return 10101;
                                case 10101:
                                    return 10102;
                                case 10102:
                                    return 10103;
                                case 10103:
                                    return 10104;
                                case 10104:
                                    return 10105;
                                case 10105:
                                    return 10106;
                                case 10106:
                                    return 10107;
                                case 10107:
                                    return 10108;
                                case 10108:
                                    return 10109;
                                case 10109:
                                    return 10110;
                                case 10110:
                                    return 10111;
                                default:
                                    return 0;
                            }
                    }
            }
        }
        return 1;
    }

    public static int bi(int i) {
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
            default:
                return 0;
        }
    }

    public static int bj(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bk(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bl(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bm(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bn(int i) {
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

    public static int bo(int i) {
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
            default:
                return 0;
        }
    }

    public static int bp(int i) {
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

    public static int bq(int i) {
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

    public static int br(int i) {
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

    public static int bs(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bt(int i) {
        return i - 2;
    }

    public static int bu(int i) {
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

    public static int bv(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bw(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bx(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int by(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int bz(int i) {
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

    public static String c(String str) {
        String substring = str.substring(str.lastIndexOf(47) + 1);
        int indexOf = substring.indexOf(95);
        int i = indexOf + 1;
        int indexOf2 = substring.indexOf(95, i);
        if (indexOf >= indexOf2) {
            throw new awxu();
        }
        String substring2 = substring.substring(i, indexOf2);
        int indexOf3 = substring2.indexOf(45);
        int lastIndexOf = substring2.lastIndexOf(45);
        if (indexOf3 >= lastIndexOf) {
            throw new awxu();
        }
        return substring2.substring(indexOf3 + 1, lastIndexOf);
    }

    public static int ca(int i) {
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

    public static int cb(int i) {
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

    public static int cc(int i) {
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

    public static int cd(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ce(int i) {
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

    public static int cf(int i) {
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
            case 23:
            case 24:
            case 30:
            default:
                return 0;
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
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
        }
    }

    public static int cg(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int ch(int i) {
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

    public static int ci(int i) {
        if (i != 0) {
            if (i == 2) {
                return 3;
            }
            if (i == 4) {
                return 5;
            }
            return i != 5 ? 0 : 6;
        }
        return 1;
    }

    public static int cj(int i) {
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

    public static int ck(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    private static String cl(String str) {
        String[] split = str.substring(str.lastIndexOf(47) + 1).split("_", -1);
        if (split.length != 6 || split[2].length() != 10 || split[2].charAt(4) != '-' || split[2].charAt(7) != '-') {
            throw new awxu();
        }
        return split[2];
    }

    public static boolean d(String str, String str2) {
        if (str.isEmpty()) {
            return false;
        }
        if (str2.isEmpty()) {
            return true;
        }
        try {
            return cl(str).compareTo(cl(str2)) > 0;
        } catch (awxu unused) {
            return true;
        }
    }

    public static int e(int i) {
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

    public static int f(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int g(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int h(int i) {
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

    public static final axow i(axoq axoqVar) {
        return new axow(axoqVar.a);
    }

    public static final void j(Object obj, azqb azqbVar, axoq axoqVar) {
        axoqVar.a(obj, azqbVar);
    }

    public static int k(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static LinkedHashMap l(int i) {
        return new LinkedHashMap(k(i));
    }

    public static List m(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    public static void n(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static void o(Object obj) {
        obj.getClass();
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static Object q(Context context) {
        Application t = t(context.getApplicationContext());
        boolean z = t instanceof axon;
        Object[] objArr = {t.getClass()};
        if (!z) {
            throw new IllegalArgumentException(String.format("Sting BroadcastReceiver must be attached to an @Sting Application. Found: %s", objArr));
        }
        return ((axon) t).lI();
    }

    public static ae r(abp abpVar, ae aeVar) {
        return ((axno) u(abpVar, axno.class)).jv().b(abpVar, abpVar.getIntent() != null ? abpVar.getIntent().getExtras() : null, aeVar);
    }

    public static ae s(dp dpVar, ae aeVar) {
        return ((axnp) u(dpVar, axnp.class)).aJ().a(dpVar, aeVar);
    }

    public static Application t(Context context) {
        if (!(context instanceof Application)) {
            Context context2 = context;
            while (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 instanceof Application) {
                    return (Application) context2;
                }
            }
            String valueOf = String.valueOf(context);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("Could not find an Application in the given context: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return (Application) context;
    }

    public static Object u(Object obj, Class cls) {
        boolean z;
        if (obj instanceof axom) {
            if (obj instanceof axop) {
                Annotation[] annotations = cls.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                n(!z, "Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", cls.getCanonicalName());
            }
            return cls.cast(obj);
        } else if (!(obj instanceof axon)) {
            throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), axom.class, axon.class));
        } else {
            return u(((axon) obj).lI(), cls);
        }
    }

    public static int v(int i) {
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

    public static int w(int i) {
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

    public static int x(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static int y(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int z(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }
}
