package defpackage;

import android.os.Handler;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.ext.opus.OpusDecoder;
import com.google.android.exoplayer.ext.opus.OpusOutputBuffer;
import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: oxk  reason: default package */
/* loaded from: classes4.dex */
public final class oxk extends ouj implements otg {
    public final ost a;
    public final afdh b;
    private final Handler c;
    private final ous d;
    private final oue e;
    private MediaFormat f;
    private OpusDecoder g;
    private pcz i;
    private OpusOutputBuffer j;
    private boolean k;
    private boolean l;
    private boolean m;

    public oxk(oui ouiVar, Handler handler, afdh afdhVar, ous ousVar) {
        super(ouiVar);
        this.a = new ost();
        this.c = handler;
        this.b = afdhVar;
        this.d = ousVar;
        this.e = new oue();
    }

    private final void l(oxl oxlVar) {
        if (this.b != null) {
            this.c.post(new oxj(this, oxlVar));
        }
    }

    @Override // defpackage.ouj
    protected final void A(long j, long j2, boolean z) {
        if (this.l) {
            return;
        }
        this.m = z;
        if (this.f == null) {
            if (J(j, this.e, null) != -4) {
                return;
            }
            MediaFormat mediaFormat = this.e.a;
            this.f = mediaFormat;
            axdn axdnVar = (axdn) this.d;
            if (!axdnVar.b) {
                axdnVar.i(mediaFormat);
            }
            axdnVar.j(mediaFormat.r, mediaFormat.q);
        }
        if (this.g == null) {
            List list = this.f.f;
            if (list.size() <= 0) {
                throw new osx("Missing initialization data");
            }
            try {
                OpusDecoder opusDecoder = new OpusDecoder(list);
                this.g = opusDecoder;
                opusDecoder.start();
                this.a.a++;
            } catch (oxl e) {
                l(e);
                throw new osx(e);
            }
        }
        while (true) {
            try {
                if (this.l) {
                    break;
                }
                OpusOutputBuffer opusOutputBuffer = this.j;
                if (opusOutputBuffer == null) {
                    opusOutputBuffer = (OpusOutputBuffer) this.g.g();
                    this.j = opusOutputBuffer;
                    if (opusOutputBuffer == null) {
                        break;
                    }
                }
                if (!opusOutputBuffer.getFlag(1)) {
                    ous ousVar = this.d;
                    OpusOutputBuffer opusOutputBuffer2 = this.j;
                    long j3 = opusOutputBuffer2.timestampUs;
                    ByteBuffer byteBuffer = opusOutputBuffer2.data;
                    if (!((axdn) ousVar).l(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), false)) {
                        break;
                    }
                    this.a.f++;
                    this.j.release();
                    this.j = null;
                } else {
                    this.l = true;
                    this.d.c();
                    this.j.release();
                    this.j = null;
                    break;
                }
            } catch (oux e2) {
                if (this.b != null) {
                    this.c.post(new oxh(this, e2));
                }
                throw new osx(e2);
            } catch (ouy e3) {
                if (this.b != null) {
                    this.c.post(new oxi(this, e3));
                }
                throw new osx(e3);
            } catch (oxl e4) {
                l(e4);
                throw new osx(e4);
            }
        }
        while (!this.k) {
            pcz pczVar = this.i;
            if (pczVar == null) {
                pczVar = this.g.f();
                this.i = pczVar;
                if (pczVar == null) {
                    return;
                }
            }
            int J2 = J(j, this.e, pczVar.a);
            if (J2 == -2) {
                return;
            }
            if (J2 == -4) {
                this.f = this.e.a;
            } else if (J2 != -1) {
                if (this.i.a.c()) {
                    this.i.setFlag(2);
                }
                this.g.i(this.i);
                this.i = null;
            } else {
                this.i.setFlag(1);
                this.g.i(this.i);
                this.i = null;
                this.k = true;
                return;
            }
        }
    }

    @Override // defpackage.ouj
    protected final boolean E(MediaFormat mediaFormat) {
        return "audio/opus".equalsIgnoreCase(mediaFormat.b);
    }

    @Override // defpackage.otg
    public final long a() {
        return this.d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean h() {
        return this.l && !this.d.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final boolean i() {
        if (!this.d.h()) {
            if (this.f == null) {
                return false;
            }
            if (!this.m && this.j == null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ouo, defpackage.osy
    public final void k(int i, Object obj) {
        if (i == 1) {
            this.d.g(((Float) obj).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final otg m() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouj, defpackage.ouo
    public final void q() {
        this.i = null;
        this.j = null;
        this.f = null;
        try {
            OpusDecoder opusDecoder = this.g;
            if (opusDecoder != null) {
                opusDecoder.d();
                this.g = null;
                this.a.b++;
            }
            this.d.f();
        } finally {
            super.q();
        }
    }

    @Override // defpackage.ouj
    protected final void r(long j) {
        this.d.b(j);
        this.k = false;
        this.l = false;
        this.m = false;
        if (this.g != null) {
            this.i = null;
            OpusOutputBuffer opusOutputBuffer = this.j;
            if (opusOutputBuffer != null) {
                opusOutputBuffer.release();
                this.j = null;
            }
            this.g.h();
        }
    }

    @Override // defpackage.ouo
    protected final void v() {
        this.d.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void w() {
        this.d.d();
    }
}
