package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: kfy  reason: default package */
/* loaded from: classes3.dex */
public final class kfy implements airt, ynl {
    private CharSequence a;
    private final kgc b;

    public kfy(kgc kgcVar) {
        kgcVar.getClass();
        this.b = kgcVar;
    }

    private final void b(Spanned spanned) {
        if (TextUtils.equals(this.a, spanned)) {
            return;
        }
        this.b.e.c(spanned == null ? "" : spanned);
        this.a = spanned;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L26
            aube r1 = r5.i
            if (r1 == 0) goto L26
            aubj r2 = r1.i
            if (r2 != 0) goto Ld
            aubj r2 = defpackage.aubj.a
        Ld:
            int r2 = r2.b
            r3 = 153515154(0x9267492, float:2.0036334E-33)
            if (r2 != r3) goto L26
            aubj r1 = r1.i
            if (r1 != 0) goto L1a
            aubj r1 = defpackage.aubj.a
        L1a:
            int r2 = r1.b
            if (r2 != r3) goto L23
            java.lang.Object r1 = r1.c
            aqtb r1 = (defpackage.aqtb) r1
            goto L27
        L23:
            aqtb r1 = defpackage.aqtb.a
            goto L27
        L26:
            r1 = r0
        L27:
            if (r1 != 0) goto L65
            if (r5 == 0) goto L4e
            aube r5 = r5.i
            if (r5 == 0) goto L4e
            aubj r1 = r5.i
            if (r1 != 0) goto L35
            aubj r1 = defpackage.aubj.a
        L35:
            int r1 = r1.b
            r2 = 128392103(0x7a71ba7, float:2.514362E-34)
            if (r1 != r2) goto L4e
            aubj r5 = r5.i
            if (r5 != 0) goto L42
            aubj r5 = defpackage.aubj.a
        L42:
            int r1 = r5.b
            if (r1 != r2) goto L4b
            java.lang.Object r5 = r5.c
            aubi r5 = (defpackage.aubi) r5
            goto L4f
        L4b:
            aubi r5 = defpackage.aubi.a
            goto L4f
        L4e:
            r5 = r0
        L4f:
            if (r5 == 0) goto L61
            int r1 = r5.b
            r1 = r1 & 1
            if (r1 == 0) goto L5d
            arag r0 = r5.c
            if (r0 != 0) goto L5d
            arag r0 = defpackage.arag.a
        L5d:
            android.text.Spanned r0 = defpackage.ajgl.b(r0)
        L61:
            r4.b(r0)
            return
        L65:
            kgc r5 = r4.b
            azpm r5 = r5.e
            r5.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfy.c(com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel):void");
    }

    public final void a(ahhm ahhmVar) {
        if (ahhmVar.c().b(aijx.VIDEO_WATCH_LOADED)) {
            c(ahhmVar.a());
            return;
        }
        Spanned spanned = null;
        if (ahhmVar.c().b(aijx.VIDEO_PLAYBACK_LOADED)) {
            PlayerResponseModel b = ahhmVar.b();
            if (b != null) {
                aopc aopcVar = (aopc) arag.a.createBuilder();
                String A = b.A();
                aopcVar.copyOnWrite();
                arag aragVar = (arag) aopcVar.instance;
                A.getClass();
                aragVar.b |= 1;
                aragVar.d = A;
                spanned = ajgl.b((arag) aopcVar.mo39build());
            }
            b(spanned);
            return;
        }
        c(null);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.ao().I().G(aypa.a()).aa(new ayqb() { // from class: kfx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                kfy.this.a((ahhm) obj);
            }
        }, jww.p)};
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                a((ahhm) obj);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahhm.class};
    }
}
