package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* compiled from: PG */
/* renamed from: aeot  reason: default package */
/* loaded from: classes.dex */
public final class aeot implements aetv {
    public aflm a;
    final /* synthetic */ aeov b;
    private final aeor d;
    private final aeuo e;
    private final afez f;
    private final aeou g;

    public aeot(aeov aeovVar, aeor aeorVar, aeuo aeuoVar, afez afezVar, aeou aeouVar, aflm aflmVar) {
        this.b = aeovVar;
        this.d = aeorVar;
        this.e = aeuoVar;
        this.f = afezVar;
        this.g = aeouVar;
        this.a = aflmVar;
    }

    @Override // defpackage.aetv
    public final aflm a() {
        return this.a;
    }

    @Override // defpackage.aetv
    public final void b(int i) {
        this.f.a(i);
    }

    @Override // defpackage.aetv
    public final void c(int i) {
        int i2;
        afez afezVar = this.f;
        if (!afezVar.d.C() || i == (i2 = afezVar.c)) {
            return;
        }
        if (i2 != -1) {
            afezVar.a(i2);
        }
        afezVar.b.putExtra("android.media.extra.AUDIO_SESSION", i);
        afezVar.a.sendBroadcast(afezVar.b);
        afezVar.c = i;
    }

    @Override // defpackage.aeuo
    public final void d() {
        this.d.b();
        try {
            this.e.d();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aeui[] aeuiVarArr) {
        formatStreamModel.e();
        int length = aeuiVarArr.length;
        this.e.e(formatStreamModel, j, j2, aeuiVarArr);
    }

    @Override // defpackage.aeuo
    public final void f() {
        afkj.b(afki.MLPLAYER, "MedialibPlayerEvents[%s].%s", Integer.valueOf(aeov.e(this)), "onEnded()");
        this.d.b();
        try {
            this.e.f();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void g(afkn afknVar) {
        afknVar.i();
        afknVar.k();
        int i = amps.a;
        this.d.b();
        if (afknVar.n()) {
            this.b.h = false;
        }
        try {
            this.e.g(afknVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void h(aesr aesrVar) {
        this.d.b();
        try {
            this.e.h(aesrVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void i(String str, afip afipVar) {
        afipVar.a(0L);
        this.d.b();
        try {
            this.e.i(str, afipVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void j(afte afteVar) {
        this.g.a = afteVar;
        this.d.b();
        try {
            this.e.j(afteVar);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void k(long j, long j2) {
        this.d.b();
        try {
            this.e.k(j, j2);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void l(String str) {
        this.d.b();
        try {
            this.e.l(str);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void m() {
        this.d.b();
        try {
            this.e.m();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void n() {
        this.d.b();
        try {
            this.e.n();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void o(long j) {
        this.d.b();
        try {
            this.e.o(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void p(float f) {
        this.d.b();
        try {
            this.e.p(f);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void q() {
        this.d.b();
        try {
            this.e.q();
            this.a = aflm.a;
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void r() {
        this.d.b();
        try {
            this.e.r();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void s(long j) {
        this.d.b();
        try {
            this.e.s(j);
            this.a = aflm.a;
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void t(long j) {
        this.d.b();
        try {
            this.e.t(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void u(long j) {
        this.d.b();
        try {
            this.e.u(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void v() {
        this.d.b();
        try {
            this.e.v();
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void w(String str, String str2) {
        this.d.b();
        try {
            this.e.w(str, str2);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void x(int i) {
        this.d.b();
        try {
            this.e.x(i);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void y(long j) {
        this.d.b();
        try {
            this.e.y(j);
        } finally {
            this.d.a();
        }
    }

    @Override // defpackage.aeuo
    public final void z(awan awanVar) {
        int i = awanVar.e;
        this.d.b();
        try {
            this.e.z(awanVar);
        } finally {
            this.d.a();
        }
    }
}
