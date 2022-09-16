package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: eyl  reason: default package */
/* loaded from: classes3.dex */
public final class eyl implements airt, akuk, ynl {
    public final aacz a;
    private String b;
    private String c;

    public eyl(aacz aaczVar) {
        this.a = aaczVar;
    }

    @Override // defpackage.akuk
    public final void a(String str, Bundle bundle) {
        if (str == null || !str.equals("yt_android_watch")) {
            return;
        }
        bundle.putString("CPN", this.b);
        bundle.putString("video_id", this.c);
    }

    public final void b(aikd aikdVar) {
        String str;
        if (aikdVar == null || (str = aikdVar.g) == null) {
            return;
        }
        this.b = aikdVar.b;
        this.c = str;
    }

    public final void c(ahhw ahhwVar) {
        if (ahhwVar != null) {
            this.b = ahhwVar.e();
            this.c = ahhwVar.b() != null ? ahhwVar.b().B() : null;
        }
    }

    @Override // defpackage.akuk
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().b.aa(new eyk(this, 1), dzq.k), airwVar.G().h.aa(new eyk(this), dzq.k)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                c((ahhw) obj);
                return null;
            } else if (i == 1) {
                b((aikd) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhw.class, aikd.class};
    }
}
