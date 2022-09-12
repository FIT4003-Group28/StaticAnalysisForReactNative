package defpackage;

import java.util.List;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dyxe  reason: default package */
/* loaded from: classes6.dex */
public final class dyxe {
    static {
        Logger.getLogger(dyxe.class.getName());
    }

    private dyxe() {
    }

    public static byte[][] a(List<dyya> list) {
        int size = list.size();
        byte[][] bArr = new byte[size + size];
        int i = 0;
        for (dyya dyyaVar : list) {
            int i2 = i + 1;
            bArr[i] = dyyaVar.f.i();
            i = i2 + 1;
            bArr[i2] = dyyaVar.g.i();
        }
        return dyvo.b(bArr);
    }
}
