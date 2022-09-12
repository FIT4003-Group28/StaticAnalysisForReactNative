package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: avqe  reason: default package */
/* loaded from: classes3.dex */
public final class avqe extends RuntimeException {
    @dzsi
    public final Integer a;
    public final Map<String, dspd> b;
    public final int c;

    public avqe(btzy btzyVar, @dzsi Throwable th) {
        super(th);
        this.a = btzyVar.s;
        this.b = btzyVar.t;
        bttq bttqVar = bttq.PROTOCOL_ERROR_INVALID_CONTENT_TYPE;
        int i = 4;
        switch (btzyVar.p.ordinal()) {
            case 0:
            case 1:
            case 17:
                i = 3;
                break;
            case 2:
            case 16:
                i = 8;
                break;
            case 3:
                i = 7;
                break;
            case 6:
            case 7:
                i = 2;
                break;
            case 8:
            case 9:
                i = 10;
                break;
            case 13:
                i = 11;
                break;
            case 15:
                i = 22;
                break;
        }
        this.c = i;
    }
}
