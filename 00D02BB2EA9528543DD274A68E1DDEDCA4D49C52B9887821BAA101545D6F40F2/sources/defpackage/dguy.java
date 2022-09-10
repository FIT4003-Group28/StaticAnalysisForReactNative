package defpackage;

import java.io.EOFException;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: dguy  reason: default package */
/* loaded from: classes6.dex */
public final class dguy {
    public static dgtc a(dgxe dgxeVar) {
        boolean z;
        try {
            try {
                dgxeVar.q();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return ((dgwn) dgwy.V).a(dgxeVar);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return dgte.a;
                }
                throw new dgtj(e);
            }
        } catch (dgxh e3) {
            throw new dgtj(e3);
        } catch (IOException e4) {
            throw new dgtd(e4);
        } catch (NumberFormatException e5) {
            throw new dgtj(e5);
        }
    }

    public static void b(dgtc dgtcVar, dgxg dgxgVar) {
        dgwy.V.b(dgxgVar, dgtcVar);
    }
}
