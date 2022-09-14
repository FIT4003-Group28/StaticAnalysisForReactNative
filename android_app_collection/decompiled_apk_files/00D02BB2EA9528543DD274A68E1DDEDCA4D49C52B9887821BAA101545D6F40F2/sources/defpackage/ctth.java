package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctth  reason: default package */
/* loaded from: classes5.dex */
public final class ctth {
    public static dxwh a(Context context, UUID uuid) {
        csvu a = csvu.a(context);
        dxvn bZ = dxvo.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxvo) bZ.b).d = eaco.a(6);
        int i = a.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dxvo dxvoVar = (dxvo) bZ.b;
        dxvoVar.a = i;
        dxvoVar.b = 0;
        dxvoVar.c = a.b;
        ((dxvo) bZ.b).f = eact.a(3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ((dxvo) bZ.b).e = eacs.a(67);
        dxvo bK = bZ.bK();
        dxwh bZ2 = dxwi.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bK.getClass();
        ((dxwi) bZ2.b).c = bK;
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        dspd x = dspd.x(allocate.array());
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        x.getClass();
        ((dxwi) bZ2.b).a = x;
        return bZ2;
    }

    public static dxwh b(Context context, byte[] bArr, UUID uuid) {
        dxwh a = a(context, uuid);
        dspd x = dspd.x(bArr);
        if (a.c) {
            a.bF();
            a.c = false;
        }
        dxwi dxwiVar = dxwi.e;
        x.getClass();
        ((dxwi) a.b).b = x;
        return a;
    }
}
