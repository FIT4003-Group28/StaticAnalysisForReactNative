package defpackage;

import android.util.Log;
import com.google.android.exoplayer.MediaFormat;
/* compiled from: PG */
/* renamed from: paj  reason: default package */
/* loaded from: classes4.dex */
final class paj extends pab {
    private final pct a;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public paj(oyf oyfVar) {
        super(oyfVar);
        oyfVar.d(MediaFormat.d());
        this.a = new pct(10);
    }

    @Override // defpackage.pab
    public final void a(pct pctVar) {
        if (!this.c) {
            return;
        }
        int a = pctVar.a();
        int i = this.f;
        if (i < 10) {
            int min = Math.min(a, 10 - i);
            System.arraycopy(pctVar.a, pctVar.b, this.a.a, this.f, min);
            if (this.f + min == 10) {
                this.a.z(0);
                if (this.a.h() != 73 || this.a.h() != 68 || this.a.h() != 51) {
                    Log.w("Id3Reader", "Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
                this.a.A(3);
                this.e = this.a.g() + 10;
            }
        }
        int min2 = Math.min(a, this.e - this.f);
        this.b.f(pctVar, min2);
        this.f += min2;
    }

    @Override // defpackage.pab
    public final void b() {
        int i;
        if (!this.c || (i = this.e) == 0 || this.f != i) {
            return;
        }
        this.b.g(this.d, 1, i, 0, null);
        this.c = false;
    }

    @Override // defpackage.pab
    public final void c(long j, boolean z) {
        if (!z) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.pab
    public final void d() {
        this.c = false;
    }
}
