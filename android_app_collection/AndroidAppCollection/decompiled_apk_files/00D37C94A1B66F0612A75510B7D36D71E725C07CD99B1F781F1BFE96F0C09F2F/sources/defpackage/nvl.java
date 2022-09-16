package defpackage;
/* compiled from: PG */
/* renamed from: nvl  reason: default package */
/* loaded from: classes3.dex */
public final class nvl implements airt, ynl {
    final /* synthetic */ nvp a;

    public nvl(nvp nvpVar) {
        this.a = nvpVar;
    }

    public final void a(ahhm ahhmVar) {
        if (!ahhmVar.c().b(aijx.VIDEO_PLAYBACK_LOADED) || ahhmVar.b() == null) {
            return;
        }
        this.a.z = ahhmVar.b().A();
        this.a.A = ahhmVar.b().z();
        this.a.t.c(Boolean.valueOf(ahhmVar.b().I()));
        this.a.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.ahhw r9) {
        /*
            r8 = this;
            nvp r0 = r8.a
            aika r1 = defpackage.aika.NEW
            aika r1 = r9.c()
            int r1 = r1.ordinal()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L6f
            r4 = 8
            if (r1 == r4) goto L15
            goto L71
        L15:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r1 = r9.b()
            if (r1 == 0) goto L76
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r1 = r9.b()
            asaj r1 = r1.a
            if (r1 == 0) goto L76
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r1 = r9.b()
            asaj r1 = r1.a
            int r4 = r1.b
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r4 = r4 & r5
            if (r4 == 0) goto L76
            boolean r4 = r0.y
            if (r4 != 0) goto L76
            arzw r1 = r1.B
            if (r1 != 0) goto L3a
            arzw r1 = defpackage.arzw.a
        L3a:
            int r4 = r1.b
            r5 = 130741768(0x7caf608, float:3.0538186E-34)
            if (r4 != r5) goto L46
            java.lang.Object r1 = r1.c
            atuq r1 = (defpackage.atuq) r1
            goto L48
        L46:
            atuq r1 = defpackage.atuq.a
        L48:
            r4 = 1
            r0.y = r4
            nvo r0 = r0.h
            int r5 = r1.b
            r5 = r5 & r4
            if (r5 == 0) goto L59
            arag r5 = r1.c
            if (r5 != 0) goto L5a
            arag r5 = defpackage.arag.a
            goto L5a
        L59:
            r5 = r3
        L5a:
            android.text.Spanned r5 = defpackage.ajgl.b(r5)
            long r6 = r1.d
            r0.c = r4
            android.widget.TextView r1 = r0.a
            r1.setText(r5)
            android.widget.TextView r1 = r0.a
            java.lang.Runnable r0 = r0.b
            r1.postDelayed(r0, r6)
            goto L76
        L6f:
            r0.y = r2
        L71:
            nvo r0 = r0.h
            r0.a()
        L76:
            aika r0 = r9.c()
            aika r1 = defpackage.aika.NEW
            if (r0 != r1) goto L99
            nvp r0 = r8.a
            r0.z = r3
            r0.A = r3
            r0.f(r3)
            nvp r0 = r8.a
            nvo r0 = r0.h
            r0.b(r3)
            nvp r0 = r8.a
            azpb r0 = r0.v
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.c(r1)
        L99:
            nvp r0 = r8.a
            azpb r0 = r0.u
            aika r9 = r9.c()
            r0.c(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvl.b(ahhw):void");
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().I().G(aypa.a()).aa(new nvk(this, 1), npy.j), airwVar.G().b.aa(new nvk(this), npy.j)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhm) obj);
                return null;
            } else if (i == 1) {
                b((ahhw) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhm.class, ahhw.class};
    }
}
