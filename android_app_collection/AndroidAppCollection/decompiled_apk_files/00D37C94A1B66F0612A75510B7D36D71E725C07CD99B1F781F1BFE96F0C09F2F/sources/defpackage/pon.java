package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: pon  reason: default package */
/* loaded from: classes4.dex */
public final class pon extends phj implements Handler.Callback {
    private final pok a;
    private final pom b;
    private final Handler c;
    private final pol d;
    private poi e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private Metadata j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pon(pom pomVar, Looper looper) {
        super(5);
        pok pokVar = pok.a;
        ptx.a(pomVar);
        this.b = pomVar;
        this.c = looper == null ? null : pxi.r(looper, this);
        this.a = pokVar;
        this.d = new pol();
        this.i = -9223372036854775807L;
    }

    private final void b(Metadata metadata, List list) {
        for (int i = 0; i < metadata.a(); i++) {
            Format a = metadata.b(i).a();
            if (a == null || !this.a.b(a)) {
                list.add(metadata.b(i));
            } else {
                poi a2 = this.a.a(a);
                byte[] bArr = (byte[]) ptx.a(metadata.b(i).c());
                this.d.clear();
                this.d.e(bArr.length);
                ByteBuffer byteBuffer = this.d.d;
                int i2 = pxi.a;
                byteBuffer.put(bArr);
                this.d.f();
                Metadata a3 = a2.a(this.d);
                if (a3 != null) {
                    b(a3, list);
                }
            }
        }
    }

    private final void c(Metadata metadata) {
        pkj pkjVar = (pkj) this.b;
        pkjVar.a.f.ak();
        pig pigVar = pkjVar.a.c;
        pjd a = pigVar.t.a();
        for (int i = 0; i < metadata.a(); i++) {
            metadata.b(i).b(a);
        }
        pje a2 = a.a();
        if (!a2.equals(pigVar.t)) {
            pigVar.t = a2;
            pigVar.f.f(15, new pic(pigVar, 1));
        }
        Iterator it = pkjVar.a.e.iterator();
        while (it.hasNext()) {
            ((pjx) it.next()).ak();
        }
    }

    @Override // defpackage.pkd
    public final boolean H() {
        return this.g;
    }

    @Override // defpackage.pkd
    public final boolean I() {
        return true;
    }

    @Override // defpackage.pke
    public final int a(Format format) {
        if (this.a.b(format)) {
            return format.E == null ? 4 : 2;
        }
        return 0;
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            c((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.phj
    protected final void p() {
        this.j = null;
        this.i = -9223372036854775807L;
        this.e = null;
    }

    @Override // defpackage.phj
    protected final void s(long j, boolean z) {
        this.j = null;
        this.i = -9223372036854775807L;
        this.f = false;
        this.g = false;
    }

    @Override // defpackage.phj
    protected final void x(Format[] formatArr, long j, long j2) {
        this.e = this.a.a(formatArr[0]);
    }

    @Override // defpackage.pkd
    public final void z(long j, long j2) {
        boolean z;
        do {
            z = false;
            if (!this.f && this.j == null) {
                this.d.clear();
                pit X = X();
                int S = S(X, this.d, 0);
                if (S == -4) {
                    if (this.d.isEndOfStream()) {
                        this.f = true;
                    } else {
                        pol polVar = this.d;
                        polVar.a = this.h;
                        polVar.f();
                        poi poiVar = this.e;
                        int i = pxi.a;
                        Metadata a = poiVar.a(this.d);
                        if (a != null) {
                            ArrayList arrayList = new ArrayList(a.a());
                            b(a, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.j = new Metadata(arrayList);
                                this.i = this.d.f;
                            }
                        }
                    }
                } else if (S == -5) {
                    Format format = X.b;
                    ptx.a(format);
                    this.h = format.p;
                }
            }
            Metadata metadata = this.j;
            if (metadata != null && this.i <= j) {
                Handler handler = this.c;
                if (handler != null) {
                    handler.obtainMessage(0, metadata).sendToTarget();
                } else {
                    c(metadata);
                }
                this.j = null;
                this.i = -9223372036854775807L;
                z = true;
            }
            if (this.f && this.j == null) {
                this.g = true;
                continue;
            }
        } while (z);
    }
}
