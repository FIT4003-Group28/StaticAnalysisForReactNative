package defpackage;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qzh  reason: default package */
/* loaded from: classes4.dex */
public final class qzh implements qyt {
    public volatile byte[] a;
    final /* synthetic */ qzi b;
    public volatile qzk c;
    private final long d;
    private final qzm e;

    public qzh(qzi qziVar, String str, qzm qzmVar) {
        this.b = qziVar;
        this.e = qzmVar;
        this.a = qzv.h(str);
        this.d = 0L;
    }

    public qzh(qzi qziVar, qzk qzkVar, long j, qzm qzmVar) {
        this.b = qziVar;
        this.c = qzkVar;
        this.d = j;
        this.e = qzmVar;
        qziVar.b++;
    }

    @Override // defpackage.qyt
    public final String a(Map map) {
        byte[] h;
        qzm a = this.e.a();
        a.c(amod.SNAPSHOT_START, qzn.COARSE);
        if (this.a != null) {
            h = this.a;
        } else {
            qyv qyvVar = new qyv();
            this.b.e(new qzf(this, map, qyvVar));
            try {
                long j = this.d;
                if (!qyvVar.c) {
                    qyvVar.c = true;
                    h = (byte[]) qyvVar.a.poll(j, TimeUnit.MILLISECONDS);
                    if (h == null) {
                        long j2 = this.d;
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Snapshot timeout: ");
                        sb.append(j2);
                        sb.append(" ms");
                        h = qzv.h(sb.toString());
                    }
                } else {
                    throw new RuntimeException("BlockingChannel can be read only once.");
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e.toString());
                h = qzv.h(valueOf.length() != 0 ? "Results transfer failed: ".concat(valueOf) : new String("Results transfer failed: "));
            }
        }
        a.c(amod.SNAPSHOT_COMPLETE, qzn.COARSE);
        if (axrg.b()) {
            aopa createBuilder = amog.a.createBuilder();
            aoob x = aoob.x(h);
            createBuilder.copyOnWrite();
            amog amogVar = (amog) createBuilder.instance;
            amogVar.b |= 2;
            amogVar.d = x;
            amof b = a.b();
            createBuilder.copyOnWrite();
            amog amogVar2 = (amog) createBuilder.instance;
            b.getClass();
            amogVar2.e = b;
            amogVar2.b |= 4;
            amob amobVar = amob.a;
            aopa createBuilder2 = amob.a.createBuilder();
            if (amobVar.c != axrj.b()) {
                boolean b2 = axrj.b();
                createBuilder2.copyOnWrite();
                amob amobVar2 = (amob) createBuilder2.instance;
                amobVar2.b |= 1;
                amobVar2.c = b2;
            }
            amob amobVar3 = (amob) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            amog amogVar3 = (amog) createBuilder.instance;
            amobVar3.getClass();
            amogVar3.f = amobVar3;
            amogVar3.b |= 8;
            amog amogVar4 = (amog) createBuilder.mo39build();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[8];
                new Random().nextBytes(bArr);
                bArr[0] = 10;
                bArr[1] = 6;
                int i = 3;
                for (int i2 = 0; i2 < 8; i2++) {
                    i ^= bArr[i2];
                }
                bArr[2] = (byte) (((byte) i) ^ bArr[2]);
                byteArrayOutputStream.write(bArr);
                aopa mo52toBuilder = amogVar4.mo52toBuilder();
                mo52toBuilder.copyOnWrite();
                amog amogVar5 = (amog) mo52toBuilder.instance;
                amogVar5.b &= -2;
                amogVar5.c = amog.a.c;
                ((amog) mo52toBuilder.mo39build()).writeTo(byteArrayOutputStream);
                h = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return Base64.encodeToString(h, 11);
    }

    @Override // defpackage.qyt
    public final void b() {
        this.b.e(new qzg(this));
    }
}
