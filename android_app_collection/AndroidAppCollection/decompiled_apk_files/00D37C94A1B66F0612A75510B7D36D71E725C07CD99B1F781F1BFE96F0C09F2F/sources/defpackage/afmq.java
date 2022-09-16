package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.Map;
/* compiled from: PG */
/* renamed from: afmq */
/* loaded from: classes.dex */
public final class afmq {
    public final yve a;
    private final aynx e;
    private final aadd f;
    private final axxl h;
    private boolean k;
    private boolean l;
    private final Object i = new Object();
    public awan c = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
    public awan b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
    private final Map j = new afmo();
    public boolean d = false;
    private final aypf g = new aypf();

    public afmq(yve yveVar, aynx aynxVar, aadd aaddVar, axxl axxlVar) {
        this.a = yveVar;
        this.e = aynxVar;
        this.f = aaddVar;
        this.h = axxlVar;
    }

    public static /* synthetic */ void h() {
        afus.b(1, 6, "Failed to store last playback start time.");
    }

    public static /* synthetic */ void i() {
        afus.b(1, 6, "Failed to update manual video quality selection.");
    }

    private final void j() {
        if (!this.k || this.g.a() != 0) {
            if (this.k || this.g.a() == 0) {
                return;
            }
            synchronized (this) {
                if (this.g.a() != 0) {
                    this.g.c();
                }
            }
            return;
        }
        synchronized (this) {
            if (this.g.a() == 0) {
                this.g.d(this.a.d().I().u(new ayqf() { // from class: afmn
                    @Override // defpackage.ayqf
                    public final boolean a(Object obj) {
                        afmq afmqVar = afmq.this;
                        awuj awujVar = (awuj) obj;
                        awan b = awan.b(awujVar.m);
                        if (b == null) {
                            b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
                        }
                        if (b == afmqVar.c) {
                            awan b2 = awan.b(awujVar.n);
                            if (b2 == null) {
                                b2 = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
                            }
                            return b2 != afmqVar.b;
                        }
                        return true;
                    }
                }).Z(new afmm(this, 1)));
                this.g.d(this.e.I().u(zwb.h).Z(new afmm(this)));
            }
        }
    }

    private final void k() {
        this.k = a().c;
    }

    public final atdz a() {
        arhd a = this.f.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            atdz atdzVar = atdyVar.k;
            return atdzVar == null ? atdz.a : atdzVar;
        }
        return atdz.a;
    }

    public final awan b(String str) {
        boolean z;
        synchronized (this.i) {
            if (!this.j.containsKey(str)) {
                this.j.put(str, null);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            k();
            j();
        }
        if (!this.k) {
            return awan.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        synchronized (this.i) {
            awan awanVar = (awan) this.j.get(str);
            return awanVar != null ? awanVar : this.d ? this.b : this.c;
        }
    }

    public final void c(final int i, final int i2, final int i3, final long j, final String str) {
        yve yveVar = this.a;
        final boolean D = FormatStreamModel.D(i2);
        ylx.m(yveVar.b(new ampg() { // from class: afml
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                afmq afmqVar = afmq.this;
                String str2 = str;
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                boolean z = D;
                long j2 = j;
                aopa mo52toBuilder = ((awuj) obj).mo52toBuilder();
                if (!TextUtils.equals(str2, null)) {
                    mo52toBuilder.copyOnWrite();
                    awuj awujVar = (awuj) mo52toBuilder.instance;
                    str2.getClass();
                    awujVar.b |= 8;
                    awujVar.g = str2;
                } else {
                    mo52toBuilder.copyOnWrite();
                    awuj awujVar2 = (awuj) mo52toBuilder.instance;
                    awujVar2.b &= -9;
                    awujVar2.g = awuj.a.g;
                }
                mo52toBuilder.bh("last_manual_video_quality_selection_max", i4);
                mo52toBuilder.bi("last_manual_video_quality_selection_min", i5);
                mo52toBuilder.bg("last_manual_video_quality_selection_direction", i6);
                mo52toBuilder.bj("last_manual_video_quality_selection_timestamp", true != z ? j2 : -1L);
                if (afmqVar.e()) {
                    aopa createBuilder = awuc.a.createBuilder();
                    createBuilder.copyOnWrite();
                    awuc awucVar = (awuc) createBuilder.instance;
                    awucVar.b = 1 | awucVar.b;
                    awucVar.c = i5;
                    createBuilder.copyOnWrite();
                    awuc awucVar2 = (awuc) createBuilder.instance;
                    awucVar2.b |= 2;
                    awucVar2.d = i6;
                    createBuilder.copyOnWrite();
                    awuc awucVar3 = (awuc) createBuilder.instance;
                    awucVar3.b |= 4;
                    awucVar3.e = j2;
                    if (!z) {
                        mo52toBuilder.copyOnWrite();
                        awuj awujVar3 = (awuj) mo52toBuilder.instance;
                        awuc awucVar4 = (awuc) createBuilder.mo39build();
                        awucVar4.getClass();
                        awujVar3.u = awucVar4;
                        awujVar3.b |= 4096;
                    } else {
                        mo52toBuilder.copyOnWrite();
                        awuj awujVar4 = (awuj) mo52toBuilder.instance;
                        awuc awucVar5 = (awuc) createBuilder.mo39build();
                        awucVar5.getClass();
                        awujVar4.t = awucVar5;
                        awujVar4.b |= 2048;
                    }
                }
                return (awuj) mo52toBuilder.mo39build();
            }
        }), adkd.u);
    }

    public final void d(String str, awan awanVar) {
        if (!TextUtils.equals(str, null)) {
            synchronized (this.i) {
                this.j.put(str, awanVar);
            }
        }
    }

    public final boolean e() {
        Boolean bool;
        aqxe aqxeVar = this.h.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353084L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353084L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353084L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean f() {
        if (!this.l) {
            this.l = true;
            k();
            j();
        }
        return this.k;
    }

    public final afmp g(int i) {
        if (e()) {
            return new afmp(this.a, i);
        }
        return new afmp(this.a);
    }
}
