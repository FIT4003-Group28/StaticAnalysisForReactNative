package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import com.spotify.protocol.types.Empty;
import com.spotify.protocol.types.HelloDetails;
import com.spotify.protocol.types.Info;
import com.spotify.protocol.types.Roles;
import java.nio.charset.Charset;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dxgh  reason: default package */
/* loaded from: classes6.dex */
public final class dxgh implements dxgi {
    public final HelloDetails a;
    public final dxhr b;
    public final dxhl c = new dxhl();
    private final dxgj d;

    public dxgh(dxgo dxgoVar, dxhr dxhrVar, dxgj dxgjVar) {
        this.b = dxhrVar;
        this.d = dxgjVar;
        this.a = new HelloDetails(new Roles(null, null, new Empty(), new Empty()), new Info(1, dxgoVar.h, dxgoVar.a, dxgoVar.c, null, dxgoVar.f, dxgoVar.g, null, 0, 0, 0, 0), dxgoVar.d, dxgoVar.b, dxgoVar.e);
        ((dxfw) dxgjVar).c = this;
    }

    public final void a(Object[] objArr) {
        try {
            dxhr dxhrVar = this.b;
            byte[] bytes = dxhrVar.a.e(Arrays.asList(objArr)).getBytes(Charset.forName("UTF-8"));
            dxgj dxgjVar = this.d;
            int length = bytes.length;
            dxfw dxfwVar = (dxfw) dxgjVar;
            int i = dxfwVar.f;
            if (i == 4) {
                throw new dxfj();
            }
            if (i != 1) {
                if (dxfwVar.d != null) {
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("MESSAGE_BODY", bytes);
                    Message obtain = Message.obtain();
                    obtain.setData(bundle);
                    try {
                        ((dxfw) dxgjVar).d.send(obtain);
                        return;
                    } catch (RemoteException e) {
                        e.getMessage();
                        dxgt.b();
                        return;
                    }
                }
                dxgt.b();
                return;
            }
            throw new dxfk();
        } catch (dxho e2) {
            throw new dxhn(e2);
        }
    }
}
