package defpackage;
/* compiled from: PG */
/* renamed from: dyou  reason: default package */
/* loaded from: classes6.dex */
public enum dyou {
    NO_ERROR(0, dyjb.m),
    PROTOCOL_ERROR(1, dyjb.l),
    INTERNAL_ERROR(2, dyjb.l),
    FLOW_CONTROL_ERROR(3, dyjb.l),
    SETTINGS_TIMEOUT(4, dyjb.l),
    STREAM_CLOSED(5, dyjb.l),
    FRAME_SIZE_ERROR(6, dyjb.l),
    REFUSED_STREAM(7, dyjb.m),
    CANCEL(8, dyjb.c),
    COMPRESSION_ERROR(9, dyjb.l),
    CONNECT_ERROR(10, dyjb.l),
    ENHANCE_YOUR_CALM(11, dyjb.j.g("Bandwidth exhausted")),
    INADEQUATE_SECURITY(12, dyjb.h.g("Permission denied as protocol is not secure enough to call")),
    HTTP_1_1_REQUIRED(13, dyjb.d);
    
    public static final dyou[] o;
    public final dyjb p;
    private final int q;

    static {
        dyou[] values = values();
        dyou[] dyouVarArr = new dyou[((int) values[values.length - 1].a()) + 1];
        for (dyou dyouVar : values) {
            dyouVarArr[(int) dyouVar.a()] = dyouVar;
        }
        o = dyouVarArr;
    }

    dyou(int i, dyjb dyjbVar) {
        this.q = i;
        String valueOf = String.valueOf(name());
        String concat = valueOf.length() != 0 ? "HTTP/2 error code: ".concat(valueOf) : new String("HTTP/2 error code: ");
        if (dyjbVar.q != null) {
            String valueOf2 = String.valueOf(concat);
            String str = dyjbVar.q;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 3 + String.valueOf(str).length());
            sb.append(valueOf2);
            sb.append(" (");
            sb.append(str);
            sb.append(")");
            concat = sb.toString();
        }
        this.p = dyjbVar.g(concat);
    }

    public final long a() {
        return this.q;
    }
}
