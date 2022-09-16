package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: vre  reason: default package */
/* loaded from: classes4.dex */
public final class vre {
    public vrd a;
    private final ByteArrayOutputStream b;
    private final DataOutputStream c;
    private final List d;
    private final vrb e;
    private long f;
    private final vrc g;
    private final long h;
    private final int i;

    public vre(vrb vrbVar, long j, vrc vrcVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.b = byteArrayOutputStream;
        this.c = new DataOutputStream(byteArrayOutputStream);
        this.d = new ArrayList();
        this.a = vrd.NOT_STARTED;
        this.f = Long.MAX_VALUE;
        viu.c(true, "Invalid samplesPerSec (%s)", 48000);
        this.i = vsc.e(2);
        this.e = vrbVar;
        long j2 = (j * 7056000) / 1000000;
        this.h = j2;
        this.f = j2;
        this.g = vrcVar;
    }

    static float a(vrf vrfVar, long j) {
        return 1.0f - Math.min(1.0f, Math.max(0.0f, ((float) (j - (vrfVar.c - 705600))) / 705600.0f));
    }

    private static final short d(float f) {
        return (short) Math.round(Math.max(-32768.0f, Math.min(32767.0f, f)));
    }

    public final vrf b(long j, float f, long j2) {
        viu.f(this.a == vrd.NOT_STARTED, "Invalid mixer status (%s)", this.a);
        vrf vrfVar = new vrf(this, f, j2);
        vrfVar.c((j * 7056000) / 1000000);
        this.d.add(vrfVar);
        return vrfVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c() {
        vrg vrgVar;
        while (true) {
            if (this.a != vrd.FINISHED) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    vrf vrfVar = (vrf) it.next();
                    if (vrfVar.d) {
                        if (vrfVar.a.d() < vrgVar.a) {
                            it.remove();
                            int size = this.d.size();
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Removed finished source, ");
                            sb.append(size);
                            sb.append(" remaining.");
                            vqy.a(sb.toString());
                        }
                    }
                }
                if (this.f < 147) {
                    this.e.a();
                    vrc vrcVar = this.g;
                    if (vrcVar != null) {
                        vrcVar.a(1.0d);
                    }
                    this.a = vrd.FINISHED;
                }
            }
            if (this.a != vrd.STARTED) {
                break;
            }
            long min = Math.min(this.f, 602112L);
            for (vrf vrfVar2 : this.d) {
                min = Math.min(min, vrfVar2.a.d());
            }
            int i = (int) (min / 147);
            if (i <= 0) {
                break;
            }
            try {
                if (vsc.f(this.i)) {
                    for (int i2 = 0; i2 < i; i2++) {
                        float f = 0.0f;
                        float f2 = 0.0f;
                        for (int i3 = 0; i3 < this.d.size(); i3++) {
                            vrf vrfVar3 = (vrf) this.d.get(i3);
                            float a = a(vrfVar3, (this.h - this.f) + (i2 * 147));
                            f += vrfVar3.d(1) * a;
                            f2 += vrfVar3.d(2) * a;
                            vrfVar3.c(147L);
                        }
                        this.c.writeShort(d(f));
                        this.c.writeShort(d(f2));
                    }
                } else {
                    for (int i4 = 0; i4 < i; i4++) {
                        float f3 = 0.0f;
                        for (int i5 = 0; i5 < this.d.size(); i5++) {
                            vrf vrfVar4 = (vrf) this.d.get(i5);
                            f3 += vrfVar4.a.a() * vrfVar4.b * a(vrfVar4, (this.h - this.f) + (i4 * 147));
                            vrfVar4.c(147L);
                        }
                        this.c.writeShort(d(f3));
                    }
                }
                long j = this.f - (i * 147);
                this.f = j;
                vrc vrcVar2 = this.g;
                if (vrcVar2 != null) {
                    double d = j;
                    double d2 = this.h;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    vrcVar2.a(1.0d - (d / d2));
                }
                try {
                    this.c.flush();
                } catch (IOException e) {
                    vqy.c("Exception while flushing mixed audio", e);
                }
                if (this.b.size() > 0) {
                    this.e.b(ByteBuffer.wrap(this.b.toByteArray()).asShortBuffer(), 48000, this.i);
                    this.b.reset();
                }
            } catch (IOException e2) {
                vqy.c("Exception while mixing audio", e2);
            }
        }
    }
}
