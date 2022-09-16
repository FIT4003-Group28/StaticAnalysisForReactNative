package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: aizu  reason: default package */
/* loaded from: classes.dex */
public final class aizu implements ynl {
    public final aizn a;
    final aizr b;
    public aizp c;
    public boolean d;
    public ahhl e;
    private final aijh f;
    private final yni g;
    private aizx h;
    private aizw i;

    public aizu(aizn aiznVar, aijh aijhVar, aizr aizrVar, yni yniVar) {
        this.a = aiznVar;
        this.f = aijhVar;
        this.b = aizrVar;
        this.g = yniVar;
    }

    public final void a() {
        this.g.g(this);
        this.f.c.Z(new ayqb() { // from class: aizt
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aizp aizpVar = aizu.this.c;
                orw a = ((ahfw) obj).a();
                if (aizpVar.q != a) {
                    aizpVar.q = a;
                    aizpVar.b(2048);
                }
            }
        });
    }

    public final void b(aizw aizwVar) {
        this.i = aizwVar;
        this.a.d = aizwVar;
        d();
    }

    public final void c(aizx aizxVar) {
        this.h = aizxVar;
        this.a.c = aizxVar;
        d();
    }

    public final void d() {
        ahhl ahhlVar = this.e;
        boolean z = true;
        boolean z2 = ahhlVar != null && ahhlVar.c();
        aizp aizpVar = this.c;
        aizx aizxVar = this.h;
        if (aizxVar != null) {
            z2 = aizxVar.d();
        }
        aizw aizwVar = this.i;
        if (aizwVar != null) {
            z = aizwVar.c();
        } else {
            ahhl ahhlVar2 = this.e;
            if (ahhlVar2 == null || !ahhlVar2.b()) {
                z = false;
            }
        }
        aizpVar.h(z2, z);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        WatchNextResponseModel a;
        asgl asglVar;
        asvn asvnVar;
        asgl asglVar2;
        arag aragVar;
        CharSequence b;
        arag aragVar2;
        Spanned b2;
        PlayerResponseModel b3;
        aaod a2;
        boolean z = false;
        switch (i) {
            case -1:
                return new Class[]{aesr.class, ahgh.class, ahhl.class, ahhm.class, ahhw.class, ahhx.class, ahia.class, aikd.class};
            case 0:
                FormatStreamModel f = ((aesr) obj).f();
                if (f == null) {
                    return null;
                }
                aizp aizpVar = this.c;
                int d = f.d();
                int i2 = f.i();
                aizpVar.i = d;
                aizpVar.j = i2;
                aizpVar.b(65536);
                return null;
            case 1:
                aizp aizpVar2 = this.c;
                float a3 = ((ahgh) obj).a();
                if (aizpVar2.k == a3) {
                    return null;
                }
                aizpVar2.k = a3;
                aizpVar2.b(16384);
                return null;
            case 2:
                this.e = (ahhl) obj;
                d();
                return null;
            case 3:
                ahhm ahhmVar = (ahhm) obj;
                if (ahhmVar.c() != aijx.VIDEO_WATCH_LOADED || (a = ahhmVar.a()) == null || TextUtils.isEmpty(a.b)) {
                    return null;
                }
                asgt asgtVar = a.a;
                if ((16384 & asgtVar.b) != 0) {
                    asgq asgqVar = asgtVar.p;
                    if (asgqVar == null) {
                        asgqVar = asgq.a;
                    }
                    if (asgqVar.b == 61479009) {
                        asvnVar = (asvn) asgqVar.c;
                    } else {
                        asvnVar = asvn.a;
                    }
                } else {
                    asgu asguVar = asgtVar.d;
                    if (asguVar == null) {
                        asguVar = asgu.a;
                    }
                    if (asguVar.b == 51779735) {
                        asglVar = (asgl) asguVar.c;
                    } else {
                        asglVar = asgl.a;
                    }
                    if ((asglVar.b & 8) != 0) {
                        asgu asguVar2 = asgtVar.d;
                        if (asguVar2 == null) {
                            asguVar2 = asgu.a;
                        }
                        if (asguVar2.b == 51779735) {
                            asglVar2 = (asgl) asguVar2.c;
                        } else {
                            asglVar2 = asgl.a;
                        }
                        asgi asgiVar = asglVar2.f;
                        if (asgiVar == null) {
                            asgiVar = asgi.a;
                        }
                        if (asgiVar.b == 61479009) {
                            asvnVar = (asvn) asgiVar.c;
                        } else {
                            asvnVar = asvn.a;
                        }
                    } else {
                        asvnVar = null;
                    }
                }
                if (asvnVar == null) {
                    b = null;
                } else {
                    if ((asvnVar.b & 1) != 0) {
                        aragVar = asvnVar.c;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    b = ajgl.b(aragVar);
                }
                if (asvnVar == null) {
                    b2 = null;
                } else {
                    if ((asvnVar.b & 8) != 0) {
                        aragVar2 = asvnVar.d;
                        if (aragVar2 == null) {
                            aragVar2 = arag.a;
                        }
                    } else {
                        aragVar2 = null;
                    }
                    b2 = ajgl.b(aragVar2);
                }
                if (TextUtils.isEmpty(b) && (b3 = ahhmVar.b()) != null) {
                    b = b3.A();
                    b2 = null;
                }
                this.c.m(b, b2);
                return null;
            case 4:
                ahhw ahhwVar = (ahhw) obj;
                this.d = ahhwVar.c().c(aika.PLAYBACK_LOADED);
                PlayerResponseModel b4 = ahhwVar.b();
                if (ahhwVar.c() == aika.NEW) {
                    this.c.d();
                    aizn aiznVar = this.a;
                    aiznVar.c = null;
                    aiznVar.d = null;
                    return null;
                } else if (ahhwVar.c() != aika.PLAYBACK_LOADED || b4 == null) {
                    return null;
                } else {
                    this.c.n();
                    if (aaod.a(b4.t(), 0L, null) != null) {
                        this.c.g(Duration.ofSeconds(a2.a.a()).toMillis());
                    } else {
                        this.c.g(Duration.ofSeconds(b4.a()).toMillis());
                    }
                    aizp aizpVar3 = this.c;
                    if (!ahhwVar.l() || b4.G()) {
                        z = true;
                    }
                    aizpVar3.f(z);
                    this.c.m(b4.A(), null);
                    this.c.l(b4.b());
                    this.b.b(b4.b());
                    this.c.a();
                    return null;
                }
            case 5:
                this.c.j(((ahhx) obj).e());
                return null;
            case 6:
                ahia ahiaVar = (ahia) obj;
                if (!this.d) {
                    return null;
                }
                this.c.i(ahiaVar.a());
                return null;
            case 7:
                aikd aikdVar = (aikd) obj;
                this.c.i(8);
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
