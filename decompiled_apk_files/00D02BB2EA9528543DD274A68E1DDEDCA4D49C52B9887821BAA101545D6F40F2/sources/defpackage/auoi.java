package defpackage;

import android.app.Application;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: auoi  reason: default package */
/* loaded from: classes2.dex */
public final class auoi extends auoh {
    public auoi(dzsj<Application> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<aunx> dzsjVar3, dzsj<auhz> dzsjVar4) {
        super(dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4);
    }

    public final dbsg<auog> b(String str, byte[] bArr, byte[] bArr2) {
        try {
            return dbsg.i(a(str, (pas) dsqw.cq(pas.d, bArr), (dlfv) dsqw.cq(dlfv.h, bArr2)));
        } catch (IOException unused) {
            return dbpy.a;
        }
    }
}
