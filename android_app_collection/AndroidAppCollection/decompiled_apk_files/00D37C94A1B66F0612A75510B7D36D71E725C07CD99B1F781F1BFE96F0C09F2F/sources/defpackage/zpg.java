package defpackage;

import android.content.Context;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: zpg  reason: default package */
/* loaded from: classes4.dex */
public final class zpg implements PacketCallback {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public ampq c = amon.a;
    public final Object d = new Object();
    private final Context e;

    public zpg(Context context) {
        this.e = context.getApplicationContext();
    }

    @Override // com.google.mediapipe.framework.PacketCallback
    public final void process(Packet packet) {
        String str;
        byte[] nativeGetProtoBytes = PacketGetter.nativeGetProtoBytes(packet.getNativeHandle());
        aopu<axbf> aopuVar = null;
        if (nativeGetProtoBytes == null) {
            zep.b("Null byte[] from packet");
        } else {
            try {
                axbj axbjVar = (axbj) aopi.parseFrom(axbj.a, nativeGetProtoBytes, aoos.b());
                if (axbjVar.b.size() == 0) {
                    zep.b("No output events");
                } else {
                    aopuVar = axbjVar.b;
                }
            } catch (aopx e) {
                zep.d("Error parsing bytes from packet", e);
            }
        }
        if (aopuVar == null || aopuVar.isEmpty()) {
            return;
        }
        for (axbf axbfVar : aopuVar) {
            if (axbfVar.o()) {
                axbw g = axbfVar.g();
                if (g.g()) {
                    str = zny.f;
                } else {
                    str = zny.e;
                }
                synchronized (this.d) {
                    if (this.c.h()) {
                        str = (String) this.c.c();
                    }
                }
                aopa mo52toBuilder = g.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                ((axbw) mo52toBuilder.instance).h();
                new zpf(this, (axbw) mo52toBuilder.mo39build(), new File(this.e.getCacheDir(), str), g).execute(new Void[0]);
            }
            if (axbfVar.m()) {
                boolean c = axbfVar.e().c();
                synchronized (this.d) {
                    for (zph zphVar : this.b) {
                        zphVar.h(true, c);
                    }
                }
            }
            if (axbfVar.n()) {
                synchronized (this.d) {
                    for (zph zphVar2 : this.b) {
                        zphVar2.h(false, false);
                    }
                }
            }
            if (axbfVar.l()) {
                synchronized (this.d) {
                    for (zph zphVar3 : this.b) {
                        zphVar3.g(true);
                    }
                }
            }
            if (axbfVar.p()) {
                synchronized (this.d) {
                    for (zph zphVar4 : this.b) {
                        zphVar4.g(false);
                    }
                }
            }
            if (axbfVar.i()) {
                synchronized (this.d) {
                    for (zph zphVar5 : this.b) {
                        if (axbfVar.b().a() == axai.ADD_STICKER) {
                            zphVar5.m(axbfVar.b().d());
                        } else if (axbfVar.b().a() == axai.ADD_TEXT) {
                            zphVar5.n(axbfVar.b().d());
                        }
                    }
                }
            }
            if (axbfVar.h()) {
                synchronized (this.d) {
                    for (zph zphVar6 : this.b) {
                        zphVar6.f(axbfVar.f());
                    }
                }
            }
            if (axbfVar.j()) {
                synchronized (this.d) {
                    for (zph zphVar7 : this.b) {
                        zphVar7.d(axbfVar.a());
                    }
                }
            }
            if (axbfVar.k()) {
                synchronized (this.d) {
                    for (zph zphVar8 : this.b) {
                        zphVar8.e(axbfVar.c());
                    }
                }
            }
        }
    }
}
