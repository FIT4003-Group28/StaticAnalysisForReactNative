package defpackage;

import android.os.Handler;
import android.os.Message;
import com.spotify.protocol.types.Types;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dxfv  reason: default package */
/* loaded from: classes6.dex */
public final class dxfv extends Handler {
    private final WeakReference<dxfw> a;

    public dxfv(dxfw dxfwVar) {
        this.a = new WeakReference<>(dxfwVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dxfw dxfwVar = this.a.get();
        if (dxfwVar != null) {
            int i = message.what;
            if (i == 1) {
                if (message.replyTo != null) {
                    dxfwVar.d = message.replyTo;
                    dxfwVar.e.f(dxhe.b(null));
                    return;
                }
                dxfwVar.e.a(new dxhn("Can't connect to Spotify service"));
            } else if (i == 2) {
                byte[] byteArray = message.getData().getByteArray("MESSAGE_BODY");
                new String(byteArray, Charset.forName("UTF-8"));
                dxgt.a();
                dxgi dxgiVar = dxfwVar.c;
                int length = byteArray.length;
                try {
                    dxhr dxhrVar = ((dxgh) dxgiVar).b;
                    String str = new String(byteArray, Charset.forName("UTF-8"));
                    try {
                        dxhp dxhpVar = new dxhp(dxhrVar.a, (dgtc) dxhrVar.a.h(str, dgtc.class));
                        dxhl dxhlVar = ((dxgh) dxgiVar).c;
                        int a = dxhpVar.a(0);
                        if (a == 2) {
                            for (dxgf dxgfVar : dxhlVar.a) {
                                dxgg.b(1, dxhpVar);
                                dxgfVar.i(dxgg.c(2, dxhpVar));
                            }
                        } else if (a == 3) {
                            for (dxgf dxgfVar2 : dxhlVar.a) {
                                dxgfVar2.b(dxgg.c(1, dxhpVar), dxgg.a(2, dxhpVar));
                            }
                        } else if (a == 6) {
                            for (dxgf dxgfVar3 : dxhlVar.a) {
                                dxgg.c(1, dxhpVar);
                                dxgfVar3.f(dxgg.a(2, dxhpVar));
                            }
                        } else if (a == 8) {
                            for (dxgf dxgfVar4 : dxhlVar.a) {
                                int b = dxgg.b(1, dxhpVar);
                                if (b == 32) {
                                    dxgfVar4.c(Types.RequestId.from(dxgg.b(2, dxhpVar)), dxgg.c(3, dxhpVar), dxgg.a(4, dxhpVar));
                                } else if (b == 34) {
                                    dxgg.b(2, dxhpVar);
                                    dxgg.c(3, dxhpVar);
                                    dxgg.a(4, dxhpVar);
                                    dxgfVar4.h();
                                } else if (b == 48) {
                                    dxgfVar4.d(Types.RequestId.from(dxgg.b(2, dxhpVar)), dxgg.c(3, dxhpVar), dxgg.a(4, dxhpVar));
                                }
                            }
                        } else if (a == 33) {
                            for (dxgf dxgfVar5 : dxhlVar.a) {
                                dxgfVar5.a(Types.RequestId.from(dxgg.b(1, dxhpVar)), Types.SubscriptionId.from(dxgg.b(2, dxhpVar)));
                            }
                        } else if (a == 36) {
                            for (dxgf dxgfVar6 : dxhlVar.a) {
                                Types.SubscriptionId from = Types.SubscriptionId.from(dxgg.b(1, dxhpVar));
                                dxgg.b(2, dxhpVar);
                                dxgfVar6.e(from, dxgg.c(5, dxhpVar));
                            }
                        } else if (a == 50) {
                            for (dxgf dxgfVar7 : dxhlVar.a) {
                                Types.RequestId from2 = Types.RequestId.from(dxgg.b(1, dxhpVar));
                                dxgg.c(2, dxhpVar);
                                dxhq c = dxgg.c(3, dxhpVar);
                                dxgg.c(4, dxhpVar);
                                dxgfVar7.g(from2, c);
                            }
                        }
                    } catch (RuntimeException e) {
                        throw new dxho(e);
                    }
                } catch (dxho unused) {
                    dxgt.a.d();
                }
            } else {
                int i2 = message.what;
                dxgt.b();
            }
        }
    }
}
