package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeml  reason: default package */
/* loaded from: classes.dex */
public final class aeml implements Runnable {
    public Future a;
    final /* synthetic */ aems b;
    public aemy c;
    private final ArrayDeque d = new ArrayDeque();
    private final BlockingQueue e = new LinkedBlockingQueue();
    private boolean f = false;

    public aeml(aems aemsVar) {
        this.b = aemsVar;
    }

    private final void b(byte[] bArr) {
        if (bArr != null) {
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i >= length) {
                    return;
                }
                if (!Thread.interrupted()) {
                    Pair pair = (Pair) this.d.removeFirst();
                    aent aentVar = (aent) pair.first;
                    int intValue = ((Integer) pair.second).intValue();
                    int min = Math.min(intValue, length - i);
                    this.b.m(aentVar, bArr, i, min);
                    i += min;
                    if (min < intValue) {
                        if (aentVar.k != aent.a) {
                            aens aensVar = aentVar.k;
                            aentVar.k = aens.a(aensVar.a + min, aensVar.b);
                        }
                        this.d.addFirst(new Pair(aentVar, Integer.valueOf(intValue - min)));
                    }
                } else {
                    throw new InterruptedException();
                }
            }
        }
    }

    public final void a(aent aentVar) {
        try {
            this.e.put(aentVar);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                aent aentVar = (aent) this.e.take();
                if (!aentVar.equals(aems.a)) {
                    aems aemsVar = this.b;
                    if (aemsVar.p.c && aentVar.h) {
                        byte[] bArr = aentVar.b;
                        if (bArr.length == 0) {
                            aemsVar.m(aentVar, bArr, 0, 0);
                        }
                    }
                    if (!aentVar.g) {
                        if (!this.f) {
                            b(this.c.a());
                            this.f = true;
                        }
                        aems aemsVar2 = this.b;
                        byte[] bArr2 = aentVar.b;
                        aemsVar2.m(aentVar, bArr2, 0, bArr2.length);
                    } else if (!this.f) {
                        this.d.addLast(new Pair(aentVar, Integer.valueOf(aentVar.b.length)));
                        aemy aemyVar = this.c;
                        b(aemyVar.a.update(aentVar.b));
                    } else {
                        afus.b(2, 8, "encrypted_data_after_clear_data");
                        this.b.n();
                        return;
                    }
                } else {
                    if (!this.f) {
                        b(this.c.a());
                        this.f = true;
                    }
                    this.b.n();
                    return;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
