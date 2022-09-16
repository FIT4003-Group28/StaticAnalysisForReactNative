package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: aapv  reason: default package */
/* loaded from: classes.dex */
public final class aapv {
    public volatile boolean a;
    private final Set b;

    public aapv(Set set, aadd aaddVar) {
        this.b = set;
        if (aaddVar != null) {
            aaddVar.a.as(new ayqb() { // from class: aapt
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    aapv aapvVar = aapv.this;
                    athe atheVar = ((arhd) obj).f;
                    if (atheVar == null) {
                        atheVar = athe.a;
                    }
                    aapvVar.a = atheVar.g;
                }
            });
        }
    }

    private static final String c(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public final void a(afvm afvmVar, arbf arbfVar, arpa arpaVar) {
        for (aapu aapuVar : this.b) {
            try {
                String.format("[TRANSPORT] About to process packet with %s", c(aapuVar));
                aapuVar.b(afvmVar, arbfVar, arpaVar == null ? arpa.a : arpaVar);
            } catch (Throwable th) {
                if (th.getCause() instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                } else {
                    zep.d("Exception processing framework update.", th);
                    afus.c(2, 5, "Exception processing framework update.", th);
                }
            }
        }
    }

    public final void b(afvm afvmVar, aoqu aoquVar, byte[] bArr, amqo amqoVar) {
        aoob H;
        arbf arbfVar;
        if (this.b.isEmpty()) {
            return;
        }
        String.format("[TRANSPORT] About to route transport proto for %s type.", c(aoquVar));
        if (this.a) {
            H = zgd.I(bArr, 777);
        } else {
            H = zgd.H(aoob.x(bArr), 777);
        }
        if (H == null) {
            String.format("[TRANSPORT] No transport packet to process on on field 777 %s", c(aoquVar));
            return;
        }
        try {
            arbfVar = (arbf) aopi.parseFrom(arbf.a, H, aoos.b());
        } catch (aopx e) {
            zep.d("[TRANSPORT] Field 777 failed to parse", e);
            arbfVar = null;
        }
        a(afvmVar, arbfVar, (arpa) amqoVar.get());
    }
}
