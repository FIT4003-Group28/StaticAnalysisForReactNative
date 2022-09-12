package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmby  reason: default package */
/* loaded from: classes5.dex */
public final class cmby extends clls implements Handler.Callback {
    private final cmbv d;
    private final cmbx e;
    private final Handler f;
    private final cmbw g;
    private final Metadata[] h;
    private final long[] i;
    private int j;
    private int k;
    private cmbt l;
    private boolean m;
    private long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmby(cmbx cmbxVar, Looper looper) {
        super(5);
        cmbv cmbvVar = cmbv.a;
        cmmn.f(cmbxVar);
        this.e = cmbxVar;
        this.f = looper == null ? null : cmny.j(looper, this);
        this.d = cmbvVar;
        this.g = new cmbw();
        this.h = new Metadata[5];
        this.i = new long[5];
    }

    private final void O(Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.a(); i++) {
            Format a = metadata.b(i).a();
            if (a == null || !this.d.a(a)) {
                list.add(metadata.b(i));
            } else {
                cmbt b = this.d.b(a);
                byte[] bArr = (byte[]) cmmn.f(metadata.b(i).b());
                this.g.clear();
                this.g.a(bArr.length);
                ByteBuffer byteBuffer = this.g.b;
                int i2 = cmny.a;
                byteBuffer.put(bArr);
                this.g.d();
                Metadata a2 = b.a(this.g);
                if (a2 != null) {
                    O(a2, list);
                }
            }
        }
    }

    private final void P() {
        Arrays.fill(this.h, (Object) null);
        this.j = 0;
        this.k = 0;
    }

    private final void Q(Metadata metadata) {
        this.e.K(metadata);
    }

    @Override // defpackage.clol, defpackage.clon
    public final String J() {
        return "MetadataRenderer";
    }

    @Override // defpackage.clol
    public final void K(long j, long j2) {
        if (!this.m && this.k < 5) {
            this.g.clear();
            clng B = B();
            int G = G(B, this.g, false);
            if (G == -4) {
                if (this.g.isEndOfStream()) {
                    this.m = true;
                } else {
                    cmbw cmbwVar = this.g;
                    cmbwVar.f = this.n;
                    cmbwVar.d();
                    cmbt cmbtVar = this.l;
                    int i = cmny.a;
                    Metadata a = cmbtVar.a(this.g);
                    if (a != null) {
                        ArrayList arrayList = new ArrayList(a.a());
                        O(a, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i2 = this.j;
                            int i3 = this.k;
                            int i4 = (i2 + i3) % 5;
                            this.h[i4] = metadata;
                            this.i[i4] = this.g.d;
                            this.k = i3 + 1;
                        }
                    }
                }
            } else if (G == -5) {
                Format format = B.a;
                cmmn.f(format);
                this.n = format.p;
            }
        }
        if (this.k > 0) {
            long[] jArr = this.i;
            int i5 = this.j;
            if (jArr[i5] > j) {
                return;
            }
            Metadata metadata2 = this.h[i5];
            int i6 = cmny.a;
            Handler handler = this.f;
            if (handler != null) {
                handler.obtainMessage(0, metadata2).sendToTarget();
            } else {
                Q(metadata2);
            }
            Metadata[] metadataArr = this.h;
            int i7 = this.j;
            metadataArr[i7] = null;
            this.j = (i7 + 1) % 5;
            this.k--;
        }
    }

    @Override // defpackage.clol
    public final boolean L() {
        return true;
    }

    @Override // defpackage.clol
    public final boolean M() {
        return this.m;
    }

    @Override // defpackage.clon
    public final int N(Format format) {
        if (this.d.a(format)) {
            return format.E == null ? 4 : 2;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            Q((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.clls
    protected final void v(Format[] formatArr, long j, long j2) {
        this.l = this.d.b(formatArr[0]);
    }

    @Override // defpackage.clls
    protected final void w(long j, boolean z) {
        P();
        this.m = false;
    }

    @Override // defpackage.clls
    protected final void z() {
        P();
        this.l = null;
    }
}
